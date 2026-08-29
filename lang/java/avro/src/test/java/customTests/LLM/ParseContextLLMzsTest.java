package customTests.LLM;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.Collections;

import org.apache.avro.AvroTypeException;
import org.apache.avro.ParseContext;
import org.apache.avro.Schema;
import org.apache.avro.SchemaParseException;
import org.junit.Test;

public class ParseContextLLMzsTest {

  private static Schema emptyRecord(String name, String namespace) {
    Schema schema = Schema.createRecord(name, null, namespace, false);
    schema.setFields(Collections.<Schema.Field>emptyList());
    return schema;
  }

  private static Schema recordWithIntField(String name, String namespace) {
    Schema schema = Schema.createRecord(name, null, namespace, false);
    schema.setFields(Collections.singletonList(new Schema.Field("id", Schema.create(Schema.Type.INT), null, 0)));
    return schema;
  }

  @Test
  public void findReturnsPrimitiveSchemaBeforeLookingAtNamedSchemas() {
    ParseContext context = new ParseContext();

    Schema found = context.find("int", "some.namespace");

    assertNotNull(found);
    assertEquals(Schema.Type.INT, found.getType());

  }

  @Test
  public void findUsesNamespaceForSimpleNamesAndFindsUncommittedSchema() {
    ParseContext context = new ParseContext();
    Schema expected = emptyRecord("Person", "example.avro");

    context.put(expected);
    Schema found = context.find("Person", "example.avro");

    assertSame(expected, found);

  }

  @Test
  public void findDoesNotApplyNamespaceToFullNames() {
    ParseContext context = new ParseContext();
    Schema expected = emptyRecord("Address", "example.avro");

    context.put(expected);
    Schema found = context.find("example.avro.Address", "ignored.namespace");

    assertSame(expected, found);

  }

  @Test
  public void findFallsBackToDefaultNamespaceForSimpleNames() {
    ParseContext context = new ParseContext();
    Schema expected = emptyRecord("DefaultRecord", null);

    context.put(expected);
    Schema found = context.find("DefaultRecord", "missing.namespace");

    assertSame(expected, found);

  }

  /*
   * @Test public void findReturnsUnresolvedReferenceWhenSchemaIsUnknown() {
   * ParseContext context = new ParseContext();
   * 
   * Schema found = context.find("Missing", "example.avro");
   * 
   * assertNotNull(found); assertEquals("example.avro.Missing",
   * found.getFullName());
   * 
   * 
   * }
   */

  @Test
  public void putRejectsPrimitiveSchemas() {
    ParseContext context = new ParseContext();

    try {
      context.put(Schema.create(Schema.Type.LONG));
      fail("Expected AvroTypeException");
    } catch (AvroTypeException expected) {
      assertTrue(expected.getMessage().contains("named schema"));
    }

  }

  @Test
  public void putIsIdempotentForSameUncommittedSchema() {
    ParseContext context = new ParseContext();
    Schema schema = emptyRecord("Idempotent", "example.avro");

    context.put(schema);
    context.put(schema);

    assertSame(schema, context.find("Idempotent", "example.avro"));
    assertEquals(1, context.typesByName().size());

  }

  @Test
  public void putRejectsDifferentUncommittedSchemaWithSameFullName() {
    ParseContext context = new ParseContext();
    Schema first = emptyRecord("Duplicate", "example.avro");
    Schema second = recordWithIntField("Duplicate", "example.avro");

    context.put(first);

    try {
      context.put(second);
      fail("Expected SchemaParseException");
    } catch (SchemaParseException expected) {
      assertTrue(expected.getMessage().contains("Can't redefine: example.avro.Duplicate"));
    }

  }

  @Test
  public void putRejectsDifferentCommittedSchemaWithSameFullName() {
    ParseContext context = new ParseContext();
    Schema first = emptyRecord("CommittedDuplicate", "example.avro");
    Schema second = recordWithIntField("CommittedDuplicate", "example.avro");

    context.put(first);
    context.commit();

    try {
      context.put(second);
      fail("Expected SchemaParseException");
    } catch (SchemaParseException expected) {
      assertTrue(expected.getMessage().contains("Can't redefine: example.avro.CommittedDuplicate"));
    }

  }

  @Test
  public void putAllowsSameSchemaWhenAlreadyCommitted() {
    ParseContext context = new ParseContext();
    Schema schema = emptyRecord("CommittedSame", "example.avro");

    context.put(schema);
    context.commit();
    context.put(schema);

    assertSame(schema, context.find("CommittedSame", "example.avro"));
    assertFalse(context.hasNewSchemas());

  }

  @Test
  public void resolveRequiresContextToBeCommitted() {
    ParseContext context = new ParseContext();
    Schema schema = emptyRecord("Uncommitted", "example.avro");

    context.put(schema);

    try {
      context.resolve(schema);
      fail("Expected IllegalStateException");
    } catch (IllegalStateException expected) {
      assertTrue(expected.getMessage().contains("committed"));
    }

  }

  /*
   * @Test public void resolveReturnsCommittedNamedSchema() { ParseContext context
   * = new ParseContext(); Schema schema = emptyRecord("Resolvable",
   * "example.avro");
   * 
   * context.put(schema); context.commit();
   * 
   * Schema resolved = context.resolve(schema);
   * 
   * assertSame(schema, resolved);
   * 
   * }
   */

  @Test
  public void resolveResolvesForwardReferenceCreatedByFind() {
    ParseContext context = new ParseContext();

    Schema childReference = context.find("Child", "example.avro");
    Schema parent = Schema.createRecord("Parent", null, "example.avro", false);
    parent.setFields(Collections.singletonList(new Schema.Field("child", childReference, null, (Object) null)));

    Schema child = emptyRecord("Child", "example.avro");

    context.put(parent);
    context.put(child);
    context.commit();

    Schema resolvedParent = context.resolve(parent);

    assertEquals("example.avro.Parent", resolvedParent.getFullName());
    assertEquals("example.avro.Child", resolvedParent.getField("child").schema().getFullName());

  }

  @Test
  public void resolveCanResolveAnonymousUnionSchema() {
    ParseContext context = new ParseContext();
    Schema known = emptyRecord("Known", "example.avro");

    context.put(known);
    context.commit();

    Schema reference = context.find("Known", "example.avro");
    Schema union = Schema.createUnion(Arrays.asList(Schema.create(Schema.Type.NULL), reference));

    Schema resolvedUnion = context.resolve(union);

    assertEquals(Schema.Type.UNION, resolvedUnion.getType());
    assertEquals(Schema.Type.NULL, resolvedUnion.getTypes().get(0).getType());
    assertEquals("example.avro.Known", resolvedUnion.getTypes().get(1).getFullName());

  }

  @Test
  public void resolveRejectsUnknownNamedSchemaAfterCommit() {
    ParseContext context = new ParseContext();
    Schema unknown = emptyRecord("Unknown", "example.avro");

    context.commit();

    try {
      context.resolve(unknown);
      fail("Expected NullPointerException");
    } catch (NullPointerException expected) {
      assertTrue(expected.getMessage().contains("Unknown schema: example.avro.Unknown"));
    }

  }
}
