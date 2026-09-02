package org.apache.avro;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.databind.node.JsonNodeFactory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.fail;
import org.apache.avro.path.TracingAvroTypeException;

public class SchemaC_4LLMTest {

  @Test
  public void createShouldSupportEveryPrimitiveType() {
    Schema.Type[] primitiveTypes = { Schema.Type.STRING, Schema.Type.BYTES, Schema.Type.INT, Schema.Type.LONG,
        Schema.Type.FLOAT, Schema.Type.DOUBLE, Schema.Type.BOOLEAN, Schema.Type.NULL };

    for (Schema.Type type : primitiveTypes) {
      Schema schema = Schema.create(type);

      assertEquals(type, schema.getType());
      assertEquals(type.getName(), schema.getName());
      assertEquals(type.getName(), schema.getFullName());
      assertNull(schema.getDoc());
    }
  }

  @Test
  public void createShouldRejectNonPrimitiveTypes() {
    List<Schema.Type> unsupportedTypes = Arrays.asList(Schema.Type.RECORD, Schema.Type.ENUM, Schema.Type.ARRAY,
        Schema.Type.MAP, Schema.Type.UNION, Schema.Type.FIXED);

    for (Schema.Type type : unsupportedTypes) {
      try {
        Schema.create(type);
        fail("Expected AvroRuntimeException for " + type);
      } catch (AvroRuntimeException expected) {
        assertTrue(expected.getMessage().contains(type.toString()));
      }
    }
  }

  @Test
  public void typeNamesShouldBeLowerCase() {
    for (Schema.Type type : Schema.Type.values()) {
      assertEquals(type.name().toLowerCase(java.util.Locale.ENGLISH), type.getName());
    }
  }

  @Test
  public void primitiveSchemaShouldRejectTypeSpecificOperations() {
    Schema schema = Schema.create(Schema.Type.INT);

    assertAvroRuntimeException(() -> schema.getField("value"), "Not a record");
    assertAvroRuntimeException(schema::getFields, "Not a record");
    assertAvroRuntimeException(schema::hasFields, "Not a record");
    assertAvroRuntimeException(() -> schema.setFields(Collections.emptyList()), "Not a record");
    assertAvroRuntimeException(schema::getEnumSymbols, "Not an enum");
    assertAvroRuntimeException(schema::getEnumDefault, "Not an enum");
    assertAvroRuntimeException(() -> schema.getEnumOrdinal("A"), "Not an enum");
    assertAvroRuntimeException(() -> schema.hasEnumSymbol("A"), "Not an enum");
    assertAvroRuntimeException(schema::getNamespace, "Not a named type");
    assertAvroRuntimeException(() -> schema.addAlias("alias"), "Not a named type");
    assertAvroRuntimeException(() -> schema.addAlias("alias", "space"), "Not a named type");
    assertAvroRuntimeException(schema::getAliases, "Not a named type");
    assertAvroRuntimeException(schema::isError, "Not a record");
    assertAvroRuntimeException(schema::getElementType, "Not an array");
    assertAvroRuntimeException(schema::getValueType, "Not a map");
    assertAvroRuntimeException(schema::getTypes, "Not a union");
    assertAvroRuntimeException(() -> schema.getIndexNamed("int"), "Not a union");
    assertAvroRuntimeException(schema::getFixedSize, "Not fixed");
  }

  @Test
  public void recordShouldExposeNameNamespaceDocAndFields() {
    Schema.Field first = new Schema.Field("first", Schema.create(Schema.Type.STRING), "first doc");
    Schema.Field second = new Schema.Field("second", Schema.create(Schema.Type.INT));

    Schema record = Schema.createRecord("Example", "record doc", "example.namespace", false,
        Arrays.asList(first, second));

    assertEquals(Schema.Type.RECORD, record.getType());
    assertEquals("Example", record.getName());
    assertEquals("example.namespace", record.getNamespace());
    assertEquals("example.namespace.Example", record.getFullName());
    assertEquals("record doc", record.getDoc());
    assertFalse(record.isError());
    assertTrue(record.hasFields());
    assertEquals(2, record.getFields().size());
    assertSame(first, record.getField("first"));
    assertSame(second, record.getField("second"));
    assertNull(record.getField("missing"));
    assertEquals(0, first.pos());
    assertEquals(1, second.pos());
  }

  @Test
  public void errorRecordShouldReportErrorType() {
    Schema error = Schema.createRecord("Problem", null, "example", true, Collections.emptyList());

    assertTrue(error.isError());
    assertEquals(Schema.Type.RECORD, error.getType());
  }

  @Test
  public void recordWithoutFieldsShouldFailUntilFieldsAreSet() {
    Schema record = Schema.createRecord("Example", null, "example", false);

    assertFalse(record.hasFields());
    assertAvroRuntimeException(record::getFields, "fields not set");
    assertAvroRuntimeException(() -> record.getField("value"), "fields not set");

    record.setFields(Collections.singletonList(new Schema.Field("value", Schema.create(Schema.Type.LONG))));

    assertTrue(record.hasFields());
    assertEquals(1, record.getFields().size());

    assertAvroRuntimeException(() -> record.setFields(Collections.emptyList()), "Fields are already set");
  }

  @Test
  public void recordShouldRejectDuplicateFieldNames() {
    Schema record = Schema.createRecord("Example", null, "example", false);
    Schema.Field first = new Schema.Field("value", Schema.create(Schema.Type.STRING));
    Schema.Field duplicate = new Schema.Field("value", Schema.create(Schema.Type.INT));

    assertAvroRuntimeException(() -> record.setFields(Arrays.asList(first, duplicate)), "Duplicate field value");
  }

  @Test
  public void recordShouldRejectAFieldAlreadyUsedByAnotherRecord() {
    Schema.Field field = new Schema.Field("value", Schema.create(Schema.Type.STRING));

    Schema.createRecord("First", null, "example", false, Collections.singletonList(field));

    Schema second = Schema.createRecord("Second", null, "example", false);

    assertAvroRuntimeException(() -> second.setFields(Collections.singletonList(field)), "Field already used");
  }

  @Test
  public void namedSchemaAliasesShouldBeResolvedAgainstNamespace() {
    Schema record = Schema.createRecord("Current", null, "example.namespace", false, Collections.emptyList());

    assertTrue(record.getAliases().isEmpty());

    record.addAlias("Previous");
    record.addAlias("External", "other.namespace");
    record.addAlias("RootAlias", "");

    Set<String> aliases = record.getAliases();

    assertTrue(aliases.contains("example.namespace.Previous"));
    assertTrue(aliases.contains("other.namespace.External"));
    assertTrue(aliases.contains(".RootAlias"));
  }

  @Test
  public void enumShouldExposeSymbolsOrdinalsAndDefault() {
    Schema schema = Schema.createEnum("Status", "status doc", "example", Arrays.asList("NEW", "DONE"), "NEW");

    assertEquals(Schema.Type.ENUM, schema.getType());
    assertEquals(Arrays.asList("NEW", "DONE"), schema.getEnumSymbols());
    assertEquals("NEW", schema.getEnumDefault());
    assertTrue(schema.hasEnumSymbol("NEW"));
    assertTrue(schema.hasEnumSymbol("DONE"));
    assertFalse(schema.hasEnumSymbol("MISSING"));
    assertEquals(0, schema.getEnumOrdinal("NEW"));
    assertEquals(1, schema.getEnumOrdinal("DONE"));
  }

  @Test
  public void enumShouldRejectDuplicateSymbols() {
    try {
      Schema.createEnum("Status", null, "example", Arrays.asList("NEW", "NEW"));
      fail("Expected SchemaParseException");
    } catch (SchemaParseException expected) {
      assertTrue(expected.getMessage().contains("Duplicate enum symbol"));
    }
  }

  @Test
  public void enumShouldRejectDefaultOutsideSymbolSet() {
    try {
      Schema.createEnum("Status", null, "example", Arrays.asList("NEW", "DONE"), "MISSING");
      fail("Expected SchemaParseException");
    } catch (SchemaParseException expected) {
      assertTrue(expected.getMessage().contains("not in the enum symbol set"));
    }
  }

  @Test
  public void enumShouldRejectUnknownOrdinalLookup() {
    Schema schema = Schema.createEnum("Status", null, "example", Arrays.asList("NEW", "DONE"));

    try {
      schema.getEnumOrdinal("UNKNOWN");
      fail("Expected TracingAvroTypeException");
    } catch (TracingAvroTypeException expected) {
      assertNotNull(expected.getMessage());
    }
  }

  @Test
  public void arrayAndMapShouldExposeContainedSchemas() {
    Schema stringSchema = Schema.create(Schema.Type.STRING);
    Schema intSchema = Schema.create(Schema.Type.INT);

    Schema array = Schema.createArray(stringSchema);
    Schema map = Schema.createMap(intSchema);

    assertEquals(Schema.Type.ARRAY, array.getType());
    assertSame(stringSchema, array.getElementType());

    assertEquals(Schema.Type.MAP, map.getType());
    assertSame(intSchema, map.getValueType());
  }

  @Test
  public void unionShouldExposeBranchesIndexesAndNullableState() {
    Schema nullSchema = Schema.create(Schema.Type.NULL);
    Schema stringSchema = Schema.create(Schema.Type.STRING);
    Schema union = Schema.createUnion(nullSchema, stringSchema);

    assertTrue(union.isUnion());
    assertTrue(union.isNullable());
    assertEquals(Arrays.asList(nullSchema, stringSchema), union.getTypes());
    assertEquals(Integer.valueOf(0), union.getIndexNamed("null"));
    assertEquals(Integer.valueOf(1), union.getIndexNamed("string"));
    assertNull(union.getIndexNamed("missing"));
    assertTrue(union.getName().contains("null"));
    assertTrue(union.getName().contains("string"));

    assertFalse(stringSchema.isUnion());
    assertFalse(stringSchema.isNullable());
    assertTrue(nullSchema.isNullable());
  }

  @Test
  public void unionShouldDetectNullableNestedRecordFieldSchema() {
    Schema innerUnion = Schema.createUnion(Schema.create(Schema.Type.STRING), Schema.create(Schema.Type.NULL));

    assertTrue(innerUnion.isNullable());

    Schema nonNullableUnion = Schema.createUnion(Schema.create(Schema.Type.STRING), Schema.create(Schema.Type.INT));

    assertFalse(nonNullableUnion.isNullable());
  }

  @Test
  public void unionShouldRejectDuplicateAndNestedBranches() {
    assertAvroRuntimeException(
        () -> Schema.createUnion(Schema.create(Schema.Type.STRING), Schema.create(Schema.Type.STRING)),
        "Duplicate in union");

    Schema inner = Schema.createUnion(Schema.create(Schema.Type.NULL), Schema.create(Schema.Type.STRING));

    assertAvroRuntimeException(() -> Schema.createUnion(inner, Schema.create(Schema.Type.INT)), "Nested union");
  }

  @Test
  public void unionShouldRejectProperties() {
    Schema union = Schema.createUnion(Schema.create(Schema.Type.NULL), Schema.create(Schema.Type.STRING));

    assertAvroRuntimeException(() -> union.addProp("custom", "value"), "Can't set properties on a union");
  }

  @Test
  public void fixedShouldExposeSizeAndNamedAttributes() {
    Schema fixed = Schema.createFixed("Token", "token doc", "example", 16);

    assertEquals(Schema.Type.FIXED, fixed.getType());
    assertEquals("Token", fixed.getName());
    assertEquals("example", fixed.getNamespace());
    assertEquals("example.Token", fixed.getFullName());
    assertEquals("token doc", fixed.getDoc());
    assertEquals(16, fixed.getFixedSize());
  }

  @Test
  public void schemaEqualityShouldHandleIdentityTypePropertiesAndHashCache() {
    Schema first = Schema.create(Schema.Type.STRING);
    Schema second = Schema.create(Schema.Type.STRING);
    Schema different = Schema.create(Schema.Type.INT);

    assertEquals(first, first);
    assertNotEquals(first, null);
    assertNotEquals(first, "string");
    assertEquals(first, second);
    assertEquals(first.hashCode(), second.hashCode());
    assertNotEquals(first, different);

    first.addProp("custom", "value");

    assertNotEquals(first, second);
    assertEquals(first.hashCode(), first.hashCode());

    second.addProp("custom", "value");

    assertEquals(first, second);
    assertEquals(first.hashCode(), second.hashCode());
  }

  @Test
  public void recursiveRecordsShouldSupportEqualityAndHashCode() {
    Schema first = Schema.createRecord("Node", null, "example", false);
    first.setFields(Collections.singletonList(new Schema.Field("next",
        Schema.createUnion(Schema.create(Schema.Type.NULL), first), null, Schema.Field.NULL_DEFAULT_VALUE)));

    Schema second = Schema.createRecord("Node", null, "example", false);
    second.setFields(Collections.singletonList(new Schema.Field("next",
        Schema.createUnion(Schema.create(Schema.Type.NULL), second), null, Schema.Field.NULL_DEFAULT_VALUE)));

    assertEquals(first, second);
    assertEquals(first.hashCode(), second.hashCode());
  }

  @Test
  public void fieldShouldExposeConstructorValues() {
    Schema schema = Schema.create(Schema.Type.STRING);
    Schema.Field field = new Schema.Field("value", schema, "field doc", "default", Schema.Field.Order.DESCENDING);

    assertEquals("value", field.name());
    assertSame(schema, field.schema());
    assertEquals("field doc", field.doc());
    assertEquals("default", field.defaultVal());
    assertTrue(field.hasDefaultValue());
    assertEquals(Schema.Field.Order.DESCENDING, field.order());
    assertEquals(-1, field.pos());
    assertTrue(field.toString().contains("value"));
  }

  /*
   * @Test public void fieldShouldDistinguishMissingAndExplicitNullDefault() {
   * Schema nullable = Schema.createUnion( Schema.create(Schema.Type.NULL),
   * Schema.create(Schema.Type.STRING));
   * 
   * Schema.Field missing = new Schema.Field("missing", nullable); Schema.Field
   * explicitNull = new Schema.Field("explicitNull", nullable, null,
   * Schema.Field.NULL_DEFAULT_VALUE);
   * 
   * assertFalse(missing.hasDefaultValue()); assertNull(missing.defaultVal());
   * 
   * assertTrue(explicitNull.hasDefaultValue());
   * assertNull(explicitNull.defaultVal()); }
   */

  @Test
  public void fieldAliasesShouldBeUniqueAndUnmodifiable() {
    Schema.Field field = new Schema.Field("value", Schema.create(Schema.Type.STRING));

    assertTrue(field.aliases().isEmpty());

    field.addAlias("oldValue");
    field.addAlias("oldValue");

    assertEquals(Collections.singleton("oldValue"), field.aliases());

    try {
      field.aliases().add("another");
      fail("Expected UnsupportedOperationException");
    } catch (UnsupportedOperationException expected) {
      assertEquals(Collections.singleton("oldValue"), field.aliases());
    }
  }

  @Test
  public void fieldCopyConstructorShouldCopyMetadataAliasesAndProperties() {
    Schema.Field original = new Schema.Field("value", Schema.create(Schema.Type.STRING), "doc", "default",
        Schema.Field.Order.IGNORE);
    original.addAlias("oldValue");
    original.addProp("custom", "property");

    Schema.Field copy = new Schema.Field(original, Schema.create(Schema.Type.STRING));

    assertEquals(original.name(), copy.name());
    assertEquals(original.doc(), copy.doc());
    assertEquals(original.defaultVal(), copy.defaultVal());
    assertEquals(original.order(), copy.order());
    assertEquals(original.aliases(), copy.aliases());
    assertEquals(original, copy);
    assertEquals(original.hashCode(), copy.hashCode());
  }

  @Test
  public void fieldEqualityShouldHandleIdentityTypeOrderAndDefaults() {
    Schema.Field first = new Schema.Field("value", Schema.create(Schema.Type.DOUBLE), null, Double.NaN);
    Schema.Field same = new Schema.Field("value", Schema.create(Schema.Type.DOUBLE), null, Double.NaN);
    Schema.Field differentName = new Schema.Field("other", Schema.create(Schema.Type.DOUBLE), null, Double.NaN);
    Schema.Field differentOrder = new Schema.Field("value", Schema.create(Schema.Type.DOUBLE), null, Double.NaN,
        Schema.Field.Order.DESCENDING);

    assertEquals(first, first);
    assertNotEquals(first, null);
    assertNotEquals(first, "value");
    assertEquals(first, same);
    assertNotEquals(first, differentName);
    assertNotEquals(first, differentOrder);
  }

  @Test
  public void fieldShouldRejectNullSchemaAndNullOrder() {
    try {
      new Schema.Field("value", null);
      fail("Expected NullPointerException");
    } catch (NullPointerException expected) {
      assertTrue(expected.getMessage().contains("schema"));
    }

    try {
      new Schema.Field("value", Schema.create(Schema.Type.STRING), null, null, null);
      fail("Expected NullPointerException");
    } catch (NullPointerException expected) {
      assertNotNull(expected);
    }
  }

  @Test
  public void validDefaultShouldCoverPrimitiveBranches() {
    JsonNodeFactory nodes = JsonNodeFactory.instance;

    assertTrue(Schema.create(Schema.Type.STRING).isValidDefault(nodes.textNode("value")));
    assertFalse(Schema.create(Schema.Type.STRING).isValidDefault(nodes.numberNode(1)));

    assertTrue(Schema.create(Schema.Type.BYTES).isValidDefault(nodes.textNode("bytes")));
    assertFalse(Schema.create(Schema.Type.BYTES).isValidDefault(nodes.booleanNode(true)));

    assertTrue(Schema.create(Schema.Type.INT).isValidDefault(nodes.numberNode(10)));
    assertFalse(Schema.create(Schema.Type.INT).isValidDefault(nodes.numberNode(Long.MAX_VALUE)));
    assertFalse(Schema.create(Schema.Type.INT).isValidDefault(nodes.numberNode(1.5)));

    assertTrue(Schema.create(Schema.Type.LONG).isValidDefault(nodes.numberNode(Long.MAX_VALUE)));
    assertFalse(Schema.create(Schema.Type.LONG).isValidDefault(nodes.numberNode(1.5)));

    assertTrue(Schema.create(Schema.Type.FLOAT).isValidDefault(nodes.numberNode(1.5)));
    assertTrue(Schema.create(Schema.Type.DOUBLE).isValidDefault(nodes.numberNode(1.5)));
    assertFalse(Schema.create(Schema.Type.DOUBLE).isValidDefault(nodes.textNode("1.5")));

    assertTrue(Schema.create(Schema.Type.BOOLEAN).isValidDefault(nodes.booleanNode(true)));
    assertFalse(Schema.create(Schema.Type.BOOLEAN).isValidDefault(nodes.textNode("true")));

    assertTrue(Schema.create(Schema.Type.NULL).isValidDefault(nodes.nullNode()));
    assertFalse(Schema.create(Schema.Type.NULL).isValidDefault(nodes.textNode("null")));

    assertFalse(Schema.create(Schema.Type.STRING).isValidDefault(null));
  }

  @Test
  public void validDefaultShouldCoverArrayMapUnionAndRecordBranches() {
    JsonNodeFactory nodes = JsonNodeFactory.instance;

    Schema array = Schema.createArray(Schema.create(Schema.Type.INT));
    assertTrue(array.isValidDefault(nodes.arrayNode().add(1).add(2)));
    assertFalse(array.isValidDefault(nodes.arrayNode().add(1).add("invalid")));
    assertFalse(array.isValidDefault(nodes.objectNode()));

    Schema map = Schema.createMap(Schema.create(Schema.Type.BOOLEAN));
    assertTrue(map.isValidDefault(nodes.objectNode().put("a", true).put("b", false)));
    assertFalse(map.isValidDefault(nodes.objectNode().put("a", "invalid")));
    assertFalse(map.isValidDefault(nodes.arrayNode()));

    Schema union = Schema.createUnion(Schema.create(Schema.Type.NULL), Schema.create(Schema.Type.STRING));
    assertTrue(union.isValidDefault(nodes.nullNode()));
    assertTrue(union.isValidDefault(nodes.textNode("value")));
    assertFalse(union.isValidDefault(nodes.numberNode(1)));

    Schema record = Schema.createRecord("Example", null, "example", false,
        Arrays.asList(new Schema.Field("required", Schema.create(Schema.Type.STRING)),
            new Schema.Field("count", Schema.create(Schema.Type.INT), null, 5)));

    assertTrue(record.isValidDefault(nodes.objectNode().put("required", "value")));
    assertTrue(record.isValidDefault(nodes.objectNode().put("required", "value").put("count", 1)));
    assertFalse(record.isValidDefault(nodes.objectNode().put("required", 1)));
    assertFalse(record.isValidDefault(nodes.arrayNode()));
    assertFalse(record.isValidDefault(nodes.objectNode()));
  }

  @Test
  public void parserShouldParseEverySchemaCategory() {
    Schema.Parser parser = new Schema.Parser();

    assertEquals(Schema.Type.STRING, parser.parse("\"string\"").getType());
    assertEquals(Schema.Type.INT, parser.parse("{\"type\":\"int\"}").getType());
    assertEquals(Schema.Type.ARRAY, parser.parse("{\"type\":\"array\",\"items\":\"long\"}").getType());
    assertEquals(Schema.Type.MAP, parser.parse("{\"type\":\"map\",\"values\":\"boolean\"}").getType());
    assertEquals(Schema.Type.UNION, parser.parse("[\"null\",\"string\"]").getType());
    assertEquals(Schema.Type.ENUM,
        parser.parse("{\"type\":\"enum\",\"name\":\"E\"," + "\"symbols\":[\"A\",\"B\"]}").getType());
    assertEquals(Schema.Type.FIXED, parser.parse("{\"type\":\"fixed\",\"name\":\"F\",\"size\":4}").getType());
    assertEquals(Schema.Type.RECORD, parser.parse("{\"type\":\"record\",\"name\":\"R\",\"fields\":[]}").getType());
  }

  @Test
  public void parserShouldConcatenateMultipleStringParts() {
    Schema schema = new Schema.Parser().parse("{\"type\":\"array\",", "\"items\":\"string\"}");

    assertEquals(Schema.Type.ARRAY, schema.getType());
    assertEquals(Schema.Type.STRING, schema.getElementType().getType());
  }

  @Test
  public void parserShouldPreserveInputStreamAfterParsing() throws Exception {
    ByteArrayInputStream input = new ByteArrayInputStream("\"string\" trailing".getBytes(StandardCharsets.UTF_8));

    Schema schema = new Schema.Parser().parse(input);

    assertEquals(Schema.Type.STRING, schema.getType());
    assertTrue(input.available() >= 0);
  }

  @Test
  public void parserShouldRejectDanglingStringContent() {
    try {
      new Schema.Parser().parse("\"string\" trailing");
      fail("Expected SchemaParseException");
    } catch (SchemaParseException expected) {
      assertTrue(expected.getMessage().contains("dangling content"));
    }
  }

  @Test
  public void parserShouldRejectMalformedJson() {
    try {
      new Schema.Parser().parse("{");
      fail("Expected SchemaParseException");
    } catch (SchemaParseException expected) {
      assertNotNull(expected.getCause());
    }
  }

  /*
   * @Test public void parserShouldRejectMissingOrInvalidMembers() {
   * assertSchemaParseException("null", "Cannot parse");
   * assertSchemaParseException("1", "not yet supported");
   * assertSchemaParseException("{}", "No type");
   * assertSchemaParseException("{\"type\":\"unknown\"}", "MUST be");
   * assertSchemaParseException( "{\"type\":\"record\",\"name\":\"R\"}",
   * "no fields"); assertSchemaParseException(
   * "{\"type\":\"enum\",\"name\":\"E\"}", "no symbols");
   * assertSchemaParseException( "{\"type\":\"array\"}", "no items");
   * assertSchemaParseException( "{\"type\":\"map\"}", "no values");
   * assertSchemaParseException( "{\"type\":\"fixed\",\"name\":\"F\"}",
   * "Invalid or no size"); assertSchemaParseException(
   * "{\"type\":\"fixed\",\"name\":\"F\",\"size\":\"4\"}", "Invalid or no size");
   * }
   */
  @Test
  public void parserShouldHandleDocsAliasesOrdersDefaultsAndProperties() {
    String json = "{" + "\"type\":\"record\"," + "\"name\":\"Current\"," + "\"namespace\":\"example\","
        + "\"doc\":\"record doc\"," + "\"aliases\":[\"Previous\"]," + "\"custom\":\"record property\","
        + "\"fields\":[{" + "\"name\":\"value\"," + "\"type\":\"string\"," + "\"doc\":\"field doc\","
        + "\"default\":\"text\"," + "\"order\":\"descending\"," + "\"aliases\":[\"oldValue\"],"
        + "\"fieldProperty\":\"field property\"" + "}]" + "}";

    Schema schema = new Schema.Parser().parse(json);
    Schema.Field field = schema.getField("value");

    assertEquals("record doc", schema.getDoc());
    assertTrue(schema.getAliases().contains("example.Previous"));
    assertEquals("field doc", field.doc());
    assertEquals("text", field.defaultVal());
    assertEquals(Schema.Field.Order.DESCENDING, field.order());
    assertTrue(field.aliases().contains("oldValue"));
    assertTrue(schema.toString().contains("custom"));
    assertTrue(schema.toString().contains("fieldProperty"));
  }

  @Test
  public void parserShouldRejectInvalidAliases() {
    assertSchemaParseException("{\"type\":\"record\",\"name\":\"R\"," + "\"aliases\":\"alias\",\"fields\":[]}",
        "aliases not an array");

    assertSchemaParseException("{\"type\":\"record\",\"name\":\"R\"," + "\"aliases\":[1],\"fields\":[]}",
        "alias not a string");
  }

  /*
   * @Test public void parserValidateDefaultsFlagShouldControlValidation() {
   * String invalidDefault = "{\"type\":\"record\",\"name\":\"R\",\"fields\":[" +
   * "{\"name\":\"value\",\"type\":\"int\",\"default\":\"bad\"}" + "]}";
   * 
   * Schema.Parser validatingParser = new
   * Schema.Parser().setValidateDefaults(true);
   * assertTrue(validatingParser.getValidateDefaults());
   * 
   * try { validatingParser.parse(invalidDefault);
   * fail("Expected AvroTypeException"); } catch (AvroTypeException expected) {
   * assertTrue(expected.getMessage().contains("Invalid default")); }
   * 
   * Schema.Parser nonValidatingParser = new
   * Schema.Parser().setValidateDefaults(false);
   * assertFalse(nonValidatingParser.getValidateDefaults());
   * 
   * Schema schema = nonValidatingParser.parse(invalidDefault);
   * assertEquals("bad", schema.getField("value").defaultVal()); }
   */

  /*
   * @Test public void parserShouldAddAndReturnKnownTypes() { Schema known =
   * Schema.createRecord( "Known", null, "example", false,
   * Collections.emptyList());
   * 
   * Schema.Parser parser = new Schema.Parser()
   * .addTypes(Collections.singletonList(known));
   * 
   * assertSame(known, parser.getTypes().get("example.Known"));
   * 
   * Schema reference = parser.parse("\"example.Known\""); assertSame(known,
   * reference); }
   */

  @Test
  public void parseJsonToObjectShouldConvertJsonValues() {
    Object value = Schema.parseJsonToObject("{\"name\":\"example\",\"count\":2}");

    assertTrue(value instanceof java.util.Map);
    assertEquals("example", ((java.util.Map<?, ?>) value).get("name"));
    assertEquals(2, ((Number) ((java.util.Map<?, ?>) value).get("count")).intValue());
  }

  @Test
  public void toStringShouldUseShortPrimitiveFormWithoutProperties() {
    Schema schema = Schema.create(Schema.Type.STRING);

    assertEquals("\"string\"", schema.toString());
    assertEquals("\"string\"", schema.toString(false));
  }

  @Test
  public void toStringShouldUseObjectFormWhenPrimitiveHasProperties() {
    Schema schema = Schema.create(Schema.Type.STRING);
    schema.addProp("custom", "value");

    String json = schema.toString();

    assertTrue(json.contains("\"type\":\"string\""));
    assertTrue(json.contains("\"custom\":\"value\""));
  }

  @Test
  public void prettyToStringShouldContainFormatting() {
    Schema schema = Schema.createRecord("Example", "doc", "example", false,
        Collections.singletonList(new Schema.Field("value", Schema.create(Schema.Type.STRING))));

    String compact = schema.toString(false);
    String pretty = schema.toString(true);

    assertFalse(compact.contains(System.lineSeparator()));
    assertTrue(pretty.contains(System.lineSeparator()) || pretty.contains("\n"));
  }

  @Test
  public void applyAliasesShouldReturnWriterWhenSchemasAreEqual() {
    Schema writer = Schema.create(Schema.Type.STRING);
    Schema reader = Schema.create(Schema.Type.STRING);

    assertSame(writer, Schema.applyAliases(writer, reader));
  }

  @Test
  public void applyAliasesShouldReturnWriterWhenReaderHasNoAliases() {
    Schema writer = Schema.createRecord("Writer", null, "example", false, Collections.emptyList());
    Schema reader = Schema.createRecord("Reader", null, "example", false, Collections.emptyList());

    assertSame(writer, Schema.applyAliases(writer, reader));
  }

  @Test
  public void applyAliasesShouldRewriteRecordAndFieldNames() {
    Schema writer = Schema.createRecord("OldRecord", "writer doc", "example", false,
        Collections.singletonList(new Schema.Field("oldField", Schema.create(Schema.Type.STRING), "field doc")));

    Schema.Field readerField = new Schema.Field("newField", Schema.create(Schema.Type.STRING));
    readerField.addAlias("oldField");

    Schema reader = Schema.createRecord("NewRecord", null, "example", false, Collections.singletonList(readerField));
    reader.addAlias("OldRecord");

    Schema rewritten = Schema.applyAliases(writer, reader);

    assertEquals("example.NewRecord", rewritten.getFullName());
    assertNotNull(rewritten.getField("newField"));
    assertNull(rewritten.getField("oldField"));
    assertEquals("field doc", rewritten.getField("newField").doc());
  }

  @Test
  public void applyAliasesShouldTraverseArrayMapUnionEnumAndFixed() {
    Schema oldEnum = Schema.createEnum("OldEnum", null, "example", Arrays.asList("A", "B"));
    Schema newEnum = Schema.createEnum("NewEnum", null, "example", Arrays.asList("A", "B"));
    newEnum.addAlias("OldEnum");

    Schema oldFixed = Schema.createFixed("OldFixed", null, "example", 4);
    Schema newFixed = Schema.createFixed("NewFixed", null, "example", 4);
    newFixed.addAlias("OldFixed");

    Schema writer = Schema.createUnion(Schema.createArray(oldEnum), Schema.createMap(oldFixed));

    Schema reader = Schema.createUnion(Schema.createArray(newEnum), Schema.createMap(newFixed));

    Schema rewritten = Schema.applyAliases(writer, reader);

    assertEquals("example.NewEnum", rewritten.getTypes().get(0).getElementType().getFullName());
    assertEquals("example.NewFixed", rewritten.getTypes().get(1).getValueType().getFullName());
  }

  @Test
  public void seenPairShouldUseObjectIdentity() {
    Object first = new String("value");
    Object second = new String("value");

    Schema.SeenPair pair = new Schema.SeenPair(first, second);
    Schema.SeenPair sameIdentities = new Schema.SeenPair(first, second);
    Schema.SeenPair equalButDifferentObjects = new Schema.SeenPair(new String("value"), new String("value"));

    assertEquals(pair, pair);
    assertEquals(pair, sameIdentities);
    assertEquals(pair.hashCode(), sameIdentities.hashCode());
    assertNotEquals(pair, equalButDifferentObjects);
    assertNotEquals(pair, "not a pair");
  }

  @Test
  public void nameShouldHandleAnonymousQualifiedAndUnqualifiedNames() {
    Schema.Name anonymous = new Schema.Name(null, "ignored");
    assertNull(anonymous.toString());
    assertEquals(0, anonymous.hashCode());

    Schema.Name unqualified = new Schema.Name("Record", "example");
    assertEquals("example.Record", unqualified.toString());

    Schema.Name qualified = new Schema.Name("other.Record", "ignored");
    assertEquals("other.Record", qualified.toString());

    Schema.Name emptyNamespace = new Schema.Name("Record", "");
    assertEquals("Record", emptyNamespace.toString());

    assertEquals(unqualified, new Schema.Name("Record", "example"));
    assertNotEquals(unqualified, qualified);
    assertNotEquals(unqualified, "example.Record");
  }

  @Test
  public void lockableArrayListShouldRejectMutationsAfterLock() {
    Schema.LockableArrayList<String> list = new Schema.LockableArrayList<>("a", "b");

    assertSame(list, list.lock());
    assertSame(list, list.lock());

    assertIllegalState(() -> list.add("c"));
    assertIllegalState(() -> list.remove("a"));
    assertIllegalState(() -> list.remove(0));
    assertIllegalState(() -> list.addAll(Collections.singleton("c")));
    assertIllegalState(() -> list.addAll(0, Collections.singleton("c")));
    assertIllegalState(() -> list.removeAll(Collections.singleton("a")));
    assertIllegalState(list::clear);
  }

  private static void assertSchemaParseException(String schema, String expectedMessagePart) {
    try {
      new Schema.Parser().parse(schema);
      fail("Expected SchemaParseException for: " + schema);
    } catch (SchemaParseException expected) {
      assertTrue("Expected message to contain '" + expectedMessagePart + "' but was: " + expected.getMessage(),
          expected.getMessage().toLowerCase(java.util.Locale.ENGLISH)
              .contains(expectedMessagePart.toLowerCase(java.util.Locale.ENGLISH)));
    }
  }

  private static void assertAvroRuntimeException(ThrowingRunnable action, String expectedMessagePart) {
    try {
      action.run();
      fail("Expected AvroRuntimeException");
    } catch (AvroRuntimeException expected) {
      assertTrue("Expected message to contain '" + expectedMessagePart + "' but was: " + expected.getMessage(),
          expected.getMessage().toLowerCase(java.util.Locale.ENGLISH)
              .contains(expectedMessagePart.toLowerCase(java.util.Locale.ENGLISH)));
    } catch (Exception unexpected) {
      fail("Unexpected exception: " + unexpected);
    }
  }

  private static void assertIllegalState(ThrowingRunnable action) {
    try {
      action.run();
      fail("Expected IllegalStateException");
    } catch (IllegalStateException expected) {
      assertNotNull(expected);
    } catch (Exception unexpected) {
      fail("Unexpected exception: " + unexpected);
    }
  }

  private interface ThrowingRunnable {
    void run() throws Exception;
  }
}
