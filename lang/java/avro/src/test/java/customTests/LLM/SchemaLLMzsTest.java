package customTests.LLM;

import org.apache.avro.NameValidator;
import org.apache.avro.Schema;
import org.apache.avro.path.TracingAvroTypeException;
import org.junit.After;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;

import org.apache.avro.AvroRuntimeException;
import org.apache.avro.SchemaParseException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.fail;

public class SchemaLLMzsTest {

  @After
  public void restoreThreadLocalSettings() {
    Schema.setNameValidator(NameValidator.UTF_VALIDATOR);
    Schema.setValidateDefaults(true);
  }

  @Test
  public void typeNamesAndPrimitiveFactoryCoverEverySupportedPrimitive() {
    Schema.Type[] supported = { Schema.Type.STRING, Schema.Type.BYTES, Schema.Type.INT, Schema.Type.LONG,
        Schema.Type.FLOAT, Schema.Type.DOUBLE, Schema.Type.BOOLEAN, Schema.Type.NULL };
    for (Schema.Type type : supported) {
      Schema schema = Schema.create(type);
      assertEquals(type, schema.getType());
      assertEquals(type.name().toLowerCase(java.util.Locale.ENGLISH), type.getName());
      assertEquals(type.getName(), schema.getName());
      assertFalse(schema.isUnion());
      assertEquals(type == Schema.Type.NULL, schema.isNullable());
    }
  }

  @Test
  public void primitiveFactoryRejectsComplexTypes() {
    for (Schema.Type type : Arrays.asList(Schema.Type.RECORD, Schema.Type.ENUM, Schema.Type.ARRAY, Schema.Type.MAP,
        Schema.Type.UNION, Schema.Type.FIXED)) {
      try {
        Schema.create(type);
        fail("Expected AvroRuntimeException for " + type);
      } catch (AvroRuntimeException expected) {
        assertTrue(expected.getMessage().contains("Can't create a"));
      }
    }
  }

  @Test
  public void recordSupportsFieldsPositionsAliasesAndSingleAssignment() {
    Schema record = Schema.createRecord("R", "doc", "example", true);
    assertFalse(record.hasFields());
    try {
      record.getFields();
      fail("Expected unset-fields failure");
    } catch (AvroRuntimeException expected) {
      assertTrue(expected.getMessage().contains("not set"));
    }

    Schema.Field first = new Schema.Field("a", Schema.create(Schema.Type.INT), "field doc", 1);
    first.addAlias("oldA");
    Schema.Field second = new Schema.Field("b", Schema.create(Schema.Type.STRING), null, null,
        Schema.Field.Order.DESCENDING);
    record.setFields(Arrays.asList(first, second));

    assertTrue(record.hasFields());
    assertTrue(record.isError());
    assertEquals("R", record.getName());
    assertEquals("example.R", record.getFullName());
    assertEquals("example", record.getNamespace());
    assertEquals("doc", record.getDoc());
    assertSame(first, record.getField("a"));
    assertNull(record.getField("missing"));
    assertEquals(0, first.pos());
    assertEquals(1, second.pos());
    assertEquals(Collections.singleton("oldA"), first.aliases());
    assertEquals(Schema.Field.Order.DESCENDING, second.order());

    record.addAlias("OldR");
    record.addAlias("Legacy", "other");
    assertTrue(record.getAliases().contains("example.OldR"));
    assertTrue(record.getAliases().contains("other.Legacy"));

    try {
      record.setFields(Collections.<Schema.Field>emptyList());
      fail("Expected fields to be assignable only once");
    } catch (AvroRuntimeException expected) {
      assertTrue(expected.getMessage().contains("already set"));
    }
  }

  @Test
  public void recordRejectsDuplicateAndReusedFields() {
    Schema duplicateRecord = Schema.createRecord("D", null, null, false);
    try {
      duplicateRecord.setFields(Arrays.asList(new Schema.Field("x", Schema.create(Schema.Type.INT)),
          new Schema.Field("x", Schema.create(Schema.Type.LONG))));
      fail("Expected duplicate field rejection");
    } catch (AvroRuntimeException expected) {
      assertTrue(expected.getMessage().contains("Duplicate field"));
    }

    Schema.Field reused = new Schema.Field("x", Schema.create(Schema.Type.INT));
    Schema.createRecord("One", null, null, false, Collections.singletonList(reused));
    try {
      Schema.createRecord("Two", null, null, false, Collections.singletonList(reused));
      fail("Expected reused field rejection");
    } catch (AvroRuntimeException expected) {
      assertTrue(expected.getMessage().contains("Field already used"));
    }
  }

  @Test
  public void enumCoversSymbolsOrdinalsDefaultAndValidation() {
    Schema schema = Schema.createEnum("Color", "colors", "example", Arrays.asList("RED", "GREEN"), "GREEN");
    assertEquals(Arrays.asList("RED", "GREEN"), schema.getEnumSymbols());
    assertEquals("GREEN", schema.getEnumDefault());
    assertTrue(schema.hasEnumSymbol("RED"));
    assertFalse(schema.hasEnumSymbol("BLUE"));
    assertEquals(1, schema.getEnumOrdinal("GREEN"));

    try {
      schema.getEnumOrdinal("BLUE");
      fail("Expected unknown symbol rejection");
    } catch (TracingAvroTypeException expected) {
      assertTrue(expected.getMessage().contains("BLUE"));
    }

    try {
      Schema.createEnum("Bad", null, null, Arrays.asList("A", "A"));
      fail("Expected duplicate symbol rejection");
    } catch (SchemaParseException expected) {
      assertTrue(expected.getMessage().contains("Duplicate enum symbol"));
    }

    try {
      Schema.createEnum("BadDefault", null, null, Collections.singletonList("A"), "B");
      fail("Expected invalid enum default rejection");
    } catch (SchemaParseException expected) {
      assertTrue(expected.getMessage().contains("not in the enum symbol set"));
    }
  }

  @Test
  public void arrayMapFixedAndUnionExposeTheirSpecificData() {
    Schema string = Schema.create(Schema.Type.STRING);
    Schema array = Schema.createArray(string);
    Schema map = Schema.createMap(string);
    Schema fixed = Schema.createFixed("F", "fixed", "example", 4);
    Schema union = Schema.createUnion(Schema.create(Schema.Type.NULL), string);

    assertSame(string, array.getElementType());
    assertSame(string, map.getValueType());
    assertEquals(4, fixed.getFixedSize());
    assertEquals(2, union.getTypes().size());
    assertEquals(Integer.valueOf(0), union.getIndexNamed("null"));
    assertEquals(Integer.valueOf(1), union.getIndexNamed("string"));
    assertNull(union.getIndexNamed("int"));
    assertTrue(union.isUnion());
    assertTrue(union.isNullable());

    try {
      Schema.createUnion(union, Schema.create(Schema.Type.INT));
      fail("Expected nested union rejection");
    } catch (AvroRuntimeException expected) {
      assertTrue(expected.getMessage().contains("Nested union"));
    }

    try {
      Schema.createUnion(string, Schema.create(Schema.Type.STRING));
      fail("Expected duplicate union branch rejection");
    } catch (AvroRuntimeException expected) {
      assertTrue(expected.getMessage().contains("Duplicate in union"));
    }

    try {
      union.addProp("x", "y");
      fail("Expected union property rejection");
    } catch (AvroRuntimeException expected) {
      assertTrue(expected.getMessage().contains("Can't set properties"));
    }
  }

  /*
   * @Test public void validDefaultChecksCoverPrimitiveAndContainerBranches() {
   * assertTrue(Schema.create(Schema.Type.STRING).isValidDefault(Schema.parseJson(
   * "\"x\"")));
   * assertFalse(Schema.create(Schema.Type.STRING).isValidDefault(Schema.parseJson
   * ("1")));
   * assertTrue(Schema.create(Schema.Type.INT).isValidDefault(Schema.parseJson("1"
   * )));
   * assertFalse(Schema.create(Schema.Type.INT).isValidDefault(Schema.parseJson(
   * "2147483648")));
   * assertTrue(Schema.create(Schema.Type.LONG).isValidDefault(Schema.parseJson(
   * "2147483648")));
   * assertTrue(Schema.create(Schema.Type.DOUBLE).isValidDefault(Schema.parseJson(
   * "1.5")));
   * assertTrue(Schema.create(Schema.Type.BOOLEAN).isValidDefault(Schema.parseJson
   * ("true")));
   * assertTrue(Schema.create(Schema.Type.NULL).isValidDefault(Schema.parseJson(
   * "null"))); assertFalse(Schema.create(Schema.Type.NULL).isValidDefault(null));
   *
   * Schema ints = Schema.createArray(Schema.create(Schema.Type.INT));
   * assertTrue(ints.isValidDefault(Schema.parseJson("[1,2]")));
   * assertFalse(ints.isValidDefault(Schema.parseJson("[1,\"x\"]")));
   * assertFalse(ints.isValidDefault(Schema.parseJson("{}")));
   *
   * Schema boolMap = Schema.createMap(Schema.create(Schema.Type.BOOLEAN));
   * assertTrue(boolMap.isValidDefault(Schema.parseJson("{\"a\":true}")));
   * assertFalse(boolMap.isValidDefault(Schema.parseJson("{\"a\":1}")));
   * assertFalse(boolMap.isValidDefault(Schema.parseJson("[]"))); }
   */

  @Test
  public void parsingCoversFormsPropertiesPrettyOutputAndDanglingContent() throws Exception {
    Schema.Parser parser = new Schema.Parser();
    assertTrue(parser.getValidateDefaults());
    assertSame(parser, parser.setValidateDefaults(false));
    assertFalse(parser.getValidateDefaults());

    Schema record = parser.parse("{\"type\":\"record\",\"name\":\"R\",\"namespace\":\"example\","
        + "\"aliases\":[\"OldR\"],\"fields\":[" + "{\"name\":\"f\",\"type\":\"double\",\"default\":\"NaN\","
        + "\"order\":\"ignore\",\"aliases\":[\"oldF\"]}]}");
    assertEquals(Schema.Type.RECORD, record.getType());
    assertEquals(Schema.Field.Order.IGNORE, record.getField("f").order());
    assertTrue(Double.isNaN((Double) record.getField("f").defaultVal()));
    assertTrue(record.toString(true).contains("\n"));
    assertTrue(parser.getTypes().containsKey("example.R"));

    ByteArrayInputStream input = new ByteArrayInputStream("\"int\" trailing".getBytes(StandardCharsets.UTF_8));
    assertEquals(Schema.Type.INT, new Schema.Parser().parse(input).getType());

    try {
      new Schema.Parser().parse("\"int\" trailing");
      fail("Expected dangling content rejection for strings");
    } catch (SchemaParseException expected) {
      assertTrue(expected.getMessage().contains("dangling content"));
    }
  }

  @Test
  public void parserRejectsMalformedSchemaShapes() {
    String[] invalid = { "null", "1", "{}", "{\"type\":\"record\",\"name\":\"R\"}",
        "{\"type\":\"enum\",\"name\":\"E\"}", "{\"type\":\"array\"}", "{\"type\":\"map\"}",
        "{\"type\":\"fixed\",\"name\":\"F\",\"size\":\"x\"}", "{\"type\":\"unknown\"}" };
    for (String json : invalid) {
      try {
        new Schema.Parser().parse(json);
        fail("Expected rejection for " + json);
      } catch (SchemaParseException expected) {
        assertNotNull(expected.getMessage());
      }
    }
  }

  @Test
  public void equalityHashPropertiesAndFieldNaNBranchesAreCovered() {
    Schema left = Schema.create(Schema.Type.STRING);
    Schema right = Schema.create(Schema.Type.STRING);
    assertEquals(left, left);
    assertEquals(left, right);
    assertNotEquals(left, Schema.create(Schema.Type.INT));
    assertNotEquals(left, "string");
    assertEquals(left.hashCode(), right.hashCode());

    left.addProp("p", "v");
    assertNotEquals(left, right);
    right.addProp("p", "v");
    assertEquals(left, right);
    assertEquals(left.hashCode(), right.hashCode());

    Schema.Field nan1 = new Schema.Field("n", Schema.create(Schema.Type.DOUBLE), null, Double.NaN);
    Schema.Field nan2 = new Schema.Field("n", Schema.create(Schema.Type.DOUBLE), null, Double.NaN);
    assertEquals(nan1, nan2);
    assertNotEquals(nan1, new Schema.Field("n", Schema.create(Schema.Type.DOUBLE)));
    assertNotEquals(nan1, "n");
  }

  @Test
  public void applyAliasesCoversRecordFieldAndNestedContainerRewrites() {
    Schema writerRecord = Schema.createRecord("Old", null, "example", false,
        Collections.singletonList(new Schema.Field("oldField", Schema.create(Schema.Type.INT))));
    Schema readerRecord = Schema.createRecord("New", null, "example", false,
        Collections.singletonList(new Schema.Field("newField", Schema.create(Schema.Type.INT))));
    readerRecord.addAlias("Old");
    readerRecord.getField("newField").addAlias("oldField");

    Schema rewritten = Schema.applyAliases(writerRecord, readerRecord);
    assertEquals("example.New", rewritten.getFullName());
    assertNotNull(rewritten.getField("newField"));
    assertNull(rewritten.getField("oldField"));

    Schema writer = Schema.createUnion(Schema.createArray(writerRecord), Schema.createMap(writerRecord));
    Schema reader = Schema.createUnion(Schema.createArray(readerRecord), Schema.createMap(readerRecord));
    Schema nested = Schema.applyAliases(writer, reader);
    assertEquals("example.New", nested.getTypes().get(0).getElementType().getFullName());
    assertEquals("example.New", nested.getTypes().get(1).getValueType().getFullName());

    assertSame(writerRecord, Schema.applyAliases(writerRecord, writerRecord));
    assertSame(writerRecord, Schema.applyAliases(writerRecord, Schema.createRecord("Other", null, "example", false,
        Collections.singletonList(new Schema.Field("x", Schema.create(Schema.Type.INT))))));
  }

  @Test
  public void seenPairUsesIdentityRatherThanObjectEquality() {
    Object a = new String("x");
    Object b = new String("x");
    Schema.SeenPair first = new Schema.SeenPair(a, b);
    Schema.SeenPair sameIdentities = new Schema.SeenPair(a, b);
    Schema.SeenPair equalValuesDifferentIdentities = new Schema.SeenPair(new String("x"), new String("x"));

    assertEquals(first, sameIdentities);
    assertEquals(first.hashCode(), sameIdentities.hashCode());
    assertNotEquals(first, equalValuesDifferentIdentities);
    assertNotEquals(first, "pair");
  }
}
