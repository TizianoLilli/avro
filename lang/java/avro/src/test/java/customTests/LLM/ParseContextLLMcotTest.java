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
import org.junit.Test;

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

  /*
   * @Test public void findReturnsUnresolvedReferenceWhenSchemaIsUnknown() {
   * ParseContext context = new ParseContext();
   * 
   * Schema schema = context.find("Missing", "com.example");
   * 
   * assertNotNull(schema); assertEquals("com.example.Missing",
   * schema.getFullName());
   * 
   * 
   * }
   */

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

  /*
   * @Test public void resolveReturnsKnownNamedSchemaAfterCommit() { ParseContext
   * context = new ParseContext(); Schema record = Schema.createRecord("Known",
   * null, "com.example", false);
   * record.setFields(Collections.<Schema.Field>emptyList());
   * 
   * context.put(record); context.commit();
   * 
   * assertSame(record, context.resolve(record));
   * 
   * }
   */

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

  /*
   * @Test public void resolveAnonymousSchemaWithForwardReferenceAfterCommit() {
   * ParseContext context = new ParseContext();
   * 
   * Schema unresolvedTarget = context.find("Target", "com.example");
   * 
   * Schema holder = Schema.createRecord("Holder", null, null, false);
   * holder.setFields(Collections.singletonList( new Schema.Field("target",
   * unresolvedTarget, null, (Object) null)));
   * 
   * Schema target = Schema.createRecord("Target", null, "com.example", false);
   * target.setFields(Collections.<Schema.Field>emptyList());
   * 
   * context.put(target); context.commit();
   * 
   * Schema resolvedHolder = context.resolve(holder);
   * 
   * assertNotNull(resolvedHolder); assertEquals(Schema.Type.RECORD,
   * resolvedHolder.getType()); assertEquals("Holder",
   * resolvedHolder.getFullName()); assertEquals("com.example.Target",
   * resolvedHolder.getField("target").schema().getFullName());
   * 
   * 
   * }
   */
}
