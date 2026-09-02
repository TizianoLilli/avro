package org.apache.avro;

import org.apache.avro.path.TracingAvroTypeException;
import org.junit.After;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.fail;
import com.fasterxml.jackson.databind.JsonNode;

public class SchemaC_2LLMTest {

  @After
  public void restoreThreadLocalValidationDefaults() {
    Schema.setValidateDefaults(true);
  }

  @Test
  public void typeNamesAreLowerCase() {
    for (Schema.Type type : Schema.Type.values()) {
      assertEquals(type.name().toLowerCase(java.util.Locale.ENGLISH), type.getName());
    }
  }

  @Test
  public void createSupportsEveryPrimitiveType() {
    Schema.Type[] primitives = { Schema.Type.STRING, Schema.Type.BYTES, Schema.Type.INT, Schema.Type.LONG,
        Schema.Type.FLOAT, Schema.Type.DOUBLE, Schema.Type.BOOLEAN, Schema.Type.NULL };
    for (Schema.Type type : primitives) {
      Schema schema = Schema.create(type);
      assertEquals(type, schema.getType());
      assertEquals(type.getName(), schema.getName());
      assertEquals(type.getName(), schema.getFullName());
      assertNull(schema.getDoc());
    }
  }

  @Test
  public void createRejectsEveryNonPrimitiveType() {
    Schema.Type[] nonPrimitives = { Schema.Type.RECORD, Schema.Type.ENUM, Schema.Type.ARRAY, Schema.Type.MAP,
        Schema.Type.UNION, Schema.Type.FIXED };
    for (Schema.Type type : nonPrimitives) {
      try {
        Schema.create(type);
        fail("Expected AvroRuntimeException for " + type);
      } catch (AvroRuntimeException expected) {
        assertTrue(expected.getMessage().contains(type.toString()));
      }
    }
  }

  @Test
  public void primitiveOnlyOperationsRejectWrongSchemaKind() {
    Schema schema = Schema.create(Schema.Type.STRING);
    assertThrowsAvroRuntime(() -> schema.getField("x"));
    assertThrowsAvroRuntime(schema::getFields);
    assertThrowsAvroRuntime(schema::hasFields);
    assertThrowsAvroRuntime(() -> schema.setFields(Collections.<Schema.Field>emptyList()));
    assertThrowsAvroRuntime(schema::getEnumSymbols);
    assertThrowsAvroRuntime(schema::getEnumDefault);
    assertThrowsAvroRuntime(() -> schema.getEnumOrdinal("x"));
    assertThrowsAvroRuntime(() -> schema.hasEnumSymbol("x"));
    assertThrowsAvroRuntime(schema::getNamespace);
    assertThrowsAvroRuntime(() -> schema.addAlias("a"));
    assertThrowsAvroRuntime(() -> schema.addAlias("a", "n"));
    assertThrowsAvroRuntime(schema::getAliases);
    assertThrowsAvroRuntime(schema::isError);
    assertThrowsAvroRuntime(schema::getElementType);
    assertThrowsAvroRuntime(schema::getValueType);
    assertThrowsAvroRuntime(schema::getTypes);
    assertThrowsAvroRuntime(() -> schema.getIndexNamed("x"));
    assertThrowsAvroRuntime(schema::getFixedSize);
  }

  @Test
  public void recordStartsUnsetAndCanBeSetExactlyOnce() {
    Schema record = Schema.createRecord("R", "doc", "example", true);
    assertFalse(record.hasFields());
    assertThrowsAvroRuntime(record::getFields);
    assertThrowsAvroRuntime(() -> record.getField("id"));

    Schema.Field id = new Schema.Field("id", Schema.create(Schema.Type.LONG), "identifier");
    record.setFields(Collections.singletonList(id));

    assertTrue(record.hasFields());
    assertTrue(record.isError());
    assertEquals("R", record.getName());
    assertEquals("example", record.getNamespace());
    assertEquals("example.R", record.getFullName());
    assertEquals("doc", record.getDoc());
    assertSame(id, record.getField("id"));
    assertNull(record.getField("missing"));
    assertEquals(0, id.pos());
    assertThrowsAvroRuntime(() -> record.setFields(Collections.<Schema.Field>emptyList()));
  }

  @Test
  public void anonymousRecordFactorySetsFields() {
    Schema record = Schema
        .createRecord(Collections.singletonList(new Schema.Field("value", Schema.create(Schema.Type.INT))));
    assertTrue(record.hasFields());
    assertNull(record.getName());
    assertEquals(1, record.getFields().size());
  }

  @Test
  public void recordRejectsDuplicateAndReusedFields() {
    Schema.Field first = new Schema.Field("same", Schema.create(Schema.Type.INT));
    Schema.Field second = new Schema.Field("same", Schema.create(Schema.Type.LONG));
    Schema duplicateRecord = Schema.createRecord("D", null, null, false);
    assertThrowsAvroRuntime(() -> duplicateRecord.setFields(Arrays.asList(first, second)));

    Schema.Field used = new Schema.Field("used", Schema.create(Schema.Type.STRING));
    Schema.createRecord("One", null, null, false, Collections.singletonList(used));
    Schema another = Schema.createRecord("Two", null, null, false);
    assertThrowsAvroRuntime(() -> another.setFields(Collections.singletonList(used)));
  }

  @Test
  public void recordFieldListIsLocked() {
    Schema record = Schema.createRecord("R", null, null, false,
        Collections.singletonList(new Schema.Field("x", Schema.create(Schema.Type.INT))));
    try {
      record.getFields().add(new Schema.Field("y", Schema.create(Schema.Type.INT)));
      fail("Expected locked field list");
    } catch (IllegalStateException expected) {
      // expected
    }
  }

  @Test
  public void enumExposesSymbolsOrdinalsAndDefault() {
    Schema schema = Schema.createEnum("Color", "colors", "example", Arrays.asList("RED", "GREEN"), "GREEN");
    assertEquals(Arrays.asList("RED", "GREEN"), schema.getEnumSymbols());
    assertTrue(schema.hasEnumSymbol("RED"));
    assertFalse(schema.hasEnumSymbol("BLUE"));
    assertEquals(0, schema.getEnumOrdinal("RED"));
    assertEquals(1, schema.getEnumOrdinal("GREEN"));
    assertEquals("GREEN", schema.getEnumDefault());
    try {
      schema.getEnumOrdinal("BLUE");
      fail("Expected TracingAvroTypeException");
    } catch (TracingAvroTypeException expected) {
      assertTrue(expected.getMessage().contains("BLUE"));
    }
  }

  @Test(expected = SchemaParseException.class)
  public void enumRejectsDuplicateSymbols() {
    Schema.createEnum("E", null, null, Arrays.asList("A", "A"));
  }

  @Test(expected = SchemaParseException.class)
  public void enumRejectsDefaultOutsideSymbolSet() {
    Schema.createEnum("E", null, null, Collections.singletonList("A"), "B");
  }

  @Test
  public void arrayMapFixedAndUnionExposeTheirSpecificValues() {
    Schema string = Schema.create(Schema.Type.STRING);
    Schema array = Schema.createArray(string);
    Schema map = Schema.createMap(string);
    Schema fixed = Schema.createFixed("Token", "doc", "example", 8);
    Schema union = Schema.createUnion(Schema.create(Schema.Type.NULL), string);

    assertSame(string, array.getElementType());
    assertSame(string, map.getValueType());
    assertEquals(8, fixed.getFixedSize());
    assertEquals(2, union.getTypes().size());
    assertEquals(Integer.valueOf(0), union.getIndexNamed("null"));
    assertEquals(Integer.valueOf(1), union.getIndexNamed("string"));
    assertNull(union.getIndexNamed("long"));
    assertTrue(union.isUnion());
    assertFalse(string.isUnion());
  }

  @Test(expected = AvroRuntimeException.class)
  public void unionRejectsNestedUnion() {
    Schema nested = Schema.createUnion(Schema.create(Schema.Type.NULL), Schema.create(Schema.Type.INT));
    Schema.createUnion(nested, Schema.create(Schema.Type.STRING));
  }

  @Test(expected = AvroRuntimeException.class)
  public void unionRejectsDuplicateFullNames() {
    Schema.createUnion(Schema.create(Schema.Type.INT), Schema.create(Schema.Type.INT));
  }

  @Test(expected = AvroRuntimeException.class)
  public void unionRejectsProperties() {
    Schema.createUnion(Schema.create(Schema.Type.NULL), Schema.create(Schema.Type.INT)).addProp("custom", "value");
  }

  @Test
  public void nullableRecognizesNullDirectlyAndRecursively() {
    Schema string = Schema.create(Schema.Type.STRING);
    Schema nullSchema = Schema.create(Schema.Type.NULL);
    assertFalse(string.isNullable());
    assertTrue(nullSchema.isNullable());
    assertTrue(Schema.createUnion(string, nullSchema).isNullable());
    assertFalse(Schema.createUnion(string, Schema.create(Schema.Type.INT)).isNullable());
  }

  @Test
  public void namedSchemasManageQualifiedAndUnqualifiedAliases() {
    Schema record = Schema.createRecord("R", null, "example", false, Collections.<Schema.Field>emptyList());
    assertTrue(record.getAliases().isEmpty());
    record.addAlias("OldR");
    record.addAlias("Legacy", "legacy.ns");
    assertTrue(record.getAliases().contains("example.OldR"));
    assertTrue(record.getAliases().contains("legacy.ns.Legacy"));
  }

  @Test(expected = AvroTypeException.class)
  public void namedSchemaCannotUsePrimitiveName() {
    Schema.createRecord("int", null, null, false);
  }

  @Test
  public void fieldAccessorsDefaultsAliasesEqualityAndCopyAreCovered() {
    Schema intSchema = Schema.create(Schema.Type.INT);
    Schema.Field field = new Schema.Field("count", intSchema, "doc", 7, Schema.Field.Order.DESCENDING);
    field.addAlias("oldCount");

    assertEquals("count", field.name());
    assertSame(intSchema, field.schema());
    assertEquals("doc", field.doc());
    assertTrue(field.hasDefaultValue());
    assertEquals(7, field.defaultVal());
    assertEquals(Schema.Field.Order.DESCENDING, field.order());
    assertEquals(Collections.singleton("oldCount"), field.aliases());
    assertTrue(field.toString().contains("count"));

    Schema.Field copy = new Schema.Field(field, intSchema);
    assertEquals(field, copy);
    assertEquals(field.hashCode(), copy.hashCode());
    assertEquals(field.aliases(), copy.aliases());
    assertNotEquals(field, new Schema.Field("other", intSchema, "doc", 7, Schema.Field.Order.DESCENDING));
    assertNotEquals(field, "not a field");
    assertSame(field, field);
  }

  /*
   * @Test public void fieldSupportsExplicitNullAndNoDefaultAsDifferentStates() {
   * Schema nullSchema = Schema.create(Schema.Type.NULL); Schema.Field absent =
   * new Schema.Field("a", nullSchema); Schema.Field explicit = new
   * Schema.Field("b", nullSchema, null, Schema.Field.NULL_DEFAULT_VALUE);
   * assertFalse(absent.hasDefaultValue()); assertNull(absent.defaultVal());
   * assertTrue(explicit.hasDefaultValue()); assertNull(explicit.defaultVal());
   * assertTrue(absent.aliases().isEmpty()); }
   */

  @Test(expected = NullPointerException.class)
  public void fieldRequiresSchema() {
    new Schema.Field("x", null);
  }

  @Test(expected = NullPointerException.class)
  public void fieldRequiresOrder() {
    new Schema.Field("x", Schema.create(Schema.Type.INT), null, 1, null);
  }

  @Test
  public void schemaEqualityAndHashCodeCoverIdentityTypePropsAndCachedHash() {
    Schema a = Schema.create(Schema.Type.INT);
    Schema b = Schema.create(Schema.Type.INT);
    assertSame(a, a);
    assertEquals(a, b);
    assertEquals(a.hashCode(), b.hashCode());
    assertNotEquals(a, Schema.create(Schema.Type.LONG));
    assertNotEquals(a, "int");

    b.addProp("custom", "value");
    assertNotEquals(a, b);
    int withProperty = b.hashCode();
    b.addProp("another", "property");
    assertNotEquals(withProperty, b.hashCode());
  }

  @Test
  public void serializationUsesShortAndExpandedPrimitiveForms() {
    Schema string = Schema.create(Schema.Type.STRING);
    assertEquals("\"string\"", string.toString());
    string.addProp("custom", "value");
    String rendered = string.toString();
    assertTrue(rendered.contains("\"type\":\"string\""));
    assertTrue(rendered.contains("\"custom\":\"value\""));
    assertTrue(string.toString(true).contains("\n"));
  }

  @Test
  public void isValidDefaultCoversPrimitiveBranches() {
    assertValidity(Schema.Type.STRING, "\"x\"", true);
    assertValidity(Schema.Type.STRING, "1", false);
    assertValidity(Schema.Type.BYTES, "\"x\"", true);
    assertValidity(Schema.Type.INT, "1", true);
    assertValidity(Schema.Type.INT, "2147483648", false);
    assertValidity(Schema.Type.LONG, "2147483648", true);
    assertValidity(Schema.Type.LONG, "1.5", false);
    assertValidity(Schema.Type.FLOAT, "1.5", true);
    assertValidity(Schema.Type.DOUBLE, "1.5", true);
    assertValidity(Schema.Type.BOOLEAN, "true", true);
    assertValidity(Schema.Type.BOOLEAN, "\"true\"", false);
    assertValidity(Schema.Type.NULL, "null", true);
    assertFalse(Schema.create(Schema.Type.NULL).isValidDefault(null));
  }

  @Test
  public void isValidDefaultCoversContainersRecordsAndUnions() {
    Schema ints = Schema.createArray(Schema.create(Schema.Type.INT));
    assertTrue(ints.isValidDefault(json("[1,2]")));
    assertFalse(ints.isValidDefault(json("{}")));
    assertFalse(ints.isValidDefault(json("[1,\"bad\"]")));

    Schema map = Schema.createMap(Schema.create(Schema.Type.BOOLEAN));
    assertTrue(map.isValidDefault(json("{\"x\":true}")));
    assertFalse(map.isValidDefault(json("[]")));
    assertFalse(map.isValidDefault(json("{\"x\":1}")));

    Schema record = Schema.createRecord("R", null, null, false,
        Arrays.asList(new Schema.Field("required", Schema.create(Schema.Type.INT)),
            new Schema.Field("defaulted", Schema.create(Schema.Type.STRING), null, "ok")));
    assertTrue(record.isValidDefault(json("{\"required\":1}")));
    assertFalse(record.isValidDefault(json("[]")));
    assertFalse(record.isValidDefault(json("{}")));

    Schema union = Schema.createUnion(Schema.create(Schema.Type.NULL), Schema.create(Schema.Type.INT));
    assertTrue(union.isValidDefault(json("null")));
    assertTrue(union.isValidDefault(json("2")));
    assertFalse(union.isValidDefault(json("\"bad\"")));
  }

  @Test
  public void parserHandlesPrimitiveNamedContainerAndUnionSchemas() {
    Schema.Parser parser = new Schema.Parser();
    assertTrue(parser.getValidateDefaults());
    assertSame(parser, parser.setValidateDefaults(false));
    assertFalse(parser.getValidateDefaults());

    assertEquals(Schema.Type.INT, parser.parse("\"int\"").getType());
    assertEquals(Schema.Type.ARRAY, parser.parse("{\"type\":\"array\",\"items\":\"long\"}").getType());
    assertEquals(Schema.Type.MAP, parser.parse("{\"type\":\"map\",\"values\":\"string\"}").getType());
    assertEquals(Schema.Type.UNION, parser.parse("[\"null\",\"string\"]").getType());
    assertEquals(Schema.Type.FIXED, parser.parse("{\"type\":\"fixed\",\"name\":\"F\",\"size\":4}").getType());
    assertEquals(Schema.Type.ENUM, parser.parse("{\"type\":\"enum\",\"name\":\"E\",\"symbols\":[\"A\"]}").getType());
  }

  @Test
  public void parserAddsAndResolvesNamedTypes() {
    Schema known = Schema.createRecord("Known", null, "example", false, Collections.<Schema.Field>emptyList());
    Schema.Parser parser = new Schema.Parser();
    assertSame(parser, parser.addTypes(Collections.singletonList(known)));
    assertSame(known, parser.getTypes().get("example.Known"));
    Schema parsed = parser.parse("{\"type\":\"record\",\"name\":\"UsesKnown\","
        + "\"namespace\":\"example\",\"fields\":[{\"name\":\"k\",\"type\":\"Known\"}]}");
    assertEquals("example.Known", parsed.getField("k").schema().getFullName());
  }

  @Test
  public void parserConcatenatesPartsAndLeavesInputStreamOpen() throws Exception {
    Schema.Parser parser = new Schema.Parser();
    assertEquals(Schema.Type.ARRAY, parser.parse("{\"type\":", "\"array\",", "\"items\":\"int\"}").getType());

    TrackingInputStream in = new TrackingInputStream("\"long\"".getBytes(StandardCharsets.UTF_8));
    assertEquals(Schema.Type.LONG, parser.parse(in).getType());
    assertFalse(in.closed);
  }

  @Test(expected = SchemaParseException.class)
  public void stringParserRejectsDanglingContent() {
    new Schema.Parser().parse("\"int\" trailing");
  }

  @Test
  public void parserRejectsMalformedOrIncompleteSchemas() {
    assertParseFails("null");
    assertParseFails("1");
    assertParseFails("{}");
    assertParseFails("{\"type\":\"unknown\"}");
    assertParseFails("{\"type\":\"record\",\"name\":\"R\"}");
    assertParseFails("{\"type\":\"record\",\"name\":\"R\",\"fields\":[{\"name\":\"x\"}]}");
    assertParseFails("{\"type\":\"enum\",\"name\":\"E\"}");
    assertParseFails("{\"type\":\"array\"}");
    assertParseFails("{\"type\":\"map\"}");
    assertParseFails("{\"type\":\"fixed\",\"name\":\"F\"}");
    assertParseFails("{\"type\":\"fixed\",\"name\":\"F\",\"size\":\"4\"}");
    assertParseFails("{\"type\":\"record\",\"name\":\"R\",\"aliases\":\"bad\",\"fields\":[]}");
    assertParseFails("{\"type\":\"record\",\"name\":\"R\",\"aliases\":[1],\"fields\":[]}");
  }

  @Test
  public void parseJsonToObjectCoversScalarAndContainerValues() {
    assertEquals(1, Schema.parseJsonToObject("1"));
    Object value = Schema.parseJsonToObject("[true,\"x\"]");
    assertTrue(value instanceof List);
    assertEquals(Arrays.asList(true, "x"), value);
  }

  @Test
  public void applyAliasesCoversUnchangedAndRenamedRecordField() {
    Schema identical = Schema.create(Schema.Type.INT);
    assertSame(identical, Schema.applyAliases(identical, Schema.create(Schema.Type.INT)));

    Schema writer = Schema.createRecord("Old", null, "example", false,
        Collections.singletonList(new Schema.Field("oldField", Schema.create(Schema.Type.STRING))));
    Schema.Field readerField = new Schema.Field("newField", Schema.create(Schema.Type.STRING));
    readerField.addAlias("oldField");
    Schema reader = Schema.createRecord("New", null, "example", false, Collections.singletonList(readerField));
    reader.addAlias("Old");

    Schema rewritten = Schema.applyAliases(writer, reader);
    assertEquals("example.New", rewritten.getFullName());
    assertNotNull(rewritten.getField("newField"));
    assertNull(rewritten.getField("oldField"));
  }

  @Test
  public void seenPairUsesObjectIdentity() {
    Object a = new String("x");
    Object equalButDistinct = new String("x");
    Object b = new Object();
    Schema.SeenPair pair = new Schema.SeenPair(a, b);
    assertEquals(pair, new Schema.SeenPair(a, b));
    assertNotEquals(pair, new Schema.SeenPair(equalButDistinct, b));
    assertNotEquals(pair, "not a pair");
    assertEquals(System.identityHashCode(a) + System.identityHashCode(b), pair.hashCode());
  }

  private static JsonNode json(String text) {
    return Schema.parseJson(text);
  }

  private static void assertValidity(Schema.Type type, String value, boolean expected) {
    assertEquals(expected, Schema.create(type).isValidDefault(json(value)));
  }

  private static void assertParseFails(String schema) {
    try {
      new Schema.Parser().parse(schema);
      fail("Expected parse failure for: " + schema);
    } catch (SchemaParseException expected) {
      // expected
    }
  }

  private static void assertThrowsAvroRuntime(Runnable action) {
    try {
      action.run();
      fail("Expected AvroRuntimeException");
    } catch (AvroRuntimeException expected) {
      // expected
    }
  }

  private static final class TrackingInputStream extends ByteArrayInputStream {
    private boolean closed;

    private TrackingInputStream(byte[] bytes) {
      super(bytes);
    }

    @Override
    public void close() {
      closed = true;
    }
  }
}
