package org.apache.avro;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.List;
import java.util.Map;

import org.junit.Test;

/**
 * JUnit 4 tests for {@link ParseContext}.
 *
 * These tests exercise the behavior exposed by the supplied source without
 * assuming additional constructors or schema-creation APIs.
 */
public class ParseContextC_3LLMTest {

  @Test
  public void defaultConstructorCreatesEmptyContext() {
    ParseContext context = new ParseContext();

    assertFalse(context.hasNewSchemas());
    assertTrue(context.typesByName().isEmpty());
  }

  @Test
  public void constructorAcceptsExplicitValidator() {
    ParseContext context = new ParseContext(NameValidator.UTF_VALIDATOR);

    assertSame(NameValidator.UTF_VALIDATOR, context.nameValidator);
    assertFalse(context.hasNewSchemas());
  }

  @Test
  public void constructorRejectsNullValidator() {
    try {
      new ParseContext(null);
      fail("Expected NullPointerException");
    } catch (NullPointerException expected) {
      // Expected because the constructor uses requireNonNull.
    }
  }

  @Test
  public void containsRecognizesEverySupportedPrimitiveName() {
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

    assertFalse(context.contains("record"));
    assertFalse(context.contains("unknown.Type"));
    assertFalse(context.contains(""));
    assertFalse(context.contains(null));
  }

  @Test
  public void findReturnsSchemaForEverySupportedPrimitive() {
    ParseContext context = new ParseContext();

    assertEquals(Schema.Type.STRING, context.find("string", null).getType());
    assertEquals(Schema.Type.BYTES, context.find("bytes", null).getType());
    assertEquals(Schema.Type.INT, context.find("int", null).getType());
    assertEquals(Schema.Type.LONG, context.find("long", null).getType());
    assertEquals(Schema.Type.FLOAT, context.find("float", null).getType());
    assertEquals(Schema.Type.DOUBLE, context.find("double", null).getType());
    assertEquals(Schema.Type.BOOLEAN, context.find("boolean", null).getType());
    assertEquals(Schema.Type.NULL, context.find("null", null).getType());
  }

  @Test
  public void primitiveLookupIgnoresNamespace() {
    ParseContext context = new ParseContext();

    Schema schema = context.find("string", "example.namespace");

    assertNotNull(schema);
    assertEquals(Schema.Type.STRING, schema.getType());
  }

  @Test
  public void findCreatesUnresolvedSchemaForUnknownUnqualifiedNameWithoutNamespace() {
    ParseContext context = new ParseContext();

    Schema schema = context.find("MissingSchema", null);

    assertNotNull(schema);
  }

  @Test
  public void findCreatesUnresolvedSchemaForUnknownUnqualifiedNameWithNamespace() {
    ParseContext context = new ParseContext();

    Schema schema = context.find("MissingSchema", "example.namespace");

    assertNotNull(schema);
  }

  @Test
  public void findCreatesUnresolvedSchemaForAlreadyQualifiedUnknownName() {
    ParseContext context = new ParseContext();

    Schema schema = context.find("other.namespace.MissingSchema", "ignored.namespace");

    assertNotNull(schema);
  }

  @Test
  public void getNamedSchemaReturnsNullWhenContextIsEmpty() {
    ParseContext context = new ParseContext();

    assertNull(context.getNamedSchema("example.MissingSchema"));
  }

  @Test
  public void commitOnEmptyContextLeavesContextEmpty() {
    ParseContext context = new ParseContext();

    context.commit();

    assertFalse(context.hasNewSchemas());
    assertTrue(context.typesByName().isEmpty());
  }

  @Test
  public void rollbackOnEmptyContextLeavesContextEmpty() {
    ParseContext context = new ParseContext();

    context.rollback();

    assertFalse(context.hasNewSchemas());
    assertTrue(context.typesByName().isEmpty());
  }

  @Test
  public void resolveAllSchemasReturnsEmptyListForEmptyCommittedContext() {
    ParseContext context = new ParseContext();

    List<Schema> schemas = context.resolveAllSchemas();

    assertNotNull(schemas);
    assertTrue(schemas.isEmpty());
  }

  @Test
  public void resolveAllSchemasCanBeCalledMoreThanOnce() {
    ParseContext context = new ParseContext();

    List<Schema> firstResult = context.resolveAllSchemas();
    List<Schema> secondResult = context.resolveAllSchemas();

    assertTrue(firstResult.isEmpty());
    assertTrue(secondResult.isEmpty());
    assertTrue(firstResult != secondResult);
  }

  @Test
  public void resolveHandlesPrimitiveSchema() {
    ParseContext context = new ParseContext();
    Schema primitive = Schema.create(Schema.Type.INT);

    Schema resolved = context.resolve(primitive);

    assertNotNull(resolved);
    assertEquals(Schema.Type.INT, resolved.getType());
  }

  @Test
  public void resolveCanReuseExistingResolvingVisitor() {
    ParseContext context = new ParseContext();

    Schema first = context.resolve(Schema.create(Schema.Type.STRING));
    Schema second = context.resolve(Schema.create(Schema.Type.LONG));

    assertEquals(Schema.Type.STRING, first.getType());
    assertEquals(Schema.Type.LONG, second.getType());
  }

  @Test
  public void commitWithNullMainSchemaReturnsResultWithNullMainSchema() {
    ParseContext context = new ParseContext();

    SchemaParser.ParseResult result = context.commit(null);

    assertNotNull(result);
    assertNull(result.mainSchema());
    assertNotNull(result.parsedNamedSchemas());
    assertTrue(result.parsedNamedSchemas().isEmpty());
    assertFalse(context.hasNewSchemas());
  }

  @Test
  public void commitWithPrimitiveMainSchemaReturnsResolvedMainSchema() {
    ParseContext context = new ParseContext();
    Schema mainSchema = Schema.create(Schema.Type.BOOLEAN);

    SchemaParser.ParseResult result = context.commit(mainSchema);
    Schema resolvedMainSchema = result.mainSchema();

    assertNotNull(resolvedMainSchema);
    assertEquals(Schema.Type.BOOLEAN, resolvedMainSchema.getType());
    assertTrue(result.parsedNamedSchemas().isEmpty());
    assertFalse(context.hasNewSchemas());
  }

  @Test
  public void parseResultMainSchemaCanBeRequestedMoreThanOnce() {
    ParseContext context = new ParseContext();
    SchemaParser.ParseResult result = context.commit(Schema.create(Schema.Type.DOUBLE));

    Schema first = result.mainSchema();
    Schema second = result.mainSchema();

    assertEquals(Schema.Type.DOUBLE, first.getType());
    assertEquals(Schema.Type.DOUBLE, second.getType());
  }

  @Test
  public void parseResultReturnsNewEmptyParsedSchemaListOnEachCall() {
    ParseContext context = new ParseContext();
    SchemaParser.ParseResult result = context.commit(null);

    List<Schema> first = result.parsedNamedSchemas();
    List<Schema> second = result.parsedNamedSchemas();

    assertTrue(first.isEmpty());
    assertTrue(second.isEmpty());
    assertTrue(first != second);
  }

  @Test
  public void typesByNameReturnsIndependentMap() {
    ParseContext context = new ParseContext();

    Map<String, Schema> first = context.typesByName();
    first.put("externalMutation", Schema.create(Schema.Type.STRING));

    Map<String, Schema> second = context.typesByName();

    assertTrue(second.isEmpty());
    assertFalse(context.contains("externalMutation"));
  }

  @Test
  public void unresolvedLookupDoesNotAddSchemaToContext() {
    ParseContext context = new ParseContext();

    Schema unresolved = context.find("MissingSchema", "example.namespace");

    assertNotNull(unresolved);
    assertFalse(context.hasNewSchemas());
    assertFalse(context.contains("MissingSchema"));
    assertFalse(context.contains("example.namespace.MissingSchema"));
    assertTrue(context.typesByName().isEmpty());
  }
}
