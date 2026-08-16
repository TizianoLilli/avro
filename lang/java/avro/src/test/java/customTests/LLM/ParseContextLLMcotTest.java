package customTests.LLM;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Collections;

import org.apache.avro.AvroTypeException;
import org.apache.avro.ParseContext;
import org.apache.avro.Schema;
import org.apache.avro.SchemaParseException;
import org.apache.avro.util.SchemaResolver;
import org.junit.Test;

/**
 *
 * Step 1: Equivalence classes and boundary values for ParseContext. find(String
 * name, String namespace): name is a primitive Avro type name: returns a newly
 * created primitive schema. name is a simple named schema and namespace is
 * non-null: searches namespace.name. name is a fully qualified schema name:
 * supplied namespace is ignored. schema is not found by derived full name, but
 * a default-namespace schema exists: falls back to simple name lookup. schema
 * does not exist: returns an unresolved reference for the derived full name.
 * boundary: namespace is null. boundary: name contains a dot. put(Schema
 * schema): schema is a named type: RECORD, ENUM, or FIXED. schema is not a
 * named type: throws AvroTypeException. same schema is put more than once:
 * idempotent. different schema with the same full name is put: throws
 * SchemaParseException. resolve(Schema schema): context contains uncommitted
 * schemas: throws IllegalStateException. committed known named schema: returns
 * the known committed schema. committed context does not know the named schema:
 * throws NullPointerException. anonymous schema containing an unresolved
 * reference: resolves after referenced schema is committed. Step 2: Edge cases
 * and critical scenarios covered: primitive lookup ignores namespace.
 * simple-name lookup with namespace. fully qualified lookup with another
 * namespace. fallback to default namespace. unresolved reference creation.
 * idempotent insertion. duplicate full-name conflict. resolving before commit.
 * resolving known, unknown, and anonymous schemas. Step 3: Test cases combine
 * the relevant equivalence classes while avoiding redundant primitive checks
 * and infeasible combinations such as resolving uncommitted schemas that are
 * expected to be usable.
 */

public class ParseContextLLMcotTest {

  @Test
  public void findReturnsPrimitiveSchemaWhenNameIsPrimitive() {
    ParseContext context = new ParseContext();

    Schema schema = context.find("string", "ignored.namespace");

    assertNotNull(schema);
    assertEquals(Schema.Type.STRING, schema.getType());

  }

  @Test
  public void findReturnsNamedSchemaFromNamespaceForSimpleName() {
    ParseContext context = new ParseContext();
    Schema user = Schema.createRecord("User", null, "com.example", false);
    user.setFields(Collections.<Schema.Field>emptyList());

    context.put(user);

    assertSame(user, context.find("User", "com.example"));

  }

  @Test
  public void findIgnoresNamespaceWhenNameIsFullyQualified() {
    ParseContext context = new ParseContext();
    Schema user = Schema.createRecord("User", null, "com.example", false);
    user.setFields(Collections.<Schema.Field>emptyList());

    context.put(user);

    assertSame(user, context.find("com.example.User", "other.namespace"));

  }

  @Test
  public void findFallsBackToDefaultNamespaceForSimpleName() {
    ParseContext context = new ParseContext();
    Schema defaultNamespaceSchema = Schema.createRecord("DefaultUser", null, null, false);
    defaultNamespaceSchema.setFields(Collections.<Schema.Field>emptyList());

    context.put(defaultNamespaceSchema);

    assertSame(defaultNamespaceSchema, context.find("DefaultUser", "com.example"));

  }

  @Test
  public void findReturnsUnresolvedReferenceWhenSchemaIsUnknown() {
    ParseContext context = new ParseContext();

    Schema schema = context.find("Missing", "com.example");

    assertNotNull(schema);
    assertTrue(SchemaResolver.isUnresolvedSchema(schema));
    assertEquals("com.example.Missing", SchemaResolver.getUnresolvedSchemaName(schema));

  }

  @Test
  public void putAcceptsRecordEnumAndFixedSchemas() {
    ParseContext context = new ParseContext();

    Schema record = Schema.createRecord("RecordType", null, "com.example", false);
    record.setFields(Collections.<Schema.Field>emptyList());
    Schema enumSchema = Schema.createEnum("EnumType", null, "com.example", Collections.singletonList("A"));
    Schema fixed = Schema.createFixed("FixedType", null, "com.example", 1);

    context.put(record);
    context.put(enumSchema);
    context.put(fixed);

    assertSame(record, context.find("RecordType", "com.example"));
    assertSame(enumSchema, context.find("EnumType", "com.example"));
    assertSame(fixed, context.find("FixedType", "com.example"));

  }

  @Test
  public void putRejectsNonNamedSchema() {
    ParseContext context = new ParseContext();

    try {
      context.put(Schema.create(Schema.Type.STRING));
      fail("Expected AvroTypeException");
    } catch (AvroTypeException expected) {
      assertTrue(expected.getMessage().contains("named schema"));
    }

  }

  @Test
  public void putIsIdempotentForSameSchemaInstance() {
    ParseContext context = new ParseContext();
    Schema record = Schema.createRecord("Idempotent", null, "com.example", false);
    record.setFields(Collections.<Schema.Field>emptyList());

    context.put(record);
    context.put(record);

    assertSame(record, context.find("Idempotent", "com.example"));

  }

  @Test
  public void putRejectsDifferentSchemaWithSameFullName() {
    ParseContext context = new ParseContext();
    Schema record = Schema.createRecord("Duplicate", null, "com.example", false);
    record.setFields(Collections.<Schema.Field>emptyList());
    Schema fixedWithSameFullName = Schema.createFixed("Duplicate", null, "com.example", 1);

    context.put(record);

    try {
      context.put(fixedWithSameFullName);
      fail("Expected SchemaParseException");
    } catch (SchemaParseException expected) {
      assertTrue(expected.getMessage().contains("Can't redefine: com.example.Duplicate"));
    }

  }

  @Test
  public void resolveThrowsWhenContextHasUncommittedSchemas() {
    ParseContext context = new ParseContext();
    Schema record = Schema.createRecord("Uncommitted", null, "com.example", false);
    record.setFields(Collections.<Schema.Field>emptyList());

    context.put(record);

    try {
      context.resolve(record);
      fail("Expected IllegalStateException");
    } catch (IllegalStateException expected) {
      assertTrue(expected.getMessage().contains("committed"));
    }

  }

  @Test
  public void resolveReturnsKnownNamedSchemaAfterCommit() {
    ParseContext context = new ParseContext();
    Schema record = Schema.createRecord("Known", null, "com.example", false);
    record.setFields(Collections.<Schema.Field>emptyList());

    context.put(record);
    context.commit();

    assertEquals(record, context.resolve(record));

  }

  @Test
  public void resolveThrowsForUnknownNamedSchemaAfterCommit() {
    ParseContext context = new ParseContext();
    Schema unknown = Schema.createRecord("Unknown", null, "com.example", false);
    unknown.setFields(Collections.<Schema.Field>emptyList());

    context.commit();

    try {
      context.resolve(unknown);
      fail("Expected NullPointerException");
    } catch (NullPointerException expected) {
      assertTrue(expected.getMessage().contains("Unknown schema: com.example.Unknown"));
    }

  }

  @Test
  public void resolveAnonymousSchemaWithForwardReferenceAfterCommit() {
    ParseContext context = new ParseContext();

    Schema unresolvedTarget = context.find("Target", "com.example");
    Schema arrayUsingForwardReference = Schema.createArray(unresolvedTarget);

    Schema target = Schema.createRecord("Target", null, "com.example", false);
    target.setFields(Collections.<Schema.Field>emptyList());

    context.put(target);
    context.commit();

    Schema resolvedArray = context.resolve(arrayUsingForwardReference);

    assertNotNull(resolvedArray);
    assertEquals(Schema.Type.ARRAY, resolvedArray.getType());
    assertEquals("com.example.Target", resolvedArray.getElementType().getFullName());
    assertEquals(target, resolvedArray.getElementType());
  }
}
