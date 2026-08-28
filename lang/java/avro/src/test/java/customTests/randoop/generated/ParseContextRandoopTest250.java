package customTests.randoop.generated;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ParseContextRandoopTest250 {

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
  public void test001() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test001");
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
  public void test002() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test002");
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
  public void test003() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test003");
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
  public void test004() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test004");
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
  public void test005() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test005");
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
  public void test006() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test006");
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
  public void test007() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test007");
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
  public void test008() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test008");
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
  public void test009() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test009");
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
  public void test010() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test010");
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
  public void test011() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test011");
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
  public void test012() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test012");
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
  public void test013() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test013");
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
  public void test014() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test014");
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
  public void test015() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test015");
    org.apache.avro.NameValidator nameValidator0 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext1 = new org.apache.avro.ParseContext(nameValidator0);
    parseContext1.rollback();
    parseContext1.rollback();
    org.junit.Assert.assertNotNull(nameValidator0);
  }

  @Test
  public void test016() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test016");
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
  public void test017() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test017");
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
  public void test018() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test018");
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
  public void test019() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test019");
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
  public void test020() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test020");
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
  public void test021() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test021");
    org.apache.avro.NameValidator nameValidator0 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.Schema.Parser parser1 = new org.apache.avro.Schema.Parser(nameValidator0);
    org.apache.avro.Schema.Parser parser2 = new org.apache.avro.Schema.Parser(nameValidator0);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.ParseContext parseContext3 = new org.apache.avro.ParseContext(nameValidator0);
// flaky "1) test021(RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    } catch (NullPointerException e) {
      // Expected exception.
    }
// flaky "1) test021(RegressionTest0)":         org.junit.Assert.assertNull(nameValidator0);
  }

  @Test
  public void test022() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test022");
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
  public void test023() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test023");
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
  public void test024() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test024");
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
  public void test025() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test025");
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
  public void test026() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test026");
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
  public void test027() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test027");
    org.apache.avro.NameValidator nameValidator0 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.Schema.Parser parser1 = new org.apache.avro.Schema.Parser(nameValidator0);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.ParseContext parseContext2 = new org.apache.avro.ParseContext(nameValidator0);
// flaky "2) test027(RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    } catch (NullPointerException e) {
      // Expected exception.
    }
// flaky "2) test027(RegressionTest0)":         org.junit.Assert.assertNull(nameValidator0);
  }

  @Test
  public void test028() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test028");
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
  public void test029() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test029");
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
// flaky "3) test029(RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.avro.NameValidator.validate(String)\" because the return value of \"java.lang.ThreadLocal.get()\" is null");
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
  public void test030() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test030");
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
  public void test031() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test031");
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
  public void test032() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test032");
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
  public void test033() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test033");
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
  public void test034() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test034");
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
  public void test035() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test035");
    org.apache.avro.NameValidator nameValidator0 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.Schema.Parser parser1 = new org.apache.avro.Schema.Parser(nameValidator0);
    org.apache.avro.Schema.setNameValidator(nameValidator0);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.ParseContext parseContext3 = new org.apache.avro.ParseContext(nameValidator0);
// flaky "4) test035(RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    } catch (NullPointerException e) {
      // Expected exception.
    }
// flaky "3) test035(RegressionTest0)":         org.junit.Assert.assertNull(nameValidator0);
  }

  @Test
  public void test036() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test036");
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
  public void test037() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test037");
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
  public void test038() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test038");
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
  public void test039() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test039");
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
  public void test040() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test040");
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
  public void test041() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test041");
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
  public void test042() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test042");
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
  public void test043() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test043");
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
  public void test044() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test044");
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

  @Test
  public void test045() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test045");
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
    org.apache.avro.Schema.Field[] fieldArray20 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList21 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList21,
        fieldArray20);
    org.apache.avro.Schema schema23 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList21);
    boolean boolean24 = schema23.isNullable();
    java.util.Set<String> strSet25 = schema23.getAliases();
    com.fasterxml.jackson.databind.JsonNode jsonNode26 = null;
    boolean boolean27 = schema23.isValidDefault(jsonNode26);
    String str28 = schema23.getDoc();
    // The following exception was thrown during execution in test generation
    try {
      parseContext0.put(schema23);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"String.split(String)\" because \"fullName\" is null");
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
    org.junit.Assert.assertNotNull(fieldArray20);
    org.junit.Assert.assertArrayEquals(fieldArray20, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    org.junit.Assert.assertNotNull(schema23);
    org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    org.junit.Assert.assertNotNull(strSet25);
    org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    org.junit.Assert.assertNull(str28);
  }

  @Test
  public void test046() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test046");
    org.apache.avro.ParseContext parseContext0 = new org.apache.avro.ParseContext();
    boolean boolean1 = parseContext0.hasNewSchemas();
    java.util.Map<String, org.apache.avro.Schema> strMap2 = parseContext0.typesByName();
    org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser(parseContext0);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema5 = parser3.parse("boolean");
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.SchemaParseException; message: com.fasterxml.jackson.core.JsonParseException: Unrecognized token 'boolean': was expecting (JSON String, Number, Array, Object or token 'null', 'true' or 'false')? at [Source: REDACTED (`StreamReadFeature.INCLUDE_SOURCE_IN_LOCATION` disabled); line: 1, column: 1]");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    org.junit.Assert.assertNotNull(strMap2);
  }

  @Test
  public void test047() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test047");
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
    java.util.function.BiConsumer<String, Object> strBiConsumer14 = null;
    schema7.forEachProperty(strBiConsumer14);
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
  public void test048() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test048");
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
    org.apache.avro.Schema.Field[] fieldArray25 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList26 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean27 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList26,
        fieldArray25);
    org.apache.avro.Schema schema28 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList26);
    boolean boolean29 = schema28.isNullable();
    java.util.Set<String> strSet30 = schema28.getAliases();
    String str31 = schema28.toString();
    org.apache.avro.Schema.Field field33 = schema28.getField("long");
    java.util.List<org.apache.avro.Schema.Field> fieldList34 = schema28.getFields();
    String str36 = schema28.toString(false);
    java.util.Map<String, Object> strMap37 = schema28.getObjectProps();
    String str38 = schema28.toString();
    java.util.Map<String, Object> strMap39 = schema28.getObjectProps();
    boolean boolean40 = schema28.isNullable();
    org.apache.avro.SchemaParser.ParseResult parseResult41 = parseContext0.commit(schema28);
    boolean boolean43 = parseContext0.contains("long type:RECORD pos:-1");
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
    org.junit.Assert.assertNotNull(fieldArray25);
    org.junit.Assert.assertArrayEquals(fieldArray25, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    org.junit.Assert.assertNotNull(schema28);
    org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    org.junit.Assert.assertNotNull(strSet30);
    org.junit.Assert.assertEquals("'" + str31 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str31,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNull(field33);
    org.junit.Assert.assertNotNull(fieldList34);
    org.junit.Assert.assertEquals("'" + str36 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str36,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNotNull(strMap37);
    org.junit.Assert.assertEquals("'" + str38 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str38,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNotNull(strMap39);
    org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    org.junit.Assert.assertNotNull(parseResult41);
    org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
  }

  @Test
  public void test049() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test049");
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
    org.apache.avro.Schema.Field[] fieldArray22 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList23 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean24 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList23,
        fieldArray22);
    org.apache.avro.Schema schema25 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList23);
    boolean boolean26 = schema25.isNullable();
    String str27 = schema25.getNamespace();
    schema25.addProp("long type:RECORD pos:-1", "");
    java.util.Set<String> strSet31 = schema25.getAliases();
    org.apache.avro.ParseContext parseContext32 = new org.apache.avro.ParseContext();
    boolean boolean33 = parseContext32.hasNewSchemas();
    java.util.List<org.apache.avro.Schema> schemaList34 = parseContext32.resolveAllSchemas();
    org.apache.avro.Schema schema35 = org.apache.avro.Schema.createUnion(schemaList34);
    boolean boolean36 = schema25.equals((Object) schemaList34);
    // The following exception was thrown during execution in test generation
    try {
      parseContext0.put(schema25);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"String.split(String)\" because \"fullName\" is null");
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
    org.junit.Assert.assertNotNull(schemaList21);
    org.junit.Assert.assertNotNull(fieldArray22);
    org.junit.Assert.assertArrayEquals(fieldArray22, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    org.junit.Assert.assertNotNull(schema25);
    org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    org.junit.Assert.assertNull(str27);
    org.junit.Assert.assertNotNull(strSet31);
    org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    org.junit.Assert.assertNotNull(schemaList34);
    org.junit.Assert.assertNotNull(schema35);
    org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
  }

  @Test
  public void test050() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test050");
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
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema17 = parseContext0.find("", "{\n  \"type\" : \"record\",\n  \"fields\" : [ ]\n}");
// flaky "5) test050(RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.avro.NameValidator.validate(String)\" because the return value of \"java.lang.ThreadLocal.get()\" is null");
    } catch (NullPointerException e) {
      // Expected exception.
    }
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
  public void test051() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test051");
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
    java.util.Map<String, org.apache.avro.Schema> strMap25 = parseContext0.typesByName();
    boolean boolean27 = parseContext0.contains("boolean");
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
    org.junit.Assert.assertNotNull(strMap25);
    org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
  }

  @Test
  public void test052() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test052");
    org.apache.avro.Schema.Field[] fieldArray0 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList1 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList1,
        fieldArray0);
    org.apache.avro.Schema schema3 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
    boolean boolean5 = schema3.propsContainsKey("{\"type\":\"record\",\"fields\":[]}");
    org.apache.avro.Schema.Field[] fieldArray6 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList7 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList7,
        fieldArray6);
    org.apache.avro.Schema schema9 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList7);
    boolean boolean10 = schema9.isNullable();
    java.util.Set<String> strSet11 = schema9.getAliases();
    String str12 = schema9.toString();
    org.apache.avro.Schema.Field field14 = schema9.getField("long");
    boolean boolean15 = schema9.isError();
    org.apache.avro.Schema.Parser parser16 = new org.apache.avro.Schema.Parser();
    java.util.Map<String, org.apache.avro.Schema> strMap17 = parser16.getTypes();
    org.apache.avro.Schema.Parser parser18 = new org.apache.avro.Schema.Parser();
    java.util.Map<String, org.apache.avro.Schema> strMap19 = parser18.getTypes();
    org.apache.avro.Schema.Parser parser20 = parser16.addTypes(strMap19);
    org.apache.avro.Schema.Parser parser22 = parser16.setValidateDefaults(true);
    org.apache.avro.ParseContext parseContext23 = new org.apache.avro.ParseContext();
    boolean boolean24 = parseContext23.hasNewSchemas();
    java.util.List<org.apache.avro.Schema> schemaList25 = parseContext23.resolveAllSchemas();
    org.apache.avro.Schema.Parser parser26 = parser16.addTypes((Iterable<org.apache.avro.Schema>) schemaList25);
    String str28 = schema9.toString((java.util.Collection<org.apache.avro.Schema>) schemaList25, false);
    String str30 = schema3.toString((java.util.Collection<org.apache.avro.Schema>) schemaList25, true);
    org.apache.avro.Schema schema31 = org.apache.avro.Schema.createUnion(schemaList25);
    org.junit.Assert.assertNotNull(fieldArray0);
    org.junit.Assert.assertArrayEquals(fieldArray0, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertNotNull(schema3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    org.junit.Assert.assertNotNull(fieldArray6);
    org.junit.Assert.assertArrayEquals(fieldArray6, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    org.junit.Assert.assertNotNull(schema9);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    org.junit.Assert.assertNotNull(strSet11);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str12,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNull(field14);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    org.junit.Assert.assertNotNull(strMap17);
    org.junit.Assert.assertNotNull(strMap19);
    org.junit.Assert.assertNotNull(parser20);
    org.junit.Assert.assertNotNull(parser22);
    org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    org.junit.Assert.assertNotNull(schemaList25);
    org.junit.Assert.assertNotNull(parser26);
    org.junit.Assert.assertEquals("'" + str28 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str28,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertEquals("'" + str30 + "' != '" + "{\n  \"type\" : \"record\",\n  \"fields\" : [ ]\n}" + "'",
        str30, "{\n  \"type\" : \"record\",\n  \"fields\" : [ ]\n}");
    org.junit.Assert.assertNotNull(schema31);
  }

  @Test
  public void test053() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test053");
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
    String[] strArray40 = new String[] { "long", "", "long", "", "hi!", "fixed" };
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema41 = parser32.parse("hi!", strArray40);
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.SchemaParseException; message: com.fasterxml.jackson.core.JsonParseException: Unrecognized token 'hi': was expecting (JSON String, Number, Array, Object or token 'null', 'true' or 'false')? at [Source: REDACTED (`StreamReadFeature.INCLUDE_SOURCE_IN_LOCATION` disabled); line: 1, column: 1]");
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
    org.junit.Assert.assertNotNull(strArray40);
    org.junit.Assert.assertArrayEquals(strArray40, new String[] { "long", "", "long", "", "hi!", "fixed" });
  }

  @Test
  public void test054() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test054");
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
    java.util.function.BiConsumer<String, Object> strBiConsumer14 = null;
    schema4.forEachProperty(strBiConsumer14);
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
  public void test055() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test055");
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
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema17 = parseContext0.find("long type:RECORD pos:-1", "");
// flaky "6) test055(RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.avro.NameValidator.validate(String)\" because the return value of \"java.lang.ThreadLocal.get()\" is null");
    } catch (NullPointerException e) {
      // Expected exception.
    }
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
  public void test056() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test056");
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
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema30 = parser4.parse("long type:RECORD pos:-1");
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.SchemaParseException; message: com.fasterxml.jackson.core.JsonParseException: Unrecognized token 'long': was expecting (JSON String, Number, Array, Object or token 'null', 'true' or 'false')? at [Source: REDACTED (`StreamReadFeature.INCLUDE_SOURCE_IN_LOCATION` disabled); line: 1, column: 1]");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
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
  }

  @Test
  public void test057() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test057");
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
    java.util.Map<String, org.apache.avro.Schema> strMap25 = parseContext0.typesByName();
    org.apache.avro.Schema.Field[] fieldArray26 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList27 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean28 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList27,
        fieldArray26);
    org.apache.avro.Schema schema29 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList27);
    boolean boolean30 = schema29.isNullable();
    org.apache.avro.Schema schema31 = org.apache.avro.Schema.createArray(schema29);
    Object obj33 = schema31.getObjectProp("");
    org.apache.avro.Schema schema34 = parseContext0.resolve(schema31);
    // The following exception was thrown during execution in test generation
    try {
      String str35 = schema31.getEnumDefault();
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: {\"type\":\"array\",\"items\":{\"type\":\"record\",\"fields\":[]}}");
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
    org.junit.Assert.assertNotNull(strMap25);
    org.junit.Assert.assertNotNull(fieldArray26);
    org.junit.Assert.assertArrayEquals(fieldArray26, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    org.junit.Assert.assertNotNull(schema29);
    org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    org.junit.Assert.assertNotNull(schema31);
    org.junit.Assert.assertNull(obj33);
    org.junit.Assert.assertNotNull(schema34);
  }

  @Test
  public void test058() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test058");
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
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema24 = parseContext0
          .find("{\"type\":\"record\",\"fields\":[],\"long type:RECORD pos:-1\":\"long type:RECORD pos:-1\"}", "");
// flaky "7) test058(RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.avro.NameValidator.validate(String)\" because the return value of \"java.lang.ThreadLocal.get()\" is null");
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
  public void test059() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test059");
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
    org.apache.avro.Schema.Parser parser16 = parser14.setValidateDefaults(true);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema18 = parser16.parseInternal("long type:RECORD pos:-1");
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.SchemaParseException; message: com.fasterxml.jackson.core.JsonParseException: Unrecognized token 'long': was expecting (JSON String, Number, Array, Object or token 'null', 'true' or 'false')? at [Source: REDACTED (`StreamReadFeature.INCLUDE_SOURCE_IN_LOCATION` disabled); line: 1, column: 1]");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
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
    org.junit.Assert.assertNotNull(parser16);
  }

  @Test
  public void test060() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test060");
    org.apache.avro.ParseContext parseContext0 = new org.apache.avro.ParseContext();
    boolean boolean1 = parseContext0.hasNewSchemas();
    java.util.List<org.apache.avro.Schema> schemaList2 = parseContext0.resolveAllSchemas();
    org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser(parseContext0);
    boolean boolean4 = parser3.getValidateDefaults();
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    org.junit.Assert.assertNotNull(schemaList2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
  }

  @Test
  public void test061() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test061");
    org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
    java.util.Map<String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
    org.apache.avro.Schema.Parser parser3 = parser0.setValidateDefaults(true);
    org.apache.avro.Schema.Parser parser5 = parser0.setValidateDefaults(true);
    org.apache.avro.ParseContext parseContext6 = new org.apache.avro.ParseContext();
    org.apache.avro.Schema schema8 = parseContext6.getNamedSchema("hi!");
    org.apache.avro.Schema schema10 = parseContext6.getNamedSchema("");
    java.util.List<org.apache.avro.Schema> schemaList11 = parseContext6.resolveAllSchemas();
    org.apache.avro.Schema.Parser parser12 = parser5.addTypes((Iterable<org.apache.avro.Schema>) schemaList11);
    org.apache.avro.Schema schema13 = org.apache.avro.Schema.createUnion(schemaList11);
    org.junit.Assert.assertNotNull(strMap1);
    org.junit.Assert.assertNotNull(parser3);
    org.junit.Assert.assertNotNull(parser5);
    org.junit.Assert.assertNull(schema8);
    org.junit.Assert.assertNull(schema10);
    org.junit.Assert.assertNotNull(schemaList11);
    org.junit.Assert.assertNotNull(parser12);
    org.junit.Assert.assertNotNull(schema13);
  }

  @Test
  public void test062() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test062");
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
    parseContext0.commit();
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
  public void test063() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test063");
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
    boolean boolean15 = parseContext0.contains("fixed");
    org.apache.avro.Schema.Field[] fieldArray16 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList17 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList17,
        fieldArray16);
    org.apache.avro.Schema schema19 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList17);
    boolean boolean20 = schema19.isUnion();
    java.util.Set<String> strSet21 = schema19.getAliases();
    org.apache.avro.Schema.Field[] fieldArray23 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList24 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean25 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList24,
        fieldArray23);
    org.apache.avro.Schema schema26 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList24);
    boolean boolean28 = schema26.equals((Object) 1.0f);
    org.apache.avro.Schema.Type type29 = schema26.getType();
    schema19.addProp("long", (Object) type29);
    // The following exception was thrown during execution in test generation
    try {
      parseContext0.put(schema19);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"String.split(String)\" because \"fullName\" is null");
    } catch (NullPointerException e) {
      // Expected exception.
    }
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
    org.junit.Assert.assertNotNull(fieldArray16);
    org.junit.Assert.assertArrayEquals(fieldArray16, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    org.junit.Assert.assertNotNull(schema19);
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    org.junit.Assert.assertNotNull(strSet21);
    org.junit.Assert.assertNotNull(fieldArray23);
    org.junit.Assert.assertArrayEquals(fieldArray23, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    org.junit.Assert.assertNotNull(schema26);
    org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    org.junit.Assert.assertTrue("'" + type29 + "' != '" + org.apache.avro.Schema.Type.RECORD + "'",
        type29.equals(org.apache.avro.Schema.Type.RECORD));
  }

  @Test
  public void test064() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test064");
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
    org.apache.avro.Schema.Field[] fieldArray21 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList22 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean23 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList22,
        fieldArray21);
    org.apache.avro.Schema schema24 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList22);
    boolean boolean25 = schema24.isNullable();
    java.util.Set<String> strSet26 = schema24.getAliases();
    String str27 = schema24.toString();
    org.apache.avro.Schema.Field field29 = schema24.getField("long");
    java.util.List<org.apache.avro.Schema.Field> fieldList30 = schema24.getFields();
    boolean boolean31 = schema24.hasFields();
    boolean boolean32 = schema24.hasFields();
    java.util.List<org.apache.avro.Schema.Field> fieldList33 = schema24.getFields();
    org.apache.avro.Schema.Field[] fieldArray34 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList35 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean36 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList35,
        fieldArray34);
    org.apache.avro.Schema schema37 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList35);
    boolean boolean38 = schema37.isNullable();
    java.util.Set<String> strSet39 = schema37.getAliases();
    String str40 = schema37.toString();
    org.apache.avro.Schema.Field[] fieldArray41 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList42 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean43 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList42,
        fieldArray41);
    org.apache.avro.Schema schema44 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList42);
    boolean boolean45 = schema44.isNullable();
    java.util.Set<String> strSet46 = schema44.getAliases();
    String str47 = schema44.toString();
    org.apache.avro.Schema.Field field49 = schema44.getField("long");
    java.util.List<org.apache.avro.Schema.Field> fieldList50 = schema44.getFields();
    String str52 = schema44.toString(false);
    java.util.function.BiConsumer<String, Object> strBiConsumer53 = null;
    schema44.forEachProperty(strBiConsumer53);
    schema37.addAllProps((org.apache.avro.JsonProperties) schema44);
    org.apache.avro.Schema schema56 = org.apache.avro.Schema.applyAliases(schema24, schema37);
    Object obj58 = schema24.getObjectProp("long type:RECORD pos:-1");
    boolean boolean60 = schema24.propsContainsKey("long type:RECORD pos:-1");
    org.apache.avro.SchemaParser.ParseResult parseResult61 = parseContext0.commit(schema24);
    // The following exception was thrown during execution in test generation
    try {
      schema24.addAlias("record");
// flaky "8) test064(RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.avro.NameValidator.validate(String)\" because the return value of \"java.lang.ThreadLocal.get()\" is null");
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
    org.junit.Assert.assertNotNull(fieldArray21);
    org.junit.Assert.assertArrayEquals(fieldArray21, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    org.junit.Assert.assertNotNull(schema24);
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    org.junit.Assert.assertNotNull(strSet26);
    org.junit.Assert.assertEquals("'" + str27 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str27,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNull(field29);
    org.junit.Assert.assertNotNull(fieldList30);
    org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    org.junit.Assert.assertNotNull(fieldList33);
    org.junit.Assert.assertNotNull(fieldArray34);
    org.junit.Assert.assertArrayEquals(fieldArray34, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    org.junit.Assert.assertNotNull(schema37);
    org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    org.junit.Assert.assertNotNull(strSet39);
    org.junit.Assert.assertEquals("'" + str40 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str40,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNotNull(fieldArray41);
    org.junit.Assert.assertArrayEquals(fieldArray41, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    org.junit.Assert.assertNotNull(schema44);
    org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    org.junit.Assert.assertNotNull(strSet46);
    org.junit.Assert.assertEquals("'" + str47 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str47,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNull(field49);
    org.junit.Assert.assertNotNull(fieldList50);
    org.junit.Assert.assertEquals("'" + str52 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str52,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNotNull(schema56);
    org.junit.Assert.assertNull(obj58);
    org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    org.junit.Assert.assertNotNull(parseResult61);
  }

  @Test
  public void test065() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test065");
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
    java.util.Map<String, org.apache.avro.Schema> strMap25 = parseContext0.typesByName();
    java.util.Map<String, org.apache.avro.Schema> strMap26 = parseContext0.typesByName();
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
    org.junit.Assert.assertNotNull(strMap25);
    org.junit.Assert.assertNotNull(strMap26);
  }

  @Test
  public void test066() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test066");
    org.apache.avro.ParseContext parseContext0 = new org.apache.avro.ParseContext();
    org.apache.avro.Schema schema2 = parseContext0.getNamedSchema("hi!");
    org.apache.avro.Schema schema4 = parseContext0.getNamedSchema("");
    java.util.List<org.apache.avro.Schema> schemaList5 = parseContext0.resolveAllSchemas();
    boolean boolean7 = parseContext0.contains(
        "{\n  \"type\" : \"array\",\n  \"items\" : {\n    \"type\" : \"record\",\n    \"fields\" : [ ]\n  }\n}");
    org.junit.Assert.assertNull(schema2);
    org.junit.Assert.assertNull(schema4);
    org.junit.Assert.assertNotNull(schemaList5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
  }

  @Test
  public void test067() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test067");
    org.apache.avro.Schema.Field[] fieldArray0 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList1 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList1,
        fieldArray0);
    org.apache.avro.Schema schema3 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
    boolean boolean5 = schema3.propsContainsKey("{\"type\":\"record\",\"fields\":[]}");
    org.apache.avro.Schema.Field[] fieldArray6 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList7 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList7,
        fieldArray6);
    org.apache.avro.Schema schema9 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList7);
    boolean boolean10 = schema9.isNullable();
    java.util.Set<String> strSet11 = schema9.getAliases();
    String str12 = schema9.toString();
    org.apache.avro.Schema.Field field14 = schema9.getField("long");
    boolean boolean15 = schema9.isError();
    org.apache.avro.Schema.Parser parser16 = new org.apache.avro.Schema.Parser();
    java.util.Map<String, org.apache.avro.Schema> strMap17 = parser16.getTypes();
    org.apache.avro.Schema.Parser parser18 = new org.apache.avro.Schema.Parser();
    java.util.Map<String, org.apache.avro.Schema> strMap19 = parser18.getTypes();
    org.apache.avro.Schema.Parser parser20 = parser16.addTypes(strMap19);
    org.apache.avro.Schema.Parser parser22 = parser16.setValidateDefaults(true);
    org.apache.avro.ParseContext parseContext23 = new org.apache.avro.ParseContext();
    boolean boolean24 = parseContext23.hasNewSchemas();
    java.util.List<org.apache.avro.Schema> schemaList25 = parseContext23.resolveAllSchemas();
    org.apache.avro.Schema.Parser parser26 = parser16.addTypes((Iterable<org.apache.avro.Schema>) schemaList25);
    String str28 = schema9.toString((java.util.Collection<org.apache.avro.Schema>) schemaList25, false);
    String str30 = schema3.toString((java.util.Collection<org.apache.avro.Schema>) schemaList25, true);
    com.fasterxml.jackson.databind.JsonNode jsonNode31 = null;
    boolean boolean32 = schema3.isValidDefault(jsonNode31);
    java.util.List<org.apache.avro.Schema.Field> fieldList33 = schema3.getFields();
    org.junit.Assert.assertNotNull(fieldArray0);
    org.junit.Assert.assertArrayEquals(fieldArray0, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertNotNull(schema3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    org.junit.Assert.assertNotNull(fieldArray6);
    org.junit.Assert.assertArrayEquals(fieldArray6, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    org.junit.Assert.assertNotNull(schema9);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    org.junit.Assert.assertNotNull(strSet11);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str12,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNull(field14);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    org.junit.Assert.assertNotNull(strMap17);
    org.junit.Assert.assertNotNull(strMap19);
    org.junit.Assert.assertNotNull(parser20);
    org.junit.Assert.assertNotNull(parser22);
    org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    org.junit.Assert.assertNotNull(schemaList25);
    org.junit.Assert.assertNotNull(parser26);
    org.junit.Assert.assertEquals("'" + str28 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str28,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertEquals("'" + str30 + "' != '" + "{\n  \"type\" : \"record\",\n  \"fields\" : [ ]\n}" + "'",
        str30, "{\n  \"type\" : \"record\",\n  \"fields\" : [ ]\n}");
    org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    org.junit.Assert.assertNotNull(fieldList33);
  }

  @Test
  public void test068() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test068");
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
    org.apache.avro.Schema schema15 = parseContext0.getNamedSchema("fixed");
    parseContext0.commit();
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
    org.junit.Assert.assertNull(schema15);
  }

  @Test
  public void test069() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test069");
    org.apache.avro.ParseContext parseContext0 = new org.apache.avro.ParseContext();
    org.apache.avro.Schema schema2 = parseContext0.getNamedSchema("hi!");
    org.apache.avro.Schema schema4 = parseContext0.getNamedSchema("");
    boolean boolean5 = parseContext0.hasNewSchemas();
    org.junit.Assert.assertNull(schema2);
    org.junit.Assert.assertNull(schema4);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
  }

  @Test
  public void test070() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test070");
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
    boolean boolean15 = parseContext0.contains("fixed");
    boolean boolean17 = parseContext0.contains("long");
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
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
  }

  @Test
  public void test071() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test071");
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
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema30 = parser28
          .parseInternal("{\"type\":\"record\",\"fields\":[],\"long type:RECORD pos:-1\":\"long type:RECORD pos:-1\"}");
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.SchemaParseException; message: No name in schema: {\"type\":\"record\",\"fields\":[],\"long type:RECORD pos:-1\":\"long type:RECORD pos:-1\"}");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
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
  }

  @Test
  public void test072() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test072");
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
    org.apache.avro.Schema schema17 = parseContext0
        .getNamedSchema("{\n  \"type\" : \"record\",\n  \"fields\" : [ ]\n}");
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
    org.junit.Assert.assertNull(schema17);
  }

  @Test
  public void test073() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test073");
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
    org.apache.avro.Schema.Parser parser11 = new org.apache.avro.Schema.Parser();
    java.util.Map<String, org.apache.avro.Schema> strMap12 = parser11.getTypes();
    org.apache.avro.Schema.Parser parser13 = new org.apache.avro.Schema.Parser();
    java.util.Map<String, org.apache.avro.Schema> strMap14 = parser13.getTypes();
    org.apache.avro.Schema.Parser parser15 = parser11.addTypes(strMap14);
    org.apache.avro.Schema.Parser parser16 = new org.apache.avro.Schema.Parser();
    java.util.Map<String, org.apache.avro.Schema> strMap17 = parser16.getTypes();
    org.apache.avro.Schema.Parser parser18 = parser11.addTypes(strMap17);
    org.apache.avro.Schema.Parser parser19 = parser0.addTypes(strMap17);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema21 = parser0.parseInternal(
          "{\n  \"type\" : \"array\",\n  \"items\" : {\n    \"type\" : \"record\",\n    \"fields\" : [ ]\n  }\n}");
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
    org.junit.Assert.assertNotNull(strMap12);
    org.junit.Assert.assertNotNull(strMap14);
    org.junit.Assert.assertNotNull(parser15);
    org.junit.Assert.assertNotNull(strMap17);
    org.junit.Assert.assertNotNull(parser18);
    org.junit.Assert.assertNotNull(parser19);
  }

  @Test
  public void test074() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test074");
    org.apache.avro.Schema schema0 = null;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.createMap(schema0);
    org.apache.avro.Schema.Parser parser2 = new org.apache.avro.Schema.Parser();
    java.util.Map<String, org.apache.avro.Schema> strMap3 = parser2.getTypes();
    org.apache.avro.Schema.Parser parser4 = new org.apache.avro.Schema.Parser();
    java.util.Map<String, org.apache.avro.Schema> strMap5 = parser4.getTypes();
    org.apache.avro.Schema.Parser parser6 = parser2.addTypes(strMap5);
    org.apache.avro.Schema.Parser parser8 = parser2.setValidateDefaults(true);
    org.apache.avro.Schema.Parser parser10 = parser8.setValidateDefaults(false);
    org.apache.avro.Schema.Field[] fieldArray11 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList12 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList12,
        fieldArray11);
    org.apache.avro.Schema schema14 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList12);
    boolean boolean15 = schema14.isNullable();
    String str16 = schema14.getNamespace();
    schema14.addProp("long type:RECORD pos:-1", "");
    java.util.Set<String> strSet20 = schema14.getAliases();
    org.apache.avro.ParseContext parseContext21 = new org.apache.avro.ParseContext();
    boolean boolean22 = parseContext21.hasNewSchemas();
    java.util.List<org.apache.avro.Schema> schemaList23 = parseContext21.resolveAllSchemas();
    org.apache.avro.Schema schema24 = org.apache.avro.Schema.createUnion(schemaList23);
    boolean boolean25 = schema14.equals((Object) schemaList23);
    org.apache.avro.Schema.Parser parser26 = parser8.addTypes((Iterable<org.apache.avro.Schema>) schemaList23);
    // The following exception was thrown during execution in test generation
    try {
      String str28 = schema1.toString((java.util.Collection<org.apache.avro.Schema>) schemaList23, true);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.avro.Schema.toJson(java.util.Set, String, com.fasterxml.jackson.core.JsonGenerator)\" because \"this.valueType\" is null");
    } catch (NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertNotNull(strMap3);
    org.junit.Assert.assertNotNull(strMap5);
    org.junit.Assert.assertNotNull(parser6);
    org.junit.Assert.assertNotNull(parser8);
    org.junit.Assert.assertNotNull(parser10);
    org.junit.Assert.assertNotNull(fieldArray11);
    org.junit.Assert.assertArrayEquals(fieldArray11, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    org.junit.Assert.assertNotNull(schema14);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    org.junit.Assert.assertNull(str16);
    org.junit.Assert.assertNotNull(strSet20);
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    org.junit.Assert.assertNotNull(schemaList23);
    org.junit.Assert.assertNotNull(schema24);
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    org.junit.Assert.assertNotNull(parser26);
  }

  @Test
  public void test075() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test075");
    org.apache.avro.ParseContext parseContext0 = new org.apache.avro.ParseContext();
    org.apache.avro.Schema schema2 = parseContext0.getNamedSchema("hi!");
    org.apache.avro.Schema schema4 = parseContext0.getNamedSchema("");
    parseContext0.commit();
    java.util.Map<String, org.apache.avro.Schema> strMap6 = parseContext0.typesByName();
    org.junit.Assert.assertNull(schema2);
    org.junit.Assert.assertNull(schema4);
    org.junit.Assert.assertNotNull(strMap6);
  }

  @Test
  public void test076() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test076");
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
    org.apache.avro.Schema.Field[] fieldArray15 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList16 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList16,
        fieldArray15);
    org.apache.avro.Schema schema18 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList16);
    boolean boolean20 = schema18.equals((Object) 1.0f);
    org.apache.avro.Schema.Type type21 = schema18.getType();
    boolean boolean22 = schema18.isUnion();
    String str23 = schema18.getNamespace();
    com.fasterxml.jackson.databind.JsonNode jsonNode24 = null;
    boolean boolean25 = schema18.isValidDefault(jsonNode24);
    boolean boolean27 = schema18.propsContainsKey("array");
    org.apache.avro.SchemaParser.ParseResult parseResult28 = parseContext0.commit(schema18);
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
    org.junit.Assert.assertNotNull(fieldArray15);
    org.junit.Assert.assertArrayEquals(fieldArray15, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    org.junit.Assert.assertNotNull(schema18);
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    org.junit.Assert.assertTrue("'" + type21 + "' != '" + org.apache.avro.Schema.Type.RECORD + "'",
        type21.equals(org.apache.avro.Schema.Type.RECORD));
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    org.junit.Assert.assertNull(str23);
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    org.junit.Assert.assertNotNull(parseResult28);
  }

  @Test
  public void test077() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test077");
    org.apache.avro.Schema.Field[] fieldArray0 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList1 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList1,
        fieldArray0);
    org.apache.avro.Schema schema3 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
    boolean boolean4 = schema3.isNullable();
    java.util.Set<String> strSet5 = schema3.getAliases();
    String str6 = schema3.toString();
    org.apache.avro.Schema.Field[] fieldArray7 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList8 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean9 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList8,
        fieldArray7);
    org.apache.avro.Schema schema10 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList8);
    boolean boolean11 = schema10.isNullable();
    java.util.Set<String> strSet12 = schema10.getAliases();
    String str13 = schema10.toString();
    org.apache.avro.Schema.Field field15 = schema10.getField("long");
    boolean boolean16 = schema10.hasProps();
    org.apache.avro.Schema schema17 = org.apache.avro.Schema.applyAliases(schema3, schema10);
    org.apache.avro.LogicalType logicalType18 = schema10.getLogicalType();
    org.apache.avro.ParseContext parseContext19 = new org.apache.avro.ParseContext();
    boolean boolean20 = parseContext19.hasNewSchemas();
    java.util.Map<String, org.apache.avro.Schema> strMap21 = parseContext19.typesByName();
    org.apache.avro.Schema.Field[] fieldArray22 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList23 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean24 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList23,
        fieldArray22);
    org.apache.avro.Schema schema25 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList23);
    boolean boolean26 = schema25.isNullable();
    java.util.Set<String> strSet27 = schema25.getAliases();
    String str28 = schema25.toString();
    org.apache.avro.Schema.Field field30 = schema25.getField("long");
    java.util.List<org.apache.avro.Schema.Field> fieldList31 = schema25.getFields();
    boolean boolean33 = schema25.equals((Object) "long type:RECORD pos:-1");
    java.util.List<org.apache.avro.Schema.Field> fieldList34 = schema25.getFields();
    Object obj36 = null;
    Object obj37 = schema25.getObjectProp("", obj36);
    org.apache.avro.Schema schema38 = parseContext19.resolve(schema25);
    schema10.addAllProps((org.apache.avro.JsonProperties) schema38);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema40 = schema38.getValueType();
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a map: {\"type\":\"record\",\"fields\":[]}");
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
    org.junit.Assert.assertNotNull(fieldArray7);
    org.junit.Assert.assertArrayEquals(fieldArray7, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    org.junit.Assert.assertNotNull(schema10);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    org.junit.Assert.assertNotNull(strSet12);
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str13,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNull(field15);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    org.junit.Assert.assertNotNull(schema17);
    org.junit.Assert.assertNull(logicalType18);
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    org.junit.Assert.assertNotNull(strMap21);
    org.junit.Assert.assertNotNull(fieldArray22);
    org.junit.Assert.assertArrayEquals(fieldArray22, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    org.junit.Assert.assertNotNull(schema25);
    org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    org.junit.Assert.assertNotNull(strSet27);
    org.junit.Assert.assertEquals("'" + str28 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str28,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNull(field30);
    org.junit.Assert.assertNotNull(fieldList31);
    org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    org.junit.Assert.assertNotNull(fieldList34);
    org.junit.Assert.assertNull(obj37);
    org.junit.Assert.assertNotNull(schema38);
  }

  @Test
  public void test078() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test078");
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
    java.io.InputStream inputStream31 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema32 = parser30.parse(inputStream31);
      org.junit.Assert
          .fail("Expected exception of type org.apache.avro.SchemaParseException; message: Cannot parse <null> schema");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
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
  public void test079() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test079");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.DOUBLE;
    org.apache.avro.Schema.SeenPair seenPair2 = new org.apache.avro.Schema.SeenPair((Object) type0, (Object) 1);
    org.apache.avro.Schema.Field[] fieldArray3 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList4 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList4,
        fieldArray3);
    org.apache.avro.Schema schema6 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList4);
    boolean boolean7 = schema6.isNullable();
    java.util.Set<String> strSet8 = schema6.getAliases();
    com.fasterxml.jackson.databind.JsonNode jsonNode9 = null;
    boolean boolean10 = schema6.isValidDefault(jsonNode9);
    String str11 = schema6.getDoc();
    org.apache.avro.Schema schema12 = org.apache.avro.Schema.createMap(schema6);
    boolean boolean13 = seenPair2.equals((Object) schema6);
    org.apache.avro.Schema.Field[] fieldArray14 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList15 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList15,
        fieldArray14);
    org.apache.avro.Schema schema17 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList15);
    boolean boolean19 = schema17.equals((Object) 1.0f);
    org.apache.avro.Schema.Type type20 = schema17.getType();
    boolean boolean21 = schema17.isUnion();
    boolean boolean22 = seenPair2.equals((Object) schema17);
    org.apache.avro.ParseContext parseContext23 = new org.apache.avro.ParseContext();
    org.apache.avro.Schema.Field[] fieldArray24 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList25 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean26 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList25,
        fieldArray24);
    org.apache.avro.Schema schema27 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList25);
    boolean boolean28 = schema27.isNullable();
    java.util.Set<String> strSet29 = schema27.getAliases();
    com.fasterxml.jackson.databind.JsonNode jsonNode30 = null;
    boolean boolean31 = schema27.isValidDefault(jsonNode30);
    String str32 = schema27.getDoc();
    org.apache.avro.Schema schema33 = org.apache.avro.Schema.createMap(schema27);
    boolean boolean34 = schema27.isError();
    org.apache.avro.Schema.Type type35 = schema27.getType();
    org.apache.avro.Schema schema36 = parseContext23.resolve(schema27);
    org.apache.avro.Schema.Parser parser37 = new org.apache.avro.Schema.Parser(parseContext23);
    org.apache.avro.Schema.Field[] fieldArray38 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList39 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean40 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList39,
        fieldArray38);
    org.apache.avro.Schema schema41 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList39);
    boolean boolean42 = schema41.isNullable();
    org.apache.avro.Schema schema43 = org.apache.avro.Schema.createArray(schema41);
    Object obj45 = schema43.getObjectProp("");
    org.apache.avro.Schema.Type type46 = schema43.getType();
    org.apache.avro.Schema.Type type47 = schema43.getType();
    org.apache.avro.SchemaParser.ParseResult parseResult48 = parseContext23.commit(schema43);
    boolean boolean49 = seenPair2.equals((Object) parseContext23);
    org.apache.avro.Schema.Field[] fieldArray50 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList51 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean52 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList51,
        fieldArray50);
    org.apache.avro.Schema schema53 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList51);
    boolean boolean54 = schema53.isUnion();
    org.apache.avro.Schema.Type type55 = schema53.getType();
    org.apache.avro.ParseContext parseContext56 = new org.apache.avro.ParseContext();
    boolean boolean57 = parseContext56.hasNewSchemas();
    java.util.Map<String, org.apache.avro.Schema> strMap58 = parseContext56.typesByName();
    org.apache.avro.Schema.Field[] fieldArray59 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList60 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean61 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList60,
        fieldArray59);
    org.apache.avro.Schema schema62 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList60);
    boolean boolean63 = schema62.isNullable();
    java.util.Set<String> strSet64 = schema62.getAliases();
    String str65 = schema62.toString();
    org.apache.avro.Schema.Field field67 = schema62.getField("long");
    java.util.List<org.apache.avro.Schema.Field> fieldList68 = schema62.getFields();
    boolean boolean70 = schema62.equals((Object) "long type:RECORD pos:-1");
    java.util.List<org.apache.avro.Schema.Field> fieldList71 = schema62.getFields();
    Object obj73 = null;
    Object obj74 = schema62.getObjectProp("", obj73);
    org.apache.avro.Schema schema75 = parseContext56.resolve(schema62);
    parseContext56.commit();
    java.util.List<org.apache.avro.Schema> schemaList77 = parseContext56.resolveAllSchemas();
    String str79 = schema53.toString((java.util.Collection<org.apache.avro.Schema>) schemaList77, false);
    boolean boolean80 = seenPair2.equals((Object) schema53);
    org.apache.avro.Schema.Field[] fieldArray81 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList82 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean83 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList82,
        fieldArray81);
    org.apache.avro.Schema schema84 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList82);
    String str85 = schema84.getName();
    org.apache.avro.LogicalType logicalType86 = schema84.getLogicalType();
    String str87 = schema84.getNamespace();
    org.apache.avro.Schema.Field[] fieldArray88 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList89 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean90 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList89,
        fieldArray88);
    org.apache.avro.Schema schema91 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList89);
    boolean boolean93 = schema91.equals((Object) 1.0f);
    String str95 = schema91.toString(false);
    boolean boolean96 = schema91.isNullable();
    schema84.putAll((org.apache.avro.JsonProperties) schema91);
    boolean boolean98 = seenPair2.equals((Object) schema91);
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.DOUBLE + "'",
        type0.equals(org.apache.avro.Schema.Type.DOUBLE));
    org.junit.Assert.assertNotNull(fieldArray3);
    org.junit.Assert.assertArrayEquals(fieldArray3, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    org.junit.Assert.assertNotNull(schema6);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertNotNull(strSet8);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    org.junit.Assert.assertNull(str11);
    org.junit.Assert.assertNotNull(schema12);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    org.junit.Assert.assertNotNull(fieldArray14);
    org.junit.Assert.assertArrayEquals(fieldArray14, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    org.junit.Assert.assertNotNull(schema17);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    org.junit.Assert.assertTrue("'" + type20 + "' != '" + org.apache.avro.Schema.Type.RECORD + "'",
        type20.equals(org.apache.avro.Schema.Type.RECORD));
    org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    org.junit.Assert.assertNotNull(fieldArray24);
    org.junit.Assert.assertArrayEquals(fieldArray24, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    org.junit.Assert.assertNotNull(schema27);
    org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    org.junit.Assert.assertNotNull(strSet29);
    org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    org.junit.Assert.assertNull(str32);
    org.junit.Assert.assertNotNull(schema33);
    org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    org.junit.Assert.assertTrue("'" + type35 + "' != '" + org.apache.avro.Schema.Type.RECORD + "'",
        type35.equals(org.apache.avro.Schema.Type.RECORD));
    org.junit.Assert.assertNotNull(schema36);
    org.junit.Assert.assertNotNull(fieldArray38);
    org.junit.Assert.assertArrayEquals(fieldArray38, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    org.junit.Assert.assertNotNull(schema41);
    org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    org.junit.Assert.assertNotNull(schema43);
    org.junit.Assert.assertNull(obj45);
    org.junit.Assert.assertTrue("'" + type46 + "' != '" + org.apache.avro.Schema.Type.ARRAY + "'",
        type46.equals(org.apache.avro.Schema.Type.ARRAY));
    org.junit.Assert.assertTrue("'" + type47 + "' != '" + org.apache.avro.Schema.Type.ARRAY + "'",
        type47.equals(org.apache.avro.Schema.Type.ARRAY));
    org.junit.Assert.assertNotNull(parseResult48);
    org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    org.junit.Assert.assertNotNull(fieldArray50);
    org.junit.Assert.assertArrayEquals(fieldArray50, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    org.junit.Assert.assertNotNull(schema53);
    org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    org.junit.Assert.assertTrue("'" + type55 + "' != '" + org.apache.avro.Schema.Type.RECORD + "'",
        type55.equals(org.apache.avro.Schema.Type.RECORD));
    org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    org.junit.Assert.assertNotNull(strMap58);
    org.junit.Assert.assertNotNull(fieldArray59);
    org.junit.Assert.assertArrayEquals(fieldArray59, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    org.junit.Assert.assertNotNull(schema62);
    org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    org.junit.Assert.assertNotNull(strSet64);
    org.junit.Assert.assertEquals("'" + str65 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str65,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNull(field67);
    org.junit.Assert.assertNotNull(fieldList68);
    org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    org.junit.Assert.assertNotNull(fieldList71);
    org.junit.Assert.assertNull(obj74);
    org.junit.Assert.assertNotNull(schema75);
    org.junit.Assert.assertNotNull(schemaList77);
    org.junit.Assert.assertEquals("'" + str79 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str79,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    org.junit.Assert.assertNotNull(fieldArray81);
    org.junit.Assert.assertArrayEquals(fieldArray81, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    org.junit.Assert.assertNotNull(schema84);
    org.junit.Assert.assertNull(str85);
    org.junit.Assert.assertNull(logicalType86);
    org.junit.Assert.assertNull(str87);
    org.junit.Assert.assertNotNull(fieldArray88);
    org.junit.Assert.assertArrayEquals(fieldArray88, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    org.junit.Assert.assertNotNull(schema91);
    org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    org.junit.Assert.assertEquals("'" + str95 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str95,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
  }

  @Test
  public void test080() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test080");
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
    java.util.List<org.apache.avro.Schema.Field> fieldList28 = schema24.getFields();
    // The following exception was thrown during execution in test generation
    try {
      Integer int30 = schema24.getIndexNamed("boolean");
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a union: {\"type\":\"record\",\"fields\":[],\"long type:RECORD pos:-1\":\"record\"}");
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
    org.junit.Assert.assertNotNull(fieldList28);
  }

  @Test
  public void test081() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test081");
    org.apache.avro.Schema.Field[] fieldArray0 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList1 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList1,
        fieldArray0);
    org.apache.avro.Schema schema3 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
    boolean boolean4 = schema3.isUnion();
    java.util.Set<String> strSet5 = schema3.getAliases();
    org.apache.avro.Schema.Field[] fieldArray7 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList8 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean9 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList8,
        fieldArray7);
    org.apache.avro.Schema schema10 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList8);
    boolean boolean12 = schema10.equals((Object) 1.0f);
    org.apache.avro.Schema.Type type13 = schema10.getType();
    schema3.addProp("long", (Object) type13);
    org.apache.avro.ParseContext parseContext16 = new org.apache.avro.ParseContext();
    boolean boolean17 = parseContext16.hasNewSchemas();
    org.apache.avro.Schema schema19 = parseContext16.getNamedSchema("boolean");
    org.apache.avro.Schema.Field[] fieldArray20 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList21 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList21,
        fieldArray20);
    org.apache.avro.Schema schema23 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList21);
    boolean boolean25 = schema23.equals((Object) 1.0f);
    org.apache.avro.Schema.Type type26 = schema23.getType();
    org.apache.avro.LogicalType logicalType27 = schema23.getLogicalType();
    String str28 = schema23.getFullName();
    org.apache.avro.Schema schema29 = parseContext16.resolve(schema23);
    org.apache.avro.Schema.Field[] fieldArray30 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList31 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean32 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList31,
        fieldArray30);
    org.apache.avro.Schema schema33 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList31);
    boolean boolean34 = schema33.isNullable();
    java.util.Set<String> strSet35 = schema33.getAliases();
    String str36 = schema33.toString();
    org.apache.avro.Schema.Field field38 = schema33.getField("long");
    java.util.List<org.apache.avro.Schema.Field> fieldList39 = schema33.getFields();
    org.apache.avro.Schema schema40 = parseContext16.resolve(schema33);
    Object obj41 = schema3.getObjectProp("{\"type\":\"array\",\"items\":{\"type\":\"record\",\"fields\":[]}}",
        (Object) schema33);
    org.junit.Assert.assertNotNull(fieldArray0);
    org.junit.Assert.assertArrayEquals(fieldArray0, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertNotNull(schema3);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    org.junit.Assert.assertNotNull(strSet5);
    org.junit.Assert.assertNotNull(fieldArray7);
    org.junit.Assert.assertArrayEquals(fieldArray7, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    org.junit.Assert.assertNotNull(schema10);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    org.junit.Assert.assertTrue("'" + type13 + "' != '" + org.apache.avro.Schema.Type.RECORD + "'",
        type13.equals(org.apache.avro.Schema.Type.RECORD));
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    org.junit.Assert.assertNull(schema19);
    org.junit.Assert.assertNotNull(fieldArray20);
    org.junit.Assert.assertArrayEquals(fieldArray20, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    org.junit.Assert.assertNotNull(schema23);
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    org.junit.Assert.assertTrue("'" + type26 + "' != '" + org.apache.avro.Schema.Type.RECORD + "'",
        type26.equals(org.apache.avro.Schema.Type.RECORD));
    org.junit.Assert.assertNull(logicalType27);
    org.junit.Assert.assertNull(str28);
    org.junit.Assert.assertNotNull(schema29);
    org.junit.Assert.assertNotNull(fieldArray30);
    org.junit.Assert.assertArrayEquals(fieldArray30, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    org.junit.Assert.assertNotNull(schema33);
    org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    org.junit.Assert.assertNotNull(strSet35);
    org.junit.Assert.assertEquals("'" + str36 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str36,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNull(field38);
    org.junit.Assert.assertNotNull(fieldList39);
    org.junit.Assert.assertNotNull(schema40);
    org.junit.Assert.assertNotNull(obj41);
    org.junit.Assert.assertEquals(obj41.toString(), "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertEquals(String.valueOf(obj41), "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertEquals(java.util.Objects.toString(obj41), "{\"type\":\"record\",\"fields\":[]}");
  }

  @Test
  public void test082() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test082");
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
    java.util.Map<String, org.apache.avro.Schema> strMap25 = parseContext0.typesByName();
    org.apache.avro.Schema.Field[] fieldArray26 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList27 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean28 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList27,
        fieldArray26);
    org.apache.avro.Schema schema29 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList27);
    boolean boolean30 = schema29.isNullable();
    org.apache.avro.Schema schema31 = org.apache.avro.Schema.createArray(schema29);
    Object obj33 = schema31.getObjectProp("");
    org.apache.avro.Schema schema34 = parseContext0.resolve(schema31);
    // The following exception was thrown during execution in test generation
    try {
      int int36 = schema31.getEnumOrdinal(
          "{\"type\":\"record\",\"fields\":[],\"long type:RECORD pos:-1\":\"long type:RECORD pos:-1\"}");
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: {\"type\":\"array\",\"items\":{\"type\":\"record\",\"fields\":[]}}");
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
    org.junit.Assert.assertNotNull(strMap25);
    org.junit.Assert.assertNotNull(fieldArray26);
    org.junit.Assert.assertArrayEquals(fieldArray26, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    org.junit.Assert.assertNotNull(schema29);
    org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    org.junit.Assert.assertNotNull(schema31);
    org.junit.Assert.assertNull(obj33);
    org.junit.Assert.assertNotNull(schema34);
  }

  @Test
  public void test083() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test083");
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
    java.io.InputStream inputStream29 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema30 = parser4.parse(inputStream29);
      org.junit.Assert
          .fail("Expected exception of type org.apache.avro.SchemaParseException; message: Cannot parse <null> schema");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
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
  }

  @Test
  public void test084() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test084");
    org.apache.avro.ParseContext parseContext0 = new org.apache.avro.ParseContext();
    boolean boolean1 = parseContext0.hasNewSchemas();
    java.util.Map<String, org.apache.avro.Schema> strMap2 = parseContext0.typesByName();
    parseContext0.rollback();
    org.apache.avro.Schema.Field[] fieldArray4 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList5 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList5,
        fieldArray4);
    org.apache.avro.Schema schema7 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList5);
    boolean boolean8 = schema7.isUnion();
    org.apache.avro.Schema schema9 = org.apache.avro.Schema.createArray(schema7);
    org.apache.avro.SchemaParser.ParseResult parseResult10 = parseContext0.commit(schema9);
    org.apache.avro.Schema.Parser parser11 = new org.apache.avro.Schema.Parser(parseContext0);
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    org.junit.Assert.assertNotNull(strMap2);
    org.junit.Assert.assertNotNull(fieldArray4);
    org.junit.Assert.assertArrayEquals(fieldArray4, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    org.junit.Assert.assertNotNull(schema7);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    org.junit.Assert.assertNotNull(schema9);
    org.junit.Assert.assertNotNull(parseResult10);
  }

  @Test
  public void test085() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test085");
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
    String str17 = schema7.getDoc();
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
    org.junit.Assert.assertNull(str17);
  }

  @Test
  public void test086() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test086");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.DOUBLE;
    org.apache.avro.Schema.SeenPair seenPair2 = new org.apache.avro.Schema.SeenPair((Object) type0, (Object) 1);
    org.apache.avro.Schema.Field[] fieldArray3 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList4 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList4,
        fieldArray3);
    org.apache.avro.Schema schema6 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList4);
    boolean boolean7 = schema6.isNullable();
    java.util.Set<String> strSet8 = schema6.getAliases();
    com.fasterxml.jackson.databind.JsonNode jsonNode9 = null;
    boolean boolean10 = schema6.isValidDefault(jsonNode9);
    String str11 = schema6.getDoc();
    org.apache.avro.Schema schema12 = org.apache.avro.Schema.createMap(schema6);
    boolean boolean13 = seenPair2.equals((Object) schema6);
    org.apache.avro.Schema.Field[] fieldArray14 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList15 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList15,
        fieldArray14);
    org.apache.avro.Schema schema17 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList15);
    boolean boolean19 = schema17.equals((Object) 1.0f);
    org.apache.avro.Schema.Type type20 = schema17.getType();
    boolean boolean21 = schema17.isUnion();
    boolean boolean22 = seenPair2.equals((Object) schema17);
    org.apache.avro.ParseContext parseContext23 = new org.apache.avro.ParseContext();
    org.apache.avro.Schema.Field[] fieldArray24 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList25 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean26 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList25,
        fieldArray24);
    org.apache.avro.Schema schema27 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList25);
    boolean boolean28 = schema27.isNullable();
    java.util.Set<String> strSet29 = schema27.getAliases();
    com.fasterxml.jackson.databind.JsonNode jsonNode30 = null;
    boolean boolean31 = schema27.isValidDefault(jsonNode30);
    String str32 = schema27.getDoc();
    org.apache.avro.Schema schema33 = org.apache.avro.Schema.createMap(schema27);
    boolean boolean34 = schema27.isError();
    org.apache.avro.Schema.Type type35 = schema27.getType();
    org.apache.avro.Schema schema36 = parseContext23.resolve(schema27);
    org.apache.avro.Schema.Parser parser37 = new org.apache.avro.Schema.Parser(parseContext23);
    org.apache.avro.Schema.Field[] fieldArray38 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList39 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean40 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList39,
        fieldArray38);
    org.apache.avro.Schema schema41 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList39);
    boolean boolean42 = schema41.isNullable();
    org.apache.avro.Schema schema43 = org.apache.avro.Schema.createArray(schema41);
    Object obj45 = schema43.getObjectProp("");
    org.apache.avro.Schema.Type type46 = schema43.getType();
    org.apache.avro.Schema.Type type47 = schema43.getType();
    org.apache.avro.SchemaParser.ParseResult parseResult48 = parseContext23.commit(schema43);
    boolean boolean49 = seenPair2.equals((Object) parseContext23);
    org.apache.avro.Schema.Field[] fieldArray50 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList51 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean52 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList51,
        fieldArray50);
    org.apache.avro.Schema schema53 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList51);
    boolean boolean54 = schema53.isUnion();
    org.apache.avro.Schema.Type type55 = schema53.getType();
    org.apache.avro.ParseContext parseContext56 = new org.apache.avro.ParseContext();
    boolean boolean57 = parseContext56.hasNewSchemas();
    java.util.Map<String, org.apache.avro.Schema> strMap58 = parseContext56.typesByName();
    org.apache.avro.Schema.Field[] fieldArray59 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList60 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean61 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList60,
        fieldArray59);
    org.apache.avro.Schema schema62 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList60);
    boolean boolean63 = schema62.isNullable();
    java.util.Set<String> strSet64 = schema62.getAliases();
    String str65 = schema62.toString();
    org.apache.avro.Schema.Field field67 = schema62.getField("long");
    java.util.List<org.apache.avro.Schema.Field> fieldList68 = schema62.getFields();
    boolean boolean70 = schema62.equals((Object) "long type:RECORD pos:-1");
    java.util.List<org.apache.avro.Schema.Field> fieldList71 = schema62.getFields();
    Object obj73 = null;
    Object obj74 = schema62.getObjectProp("", obj73);
    org.apache.avro.Schema schema75 = parseContext56.resolve(schema62);
    parseContext56.commit();
    java.util.List<org.apache.avro.Schema> schemaList77 = parseContext56.resolveAllSchemas();
    String str79 = schema53.toString((java.util.Collection<org.apache.avro.Schema>) schemaList77, false);
    boolean boolean80 = seenPair2.equals((Object) schema53);
    org.apache.avro.LogicalType logicalType81 = schema53.getLogicalType();
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.DOUBLE + "'",
        type0.equals(org.apache.avro.Schema.Type.DOUBLE));
    org.junit.Assert.assertNotNull(fieldArray3);
    org.junit.Assert.assertArrayEquals(fieldArray3, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    org.junit.Assert.assertNotNull(schema6);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertNotNull(strSet8);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    org.junit.Assert.assertNull(str11);
    org.junit.Assert.assertNotNull(schema12);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    org.junit.Assert.assertNotNull(fieldArray14);
    org.junit.Assert.assertArrayEquals(fieldArray14, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    org.junit.Assert.assertNotNull(schema17);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    org.junit.Assert.assertTrue("'" + type20 + "' != '" + org.apache.avro.Schema.Type.RECORD + "'",
        type20.equals(org.apache.avro.Schema.Type.RECORD));
    org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    org.junit.Assert.assertNotNull(fieldArray24);
    org.junit.Assert.assertArrayEquals(fieldArray24, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    org.junit.Assert.assertNotNull(schema27);
    org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    org.junit.Assert.assertNotNull(strSet29);
    org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    org.junit.Assert.assertNull(str32);
    org.junit.Assert.assertNotNull(schema33);
    org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    org.junit.Assert.assertTrue("'" + type35 + "' != '" + org.apache.avro.Schema.Type.RECORD + "'",
        type35.equals(org.apache.avro.Schema.Type.RECORD));
    org.junit.Assert.assertNotNull(schema36);
    org.junit.Assert.assertNotNull(fieldArray38);
    org.junit.Assert.assertArrayEquals(fieldArray38, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    org.junit.Assert.assertNotNull(schema41);
    org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    org.junit.Assert.assertNotNull(schema43);
    org.junit.Assert.assertNull(obj45);
    org.junit.Assert.assertTrue("'" + type46 + "' != '" + org.apache.avro.Schema.Type.ARRAY + "'",
        type46.equals(org.apache.avro.Schema.Type.ARRAY));
    org.junit.Assert.assertTrue("'" + type47 + "' != '" + org.apache.avro.Schema.Type.ARRAY + "'",
        type47.equals(org.apache.avro.Schema.Type.ARRAY));
    org.junit.Assert.assertNotNull(parseResult48);
    org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    org.junit.Assert.assertNotNull(fieldArray50);
    org.junit.Assert.assertArrayEquals(fieldArray50, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    org.junit.Assert.assertNotNull(schema53);
    org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    org.junit.Assert.assertTrue("'" + type55 + "' != '" + org.apache.avro.Schema.Type.RECORD + "'",
        type55.equals(org.apache.avro.Schema.Type.RECORD));
    org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    org.junit.Assert.assertNotNull(strMap58);
    org.junit.Assert.assertNotNull(fieldArray59);
    org.junit.Assert.assertArrayEquals(fieldArray59, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    org.junit.Assert.assertNotNull(schema62);
    org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    org.junit.Assert.assertNotNull(strSet64);
    org.junit.Assert.assertEquals("'" + str65 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str65,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNull(field67);
    org.junit.Assert.assertNotNull(fieldList68);
    org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    org.junit.Assert.assertNotNull(fieldList71);
    org.junit.Assert.assertNull(obj74);
    org.junit.Assert.assertNotNull(schema75);
    org.junit.Assert.assertNotNull(schemaList77);
    org.junit.Assert.assertEquals("'" + str79 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str79,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    org.junit.Assert.assertNull(logicalType81);
  }

  @Test
  public void test087() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test087");
    org.apache.avro.ParseContext parseContext0 = new org.apache.avro.ParseContext();
    org.apache.avro.Schema schema2 = parseContext0.getNamedSchema("hi!");
    org.apache.avro.Schema schema4 = parseContext0.getNamedSchema("");
    java.util.List<org.apache.avro.Schema> schemaList5 = parseContext0.resolveAllSchemas();
    boolean boolean7 = parseContext0.contains("{\n  \"type\" : \"record\",\n  \"fields\" : [ ]\n}");
    boolean boolean9 = parseContext0
        .contains("{\"type\":\"record\",\"fields\":[],\"long type:RECORD pos:-1\":\"long type:RECORD pos:-1\"}");
    org.junit.Assert.assertNull(schema2);
    org.junit.Assert.assertNull(schema4);
    org.junit.Assert.assertNotNull(schemaList5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
  }

  @Test
  public void test088() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test088");
    org.apache.avro.Schema.Field[] fieldArray0 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList1 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList1,
        fieldArray0);
    org.apache.avro.Schema schema3 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
    String str4 = schema3.getName();
    org.apache.avro.LogicalType logicalType5 = schema3.getLogicalType();
    String str6 = schema3.getNamespace();
    org.apache.avro.ParseContext parseContext7 = new org.apache.avro.ParseContext();
    boolean boolean8 = parseContext7.hasNewSchemas();
    org.apache.avro.Schema schema10 = parseContext7.getNamedSchema("boolean");
    java.util.Map<String, org.apache.avro.Schema> strMap11 = parseContext7.typesByName();
    boolean boolean12 = schema3.equals((Object) parseContext7);
    org.apache.avro.Schema schema14 = parseContext7.getNamedSchema("");
    org.junit.Assert.assertNotNull(fieldArray0);
    org.junit.Assert.assertArrayEquals(fieldArray0, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertNotNull(schema3);
    org.junit.Assert.assertNull(str4);
    org.junit.Assert.assertNull(logicalType5);
    org.junit.Assert.assertNull(str6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    org.junit.Assert.assertNull(schema10);
    org.junit.Assert.assertNotNull(strMap11);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    org.junit.Assert.assertNull(schema14);
  }

  @Test
  public void test089() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test089");
    org.apache.avro.NameValidator nameValidator0 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.Schema.Parser parser1 = new org.apache.avro.Schema.Parser(nameValidator0);
    org.apache.avro.Schema.Parser parser3 = parser1.setValidateDefaults(true);
    org.apache.avro.ParseContext parseContext4 = new org.apache.avro.ParseContext();
    boolean boolean5 = parseContext4.hasNewSchemas();
    org.apache.avro.Schema schema7 = parseContext4.getNamedSchema("boolean");
    org.apache.avro.Schema.Field[] fieldArray8 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList9 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList9,
        fieldArray8);
    org.apache.avro.Schema schema11 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList9);
    boolean boolean13 = schema11.equals((Object) 1.0f);
    org.apache.avro.Schema.Type type14 = schema11.getType();
    org.apache.avro.LogicalType logicalType15 = schema11.getLogicalType();
    String str16 = schema11.getFullName();
    org.apache.avro.Schema schema17 = parseContext4.resolve(schema11);
    org.apache.avro.Schema.Field[] fieldArray18 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList19 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList19,
        fieldArray18);
    org.apache.avro.Schema schema21 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList19);
    boolean boolean22 = schema21.isNullable();
    java.util.Set<String> strSet23 = schema21.getAliases();
    String str24 = schema21.toString();
    org.apache.avro.Schema.Field field26 = schema21.getField("long");
    java.util.List<org.apache.avro.Schema.Field> fieldList27 = schema21.getFields();
    org.apache.avro.Schema schema28 = parseContext4.resolve(schema21);
    java.util.Map<String, org.apache.avro.Schema> strMap29 = parseContext4.typesByName();
    org.apache.avro.Schema.Parser parser30 = parser3.addTypes(strMap29);
    org.apache.avro.Schema.Parser parser31 = new org.apache.avro.Schema.Parser();
    java.util.Map<String, org.apache.avro.Schema> strMap32 = parser31.getTypes();
    org.apache.avro.Schema.Parser parser33 = new org.apache.avro.Schema.Parser();
    java.util.Map<String, org.apache.avro.Schema> strMap34 = parser33.getTypes();
    org.apache.avro.Schema.Parser parser35 = parser31.addTypes(strMap34);
    org.apache.avro.Schema.Parser parser36 = parser3.addTypes(strMap34);
// flaky "9) test089(RegressionTest0)":         org.junit.Assert.assertNull(nameValidator0);
    org.junit.Assert.assertNotNull(parser3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    org.junit.Assert.assertNull(schema7);
    org.junit.Assert.assertNotNull(fieldArray8);
    org.junit.Assert.assertArrayEquals(fieldArray8, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    org.junit.Assert.assertNotNull(schema11);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    org.junit.Assert.assertTrue("'" + type14 + "' != '" + org.apache.avro.Schema.Type.RECORD + "'",
        type14.equals(org.apache.avro.Schema.Type.RECORD));
    org.junit.Assert.assertNull(logicalType15);
    org.junit.Assert.assertNull(str16);
    org.junit.Assert.assertNotNull(schema17);
    org.junit.Assert.assertNotNull(fieldArray18);
    org.junit.Assert.assertArrayEquals(fieldArray18, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    org.junit.Assert.assertNotNull(schema21);
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    org.junit.Assert.assertNotNull(strSet23);
    org.junit.Assert.assertEquals("'" + str24 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str24,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNull(field26);
    org.junit.Assert.assertNotNull(fieldList27);
    org.junit.Assert.assertNotNull(schema28);
    org.junit.Assert.assertNotNull(strMap29);
    org.junit.Assert.assertNotNull(parser30);
    org.junit.Assert.assertNotNull(strMap32);
    org.junit.Assert.assertNotNull(strMap34);
    org.junit.Assert.assertNotNull(parser35);
    org.junit.Assert.assertNotNull(parser36);
  }

  @Test
  public void test090() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test090");
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
    org.apache.avro.Schema schema28 = org.apache.avro.Schema.createArray(schema24);
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
    org.junit.Assert.assertNotNull(schema28);
  }

  @Test
  public void test091() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test091");
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
    org.apache.avro.Schema.Parser parser16 = parser14.setValidateDefaults(true);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema18 = parser16.parseInternal("{\"type\":\"record\",\"fields\":[]}");
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.SchemaParseException; message: No name in schema: {\"type\":\"record\",\"fields\":[]}");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
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
    org.junit.Assert.assertNotNull(parser16);
  }

  @Test
  public void test092() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test092");
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
    java.util.Map<String, org.apache.avro.Schema> strMap25 = parseContext0.typesByName();
    parseContext0.commit();
    java.util.List<org.apache.avro.Schema> schemaList27 = parseContext0.resolveAllSchemas();
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
    org.junit.Assert.assertNotNull(strMap25);
    org.junit.Assert.assertNotNull(schemaList27);
  }

  @Test
  public void test093() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test093");
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
    org.apache.avro.Schema.Field[] fieldArray15 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList16 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList16,
        fieldArray15);
    org.apache.avro.Schema schema18 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList16);
    boolean boolean19 = schema18.isNullable();
    org.apache.avro.Schema schema20 = org.apache.avro.Schema.createArray(schema18);
    Object obj22 = schema20.getObjectProp("");
    org.apache.avro.Schema.Type type23 = schema20.getType();
    org.apache.avro.Schema.Type type24 = schema20.getType();
    org.apache.avro.SchemaParser.ParseResult parseResult25 = parseContext0.commit(schema20);
    parseContext0.rollback();
    java.util.List<org.apache.avro.Schema> schemaList27 = parseContext0.resolveAllSchemas();
    Class<?> wildcardClass28 = schemaList27.getClass();
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
    org.junit.Assert.assertNotNull(fieldArray15);
    org.junit.Assert.assertArrayEquals(fieldArray15, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    org.junit.Assert.assertNotNull(schema18);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    org.junit.Assert.assertNotNull(schema20);
    org.junit.Assert.assertNull(obj22);
    org.junit.Assert.assertTrue("'" + type23 + "' != '" + org.apache.avro.Schema.Type.ARRAY + "'",
        type23.equals(org.apache.avro.Schema.Type.ARRAY));
    org.junit.Assert.assertTrue("'" + type24 + "' != '" + org.apache.avro.Schema.Type.ARRAY + "'",
        type24.equals(org.apache.avro.Schema.Type.ARRAY));
    org.junit.Assert.assertNotNull(parseResult25);
    org.junit.Assert.assertNotNull(schemaList27);
    org.junit.Assert.assertNotNull(wildcardClass28);
  }

  @Test
  public void test094() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test094");
    org.apache.avro.ParseContext parseContext0 = new org.apache.avro.ParseContext();
    org.apache.avro.Schema schema2 = parseContext0.getNamedSchema("hi!");
    org.apache.avro.Schema schema4 = parseContext0.getNamedSchema("");
    parseContext0.commit();
    org.apache.avro.Schema.Field[] fieldArray6 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList7 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList7,
        fieldArray6);
    org.apache.avro.Schema schema9 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList7);
    boolean boolean11 = schema9.equals((Object) 1.0f);
    org.apache.avro.Schema.Type type12 = schema9.getType();
    org.apache.avro.LogicalType logicalType13 = schema9.getLogicalType();
    org.apache.avro.Schema schema14 = parseContext0.resolve(schema9);
    String str15 = schema9.getName();
    org.junit.Assert.assertNull(schema2);
    org.junit.Assert.assertNull(schema4);
    org.junit.Assert.assertNotNull(fieldArray6);
    org.junit.Assert.assertArrayEquals(fieldArray6, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    org.junit.Assert.assertNotNull(schema9);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    org.junit.Assert.assertTrue("'" + type12 + "' != '" + org.apache.avro.Schema.Type.RECORD + "'",
        type12.equals(org.apache.avro.Schema.Type.RECORD));
    org.junit.Assert.assertNull(logicalType13);
    org.junit.Assert.assertNotNull(schema14);
    org.junit.Assert.assertNull(str15);
  }

  @Test
  public void test095() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test095");
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
    boolean boolean11 = schema3.equals((Object) "long type:RECORD pos:-1");
    java.util.List<org.apache.avro.Schema.Field> fieldList12 = schema3.getFields();
    org.apache.avro.Schema schema13 = org.apache.avro.Schema.createRecord(fieldList12);
    boolean boolean15 = schema13.equals((Object) (short) -1);
    schema13.addProp("", "array");
    org.apache.avro.ParseContext parseContext19 = new org.apache.avro.ParseContext();
    boolean boolean20 = parseContext19.hasNewSchemas();
    java.util.Map<String, org.apache.avro.Schema> strMap21 = parseContext19.typesByName();
    parseContext19.rollback();
    java.util.List<org.apache.avro.Schema> schemaList23 = parseContext19.resolveAllSchemas();
    String str25 = schema13.toString((java.util.Collection<org.apache.avro.Schema>) schemaList23, false);
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
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    org.junit.Assert.assertNotNull(fieldList12);
    org.junit.Assert.assertNotNull(schema13);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    org.junit.Assert.assertNotNull(strMap21);
    org.junit.Assert.assertNotNull(schemaList23);
    org.junit.Assert.assertEquals("'" + str25 + "' != '" + "{\"type\":\"record\",\"fields\":[],\"\":\"array\"}" + "'",
        str25, "{\"type\":\"record\",\"fields\":[],\"\":\"array\"}");
  }

  @Test
  public void test096() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test096");
    org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
    java.util.Map<String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
    org.apache.avro.Schema.Parser parser3 = parser0.setValidateDefaults(true);
    org.apache.avro.Schema.Parser parser5 = parser0.setValidateDefaults(true);
    org.apache.avro.ParseContext parseContext6 = new org.apache.avro.ParseContext();
    org.apache.avro.Schema schema8 = parseContext6.getNamedSchema("hi!");
    org.apache.avro.Schema schema10 = parseContext6.getNamedSchema("");
    java.util.List<org.apache.avro.Schema> schemaList11 = parseContext6.resolveAllSchemas();
    org.apache.avro.Schema.Parser parser12 = parser5.addTypes((Iterable<org.apache.avro.Schema>) schemaList11);
    java.util.Map<String, org.apache.avro.Schema> strMap13 = parser12.getTypes();
    java.io.File file14 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema15 = parser12.parse(file14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    } catch (NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(strMap1);
    org.junit.Assert.assertNotNull(parser3);
    org.junit.Assert.assertNotNull(parser5);
    org.junit.Assert.assertNull(schema8);
    org.junit.Assert.assertNull(schema10);
    org.junit.Assert.assertNotNull(schemaList11);
    org.junit.Assert.assertNotNull(parser12);
    org.junit.Assert.assertNotNull(strMap13);
  }

  @Test
  public void test097() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test097");
    org.apache.avro.ParseContext parseContext0 = new org.apache.avro.ParseContext();
    boolean boolean1 = parseContext0.hasNewSchemas();
    java.util.Map<String, org.apache.avro.Schema> strMap2 = parseContext0.typesByName();
    boolean boolean4 = parseContext0.contains("record");
    parseContext0.rollback();
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    org.junit.Assert.assertNotNull(strMap2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
  }

  @Test
  public void test098() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test098");
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
    org.apache.avro.Schema.Field[] fieldArray15 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList16 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList16,
        fieldArray15);
    org.apache.avro.Schema schema18 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList16);
    boolean boolean19 = schema18.isNullable();
    org.apache.avro.Schema schema20 = org.apache.avro.Schema.createArray(schema18);
    Object obj22 = schema20.getObjectProp("");
    org.apache.avro.Schema.Type type23 = schema20.getType();
    org.apache.avro.Schema.Type type24 = schema20.getType();
    org.apache.avro.SchemaParser.ParseResult parseResult25 = parseContext0.commit(schema20);
    parseContext0.rollback();
    java.util.List<org.apache.avro.Schema> schemaList27 = parseContext0.resolveAllSchemas();
    org.apache.avro.Schema.Type type28 = org.apache.avro.Schema.Type.DOUBLE;
    org.apache.avro.Schema.SeenPair seenPair30 = new org.apache.avro.Schema.SeenPair((Object) type28, (Object) 1);
    org.apache.avro.Schema.Field[] fieldArray31 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList32 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean33 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList32,
        fieldArray31);
    org.apache.avro.Schema schema34 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList32);
    boolean boolean35 = schema34.isNullable();
    java.util.Set<String> strSet36 = schema34.getAliases();
    com.fasterxml.jackson.databind.JsonNode jsonNode37 = null;
    boolean boolean38 = schema34.isValidDefault(jsonNode37);
    String str39 = schema34.getDoc();
    org.apache.avro.Schema schema40 = org.apache.avro.Schema.createMap(schema34);
    boolean boolean41 = seenPair30.equals((Object) schema34);
    org.apache.avro.Schema.Field[] fieldArray42 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList43 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean44 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList43,
        fieldArray42);
    org.apache.avro.Schema schema45 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList43);
    boolean boolean47 = schema45.equals((Object) 1.0f);
    org.apache.avro.Schema.Type type48 = schema45.getType();
    boolean boolean49 = schema45.isUnion();
    boolean boolean50 = seenPair30.equals((Object) schema45);
    // The following exception was thrown during execution in test generation
    try {
      parseContext0.put(schema45);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"String.split(String)\" because \"fullName\" is null");
    } catch (NullPointerException e) {
      // Expected exception.
    }
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
    org.junit.Assert.assertNotNull(fieldArray15);
    org.junit.Assert.assertArrayEquals(fieldArray15, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    org.junit.Assert.assertNotNull(schema18);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    org.junit.Assert.assertNotNull(schema20);
    org.junit.Assert.assertNull(obj22);
    org.junit.Assert.assertTrue("'" + type23 + "' != '" + org.apache.avro.Schema.Type.ARRAY + "'",
        type23.equals(org.apache.avro.Schema.Type.ARRAY));
    org.junit.Assert.assertTrue("'" + type24 + "' != '" + org.apache.avro.Schema.Type.ARRAY + "'",
        type24.equals(org.apache.avro.Schema.Type.ARRAY));
    org.junit.Assert.assertNotNull(parseResult25);
    org.junit.Assert.assertNotNull(schemaList27);
    org.junit.Assert.assertTrue("'" + type28 + "' != '" + org.apache.avro.Schema.Type.DOUBLE + "'",
        type28.equals(org.apache.avro.Schema.Type.DOUBLE));
    org.junit.Assert.assertNotNull(fieldArray31);
    org.junit.Assert.assertArrayEquals(fieldArray31, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    org.junit.Assert.assertNotNull(schema34);
    org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    org.junit.Assert.assertNotNull(strSet36);
    org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    org.junit.Assert.assertNull(str39);
    org.junit.Assert.assertNotNull(schema40);
    org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    org.junit.Assert.assertNotNull(fieldArray42);
    org.junit.Assert.assertArrayEquals(fieldArray42, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    org.junit.Assert.assertNotNull(schema45);
    org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    org.junit.Assert.assertTrue("'" + type48 + "' != '" + org.apache.avro.Schema.Type.RECORD + "'",
        type48.equals(org.apache.avro.Schema.Type.RECORD));
    org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
  }

  @Test
  public void test099() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test099");
    org.apache.avro.NameValidator nameValidator0 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.Schema.Parser parser1 = new org.apache.avro.Schema.Parser(nameValidator0);
    org.apache.avro.Schema.Parser parser3 = parser1.setValidateDefaults(true);
    org.apache.avro.ParseContext parseContext4 = new org.apache.avro.ParseContext();
    boolean boolean5 = parseContext4.hasNewSchemas();
    org.apache.avro.Schema schema7 = parseContext4.getNamedSchema("boolean");
    org.apache.avro.Schema.Field[] fieldArray8 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList9 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList9,
        fieldArray8);
    org.apache.avro.Schema schema11 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList9);
    boolean boolean13 = schema11.equals((Object) 1.0f);
    org.apache.avro.Schema.Type type14 = schema11.getType();
    org.apache.avro.LogicalType logicalType15 = schema11.getLogicalType();
    String str16 = schema11.getFullName();
    org.apache.avro.Schema schema17 = parseContext4.resolve(schema11);
    org.apache.avro.Schema.Field[] fieldArray18 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList19 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList19,
        fieldArray18);
    org.apache.avro.Schema schema21 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList19);
    boolean boolean22 = schema21.isNullable();
    java.util.Set<String> strSet23 = schema21.getAliases();
    String str24 = schema21.toString();
    org.apache.avro.Schema.Field field26 = schema21.getField("long");
    java.util.List<org.apache.avro.Schema.Field> fieldList27 = schema21.getFields();
    org.apache.avro.Schema schema28 = parseContext4.resolve(schema21);
    java.util.Map<String, org.apache.avro.Schema> strMap29 = parseContext4.typesByName();
    org.apache.avro.Schema.Parser parser30 = parser3.addTypes(strMap29);
    java.util.Map<String, org.apache.avro.Schema> strMap31 = parser30.getTypes();
// flaky "10) test099(RegressionTest0)":         org.junit.Assert.assertNull(nameValidator0);
    org.junit.Assert.assertNotNull(parser3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    org.junit.Assert.assertNull(schema7);
    org.junit.Assert.assertNotNull(fieldArray8);
    org.junit.Assert.assertArrayEquals(fieldArray8, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    org.junit.Assert.assertNotNull(schema11);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    org.junit.Assert.assertTrue("'" + type14 + "' != '" + org.apache.avro.Schema.Type.RECORD + "'",
        type14.equals(org.apache.avro.Schema.Type.RECORD));
    org.junit.Assert.assertNull(logicalType15);
    org.junit.Assert.assertNull(str16);
    org.junit.Assert.assertNotNull(schema17);
    org.junit.Assert.assertNotNull(fieldArray18);
    org.junit.Assert.assertArrayEquals(fieldArray18, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    org.junit.Assert.assertNotNull(schema21);
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    org.junit.Assert.assertNotNull(strSet23);
    org.junit.Assert.assertEquals("'" + str24 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str24,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNull(field26);
    org.junit.Assert.assertNotNull(fieldList27);
    org.junit.Assert.assertNotNull(schema28);
    org.junit.Assert.assertNotNull(strMap29);
    org.junit.Assert.assertNotNull(parser30);
    org.junit.Assert.assertNotNull(strMap31);
  }

  @Test
  public void test100() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test100");
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
    java.util.Map<String, org.apache.avro.Schema> strMap31 = parser4.getTypes();
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema33 = parser4.parseInternal("long");
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.SchemaParseException; message: com.fasterxml.jackson.core.JsonParseException: Unrecognized token 'long': was expecting (JSON String, Number, Array, Object or token 'null', 'true' or 'false')? at [Source: REDACTED (`StreamReadFeature.INCLUDE_SOURCE_IN_LOCATION` disabled); line: 1, column: 1]");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
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
    org.junit.Assert.assertNotNull(strMap31);
  }

  @Test
  public void test101() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test101");
    org.apache.avro.Schema.Field[] fieldArray0 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList1 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList1,
        fieldArray0);
    org.apache.avro.Schema schema3 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
    boolean boolean4 = schema3.isNullable();
    java.util.Set<String> strSet5 = schema3.getAliases();
    String str6 = schema3.toString();
    org.apache.avro.Schema.Field[] fieldArray7 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList8 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean9 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList8,
        fieldArray7);
    org.apache.avro.Schema schema10 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList8);
    boolean boolean11 = schema10.isNullable();
    java.util.Set<String> strSet12 = schema10.getAliases();
    String str13 = schema10.toString();
    org.apache.avro.Schema.Field field15 = schema10.getField("long");
    boolean boolean16 = schema10.hasProps();
    org.apache.avro.Schema schema17 = org.apache.avro.Schema.applyAliases(schema3, schema10);
    org.apache.avro.ParseContext parseContext18 = new org.apache.avro.ParseContext();
    boolean boolean19 = parseContext18.hasNewSchemas();
    org.apache.avro.Schema schema21 = parseContext18.getNamedSchema("boolean");
    org.apache.avro.Schema.Field[] fieldArray22 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList23 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean24 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList23,
        fieldArray22);
    org.apache.avro.Schema schema25 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList23);
    boolean boolean27 = schema25.equals((Object) 1.0f);
    org.apache.avro.Schema.Type type28 = schema25.getType();
    org.apache.avro.LogicalType logicalType29 = schema25.getLogicalType();
    String str30 = schema25.getFullName();
    org.apache.avro.Schema schema31 = parseContext18.resolve(schema25);
    org.apache.avro.Schema.Field[] fieldArray32 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList33 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean34 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList33,
        fieldArray32);
    org.apache.avro.Schema schema35 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList33);
    boolean boolean36 = schema35.isNullable();
    java.util.Set<String> strSet37 = schema35.getAliases();
    String str38 = schema35.toString();
    org.apache.avro.Schema.Field field40 = schema35.getField("long");
    java.util.List<org.apache.avro.Schema.Field> fieldList41 = schema35.getFields();
    org.apache.avro.Schema schema42 = parseContext18.resolve(schema35);
    java.util.Map<String, org.apache.avro.Schema> strMap43 = parseContext18.typesByName();
    org.apache.avro.Schema.Field[] fieldArray44 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList45 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean46 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList45,
        fieldArray44);
    org.apache.avro.Schema schema47 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList45);
    boolean boolean48 = schema47.isUnion();
    java.util.Set<String> strSet49 = schema47.getAliases();
    org.apache.avro.Schema.Field[] fieldArray51 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList52 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean53 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList52,
        fieldArray51);
    org.apache.avro.Schema schema54 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList52);
    boolean boolean56 = schema54.equals((Object) 1.0f);
    org.apache.avro.Schema.Type type57 = schema54.getType();
    schema47.addProp("long", (Object) type57);
    String str59 = schema47.getNamespace();
    org.apache.avro.Schema schema60 = parseContext18.resolve(schema47);
    schema60.addProp("{\"type\":\"record\",\"fields\":[]}", "hi!");
    boolean boolean64 = schema10.equals((Object) schema60);
    org.junit.Assert.assertNotNull(fieldArray0);
    org.junit.Assert.assertArrayEquals(fieldArray0, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertNotNull(schema3);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    org.junit.Assert.assertNotNull(strSet5);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str6,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNotNull(fieldArray7);
    org.junit.Assert.assertArrayEquals(fieldArray7, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    org.junit.Assert.assertNotNull(schema10);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    org.junit.Assert.assertNotNull(strSet12);
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str13,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNull(field15);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    org.junit.Assert.assertNotNull(schema17);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    org.junit.Assert.assertNull(schema21);
    org.junit.Assert.assertNotNull(fieldArray22);
    org.junit.Assert.assertArrayEquals(fieldArray22, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    org.junit.Assert.assertNotNull(schema25);
    org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    org.junit.Assert.assertTrue("'" + type28 + "' != '" + org.apache.avro.Schema.Type.RECORD + "'",
        type28.equals(org.apache.avro.Schema.Type.RECORD));
    org.junit.Assert.assertNull(logicalType29);
    org.junit.Assert.assertNull(str30);
    org.junit.Assert.assertNotNull(schema31);
    org.junit.Assert.assertNotNull(fieldArray32);
    org.junit.Assert.assertArrayEquals(fieldArray32, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    org.junit.Assert.assertNotNull(schema35);
    org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    org.junit.Assert.assertNotNull(strSet37);
    org.junit.Assert.assertEquals("'" + str38 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str38,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNull(field40);
    org.junit.Assert.assertNotNull(fieldList41);
    org.junit.Assert.assertNotNull(schema42);
    org.junit.Assert.assertNotNull(strMap43);
    org.junit.Assert.assertNotNull(fieldArray44);
    org.junit.Assert.assertArrayEquals(fieldArray44, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    org.junit.Assert.assertNotNull(schema47);
    org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    org.junit.Assert.assertNotNull(strSet49);
    org.junit.Assert.assertNotNull(fieldArray51);
    org.junit.Assert.assertArrayEquals(fieldArray51, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    org.junit.Assert.assertNotNull(schema54);
    org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    org.junit.Assert.assertTrue("'" + type57 + "' != '" + org.apache.avro.Schema.Type.RECORD + "'",
        type57.equals(org.apache.avro.Schema.Type.RECORD));
    org.junit.Assert.assertNull(str59);
    org.junit.Assert.assertNotNull(schema60);
    org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
  }

  @Test
  public void test102() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test102");
    org.apache.avro.Schema.Field[] fieldArray0 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList1 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList1,
        fieldArray0);
    org.apache.avro.Schema schema3 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
    boolean boolean4 = schema3.isUnion();
    org.apache.avro.Schema.Type type5 = schema3.getType();
    org.apache.avro.ParseContext parseContext6 = new org.apache.avro.ParseContext();
    boolean boolean7 = parseContext6.hasNewSchemas();
    java.util.Map<String, org.apache.avro.Schema> strMap8 = parseContext6.typesByName();
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
    java.util.List<org.apache.avro.Schema.Field> fieldList18 = schema12.getFields();
    boolean boolean20 = schema12.equals((Object) "long type:RECORD pos:-1");
    java.util.List<org.apache.avro.Schema.Field> fieldList21 = schema12.getFields();
    Object obj23 = null;
    Object obj24 = schema12.getObjectProp("", obj23);
    org.apache.avro.Schema schema25 = parseContext6.resolve(schema12);
    parseContext6.commit();
    java.util.List<org.apache.avro.Schema> schemaList27 = parseContext6.resolveAllSchemas();
    String str29 = schema3.toString((java.util.Collection<org.apache.avro.Schema>) schemaList27, false);
    // The following exception was thrown during execution in test generation
    try {
      boolean boolean31 = schema3.hasEnumSymbol("fixed");
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: {\"type\":\"record\",\"fields\":[]}");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(fieldArray0);
    org.junit.Assert.assertArrayEquals(fieldArray0, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertNotNull(schema3);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    org.junit.Assert.assertTrue("'" + type5 + "' != '" + org.apache.avro.Schema.Type.RECORD + "'",
        type5.equals(org.apache.avro.Schema.Type.RECORD));
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertNotNull(strMap8);
    org.junit.Assert.assertNotNull(fieldArray9);
    org.junit.Assert.assertArrayEquals(fieldArray9, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    org.junit.Assert.assertNotNull(schema12);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    org.junit.Assert.assertNotNull(strSet14);
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str15,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNull(field17);
    org.junit.Assert.assertNotNull(fieldList18);
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    org.junit.Assert.assertNotNull(fieldList21);
    org.junit.Assert.assertNull(obj24);
    org.junit.Assert.assertNotNull(schema25);
    org.junit.Assert.assertNotNull(schemaList27);
    org.junit.Assert.assertEquals("'" + str29 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str29,
        "{\"type\":\"record\",\"fields\":[]}");
  }

  @Test
  public void test103() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test103");
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
    boolean boolean19 = schema7.isError();
    org.apache.avro.Schema.Type type20 = schema7.getType();
    java.util.List<org.apache.avro.Schema.Field> fieldList21 = schema7.getFields();
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
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    org.junit.Assert.assertTrue("'" + type20 + "' != '" + org.apache.avro.Schema.Type.RECORD + "'",
        type20.equals(org.apache.avro.Schema.Type.RECORD));
    org.junit.Assert.assertNotNull(fieldList21);
  }

  @Test
  public void test104() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test104");
    org.apache.avro.ParseContext parseContext0 = new org.apache.avro.ParseContext();
    boolean boolean1 = parseContext0.hasNewSchemas();
    java.util.Map<String, org.apache.avro.Schema> strMap2 = parseContext0.typesByName();
    parseContext0.rollback();
    org.apache.avro.Schema.Field[] fieldArray4 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList5 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList5,
        fieldArray4);
    org.apache.avro.Schema schema7 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList5);
    boolean boolean8 = schema7.isUnion();
    org.apache.avro.Schema schema9 = org.apache.avro.Schema.createArray(schema7);
    org.apache.avro.SchemaParser.ParseResult parseResult10 = parseContext0.commit(schema9);
    org.apache.avro.LogicalType logicalType11 = schema9.getLogicalType();
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    org.junit.Assert.assertNotNull(strMap2);
    org.junit.Assert.assertNotNull(fieldArray4);
    org.junit.Assert.assertArrayEquals(fieldArray4, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    org.junit.Assert.assertNotNull(schema7);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    org.junit.Assert.assertNotNull(schema9);
    org.junit.Assert.assertNotNull(parseResult10);
    org.junit.Assert.assertNull(logicalType11);
  }

  @Test
  public void test105() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test105");
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
      org.apache.avro.Schema schema12 = parser0.parseInternal("{\n  \"type\" : \"record\",\n  \"fields\" : [ ]\n}");
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
  public void test106() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test106");
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
    org.apache.avro.Schema.Parser parser11 = new org.apache.avro.Schema.Parser();
    java.util.Map<String, org.apache.avro.Schema> strMap12 = parser11.getTypes();
    org.apache.avro.Schema.Parser parser13 = new org.apache.avro.Schema.Parser();
    java.util.Map<String, org.apache.avro.Schema> strMap14 = parser13.getTypes();
    org.apache.avro.Schema.Parser parser15 = parser11.addTypes(strMap14);
    org.apache.avro.Schema.Parser parser16 = new org.apache.avro.Schema.Parser();
    java.util.Map<String, org.apache.avro.Schema> strMap17 = parser16.getTypes();
    org.apache.avro.Schema.Parser parser18 = parser11.addTypes(strMap17);
    org.apache.avro.Schema.Parser parser19 = parser0.addTypes(strMap17);
    org.apache.avro.Schema.Parser parser20 = new org.apache.avro.Schema.Parser();
    java.util.Map<String, org.apache.avro.Schema> strMap21 = parser20.getTypes();
    org.apache.avro.Schema.Parser parser22 = parser0.addTypes(strMap21);
    org.junit.Assert.assertNotNull(strMap1);
    org.junit.Assert.assertNotNull(strMap3);
    org.junit.Assert.assertNotNull(parser4);
    org.junit.Assert.assertNotNull(parser6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    org.junit.Assert.assertNotNull(schemaList9);
    org.junit.Assert.assertNotNull(parser10);
    org.junit.Assert.assertNotNull(strMap12);
    org.junit.Assert.assertNotNull(strMap14);
    org.junit.Assert.assertNotNull(parser15);
    org.junit.Assert.assertNotNull(strMap17);
    org.junit.Assert.assertNotNull(parser18);
    org.junit.Assert.assertNotNull(parser19);
    org.junit.Assert.assertNotNull(strMap21);
    org.junit.Assert.assertNotNull(parser22);
  }

  @Test
  public void test107() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test107");
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
      org.apache.avro.Schema schema12 = parser10.parse("long");
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
  }

  @Test
  public void test108() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test108");
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
    boolean boolean29 = parser28.getValidateDefaults();
    org.apache.avro.Schema.Parser parser31 = parser28.setValidateDefaults(false);
    String[] strArray36 = new String[] { "record", "boolean", "" };
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema37 = parser31.parse("long", strArray36);
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.SchemaParseException; message: com.fasterxml.jackson.core.JsonParseException: Unrecognized token 'longrecordboolean': was expecting (JSON String, Number, Array, Object or token 'null', 'true' or 'false')? at [Source: REDACTED (`StreamReadFeature.INCLUDE_SOURCE_IN_LOCATION` disabled); line: 1, column: 1]");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
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
    org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    org.junit.Assert.assertNotNull(parser31);
    org.junit.Assert.assertNotNull(strArray36);
    org.junit.Assert.assertArrayEquals(strArray36, new String[] { "record", "boolean", "" });
  }

  @Test
  public void test109() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test109");
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
    boolean boolean11 = schema3.equals((Object) "long type:RECORD pos:-1");
    java.util.List<org.apache.avro.Schema.Field> fieldList12 = schema3.getFields();
    org.apache.avro.Schema schema13 = org.apache.avro.Schema.createRecord(fieldList12);
    boolean boolean14 = schema13.isError();
    org.apache.avro.Schema.Type type15 = schema13.getType();
    org.apache.avro.ParseContext parseContext17 = new org.apache.avro.ParseContext();
    boolean boolean18 = parseContext17.hasNewSchemas();
    org.apache.avro.Schema schema20 = parseContext17.getNamedSchema("boolean");
    org.apache.avro.Schema.Field[] fieldArray21 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList22 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean23 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList22,
        fieldArray21);
    org.apache.avro.Schema schema24 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList22);
    boolean boolean25 = schema24.isNullable();
    java.util.Set<String> strSet26 = schema24.getAliases();
    com.fasterxml.jackson.databind.JsonNode jsonNode27 = null;
    boolean boolean28 = schema24.isValidDefault(jsonNode27);
    boolean boolean29 = schema24.isUnion();
    boolean boolean30 = schema24.isNullable();
    Object obj32 = schema24.getObjectProp("fixed");
    org.apache.avro.SchemaParser.ParseResult parseResult33 = parseContext17.commit(schema24);
    com.fasterxml.jackson.databind.JsonNode jsonNode34 = null;
    boolean boolean35 = schema24.isValidDefault(jsonNode34);
    // The following exception was thrown during execution in test generation
    try {
      schema13.addProp("array", (Object) jsonNode34);
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Can't set a property to null: array");
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
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    org.junit.Assert.assertNotNull(fieldList12);
    org.junit.Assert.assertNotNull(schema13);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    org.junit.Assert.assertTrue("'" + type15 + "' != '" + org.apache.avro.Schema.Type.RECORD + "'",
        type15.equals(org.apache.avro.Schema.Type.RECORD));
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    org.junit.Assert.assertNull(schema20);
    org.junit.Assert.assertNotNull(fieldArray21);
    org.junit.Assert.assertArrayEquals(fieldArray21, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    org.junit.Assert.assertNotNull(schema24);
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    org.junit.Assert.assertNotNull(strSet26);
    org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    org.junit.Assert.assertNull(obj32);
    org.junit.Assert.assertNotNull(parseResult33);
    org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
  }

  @Test
  public void test110() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test110");
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
    org.apache.avro.Schema.Field[] fieldArray21 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList22 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean23 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList22,
        fieldArray21);
    org.apache.avro.Schema schema24 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList22);
    boolean boolean25 = schema24.isNullable();
    java.util.Set<String> strSet26 = schema24.getAliases();
    String str27 = schema24.toString();
    org.apache.avro.Schema.Field field29 = schema24.getField("long");
    java.util.List<org.apache.avro.Schema.Field> fieldList30 = schema24.getFields();
    boolean boolean31 = schema24.hasFields();
    boolean boolean32 = schema24.hasFields();
    java.util.List<org.apache.avro.Schema.Field> fieldList33 = schema24.getFields();
    org.apache.avro.Schema.Field[] fieldArray34 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList35 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean36 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList35,
        fieldArray34);
    org.apache.avro.Schema schema37 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList35);
    boolean boolean38 = schema37.isNullable();
    java.util.Set<String> strSet39 = schema37.getAliases();
    String str40 = schema37.toString();
    org.apache.avro.Schema.Field[] fieldArray41 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList42 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean43 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList42,
        fieldArray41);
    org.apache.avro.Schema schema44 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList42);
    boolean boolean45 = schema44.isNullable();
    java.util.Set<String> strSet46 = schema44.getAliases();
    String str47 = schema44.toString();
    org.apache.avro.Schema.Field field49 = schema44.getField("long");
    java.util.List<org.apache.avro.Schema.Field> fieldList50 = schema44.getFields();
    String str52 = schema44.toString(false);
    java.util.function.BiConsumer<String, Object> strBiConsumer53 = null;
    schema44.forEachProperty(strBiConsumer53);
    schema37.addAllProps((org.apache.avro.JsonProperties) schema44);
    org.apache.avro.Schema schema56 = org.apache.avro.Schema.applyAliases(schema24, schema37);
    Object obj58 = schema24.getObjectProp("long type:RECORD pos:-1");
    boolean boolean60 = schema24.propsContainsKey("long type:RECORD pos:-1");
    org.apache.avro.SchemaParser.ParseResult parseResult61 = parseContext0.commit(schema24);
    // The following exception was thrown during execution in test generation
    try {
// flaky "11) test110(RegressionTest0)":             schema24.addAlias("{\n  \"type\" : \"array\",\n  \"items\" : {\n    \"type\" : \"record\",\n    \"fields\" : [ ]\n  }\n}", "{\"type\":\"array\",\"items\":{\"type\":\"record\",\"fields\":[]}}");
// flaky "4) test110(RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.avro.NameValidator.validate(String)\" because the return value of \"java.lang.ThreadLocal.get()\" is null");
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
    org.junit.Assert.assertNotNull(fieldArray21);
    org.junit.Assert.assertArrayEquals(fieldArray21, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    org.junit.Assert.assertNotNull(schema24);
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    org.junit.Assert.assertNotNull(strSet26);
    org.junit.Assert.assertEquals("'" + str27 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str27,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNull(field29);
    org.junit.Assert.assertNotNull(fieldList30);
    org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    org.junit.Assert.assertNotNull(fieldList33);
    org.junit.Assert.assertNotNull(fieldArray34);
    org.junit.Assert.assertArrayEquals(fieldArray34, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    org.junit.Assert.assertNotNull(schema37);
    org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    org.junit.Assert.assertNotNull(strSet39);
    org.junit.Assert.assertEquals("'" + str40 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str40,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNotNull(fieldArray41);
    org.junit.Assert.assertArrayEquals(fieldArray41, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    org.junit.Assert.assertNotNull(schema44);
    org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    org.junit.Assert.assertNotNull(strSet46);
    org.junit.Assert.assertEquals("'" + str47 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str47,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNull(field49);
    org.junit.Assert.assertNotNull(fieldList50);
    org.junit.Assert.assertEquals("'" + str52 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str52,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNotNull(schema56);
    org.junit.Assert.assertNull(obj58);
    org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    org.junit.Assert.assertNotNull(parseResult61);
  }

  @Test
  public void test111() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test111");
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
    java.io.File file12 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema13 = parser10.parse(file12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    } catch (NullPointerException e) {
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
  public void test112() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test112");
    org.apache.avro.ParseContext parseContext0 = new org.apache.avro.ParseContext();
    boolean boolean1 = parseContext0.hasNewSchemas();
    org.apache.avro.Schema.Parser parser2 = new org.apache.avro.Schema.Parser(parseContext0);
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
  }

  @Test
  public void test113() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test113");
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
    parseContext0.commit();
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
  }

  @Test
  public void test114() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test114");
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
    java.util.Map<String, org.apache.avro.Schema> strMap25 = parseContext0.typesByName();
    org.apache.avro.Schema.Field[] fieldArray26 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList27 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean28 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList27,
        fieldArray26);
    org.apache.avro.Schema schema29 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList27);
    boolean boolean30 = schema29.isUnion();
    java.util.Set<String> strSet31 = schema29.getAliases();
    org.apache.avro.Schema.Field[] fieldArray33 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList34 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean35 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList34,
        fieldArray33);
    org.apache.avro.Schema schema36 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList34);
    boolean boolean38 = schema36.equals((Object) 1.0f);
    org.apache.avro.Schema.Type type39 = schema36.getType();
    schema29.addProp("long", (Object) type39);
    String str41 = schema29.getNamespace();
    org.apache.avro.Schema schema42 = parseContext0.resolve(schema29);
    Class<?> wildcardClass43 = schema29.getClass();
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
    org.junit.Assert.assertNotNull(strMap25);
    org.junit.Assert.assertNotNull(fieldArray26);
    org.junit.Assert.assertArrayEquals(fieldArray26, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    org.junit.Assert.assertNotNull(schema29);
    org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    org.junit.Assert.assertNotNull(strSet31);
    org.junit.Assert.assertNotNull(fieldArray33);
    org.junit.Assert.assertArrayEquals(fieldArray33, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    org.junit.Assert.assertNotNull(schema36);
    org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    org.junit.Assert.assertTrue("'" + type39 + "' != '" + org.apache.avro.Schema.Type.RECORD + "'",
        type39.equals(org.apache.avro.Schema.Type.RECORD));
    org.junit.Assert.assertNull(str41);
    org.junit.Assert.assertNotNull(schema42);
    org.junit.Assert.assertNotNull(wildcardClass43);
  }

  @Test
  public void test115() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test115");
    org.apache.avro.Schema.Field[] fieldArray0 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList1 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList1,
        fieldArray0);
    org.apache.avro.Schema schema3 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
    boolean boolean5 = schema3.equals((Object) 1.0f);
    String str7 = schema3.toString(false);
    boolean boolean8 = schema3.isNullable();
    String str9 = schema3.getName();
    org.apache.avro.Schema.Parser parser11 = new org.apache.avro.Schema.Parser();
    java.util.Map<String, org.apache.avro.Schema> strMap12 = parser11.getTypes();
    org.apache.avro.Schema.Parser parser13 = new org.apache.avro.Schema.Parser();
    java.util.Map<String, org.apache.avro.Schema> strMap14 = parser13.getTypes();
    org.apache.avro.Schema.Parser parser15 = parser11.addTypes(strMap14);
    org.apache.avro.Schema.Field[] fieldArray16 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList17 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList17,
        fieldArray16);
    org.apache.avro.Schema schema19 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList17);
    boolean boolean20 = schema19.isNullable();
    java.util.Set<String> strSet21 = schema19.getAliases();
    String str22 = schema19.toString();
    org.apache.avro.Schema.Field field24 = schema19.getField("long");
    boolean boolean25 = schema19.isError();
    org.apache.avro.Schema.Parser parser26 = new org.apache.avro.Schema.Parser();
    java.util.Map<String, org.apache.avro.Schema> strMap27 = parser26.getTypes();
    org.apache.avro.Schema.Parser parser28 = new org.apache.avro.Schema.Parser();
    java.util.Map<String, org.apache.avro.Schema> strMap29 = parser28.getTypes();
    org.apache.avro.Schema.Parser parser30 = parser26.addTypes(strMap29);
    org.apache.avro.Schema.Parser parser32 = parser26.setValidateDefaults(true);
    org.apache.avro.ParseContext parseContext33 = new org.apache.avro.ParseContext();
    boolean boolean34 = parseContext33.hasNewSchemas();
    java.util.List<org.apache.avro.Schema> schemaList35 = parseContext33.resolveAllSchemas();
    org.apache.avro.Schema.Parser parser36 = parser26.addTypes((Iterable<org.apache.avro.Schema>) schemaList35);
    String str38 = schema19.toString((java.util.Collection<org.apache.avro.Schema>) schemaList35, false);
    org.apache.avro.Schema.Parser parser39 = parser15.addTypes((Iterable<org.apache.avro.Schema>) schemaList35);
    org.apache.avro.ParseContext parseContext40 = new org.apache.avro.ParseContext();
    boolean boolean41 = parseContext40.hasNewSchemas();
    org.apache.avro.Schema schema43 = parseContext40.getNamedSchema("boolean");
    org.apache.avro.Schema.Field[] fieldArray44 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList45 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean46 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList45,
        fieldArray44);
    org.apache.avro.Schema schema47 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList45);
    boolean boolean49 = schema47.equals((Object) 1.0f);
    org.apache.avro.Schema.Type type50 = schema47.getType();
    org.apache.avro.LogicalType logicalType51 = schema47.getLogicalType();
    String str52 = schema47.getFullName();
    org.apache.avro.Schema schema53 = parseContext40.resolve(schema47);
    org.apache.avro.Schema schema55 = parseContext40.getNamedSchema("fixed");
    java.util.Map<String, org.apache.avro.Schema> strMap56 = parseContext40.typesByName();
    org.apache.avro.Schema.Parser parser57 = parser39.addTypes(strMap56);
    Object obj58 = schema3.getObjectProp(
        "{\n  \"type\" : \"array\",\n  \"items\" : {\n    \"type\" : \"record\",\n    \"fields\" : [ ]\n  }\n}",
        (Object) parser57);
    org.junit.Assert.assertNotNull(fieldArray0);
    org.junit.Assert.assertArrayEquals(fieldArray0, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertNotNull(schema3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str7,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    org.junit.Assert.assertNull(str9);
    org.junit.Assert.assertNotNull(strMap12);
    org.junit.Assert.assertNotNull(strMap14);
    org.junit.Assert.assertNotNull(parser15);
    org.junit.Assert.assertNotNull(fieldArray16);
    org.junit.Assert.assertArrayEquals(fieldArray16, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    org.junit.Assert.assertNotNull(schema19);
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    org.junit.Assert.assertNotNull(strSet21);
    org.junit.Assert.assertEquals("'" + str22 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str22,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNull(field24);
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    org.junit.Assert.assertNotNull(strMap27);
    org.junit.Assert.assertNotNull(strMap29);
    org.junit.Assert.assertNotNull(parser30);
    org.junit.Assert.assertNotNull(parser32);
    org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    org.junit.Assert.assertNotNull(schemaList35);
    org.junit.Assert.assertNotNull(parser36);
    org.junit.Assert.assertEquals("'" + str38 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str38,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNotNull(parser39);
    org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    org.junit.Assert.assertNull(schema43);
    org.junit.Assert.assertNotNull(fieldArray44);
    org.junit.Assert.assertArrayEquals(fieldArray44, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    org.junit.Assert.assertNotNull(schema47);
    org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    org.junit.Assert.assertTrue("'" + type50 + "' != '" + org.apache.avro.Schema.Type.RECORD + "'",
        type50.equals(org.apache.avro.Schema.Type.RECORD));
    org.junit.Assert.assertNull(logicalType51);
    org.junit.Assert.assertNull(str52);
    org.junit.Assert.assertNotNull(schema53);
    org.junit.Assert.assertNull(schema55);
    org.junit.Assert.assertNotNull(strMap56);
    org.junit.Assert.assertNotNull(parser57);
    org.junit.Assert.assertNotNull(obj58);
  }

  @Test
  public void test116() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test116");
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
    java.util.List<org.apache.avro.Schema> schemaList22 = parseContext0.resolveAllSchemas();
    java.util.List<org.apache.avro.Schema> schemaList23 = parseContext0.resolveAllSchemas();
    org.apache.avro.Schema schema24 = org.apache.avro.Schema.createUnion(schemaList23);
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
    org.junit.Assert.assertNotNull(schemaList22);
    org.junit.Assert.assertNotNull(schemaList23);
    org.junit.Assert.assertNotNull(schema24);
  }

  @Test
  public void test117() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test117");
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
    parseContext0.rollback();
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
  public void test118() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test118");
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
    java.util.Map<String, org.apache.avro.Schema> strMap25 = parseContext0.typesByName();
    org.apache.avro.Schema.Field[] fieldArray26 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList27 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean28 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList27,
        fieldArray26);
    org.apache.avro.Schema schema29 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList27);
    boolean boolean30 = schema29.isUnion();
    java.util.Set<String> strSet31 = schema29.getAliases();
    org.apache.avro.Schema.Field[] fieldArray33 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList34 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean35 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList34,
        fieldArray33);
    org.apache.avro.Schema schema36 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList34);
    boolean boolean38 = schema36.equals((Object) 1.0f);
    org.apache.avro.Schema.Type type39 = schema36.getType();
    schema29.addProp("long", (Object) type39);
    String str41 = schema29.getNamespace();
    org.apache.avro.Schema schema42 = parseContext0.resolve(schema29);
    boolean boolean43 = schema42.isError();
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
    org.junit.Assert.assertNotNull(strMap25);
    org.junit.Assert.assertNotNull(fieldArray26);
    org.junit.Assert.assertArrayEquals(fieldArray26, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    org.junit.Assert.assertNotNull(schema29);
    org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    org.junit.Assert.assertNotNull(strSet31);
    org.junit.Assert.assertNotNull(fieldArray33);
    org.junit.Assert.assertArrayEquals(fieldArray33, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    org.junit.Assert.assertNotNull(schema36);
    org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    org.junit.Assert.assertTrue("'" + type39 + "' != '" + org.apache.avro.Schema.Type.RECORD + "'",
        type39.equals(org.apache.avro.Schema.Type.RECORD));
    org.junit.Assert.assertNull(str41);
    org.junit.Assert.assertNotNull(schema42);
    org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
  }

  @Test
  public void test119() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test119");
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
    boolean boolean17 = parseContext0.contains("long");
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
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
  }

  @Test
  public void test120() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test120");
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
    java.util.Map<String, org.apache.avro.Schema> strMap22 = parseContext0.typesByName();
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
    org.junit.Assert.assertNotNull(strMap22);
  }

  @Test
  public void test121() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test121");
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
    org.apache.avro.Schema.Field[] fieldArray13 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList14 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList14,
        fieldArray13);
    org.apache.avro.Schema schema16 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList14);
    boolean boolean17 = schema16.isNullable();
    java.util.Set<String> strSet18 = schema16.getAliases();
    com.fasterxml.jackson.databind.JsonNode jsonNode19 = null;
    boolean boolean20 = schema16.isValidDefault(jsonNode19);
    String str21 = schema16.getDoc();
    org.apache.avro.Schema schema22 = org.apache.avro.Schema.createMap(schema16);
    String str23 = schema16.getFullName();
    boolean boolean24 = schema16.isUnion();
    org.apache.avro.Schema.Field[] fieldArray25 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList26 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean27 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList26,
        fieldArray25);
    org.apache.avro.Schema schema28 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList26);
    boolean boolean29 = schema28.isNullable();
    java.util.Set<String> strSet30 = schema28.getAliases();
    String str31 = schema28.toString();
    org.apache.avro.Schema.Field field33 = schema28.getField("long");
    java.util.List<org.apache.avro.Schema.Field> fieldList34 = schema28.getFields();
    boolean boolean36 = schema28.equals((Object) "long type:RECORD pos:-1");
    java.util.List<org.apache.avro.Schema.Field> fieldList37 = schema28.getFields();
    Object obj39 = null;
    Object obj40 = schema28.getObjectProp("", obj39);
    schema16.addAllProps((org.apache.avro.JsonProperties) schema28);
    org.apache.avro.Schema.Parser parser43 = new org.apache.avro.Schema.Parser();
    java.util.Map<String, org.apache.avro.Schema> strMap44 = parser43.getTypes();
    org.apache.avro.Schema.Parser parser46 = parser43.setValidateDefaults(true);
    Object obj47 = schema28.getObjectProp(
        "{\"type\":\"record\",\"fields\":[],\"long type:RECORD pos:-1\":\"long type:RECORD pos:-1\"}",
        (Object) parser46);
    org.apache.avro.Schema.Parser parser48 = new org.apache.avro.Schema.Parser();
    java.util.Map<String, org.apache.avro.Schema> strMap49 = parser48.getTypes();
    org.apache.avro.Schema.Parser parser50 = new org.apache.avro.Schema.Parser();
    java.util.Map<String, org.apache.avro.Schema> strMap51 = parser50.getTypes();
    org.apache.avro.Schema.Parser parser52 = parser48.addTypes(strMap51);
    org.apache.avro.Schema.Parser parser53 = new org.apache.avro.Schema.Parser();
    java.util.Map<String, org.apache.avro.Schema> strMap54 = parser53.getTypes();
    org.apache.avro.Schema.Parser parser55 = new org.apache.avro.Schema.Parser();
    java.util.Map<String, org.apache.avro.Schema> strMap56 = parser55.getTypes();
    org.apache.avro.Schema.Parser parser57 = parser53.addTypes(strMap56);
    org.apache.avro.Schema.Parser parser58 = new org.apache.avro.Schema.Parser();
    java.util.Map<String, org.apache.avro.Schema> strMap59 = parser58.getTypes();
    org.apache.avro.Schema.Parser parser60 = parser53.addTypes(strMap59);
    org.apache.avro.Schema.Parser parser61 = parser52.addTypes(strMap59);
    org.apache.avro.Schema.Parser parser62 = parser46.addTypes(strMap59);
    org.apache.avro.Schema.Parser parser63 = parser10.addTypes(strMap59);
    org.junit.Assert.assertNotNull(strMap1);
    org.junit.Assert.assertNotNull(strMap3);
    org.junit.Assert.assertNotNull(parser4);
    org.junit.Assert.assertNotNull(parser6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    org.junit.Assert.assertNotNull(schemaList9);
    org.junit.Assert.assertNotNull(parser10);
    org.junit.Assert.assertNotNull(parser12);
    org.junit.Assert.assertNotNull(fieldArray13);
    org.junit.Assert.assertArrayEquals(fieldArray13, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    org.junit.Assert.assertNotNull(schema16);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    org.junit.Assert.assertNotNull(strSet18);
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    org.junit.Assert.assertNull(str21);
    org.junit.Assert.assertNotNull(schema22);
    org.junit.Assert.assertNull(str23);
    org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    org.junit.Assert.assertNotNull(fieldArray25);
    org.junit.Assert.assertArrayEquals(fieldArray25, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    org.junit.Assert.assertNotNull(schema28);
    org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    org.junit.Assert.assertNotNull(strSet30);
    org.junit.Assert.assertEquals("'" + str31 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str31,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNull(field33);
    org.junit.Assert.assertNotNull(fieldList34);
    org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    org.junit.Assert.assertNotNull(fieldList37);
    org.junit.Assert.assertNull(obj40);
    org.junit.Assert.assertNotNull(strMap44);
    org.junit.Assert.assertNotNull(parser46);
    org.junit.Assert.assertNotNull(obj47);
    org.junit.Assert.assertNotNull(strMap49);
    org.junit.Assert.assertNotNull(strMap51);
    org.junit.Assert.assertNotNull(parser52);
    org.junit.Assert.assertNotNull(strMap54);
    org.junit.Assert.assertNotNull(strMap56);
    org.junit.Assert.assertNotNull(parser57);
    org.junit.Assert.assertNotNull(strMap59);
    org.junit.Assert.assertNotNull(parser60);
    org.junit.Assert.assertNotNull(parser61);
    org.junit.Assert.assertNotNull(parser62);
    org.junit.Assert.assertNotNull(parser63);
  }

  @Test
  public void test122() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test122");
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
      org.apache.avro.Schema schema19 = schema7.getValueType();
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a map: {\"type\":\"record\",\"fields\":[]}");
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
  public void test123() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test123");
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
    org.apache.avro.Schema.Field[] fieldArray15 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList16 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList16,
        fieldArray15);
    org.apache.avro.Schema schema18 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList16);
    boolean boolean19 = schema18.isNullable();
    org.apache.avro.Schema schema20 = org.apache.avro.Schema.createArray(schema18);
    Object obj22 = schema20.getObjectProp("");
    org.apache.avro.Schema.Type type23 = schema20.getType();
    org.apache.avro.Schema.Type type24 = schema20.getType();
    org.apache.avro.SchemaParser.ParseResult parseResult25 = parseContext0.commit(schema20);
    parseContext0.rollback();
    org.apache.avro.Schema.Field[] fieldArray27 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList28 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean29 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList28,
        fieldArray27);
    org.apache.avro.Schema schema30 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList28);
    boolean boolean31 = schema30.isNullable();
    java.util.Set<String> strSet32 = schema30.getAliases();
    String str33 = schema30.toString();
    boolean boolean34 = schema30.isNullable();
    // The following exception was thrown during execution in test generation
    try {
      parseContext0.put(schema30);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"String.split(String)\" because \"fullName\" is null");
    } catch (NullPointerException e) {
      // Expected exception.
    }
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
    org.junit.Assert.assertNotNull(fieldArray15);
    org.junit.Assert.assertArrayEquals(fieldArray15, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    org.junit.Assert.assertNotNull(schema18);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    org.junit.Assert.assertNotNull(schema20);
    org.junit.Assert.assertNull(obj22);
    org.junit.Assert.assertTrue("'" + type23 + "' != '" + org.apache.avro.Schema.Type.ARRAY + "'",
        type23.equals(org.apache.avro.Schema.Type.ARRAY));
    org.junit.Assert.assertTrue("'" + type24 + "' != '" + org.apache.avro.Schema.Type.ARRAY + "'",
        type24.equals(org.apache.avro.Schema.Type.ARRAY));
    org.junit.Assert.assertNotNull(parseResult25);
    org.junit.Assert.assertNotNull(fieldArray27);
    org.junit.Assert.assertArrayEquals(fieldArray27, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    org.junit.Assert.assertNotNull(schema30);
    org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    org.junit.Assert.assertNotNull(strSet32);
    org.junit.Assert.assertEquals("'" + str33 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str33,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
  }

  @Test
  public void test124() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test124");
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
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema16 = schema7.getElementType();
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an array: {\"type\":\"record\",\"fields\":[]}");
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
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
  }

  @Test
  public void test125() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test125");
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
    java.util.List<org.apache.avro.Schema> schemaList22 = parseContext0.resolveAllSchemas();
    parseContext0.commit();
    org.apache.avro.Schema.Parser parser24 = new org.apache.avro.Schema.Parser(parseContext0);
    boolean boolean25 = parseContext0.hasNewSchemas();
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
    org.junit.Assert.assertNotNull(schemaList22);
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
  }

  @Test
  public void test126() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test126");
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
    org.apache.avro.Schema.Field[] fieldArray25 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList26 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean27 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList26,
        fieldArray25);
    org.apache.avro.Schema schema28 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList26);
    boolean boolean29 = schema28.isNullable();
    java.util.Set<String> strSet30 = schema28.getAliases();
    String str31 = schema28.toString();
    org.apache.avro.Schema.Field field33 = schema28.getField("long");
    java.util.List<org.apache.avro.Schema.Field> fieldList34 = schema28.getFields();
    String str36 = schema28.toString(false);
    java.util.Map<String, Object> strMap37 = schema28.getObjectProps();
    String str38 = schema28.toString();
    java.util.Map<String, Object> strMap39 = schema28.getObjectProps();
    boolean boolean40 = schema28.isNullable();
    org.apache.avro.SchemaParser.ParseResult parseResult41 = parseContext0.commit(schema28);
    org.apache.avro.Schema.Field[] fieldArray42 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList43 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean44 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList43,
        fieldArray42);
    org.apache.avro.Schema schema45 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList43);
    boolean boolean47 = schema45.equals((Object) 1.0f);
    boolean boolean48 = schema45.isUnion();
    org.apache.avro.Schema schema49 = org.apache.avro.Schema.createArray(schema45);
    com.fasterxml.jackson.databind.JsonNode jsonNode50 = null;
    boolean boolean51 = schema49.isValidDefault(jsonNode50);
    // The following exception was thrown during execution in test generation
    try {
      parseContext0.put(schema49);
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroTypeException; message: You can only put a named schema into the context");
    } catch (org.apache.avro.AvroTypeException e) {
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
    org.junit.Assert.assertNotNull(fieldArray25);
    org.junit.Assert.assertArrayEquals(fieldArray25, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    org.junit.Assert.assertNotNull(schema28);
    org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    org.junit.Assert.assertNotNull(strSet30);
    org.junit.Assert.assertEquals("'" + str31 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str31,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNull(field33);
    org.junit.Assert.assertNotNull(fieldList34);
    org.junit.Assert.assertEquals("'" + str36 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str36,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNotNull(strMap37);
    org.junit.Assert.assertEquals("'" + str38 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str38,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNotNull(strMap39);
    org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    org.junit.Assert.assertNotNull(parseResult41);
    org.junit.Assert.assertNotNull(fieldArray42);
    org.junit.Assert.assertArrayEquals(fieldArray42, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    org.junit.Assert.assertNotNull(schema45);
    org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    org.junit.Assert.assertNotNull(schema49);
    org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
  }

  @Test
  public void test127() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test127");
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
    org.apache.avro.Schema.Type type25 = org.apache.avro.Schema.Type.DOUBLE;
    org.apache.avro.Schema schema26 = org.apache.avro.Schema.create(type25);
    org.apache.avro.Schema schema27 = parseContext0.resolve(schema26);
    parseContext0.rollback();
    java.util.Map<String, org.apache.avro.Schema> strMap29 = parseContext0.typesByName();
    parseContext0.rollback();
    org.apache.avro.Schema schema33 = parseContext0.find("long", "long");
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
    org.junit.Assert.assertTrue("'" + type25 + "' != '" + org.apache.avro.Schema.Type.DOUBLE + "'",
        type25.equals(org.apache.avro.Schema.Type.DOUBLE));
    org.junit.Assert.assertNotNull(schema26);
    org.junit.Assert.assertNotNull(schema27);
    org.junit.Assert.assertNotNull(strMap29);
    org.junit.Assert.assertNotNull(schema33);
  }

  @Test
  public void test128() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test128");
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
    java.util.List<org.apache.avro.Schema> schemaList22 = parseContext0.resolveAllSchemas();
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema25 = parseContext0.find("{\n  \"type\" : \"record\",\n  \"fields\" : [ ]\n}",
          "{\"type\":\"record\",\"fields\":[]}");
// flaky "12) test128(RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.avro.NameValidator.validate(String)\" because the return value of \"java.lang.ThreadLocal.get()\" is null");
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
    org.junit.Assert.assertNotNull(strMap21);
    org.junit.Assert.assertNotNull(schemaList22);
  }

  @Test
  public void test129() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test129");
    org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
    java.util.Map<String, org.apache.avro.Schema> strMap1 = parser0.getTypes();
    org.apache.avro.Schema.Parser parser2 = new org.apache.avro.Schema.Parser();
    java.util.Map<String, org.apache.avro.Schema> strMap3 = parser2.getTypes();
    org.apache.avro.Schema.Parser parser4 = parser0.addTypes(strMap3);
    org.apache.avro.Schema.Parser parser5 = new org.apache.avro.Schema.Parser();
    java.util.Map<String, org.apache.avro.Schema> strMap6 = parser5.getTypes();
    org.apache.avro.Schema.Parser parser7 = parser0.addTypes(strMap6);
    org.apache.avro.Schema.Parser parser9 = parser0.setValidateDefaults(false);
    org.apache.avro.Schema.Parser parser10 = new org.apache.avro.Schema.Parser();
    java.util.Map<String, org.apache.avro.Schema> strMap11 = parser10.getTypes();
    org.apache.avro.Schema.Parser parser13 = parser10.setValidateDefaults(true);
    org.apache.avro.Schema.Parser parser15 = parser13.setValidateDefaults(true);
    org.apache.avro.Schema.Field[] fieldArray16 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList17 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList17,
        fieldArray16);
    org.apache.avro.Schema schema19 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList17);
    String str20 = schema19.getName();
    org.apache.avro.LogicalType logicalType21 = schema19.getLogicalType();
    boolean boolean22 = schema19.hasProps();
    org.apache.avro.Schema.Parser parser24 = new org.apache.avro.Schema.Parser();
    java.util.Map<String, org.apache.avro.Schema> strMap25 = parser24.getTypes();
    org.apache.avro.Schema.Parser parser26 = new org.apache.avro.Schema.Parser();
    java.util.Map<String, org.apache.avro.Schema> strMap27 = parser26.getTypes();
    org.apache.avro.Schema.Parser parser28 = parser24.addTypes(strMap27);
    schema19.addProp("fixed", (Object) strMap27);
    org.apache.avro.Schema.Parser parser30 = parser13.addTypes(strMap27);
    org.apache.avro.Schema.Parser parser31 = new org.apache.avro.Schema.Parser();
    java.util.Map<String, org.apache.avro.Schema> strMap32 = parser31.getTypes();
    org.apache.avro.Schema.Parser parser33 = new org.apache.avro.Schema.Parser();
    java.util.Map<String, org.apache.avro.Schema> strMap34 = parser33.getTypes();
    org.apache.avro.Schema.Parser parser35 = parser31.addTypes(strMap34);
    org.apache.avro.Schema.Parser parser37 = parser31.setValidateDefaults(true);
    org.apache.avro.ParseContext parseContext38 = new org.apache.avro.ParseContext();
    boolean boolean39 = parseContext38.hasNewSchemas();
    java.util.List<org.apache.avro.Schema> schemaList40 = parseContext38.resolveAllSchemas();
    org.apache.avro.Schema.Parser parser41 = parser31.addTypes((Iterable<org.apache.avro.Schema>) schemaList40);
    org.apache.avro.Schema.Parser parser42 = parser30.addTypes((Iterable<org.apache.avro.Schema>) schemaList40);
    org.apache.avro.Schema.Parser parser43 = parser9.addTypes((Iterable<org.apache.avro.Schema>) schemaList40);
    org.junit.Assert.assertNotNull(strMap1);
    org.junit.Assert.assertNotNull(strMap3);
    org.junit.Assert.assertNotNull(parser4);
    org.junit.Assert.assertNotNull(strMap6);
    org.junit.Assert.assertNotNull(parser7);
    org.junit.Assert.assertNotNull(parser9);
    org.junit.Assert.assertNotNull(strMap11);
    org.junit.Assert.assertNotNull(parser13);
    org.junit.Assert.assertNotNull(parser15);
    org.junit.Assert.assertNotNull(fieldArray16);
    org.junit.Assert.assertArrayEquals(fieldArray16, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    org.junit.Assert.assertNotNull(schema19);
    org.junit.Assert.assertNull(str20);
    org.junit.Assert.assertNull(logicalType21);
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    org.junit.Assert.assertNotNull(strMap25);
    org.junit.Assert.assertNotNull(strMap27);
    org.junit.Assert.assertNotNull(parser28);
    org.junit.Assert.assertNotNull(parser30);
    org.junit.Assert.assertNotNull(strMap32);
    org.junit.Assert.assertNotNull(strMap34);
    org.junit.Assert.assertNotNull(parser35);
    org.junit.Assert.assertNotNull(parser37);
    org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    org.junit.Assert.assertNotNull(schemaList40);
    org.junit.Assert.assertNotNull(parser41);
    org.junit.Assert.assertNotNull(parser42);
    org.junit.Assert.assertNotNull(parser43);
  }

  @Test
  public void test130() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test130");
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
    org.apache.avro.Schema schema15 = parseContext0.getNamedSchema("fixed");
    java.util.Map<String, org.apache.avro.Schema> strMap16 = parseContext0.typesByName();
    java.util.Map<String, org.apache.avro.Schema> strMap17 = parseContext0.typesByName();
    java.util.Map<String, org.apache.avro.Schema> strMap18 = parseContext0.typesByName();
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
    org.junit.Assert.assertNull(schema15);
    org.junit.Assert.assertNotNull(strMap16);
    org.junit.Assert.assertNotNull(strMap17);
    org.junit.Assert.assertNotNull(strMap18);
  }

  @Test
  public void test131() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test131");
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
    String[] strArray32 = new String[] { "fixed", "{\"type\":\"record\",\"fields\":[]}" };
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema33 = parser4.parse("boolean", strArray32);
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.SchemaParseException; message: com.fasterxml.jackson.core.JsonParseException: Unrecognized token 'booleanfixed': was expecting (JSON String, Number, Array, Object or token 'null', 'true' or 'false')? at [Source: REDACTED (`StreamReadFeature.INCLUDE_SOURCE_IN_LOCATION` disabled); line: 1, column: 1]");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
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
    org.junit.Assert.assertNotNull(strArray32);
    org.junit.Assert.assertArrayEquals(strArray32, new String[] { "fixed", "{\"type\":\"record\",\"fields\":[]}" });
  }

  @Test
  public void test132() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test132");
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
    org.apache.avro.ParseContext parseContext14 = new org.apache.avro.ParseContext();
    boolean boolean15 = parseContext14.hasNewSchemas();
    java.util.Map<String, org.apache.avro.Schema> strMap16 = parseContext14.typesByName();
    parseContext14.rollback();
    org.apache.avro.Schema.Field[] fieldArray18 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList19 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList19,
        fieldArray18);
    org.apache.avro.Schema schema21 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList19);
    boolean boolean22 = schema21.isUnion();
    org.apache.avro.Schema schema23 = org.apache.avro.Schema.createArray(schema21);
    org.apache.avro.SchemaParser.ParseResult parseResult24 = parseContext14.commit(schema23);
    org.apache.avro.Schema schema25 = parseContext0.resolve(schema23);
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
    org.junit.Assert.assertNotNull(strMap16);
    org.junit.Assert.assertNotNull(fieldArray18);
    org.junit.Assert.assertArrayEquals(fieldArray18, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    org.junit.Assert.assertNotNull(schema21);
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    org.junit.Assert.assertNotNull(schema23);
    org.junit.Assert.assertNotNull(parseResult24);
    org.junit.Assert.assertNotNull(schema25);
  }

  @Test
  public void test133() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test133");
    org.apache.avro.Schema.Field[] fieldArray0 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList1 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList1,
        fieldArray0);
    org.apache.avro.Schema schema3 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
    String str4 = schema3.getName();
    org.apache.avro.LogicalType logicalType5 = schema3.getLogicalType();
    String str6 = schema3.getNamespace();
    org.apache.avro.ParseContext parseContext7 = new org.apache.avro.ParseContext();
    boolean boolean8 = parseContext7.hasNewSchemas();
    org.apache.avro.Schema schema10 = parseContext7.getNamedSchema("boolean");
    java.util.Map<String, org.apache.avro.Schema> strMap11 = parseContext7.typesByName();
    boolean boolean12 = schema3.equals((Object) parseContext7);
    org.apache.avro.Schema.Parser parser13 = new org.apache.avro.Schema.Parser(parseContext7);
    parseContext7.rollback();
    org.junit.Assert.assertNotNull(fieldArray0);
    org.junit.Assert.assertArrayEquals(fieldArray0, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertNotNull(schema3);
    org.junit.Assert.assertNull(str4);
    org.junit.Assert.assertNull(logicalType5);
    org.junit.Assert.assertNull(str6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    org.junit.Assert.assertNull(schema10);
    org.junit.Assert.assertNotNull(strMap11);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
  }

  @Test
  public void test134() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test134");
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
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema30 = parser28.parseInternal(
          "{\n  \"type\" : \"array\",\n  \"items\" : {\n    \"type\" : \"record\",\n    \"fields\" : [ ]\n  }\n}");
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.SchemaParseException; message: No name in schema: {\"type\":\"record\",\"fields\":[]}");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
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
  }

  @Test
  public void test135() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test135");
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
    org.apache.avro.Schema.Field[] fieldArray25 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList26 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean27 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList26,
        fieldArray25);
    org.apache.avro.Schema schema28 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList26);
    boolean boolean29 = schema28.isNullable();
    java.util.Set<String> strSet30 = schema28.getAliases();
    String str31 = schema28.toString();
    org.apache.avro.Schema.Field field33 = schema28.getField("long");
    java.util.List<org.apache.avro.Schema.Field> fieldList34 = schema28.getFields();
    String str36 = schema28.toString(false);
    java.util.Map<String, Object> strMap37 = schema28.getObjectProps();
    String str38 = schema28.toString();
    java.util.Map<String, Object> strMap39 = schema28.getObjectProps();
    boolean boolean40 = schema28.isNullable();
    org.apache.avro.SchemaParser.ParseResult parseResult41 = parseContext0.commit(schema28);
    boolean boolean42 = schema28.isNullable();
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
    org.junit.Assert.assertNotNull(fieldArray25);
    org.junit.Assert.assertArrayEquals(fieldArray25, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    org.junit.Assert.assertNotNull(schema28);
    org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    org.junit.Assert.assertNotNull(strSet30);
    org.junit.Assert.assertEquals("'" + str31 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str31,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNull(field33);
    org.junit.Assert.assertNotNull(fieldList34);
    org.junit.Assert.assertEquals("'" + str36 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str36,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNotNull(strMap37);
    org.junit.Assert.assertEquals("'" + str38 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str38,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNotNull(strMap39);
    org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    org.junit.Assert.assertNotNull(parseResult41);
    org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
  }

  @Test
  public void test136() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test136");
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
    boolean boolean9 = schema3.hasProps();
    Object obj11 = schema3.getObjectProp("hi!");
    boolean boolean12 = schema3.isNullable();
    org.apache.avro.LogicalType logicalType13 = schema3.getLogicalType();
    org.apache.avro.Schema schema14 = org.apache.avro.Schema.createMap(schema3);
    org.apache.avro.ParseContext parseContext16 = new org.apache.avro.ParseContext();
    boolean boolean17 = parseContext16.hasNewSchemas();
    java.util.List<org.apache.avro.Schema> schemaList18 = parseContext16.resolveAllSchemas();
    parseContext16.rollback();
    // The following exception was thrown during execution in test generation
    try {
      schema3.addProp("long", (Object) parseContext16);
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
    org.junit.Assert.assertNotNull(strSet5);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str6,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNull(field8);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    org.junit.Assert.assertNull(obj11);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    org.junit.Assert.assertNull(logicalType13);
    org.junit.Assert.assertNotNull(schema14);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    org.junit.Assert.assertNotNull(schemaList18);
  }

  @Test
  public void test137() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test137");
    org.apache.avro.Schema.Field[] fieldArray0 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList1 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList1,
        fieldArray0);
    org.apache.avro.Schema schema3 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
    String str4 = schema3.getName();
    org.apache.avro.LogicalType logicalType5 = schema3.getLogicalType();
    String str6 = schema3.getNamespace();
    org.apache.avro.ParseContext parseContext7 = new org.apache.avro.ParseContext();
    boolean boolean8 = parseContext7.hasNewSchemas();
    org.apache.avro.Schema schema10 = parseContext7.getNamedSchema("boolean");
    java.util.Map<String, org.apache.avro.Schema> strMap11 = parseContext7.typesByName();
    boolean boolean12 = schema3.equals((Object) parseContext7);
    org.apache.avro.Schema.Parser parser13 = new org.apache.avro.Schema.Parser(parseContext7);
    boolean boolean14 = parser13.getValidateDefaults();
    org.junit.Assert.assertNotNull(fieldArray0);
    org.junit.Assert.assertArrayEquals(fieldArray0, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertNotNull(schema3);
    org.junit.Assert.assertNull(str4);
    org.junit.Assert.assertNull(logicalType5);
    org.junit.Assert.assertNull(str6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    org.junit.Assert.assertNull(schema10);
    org.junit.Assert.assertNotNull(strMap11);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
  }

  @Test
  public void test138() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test138");
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
    org.apache.avro.Schema.Field[] fieldArray25 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList26 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean27 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList26,
        fieldArray25);
    org.apache.avro.Schema schema28 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList26);
    boolean boolean29 = schema28.isNullable();
    java.util.Set<String> strSet30 = schema28.getAliases();
    String str31 = schema28.toString();
    org.apache.avro.Schema.Field field33 = schema28.getField("long");
    java.util.List<org.apache.avro.Schema.Field> fieldList34 = schema28.getFields();
    String str36 = schema28.toString(false);
    java.util.Map<String, Object> strMap37 = schema28.getObjectProps();
    String str38 = schema28.toString();
    java.util.Map<String, Object> strMap39 = schema28.getObjectProps();
    boolean boolean40 = schema28.isNullable();
    org.apache.avro.SchemaParser.ParseResult parseResult41 = parseContext0.commit(schema28);
    String str43 = schema28.getProp("{\"type\":\"record\",\"fields\":[],\"\":\"array\"}");
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
    org.junit.Assert.assertNotNull(fieldArray25);
    org.junit.Assert.assertArrayEquals(fieldArray25, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    org.junit.Assert.assertNotNull(schema28);
    org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    org.junit.Assert.assertNotNull(strSet30);
    org.junit.Assert.assertEquals("'" + str31 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str31,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNull(field33);
    org.junit.Assert.assertNotNull(fieldList34);
    org.junit.Assert.assertEquals("'" + str36 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str36,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNotNull(strMap37);
    org.junit.Assert.assertEquals("'" + str38 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str38,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNotNull(strMap39);
    org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    org.junit.Assert.assertNotNull(parseResult41);
    org.junit.Assert.assertNull(str43);
  }

  @Test
  public void test139() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test139");
    org.apache.avro.Schema.Field[] fieldArray0 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList1 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList1,
        fieldArray0);
    org.apache.avro.Schema schema3 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
    boolean boolean4 = schema3.isNullable();
    java.util.Set<String> strSet5 = schema3.getAliases();
    com.fasterxml.jackson.databind.JsonNode jsonNode6 = null;
    boolean boolean7 = schema3.isValidDefault(jsonNode6);
    String str8 = schema3.getDoc();
    org.apache.avro.Schema schema9 = org.apache.avro.Schema.createMap(schema3);
    String str10 = schema3.getFullName();
    boolean boolean11 = schema3.isUnion();
    java.util.List<org.apache.avro.Schema.Field> fieldList12 = schema3.getFields();
    org.apache.avro.Schema schema13 = org.apache.avro.Schema.createRecord(fieldList12);
    org.apache.avro.Schema.Field[] fieldArray14 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList15 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList15,
        fieldArray14);
    org.apache.avro.Schema schema17 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList15);
    boolean boolean18 = schema17.isUnion();
    org.apache.avro.Schema.Type type19 = schema17.getType();
    org.apache.avro.ParseContext parseContext20 = new org.apache.avro.ParseContext();
    boolean boolean21 = parseContext20.hasNewSchemas();
    java.util.Map<String, org.apache.avro.Schema> strMap22 = parseContext20.typesByName();
    org.apache.avro.Schema.Field[] fieldArray23 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList24 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean25 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList24,
        fieldArray23);
    org.apache.avro.Schema schema26 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList24);
    boolean boolean27 = schema26.isNullable();
    java.util.Set<String> strSet28 = schema26.getAliases();
    String str29 = schema26.toString();
    org.apache.avro.Schema.Field field31 = schema26.getField("long");
    java.util.List<org.apache.avro.Schema.Field> fieldList32 = schema26.getFields();
    boolean boolean34 = schema26.equals((Object) "long type:RECORD pos:-1");
    java.util.List<org.apache.avro.Schema.Field> fieldList35 = schema26.getFields();
    Object obj37 = null;
    Object obj38 = schema26.getObjectProp("", obj37);
    org.apache.avro.Schema schema39 = parseContext20.resolve(schema26);
    parseContext20.commit();
    java.util.List<org.apache.avro.Schema> schemaList41 = parseContext20.resolveAllSchemas();
    String str43 = schema17.toString((java.util.Collection<org.apache.avro.Schema>) schemaList41, false);
    String str45 = schema13.toString((java.util.Collection<org.apache.avro.Schema>) schemaList41, true);
    org.apache.avro.Schema.Field[] fieldArray46 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList47 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean48 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList47,
        fieldArray46);
    org.apache.avro.Schema schema49 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList47);
    boolean boolean50 = schema49.isNullable();
    java.util.Set<String> strSet51 = schema49.getAliases();
    String str52 = schema49.toString();
    org.apache.avro.Schema.Field field54 = schema49.getField("long");
    java.util.List<org.apache.avro.Schema.Field> fieldList55 = schema49.getFields();
    String str57 = schema49.toString(false);
    java.util.Map<String, Object> strMap58 = schema49.getObjectProps();
    java.util.List<org.apache.avro.Schema.Field> fieldList59 = schema49.getFields();
    // The following exception was thrown during execution in test generation
    try {
      schema13.setFields(fieldList59);
      org.junit.Assert
          .fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Fields are already set");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(fieldArray0);
    org.junit.Assert.assertArrayEquals(fieldArray0, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertNotNull(schema3);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    org.junit.Assert.assertNotNull(strSet5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertNull(str8);
    org.junit.Assert.assertNotNull(schema9);
    org.junit.Assert.assertNull(str10);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    org.junit.Assert.assertNotNull(fieldList12);
    org.junit.Assert.assertNotNull(schema13);
    org.junit.Assert.assertNotNull(fieldArray14);
    org.junit.Assert.assertArrayEquals(fieldArray14, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    org.junit.Assert.assertNotNull(schema17);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    org.junit.Assert.assertTrue("'" + type19 + "' != '" + org.apache.avro.Schema.Type.RECORD + "'",
        type19.equals(org.apache.avro.Schema.Type.RECORD));
    org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    org.junit.Assert.assertNotNull(strMap22);
    org.junit.Assert.assertNotNull(fieldArray23);
    org.junit.Assert.assertArrayEquals(fieldArray23, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    org.junit.Assert.assertNotNull(schema26);
    org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    org.junit.Assert.assertNotNull(strSet28);
    org.junit.Assert.assertEquals("'" + str29 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str29,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNull(field31);
    org.junit.Assert.assertNotNull(fieldList32);
    org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    org.junit.Assert.assertNotNull(fieldList35);
    org.junit.Assert.assertNull(obj38);
    org.junit.Assert.assertNotNull(schema39);
    org.junit.Assert.assertNotNull(schemaList41);
    org.junit.Assert.assertEquals("'" + str43 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str43,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertEquals("'" + str45 + "' != '" + "{\n  \"type\" : \"record\",\n  \"fields\" : [ ]\n}" + "'",
        str45, "{\n  \"type\" : \"record\",\n  \"fields\" : [ ]\n}");
    org.junit.Assert.assertNotNull(fieldArray46);
    org.junit.Assert.assertArrayEquals(fieldArray46, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    org.junit.Assert.assertNotNull(schema49);
    org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    org.junit.Assert.assertNotNull(strSet51);
    org.junit.Assert.assertEquals("'" + str52 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str52,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNull(field54);
    org.junit.Assert.assertNotNull(fieldList55);
    org.junit.Assert.assertEquals("'" + str57 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str57,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNotNull(strMap58);
    org.junit.Assert.assertNotNull(fieldList59);
  }

  @Test
  public void test140() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test140");
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
    String str11 = schema3.toString(false);
    java.util.function.BiConsumer<String, Object> strBiConsumer12 = null;
    schema3.forEachProperty(strBiConsumer12);
    String str14 = schema3.toString();
    org.apache.avro.ParseContext parseContext15 = new org.apache.avro.ParseContext();
    org.apache.avro.Schema schema17 = parseContext15.getNamedSchema("hi!");
    org.apache.avro.Schema schema19 = parseContext15.getNamedSchema("");
    java.util.List<org.apache.avro.Schema> schemaList20 = parseContext15.resolveAllSchemas();
    String str22 = schema3.toString((java.util.Collection<org.apache.avro.Schema>) schemaList20, false);
    String str23 = schema3.getDoc();
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
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str11,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str14,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNull(schema17);
    org.junit.Assert.assertNull(schema19);
    org.junit.Assert.assertNotNull(schemaList20);
    org.junit.Assert.assertEquals("'" + str22 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str22,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNull(str23);
  }

  @Test
  public void test141() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test141");
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
    com.fasterxml.jackson.databind.JsonNode jsonNode20 = null;
    boolean boolean21 = schema6.isValidDefault(jsonNode20);
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
    org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
  }
}
