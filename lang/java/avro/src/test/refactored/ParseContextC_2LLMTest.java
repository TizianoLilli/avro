package org.apache.avro;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.List;
import java.util.Map;

import org.junit.Test;

public class ParseContextC_2LLMTest {

  @Test
  public void defaultConstructorCreatesUsableContext() {
    ParseContext context = new ParseContext();

    assertFalse(context.hasNewSchemas());
    assertTrue(context.contains("string"));
    assertFalse(context.contains("missing"));
  }

  @Test(expected = NullPointerException.class)
  public void constructorRejectsNullNameValidator() {
    new ParseContext(null);
  }

  @Test
  public void containsRecognizesEveryPrimitiveName() {
    ParseContext context = new ParseContext(NameValidator.UTF_VALIDATOR);

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
  public void containsRecognizesSchemasInOldAndNewCollections() {
    ParseContext context = new ParseContext();
    context.oldSchemas.put("old.Name", Schema.create(Schema.Type.STRING));
    context.newSchemas.put("new.Name", Schema.create(Schema.Type.INT));

    assertTrue(context.contains("old.Name"));
    assertTrue(context.contains("new.Name"));
    assertFalse(context.contains("unknown.Name"));
  }

  @Test
  public void findCreatesPrimitiveSchemasForPrimitiveNames() {
    ParseContext context = new ParseContext();

    assertEquals(Schema.Type.STRING, context.find("string", "ignored").getType());
    assertEquals(Schema.Type.BYTES, context.find("bytes", null).getType());
    assertEquals(Schema.Type.INT, context.find("int", null).getType());
    assertEquals(Schema.Type.LONG, context.find("long", null).getType());
    assertEquals(Schema.Type.FLOAT, context.find("float", null).getType());
    assertEquals(Schema.Type.DOUBLE, context.find("double", null).getType());
    assertEquals(Schema.Type.BOOLEAN, context.find("boolean", null).getType());
    assertEquals(Schema.Type.NULL, context.find("null", null).getType());
  }

  @Test
  public void findUsesNamespaceForUnqualifiedName() {
    ParseContext context = new ParseContext();
    Schema expected = Schema.create(Schema.Type.STRING);
    context.oldSchemas.put("example.Widget", expected);

    Schema actual = context.find("Widget", "example");

    assertSame(expected, actual);
  }

  @Test
  public void findDoesNotPrefixAlreadyQualifiedName() {
    ParseContext context = new ParseContext();
    Schema expected = Schema.create(Schema.Type.INT);
    context.oldSchemas.put("other.Widget", expected);

    Schema actual = context.find("other.Widget", "ignored");

    assertSame(expected, actual);
  }

  @Test
  public void findFallsBackToOriginalNameWhenNamespacedNameIsAbsent() {
    ParseContext context = new ParseContext();
    Schema expected = Schema.create(Schema.Type.LONG);
    context.newSchemas.put("Widget", expected);

    Schema actual = context.find("Widget", "example");

    assertSame(expected, actual);
  }

  @Test
  public void findUsesOriginalNameWhenNamespaceIsNull() {
    ParseContext context = new ParseContext();
    Schema expected = Schema.create(Schema.Type.FLOAT);
    context.oldSchemas.put("Widget", expected);

    Schema actual = context.find("Widget", null);

    assertSame(expected, actual);
  }

  @Test
  public void findReturnsUnresolvedSchemaWhenNameIsUnknown() {
    ParseContext context = new ParseContext();

    Schema result = context.find("Missing", "example");

    assertNotNull(result);
    assertFalse(context.contains("example.Missing"));
    assertFalse(context.contains("Missing"));
  }

  @Test
  public void getNamedSchemaPrefersOldSchema() {
    ParseContext context = new ParseContext();
    Schema oldSchema = Schema.create(Schema.Type.STRING);
    Schema newSchema = Schema.create(Schema.Type.INT);
    context.oldSchemas.put("shared.Name", oldSchema);
    context.newSchemas.put("shared.Name", newSchema);

    assertSame(oldSchema, context.getNamedSchema("shared.Name"));
  }

  @Test
  public void getNamedSchemaFallsBackToNewSchema() {
    ParseContext context = new ParseContext();
    Schema expected = Schema.create(Schema.Type.BOOLEAN);
    context.newSchemas.put("new.Name", expected);

    assertSame(expected, context.getNamedSchema("new.Name"));
  }

  @Test
  public void getNamedSchemaReturnsNullForUnknownName() {
    ParseContext context = new ParseContext();

    assertEquals(null, context.getNamedSchema("missing.Name"));
  }

  @Test
  public void typesByNameCombinesSchemasAndLetsNewEntriesOverrideOldEntries() {
    ParseContext context = new ParseContext();
    Schema oldOnly = Schema.create(Schema.Type.STRING);
    Schema oldShared = Schema.create(Schema.Type.INT);
    Schema newShared = Schema.create(Schema.Type.LONG);
    Schema newOnly = Schema.create(Schema.Type.BOOLEAN);

    context.oldSchemas.put("old.Name", oldOnly);
    context.oldSchemas.put("shared.Name", oldShared);
    context.newSchemas.put("shared.Name", newShared);
    context.newSchemas.put("new.Name", newOnly);

    Map<String, Schema> result = context.typesByName();

    assertEquals(3, result.size());
    assertSame(oldOnly, result.get("old.Name"));
    assertSame(newShared, result.get("shared.Name"));
    assertSame(newOnly, result.get("new.Name"));
  }

  @Test
  public void typesByNameReturnsIndependentMap() {
    ParseContext context = new ParseContext();
    context.oldSchemas.put("old.Name", Schema.create(Schema.Type.STRING));

    Map<String, Schema> result = context.typesByName();
    result.clear();

    assertTrue(context.contains("old.Name"));
    assertEquals(1, context.typesByName().size());
  }

  @Test
  public void putRejectsSchemaThatIsNotNamed() {
    ParseContext context = new ParseContext();

    try {
      context.put(Schema.create(Schema.Type.STRING));
      fail("Expected AvroTypeException");
    } catch (AvroTypeException expected) {
      assertEquals("You can only put a named schema into the context", expected.getMessage());
    }
  }

  @Test
  public void hasNewSchemasReflectsNewSchemaCollection() {
    ParseContext context = new ParseContext();

    assertFalse(context.hasNewSchemas());

    context.newSchemas.put("new.Name", Schema.create(Schema.Type.STRING));

    assertTrue(context.hasNewSchemas());
  }

  @Test
  public void commitMovesNewSchemasIntoOldSchemas() {
    ParseContext context = new ParseContext();
    Schema schema = Schema.create(Schema.Type.STRING);
    context.newSchemas.put("new.Name", schema);

    context.commit();

    assertFalse(context.hasNewSchemas());
    assertSame(schema, context.oldSchemas.get("new.Name"));
    assertTrue(context.contains("new.Name"));
  }

  @Test
  public void commitOverwritesExistingOldEntryWithNewEntry() {
    ParseContext context = new ParseContext();
    Schema oldSchema = Schema.create(Schema.Type.STRING);
    Schema newSchema = Schema.create(Schema.Type.INT);
    context.oldSchemas.put("shared.Name", oldSchema);
    context.newSchemas.put("shared.Name", newSchema);

    context.commit();

    assertSame(newSchema, context.oldSchemas.get("shared.Name"));
    assertFalse(context.hasNewSchemas());
  }

  @Test
  public void rollbackDiscardsNewSchemasWithoutChangingOldSchemas() {
    ParseContext context = new ParseContext();
    Schema oldSchema = Schema.create(Schema.Type.LONG);
    context.oldSchemas.put("old.Name", oldSchema);
    context.newSchemas.put("new.Name", Schema.create(Schema.Type.FLOAT));

    context.rollback();

    assertFalse(context.hasNewSchemas());
    assertSame(oldSchema, context.oldSchemas.get("old.Name"));
    assertFalse(context.contains("new.Name"));
  }

  @Test
  public void commitWithNullMainSchemaReturnsResultWithNullMainSchema() {
    ParseContext context = new ParseContext();
    context.newSchemas.put("parsed.Name", Schema.create(Schema.Type.STRING));

    SchemaParser.ParseResult result = context.commit(null);

    assertFalse(context.hasNewSchemas());
    assertEquals(null, result.mainSchema());
  }

  @Test
  public void commitResultRetainsSnapshotOfParsedSchemas() {
    ParseContext context = new ParseContext();
    Schema parsedSchema = Schema.create(Schema.Type.STRING);
    context.newSchemas.put("parsed.Name", parsedSchema);

    SchemaParser.ParseResult result = context.commit(null);
    context.oldSchemas.clear();

    List<Schema> parsedSchemas = result.parsedNamedSchemas();

    assertEquals(1, parsedSchemas.size());
    assertEquals(Schema.Type.STRING, parsedSchemas.get(0).getType());
  }

  @Test
  public void commitResultResolvesNonNullMainSchema() {
    ParseContext context = new ParseContext();
    Schema mainSchema = Schema.create(Schema.Type.INT);

    SchemaParser.ParseResult result = context.commit(mainSchema);
    Schema resolved = result.mainSchema();

    assertNotNull(resolved);
    assertEquals(Schema.Type.INT, resolved.getType());
  }

  @Test
  public void resolveAllSchemasRejectsUncommittedSchemas() {
    ParseContext context = new ParseContext();
    context.newSchemas.put("new.Name", Schema.create(Schema.Type.STRING));

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
    context.newSchemas.put("new.Name", Schema.create(Schema.Type.STRING));

    try {
      context.resolve(Schema.create(Schema.Type.INT));
      fail("Expected IllegalStateException");
    } catch (IllegalStateException expected) {
      assertEquals("Schemas cannot be resolved unless the ParseContext is committed.", expected.getMessage());
    }
  }

  @Test
  public void resolveAllSchemasHandlesEmptyCommittedContextAndReusesResolution() {
    ParseContext context = new ParseContext();

    List<Schema> firstResult = context.resolveAllSchemas();
    List<Schema> secondResult = context.resolveAllSchemas();

    assertTrue(firstResult.isEmpty());
    assertTrue(secondResult.isEmpty());
  }

  @Test
  public void resolveHandlesUnnamedPrimitiveSchema() {
    ParseContext context = new ParseContext();
    Schema input = Schema.create(Schema.Type.DOUBLE);

    Schema result = context.resolve(input);

    assertNotNull(result);
    assertEquals(Schema.Type.DOUBLE, result.getType());
  }

  @Test
  public void resolveCanBeCalledMoreThanOnceAfterVisitorInitialization() {
    ParseContext context = new ParseContext();

    Schema first = context.resolve(Schema.create(Schema.Type.INT));
    Schema second = context.resolve(Schema.create(Schema.Type.BOOLEAN));

    assertEquals(Schema.Type.INT, first.getType());
    assertEquals(Schema.Type.BOOLEAN, second.getType());
  }
}
