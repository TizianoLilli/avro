package customTests.randoop.generated;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ParseContextRandoopTest100 {

  public static boolean debug = false;

  public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
    if (expectedArray.length != actualArray.length) {
      throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
    }
    for (int i = 0; i < expectedArray.length; i++) {
      if (expectedArray[i] != actualArray[i]) {
        throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
      }
    }
  }

  @Test
  public void test01() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test01");
    org.apache.avro.Schema.Field[] fieldArray0 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList1 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList1,
        fieldArray0);
    org.apache.avro.Schema schema3 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
    String str4 = schema3.getName();
    org.apache.avro.NameValidator nameValidator5 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext6 = new org.apache.avro.ParseContext(nameValidator5);
    org.apache.avro.Schema.Field[] fieldArray7 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList8 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean9 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList8,
        fieldArray7);
    org.apache.avro.Schema schema10 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList8);
    boolean boolean11 = schema10.isNullable();
    java.util.Set<String> strSet12 = schema10.getAliases();
    String str13 = schema10.toString();
    org.apache.avro.Schema.Field[] fieldArray14 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList15 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList15,
        fieldArray14);
    org.apache.avro.Schema schema17 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList15);
    boolean boolean18 = schema17.isNullable();
    java.util.Set<String> strSet19 = schema17.getAliases();
    String str20 = schema17.toString();
    org.apache.avro.Schema.Field field22 = schema17.getField("long");
    boolean boolean23 = schema17.hasProps();
    org.apache.avro.Schema schema24 = org.apache.avro.Schema.applyAliases(schema10, schema17);
    org.apache.avro.Schema schema25 = parseContext6.resolve(schema24);
    org.apache.avro.Schema schema26 = org.apache.avro.Schema.applyAliases(schema3, schema24);
    String str28 = schema26.toString(false);
    org.junit.Assert.assertNotNull(fieldArray0);
    org.junit.Assert.assertArrayEquals(fieldArray0, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertNotNull(schema3);
    org.junit.Assert.assertNull(str4);
    org.junit.Assert.assertNotNull(nameValidator5);
    org.junit.Assert.assertNotNull(fieldArray7);
    org.junit.Assert.assertArrayEquals(fieldArray7, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    org.junit.Assert.assertNotNull(schema10);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    org.junit.Assert.assertNotNull(strSet12);
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str13,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNotNull(fieldArray14);
    org.junit.Assert.assertArrayEquals(fieldArray14, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    org.junit.Assert.assertNotNull(schema17);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    org.junit.Assert.assertNotNull(strSet19);
    org.junit.Assert.assertEquals("'" + str20 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str20,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNull(field22);
    org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    org.junit.Assert.assertNotNull(schema24);
    org.junit.Assert.assertNotNull(schema25);
    org.junit.Assert.assertNotNull(schema26);
    org.junit.Assert.assertEquals("'" + str28 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str28,
        "{\"type\":\"record\",\"fields\":[]}");
  }

  @Test
  public void test02() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test02");
    org.apache.avro.NameValidator nameValidator0 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext1 = new org.apache.avro.ParseContext(nameValidator0);
    org.apache.avro.Schema schema2 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema3 = parseContext1.resolve(schema2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.avro.Schema.getType()\" because \"schema\" is null");
    } catch (NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(nameValidator0);
  }

  @Test
  public void test03() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test03");
    org.apache.avro.NameValidator nameValidator0 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext1 = new org.apache.avro.ParseContext(nameValidator0);
    org.apache.avro.Schema.Field[] fieldArray2 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList3 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList3,
        fieldArray2);
    org.apache.avro.Schema schema5 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList3);
    boolean boolean6 = schema5.isNullable();
    java.util.Set<String> strSet7 = schema5.getAliases();
    String str8 = schema5.toString();
    org.apache.avro.Schema.Field[] fieldArray9 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList10 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList10,
        fieldArray9);
    org.apache.avro.Schema schema12 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList10);
    boolean boolean13 = schema12.isNullable();
    java.util.Set<String> strSet14 = schema12.getAliases();
    String str15 = schema12.toString();
    org.apache.avro.Schema.Field field17 = schema12.getField("long");
    boolean boolean18 = schema12.hasProps();
    org.apache.avro.Schema schema19 = org.apache.avro.Schema.applyAliases(schema5, schema12);
    org.apache.avro.Schema schema20 = parseContext1.resolve(schema19);
    org.apache.avro.Schema schema22 = parseContext1.getNamedSchema("{\"type\":\"record\",\"fields\":[]}");
    org.apache.avro.Schema schema24 = parseContext1.getNamedSchema("{\"type\":\"record\",\"fields\":[]}");
    java.util.Map<String, org.apache.avro.Schema> strMap25 = parseContext1.typesByName();
    org.junit.Assert.assertNotNull(nameValidator0);
    org.junit.Assert.assertNotNull(fieldArray2);
    org.junit.Assert.assertArrayEquals(fieldArray2, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    org.junit.Assert.assertNotNull(strSet7);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str8,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNotNull(fieldArray9);
    org.junit.Assert.assertArrayEquals(fieldArray9, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    org.junit.Assert.assertNotNull(schema12);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    org.junit.Assert.assertNotNull(strSet14);
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str15,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNull(field17);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    org.junit.Assert.assertNotNull(schema19);
    org.junit.Assert.assertNotNull(schema20);
    org.junit.Assert.assertNull(schema22);
    org.junit.Assert.assertNull(schema24);
    org.junit.Assert.assertNotNull(strMap25);
  }

  @Test
  public void test04() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test04");
    org.apache.avro.Schema.Field[] fieldArray0 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList1 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList1,
        fieldArray0);
    org.apache.avro.Schema schema3 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
    boolean boolean4 = schema3.isNullable();
    java.util.Set<String> strSet5 = schema3.getAliases();
    String str6 = schema3.toString();
    org.apache.avro.Schema.Field field8 = schema3.getField("long");
    java.util.List<org.apache.avro.Schema.Field> fieldList9 = schema3.getFields();
    boolean boolean10 = schema3.hasFields();
    org.apache.avro.Schema.Field[] fieldArray12 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList13 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList13,
        fieldArray12);
    org.apache.avro.Schema schema15 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList13);
    boolean boolean16 = schema15.isNullable();
    java.util.Set<String> strSet17 = schema15.getAliases();
    com.fasterxml.jackson.databind.JsonNode jsonNode18 = null;
    boolean boolean19 = schema15.isValidDefault(jsonNode18);
    boolean boolean20 = schema15.isUnion();
    org.apache.avro.Schema.Field field22 = new org.apache.avro.Schema.Field("boolean", schema15, "boolean");
    org.apache.avro.Schema.Field[] fieldArray24 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList25 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean26 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList25,
        fieldArray24);
    org.apache.avro.Schema schema27 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList25);
    boolean boolean28 = schema27.isNullable();
    java.util.Set<String> strSet29 = schema27.getAliases();
    org.apache.avro.Schema.Field field31 = new org.apache.avro.Schema.Field("long", schema27, "long");
    org.apache.avro.Schema schema32 = field31.schema();
    org.apache.avro.Schema.Field[] fieldArray33 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList34 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean35 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList34,
        fieldArray33);
    org.apache.avro.Schema schema36 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList34);
    boolean boolean37 = schema36.isNullable();
    org.apache.avro.Schema schema38 = org.apache.avro.Schema.createArray(schema36);
    Object obj40 = schema38.getObjectProp("");
    org.apache.avro.Schema.Type type41 = schema38.getType();
    schema32.addAllProps((org.apache.avro.JsonProperties) schema38);
    boolean boolean43 = schema38.hasProps();
    org.apache.avro.NameValidator nameValidator44 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext45 = new org.apache.avro.ParseContext(nameValidator44);
    org.apache.avro.Schema.Field[] fieldArray46 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList47 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean48 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList47,
        fieldArray46);
    org.apache.avro.Schema schema49 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList47);
    org.apache.avro.SchemaParser.ParseResult parseResult50 = parseContext45.commit(schema49);
    java.util.List<org.apache.avro.Schema> schemaList51 = parseContext45.resolveAllSchemas();
    org.apache.avro.Schema schema52 = org.apache.avro.Schema.createUnion(schemaList51);
    org.apache.avro.Schema schema57 = org.apache.avro.Schema.createRecord("long", "long", "fixed", true);
    org.apache.avro.Schema[] schemaArray58 = new org.apache.avro.Schema[] { schema3, schema15, schema38, schema52,
        schema57 };
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema59 = org.apache.avro.Schema.createUnion(schemaArray58);
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Nameless in union:[{\"type\":\"record\",\"fields\":[]},{\"type\":\"record\",\"fields\":[]},{\"type\":\"array\",\"items\":{\"type\":\"record\",\"fields\":[]}},[],{\"type\":\"error\",\"name\":\"long\",\"namespace\":\"fixed\",\"doc\":\"long\"}]");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(fieldArray0);
    org.junit.Assert.assertArrayEquals(fieldArray0, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertNotNull(schema3);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    org.junit.Assert.assertNotNull(strSet5);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str6,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNull(field8);
    org.junit.Assert.assertNotNull(fieldList9);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    org.junit.Assert.assertNotNull(fieldArray12);
    org.junit.Assert.assertArrayEquals(fieldArray12, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    org.junit.Assert.assertNotNull(schema15);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    org.junit.Assert.assertNotNull(strSet17);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    org.junit.Assert.assertNotNull(fieldArray24);
    org.junit.Assert.assertArrayEquals(fieldArray24, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    org.junit.Assert.assertNotNull(schema27);
    org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    org.junit.Assert.assertNotNull(strSet29);
    org.junit.Assert.assertNotNull(schema32);
    org.junit.Assert.assertNotNull(fieldArray33);
    org.junit.Assert.assertArrayEquals(fieldArray33, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    org.junit.Assert.assertNotNull(schema36);
    org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    org.junit.Assert.assertNotNull(schema38);
    org.junit.Assert.assertNull(obj40);
    org.junit.Assert.assertTrue("'" + type41 + "' != '" + org.apache.avro.Schema.Type.ARRAY + "'",
        type41.equals(org.apache.avro.Schema.Type.ARRAY));
    org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    org.junit.Assert.assertNotNull(nameValidator44);
    org.junit.Assert.assertNotNull(fieldArray46);
    org.junit.Assert.assertArrayEquals(fieldArray46, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    org.junit.Assert.assertNotNull(schema49);
    org.junit.Assert.assertNotNull(parseResult50);
    org.junit.Assert.assertNotNull(schemaList51);
    org.junit.Assert.assertNotNull(schema52);
    org.junit.Assert.assertNotNull(schema57);
    org.junit.Assert.assertNotNull(schemaArray58);
  }

  @Test
  public void test05() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test05");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.DOUBLE;
    org.apache.avro.Schema.SeenPair seenPair2 = new org.apache.avro.Schema.SeenPair((Object) type0, (Object) 1);
    org.apache.avro.Schema.Field[] fieldArray4 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList5 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList5,
        fieldArray4);
    org.apache.avro.Schema schema7 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList5);
    boolean boolean8 = schema7.isNullable();
    java.util.Set<String> strSet9 = schema7.getAliases();
    org.apache.avro.Schema.Field field11 = new org.apache.avro.Schema.Field("long", schema7, "long");
    String str12 = field11.toString();
    org.apache.avro.Schema schema13 = field11.schema();
    org.apache.avro.Schema schema14 = org.apache.avro.Schema.createArray(schema13);
    org.apache.avro.Schema.Field[] fieldArray15 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList16 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList16,
        fieldArray15);
    org.apache.avro.Schema schema18 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList16);
    boolean boolean20 = schema18.equals((Object) 1.0f);
    boolean boolean21 = schema14.equals((Object) schema18);
    boolean boolean22 = seenPair2.equals((Object) schema18);
    org.apache.avro.NameValidator nameValidator23 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext24 = new org.apache.avro.ParseContext(nameValidator23);
    org.apache.avro.Schema.Field[] fieldArray25 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList26 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean27 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList26,
        fieldArray25);
    org.apache.avro.Schema schema28 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList26);
    org.apache.avro.SchemaParser.ParseResult parseResult29 = parseContext24.commit(schema28);
    org.apache.avro.Schema.Parser parser30 = new org.apache.avro.Schema.Parser(parseContext24);
    boolean boolean31 = seenPair2.equals((Object) parseContext24);
    org.apache.avro.Schema.Field[] fieldArray32 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList33 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean34 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList33,
        fieldArray32);
    org.apache.avro.Schema schema35 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList33);
    boolean boolean36 = schema35.isNullable();
    boolean boolean37 = schema35.hasFields();
    org.apache.avro.Schema schema38 = parseContext24.resolve(schema35);
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.DOUBLE + "'",
        type0.equals(org.apache.avro.Schema.Type.DOUBLE));
    org.junit.Assert.assertNotNull(fieldArray4);
    org.junit.Assert.assertArrayEquals(fieldArray4, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    org.junit.Assert.assertNotNull(schema7);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    org.junit.Assert.assertNotNull(strSet9);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "long type:RECORD pos:-1" + "'", str12,
        "long type:RECORD pos:-1");
    org.junit.Assert.assertNotNull(schema13);
    org.junit.Assert.assertNotNull(schema14);
    org.junit.Assert.assertNotNull(fieldArray15);
    org.junit.Assert.assertArrayEquals(fieldArray15, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    org.junit.Assert.assertNotNull(schema18);
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    org.junit.Assert.assertNotNull(nameValidator23);
    org.junit.Assert.assertNotNull(fieldArray25);
    org.junit.Assert.assertArrayEquals(fieldArray25, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    org.junit.Assert.assertNotNull(schema28);
    org.junit.Assert.assertNotNull(parseResult29);
    org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    org.junit.Assert.assertNotNull(fieldArray32);
    org.junit.Assert.assertArrayEquals(fieldArray32, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    org.junit.Assert.assertNotNull(schema35);
    org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    org.junit.Assert.assertNotNull(schema38);
  }

  @Test
  public void test06() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test06");
    org.apache.avro.Schema.Field[] fieldArray0 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList1 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList1,
        fieldArray0);
    org.apache.avro.Schema schema3 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
    String str4 = schema3.getName();
    org.apache.avro.NameValidator nameValidator5 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext6 = new org.apache.avro.ParseContext(nameValidator5);
    org.apache.avro.Schema.Field[] fieldArray7 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList8 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean9 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList8,
        fieldArray7);
    org.apache.avro.Schema schema10 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList8);
    boolean boolean11 = schema10.isNullable();
    java.util.Set<String> strSet12 = schema10.getAliases();
    String str13 = schema10.toString();
    org.apache.avro.Schema.Field[] fieldArray14 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList15 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList15,
        fieldArray14);
    org.apache.avro.Schema schema17 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList15);
    boolean boolean18 = schema17.isNullable();
    java.util.Set<String> strSet19 = schema17.getAliases();
    String str20 = schema17.toString();
    org.apache.avro.Schema.Field field22 = schema17.getField("long");
    boolean boolean23 = schema17.hasProps();
    org.apache.avro.Schema schema24 = org.apache.avro.Schema.applyAliases(schema10, schema17);
    org.apache.avro.Schema schema25 = parseContext6.resolve(schema24);
    org.apache.avro.Schema schema26 = org.apache.avro.Schema.applyAliases(schema3, schema24);
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<String> strList27 = schema3.getEnumSymbols();
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: {\"type\":\"record\",\"fields\":[]}");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(fieldArray0);
    org.junit.Assert.assertArrayEquals(fieldArray0, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertNotNull(schema3);
    org.junit.Assert.assertNull(str4);
    org.junit.Assert.assertNotNull(nameValidator5);
    org.junit.Assert.assertNotNull(fieldArray7);
    org.junit.Assert.assertArrayEquals(fieldArray7, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    org.junit.Assert.assertNotNull(schema10);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    org.junit.Assert.assertNotNull(strSet12);
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str13,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNotNull(fieldArray14);
    org.junit.Assert.assertArrayEquals(fieldArray14, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    org.junit.Assert.assertNotNull(schema17);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    org.junit.Assert.assertNotNull(strSet19);
    org.junit.Assert.assertEquals("'" + str20 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str20,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNull(field22);
    org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    org.junit.Assert.assertNotNull(schema24);
    org.junit.Assert.assertNotNull(schema25);
    org.junit.Assert.assertNotNull(schema26);
  }

  @Test
  public void test07() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test07");
    org.apache.avro.NameValidator nameValidator0 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext1 = new org.apache.avro.ParseContext(nameValidator0);
    org.apache.avro.Schema.Field[] fieldArray2 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList3 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList3,
        fieldArray2);
    org.apache.avro.Schema schema5 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList3);
    boolean boolean6 = schema5.isNullable();
    java.util.Set<String> strSet7 = schema5.getAliases();
    String str8 = schema5.toString();
    org.apache.avro.Schema.Field[] fieldArray9 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList10 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList10,
        fieldArray9);
    org.apache.avro.Schema schema12 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList10);
    boolean boolean13 = schema12.isNullable();
    java.util.Set<String> strSet14 = schema12.getAliases();
    String str15 = schema12.toString();
    org.apache.avro.Schema.Field field17 = schema12.getField("long");
    boolean boolean18 = schema12.hasProps();
    org.apache.avro.Schema schema19 = org.apache.avro.Schema.applyAliases(schema5, schema12);
    org.apache.avro.Schema schema20 = parseContext1.resolve(schema19);
    org.apache.avro.Schema schema21 = org.apache.avro.Schema.createArray(schema20);
    org.junit.Assert.assertNotNull(nameValidator0);
    org.junit.Assert.assertNotNull(fieldArray2);
    org.junit.Assert.assertArrayEquals(fieldArray2, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    org.junit.Assert.assertNotNull(strSet7);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str8,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNotNull(fieldArray9);
    org.junit.Assert.assertArrayEquals(fieldArray9, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    org.junit.Assert.assertNotNull(schema12);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    org.junit.Assert.assertNotNull(strSet14);
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str15,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNull(field17);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    org.junit.Assert.assertNotNull(schema19);
    org.junit.Assert.assertNotNull(schema20);
    org.junit.Assert.assertNotNull(schema21);
  }

  @Test
  public void test08() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test08");
    org.apache.avro.Schema.Field[] fieldArray0 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList1 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList1,
        fieldArray0);
    org.apache.avro.Schema schema3 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
    String str4 = schema3.getName();
    org.apache.avro.NameValidator nameValidator5 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext6 = new org.apache.avro.ParseContext(nameValidator5);
    org.apache.avro.Schema.Field[] fieldArray7 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList8 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean9 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList8,
        fieldArray7);
    org.apache.avro.Schema schema10 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList8);
    boolean boolean11 = schema10.isNullable();
    java.util.Set<String> strSet12 = schema10.getAliases();
    String str13 = schema10.toString();
    org.apache.avro.Schema.Field[] fieldArray14 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList15 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList15,
        fieldArray14);
    org.apache.avro.Schema schema17 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList15);
    boolean boolean18 = schema17.isNullable();
    java.util.Set<String> strSet19 = schema17.getAliases();
    String str20 = schema17.toString();
    org.apache.avro.Schema.Field field22 = schema17.getField("long");
    boolean boolean23 = schema17.hasProps();
    org.apache.avro.Schema schema24 = org.apache.avro.Schema.applyAliases(schema10, schema17);
    org.apache.avro.Schema schema25 = parseContext6.resolve(schema24);
    org.apache.avro.Schema schema26 = org.apache.avro.Schema.applyAliases(schema3, schema24);
    String str28 = schema3.toString(false);
    org.junit.Assert.assertNotNull(fieldArray0);
    org.junit.Assert.assertArrayEquals(fieldArray0, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertNotNull(schema3);
    org.junit.Assert.assertNull(str4);
    org.junit.Assert.assertNotNull(nameValidator5);
    org.junit.Assert.assertNotNull(fieldArray7);
    org.junit.Assert.assertArrayEquals(fieldArray7, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    org.junit.Assert.assertNotNull(schema10);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    org.junit.Assert.assertNotNull(strSet12);
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str13,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNotNull(fieldArray14);
    org.junit.Assert.assertArrayEquals(fieldArray14, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    org.junit.Assert.assertNotNull(schema17);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    org.junit.Assert.assertNotNull(strSet19);
    org.junit.Assert.assertEquals("'" + str20 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str20,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNull(field22);
    org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    org.junit.Assert.assertNotNull(schema24);
    org.junit.Assert.assertNotNull(schema25);
    org.junit.Assert.assertNotNull(schema26);
    org.junit.Assert.assertEquals("'" + str28 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str28,
        "{\"type\":\"record\",\"fields\":[]}");
  }

  @Test
  public void test09() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test09");
    org.apache.avro.NameValidator nameValidator0 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext1 = new org.apache.avro.ParseContext(nameValidator0);
    org.apache.avro.Schema.Field[] fieldArray2 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList3 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList3,
        fieldArray2);
    org.apache.avro.Schema schema5 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList3);
    boolean boolean6 = schema5.isNullable();
    java.util.Set<String> strSet7 = schema5.getAliases();
    String str8 = schema5.toString();
    org.apache.avro.Schema.Field[] fieldArray9 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList10 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList10,
        fieldArray9);
    org.apache.avro.Schema schema12 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList10);
    boolean boolean13 = schema12.isNullable();
    java.util.Set<String> strSet14 = schema12.getAliases();
    String str15 = schema12.toString();
    org.apache.avro.Schema.Field field17 = schema12.getField("long");
    boolean boolean18 = schema12.hasProps();
    org.apache.avro.Schema schema19 = org.apache.avro.Schema.applyAliases(schema5, schema12);
    org.apache.avro.Schema schema20 = parseContext1.resolve(schema19);
    boolean boolean22 = schema19.propsContainsKey("");
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<org.apache.avro.Schema> schemaList23 = schema19.getTypes();
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a union: {\"type\":\"record\",\"fields\":[]}");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(nameValidator0);
    org.junit.Assert.assertNotNull(fieldArray2);
    org.junit.Assert.assertArrayEquals(fieldArray2, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    org.junit.Assert.assertNotNull(strSet7);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str8,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNotNull(fieldArray9);
    org.junit.Assert.assertArrayEquals(fieldArray9, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    org.junit.Assert.assertNotNull(schema12);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    org.junit.Assert.assertNotNull(strSet14);
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str15,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNull(field17);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    org.junit.Assert.assertNotNull(schema19);
    org.junit.Assert.assertNotNull(schema20);
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
  }

  @Test
  public void test10() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test10");
    org.apache.avro.NameValidator nameValidator0 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext1 = new org.apache.avro.ParseContext(nameValidator0);
    org.apache.avro.Schema.Field[] fieldArray2 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList3 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList3,
        fieldArray2);
    org.apache.avro.Schema schema5 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList3);
    org.apache.avro.SchemaParser.ParseResult parseResult6 = parseContext1.commit(schema5);
    org.apache.avro.Schema schema7 = org.apache.avro.Schema.createArray(schema5);
    org.junit.Assert.assertNotNull(nameValidator0);
    org.junit.Assert.assertNotNull(fieldArray2);
    org.junit.Assert.assertArrayEquals(fieldArray2, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertNotNull(parseResult6);
    org.junit.Assert.assertNotNull(schema7);
  }

  @Test
  public void test11() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test11");
    org.apache.avro.Schema.Field[] fieldArray0 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList1 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList1,
        fieldArray0);
    org.apache.avro.Schema schema3 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
    String str4 = schema3.getName();
    org.apache.avro.NameValidator nameValidator5 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext6 = new org.apache.avro.ParseContext(nameValidator5);
    org.apache.avro.Schema.Field[] fieldArray7 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList8 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean9 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList8,
        fieldArray7);
    org.apache.avro.Schema schema10 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList8);
    boolean boolean11 = schema10.isNullable();
    java.util.Set<String> strSet12 = schema10.getAliases();
    String str13 = schema10.toString();
    org.apache.avro.Schema.Field[] fieldArray14 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList15 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList15,
        fieldArray14);
    org.apache.avro.Schema schema17 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList15);
    boolean boolean18 = schema17.isNullable();
    java.util.Set<String> strSet19 = schema17.getAliases();
    String str20 = schema17.toString();
    org.apache.avro.Schema.Field field22 = schema17.getField("long");
    boolean boolean23 = schema17.hasProps();
    org.apache.avro.Schema schema24 = org.apache.avro.Schema.applyAliases(schema10, schema17);
    org.apache.avro.Schema schema25 = parseContext6.resolve(schema24);
    org.apache.avro.Schema schema26 = org.apache.avro.Schema.applyAliases(schema3, schema24);
    String str28 = schema24.toString(false);
    org.junit.Assert.assertNotNull(fieldArray0);
    org.junit.Assert.assertArrayEquals(fieldArray0, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertNotNull(schema3);
    org.junit.Assert.assertNull(str4);
    org.junit.Assert.assertNotNull(nameValidator5);
    org.junit.Assert.assertNotNull(fieldArray7);
    org.junit.Assert.assertArrayEquals(fieldArray7, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    org.junit.Assert.assertNotNull(schema10);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    org.junit.Assert.assertNotNull(strSet12);
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str13,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNotNull(fieldArray14);
    org.junit.Assert.assertArrayEquals(fieldArray14, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    org.junit.Assert.assertNotNull(schema17);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    org.junit.Assert.assertNotNull(strSet19);
    org.junit.Assert.assertEquals("'" + str20 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str20,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNull(field22);
    org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    org.junit.Assert.assertNotNull(schema24);
    org.junit.Assert.assertNotNull(schema25);
    org.junit.Assert.assertNotNull(schema26);
    org.junit.Assert.assertEquals("'" + str28 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str28,
        "{\"type\":\"record\",\"fields\":[]}");
  }

  @Test
  public void test12() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test12");
    org.apache.avro.NameValidator nameValidator0 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext1 = new org.apache.avro.ParseContext(nameValidator0);
    org.apache.avro.Schema.Field[] fieldArray2 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList3 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList3,
        fieldArray2);
    org.apache.avro.Schema schema5 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList3);
    boolean boolean6 = schema5.isNullable();
    java.util.Set<String> strSet7 = schema5.getAliases();
    String str8 = schema5.toString();
    org.apache.avro.Schema.Field[] fieldArray9 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList10 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList10,
        fieldArray9);
    org.apache.avro.Schema schema12 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList10);
    boolean boolean13 = schema12.isNullable();
    java.util.Set<String> strSet14 = schema12.getAliases();
    String str15 = schema12.toString();
    org.apache.avro.Schema.Field field17 = schema12.getField("long");
    boolean boolean18 = schema12.hasProps();
    org.apache.avro.Schema schema19 = org.apache.avro.Schema.applyAliases(schema5, schema12);
    org.apache.avro.Schema schema20 = parseContext1.resolve(schema19);
    org.apache.avro.Schema schema22 = parseContext1.getNamedSchema("{\"type\":\"record\",\"fields\":[]}");
    org.apache.avro.Schema schema24 = parseContext1.getNamedSchema("{\"type\":\"record\",\"fields\":[]}");
    org.apache.avro.Schema schema26 = parseContext1.getNamedSchema("");
    org.junit.Assert.assertNotNull(nameValidator0);
    org.junit.Assert.assertNotNull(fieldArray2);
    org.junit.Assert.assertArrayEquals(fieldArray2, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    org.junit.Assert.assertNotNull(strSet7);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str8,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNotNull(fieldArray9);
    org.junit.Assert.assertArrayEquals(fieldArray9, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    org.junit.Assert.assertNotNull(schema12);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    org.junit.Assert.assertNotNull(strSet14);
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str15,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNull(field17);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    org.junit.Assert.assertNotNull(schema19);
    org.junit.Assert.assertNotNull(schema20);
    org.junit.Assert.assertNull(schema22);
    org.junit.Assert.assertNull(schema24);
    org.junit.Assert.assertNull(schema26);
  }

  @Test
  public void test13() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test13");
    org.apache.avro.NameValidator nameValidator0 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext1 = new org.apache.avro.ParseContext(nameValidator0);
    org.apache.avro.Schema.Field[] fieldArray2 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList3 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList3,
        fieldArray2);
    org.apache.avro.Schema schema5 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList3);
    org.apache.avro.SchemaParser.ParseResult parseResult6 = parseContext1.commit(schema5);
    java.util.List<org.apache.avro.Schema> schemaList7 = parseContext1.resolveAllSchemas();
    org.apache.avro.Schema schema8 = org.apache.avro.Schema.createUnion(schemaList7);
    org.apache.avro.Schema schema9 = org.apache.avro.Schema.createUnion(schemaList7);
    org.junit.Assert.assertNotNull(nameValidator0);
    org.junit.Assert.assertNotNull(fieldArray2);
    org.junit.Assert.assertArrayEquals(fieldArray2, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertNotNull(parseResult6);
    org.junit.Assert.assertNotNull(schemaList7);
    org.junit.Assert.assertNotNull(schema8);
    org.junit.Assert.assertNotNull(schema9);
  }

  @Test
  public void test14() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test14");
    org.apache.avro.NameValidator nameValidator0 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext1 = new org.apache.avro.ParseContext(nameValidator0);
    org.apache.avro.Schema.Field[] fieldArray2 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList3 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList3,
        fieldArray2);
    org.apache.avro.Schema schema5 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList3);
    boolean boolean6 = schema5.isNullable();
    java.util.Set<String> strSet7 = schema5.getAliases();
    String str8 = schema5.toString();
    org.apache.avro.Schema.Field[] fieldArray9 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList10 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList10,
        fieldArray9);
    org.apache.avro.Schema schema12 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList10);
    boolean boolean13 = schema12.isNullable();
    java.util.Set<String> strSet14 = schema12.getAliases();
    String str15 = schema12.toString();
    org.apache.avro.Schema.Field field17 = schema12.getField("long");
    boolean boolean18 = schema12.hasProps();
    org.apache.avro.Schema schema19 = org.apache.avro.Schema.applyAliases(schema5, schema12);
    org.apache.avro.Schema schema20 = parseContext1.resolve(schema19);
    // The following exception was thrown during execution in test generation
    try {
      int int22 = schema20.getEnumOrdinal("long");
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: {\"type\":\"record\",\"fields\":[]}");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(nameValidator0);
    org.junit.Assert.assertNotNull(fieldArray2);
    org.junit.Assert.assertArrayEquals(fieldArray2, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    org.junit.Assert.assertNotNull(strSet7);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str8,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNotNull(fieldArray9);
    org.junit.Assert.assertArrayEquals(fieldArray9, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    org.junit.Assert.assertNotNull(schema12);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    org.junit.Assert.assertNotNull(strSet14);
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str15,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNull(field17);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    org.junit.Assert.assertNotNull(schema19);
    org.junit.Assert.assertNotNull(schema20);
  }

  @Test
  public void test15() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test15");
    org.apache.avro.NameValidator nameValidator0 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext1 = new org.apache.avro.ParseContext(nameValidator0);
    parseContext1.rollback();
    parseContext1.rollback();
    org.junit.Assert.assertNotNull(nameValidator0);
  }

  @Test
  public void test16() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test16");
    org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
    java.util.Map<String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
    org.apache.avro.Schema.Parser parser3 = parser0.setValidateDefaults(true);
    org.apache.avro.NameValidator nameValidator4 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext5 = new org.apache.avro.ParseContext(nameValidator4);
    org.apache.avro.Schema.Field[] fieldArray6 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList7 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList7,
        fieldArray6);
    org.apache.avro.Schema schema9 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList7);
    org.apache.avro.SchemaParser.ParseResult parseResult10 = parseContext5.commit(schema9);
    java.util.List<org.apache.avro.Schema> schemaList11 = parseContext5.resolveAllSchemas();
    org.apache.avro.Schema.Parser parser12 = parser3.addTypes((Iterable<org.apache.avro.Schema>) schemaList11);
    org.junit.Assert.assertNotNull(strMap1);
    org.junit.Assert.assertNotNull(parser3);
    org.junit.Assert.assertNotNull(nameValidator4);
    org.junit.Assert.assertNotNull(fieldArray6);
    org.junit.Assert.assertArrayEquals(fieldArray6, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    org.junit.Assert.assertNotNull(schema9);
    org.junit.Assert.assertNotNull(parseResult10);
    org.junit.Assert.assertNotNull(schemaList11);
    org.junit.Assert.assertNotNull(parser12);
  }

  @Test
  public void test17() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test17");
    org.apache.avro.ParseContext parseContext0 = new org.apache.avro.ParseContext();
    boolean boolean1 = parseContext0.hasNewSchemas();
    java.util.List<org.apache.avro.Schema> schemaList2 = parseContext0.resolveAllSchemas();
    org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser(parseContext0);
    org.apache.avro.Schema.Field[] fieldArray4 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList5 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList5,
        fieldArray4);
    org.apache.avro.Schema schema7 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList5);
    boolean boolean8 = schema7.isNullable();
    java.util.Set<String> strSet9 = schema7.getAliases();
    String str10 = schema7.toString();
    org.apache.avro.Schema.Field[] fieldArray11 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList12 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList12,
        fieldArray11);
    org.apache.avro.Schema schema14 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList12);
    boolean boolean15 = schema14.isNullable();
    java.util.Set<String> strSet16 = schema14.getAliases();
    String str17 = schema14.toString();
    org.apache.avro.Schema.Field field19 = schema14.getField("long");
    boolean boolean20 = schema14.hasProps();
    org.apache.avro.Schema schema21 = org.apache.avro.Schema.applyAliases(schema7, schema14);
    String str22 = schema14.getNamespace();
    org.apache.avro.SchemaParser.ParseResult parseResult23 = parseContext0.commit(schema14);
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    org.junit.Assert.assertNotNull(schemaList2);
    org.junit.Assert.assertNotNull(fieldArray4);
    org.junit.Assert.assertArrayEquals(fieldArray4, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    org.junit.Assert.assertNotNull(schema7);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    org.junit.Assert.assertNotNull(strSet9);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str10,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNotNull(fieldArray11);
    org.junit.Assert.assertArrayEquals(fieldArray11, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    org.junit.Assert.assertNotNull(schema14);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    org.junit.Assert.assertNotNull(strSet16);
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str17,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNull(field19);
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    org.junit.Assert.assertNotNull(schema21);
    org.junit.Assert.assertNull(str22);
    org.junit.Assert.assertNotNull(parseResult23);
  }

  @Test
  public void test18() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test18");
    org.apache.avro.ParseContext parseContext0 = new org.apache.avro.ParseContext();
    boolean boolean1 = parseContext0.hasNewSchemas();
    java.util.List<org.apache.avro.Schema> schemaList2 = parseContext0.resolveAllSchemas();
    org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser(parseContext0);
    org.apache.avro.Schema.Field[] fieldArray4 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList5 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList5,
        fieldArray4);
    org.apache.avro.Schema schema7 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList5);
    boolean boolean9 = schema7.propsContainsKey("{\"type\":\"record\",\"fields\":[]}");
    com.fasterxml.jackson.databind.JsonNode jsonNode10 = null;
    boolean boolean11 = schema7.isValidDefault(jsonNode10);
    org.apache.avro.Schema.Type type12 = schema7.getType();
    // The following exception was thrown during execution in test generation
    try {
      parseContext0.put(schema7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"String.split(String)\" because \"fullName\" is null");
    } catch (NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    org.junit.Assert.assertNotNull(schemaList2);
    org.junit.Assert.assertNotNull(fieldArray4);
    org.junit.Assert.assertArrayEquals(fieldArray4, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    org.junit.Assert.assertNotNull(schema7);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    org.junit.Assert.assertTrue("'" + type12 + "' != '" + org.apache.avro.Schema.Type.RECORD + "'",
        type12.equals(org.apache.avro.Schema.Type.RECORD));
  }

  @Test
  public void test19() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test19");
    org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
    java.util.Map<String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
    org.apache.avro.Schema.Parser parser2 = new org.apache.avro.Schema.Parser();
    java.util.Map<String, org.apache.avro.Schema> strMap3 = parser2.getTypes();
    org.apache.avro.Schema.Parser parser4 = parser0.addTypes(strMap3);
    org.apache.avro.Schema.Parser parser6 = parser0.setValidateDefaults(true);
    org.apache.avro.ParseContext parseContext7 = new org.apache.avro.ParseContext();
    boolean boolean8 = parseContext7.hasNewSchemas();
    java.util.List<org.apache.avro.Schema> schemaList9 = parseContext7.resolveAllSchemas();
    org.apache.avro.Schema.Parser parser10 = parser0.addTypes((Iterable<org.apache.avro.Schema>) schemaList9);
    boolean boolean11 = parser10.getValidateDefaults();
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema13 = parser10.parseInternal("record");
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.SchemaParseException; message: com.fasterxml.jackson.core.JsonParseException: Unrecognized token 'record': was expecting (JSON String, Number, Array, Object or token 'null', 'true' or 'false')? at [Source: REDACTED (`StreamReadFeature.INCLUDE_SOURCE_IN_LOCATION` disabled); line: 1, column: 1]");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(strMap1);
    org.junit.Assert.assertNotNull(strMap3);
    org.junit.Assert.assertNotNull(parser4);
    org.junit.Assert.assertNotNull(parser6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    org.junit.Assert.assertNotNull(schemaList9);
    org.junit.Assert.assertNotNull(parser10);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
  }

  @Test
  public void test20() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test20");
    org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
    java.util.Map<String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
    org.apache.avro.Schema.Parser parser2 = new org.apache.avro.Schema.Parser();
    java.util.Map<String, org.apache.avro.Schema> strMap3 = parser2.getTypes();
    org.apache.avro.Schema.Parser parser4 = parser0.addTypes(strMap3);
    org.apache.avro.Schema.Parser parser6 = parser0.setValidateDefaults(true);
    org.apache.avro.ParseContext parseContext7 = new org.apache.avro.ParseContext();
    boolean boolean8 = parseContext7.hasNewSchemas();
    java.util.List<org.apache.avro.Schema> schemaList9 = parseContext7.resolveAllSchemas();
    org.apache.avro.Schema.Parser parser10 = parser0.addTypes((Iterable<org.apache.avro.Schema>) schemaList9);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema12 = parser10
          .parse("{\"type\":\"record\",\"fields\":[],\"long type:RECORD pos:-1\":\"long type:RECORD pos:-1\"}");
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.SchemaParseException; message: No name in schema: {\"type\":\"record\",\"fields\":[],\"long type:RECORD pos:-1\":\"long type:RECORD pos:-1\"}");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(strMap1);
    org.junit.Assert.assertNotNull(strMap3);
    org.junit.Assert.assertNotNull(parser4);
    org.junit.Assert.assertNotNull(parser6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    org.junit.Assert.assertNotNull(schemaList9);
    org.junit.Assert.assertNotNull(parser10);
  }

  @Test
  public void test21() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test21");
    org.apache.avro.NameValidator nameValidator0 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.Schema.Parser parser1 = new org.apache.avro.Schema.Parser(nameValidator0);
    org.apache.avro.Schema.Parser parser2 = new org.apache.avro.Schema.Parser(nameValidator0);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.ParseContext parseContext3 = new org.apache.avro.ParseContext(nameValidator0);
// flaky "1) test21(RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    } catch (NullPointerException e) {
      // Expected exception.
    }
// flaky "1) test21(RegressionTest0)":         org.junit.Assert.assertNull(nameValidator0);
  }

  @Test
  public void test22() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test22");
    org.apache.avro.Schema.Field[] fieldArray0 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList1 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList1,
        fieldArray0);
    org.apache.avro.Schema schema3 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
    boolean boolean4 = schema3.isUnion();
    org.apache.avro.Schema schema5 = org.apache.avro.Schema.createArray(schema3);
    org.apache.avro.ParseContext parseContext7 = new org.apache.avro.ParseContext();
    boolean boolean8 = parseContext7.hasNewSchemas();
    java.util.List<org.apache.avro.Schema> schemaList9 = parseContext7.resolveAllSchemas();
    org.apache.avro.Schema.Parser parser10 = new org.apache.avro.Schema.Parser(parseContext7);
    // The following exception was thrown during execution in test generation
    try {
      schema5.addProp("{\"type\":\"record\",\"fields\":[]}", (Object) parseContext7);
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Unknown datum class: class org.apache.avro.ParseContext");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(fieldArray0);
    org.junit.Assert.assertArrayEquals(fieldArray0, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertNotNull(schema3);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    org.junit.Assert.assertNotNull(schemaList9);
  }

  @Test
  public void test23() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test23");
    org.apache.avro.ParseContext parseContext0 = new org.apache.avro.ParseContext();
    boolean boolean1 = parseContext0.hasNewSchemas();
    java.util.List<org.apache.avro.Schema> schemaList2 = parseContext0.resolveAllSchemas();
    org.apache.avro.Schema schema3 = org.apache.avro.Schema.createUnion(schemaList2);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema4 = schema3.getElementType();
      org.junit.Assert
          .fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an array: []");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    org.junit.Assert.assertNotNull(schemaList2);
    org.junit.Assert.assertNotNull(schema3);
  }

  @Test
  public void test24() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test24");
    org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
    java.util.Map<String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
    org.apache.avro.Schema.Parser parser2 = new org.apache.avro.Schema.Parser();
    java.util.Map<String, org.apache.avro.Schema> strMap3 = parser2.getTypes();
    org.apache.avro.Schema.Parser parser4 = parser0.addTypes(strMap3);
    org.apache.avro.Schema.Parser parser6 = parser0.setValidateDefaults(true);
    org.apache.avro.ParseContext parseContext7 = new org.apache.avro.ParseContext();
    boolean boolean8 = parseContext7.hasNewSchemas();
    java.util.List<org.apache.avro.Schema> schemaList9 = parseContext7.resolveAllSchemas();
    org.apache.avro.Schema.Parser parser10 = parser0.addTypes((Iterable<org.apache.avro.Schema>) schemaList9);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema12 = parser0.parse("");
      org.junit.Assert
          .fail("Expected exception of type org.apache.avro.SchemaParseException; message: Cannot parse <null> schema");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(strMap1);
    org.junit.Assert.assertNotNull(strMap3);
    org.junit.Assert.assertNotNull(parser4);
    org.junit.Assert.assertNotNull(parser6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    org.junit.Assert.assertNotNull(schemaList9);
    org.junit.Assert.assertNotNull(parser10);
  }

  @Test
  public void test25() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test25");
    org.apache.avro.ParseContext parseContext0 = new org.apache.avro.ParseContext();
    boolean boolean1 = parseContext0.hasNewSchemas();
    java.util.Map<String, org.apache.avro.Schema> strMap2 = parseContext0.typesByName();
    boolean boolean4 = parseContext0.contains("record");
    org.apache.avro.Schema.Parser parser5 = new org.apache.avro.Schema.Parser(parseContext0);
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    org.junit.Assert.assertNotNull(strMap2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
  }

  @Test
  public void test26() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test26");
    org.apache.avro.ParseContext parseContext0 = new org.apache.avro.ParseContext();
    boolean boolean1 = parseContext0.hasNewSchemas();
    org.apache.avro.Schema schema3 = parseContext0.getNamedSchema("boolean");
    org.apache.avro.Schema.Field[] fieldArray4 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList5 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList5,
        fieldArray4);
    org.apache.avro.Schema schema7 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList5);
    boolean boolean9 = schema7.equals((Object) 1.0f);
    org.apache.avro.Schema.Type type10 = schema7.getType();
    org.apache.avro.LogicalType logicalType11 = schema7.getLogicalType();
    String str12 = schema7.getFullName();
    org.apache.avro.Schema schema13 = parseContext0.resolve(schema7);
    // The following exception was thrown during execution in test generation
    try {
      Integer int15 = schema7.getIndexNamed("fixed");
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a union: {\"type\":\"record\",\"fields\":[]}");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    org.junit.Assert.assertNull(schema3);
    org.junit.Assert.assertNotNull(fieldArray4);
    org.junit.Assert.assertArrayEquals(fieldArray4, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    org.junit.Assert.assertNotNull(schema7);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    org.junit.Assert.assertTrue("'" + type10 + "' != '" + org.apache.avro.Schema.Type.RECORD + "'",
        type10.equals(org.apache.avro.Schema.Type.RECORD));
    org.junit.Assert.assertNull(logicalType11);
    org.junit.Assert.assertNull(str12);
    org.junit.Assert.assertNotNull(schema13);
  }

  @Test
  public void test27() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test27");
    org.apache.avro.NameValidator nameValidator0 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.Schema.Parser parser1 = new org.apache.avro.Schema.Parser(nameValidator0);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.ParseContext parseContext2 = new org.apache.avro.ParseContext(nameValidator0);
// flaky "2) test27(RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    } catch (NullPointerException e) {
      // Expected exception.
    }
// flaky "2) test27(RegressionTest0)":         org.junit.Assert.assertNull(nameValidator0);
  }

  @Test
  public void test28() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test28");
    org.apache.avro.ParseContext parseContext0 = new org.apache.avro.ParseContext();
    boolean boolean1 = parseContext0.hasNewSchemas();
    java.util.List<org.apache.avro.Schema> schemaList2 = parseContext0.resolveAllSchemas();
    org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser(parseContext0);
    org.apache.avro.Schema.Parser parser5 = parser3.setValidateDefaults(true);
    java.io.File file6 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema7 = parser3.parse(file6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    } catch (NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    org.junit.Assert.assertNotNull(schemaList2);
    org.junit.Assert.assertNotNull(parser5);
  }

  @Test
  public void test29() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test29");
    org.apache.avro.ParseContext parseContext0 = new org.apache.avro.ParseContext();
    boolean boolean1 = parseContext0.hasNewSchemas();
    java.util.Map<String, org.apache.avro.Schema> strMap2 = parseContext0.typesByName();
    org.apache.avro.Schema.Field[] fieldArray3 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList4 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList4,
        fieldArray3);
    org.apache.avro.Schema schema6 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList4);
    boolean boolean7 = schema6.isNullable();
    java.util.Set<String> strSet8 = schema6.getAliases();
    String str9 = schema6.toString();
    org.apache.avro.Schema.Field field11 = schema6.getField("long");
    java.util.List<org.apache.avro.Schema.Field> fieldList12 = schema6.getFields();
    boolean boolean14 = schema6.equals((Object) "long type:RECORD pos:-1");
    java.util.List<org.apache.avro.Schema.Field> fieldList15 = schema6.getFields();
    Object obj17 = null;
    Object obj18 = schema6.getObjectProp("", obj17);
    org.apache.avro.Schema schema19 = parseContext0.resolve(schema6);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema22 = parseContext0.find("", "long type:RECORD pos:-1");
// flaky "3) test29(RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.avro.NameValidator.validate(String)\" because the return value of \"java.lang.ThreadLocal.get()\" is null");
    } catch (NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    org.junit.Assert.assertNotNull(strMap2);
    org.junit.Assert.assertNotNull(fieldArray3);
    org.junit.Assert.assertArrayEquals(fieldArray3, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    org.junit.Assert.assertNotNull(schema6);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertNotNull(strSet8);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str9,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNull(field11);
    org.junit.Assert.assertNotNull(fieldList12);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    org.junit.Assert.assertNotNull(fieldList15);
    org.junit.Assert.assertNull(obj18);
    org.junit.Assert.assertNotNull(schema19);
  }

  @Test
  public void test30() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test30");
    org.apache.avro.ParseContext parseContext0 = new org.apache.avro.ParseContext();
    boolean boolean1 = parseContext0.hasNewSchemas();
    org.apache.avro.Schema schema3 = parseContext0.getNamedSchema("boolean");
    org.apache.avro.Schema.Field[] fieldArray4 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList5 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList5,
        fieldArray4);
    org.apache.avro.Schema schema7 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList5);
    boolean boolean9 = schema7.equals((Object) 1.0f);
    org.apache.avro.Schema.Type type10 = schema7.getType();
    org.apache.avro.LogicalType logicalType11 = schema7.getLogicalType();
    String str12 = schema7.getFullName();
    org.apache.avro.Schema schema13 = parseContext0.resolve(schema7);
    boolean boolean15 = schema7.propsContainsKey(
        "{\"type\":\"record\",\"fields\":[],\"long type:RECORD pos:-1\":\"long type:RECORD pos:-1\"}");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    org.junit.Assert.assertNull(schema3);
    org.junit.Assert.assertNotNull(fieldArray4);
    org.junit.Assert.assertArrayEquals(fieldArray4, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    org.junit.Assert.assertNotNull(schema7);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    org.junit.Assert.assertTrue("'" + type10 + "' != '" + org.apache.avro.Schema.Type.RECORD + "'",
        type10.equals(org.apache.avro.Schema.Type.RECORD));
    org.junit.Assert.assertNull(logicalType11);
    org.junit.Assert.assertNull(str12);
    org.junit.Assert.assertNotNull(schema13);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
  }

  @Test
  public void test31() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test31");
    org.apache.avro.ParseContext parseContext0 = new org.apache.avro.ParseContext();
    boolean boolean1 = parseContext0.hasNewSchemas();
    org.apache.avro.Schema schema3 = parseContext0.getNamedSchema("boolean");
    org.apache.avro.Schema.Field[] fieldArray4 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList5 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList5,
        fieldArray4);
    org.apache.avro.Schema schema7 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList5);
    boolean boolean9 = schema7.equals((Object) 1.0f);
    org.apache.avro.Schema.Type type10 = schema7.getType();
    org.apache.avro.LogicalType logicalType11 = schema7.getLogicalType();
    String str12 = schema7.getFullName();
    org.apache.avro.Schema schema13 = parseContext0.resolve(schema7);
    org.apache.avro.Schema.Field[] fieldArray14 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList15 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList15,
        fieldArray14);
    org.apache.avro.Schema schema17 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList15);
    boolean boolean18 = schema17.isNullable();
    java.util.Set<String> strSet19 = schema17.getAliases();
    String str20 = schema17.toString();
    org.apache.avro.Schema.Field field22 = schema17.getField("long");
    java.util.List<org.apache.avro.Schema.Field> fieldList23 = schema17.getFields();
    org.apache.avro.Schema schema24 = parseContext0.resolve(schema17);
    schema24.addProp("long type:RECORD pos:-1", "record");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    org.junit.Assert.assertNull(schema3);
    org.junit.Assert.assertNotNull(fieldArray4);
    org.junit.Assert.assertArrayEquals(fieldArray4, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    org.junit.Assert.assertNotNull(schema7);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    org.junit.Assert.assertTrue("'" + type10 + "' != '" + org.apache.avro.Schema.Type.RECORD + "'",
        type10.equals(org.apache.avro.Schema.Type.RECORD));
    org.junit.Assert.assertNull(logicalType11);
    org.junit.Assert.assertNull(str12);
    org.junit.Assert.assertNotNull(schema13);
    org.junit.Assert.assertNotNull(fieldArray14);
    org.junit.Assert.assertArrayEquals(fieldArray14, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    org.junit.Assert.assertNotNull(schema17);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    org.junit.Assert.assertNotNull(strSet19);
    org.junit.Assert.assertEquals("'" + str20 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str20,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNull(field22);
    org.junit.Assert.assertNotNull(fieldList23);
    org.junit.Assert.assertNotNull(schema24);
  }

  @Test
  public void test32() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test32");
    org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
    java.util.Map<String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
    org.apache.avro.Schema.Parser parser2 = new org.apache.avro.Schema.Parser();
    java.util.Map<String, org.apache.avro.Schema> strMap3 = parser2.getTypes();
    org.apache.avro.Schema.Parser parser4 = parser0.addTypes(strMap3);
    org.apache.avro.Schema.Parser parser6 = parser0.setValidateDefaults(true);
    org.apache.avro.ParseContext parseContext7 = new org.apache.avro.ParseContext();
    boolean boolean8 = parseContext7.hasNewSchemas();
    java.util.List<org.apache.avro.Schema> schemaList9 = parseContext7.resolveAllSchemas();
    org.apache.avro.Schema.Parser parser10 = parser0.addTypes((Iterable<org.apache.avro.Schema>) schemaList9);
    boolean boolean11 = parser10.getValidateDefaults();
    java.io.InputStream inputStream12 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema13 = parser10.parse(inputStream12);
      org.junit.Assert
          .fail("Expected exception of type org.apache.avro.SchemaParseException; message: Cannot parse <null> schema");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(strMap1);
    org.junit.Assert.assertNotNull(strMap3);
    org.junit.Assert.assertNotNull(parser4);
    org.junit.Assert.assertNotNull(parser6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    org.junit.Assert.assertNotNull(schemaList9);
    org.junit.Assert.assertNotNull(parser10);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
  }

  @Test
  public void test33() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test33");
    org.apache.avro.ParseContext parseContext0 = new org.apache.avro.ParseContext();
    boolean boolean1 = parseContext0.hasNewSchemas();
    org.apache.avro.Schema schema3 = parseContext0.getNamedSchema("boolean");
    org.apache.avro.Schema.Field[] fieldArray4 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList5 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList5,
        fieldArray4);
    org.apache.avro.Schema schema7 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList5);
    boolean boolean9 = schema7.equals((Object) 1.0f);
    org.apache.avro.Schema.Type type10 = schema7.getType();
    org.apache.avro.LogicalType logicalType11 = schema7.getLogicalType();
    String str12 = schema7.getFullName();
    org.apache.avro.Schema schema13 = parseContext0.resolve(schema7);
    java.util.Map<String, org.apache.avro.Schema> strMap14 = parseContext0.typesByName();
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    org.junit.Assert.assertNull(schema3);
    org.junit.Assert.assertNotNull(fieldArray4);
    org.junit.Assert.assertArrayEquals(fieldArray4, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    org.junit.Assert.assertNotNull(schema7);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    org.junit.Assert.assertTrue("'" + type10 + "' != '" + org.apache.avro.Schema.Type.RECORD + "'",
        type10.equals(org.apache.avro.Schema.Type.RECORD));
    org.junit.Assert.assertNull(logicalType11);
    org.junit.Assert.assertNull(str12);
    org.junit.Assert.assertNotNull(schema13);
    org.junit.Assert.assertNotNull(strMap14);
  }

  @Test
  public void test34() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test34");
    org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
    java.util.Map<String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
    org.apache.avro.Schema.Parser parser2 = new org.apache.avro.Schema.Parser();
    java.util.Map<String, org.apache.avro.Schema> strMap3 = parser2.getTypes();
    org.apache.avro.Schema.Parser parser4 = parser0.addTypes(strMap3);
    org.apache.avro.Schema.Parser parser6 = parser0.setValidateDefaults(true);
    org.apache.avro.ParseContext parseContext7 = new org.apache.avro.ParseContext();
    boolean boolean8 = parseContext7.hasNewSchemas();
    java.util.List<org.apache.avro.Schema> schemaList9 = parseContext7.resolveAllSchemas();
    org.apache.avro.Schema.Parser parser10 = parser0.addTypes((Iterable<org.apache.avro.Schema>) schemaList9);
    org.apache.avro.Schema.Parser parser12 = parser10.setValidateDefaults(true);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema14 = parser12.parseInternal("long");
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.SchemaParseException; message: com.fasterxml.jackson.core.JsonParseException: Unrecognized token 'long': was expecting (JSON String, Number, Array, Object or token 'null', 'true' or 'false')? at [Source: REDACTED (`StreamReadFeature.INCLUDE_SOURCE_IN_LOCATION` disabled); line: 1, column: 1]");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(strMap1);
    org.junit.Assert.assertNotNull(strMap3);
    org.junit.Assert.assertNotNull(parser4);
    org.junit.Assert.assertNotNull(parser6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    org.junit.Assert.assertNotNull(schemaList9);
    org.junit.Assert.assertNotNull(parser10);
    org.junit.Assert.assertNotNull(parser12);
  }

  @Test
  public void test35() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test35");
    org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
    java.util.Map<String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
    org.apache.avro.Schema.Parser parser2 = new org.apache.avro.Schema.Parser();
    java.util.Map<String, org.apache.avro.Schema> strMap3 = parser2.getTypes();
    org.apache.avro.Schema.Parser parser4 = parser0.addTypes(strMap3);
    org.apache.avro.Schema.Parser parser6 = parser0.setValidateDefaults(true);
    org.apache.avro.ParseContext parseContext7 = new org.apache.avro.ParseContext();
    boolean boolean8 = parseContext7.hasNewSchemas();
    java.util.List<org.apache.avro.Schema> schemaList9 = parseContext7.resolveAllSchemas();
    org.apache.avro.Schema.Parser parser10 = parser0.addTypes((Iterable<org.apache.avro.Schema>) schemaList9);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema12 = parser0.parseInternal("{\"type\":\"record\",\"fields\":[]}");
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.SchemaParseException; message: No name in schema: {\"type\":\"record\",\"fields\":[]}");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(strMap1);
    org.junit.Assert.assertNotNull(strMap3);
    org.junit.Assert.assertNotNull(parser4);
    org.junit.Assert.assertNotNull(parser6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    org.junit.Assert.assertNotNull(schemaList9);
    org.junit.Assert.assertNotNull(parser10);
  }

  @Test
  public void test36() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test36");
    org.apache.avro.ParseContext parseContext0 = new org.apache.avro.ParseContext();
    boolean boolean1 = parseContext0.hasNewSchemas();
    java.util.List<org.apache.avro.Schema> schemaList2 = parseContext0.resolveAllSchemas();
    org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser(parseContext0);
    org.apache.avro.Schema schema5 = parseContext0
        .getNamedSchema("{\"type\":\"record\",\"fields\":[],\"long type:RECORD pos:-1\":\"long type:RECORD pos:-1\"}");
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    org.junit.Assert.assertNotNull(schemaList2);
    org.junit.Assert.assertNull(schema5);
  }

  @Test
  public void test37() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test37");
    org.apache.avro.ParseContext parseContext0 = new org.apache.avro.ParseContext();
    org.apache.avro.Schema schema2 = parseContext0.getNamedSchema("hi!");
    org.apache.avro.Schema schema4 = parseContext0.getNamedSchema("");
    java.util.List<org.apache.avro.Schema> schemaList5 = parseContext0.resolveAllSchemas();
    org.apache.avro.Schema schema7 = parseContext0.getNamedSchema("fixed");
    org.junit.Assert.assertNull(schema2);
    org.junit.Assert.assertNull(schema4);
    org.junit.Assert.assertNotNull(schemaList5);
    org.junit.Assert.assertNull(schema7);
  }

  @Test
  public void test38() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test38");
    org.apache.avro.ParseContext parseContext0 = new org.apache.avro.ParseContext();
    boolean boolean1 = parseContext0.hasNewSchemas();
    java.util.Map<String, org.apache.avro.Schema> strMap2 = parseContext0.typesByName();
    org.apache.avro.Schema.Field[] fieldArray3 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList4 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList4,
        fieldArray3);
    org.apache.avro.Schema schema6 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList4);
    boolean boolean7 = schema6.isNullable();
    java.util.Set<String> strSet8 = schema6.getAliases();
    String str9 = schema6.toString();
    org.apache.avro.Schema.Field field11 = schema6.getField("long");
    java.util.List<org.apache.avro.Schema.Field> fieldList12 = schema6.getFields();
    boolean boolean14 = schema6.equals((Object) "long type:RECORD pos:-1");
    java.util.List<org.apache.avro.Schema.Field> fieldList15 = schema6.getFields();
    Object obj17 = null;
    Object obj18 = schema6.getObjectProp("", obj17);
    org.apache.avro.Schema schema19 = parseContext0.resolve(schema6);
    parseContext0.commit();
    java.util.List<org.apache.avro.Schema> schemaList21 = parseContext0.resolveAllSchemas();
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    org.junit.Assert.assertNotNull(strMap2);
    org.junit.Assert.assertNotNull(fieldArray3);
    org.junit.Assert.assertArrayEquals(fieldArray3, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    org.junit.Assert.assertNotNull(schema6);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertNotNull(strSet8);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str9,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNull(field11);
    org.junit.Assert.assertNotNull(fieldList12);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    org.junit.Assert.assertNotNull(fieldList15);
    org.junit.Assert.assertNull(obj18);
    org.junit.Assert.assertNotNull(schema19);
    org.junit.Assert.assertNotNull(schemaList21);
  }

  @Test
  public void test39() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test39");
    org.apache.avro.NameValidator nameValidator0 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.Schema.Parser parser1 = new org.apache.avro.Schema.Parser(nameValidator0);
    org.apache.avro.Schema.setNameValidator(nameValidator0);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.ParseContext parseContext3 = new org.apache.avro.ParseContext(nameValidator0);
// flaky "4) test39(RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    } catch (NullPointerException e) {
      // Expected exception.
    }
// flaky "3) test39(RegressionTest0)":         org.junit.Assert.assertNull(nameValidator0);
  }

  @Test
  public void test40() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test40");
    org.apache.avro.ParseContext parseContext0 = new org.apache.avro.ParseContext();
    boolean boolean1 = parseContext0.hasNewSchemas();
    java.util.Map<String, org.apache.avro.Schema> strMap2 = parseContext0.typesByName();
    org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser(parseContext0);
    java.io.File file4 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema5 = parser3.parse(file4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    } catch (NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    org.junit.Assert.assertNotNull(strMap2);
  }

  @Test
  public void test41() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test41");
    org.apache.avro.ParseContext parseContext0 = new org.apache.avro.ParseContext();
    boolean boolean1 = parseContext0.hasNewSchemas();
    java.util.Map<String, org.apache.avro.Schema> strMap2 = parseContext0.typesByName();
    org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser(parseContext0);
    org.apache.avro.ParseContext parseContext4 = new org.apache.avro.ParseContext();
    org.apache.avro.Schema.Field[] fieldArray5 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList6 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList6,
        fieldArray5);
    org.apache.avro.Schema schema8 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList6);
    boolean boolean9 = schema8.isNullable();
    java.util.Set<String> strSet10 = schema8.getAliases();
    com.fasterxml.jackson.databind.JsonNode jsonNode11 = null;
    boolean boolean12 = schema8.isValidDefault(jsonNode11);
    String str13 = schema8.getDoc();
    org.apache.avro.Schema schema14 = org.apache.avro.Schema.createMap(schema8);
    boolean boolean15 = schema8.isError();
    org.apache.avro.Schema.Type type16 = schema8.getType();
    org.apache.avro.Schema schema17 = parseContext4.resolve(schema8);
    // The following exception was thrown during execution in test generation
    try {
      parseContext0.put(schema17);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"String.split(String)\" because \"fullName\" is null");
    } catch (NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    org.junit.Assert.assertNotNull(strMap2);
    org.junit.Assert.assertNotNull(fieldArray5);
    org.junit.Assert.assertArrayEquals(fieldArray5, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertNotNull(schema8);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    org.junit.Assert.assertNotNull(strSet10);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    org.junit.Assert.assertNull(str13);
    org.junit.Assert.assertNotNull(schema14);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    org.junit.Assert.assertTrue("'" + type16 + "' != '" + org.apache.avro.Schema.Type.RECORD + "'",
        type16.equals(org.apache.avro.Schema.Type.RECORD));
    org.junit.Assert.assertNotNull(schema17);
  }

  @Test
  public void test42() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test42");
    org.apache.avro.ParseContext parseContext0 = new org.apache.avro.ParseContext();
    org.apache.avro.Schema.Field[] fieldArray1 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList2 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList2,
        fieldArray1);
    org.apache.avro.Schema schema4 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList2);
    boolean boolean5 = schema4.isNullable();
    java.util.Set<String> strSet6 = schema4.getAliases();
    com.fasterxml.jackson.databind.JsonNode jsonNode7 = null;
    boolean boolean8 = schema4.isValidDefault(jsonNode7);
    String str9 = schema4.getDoc();
    org.apache.avro.Schema schema10 = org.apache.avro.Schema.createMap(schema4);
    boolean boolean11 = schema4.isError();
    org.apache.avro.Schema.Type type12 = schema4.getType();
    org.apache.avro.Schema schema13 = parseContext0.resolve(schema4);
    boolean boolean15 = parseContext0.contains("long");
    org.junit.Assert.assertNotNull(fieldArray1);
    org.junit.Assert.assertArrayEquals(fieldArray1, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    org.junit.Assert.assertNotNull(schema4);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    org.junit.Assert.assertNotNull(strSet6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    org.junit.Assert.assertNull(str9);
    org.junit.Assert.assertNotNull(schema10);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    org.junit.Assert.assertTrue("'" + type12 + "' != '" + org.apache.avro.Schema.Type.RECORD + "'",
        type12.equals(org.apache.avro.Schema.Type.RECORD));
    org.junit.Assert.assertNotNull(schema13);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
  }

  @Test
  public void test43() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test43");
    org.apache.avro.ParseContext parseContext0 = new org.apache.avro.ParseContext();
    boolean boolean1 = parseContext0.hasNewSchemas();
    java.util.List<org.apache.avro.Schema> schemaList2 = parseContext0.resolveAllSchemas();
    org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser(parseContext0);
    org.apache.avro.Schema.Parser parser5 = parser3.setValidateDefaults(true);
    boolean boolean6 = parser3.getValidateDefaults();
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    org.junit.Assert.assertNotNull(schemaList2);
    org.junit.Assert.assertNotNull(parser5);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
  }

  @Test
  public void test44() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test44");
    org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
    java.util.Map<String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
    org.apache.avro.Schema.Parser parser2 = new org.apache.avro.Schema.Parser();
    java.util.Map<String, org.apache.avro.Schema> strMap3 = parser2.getTypes();
    org.apache.avro.Schema.Parser parser4 = parser0.addTypes(strMap3);
    org.apache.avro.Schema.Field[] fieldArray5 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList6 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList6,
        fieldArray5);
    org.apache.avro.Schema schema8 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList6);
    boolean boolean9 = schema8.isNullable();
    java.util.Set<String> strSet10 = schema8.getAliases();
    String str11 = schema8.toString();
    org.apache.avro.Schema.Field field13 = schema8.getField("long");
    boolean boolean14 = schema8.isError();
    org.apache.avro.Schema.Parser parser15 = new org.apache.avro.Schema.Parser();
    java.util.Map<String, org.apache.avro.Schema> strMap16 = parser15.getTypes();
    org.apache.avro.Schema.Parser parser17 = new org.apache.avro.Schema.Parser();
    java.util.Map<String, org.apache.avro.Schema> strMap18 = parser17.getTypes();
    org.apache.avro.Schema.Parser parser19 = parser15.addTypes(strMap18);
    org.apache.avro.Schema.Parser parser21 = parser15.setValidateDefaults(true);
    org.apache.avro.ParseContext parseContext22 = new org.apache.avro.ParseContext();
    boolean boolean23 = parseContext22.hasNewSchemas();
    java.util.List<org.apache.avro.Schema> schemaList24 = parseContext22.resolveAllSchemas();
    org.apache.avro.Schema.Parser parser25 = parser15.addTypes((Iterable<org.apache.avro.Schema>) schemaList24);
    String str27 = schema8.toString((java.util.Collection<org.apache.avro.Schema>) schemaList24, false);
    org.apache.avro.Schema.Parser parser28 = parser4.addTypes((Iterable<org.apache.avro.Schema>) schemaList24);
    org.apache.avro.Schema.Parser parser30 = parser4.setValidateDefaults(false);
    org.junit.Assert.assertNotNull(strMap1);
    org.junit.Assert.assertNotNull(strMap3);
    org.junit.Assert.assertNotNull(parser4);
    org.junit.Assert.assertNotNull(fieldArray5);
    org.junit.Assert.assertArrayEquals(fieldArray5, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertNotNull(schema8);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    org.junit.Assert.assertNotNull(strSet10);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str11,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNull(field13);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    org.junit.Assert.assertNotNull(strMap16);
    org.junit.Assert.assertNotNull(strMap18);
    org.junit.Assert.assertNotNull(parser19);
    org.junit.Assert.assertNotNull(parser21);
    org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    org.junit.Assert.assertNotNull(schemaList24);
    org.junit.Assert.assertNotNull(parser25);
    org.junit.Assert.assertEquals("'" + str27 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str27,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNotNull(parser28);
    org.junit.Assert.assertNotNull(parser30);
  }

  @Test
  public void test45() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test45");
    org.apache.avro.ParseContext parseContext0 = new org.apache.avro.ParseContext();
    boolean boolean1 = parseContext0.hasNewSchemas();
    java.util.Map<String, org.apache.avro.Schema> strMap2 = parseContext0.typesByName();
    org.apache.avro.Schema.Field[] fieldArray3 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList4 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList4,
        fieldArray3);
    org.apache.avro.Schema schema6 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList4);
    boolean boolean7 = schema6.isNullable();
    java.util.Set<String> strSet8 = schema6.getAliases();
    String str9 = schema6.toString();
    org.apache.avro.Schema.Field field11 = schema6.getField("long");
    java.util.List<org.apache.avro.Schema.Field> fieldList12 = schema6.getFields();
    boolean boolean14 = schema6.equals((Object) "long type:RECORD pos:-1");
    java.util.List<org.apache.avro.Schema.Field> fieldList15 = schema6.getFields();
    Object obj17 = null;
    Object obj18 = schema6.getObjectProp("", obj17);
    org.apache.avro.Schema schema19 = parseContext0.resolve(schema6);
    parseContext0.rollback();
    parseContext0.commit();
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    org.junit.Assert.assertNotNull(strMap2);
    org.junit.Assert.assertNotNull(fieldArray3);
    org.junit.Assert.assertArrayEquals(fieldArray3, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    org.junit.Assert.assertNotNull(schema6);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertNotNull(strSet8);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str9,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNull(field11);
    org.junit.Assert.assertNotNull(fieldList12);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    org.junit.Assert.assertNotNull(fieldList15);
    org.junit.Assert.assertNull(obj18);
    org.junit.Assert.assertNotNull(schema19);
  }

  @Test
  public void test46() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test46");
    org.apache.avro.ParseContext parseContext0 = new org.apache.avro.ParseContext();
    boolean boolean1 = parseContext0.hasNewSchemas();
    org.apache.avro.Schema schema3 = parseContext0.getNamedSchema("boolean");
    org.apache.avro.Schema.Field[] fieldArray4 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList5 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList5,
        fieldArray4);
    org.apache.avro.Schema schema7 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList5);
    boolean boolean8 = schema7.isNullable();
    java.util.Set<String> strSet9 = schema7.getAliases();
    com.fasterxml.jackson.databind.JsonNode jsonNode10 = null;
    boolean boolean11 = schema7.isValidDefault(jsonNode10);
    boolean boolean12 = schema7.isUnion();
    boolean boolean13 = schema7.isNullable();
    Object obj15 = schema7.getObjectProp("fixed");
    org.apache.avro.SchemaParser.ParseResult parseResult16 = parseContext0.commit(schema7);
    com.fasterxml.jackson.databind.JsonNode jsonNode17 = null;
    boolean boolean18 = schema7.isValidDefault(jsonNode17);
    // The following exception was thrown during execution in test generation
    try {
      int int19 = schema7.getFixedSize();
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Not fixed: {\"type\":\"record\",\"fields\":[]}");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    org.junit.Assert.assertNull(schema3);
    org.junit.Assert.assertNotNull(fieldArray4);
    org.junit.Assert.assertArrayEquals(fieldArray4, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    org.junit.Assert.assertNotNull(schema7);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    org.junit.Assert.assertNotNull(strSet9);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    org.junit.Assert.assertNull(obj15);
    org.junit.Assert.assertNotNull(parseResult16);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
  }

  @Test
  public void test47() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test47");
    org.apache.avro.ParseContext parseContext0 = new org.apache.avro.ParseContext();
    org.apache.avro.Schema.Field[] fieldArray1 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList2 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList2,
        fieldArray1);
    org.apache.avro.Schema schema4 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList2);
    boolean boolean5 = schema4.isNullable();
    java.util.Set<String> strSet6 = schema4.getAliases();
    com.fasterxml.jackson.databind.JsonNode jsonNode7 = null;
    boolean boolean8 = schema4.isValidDefault(jsonNode7);
    String str9 = schema4.getDoc();
    org.apache.avro.Schema schema10 = org.apache.avro.Schema.createMap(schema4);
    boolean boolean11 = schema4.isError();
    org.apache.avro.Schema.Type type12 = schema4.getType();
    org.apache.avro.Schema schema13 = parseContext0.resolve(schema4);
    boolean boolean15 = parseContext0.contains(
        "{\n  \"type\" : \"array\",\n  \"items\" : {\n    \"type\" : \"record\",\n    \"fields\" : [ ]\n  }\n}");
    org.junit.Assert.assertNotNull(fieldArray1);
    org.junit.Assert.assertArrayEquals(fieldArray1, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    org.junit.Assert.assertNotNull(schema4);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    org.junit.Assert.assertNotNull(strSet6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    org.junit.Assert.assertNull(str9);
    org.junit.Assert.assertNotNull(schema10);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    org.junit.Assert.assertTrue("'" + type12 + "' != '" + org.apache.avro.Schema.Type.RECORD + "'",
        type12.equals(org.apache.avro.Schema.Type.RECORD));
    org.junit.Assert.assertNotNull(schema13);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
  }

  @Test
  public void test48() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test48");
    org.apache.avro.ParseContext parseContext0 = new org.apache.avro.ParseContext();
    org.apache.avro.Schema schema2 = parseContext0.getNamedSchema("hi!");
    org.apache.avro.Schema schema4 = parseContext0.getNamedSchema("");
    java.util.List<org.apache.avro.Schema> schemaList5 = parseContext0.resolveAllSchemas();
    boolean boolean7 = parseContext0.contains("{\n  \"type\" : \"record\",\n  \"fields\" : [ ]\n}");
    org.junit.Assert.assertNull(schema2);
    org.junit.Assert.assertNull(schema4);
    org.junit.Assert.assertNotNull(schemaList5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
  }

  @Test
  public void test49() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test49");
    org.apache.avro.ParseContext parseContext0 = new org.apache.avro.ParseContext();
    boolean boolean1 = parseContext0.hasNewSchemas();
    java.util.List<org.apache.avro.Schema> schemaList2 = parseContext0.resolveAllSchemas();
    org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser(parseContext0);
    java.util.Map<String, org.apache.avro.Schema> strMap4 = parseContext0.typesByName();
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    org.junit.Assert.assertNotNull(schemaList2);
    org.junit.Assert.assertNotNull(strMap4);
  }

  @Test
  public void test50() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test50");
    org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
    java.util.Map<String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
    org.apache.avro.Schema.Parser parser2 = new org.apache.avro.Schema.Parser();
    java.util.Map<String, org.apache.avro.Schema> strMap3 = parser2.getTypes();
    org.apache.avro.Schema.Parser parser4 = parser0.addTypes(strMap3);
    org.apache.avro.Schema.Parser parser6 = parser0.setValidateDefaults(true);
    org.apache.avro.ParseContext parseContext7 = new org.apache.avro.ParseContext();
    boolean boolean8 = parseContext7.hasNewSchemas();
    java.util.List<org.apache.avro.Schema> schemaList9 = parseContext7.resolveAllSchemas();
    org.apache.avro.Schema.Parser parser10 = parser0.addTypes((Iterable<org.apache.avro.Schema>) schemaList9);
    org.apache.avro.Schema.Parser parser12 = parser10.setValidateDefaults(true);
    String[] strArray16 = new String[] { "{\n  \"type\" : \"record\",\n  \"fields\" : [ ]\n}", "fixed" };
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema17 = parser10.parse("record", strArray16);
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.SchemaParseException; message: com.fasterxml.jackson.core.JsonParseException: Unrecognized token 'record': was expecting (JSON String, Number, Array, Object or token 'null', 'true' or 'false')? at [Source: REDACTED (`StreamReadFeature.INCLUDE_SOURCE_IN_LOCATION` disabled); line: 1, column: 1]");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(strMap1);
    org.junit.Assert.assertNotNull(strMap3);
    org.junit.Assert.assertNotNull(parser4);
    org.junit.Assert.assertNotNull(parser6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    org.junit.Assert.assertNotNull(schemaList9);
    org.junit.Assert.assertNotNull(parser10);
    org.junit.Assert.assertNotNull(parser12);
    org.junit.Assert.assertNotNull(strArray16);
    org.junit.Assert.assertArrayEquals(strArray16,
        new String[] { "{\n  \"type\" : \"record\",\n  \"fields\" : [ ]\n}", "fixed" });
  }

  @Test
  public void test51() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test51");
    org.apache.avro.ParseContext parseContext0 = new org.apache.avro.ParseContext();
    org.apache.avro.Schema.Field[] fieldArray1 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList2 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList2,
        fieldArray1);
    org.apache.avro.Schema schema4 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList2);
    boolean boolean5 = schema4.isNullable();
    java.util.Set<String> strSet6 = schema4.getAliases();
    com.fasterxml.jackson.databind.JsonNode jsonNode7 = null;
    boolean boolean8 = schema4.isValidDefault(jsonNode7);
    String str9 = schema4.getDoc();
    org.apache.avro.Schema schema10 = org.apache.avro.Schema.createMap(schema4);
    boolean boolean11 = schema4.isError();
    org.apache.avro.Schema.Type type12 = schema4.getType();
    org.apache.avro.Schema schema13 = parseContext0.resolve(schema4);
    org.apache.avro.Schema.Parser parser14 = new org.apache.avro.Schema.Parser(parseContext0);
    org.junit.Assert.assertNotNull(fieldArray1);
    org.junit.Assert.assertArrayEquals(fieldArray1, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    org.junit.Assert.assertNotNull(schema4);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    org.junit.Assert.assertNotNull(strSet6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    org.junit.Assert.assertNull(str9);
    org.junit.Assert.assertNotNull(schema10);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    org.junit.Assert.assertTrue("'" + type12 + "' != '" + org.apache.avro.Schema.Type.RECORD + "'",
        type12.equals(org.apache.avro.Schema.Type.RECORD));
    org.junit.Assert.assertNotNull(schema13);
  }

  @Test
  public void test52() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test52");
    org.apache.avro.ParseContext parseContext0 = new org.apache.avro.ParseContext();
    boolean boolean1 = parseContext0.hasNewSchemas();
    java.util.Map<String, org.apache.avro.Schema> strMap2 = parseContext0.typesByName();
    org.apache.avro.Schema.Field[] fieldArray3 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList4 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList4,
        fieldArray3);
    org.apache.avro.Schema schema6 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList4);
    boolean boolean7 = schema6.isNullable();
    java.util.Set<String> strSet8 = schema6.getAliases();
    String str9 = schema6.toString();
    org.apache.avro.Schema.Field field11 = schema6.getField("long");
    java.util.List<org.apache.avro.Schema.Field> fieldList12 = schema6.getFields();
    boolean boolean14 = schema6.equals((Object) "long type:RECORD pos:-1");
    java.util.List<org.apache.avro.Schema.Field> fieldList15 = schema6.getFields();
    Object obj17 = null;
    Object obj18 = schema6.getObjectProp("", obj17);
    org.apache.avro.Schema schema19 = parseContext0.resolve(schema6);
    parseContext0.commit();
    java.util.Map<String, org.apache.avro.Schema> strMap21 = parseContext0.typesByName();
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    org.junit.Assert.assertNotNull(strMap2);
    org.junit.Assert.assertNotNull(fieldArray3);
    org.junit.Assert.assertArrayEquals(fieldArray3, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    org.junit.Assert.assertNotNull(schema6);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertNotNull(strSet8);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str9,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNull(field11);
    org.junit.Assert.assertNotNull(fieldList12);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    org.junit.Assert.assertNotNull(fieldList15);
    org.junit.Assert.assertNull(obj18);
    org.junit.Assert.assertNotNull(schema19);
    org.junit.Assert.assertNotNull(strMap21);
  }

  @Test
  public void test53() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test53");
    org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
    java.util.Map<String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
    org.apache.avro.Schema.Parser parser3 = parser0.setValidateDefaults(true);
    org.apache.avro.Schema.Parser parser5 = parser3.setValidateDefaults(true);
    org.apache.avro.Schema.Field[] fieldArray6 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList7 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList7,
        fieldArray6);
    org.apache.avro.Schema schema9 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList7);
    String str10 = schema9.getName();
    org.apache.avro.LogicalType logicalType11 = schema9.getLogicalType();
    boolean boolean12 = schema9.hasProps();
    org.apache.avro.Schema.Parser parser14 = new org.apache.avro.Schema.Parser();
    java.util.Map<String, org.apache.avro.Schema> strMap15 = parser14.getTypes();
    org.apache.avro.Schema.Parser parser16 = new org.apache.avro.Schema.Parser();
    java.util.Map<String, org.apache.avro.Schema> strMap17 = parser16.getTypes();
    org.apache.avro.Schema.Parser parser18 = parser14.addTypes(strMap17);
    schema9.addProp("fixed", (Object) strMap17);
    org.apache.avro.Schema.Parser parser20 = parser3.addTypes(strMap17);
    org.apache.avro.Schema.Parser parser21 = new org.apache.avro.Schema.Parser();
    java.util.Map<String, org.apache.avro.Schema> strMap22 = parser21.getTypes();
    org.apache.avro.Schema.Parser parser23 = new org.apache.avro.Schema.Parser();
    java.util.Map<String, org.apache.avro.Schema> strMap24 = parser23.getTypes();
    org.apache.avro.Schema.Parser parser25 = parser21.addTypes(strMap24);
    org.apache.avro.Schema.Parser parser27 = parser21.setValidateDefaults(true);
    org.apache.avro.ParseContext parseContext28 = new org.apache.avro.ParseContext();
    boolean boolean29 = parseContext28.hasNewSchemas();
    java.util.List<org.apache.avro.Schema> schemaList30 = parseContext28.resolveAllSchemas();
    org.apache.avro.Schema.Parser parser31 = parser21.addTypes((Iterable<org.apache.avro.Schema>) schemaList30);
    org.apache.avro.Schema.Parser parser32 = parser20.addTypes((Iterable<org.apache.avro.Schema>) schemaList30);
    java.io.InputStream inputStream33 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema34 = parser20.parse(inputStream33);
      org.junit.Assert
          .fail("Expected exception of type org.apache.avro.SchemaParseException; message: Cannot parse <null> schema");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(strMap1);
    org.junit.Assert.assertNotNull(parser3);
    org.junit.Assert.assertNotNull(parser5);
    org.junit.Assert.assertNotNull(fieldArray6);
    org.junit.Assert.assertArrayEquals(fieldArray6, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    org.junit.Assert.assertNotNull(schema9);
    org.junit.Assert.assertNull(str10);
    org.junit.Assert.assertNull(logicalType11);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    org.junit.Assert.assertNotNull(strMap15);
    org.junit.Assert.assertNotNull(strMap17);
    org.junit.Assert.assertNotNull(parser18);
    org.junit.Assert.assertNotNull(parser20);
    org.junit.Assert.assertNotNull(strMap22);
    org.junit.Assert.assertNotNull(strMap24);
    org.junit.Assert.assertNotNull(parser25);
    org.junit.Assert.assertNotNull(parser27);
    org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    org.junit.Assert.assertNotNull(schemaList30);
    org.junit.Assert.assertNotNull(parser31);
    org.junit.Assert.assertNotNull(parser32);
  }

  @Test
  public void test54() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test54");
    org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
    java.util.Map<String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
    org.apache.avro.Schema.Parser parser2 = new org.apache.avro.Schema.Parser();
    java.util.Map<String, org.apache.avro.Schema> strMap3 = parser2.getTypes();
    org.apache.avro.Schema.Parser parser4 = parser0.addTypes(strMap3);
    org.apache.avro.Schema.Parser parser6 = parser0.setValidateDefaults(true);
    org.apache.avro.Schema.Parser parser8 = parser6.setValidateDefaults(false);
    org.apache.avro.Schema.Field[] fieldArray9 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList10 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList10,
        fieldArray9);
    org.apache.avro.Schema schema12 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList10);
    boolean boolean13 = schema12.isNullable();
    String str14 = schema12.getNamespace();
    schema12.addProp("long type:RECORD pos:-1", "");
    java.util.Set<String> strSet18 = schema12.getAliases();
    org.apache.avro.ParseContext parseContext19 = new org.apache.avro.ParseContext();
    boolean boolean20 = parseContext19.hasNewSchemas();
    java.util.List<org.apache.avro.Schema> schemaList21 = parseContext19.resolveAllSchemas();
    org.apache.avro.Schema schema22 = org.apache.avro.Schema.createUnion(schemaList21);
    boolean boolean23 = schema12.equals((Object) schemaList21);
    org.apache.avro.Schema.Parser parser24 = parser6.addTypes((Iterable<org.apache.avro.Schema>) schemaList21);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema26 = parser24.parse("");
      org.junit.Assert
          .fail("Expected exception of type org.apache.avro.SchemaParseException; message: Cannot parse <null> schema");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(strMap1);
    org.junit.Assert.assertNotNull(strMap3);
    org.junit.Assert.assertNotNull(parser4);
    org.junit.Assert.assertNotNull(parser6);
    org.junit.Assert.assertNotNull(parser8);
    org.junit.Assert.assertNotNull(fieldArray9);
    org.junit.Assert.assertArrayEquals(fieldArray9, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    org.junit.Assert.assertNotNull(schema12);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    org.junit.Assert.assertNull(str14);
    org.junit.Assert.assertNotNull(strSet18);
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    org.junit.Assert.assertNotNull(schemaList21);
    org.junit.Assert.assertNotNull(schema22);
    org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    org.junit.Assert.assertNotNull(parser24);
  }

  @Test
  public void test55() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test55");
    org.apache.avro.ParseContext parseContext0 = new org.apache.avro.ParseContext();
    boolean boolean1 = parseContext0.hasNewSchemas();
    org.apache.avro.Schema schema3 = parseContext0.getNamedSchema("boolean");
    org.apache.avro.Schema.Field[] fieldArray4 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList5 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList5,
        fieldArray4);
    org.apache.avro.Schema schema7 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList5);
    boolean boolean9 = schema7.equals((Object) 1.0f);
    org.apache.avro.Schema.Type type10 = schema7.getType();
    org.apache.avro.LogicalType logicalType11 = schema7.getLogicalType();
    String str12 = schema7.getFullName();
    org.apache.avro.Schema schema13 = parseContext0.resolve(schema7);
    Object obj15 = null;
    // The following exception was thrown during execution in test generation
    try {
      schema7.addProp("bytes", obj15);
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Can't set a property to null: bytes");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    org.junit.Assert.assertNull(schema3);
    org.junit.Assert.assertNotNull(fieldArray4);
    org.junit.Assert.assertArrayEquals(fieldArray4, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    org.junit.Assert.assertNotNull(schema7);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    org.junit.Assert.assertTrue("'" + type10 + "' != '" + org.apache.avro.Schema.Type.RECORD + "'",
        type10.equals(org.apache.avro.Schema.Type.RECORD));
    org.junit.Assert.assertNull(logicalType11);
    org.junit.Assert.assertNull(str12);
    org.junit.Assert.assertNotNull(schema13);
  }
}
