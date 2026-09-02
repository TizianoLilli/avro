package org.apache.avro;

import com.fasterxml.jackson.databind.node.BooleanNode;
import com.fasterxml.jackson.databind.node.DoubleNode;
import com.fasterxml.jackson.databind.node.IntNode;
import com.fasterxml.jackson.databind.node.LongNode;
import com.fasterxml.jackson.databind.node.NullNode;
import com.fasterxml.jackson.databind.node.TextNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.fail;

public class SchemaC_1LLMTest {

  private interface ThrowingRunnable {
    void run() throws Exception;
  }

  private static <T extends Throwable> T expectThrows(Class<T> expected, ThrowingRunnable action) {
    try {
      action.run();
      fail("Expected " + expected.getName());
      return null;
    } catch (Throwable actual) {
      if (!expected.isInstance(actual)) {
        throw new AssertionError("Expected " + expected.getName() + " but got " + actual, actual);
      }
      return expected.cast(actual);
    }
  }

  @Test
  public void typeNamesAreLowerCase() {
    for (Schema.Type type : Schema.Type.values()) {
      assertEquals(type.name().toLowerCase(java.util.Locale.ENGLISH), type.getName());
    }
  }

  @Test
  public void createSupportsEveryPrimitiveAndRejectsComplexTypes() {
    Schema.Type[] primitives = { Schema.Type.STRING, Schema.Type.BYTES, Schema.Type.INT, Schema.Type.LONG,
        Schema.Type.FLOAT, Schema.Type.DOUBLE, Schema.Type.BOOLEAN, Schema.Type.NULL };
    for (Schema.Type type : primitives) {
      Schema schema = Schema.create(type);
      assertEquals(type, schema.getType());
      assertEquals(type.getName(), schema.getName());
      assertEquals(type.getName(), schema.getFullName());
      assertNull(schema.getDoc());
    }

    for (final Schema.Type type : Arrays.asList(Schema.Type.RECORD, Schema.Type.ENUM, Schema.Type.ARRAY,
        Schema.Type.MAP, Schema.Type.UNION, Schema.Type.FIXED)) {
      expectThrows(AvroRuntimeException.class, new ThrowingRunnable() {
        @Override
        public void run() {
          Schema.create(type);
        }
      });
    }
  }

  @Test
  public void primitiveOperationsRejectInapplicableAccessors() {
    final Schema schema = Schema.create(Schema.Type.STRING);
    expectThrows(AvroRuntimeException.class, () -> schema.getField("x"));
    expectThrows(AvroRuntimeException.class, schema::getFields);
    expectThrows(AvroRuntimeException.class, schema::hasFields);
    expectThrows(AvroRuntimeException.class, () -> schema.setFields(Collections.<Schema.Field>emptyList()));
    expectThrows(AvroRuntimeException.class, schema::getEnumSymbols);
    expectThrows(AvroRuntimeException.class, schema::getEnumDefault);
    expectThrows(AvroRuntimeException.class, () -> schema.getEnumOrdinal("x"));
    expectThrows(AvroRuntimeException.class, () -> schema.hasEnumSymbol("x"));
    expectThrows(AvroRuntimeException.class, schema::getNamespace);
    expectThrows(AvroRuntimeException.class, () -> schema.addAlias("x"));
    expectThrows(AvroRuntimeException.class, () -> schema.addAlias("x", "n"));
    expectThrows(AvroRuntimeException.class, schema::getAliases);
    expectThrows(AvroRuntimeException.class, schema::isError);
    expectThrows(AvroRuntimeException.class, schema::getElementType);
    expectThrows(AvroRuntimeException.class, schema::getValueType);
    expectThrows(AvroRuntimeException.class, schema::getTypes);
    expectThrows(AvroRuntimeException.class, () -> schema.getIndexNamed("x"));
    expectThrows(AvroRuntimeException.class, schema::getFixedSize);
    expectThrows(AvroRuntimeException.class, () -> schema.fieldsToJson(new HashSet<String>(), null,
        Schema.FACTORY.createGenerator(new ByteArrayOutputStream())));
  }

  @Test
  public void recordLifecycleCoversUnsetSetLookupPositionsAndSecondSetFailure() {
    final Schema record = Schema.createRecord("R", "doc", "n", true);
    assertFalse(record.hasFields());
    assertTrue(record.isError());
    assertEquals("R", record.getName());
    assertEquals("n.R", record.getFullName());
    assertEquals("n", record.getNamespace());
    assertEquals("doc", record.getDoc());
    expectThrows(AvroRuntimeException.class, record::getFields);
    expectThrows(AvroRuntimeException.class, () -> record.getField("a"));

    Schema.Field a = new Schema.Field("a", Schema.create(Schema.Type.INT));
    Schema.Field b = new Schema.Field("b", Schema.create(Schema.Type.STRING), "field doc");
    record.setFields(Arrays.asList(a, b));

    assertTrue(record.hasFields());
    assertSame(a, record.getField("a"));
    assertSame(b, record.getField("b"));
    assertNull(record.getField("missing"));
    assertEquals(0, a.pos());
    assertEquals(1, b.pos());
    assertEquals(Arrays.asList(a, b), record.getFields());
    expectThrows(IllegalStateException.class,
        () -> record.getFields().add(new Schema.Field("c", Schema.create(Schema.Type.LONG))));
    expectThrows(AvroRuntimeException.class, () -> record.setFields(Collections.<Schema.Field>emptyList()));
  }

  @Test
  public void recordRejectsReusedAndDuplicateFields() {
    final Schema.Field reused = new Schema.Field("x", Schema.create(Schema.Type.INT));
    Schema first = Schema.createRecord("First", null, null, false, Collections.singletonList(reused));
    assertSame(reused, first.getField("x"));

    final Schema second = Schema.createRecord("Second", null, null, false);
    expectThrows(AvroRuntimeException.class, () -> second.setFields(Collections.singletonList(reused)));

    final Schema duplicateRecord = Schema.createRecord("Duplicate", null, null, false);
    final Schema.Field x1 = new Schema.Field("x", Schema.create(Schema.Type.INT));
    final Schema.Field x2 = new Schema.Field("x", Schema.create(Schema.Type.LONG));
    expectThrows(AvroRuntimeException.class, () -> duplicateRecord.setFields(Arrays.asList(x1, x2)));
  }

  @Test
  public void anonymousAndNamedRecordFactoriesWork() {
    Schema.Field field = new Schema.Field("x", Schema.create(Schema.Type.INT));
    Schema anonymous = Schema.createRecord(Collections.singletonList(field));
    assertNull(anonymous.getName());
    assertNull(anonymous.getFullName());
    assertEquals(1, anonymous.getFields().size());

    Schema named = Schema.createRecord("R", null, null, false,
        Collections.singletonList(new Schema.Field("x", Schema.create(Schema.Type.INT))));
    assertFalse(named.isError());
    assertEquals(1, named.getFields().size());
  }

  @Test
  public void enumCoversSymbolsOrdinalsDefaultAndValidationFailures() {
    Schema schema = Schema.createEnum("E", "doc", "n", Arrays.asList("A", "B"), "B");
    assertEquals(Arrays.asList("A", "B"), schema.getEnumSymbols());
    assertEquals("B", schema.getEnumDefault());
    assertTrue(schema.hasEnumSymbol("A"));
    assertFalse(schema.hasEnumSymbol("Z"));
    assertEquals(0, schema.getEnumOrdinal("A"));
    assertEquals(1, schema.getEnumOrdinal("B"));
    expectThrows(AvroTypeException.class, () -> schema.getEnumOrdinal("Z"));

    expectThrows(SchemaParseException.class, () -> Schema.createEnum("E2", null, null, Arrays.asList("A", "A")));
    expectThrows(SchemaParseException.class, () -> Schema.createEnum("E3", null, null, Arrays.asList("A", "B"), "Z"));
  }

  @Test
  public void namedSchemasSupportAliasesIncludingExplicitEmptyNamespace() {
    Schema record = Schema.createRecord("R", null, "n", false, Collections.<Schema.Field>emptyList());
    assertTrue(record.getAliases().isEmpty());
    record.addAlias("Old");
    record.addAlias("RootOld", "");
    assertTrue(record.getAliases().contains("n.Old"));
    assertTrue(record.getAliases().contains(".RootOld"));

    Schema same = Schema.createRecord("n.R", null, "ignored", false, Collections.<Schema.Field>emptyList());
    assertEquals("n", same.getNamespace());
    assertEquals("n.R", same.getFullName());
  }

  @Test
  public void namedSchemasCannotUsePrimitiveNames() {
    expectThrows(AvroTypeException.class, () -> Schema.createRecord("int", null, null, false));
  }

  @Test
  public void arrayMapAndFixedExposeTheirSpecificState() {
    Schema string = Schema.create(Schema.Type.STRING);
    Schema array = Schema.createArray(string);
    Schema map = Schema.createMap(string);
    Schema fixed = Schema.createFixed("F", "doc", "n", 8);

    assertSame(string, array.getElementType());
    assertSame(string, map.getValueType());
    assertEquals(8, fixed.getFixedSize());
    assertEquals("n.F", fixed.getFullName());
    assertEquals("doc", fixed.getDoc());
  }

  @Test
  public void unionCoversLookupNameNullabilityAndConstructionFailures() {
    Schema string = Schema.create(Schema.Type.STRING);
    Schema nullSchema = Schema.create(Schema.Type.NULL);
    Schema union = Schema.createUnion(string, nullSchema);

    assertTrue(union.isUnion());
    assertTrue(union.isNullable());
    assertEquals(Arrays.asList(string, nullSchema), union.getTypes());
    assertEquals(Integer.valueOf(0), union.getIndexNamed("string"));
    assertEquals(Integer.valueOf(1), union.getIndexNamed("null"));
    assertNull(union.getIndexNamed("missing"));
    assertEquals("union[string, null]", union.getName());
    assertFalse(string.isUnion());
    assertFalse(string.isNullable());
    assertTrue(nullSchema.isNullable());

    expectThrows(AvroRuntimeException.class, () -> Schema.createUnion(string, Schema.create(Schema.Type.STRING)));
    expectThrows(AvroRuntimeException.class, () -> Schema.createUnion(union, Schema.create(Schema.Type.INT)));
    expectThrows(AvroRuntimeException.class, () -> union.addProp("p", "v"));
  }

  @Test
  public void propertiesAffectJsonEqualityAndInvalidateCachedHash() {
    Schema a = Schema.create(Schema.Type.STRING);
    Schema b = Schema.create(Schema.Type.STRING);
    assertEquals(a, b);
    int oldHash = a.hashCode();
    a.addProp("custom", "value");
    int newHash = a.hashCode();
    assertNotEquals(oldHash, newHash);
    assertNotEquals(a, b);
    assertTrue(a.toString().contains("custom"));
    assertEquals("\"string\"", b.toString());
    assertSame(a, a);
    assertNotEquals(a, "string");
    assertNotEquals(a, Schema.create(Schema.Type.INT));
  }

  @Test
  public void fieldConstructorsDefaultsAliasesCopyEqualityAndHashCode() {
    Schema intSchema = Schema.create(Schema.Type.INT);
    Schema.Field plain = new Schema.Field("plain", intSchema);
    assertEquals("plain", plain.name());
    assertSame(intSchema, plain.schema());
    assertNull(plain.doc());
    assertFalse(plain.hasDefaultValue());
    assertNull(plain.defaultVal());
    assertEquals(Schema.Field.Order.ASCENDING, plain.order());
    assertTrue(plain.aliases().isEmpty());

    Schema.Field field = new Schema.Field("value", intSchema, "doc", 3, Schema.Field.Order.DESCENDING);
    field.addAlias("oldValue");
    field.addProp("custom", "p");
    assertTrue(field.hasDefaultValue());
    assertEquals(3, field.defaultVal());
    assertEquals("doc", field.doc());
    assertEquals(Schema.Field.Order.DESCENDING, field.order());
    assertEquals(Collections.singleton("oldValue"), field.aliases());
    expectThrows(UnsupportedOperationException.class, () -> field.aliases().add("other"));

    Schema.Field copy = new Schema.Field(field, Schema.create(Schema.Type.INT));
    assertEquals(field, copy);
    assertEquals(field.hashCode(), copy.hashCode());
    assertNotSame(field, copy);
    assertTrue(copy.aliases().contains("oldValue"));
    assertTrue(field.toString().contains("value type:INT pos:-1"));

    assertSame(field, field);
    assertNotEquals(field, "value");
    assertNotEquals(field, new Schema.Field("other", intSchema, "doc", 3, Schema.Field.Order.DESCENDING));
    assertNotEquals(field,
        new Schema.Field("value", Schema.create(Schema.Type.LONG), "doc", 3, Schema.Field.Order.DESCENDING));
    assertNotEquals(field, new Schema.Field("value", intSchema, "doc", 4, Schema.Field.Order.DESCENDING));
    assertNotEquals(field, new Schema.Field("value", intSchema, "doc", 3, Schema.Field.Order.IGNORE));
  }

  /*
   * @Test public void fieldNullRequirementsAndExplicitNullDefaultAreCovered() {
   * expectThrows(NullPointerException.class, () -> new Schema.Field("x", null));
   * expectThrows(NullPointerException.class, () -> new Schema.Field("x",
   * Schema.create(Schema.Type.INT), null, null, null)); Schema.Field nullable =
   * new Schema.Field("x", Schema.create(Schema.Type.NULL), null,
   * Schema.Field.NULL_DEFAULT_VALUE); assertTrue(nullable.hasDefaultValue());
   * assertNull(nullable.defaultVal()); }
   */

  @Test
  public void nanDefaultsCompareByNanSemantics() {
    Schema doubleSchema = Schema.create(Schema.Type.DOUBLE);
    Schema.Field a = new Schema.Field("x", doubleSchema, null, Double.NaN);
    Schema.Field b = new Schema.Field("x", Schema.create(Schema.Type.DOUBLE), null, Double.NaN);
    Schema.Field c = new Schema.Field("x", Schema.create(Schema.Type.DOUBLE), null, 1.0d);
    assertEquals(a, b);
    assertNotEquals(a, c);
  }

  @Test
  public void isValidDefaultCoversPrimitiveBranches() {
    assertFalse(Schema.create(Schema.Type.STRING).isValidDefault(null));
    assertTrue(Schema.create(Schema.Type.STRING).isValidDefault(TextNode.valueOf("x")));
    assertFalse(Schema.create(Schema.Type.STRING).isValidDefault(IntNode.valueOf(1)));
    assertTrue(Schema.create(Schema.Type.BYTES).isValidDefault(TextNode.valueOf("x")));
    assertTrue(Schema.create(Schema.Type.INT).isValidDefault(IntNode.valueOf(1)));
    assertFalse(Schema.create(Schema.Type.INT).isValidDefault(LongNode.valueOf(Long.MAX_VALUE)));
    assertTrue(Schema.create(Schema.Type.LONG).isValidDefault(LongNode.valueOf(Long.MAX_VALUE)));
    assertFalse(Schema.create(Schema.Type.LONG).isValidDefault(DoubleNode.valueOf(1.5)));
    assertTrue(Schema.create(Schema.Type.FLOAT).isValidDefault(DoubleNode.valueOf(1.5)));
    assertTrue(Schema.create(Schema.Type.DOUBLE).isValidDefault(IntNode.valueOf(1)));
    assertTrue(Schema.create(Schema.Type.BOOLEAN).isValidDefault(BooleanNode.TRUE));
    assertFalse(Schema.create(Schema.Type.BOOLEAN).isValidDefault(TextNode.valueOf("true")));
    assertTrue(Schema.create(Schema.Type.NULL).isValidDefault(NullNode.getInstance()));
    assertFalse(Schema.create(Schema.Type.NULL).isValidDefault(TextNode.valueOf("null")));
  }

  @Test
  public void isValidDefaultCoversContainersUnionAndRecord() {
    ArrayNode validArray = Schema.MAPPER.createArrayNode().add(1).add(2);
    ArrayNode invalidArray = Schema.MAPPER.createArrayNode().add(1).add("x");
    Schema array = Schema.createArray(Schema.create(Schema.Type.INT));
    assertTrue(array.isValidDefault(validArray));
    assertFalse(array.isValidDefault(invalidArray));
    assertFalse(array.isValidDefault(TextNode.valueOf("not-array")));

    ObjectNode validMap = Schema.MAPPER.createObjectNode().put("a", true);
    ObjectNode invalidMap = Schema.MAPPER.createObjectNode().put("a", "true");
    Schema map = Schema.createMap(Schema.create(Schema.Type.BOOLEAN));
    assertTrue(map.isValidDefault(validMap));
    assertFalse(map.isValidDefault(invalidMap));
    assertFalse(map.isValidDefault(validArray));

    Schema union = Schema.createUnion(Schema.create(Schema.Type.NULL), Schema.create(Schema.Type.STRING));
    assertTrue(union.isValidDefault(NullNode.getInstance()));
    assertTrue(union.isValidDefault(TextNode.valueOf("x")));
    assertFalse(union.isValidDefault(IntNode.valueOf(1)));

    Schema.Field required = new Schema.Field("a", Schema.create(Schema.Type.INT));
    Schema.Field defaulted = new Schema.Field("b", Schema.create(Schema.Type.STRING), null, "d");
    Schema record = Schema.createRecord("R", null, null, false, Arrays.asList(required, defaulted));
    assertTrue(record.isValidDefault(Schema.MAPPER.createObjectNode().put("a", 1)));
    assertFalse(record.isValidDefault(Schema.MAPPER.createObjectNode()));
    assertFalse(record.isValidDefault(Schema.MAPPER.createObjectNode().put("a", "bad")));
    assertFalse(record.isValidDefault(validArray));
  }

  @Test
  public void parserCoversPrimitiveRecordEnumArrayMapFixedUnionAndProperties() {
    Schema primitive = new Schema.Parser().parse("{\"type\":\"string\",\"p\":1}");
    assertEquals(Schema.Type.STRING, primitive.getType());
    assertTrue(primitive.toString().contains("\"p\":1"));

    Schema record = new Schema.Parser().parse("{\"type\":\"record\",\"name\":\"R\",\"namespace\":\"n\","
        + "\"doc\":\"d\",\"aliases\":[\"OldR\"],\"fields\":[" + "{\"name\":\"f\",\"type\":\"int\",\"doc\":\"fd\","
        + "\"default\":1,\"order\":\"descending\",\"aliases\":[\"oldF\"]}]}");
    assertEquals("n.R", record.getFullName());
    assertEquals("d", record.getDoc());
    assertTrue(record.getAliases().contains("n.OldR"));
    assertEquals(Schema.Field.Order.DESCENDING, record.getField("f").order());
    assertTrue(record.getField("f").aliases().contains("oldF"));

    Schema error = new Schema.Parser().parse("{\"type\":\"error\",\"name\":\"E\",\"fields\":[]}");
    assertTrue(error.isError());

    Schema enumSchema = new Schema.Parser()
        .parse("{\"type\":\"enum\",\"name\":\"E\",\"symbols\":[\"A\"],\"default\":\"A\"}");
    assertEquals("A", enumSchema.getEnumDefault());

    assertEquals(Schema.Type.ARRAY, new Schema.Parser().parse("{\"type\":\"array\",\"items\":\"long\"}").getType());
    assertEquals(Schema.Type.MAP, new Schema.Parser().parse("{\"type\":\"map\",\"values\":\"boolean\"}").getType());
    assertEquals(4, new Schema.Parser().parse("{\"type\":\"fixed\",\"name\":\"F\",\"size\":4}").getFixedSize());
    assertEquals(2, new Schema.Parser().parse("[\"null\",\"string\"]").getTypes().size());
  }

  @Test
  public void parserCoversSplitStringsDanglingContentAndMalformedJson() {
    Schema.Parser parser = new Schema.Parser();
    assertEquals(Schema.Type.STRING, parser.parse("\"str", "ing\"").getType());
    expectThrows(SchemaParseException.class, () -> new Schema.Parser().parse("\"string\" trailing"));
    expectThrows(SchemaParseException.class, () -> new Schema.Parser().parse("{"));
  }

  @Test
  public void streamParserLeavesInputOpenAndAllowsDanglingContent() throws Exception {
    final class TrackingStream extends ByteArrayInputStream {
      boolean closed;

      TrackingStream(byte[] data) {
        super(data);
      }

      @Override
      public void close() {
        closed = true;
      }
    }
    TrackingStream in = new TrackingStream("\"string\" trailing".getBytes(StandardCharsets.UTF_8));
    Schema schema = new Schema.Parser().parse(in);
    assertEquals(Schema.Type.STRING, schema.getType());
    assertFalse(in.closed);
  }

  @Test
  public void fileParserAndStaticParseEntryPointsWork() throws Exception {
    File file = File.createTempFile("schema", ".avsc");
    try {
      try (FileOutputStream out = new FileOutputStream(file)) {
        out.write("\"long\"".getBytes(StandardCharsets.UTF_8));
      }
      assertEquals(Schema.Type.LONG, new Schema.Parser().parse(file).getType());
      assertEquals(Schema.Type.LONG, Schema.parse(file).getType());
      assertEquals(Schema.Type.INT, Schema.parse("\"int\"").getType());
      assertEquals(Schema.Type.BOOLEAN, Schema.parse("\"boolean\"", true).getType());
      assertEquals(Schema.Type.STRING,
          Schema.parse(new ByteArrayInputStream("\"string\"".getBytes(StandardCharsets.UTF_8))).getType());
    } finally {
      assertTrue(file.delete() || !file.exists());
    }
  }

  @Test
  public void parserTracksTypesAddsTypesAndValidationFlag() {
    Schema.Parser parser = new Schema.Parser((NameValidator) null);
    assertTrue(parser.getValidateDefaults());
    assertSame(parser, parser.setValidateDefaults(false));
    assertFalse(parser.getValidateDefaults());

    Schema record = Schema.createRecord("R", null, "n", false, Collections.<Schema.Field>emptyList());
    assertSame(parser, parser.addTypes(Collections.singletonList(record)));
    assertSame(record, parser.getTypes().get("n.R"));

    Schema.Parser mapParser = new Schema.Parser();
    java.util.Map<String, Schema> types = new java.util.HashMap<String, Schema>();
    types.put("ignored-key", record);
    assertSame(mapParser, mapParser.addTypes(types));
    assertSame(record, mapParser.getTypes().get("n.R"));
  }

  @Test
  public void parserRejectsInvalidSchemaShapesAndMembers() {
    String[] invalid = { "null", "1", "{}", "{\"type\":\"unknown\"}", "{\"type\":\"record\",\"name\":\"R\"}",
        "{\"type\":\"record\",\"name\":\"R\",\"fields\":[{\"type\":\"int\"}]}",
        "{\"type\":\"record\",\"name\":\"R\",\"fields\":[{\"name\":\"f\"}]}", "{\"type\":\"enum\",\"name\":\"E\"}",
        "{\"type\":\"array\"}", "{\"type\":\"map\"}", "{\"type\":\"fixed\",\"name\":\"F\"}",
        "{\"type\":\"fixed\",\"name\":\"F\",\"size\":\"4\"}",
        "{\"type\":\"record\",\"name\":\"R\",\"aliases\":\"old\",\"fields\":[]}",
        "{\"type\":\"record\",\"name\":\"R\",\"aliases\":[1],\"fields\":[]}" };
    for (final String json : invalid) {
      expectThrows(SchemaParseException.class, () -> new Schema.Parser().parse(json));
    }
  }

  /*
   * @Test public void parserDefaultValidationCanBeDisabled() { String
   * invalidDefault = "{\"type\":\"record\",\"name\":\"R\",\"fields\":[" +
   * "{\"name\":\"x\",\"type\":\"int\",\"default\":\"bad\"}]}";
   * expectThrows(AvroTypeException.class, () -> new
   * Schema.Parser().parse(invalidDefault)); Schema parsed = new
   * Schema.Parser().setValidateDefaults(false).parse(invalidDefault);
   * assertEquals("bad", parsed.getField("x").defaultVal()); }
   */

  /*
   * @Test public void jsonHelpersCoverObjectArrayAndInvalidInput() {
   * assertEquals(Integer.valueOf(1), Schema.parseJsonToObject("1"));
   * assertEquals("x", Schema.parseJsonToObject("\"x\""));
   * assertTrue(Schema.parseJson("[1,2]").isArray());
   * expectThrows(AvroRuntimeException.class, () -> Schema.parseJson("{")); }
   */

  @Test
  public void stringRenderingCoversPrettyReferencedAndStructuredSchemas() {
    Schema record = Schema.createRecord("R", "doc", "n", false,
        Collections.singletonList(
            new Schema.Field("f", Schema.createArray(Schema.createMap(Schema.create(Schema.Type.STRING))), "fd",
                Collections.emptyList(), Schema.Field.Order.IGNORE)));
    record.addAlias("OldR");
    record.getField("f").addAlias("oldF");

    String inline = record.toString(false);
    String pretty = record.toString(true);
    String referenced = record.toString(Collections.singleton(record), false);
    assertTrue(inline.contains("\"record\""));
    assertTrue(inline.contains("\"order\":\"ignore\""));
    assertTrue(inline.contains("\"aliases\""));
    assertTrue(pretty.contains("\n"));
    assertEquals("\"n.R\"", referenced);
    assertEquals(inline, record.toString((java.util.Collection<Schema>) null, false));
  }

  /*
   * @Test public void recursiveRecordEqualityHashingAndRenderingTerminate() {
   * Schema left = Schema.createRecord("Node", null, "n", false);
   * left.setFields(Collections.singletonList(new Schema.Field("next", left)));
   * Schema right = Schema.createRecord("Node", null, "n", false);
   * right.setFields(Collections.singletonList(new Schema.Field("next", right)));
   * assertEquals(left, right); assertEquals(left.hashCode(), right.hashCode());
   * assertTrue(left.toString().contains("\"n.Node\"")); }
   */

  @Test
  public void seenPairUsesIdentityNotValueEquality() {
    Object a = new String("x");
    Object b = new String("x");
    Schema.SeenPair first = new Schema.SeenPair(a, b);
    Schema.SeenPair same = new Schema.SeenPair(a, b);
    Schema.SeenPair valueEqualButDistinct = new Schema.SeenPair(new String("x"), new String("x"));

    assertEquals(first, same);
    assertEquals(first.hashCode(), same.hashCode());
    assertNotEquals(first, valueEqualButDistinct);
    assertNotEquals(first, "not a pair");
  }

  @Test
  public void applyAliasesCoversEarlyReturnsAndNamedContainerRewrites() {
    Schema writerRecord = Schema.createRecord("OldR", null, "n", false, Collections.singletonList(
        new Schema.Field("oldF", Schema.createArray(Schema.createMap(Schema.create(Schema.Type.STRING))))));
    Schema same = Schema.applyAliases(writerRecord, writerRecord);
    assertSame(writerRecord, same);

    Schema readerWithoutAliases = Schema.createRecord("Other", null, "n", false, Collections.<Schema.Field>emptyList());
    assertSame(writerRecord, Schema.applyAliases(writerRecord, readerWithoutAliases));

    Schema readerRecord = Schema.createRecord("NewR", null, "n", false);
    readerRecord.addAlias("OldR");
    Schema.Field readerField = new Schema.Field("newF",
        Schema.createArray(Schema.createMap(Schema.create(Schema.Type.STRING))));
    readerField.addAlias("oldF");
    readerRecord.setFields(Collections.singletonList(readerField));

    Schema rewritten = Schema.applyAliases(writerRecord, readerRecord);
    assertEquals("n.NewR", rewritten.getFullName());
    assertNotNull(rewritten.getField("newF"));
    assertEquals(Schema.Type.ARRAY, rewritten.getField("newF").schema().getType());

    Schema writerEnum = Schema.createEnum("OldE", null, "n", Collections.singletonList("A"));
    Schema readerEnum = Schema.createEnum("NewE", null, "n", Collections.singletonList("A"));
    readerEnum.addAlias("OldE");
    assertEquals("n.NewE", Schema.applyAliases(writerEnum, readerEnum).getFullName());

    Schema writerFixed = Schema.createFixed("OldF", null, "n", 4);
    Schema readerFixed = Schema.createFixed("NewF", null, "n", 4);
    readerFixed.addAlias("OldF");
    assertEquals("n.NewF", Schema.applyAliases(writerFixed, readerFixed).getFullName());

    Schema unionWriter = Schema.createUnion(writerEnum, Schema.create(Schema.Type.NULL));
    Schema unionRewritten = Schema.applyAliases(unionWriter, readerEnum);
    assertEquals("n.NewE", unionRewritten.getTypes().get(0).getFullName());
  }

  @Test
  public void serializationRoundTripUsesSchemaReplacement() throws Exception {
    Schema original = Schema.createRecord("R", null, "n", false,
        Collections.singletonList(new Schema.Field("x", Schema.create(Schema.Type.INT))));
    ByteArrayOutputStream bytes = new ByteArrayOutputStream();
    try (ObjectOutputStream out = new ObjectOutputStream(bytes)) {
      out.writeObject(original);
    }
    Object restored;
    try (ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(bytes.toByteArray()))) {
      restored = in.readObject();
    }
    assertTrue(restored instanceof Schema);
    assertEquals(original, restored);
    assertNotSame(original, restored);
  }

  @Test
  public void deprecatedThreadLocalValidationAccessorsRoundTrip() {
    NameValidator originalValidator = Schema.getNameValidator();
    boolean originalDefaults = Schema.getValidateDefaults();
    try {
      Schema.setNameValidator(NameValidator.NO_VALIDATION);
      assertSame(NameValidator.NO_VALIDATION, Schema.getNameValidator());
      Schema.setValidateDefaults(false);
      assertFalse(Schema.getValidateDefaults());
    } finally {
      Schema.setNameValidator(originalValidator);
      Schema.setValidateDefaults(originalDefaults);
    }
  }
}
