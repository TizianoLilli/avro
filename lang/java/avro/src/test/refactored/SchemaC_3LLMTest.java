package org.apache.avro;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.List;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.fail;

/** Branch-oriented JUnit 4 tests for Schema. */
public class SchemaC_3LLMTest {

  private interface ThrowingRunnable {
    void run() throws Exception;
  }

  private static <T extends Throwable> T expectThrows(Class<T> expected, ThrowingRunnable action) {
    try {
      action.run();
      fail("Expected " + expected.getName());
    } catch (Throwable actual) {
      if (!expected.isInstance(actual)) {
        throw new AssertionError("Expected " + expected.getName() + " but got " + actual.getClass().getName(), actual);
      }
      return expected.cast(actual);
    }
    throw new AssertionError("unreachable");
  }

  @Test
  public void primitiveFactoriesExposeAllSupportedTypesAndRejectComplexTypes() {
    Schema.Type[] primitives = { Schema.Type.STRING, Schema.Type.BYTES, Schema.Type.INT, Schema.Type.LONG,
        Schema.Type.FLOAT, Schema.Type.DOUBLE, Schema.Type.BOOLEAN, Schema.Type.NULL };
    for (Schema.Type type : primitives) {
      Schema schema = Schema.create(type);
      assertEquals(type, schema.getType());
      assertEquals(type.getName(), schema.getName());
      assertEquals(type.getName(), schema.getFullName());
      assertNull(schema.getDoc());
      assertEquals(type == Schema.Type.NULL, schema.isNullable());
      assertFalse(schema.isUnion());
    }
    expectThrows(AvroRuntimeException.class, () -> Schema.create(Schema.Type.RECORD));
  }

  @Test
  public void baseOperationsRejectInapplicableSchemaKinds() {
    Schema string = Schema.create(Schema.Type.STRING);
    expectThrows(AvroRuntimeException.class, () -> string.getField("x"));
    expectThrows(AvroRuntimeException.class, string::getFields);
    expectThrows(AvroRuntimeException.class, string::hasFields);
    expectThrows(AvroRuntimeException.class, () -> string.setFields(Collections.emptyList()));
    expectThrows(AvroRuntimeException.class, string::getEnumSymbols);
    expectThrows(AvroRuntimeException.class, string::getEnumDefault);
    expectThrows(AvroRuntimeException.class, () -> string.getEnumOrdinal("x"));
    expectThrows(AvroRuntimeException.class, () -> string.hasEnumSymbol("x"));
    expectThrows(AvroRuntimeException.class, string::getNamespace);
    expectThrows(AvroRuntimeException.class, () -> string.addAlias("x"));
    expectThrows(AvroRuntimeException.class, () -> string.addAlias("x", "n"));
    expectThrows(AvroRuntimeException.class, string::getAliases);
    expectThrows(AvroRuntimeException.class, string::isError);
    expectThrows(AvroRuntimeException.class, string::getElementType);
    expectThrows(AvroRuntimeException.class, string::getValueType);
    expectThrows(AvroRuntimeException.class, string::getTypes);
    expectThrows(AvroRuntimeException.class, () -> string.getIndexNamed("x"));
    expectThrows(AvroRuntimeException.class, string::getFixedSize);
  }

  @Test
  public void recordSupportsFieldsPositionsAliasesAndSingleAssignment() {
    Schema record = Schema.createRecord("R", "record doc", "example", true);
    assertFalse(record.hasFields());
    expectThrows(AvroRuntimeException.class, record::getFields);
    expectThrows(AvroRuntimeException.class, () -> record.getField("id"));

    Schema.Field id = new Schema.Field("id", Schema.create(Schema.Type.LONG), "field doc");
    Schema.Field active = new Schema.Field("active", Schema.create(Schema.Type.BOOLEAN), null, true,
        Schema.Field.Order.DESCENDING);
    id.addAlias("identifier");
    record.setFields(Arrays.asList(id, active));

    assertTrue(record.hasFields());
    assertTrue(record.isError());
    assertEquals("R", record.getName());
    assertEquals("example.R", record.getFullName());
    assertEquals("example", record.getNamespace());
    assertEquals("record doc", record.getDoc());
    assertSame(id, record.getField("id"));
    assertNull(record.getField("missing"));
    assertEquals(0, id.pos());
    assertEquals(1, active.pos());
    assertEquals("field doc", id.doc());
    assertEquals(Schema.Field.Order.DESCENDING, active.order());
    assertEquals(Boolean.TRUE, active.defaultVal());
    assertTrue(id.aliases().contains("identifier"));
    expectThrows(UnsupportedOperationException.class, () -> id.aliases().add("x"));
    expectThrows(IllegalStateException.class,
        () -> record.getFields().add(new Schema.Field("x", Schema.create(Schema.Type.INT))));
    expectThrows(AvroRuntimeException.class, () -> record.setFields(Collections.emptyList()));
  }

  @Test
  public void recordRejectsDuplicateAndPreviouslyUsedFields() {
    Schema duplicate = Schema.createRecord("D", null, null, false);
    expectThrows(AvroRuntimeException.class,
        () -> duplicate.setFields(Arrays.asList(new Schema.Field("x", Schema.create(Schema.Type.INT)),
            new Schema.Field("x", Schema.create(Schema.Type.LONG)))));

    Schema.Field used = new Schema.Field("used", Schema.create(Schema.Type.INT));
    Schema.createRecord("First", null, null, false, Collections.singletonList(used));
    expectThrows(AvroRuntimeException.class,
        () -> Schema.createRecord("Second", null, null, false, Collections.singletonList(used)));
  }

  @Test
  public void enumCoversMembershipOrdinalsDefaultsAndValidation() {
    Schema schema = Schema.createEnum("Color", "colors", "example", Arrays.asList("RED", "GREEN"), "GREEN");
    assertEquals(Arrays.asList("RED", "GREEN"), schema.getEnumSymbols());
    assertTrue(schema.hasEnumSymbol("RED"));
    assertFalse(schema.hasEnumSymbol("BLUE"));
    assertEquals(1, schema.getEnumOrdinal("GREEN"));
    assertEquals("GREEN", schema.getEnumDefault());
    expectThrows(AvroTypeException.class, () -> schema.getEnumOrdinal("BLUE"));
    expectThrows(SchemaParseException.class, () -> Schema.createEnum("E", null, null, Arrays.asList("A", "A")));
    expectThrows(SchemaParseException.class,
        () -> Schema.createEnum("E", null, null, Collections.singletonList("A"), "B"));
  }

  @Test
  public void arrayMapFixedAndUnionExposeTheirSpecificState() {
    Schema string = Schema.create(Schema.Type.STRING);
    Schema array = Schema.createArray(string);
    Schema map = Schema.createMap(array);
    Schema fixed = Schema.createFixed("F", "fixed doc", "example", 4);
    Schema union = Schema.createUnion(Schema.create(Schema.Type.NULL), map, fixed);

    assertSame(string, array.getElementType());
    assertSame(array, map.getValueType());
    assertEquals(4, fixed.getFixedSize());
    assertEquals(Integer.valueOf(0), union.getIndexNamed("null"));
    assertEquals(Integer.valueOf(2), union.getIndexNamed("example.F"));
    assertNull(union.getIndexNamed("missing"));
    assertTrue(union.isUnion());
    assertTrue(union.isNullable());
    assertTrue(Schema.createUnion(string, Schema.create(Schema.Type.NULL)).isNullable());
    assertFalse(Schema.createUnion(string, Schema.create(Schema.Type.INT)).isNullable());
    expectThrows(AvroRuntimeException.class, () -> union.addProp("p", "v"));
    expectThrows(AvroRuntimeException.class, () -> Schema.createUnion(string, string));
    expectThrows(AvroRuntimeException.class, () -> Schema.createUnion(union, string));
  }

  @Test
  public void validDefaultChecksEverySchemaFamilyAndFailureBranch() {
    JsonNodeFactory n = JsonNodeFactory.instance;
    assertFalse(Schema.create(Schema.Type.STRING).isValidDefault(null));
    assertTrue(Schema.create(Schema.Type.STRING).isValidDefault(n.textNode("s")));
    assertFalse(Schema.create(Schema.Type.STRING).isValidDefault(n.numberNode(1)));
    assertTrue(Schema.create(Schema.Type.INT).isValidDefault(n.numberNode(1)));
    assertFalse(Schema.create(Schema.Type.INT).isValidDefault(n.numberNode(2147483648L)));
    assertTrue(Schema.create(Schema.Type.LONG).isValidDefault(n.numberNode(2147483648L)));
    assertTrue(Schema.create(Schema.Type.DOUBLE).isValidDefault(n.numberNode(1.5)));
    assertTrue(Schema.create(Schema.Type.BOOLEAN).isValidDefault(n.booleanNode(true)));
    assertTrue(Schema.create(Schema.Type.NULL).isValidDefault(n.nullNode()));

    Schema ints = Schema.createArray(Schema.create(Schema.Type.INT));
    assertTrue(ints.isValidDefault(Schema.parseJson("[1,2]")));
    assertFalse(ints.isValidDefault(Schema.parseJson("[1,\"bad\"]")));
    assertFalse(ints.isValidDefault(Schema.parseJson("{}")));

    Schema longMap = Schema.createMap(Schema.create(Schema.Type.LONG));
    assertTrue(longMap.isValidDefault(Schema.parseJson("{\"x\":1}")));
    assertFalse(longMap.isValidDefault(Schema.parseJson("{\"x\":true}")));
    assertFalse(longMap.isValidDefault(Schema.parseJson("[]")));

    Schema record = Schema.createRecord("Defaults", null, null, false,
        Arrays.asList(new Schema.Field("x", Schema.create(Schema.Type.INT), null, 7),
            new Schema.Field("y", Schema.create(Schema.Type.STRING))));
    assertTrue(record.isValidDefault(Schema.parseJson("{\"x\":1,\"y\":\"ok\"}")));
    assertFalse(record.isValidDefault(Schema.parseJson("{\"x\":1}")));
    assertFalse(record.isValidDefault(Schema.parseJson("[]")));
  }

  /*
   * @Test public void fieldsCoverNullDefaultNaNEqualityCopyAndIdentityBranches()
   * { Schema doubleSchema = Schema.create(Schema.Type.DOUBLE); Schema.Field
   * noDefault = new Schema.Field("x", doubleSchema); Schema.Field nullDefault =
   * new Schema.Field( "x", Schema.createUnion(Schema.create(Schema.Type.NULL),
   * doubleSchema), null, Schema.Field.NULL_DEFAULT_VALUE);
   * assertFalse(noDefault.hasDefaultValue());
   * assertTrue(nullDefault.hasDefaultValue());
   * assertNull(nullDefault.defaultVal()); assertSame(noDefault, noDefault);
   * assertFalse(noDefault.equals("x"));
   * 
   * Schema.Field nan1 = new Schema.Field("n", doubleSchema, null, Double.NaN);
   * Schema.Field nan2 = new Schema.Field("n", doubleSchema, null, Double.NaN);
   * assertEquals(nan1, nan2); nan1.addAlias("oldN"); Schema.Field copy = new
   * Schema.Field(nan1, doubleSchema); assertEquals(nan1, copy);
   * assertTrue(copy.aliases().contains("oldN"));
   * assertTrue(copy.toString().contains("n type:DOUBLE pos:-1")); }
   */

  @Test
  public void equalityHashingPropertiesAndRecursiveRecordsCoverCaches() {
    Schema left = Schema.create(Schema.Type.STRING);
    Schema right = Schema.create(Schema.Type.STRING);
    assertSame(left, left);
    assertEquals(left, right);
    assertFalse(left.equals(null));
    assertFalse(left.equals("string"));
    assertFalse(left.equals(Schema.create(Schema.Type.INT)));
    assertEquals(left.hashCode(), right.hashCode());

    left.addProp("custom", "a");
    assertNotEquals(left, right);
    right.addProp("custom", "a");
    assertEquals(left, right);
    assertEquals(left.hashCode(), right.hashCode());

    Schema r1 = Schema.createRecord("Node", null, "example", false);
    Schema r2 = Schema.createRecord("Node", null, "example", false);
    r1.setFields(Collections.singletonList(new Schema.Field("next",
        Schema.createUnion(Schema.create(Schema.Type.NULL), r1), null, Schema.Field.NULL_DEFAULT_VALUE)));
    r2.setFields(Collections.singletonList(new Schema.Field("next",
        Schema.createUnion(Schema.create(Schema.Type.NULL), r2), null, Schema.Field.NULL_DEFAULT_VALUE)));
    assertEquals(r1, r2);
    assertEquals(r1.hashCode(), r2.hashCode());
  }

  @Test
  public void namedSchemasHandleAliasesAndPrimitiveNameRejection() {
    Schema fixed = Schema.createFixed("Thing", null, "example", 2);
    assertTrue(fixed.getAliases().isEmpty());
    fixed.addAlias("OldThing");
    fixed.addAlias("Legacy", "legacy.ns");
    assertTrue(fixed.getAliases().contains("example.OldThing"));
    assertTrue(fixed.getAliases().contains("legacy.ns.Legacy"));
    expectThrows(AvroTypeException.class, () -> Schema.createFixed("string", null, null, 1));
  }

  @Test
  public void parserAcceptsSourcesCommentsCompositionAndTracksNamedTypes() throws Exception {
    Schema.Parser parser = new Schema.Parser();
    assertTrue(parser.getValidateDefaults());
    assertSame(parser, parser.setValidateDefaults(false));
    assertFalse(parser.getValidateDefaults());

    Schema intSchema = parser.parse("/*comment*/ \"", "int\"");
    assertEquals(Schema.Type.INT, intSchema.getType());

    byte[] recordJson = ("{\"type\":\"record\",\"name\":\"R\",\"namespace\":\"n\","
        + "\"fields\":[{\"name\":\"v\",\"type\":\"string\",\"order\":\"ignore\","
        + "\"aliases\":[\"oldV\"],\"extra\":1}]}").getBytes(StandardCharsets.UTF_8);
    ByteArrayInputStream input = new ByteArrayInputStream(recordJson);
    Schema record = parser.parse(input);
    assertEquals(-1, input.read());
    assertEquals(Schema.Field.Order.IGNORE, record.getField("v").order());
    assertTrue(record.getField("v").aliases().contains("oldV"));
    assertSame(record, parser.getTypes().get("n.R"));

    Map<String, Schema> additions = new LinkedHashMap<>();
    additions.put("ignored-key", Schema.createFixed("F", null, "n", 1));
    assertSame(parser, parser.addTypes(additions));
    assertTrue(parser.getTypes().containsKey("n.F"));
  }

  @Test
  public void parserBuildsAllComplexKindsAndSerializesPrettyAndInline() {
    Schema enumSchema = new Schema.Parser()
        .parse("{\"type\":\"enum\",\"name\":\"E\",\"symbols\":[\"A\",\"B\"],\"default\":\"A\"}");
    Schema fixed = new Schema.Parser().parse("{\"type\":\"fixed\",\"name\":\"F\",\"size\":3}");
    Schema array = new Schema.Parser().parse("{\"type\":\"array\",\"items\":\"long\"}");
    Schema map = new Schema.Parser().parse("{\"type\":\"map\",\"values\":\"boolean\"}");
    Schema union = new Schema.Parser().parse("[\"null\",\"string\"]");

    assertEquals(Schema.Type.ENUM, enumSchema.getType());
    assertEquals(3, fixed.getFixedSize());
    assertEquals(Schema.Type.LONG, array.getElementType().getType());
    assertEquals(Schema.Type.BOOLEAN, map.getValueType().getType());
    assertTrue(union.isNullable());
    assertTrue(enumSchema.toString(true).contains("\n"));
    assertEquals("\"long\"", Schema.create(Schema.Type.LONG).toString());
    assertEquals("\"E\"", enumSchema.toString(Collections.singleton(enumSchema), false));
  }

  @Test
  public void parserRejectsMalformedOrIncompleteSchemasAndDanglingStringContent() {
    String[] invalid = { "null", "1", "{}", "{\"type\":\"unknown\"}", "{\"type\":\"record\",\"name\":\"R\"}",
        "{\"type\":\"record\",\"name\":\"R\",\"fields\":[{\"name\":\"x\"}]}", "{\"type\":\"enum\",\"name\":\"E\"}",
        "{\"type\":\"array\"}", "{\"type\":\"map\"}", "{\"type\":\"fixed\",\"name\":\"F\"}",
        "{\"type\":\"fixed\",\"name\":\"F\",\"size\":\"1\"}",
        "{\"type\":\"record\",\"name\":\"R\",\"aliases\":\"bad\",\"fields\":[]}",
        "{\"type\":\"record\",\"name\":\"R\",\"aliases\":[1],\"fields\":[]}", "\"int\" trailing", "{" };
    for (String json : invalid) {
      expectThrows(SchemaParseException.class, () -> new Schema.Parser().parse(json));
    }
  }

  /*
   * @Test public void parserDefaultValidationCanBeEnabledOrDisabled() { String
   * invalidDefault = "{\"type\":\"record\",\"name\":\"R\",\"fields\":[" +
   * "{\"name\":\"x\",\"type\":\"int\",\"default\":\"bad\"}]}";
   * expectThrows(AvroTypeException.class, () -> new
   * Schema.Parser().parse(invalidDefault)); Schema parsed = new
   * Schema.Parser().setValidateDefaults(false).parse(invalidDefault);
   * assertEquals("bad", parsed.getField("x").defaultVal()); }
   */

  @Test
  public void applyAliasesCoversNoOpNamedFieldAndContainerRewrites() {
    Schema same = Schema.create(Schema.Type.INT);
    assertSame(same, Schema.applyAliases(same, same));

    Schema writerRecord = Schema.createRecord("Old", null, "n", false,
        Collections.singletonList(new Schema.Field("oldField", Schema.create(Schema.Type.STRING))));
    Schema readerRecord = Schema.createRecord("New", null, "n", false,
        Collections.singletonList(new Schema.Field("newField", Schema.create(Schema.Type.STRING))));
    readerRecord.addAlias("Old");
    readerRecord.getField("newField").addAlias("oldField");
    Schema rewritten = Schema.applyAliases(writerRecord, readerRecord);
    assertEquals("n.New", rewritten.getFullName());
    assertNotNull(rewritten.getField("newField"));

    Schema writer = Schema.createUnion(Schema.createArray(writerRecord), Schema.createMap(writerRecord),
        Schema.createEnum("OldE", null, "n", Collections.singletonList("A")), Schema.createFixed("OldF", null, "n", 2));
    Schema readerEnum = Schema.createEnum("NewE", null, "n", Collections.singletonList("A"));
    readerEnum.addAlias("OldE");
    Schema readerFixed = Schema.createFixed("NewF", null, "n", 2);
    readerFixed.addAlias("OldF");
    Schema reader = Schema.createUnion(Schema.createArray(readerRecord), Schema.createMap(readerRecord), readerEnum,
        readerFixed);
    Schema rewrittenContainers = Schema.applyAliases(writer, reader);
    assertEquals("n.New", rewrittenContainers.getTypes().get(0).getElementType().getFullName());
    assertEquals("n.New", rewrittenContainers.getTypes().get(1).getValueType().getFullName());
    assertEquals("n.NewE", rewrittenContainers.getTypes().get(2).getFullName());
    assertEquals("n.NewF", rewrittenContainers.getTypes().get(3).getFullName());
  }

  @Test
  public void seenPairUsesIdentityRatherThanObjectEquality() {
    Object a = new String("x");
    Object b = new String("x");
    Schema.SeenPair pair = new Schema.SeenPair(a, b);
    assertEquals(pair, pair);
    assertEquals(pair, new Schema.SeenPair(a, b));
    assertNotEquals(pair, new Schema.SeenPair(new String("x"), b));
    assertFalse(pair.equals("not a pair"));
    assertEquals(System.identityHashCode(a) + System.identityHashCode(b), pair.hashCode());
  }

  @Test
  public void packagePrivateNameAndLockableListBranchesAreCovered() {
    Schema.Name anonymous = new Schema.Name(null, null);
    Schema.Name qualified = new Schema.Name("a.b.C", "ignored");
    Schema.Name same = new Schema.Name("C", "a.b");
    assertNull(anonymous.toString());
    assertEquals(anonymous, new Schema.Name(null, null));
    assertEquals(qualified, same);
    assertEquals("a.b.C", qualified.toString());
    assertFalse(qualified.equals("a.b.C"));

    Schema.LockableArrayList<String> list = new Schema.LockableArrayList<>("a", "b");
    assertTrue(list.add("c"));
    List<String> locked = list.lock();
    assertSame(list, locked);
    expectThrows(IllegalStateException.class, () -> list.add("d"));
    expectThrows(IllegalStateException.class, () -> list.remove("a"));
    expectThrows(IllegalStateException.class, () -> list.remove(0));
    expectThrows(IllegalStateException.class, () -> list.addAll(Collections.singleton("d")));
    expectThrows(IllegalStateException.class, () -> list.addAll(0, Collections.singleton("d")));
    expectThrows(IllegalStateException.class, () -> list.removeAll(Collections.singleton("a")));
    expectThrows(IllegalStateException.class, list::clear);
  }

}
