package org.apache.avro;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.avro.util.SchemaResolver;
import org.junit.Test;

public class ParseContextC_4LLMTest {

  @Test
  public void defaultConstructorUsesUtfNameValidator() {
    ParseContext context = new ParseContext();

    assertSame(NameValidator.UTF_VALIDATOR, context.nameValidator);
    assertFalse(context.hasNewSchemas());
    assertTrue(context.typesByName().isEmpty());
  }

  @Test
  public void constructorRejectsNullNameValidator() {
    try {
      new ParseContext(null);
      fail("Expected NullPointerException");
    } catch (NullPointerException expected) {
      // Expected.
    }
  }

  @Test
  public void containsRecognizesEveryPrimitiveName() {
    ParseContext context = new ParseContext();

    assertTrue(context.contains("string"));
    assertTrue(context.contains("bytes"));
    assertTrue(context.contains("int"));
    assertTrue(context.contains("long"));
    assertTrue(context.contains("float"));
    assertTrue(context.contains("double"));
    assertTrue(context.contains("boolean"));
    assertTrue(context.contains("null"));
  }

  @Test
  public void containsReturnsFalseForUnknownAndNullNames() {
    ParseContext context = new ParseContext();

    assertFalse(context.contains("unknown"));
    assertFalse(context.contains(null));
  }

  @Test
  public void containsFindsSchemasInOldAndNewMaps() {
    ParseContext context = new ParseContext();
    context.oldSchemas.put("old", Schema.create(Schema.Type.STRING));
    context.newSchemas.put("new", Schema.create(Schema.Type.INT));

    assertTrue(context.contains("old"));
    assertTrue(context.contains("new"));
    assertFalse(context.contains("missing"));
  }

  @Test
  public void findReturnsPrimitiveSchemasWithoutApplyingNamespace() {
    ParseContext context = new ParseContext();

    assertEquals(Schema.Type.STRING, context.find("string", "example.namespace").getType());
    assertEquals(Schema.Type.BYTES, context.find("bytes", null).getType());
    assertEquals(Schema.Type.INT, context.find("int", null).getType());
    assertEquals(Schema.Type.LONG, context.find("long", null).getType());
    assertEquals(Schema.Type.FLOAT, context.find("float", null).getType());
    assertEquals(Schema.Type.DOUBLE, context.find("double", null).getType());
    assertEquals(Schema.Type.BOOLEAN, context.find("boolean", null).getType());
    assertEquals(Schema.Type.NULL, context.find("null", null).getType());
  }

  @Test
  public void findUsesNamespaceQualifiedNameWhenAvailable() {
    ParseContext context = new ParseContext();
    Schema expected = Schema.create(Schema.Type.STRING);
    context.newSchemas.put("example.Item", expected);

    Schema actual = context.find("Item", "example");

    assertSame(expected, actual);
  }

  @Test
  public void findDoesNotPrefixAlreadyQualifiedName() {
    ParseContext context = new ParseContext();
    Schema expected = Schema.create(Schema.Type.LONG);
    context.oldSchemas.put("example.Item", expected);

    Schema actual = context.find("example.Item", "other");

    assertSame(expected, actual);
  }

  @Test
  public void findFallsBackToUnqualifiedName() {
    ParseContext context = new ParseContext();
    Schema expected = Schema.create(Schema.Type.FLOAT);
    context.oldSchemas.put("Item", expected);

    Schema actual = context.find("Item", "example");

    assertSame(expected, actual);
  }

  @Test
  public void findReturnsUnresolvedSchemaWhenNoSchemaIsKnown() {
    ParseContext context = new ParseContext();

    Schema result = context.find("Missing", "example");

    assertNotNull(result);
  }

  @Test
  public void getNamedSchemaPrefersOldSchema() {
    ParseContext context = new ParseContext();
    Schema oldSchema = Schema.create(Schema.Type.STRING);
    Schema newSchema = Schema.create(Schema.Type.INT);
    context.oldSchemas.put("value", oldSchema);
    context.newSchemas.put("value", newSchema);

    assertSame(oldSchema, context.getNamedSchema("value"));
  }

  @Test
  public void getNamedSchemaFallsBackToNewSchema() {
    ParseContext context = new ParseContext();
    Schema newSchema = Schema.create(Schema.Type.INT);
    context.newSchemas.put("value", newSchema);

    assertSame(newSchema, context.getNamedSchema("value"));
  }

  @Test
  public void getNamedSchemaReturnsNullWhenNameIsUnknown() {
    ParseContext context = new ParseContext();

    assertNull(context.getNamedSchema("missing"));
  }

  @Test
  public void putRejectsEveryNonNamedSchemaType() {
    ParseContext context = new ParseContext();

    assertPutRejected(context, Schema.Type.STRING);
    assertPutRejected(context, Schema.Type.BYTES);
    assertPutRejected(context, Schema.Type.INT);
    assertPutRejected(context, Schema.Type.LONG);
    assertPutRejected(context, Schema.Type.FLOAT);
    assertPutRejected(context, Schema.Type.DOUBLE);
    assertPutRejected(context, Schema.Type.BOOLEAN);
    assertPutRejected(context, Schema.Type.NULL);
  }

  @Test
  public void hasNewSchemasReflectsNewSchemaMap() {
    ParseContext context = new ParseContext();

    assertFalse(context.hasNewSchemas());

    context.newSchemas.put("value", Schema.create(Schema.Type.STRING));
    assertTrue(context.hasNewSchemas());

    context.newSchemas.clear();
    assertFalse(context.hasNewSchemas());
  }

  @Test
  public void typesByNameCombinesOldAndNewSchemasInInsertionOrder() {
    ParseContext context = new ParseContext();
    Schema first = Schema.create(Schema.Type.STRING);
    Schema second = Schema.create(Schema.Type.INT);
    Schema third = Schema.create(Schema.Type.LONG);

    context.oldSchemas.put("first", first);
    context.oldSchemas.put("second", second);
    context.newSchemas.put("third", third);

    Map<String, Schema> result = context.typesByName();
    Iterator<String> names = result.keySet().iterator();

    assertEquals(3, result.size());
    assertEquals("first", names.next());
    assertEquals("second", names.next());
    assertEquals("third", names.next());
    assertSame(first, result.get("first"));
    assertSame(second, result.get("second"));
    assertSame(third, result.get("third"));
  }

  @Test
  public void typesByNameLetsNewSchemaReplaceOldSchemaWithSameKey() {
    ParseContext context = new ParseContext();
    Schema oldSchema = Schema.create(Schema.Type.STRING);
    Schema newSchema = Schema.create(Schema.Type.INT);

    context.oldSchemas.put("value", oldSchema);
    context.newSchemas.put("value", newSchema);

    Map<String, Schema> result = context.typesByName();

    assertEquals(1, result.size());
    assertSame(newSchema, result.get("value"));
  }

  @Test
  public void typesByNameReturnsIndependentMap() {
    ParseContext context = new ParseContext();
    context.oldSchemas.put("value", Schema.create(Schema.Type.STRING));

    Map<String, Schema> result = context.typesByName();
    result.clear();

    assertTrue(result.isEmpty());
    assertTrue(context.contains("value"));
  }

  @Test
  public void commitMovesNewSchemasToOldSchemas() {
    ParseContext context = new ParseContext();
    Schema existing = Schema.create(Schema.Type.STRING);
    Schema added = Schema.create(Schema.Type.INT);
    context.oldSchemas.put("existing", existing);
    context.newSchemas.put("added", added);

    context.commit();

    assertFalse(context.hasNewSchemas());
    assertSame(existing, context.oldSchemas.get("existing"));
    assertSame(added, context.oldSchemas.get("added"));
    assertTrue(context.newSchemas.isEmpty());
  }

  @Test
  public void commitAllowsNewSchemaToReplaceSameKeyInOldMap() {
    ParseContext context = new ParseContext();
    Schema replacement = Schema.create(Schema.Type.LONG);
    context.oldSchemas.put("value", Schema.create(Schema.Type.STRING));
    context.newSchemas.put("value", replacement);

    context.commit();

    assertSame(replacement, context.oldSchemas.get("value"));
    assertFalse(context.hasNewSchemas());
  }

  @Test
  public void rollbackClearsOnlyNewSchemas() {
    ParseContext context = new ParseContext();
    Schema existing = Schema.create(Schema.Type.STRING);
    context.oldSchemas.put("existing", existing);
    context.newSchemas.put("temporary", Schema.create(Schema.Type.INT));

    context.rollback();

    assertFalse(context.hasNewSchemas());
    assertSame(existing, context.oldSchemas.get("existing"));
    assertFalse(context.contains("temporary"));
  }

  @Test
  public void commitWithNullMainSchemaCreatesResultAndCommits() {
    ParseContext context = new ParseContext();
    context.newSchemas.put("value", Schema.create(Schema.Type.STRING));

    SchemaParser.ParseResult result = context.commit(null);

    assertNotNull(result);
    assertNull(result.mainSchema());
    assertFalse(context.hasNewSchemas());
    assertTrue(context.oldSchemas.containsKey("value"));
  }

  @Test
  public void commitCapturesParsedSchemasBeforeClearingNewSchemas() {
    ParseContext context = new ParseContext();
    Schema first = Schema.create(Schema.Type.STRING);
    Schema second = Schema.create(Schema.Type.INT);
    context.newSchemas.put("first", first);
    context.newSchemas.put("second", second);

    SchemaParser.ParseResult result = context.commit(null);
    List<Schema> parsed = result.parsedNamedSchemas();

    assertEquals(2, parsed.size());
    assertFalse(context.hasNewSchemas());
  }

  @Test
  public void resolveAllSchemasRejectsUncommittedSchemas() {
    ParseContext context = new ParseContext();
    context.newSchemas.put("value", Schema.create(Schema.Type.STRING));

    try {
      context.resolveAllSchemas();
      fail("Expected IllegalStateException");
    } catch (IllegalStateException expected) {
      assertEquals("Schemas cannot be resolved unless the ParseContext is committed.", expected.getMessage());
    }
  }

  @Test
  public void resolveRejectsUncommittedSchemas() {
    ParseContext context = new ParseContext();
    context.newSchemas.put("value", Schema.create(Schema.Type.STRING));

    try {
      context.resolve(Schema.create(Schema.Type.INT));
      fail("Expected IllegalStateException");
    } catch (IllegalStateException expected) {
      assertEquals("Schemas cannot be resolved unless the ParseContext is committed.", expected.getMessage());
    }
  }

  @Test
  public void resolveAllSchemasReturnsIndependentListForEmptyContext() {
    ParseContext context = new ParseContext();

    List<Schema> first = context.resolveAllSchemas();
    List<Schema> second = context.resolveAllSchemas();

    assertNotNull(first);
    assertNotNull(second);
    assertTrue(first.isEmpty());
    assertTrue(second.isEmpty());
    assertFalse(first == second);
  }

  @Test
  public void resolveAllSchemasReusesInitializedResolvingVisitor() {
    ParseContext context = new ParseContext();

    context.resolveAllSchemas();
    SchemaResolver.ResolvingVisitor firstVisitor = context.resolvingVisitor;
    context.resolveAllSchemas();

    assertNotNull(firstVisitor);
    assertSame(firstVisitor, context.resolvingVisitor);
  }

  @Test
  public void resolvePrimitiveSchemaAfterCommit() {
    ParseContext context = new ParseContext();
    Schema primitive = Schema.create(Schema.Type.STRING);

    context.commit();
    Schema resolved = context.resolve(primitive);

    assertNotNull(resolved);
    assertEquals(Schema.Type.STRING, resolved.getType());
  }

  private static void assertPutRejected(ParseContext context, Schema.Type type) {
    try {
      context.put(Schema.create(type));
      fail("Expected AvroTypeException for " + type);
    } catch (AvroTypeException expected) {
      assertEquals("You can only put a named schema into the context", expected.getMessage());
    }
  }
}
