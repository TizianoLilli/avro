package customTests.refactorized;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ParseContextC_4RandoopTest {

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
  public void test002() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test002");
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
      Integer int28 = schema24.getIndexNamed("hi!");
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a union: {\"type\":\"record\",\"fields\":[]}");
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
    org.apache.avro.SchemaParser.ParseResult parseResult6 = parseContext1.commit(schema5);
    java.util.List list7 = parseContext1.resolveAllSchemas();
    parseContext1.commit();
    org.junit.Assert.assertNotNull(nameValidator0);
    org.junit.Assert.assertNotNull(fieldArray2);
    org.junit.Assert.assertArrayEquals(fieldArray2, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertNotNull(parseResult6);
    org.junit.Assert.assertNotNull(list7);
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
    boolean boolean4 = schema3.isUnion();
    java.util.Set<String> strSet5 = schema3.getAliases();
    String str6 = schema3.getDoc();
    org.apache.avro.NameValidator nameValidator8 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext9 = new org.apache.avro.ParseContext(nameValidator8);
    org.apache.avro.Schema schema12 = parseContext9.find("hi!", "hi!");
    // The following exception was thrown during execution in test generation
    try {
      schema3.addProp("record", (Object) parseContext9);
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
    org.junit.Assert.assertNull(str6);
    org.junit.Assert.assertNotNull(nameValidator8);
    org.junit.Assert.assertNotNull(schema12);
  }

  @Test
  public void test005() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test005");
    org.apache.avro.NameValidator nameValidator0 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext1 = new org.apache.avro.ParseContext(nameValidator0);
    org.apache.avro.Schema schema4 = parseContext1.find("hi!", "hi!");
    // The following exception was thrown during execution in test generation
    try {
      int int6 = schema4.getEnumOrdinal("{\"type\":\"record\",\"fields\":[]}");
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: {\"type\":\"record\",\"name\":\"UnresolvedSchema_3\",\"namespace\":\"org.apache.avro.compiler\",\"doc\":\"unresolved schema\",\"fields\":[],\"org.apache.avro.idl.unresolved.name\":\"hi!.hi!\"}");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(nameValidator0);
    org.junit.Assert.assertNotNull(schema4);
  }

  @Test
  public void test006() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test006");
    org.apache.avro.NameValidator nameValidator0 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.Schema.Parser parser1 = new org.apache.avro.Schema.Parser(nameValidator0);
    org.apache.avro.Schema.setNameValidator(nameValidator0);
    org.apache.avro.ParseContext parseContext3 = new org.apache.avro.ParseContext(nameValidator0);
    boolean boolean4 = parseContext3.hasNewSchemas();
    org.junit.Assert.assertNotNull(nameValidator0);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
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
    org.apache.avro.Schema schema22 = parseContext1.getNamedSchema("{\"type\":\"record\",\"fields\":[]}");
    org.apache.avro.Schema schema24 = parseContext1.getNamedSchema("{\"type\":\"record\",\"fields\":[]}");
    parseContext1.rollback();
    boolean boolean26 = parseContext1.hasNewSchemas();
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
    org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
  }

  @Test
  public void test008() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test008");
    org.apache.avro.NameValidator nameValidator1 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext2 = new org.apache.avro.ParseContext(nameValidator1);
    org.apache.avro.Schema schema5 = parseContext2.find("hi!", "hi!");
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema.Field field6 = new org.apache.avro.Schema.Field("{\"type\":\"record\",\"fields\":[]}",
          schema5);
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"record\",\"fields\":[]}");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(nameValidator1);
    org.junit.Assert.assertNotNull(schema5);
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
    org.apache.avro.Schema schema22 = parseContext1.getNamedSchema("{\"type\":\"record\",\"fields\":[]}");
    org.apache.avro.Schema schema24 = parseContext1.getNamedSchema("{\"type\":\"record\",\"fields\":[]}");
    parseContext1.rollback();
    parseContext1.commit();
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
  }

  @Test
  public void test010() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test010");
    org.apache.avro.NameValidator nameValidator4 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext5 = new org.apache.avro.ParseContext(nameValidator4);
    org.apache.avro.Schema.Field[] fieldArray6 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList7 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList7,
        fieldArray6);
    org.apache.avro.Schema schema9 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList7);
    boolean boolean10 = schema9.isNullable();
    java.util.Set<String> strSet11 = schema9.getAliases();
    String str12 = schema9.toString();
    org.apache.avro.Schema.Field[] fieldArray13 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList14 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList14,
        fieldArray13);
    org.apache.avro.Schema schema16 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList14);
    boolean boolean17 = schema16.isNullable();
    java.util.Set<String> strSet18 = schema16.getAliases();
    String str19 = schema16.toString();
    org.apache.avro.Schema.Field field21 = schema16.getField("long");
    boolean boolean22 = schema16.hasProps();
    org.apache.avro.Schema schema23 = org.apache.avro.Schema.applyAliases(schema9, schema16);
    org.apache.avro.Schema schema24 = parseContext5.resolve(schema23);
    org.apache.avro.Schema schema26 = parseContext5.getNamedSchema("{\"type\":\"record\",\"fields\":[]}");
    org.apache.avro.Schema schema28 = parseContext5.getNamedSchema("{\"type\":\"record\",\"fields\":[]}");
    parseContext5.rollback();
    java.util.List list30 = parseContext5.resolveAllSchemas();
    org.apache.avro.Schema schema31 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) list30);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema32 = org.apache.avro.Schema.createRecord(
          "{\n  \"type\" : \"record\",\n  \"fields\" : [ ]\n}", "hi!", "fixed", false,
          (java.util.List<org.apache.avro.Schema.Field>) list30);
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {?  \"type\" : \"record\",?  \"fields\" : [ ]?}");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(nameValidator4);
    org.junit.Assert.assertNotNull(fieldArray6);
    org.junit.Assert.assertArrayEquals(fieldArray6, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    org.junit.Assert.assertNotNull(schema9);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    org.junit.Assert.assertNotNull(strSet11);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str12,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNotNull(fieldArray13);
    org.junit.Assert.assertArrayEquals(fieldArray13, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    org.junit.Assert.assertNotNull(schema16);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    org.junit.Assert.assertNotNull(strSet18);
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str19,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNull(field21);
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    org.junit.Assert.assertNotNull(schema23);
    org.junit.Assert.assertNotNull(schema24);
    org.junit.Assert.assertNull(schema26);
    org.junit.Assert.assertNull(schema28);
    org.junit.Assert.assertNotNull(list30);
    org.junit.Assert.assertNotNull(schema31);
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
    boolean boolean5 = schema3.propsContainsKey("{\"type\":\"record\",\"fields\":[]}");
    org.apache.avro.NameValidator nameValidator6 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext7 = new org.apache.avro.ParseContext(nameValidator6);
    org.apache.avro.Schema.Field[] fieldArray8 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList9 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList9,
        fieldArray8);
    org.apache.avro.Schema schema11 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList9);
    boolean boolean12 = schema11.isNullable();
    java.util.Set<String> strSet13 = schema11.getAliases();
    String str14 = schema11.toString();
    org.apache.avro.Schema.Field[] fieldArray15 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList16 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList16,
        fieldArray15);
    org.apache.avro.Schema schema18 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList16);
    boolean boolean19 = schema18.isNullable();
    java.util.Set<String> strSet20 = schema18.getAliases();
    String str21 = schema18.toString();
    org.apache.avro.Schema.Field field23 = schema18.getField("long");
    boolean boolean24 = schema18.hasProps();
    org.apache.avro.Schema schema25 = org.apache.avro.Schema.applyAliases(schema11, schema18);
    org.apache.avro.Schema schema26 = parseContext7.resolve(schema25);
    org.apache.avro.Schema schema28 = parseContext7.getNamedSchema("{\"type\":\"record\",\"fields\":[]}");
    org.apache.avro.Schema schema30 = parseContext7.getNamedSchema("{\"type\":\"record\",\"fields\":[]}");
    parseContext7.rollback();
    java.util.List list32 = parseContext7.resolveAllSchemas();
    // The following exception was thrown during execution in test generation
    try {
      schema3.setFields((java.util.List<org.apache.avro.Schema.Field>) list32);
      org.junit.Assert
          .fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Fields are already set");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(fieldArray0);
    org.junit.Assert.assertArrayEquals(fieldArray0, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertNotNull(schema3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    org.junit.Assert.assertNotNull(nameValidator6);
    org.junit.Assert.assertNotNull(fieldArray8);
    org.junit.Assert.assertArrayEquals(fieldArray8, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    org.junit.Assert.assertNotNull(schema11);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    org.junit.Assert.assertNotNull(strSet13);
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str14,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNotNull(fieldArray15);
    org.junit.Assert.assertArrayEquals(fieldArray15, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    org.junit.Assert.assertNotNull(schema18);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    org.junit.Assert.assertNotNull(strSet20);
    org.junit.Assert.assertEquals("'" + str21 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str21,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNull(field23);
    org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    org.junit.Assert.assertNotNull(schema25);
    org.junit.Assert.assertNotNull(schema26);
    org.junit.Assert.assertNull(schema28);
    org.junit.Assert.assertNull(schema30);
    org.junit.Assert.assertNotNull(list32);
  }

  @Test
  public void test012() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test012");
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
    java.util.List<org.apache.avro.Schema.Field> fieldList16 = schema10.getFields();
    String str18 = schema10.toString(false);
    java.util.function.BiConsumer<String, Object> strBiConsumer19 = null;
    schema10.forEachProperty(strBiConsumer19);
    schema3.addAllProps((org.apache.avro.JsonProperties) schema10);
    org.apache.avro.NameValidator nameValidator22 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext23 = new org.apache.avro.ParseContext(nameValidator22);
    org.apache.avro.Schema.Field[] fieldArray24 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList25 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean26 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList25,
        fieldArray24);
    org.apache.avro.Schema schema27 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList25);
    boolean boolean28 = schema27.isNullable();
    java.util.Set<String> strSet29 = schema27.getAliases();
    String str30 = schema27.toString();
    org.apache.avro.Schema.Field[] fieldArray31 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList32 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean33 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList32,
        fieldArray31);
    org.apache.avro.Schema schema34 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList32);
    boolean boolean35 = schema34.isNullable();
    java.util.Set<String> strSet36 = schema34.getAliases();
    String str37 = schema34.toString();
    org.apache.avro.Schema.Field field39 = schema34.getField("long");
    boolean boolean40 = schema34.hasProps();
    org.apache.avro.Schema schema41 = org.apache.avro.Schema.applyAliases(schema27, schema34);
    org.apache.avro.Schema schema42 = parseContext23.resolve(schema41);
    org.apache.avro.Schema schema44 = parseContext23.getNamedSchema("{\"type\":\"record\",\"fields\":[]}");
    org.apache.avro.Schema schema46 = parseContext23.getNamedSchema("{\"type\":\"record\",\"fields\":[]}");
    parseContext23.rollback();
    java.util.List list48 = parseContext23.resolveAllSchemas();
    org.apache.avro.Schema schema49 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) list48);
    org.apache.avro.Schema schema50 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) list48);
    // The following exception was thrown during execution in test generation
    try {
      schema10.setFields((java.util.List<org.apache.avro.Schema.Field>) list48);
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
    org.junit.Assert.assertNotNull(fieldList16);
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str18,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNotNull(nameValidator22);
    org.junit.Assert.assertNotNull(fieldArray24);
    org.junit.Assert.assertArrayEquals(fieldArray24, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    org.junit.Assert.assertNotNull(schema27);
    org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    org.junit.Assert.assertNotNull(strSet29);
    org.junit.Assert.assertEquals("'" + str30 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str30,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNotNull(fieldArray31);
    org.junit.Assert.assertArrayEquals(fieldArray31, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    org.junit.Assert.assertNotNull(schema34);
    org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    org.junit.Assert.assertNotNull(strSet36);
    org.junit.Assert.assertEquals("'" + str37 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str37,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNull(field39);
    org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    org.junit.Assert.assertNotNull(schema41);
    org.junit.Assert.assertNotNull(schema42);
    org.junit.Assert.assertNull(schema44);
    org.junit.Assert.assertNull(schema46);
    org.junit.Assert.assertNotNull(list48);
    org.junit.Assert.assertNotNull(schema49);
    org.junit.Assert.assertNotNull(schema50);
  }

  @Test
  public void test013() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test013");
    org.apache.avro.Schema.Type type3 = org.apache.avro.Schema.Type.DOUBLE;
    org.apache.avro.Schema.SeenPair seenPair5 = new org.apache.avro.Schema.SeenPair((Object) type3, (Object) 1);
    org.apache.avro.Schema.Field[] fieldArray6 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList7 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList7,
        fieldArray6);
    org.apache.avro.Schema schema9 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList7);
    boolean boolean10 = schema9.isNullable();
    java.util.Set<String> strSet11 = schema9.getAliases();
    com.fasterxml.jackson.databind.JsonNode jsonNode12 = null;
    boolean boolean13 = schema9.isValidDefault(jsonNode12);
    String str14 = schema9.getDoc();
    org.apache.avro.Schema schema15 = org.apache.avro.Schema.createMap(schema9);
    boolean boolean16 = seenPair5.equals((Object) schema9);
    org.apache.avro.Schema.Field[] fieldArray17 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList18 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList18,
        fieldArray17);
    org.apache.avro.Schema schema20 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList18);
    boolean boolean21 = schema20.isNullable();
    org.apache.avro.Schema schema22 = org.apache.avro.Schema.createArray(schema20);
    Object obj24 = schema22.getObjectProp("");
    org.apache.avro.Schema.Type type25 = schema22.getType();
    boolean boolean26 = seenPair5.equals((Object) schema22);
    org.apache.avro.NameValidator nameValidator27 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext28 = new org.apache.avro.ParseContext(nameValidator27);
    org.apache.avro.Schema.Field[] fieldArray29 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList30 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean31 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList30,
        fieldArray29);
    org.apache.avro.Schema schema32 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList30);
    org.apache.avro.SchemaParser.ParseResult parseResult33 = parseContext28.commit(schema32);
    java.util.List list34 = parseContext28.resolveAllSchemas();
    boolean boolean35 = seenPair5.equals((Object) list34);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema37 = org.apache.avro.Schema.createEnum("long", "fixed", "long",
          (java.util.List<String>) list34, "boolean");
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.SchemaParseException; message: The Enum Default: boolean is not in the enum symbol set: []");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type3 + "' != '" + org.apache.avro.Schema.Type.DOUBLE + "'",
        type3.equals(org.apache.avro.Schema.Type.DOUBLE));
    org.junit.Assert.assertNotNull(fieldArray6);
    org.junit.Assert.assertArrayEquals(fieldArray6, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    org.junit.Assert.assertNotNull(schema9);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    org.junit.Assert.assertNotNull(strSet11);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    org.junit.Assert.assertNull(str14);
    org.junit.Assert.assertNotNull(schema15);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    org.junit.Assert.assertNotNull(fieldArray17);
    org.junit.Assert.assertArrayEquals(fieldArray17, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    org.junit.Assert.assertNotNull(schema20);
    org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    org.junit.Assert.assertNotNull(schema22);
    org.junit.Assert.assertNull(obj24);
    org.junit.Assert.assertTrue("'" + type25 + "' != '" + org.apache.avro.Schema.Type.ARRAY + "'",
        type25.equals(org.apache.avro.Schema.Type.ARRAY));
    org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    org.junit.Assert.assertNotNull(nameValidator27);
    org.junit.Assert.assertNotNull(fieldArray29);
    org.junit.Assert.assertArrayEquals(fieldArray29, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    org.junit.Assert.assertNotNull(schema32);
    org.junit.Assert.assertNotNull(parseResult33);
    org.junit.Assert.assertNotNull(list34);
    org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
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
    org.apache.avro.SchemaParser.ParseResult parseResult6 = parseContext1.commit(schema5);
    java.util.List list7 = parseContext1.resolveAllSchemas();
    org.apache.avro.Schema schema10 = parseContext1.find("fixed", "hi!");
    org.apache.avro.Schema.Parser parser11 = new org.apache.avro.Schema.Parser(parseContext1);
    org.junit.Assert.assertNotNull(nameValidator0);
    org.junit.Assert.assertNotNull(fieldArray2);
    org.junit.Assert.assertArrayEquals(fieldArray2, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertNotNull(parseResult6);
    org.junit.Assert.assertNotNull(list7);
    org.junit.Assert.assertNotNull(schema10);
  }

  @Test
  public void test015() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test015");
    org.apache.avro.NameValidator nameValidator3 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext4 = new org.apache.avro.ParseContext(nameValidator3);
    org.apache.avro.Schema.Field[] fieldArray5 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList6 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList6,
        fieldArray5);
    org.apache.avro.Schema schema8 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList6);
    boolean boolean9 = schema8.isNullable();
    java.util.Set<String> strSet10 = schema8.getAliases();
    String str11 = schema8.toString();
    org.apache.avro.Schema.Field[] fieldArray12 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList13 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList13,
        fieldArray12);
    org.apache.avro.Schema schema15 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList13);
    boolean boolean16 = schema15.isNullable();
    java.util.Set<String> strSet17 = schema15.getAliases();
    String str18 = schema15.toString();
    org.apache.avro.Schema.Field field20 = schema15.getField("long");
    boolean boolean21 = schema15.hasProps();
    org.apache.avro.Schema schema22 = org.apache.avro.Schema.applyAliases(schema8, schema15);
    org.apache.avro.Schema schema23 = parseContext4.resolve(schema22);
    org.apache.avro.Schema schema25 = parseContext4.getNamedSchema("{\"type\":\"record\",\"fields\":[]}");
    org.apache.avro.Schema schema27 = parseContext4.getNamedSchema("{\"type\":\"record\",\"fields\":[]}");
    parseContext4.commit();
    java.util.List list29 = parseContext4.resolveAllSchemas();
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema31 = org.apache.avro.Schema.createEnum("bytes",
          "{\"type\":\"record\",\"fields\":[]}", "boolean", (java.util.List<String>) list29, "fixed");
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.SchemaParseException; message: The Enum Default: fixed is not in the enum symbol set: []");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(nameValidator3);
    org.junit.Assert.assertNotNull(fieldArray5);
    org.junit.Assert.assertArrayEquals(fieldArray5, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertNotNull(schema8);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    org.junit.Assert.assertNotNull(strSet10);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str11,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNotNull(fieldArray12);
    org.junit.Assert.assertArrayEquals(fieldArray12, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    org.junit.Assert.assertNotNull(schema15);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    org.junit.Assert.assertNotNull(strSet17);
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str18,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNull(field20);
    org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    org.junit.Assert.assertNotNull(schema22);
    org.junit.Assert.assertNotNull(schema23);
    org.junit.Assert.assertNull(schema25);
    org.junit.Assert.assertNull(schema27);
    org.junit.Assert.assertNotNull(list29);
  }

  @Test
  public void test016() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test016");
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
    org.apache.avro.Schema.Field[] fieldArray23 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList24 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean25 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList24,
        fieldArray23);
    org.apache.avro.Schema schema26 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList24);
    String str27 = schema26.getName();
    org.apache.avro.LogicalType logicalType28 = schema26.getLogicalType();
    org.apache.avro.SchemaParser.ParseResult parseResult29 = parseContext1.commit(schema26);
    java.util.Map map30 = parseContext1.typesByName();
    org.apache.avro.Schema.Field[] fieldArray31 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList32 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean33 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList32,
        fieldArray31);
    org.apache.avro.Schema schema34 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList32);
    boolean boolean35 = schema34.isNullable();
    org.apache.avro.Schema schema36 = org.apache.avro.Schema.createArray(schema34);
    Object obj38 = schema36.getObjectProp("");
    org.apache.avro.Schema.Type type39 = schema36.getType();
    // The following exception was thrown during execution in test generation
    try {
      parseContext1.put(schema36);
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroTypeException; message: You can only put a named schema into the context");
    } catch (org.apache.avro.AvroTypeException e) {
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
    org.junit.Assert.assertNull(schema22);
    org.junit.Assert.assertNotNull(fieldArray23);
    org.junit.Assert.assertArrayEquals(fieldArray23, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    org.junit.Assert.assertNotNull(schema26);
    org.junit.Assert.assertNull(str27);
    org.junit.Assert.assertNull(logicalType28);
    org.junit.Assert.assertNotNull(parseResult29);
    org.junit.Assert.assertNotNull(map30);
    org.junit.Assert.assertNotNull(fieldArray31);
    org.junit.Assert.assertArrayEquals(fieldArray31, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    org.junit.Assert.assertNotNull(schema34);
    org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    org.junit.Assert.assertNotNull(schema36);
    org.junit.Assert.assertNull(obj38);
    org.junit.Assert.assertTrue("'" + type39 + "' != '" + org.apache.avro.Schema.Type.ARRAY + "'",
        type39.equals(org.apache.avro.Schema.Type.ARRAY));
  }

  @Test
  public void test017() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test017");
    org.apache.avro.Schema.Field[] fieldArray1 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList2 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList2,
        fieldArray1);
    org.apache.avro.Schema schema4 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList2);
    boolean boolean5 = schema4.isNullable();
    java.util.Set<String> strSet6 = schema4.getAliases();
    org.apache.avro.Schema.Field field8 = new org.apache.avro.Schema.Field("long", schema4, "long");
    org.apache.avro.LogicalType logicalType9 = schema4.getLogicalType();
    String str10 = schema4.getFullName();
    org.apache.avro.NameValidator nameValidator11 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext12 = new org.apache.avro.ParseContext(nameValidator11);
    org.apache.avro.Schema.Field[] fieldArray13 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList14 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList14,
        fieldArray13);
    org.apache.avro.Schema schema16 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList14);
    boolean boolean17 = schema16.isNullable();
    java.util.Set<String> strSet18 = schema16.getAliases();
    String str19 = schema16.toString();
    org.apache.avro.Schema.Field[] fieldArray20 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList21 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList21,
        fieldArray20);
    org.apache.avro.Schema schema23 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList21);
    boolean boolean24 = schema23.isNullable();
    java.util.Set<String> strSet25 = schema23.getAliases();
    String str26 = schema23.toString();
    org.apache.avro.Schema.Field field28 = schema23.getField("long");
    boolean boolean29 = schema23.hasProps();
    org.apache.avro.Schema schema30 = org.apache.avro.Schema.applyAliases(schema16, schema23);
    org.apache.avro.Schema schema31 = parseContext12.resolve(schema30);
    org.apache.avro.Schema schema33 = parseContext12.getNamedSchema("{\"type\":\"record\",\"fields\":[]}");
    org.apache.avro.Schema schema35 = parseContext12.getNamedSchema("{\"type\":\"record\",\"fields\":[]}");
    parseContext12.rollback();
    java.util.List list37 = parseContext12.resolveAllSchemas();
    org.apache.avro.Schema schema38 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) list37);
    org.apache.avro.Schema schema39 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) list37);
    org.apache.avro.Schema schema40 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) list37);
    // The following exception was thrown during execution in test generation
    try {
      schema4.setFields((java.util.List<org.apache.avro.Schema.Field>) list37);
      org.junit.Assert
          .fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Fields are already set");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(fieldArray1);
    org.junit.Assert.assertArrayEquals(fieldArray1, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    org.junit.Assert.assertNotNull(schema4);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    org.junit.Assert.assertNotNull(strSet6);
    org.junit.Assert.assertNull(logicalType9);
    org.junit.Assert.assertNull(str10);
    org.junit.Assert.assertNotNull(nameValidator11);
    org.junit.Assert.assertNotNull(fieldArray13);
    org.junit.Assert.assertArrayEquals(fieldArray13, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    org.junit.Assert.assertNotNull(schema16);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    org.junit.Assert.assertNotNull(strSet18);
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str19,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNotNull(fieldArray20);
    org.junit.Assert.assertArrayEquals(fieldArray20, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    org.junit.Assert.assertNotNull(schema23);
    org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    org.junit.Assert.assertNotNull(strSet25);
    org.junit.Assert.assertEquals("'" + str26 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str26,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNull(field28);
    org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    org.junit.Assert.assertNotNull(schema30);
    org.junit.Assert.assertNotNull(schema31);
    org.junit.Assert.assertNull(schema33);
    org.junit.Assert.assertNull(schema35);
    org.junit.Assert.assertNotNull(list37);
    org.junit.Assert.assertNotNull(schema38);
    org.junit.Assert.assertNotNull(schema39);
    org.junit.Assert.assertNotNull(schema40);
  }

  @Test
  public void test018() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test018");
    org.apache.avro.Schema.Field[] fieldArray1 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList2 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList2,
        fieldArray1);
    org.apache.avro.Schema schema4 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList2);
    boolean boolean5 = schema4.isNullable();
    java.util.Set<String> strSet6 = schema4.getAliases();
    org.apache.avro.Schema.Field field8 = new org.apache.avro.Schema.Field("long", schema4, "long");
    String str9 = field8.toString();
    org.apache.avro.Schema schema10 = field8.schema();
    org.apache.avro.NameValidator nameValidator11 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext12 = new org.apache.avro.ParseContext(nameValidator11);
    org.apache.avro.Schema.Field[] fieldArray13 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList14 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList14,
        fieldArray13);
    org.apache.avro.Schema schema16 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList14);
    org.apache.avro.SchemaParser.ParseResult parseResult17 = parseContext12.commit(schema16);
    java.util.List list18 = parseContext12.resolveAllSchemas();
    org.apache.avro.Schema schema21 = parseContext12.find("fixed", "long type:RECORD pos:-1");
    org.apache.avro.Schema.SeenPair seenPair22 = new org.apache.avro.Schema.SeenPair((Object) field8,
        (Object) schema21);
    org.apache.avro.Schema.Parser parser23 = new org.apache.avro.Schema.Parser();
    java.util.Map<String, org.apache.avro.Schema> strMap24 = parser23.getTypes();
    org.apache.avro.Schema.Parser parser25 = new org.apache.avro.Schema.Parser();
    java.util.Map<String, org.apache.avro.Schema> strMap26 = parser25.getTypes();
    org.apache.avro.Schema.Parser parser27 = parser23.addTypes(strMap26);
    org.apache.avro.Schema.Parser parser28 = new org.apache.avro.Schema.Parser();
    java.util.Map<String, org.apache.avro.Schema> strMap29 = parser28.getTypes();
    org.apache.avro.Schema.Parser parser30 = parser23.addTypes(strMap29);
    boolean boolean31 = seenPair22.equals((Object) strMap29);
    org.apache.avro.Schema.Parser parser32 = new org.apache.avro.Schema.Parser();
    java.util.Map<String, org.apache.avro.Schema> strMap33 = parser32.getTypes();
    org.apache.avro.Schema.Parser parser34 = new org.apache.avro.Schema.Parser();
    java.util.Map<String, org.apache.avro.Schema> strMap35 = parser34.getTypes();
    org.apache.avro.Schema.Parser parser36 = parser32.addTypes(strMap35);
    org.apache.avro.Schema.Parser parser37 = new org.apache.avro.Schema.Parser();
    java.util.Map<String, org.apache.avro.Schema> strMap38 = parser37.getTypes();
    org.apache.avro.Schema.Parser parser39 = parser32.addTypes(strMap38);
    java.util.Map<String, org.apache.avro.Schema> strMap40 = parser39.getTypes();
    boolean boolean41 = seenPair22.equals((Object) strMap40);
    org.junit.Assert.assertNotNull(fieldArray1);
    org.junit.Assert.assertArrayEquals(fieldArray1, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    org.junit.Assert.assertNotNull(schema4);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    org.junit.Assert.assertNotNull(strSet6);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "long type:RECORD pos:-1" + "'", str9,
        "long type:RECORD pos:-1");
    org.junit.Assert.assertNotNull(schema10);
    org.junit.Assert.assertNotNull(nameValidator11);
    org.junit.Assert.assertNotNull(fieldArray13);
    org.junit.Assert.assertArrayEquals(fieldArray13, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    org.junit.Assert.assertNotNull(schema16);
    org.junit.Assert.assertNotNull(parseResult17);
    org.junit.Assert.assertNotNull(list18);
    org.junit.Assert.assertNotNull(schema21);
    org.junit.Assert.assertNotNull(strMap24);
    org.junit.Assert.assertNotNull(strMap26);
    org.junit.Assert.assertNotNull(parser27);
    org.junit.Assert.assertNotNull(strMap29);
    org.junit.Assert.assertNotNull(parser30);
    org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    org.junit.Assert.assertNotNull(strMap33);
    org.junit.Assert.assertNotNull(strMap35);
    org.junit.Assert.assertNotNull(parser36);
    org.junit.Assert.assertNotNull(strMap38);
    org.junit.Assert.assertNotNull(parser39);
    org.junit.Assert.assertNotNull(strMap40);
    org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
  }

  @Test
  public void test019() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test019");
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
    parseContext1.rollback();
    java.util.List list26 = parseContext1.resolveAllSchemas();
    org.apache.avro.Schema schema27 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) list26);
    org.apache.avro.Schema schema28 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) list26);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema.Field field30 = schema28.getField("record");
      org.junit.Assert
          .fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: []");
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
    org.junit.Assert.assertNull(schema22);
    org.junit.Assert.assertNull(schema24);
    org.junit.Assert.assertNotNull(list26);
    org.junit.Assert.assertNotNull(schema27);
    org.junit.Assert.assertNotNull(schema28);
  }

  @Test
  public void test020() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test020");
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
    parseContext1.commit();
    boolean boolean26 = parseContext1.hasNewSchemas();
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
    org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
  }

  @Test
  public void test021() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test021");
    org.apache.avro.Schema.Field[] fieldArray1 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList2 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList2,
        fieldArray1);
    org.apache.avro.Schema schema4 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList2);
    boolean boolean5 = schema4.isNullable();
    java.util.Set<String> strSet6 = schema4.getAliases();
    org.apache.avro.Schema.Field field8 = new org.apache.avro.Schema.Field("long", schema4, "long");
    String str9 = field8.toString();
    org.apache.avro.Schema schema10 = field8.schema();
    org.apache.avro.Schema schema11 = org.apache.avro.Schema.createArray(schema10);
    org.apache.avro.Schema.Field[] fieldArray12 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList13 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList13,
        fieldArray12);
    org.apache.avro.Schema schema15 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList13);
    boolean boolean17 = schema15.equals((Object) 1.0f);
    boolean boolean18 = schema11.equals((Object) schema15);
    boolean boolean19 = schema11.isUnion();
    org.apache.avro.NameValidator nameValidator24 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext25 = new org.apache.avro.ParseContext(nameValidator24);
    org.apache.avro.Schema.Field[] fieldArray26 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList27 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean28 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList27,
        fieldArray26);
    org.apache.avro.Schema schema29 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList27);
    boolean boolean30 = schema29.isNullable();
    java.util.Set<String> strSet31 = schema29.getAliases();
    String str32 = schema29.toString();
    org.apache.avro.Schema.Field[] fieldArray33 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList34 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean35 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList34,
        fieldArray33);
    org.apache.avro.Schema schema36 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList34);
    boolean boolean37 = schema36.isNullable();
    java.util.Set<String> strSet38 = schema36.getAliases();
    String str39 = schema36.toString();
    org.apache.avro.Schema.Field field41 = schema36.getField("long");
    boolean boolean42 = schema36.hasProps();
    org.apache.avro.Schema schema43 = org.apache.avro.Schema.applyAliases(schema29, schema36);
    org.apache.avro.Schema schema44 = parseContext25.resolve(schema43);
    org.apache.avro.Schema schema46 = parseContext25.getNamedSchema("{\"type\":\"record\",\"fields\":[]}");
    org.apache.avro.Schema schema48 = parseContext25.getNamedSchema("{\"type\":\"record\",\"fields\":[]}");
    parseContext25.rollback();
    java.util.List list50 = parseContext25.resolveAllSchemas();
    org.apache.avro.Schema schema51 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) list50);
    org.apache.avro.Schema schema52 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) list50);
    org.apache.avro.Schema schema53 = org.apache.avro.Schema.createRecord("array", "hi!",
        "{\"type\":\"record\",\"fields\":[]}", true, (java.util.List<org.apache.avro.Schema.Field>) list50);
    schema11.putAll((org.apache.avro.JsonProperties) schema53);
    org.junit.Assert.assertNotNull(fieldArray1);
    org.junit.Assert.assertArrayEquals(fieldArray1, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    org.junit.Assert.assertNotNull(schema4);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    org.junit.Assert.assertNotNull(strSet6);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "long type:RECORD pos:-1" + "'", str9,
        "long type:RECORD pos:-1");
    org.junit.Assert.assertNotNull(schema10);
    org.junit.Assert.assertNotNull(schema11);
    org.junit.Assert.assertNotNull(fieldArray12);
    org.junit.Assert.assertArrayEquals(fieldArray12, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    org.junit.Assert.assertNotNull(schema15);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    org.junit.Assert.assertNotNull(nameValidator24);
    org.junit.Assert.assertNotNull(fieldArray26);
    org.junit.Assert.assertArrayEquals(fieldArray26, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    org.junit.Assert.assertNotNull(schema29);
    org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    org.junit.Assert.assertNotNull(strSet31);
    org.junit.Assert.assertEquals("'" + str32 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str32,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNotNull(fieldArray33);
    org.junit.Assert.assertArrayEquals(fieldArray33, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    org.junit.Assert.assertNotNull(schema36);
    org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    org.junit.Assert.assertNotNull(strSet38);
    org.junit.Assert.assertEquals("'" + str39 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str39,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNull(field41);
    org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    org.junit.Assert.assertNotNull(schema43);
    org.junit.Assert.assertNotNull(schema44);
    org.junit.Assert.assertNull(schema46);
    org.junit.Assert.assertNull(schema48);
    org.junit.Assert.assertNotNull(list50);
    org.junit.Assert.assertNotNull(schema51);
    org.junit.Assert.assertNotNull(schema52);
    org.junit.Assert.assertNotNull(schema53);
  }

  @Test
  public void test022() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test022");
    org.apache.avro.NameValidator nameValidator0 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext1 = new org.apache.avro.ParseContext(nameValidator0);
    org.apache.avro.Schema.Field[] fieldArray2 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList3 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList3,
        fieldArray2);
    org.apache.avro.Schema schema5 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList3);
    org.apache.avro.SchemaParser.ParseResult parseResult6 = parseContext1.commit(schema5);
    java.util.List list7 = parseContext1.resolveAllSchemas();
    org.apache.avro.Schema schema10 = parseContext1.find("fixed", "long type:RECORD pos:-1");
    // The following exception was thrown during execution in test generation
    try {
      int int12 = schema10.getEnumOrdinal("array");
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: {\"type\":\"record\",\"name\":\"UnresolvedSchema_24\",\"namespace\":\"org.apache.avro.compiler\",\"doc\":\"unresolved schema\",\"fields\":[],\"org.apache.avro.idl.unresolved.name\":\"long type:RECORD pos:-1.fixed\"}");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(nameValidator0);
    org.junit.Assert.assertNotNull(fieldArray2);
    org.junit.Assert.assertArrayEquals(fieldArray2, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertNotNull(parseResult6);
    org.junit.Assert.assertNotNull(list7);
    org.junit.Assert.assertNotNull(schema10);
  }

  @Test
  public void test023() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test023");
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
    parseContext1.rollback();
    java.util.List list26 = parseContext1.resolveAllSchemas();
    org.apache.avro.Schema schema27 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) list26);
    org.apache.avro.Schema schema28 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) list26);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema.Field field30 = schema28.getField("enum");
      org.junit.Assert
          .fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: []");
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
    org.junit.Assert.assertNull(schema22);
    org.junit.Assert.assertNull(schema24);
    org.junit.Assert.assertNotNull(list26);
    org.junit.Assert.assertNotNull(schema27);
    org.junit.Assert.assertNotNull(schema28);
  }

  @Test
  public void test024() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test024");
    org.apache.avro.NameValidator nameValidator0 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext1 = new org.apache.avro.ParseContext(nameValidator0);
    org.apache.avro.Schema.Field[] fieldArray2 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList3 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList3,
        fieldArray2);
    org.apache.avro.Schema schema5 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList3);
    org.apache.avro.SchemaParser.ParseResult parseResult6 = parseContext1.commit(schema5);
    org.apache.avro.Schema.Parser parser7 = new org.apache.avro.Schema.Parser(parseContext1);
    java.util.Map<String, org.apache.avro.Schema> strMap8 = parser7.getTypes();
    org.apache.avro.Schema.Parser parser10 = parser7.setValidateDefaults(true);
    Iterable<org.apache.avro.Schema> schemaIterable11 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema.Parser parser12 = parser10.addTypes(schemaIterable11);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.Iterable.iterator()\" because \"types\" is null");
    } catch (NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(nameValidator0);
    org.junit.Assert.assertNotNull(fieldArray2);
    org.junit.Assert.assertArrayEquals(fieldArray2, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertNotNull(parseResult6);
    org.junit.Assert.assertNotNull(strMap8);
    org.junit.Assert.assertNotNull(parser10);
  }

  @Test
  public void test025() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test025");
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
    org.apache.avro.Schema.Field[] fieldArray22 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList23 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean24 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList23,
        fieldArray22);
    org.apache.avro.Schema schema25 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList23);
    boolean boolean26 = schema25.isNullable();
    java.util.Set<String> strSet27 = schema25.getAliases();
    com.fasterxml.jackson.databind.JsonNode jsonNode28 = null;
    boolean boolean29 = schema25.isValidDefault(jsonNode28);
    boolean boolean30 = schema25.isUnion();
    org.apache.avro.Schema.Field field32 = new org.apache.avro.Schema.Field("boolean", schema25, "boolean");
    org.apache.avro.LogicalType logicalType33 = schema25.getLogicalType();
    schema25.addProp("record", (Object) "boolean");
    org.apache.avro.Schema.Type type38 = org.apache.avro.Schema.Type.LONG;
    String str39 = type38.getName();
    schema25.addProp("hi!", (Object) str39);
    org.apache.avro.SchemaParser.ParseResult parseResult41 = parseContext1.commit(schema25);
    org.apache.avro.Schema.Field[] fieldArray42 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList43 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean44 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList43,
        fieldArray42);
    org.apache.avro.Schema schema45 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList43);
    boolean boolean46 = schema45.isNullable();
    org.apache.avro.Schema schema47 = org.apache.avro.Schema.createArray(schema45);
    Object obj49 = schema47.getObjectProp("");
    // The following exception was thrown during execution in test generation
    try {
      parseContext1.put(schema47);
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroTypeException; message: You can only put a named schema into the context");
    } catch (org.apache.avro.AvroTypeException e) {
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
    org.junit.Assert.assertNotNull(fieldArray22);
    org.junit.Assert.assertArrayEquals(fieldArray22, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    org.junit.Assert.assertNotNull(schema25);
    org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    org.junit.Assert.assertNotNull(strSet27);
    org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    org.junit.Assert.assertNull(logicalType33);
    org.junit.Assert.assertTrue("'" + type38 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type38.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertEquals("'" + str39 + "' != '" + "long" + "'", str39, "long");
    org.junit.Assert.assertNotNull(parseResult41);
    org.junit.Assert.assertNotNull(fieldArray42);
    org.junit.Assert.assertArrayEquals(fieldArray42, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    org.junit.Assert.assertNotNull(schema45);
    org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    org.junit.Assert.assertNotNull(schema47);
    org.junit.Assert.assertNull(obj49);
  }

  @Test
  public void test026() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test026");
    org.apache.avro.NameValidator nameValidator0 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext1 = new org.apache.avro.ParseContext(nameValidator0);
    org.apache.avro.Schema.Field[] fieldArray2 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList3 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList3,
        fieldArray2);
    org.apache.avro.Schema schema5 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList3);
    org.apache.avro.SchemaParser.ParseResult parseResult6 = parseContext1.commit(schema5);
    java.util.List list7 = parseContext1.resolveAllSchemas();
    org.apache.avro.Schema schema10 = parseContext1.find("fixed", "long type:RECORD pos:-1");
    org.apache.avro.Schema schema13 = parseContext1.find("hi!", "");
    java.util.Map map14 = parseContext1.typesByName();
    boolean boolean16 = parseContext1.contains("enum");
    java.util.List list17 = parseContext1.resolveAllSchemas();
    org.junit.Assert.assertNotNull(nameValidator0);
    org.junit.Assert.assertNotNull(fieldArray2);
    org.junit.Assert.assertArrayEquals(fieldArray2, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertNotNull(parseResult6);
    org.junit.Assert.assertNotNull(list7);
    org.junit.Assert.assertNotNull(schema10);
    org.junit.Assert.assertNotNull(schema13);
    org.junit.Assert.assertNotNull(map14);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    org.junit.Assert.assertNotNull(list17);
  }

  @Test
  public void test027() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test027");
    org.apache.avro.Schema.Field[] fieldArray3 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList4 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList4,
        fieldArray3);
    org.apache.avro.Schema schema6 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList4);
    boolean boolean7 = schema6.isNullable();
    java.util.Set<String> strSet8 = schema6.getAliases();
    Object obj10 = schema6.getObjectProp("hi!");
    String str12 = schema6.toString(false);
    String str14 = schema6.toString(false);
    org.apache.avro.NameValidator nameValidator16 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext17 = new org.apache.avro.ParseContext(nameValidator16);
    org.apache.avro.Schema.Field[] fieldArray18 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList19 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList19,
        fieldArray18);
    org.apache.avro.Schema schema21 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList19);
    boolean boolean22 = schema21.isNullable();
    java.util.Set<String> strSet23 = schema21.getAliases();
    String str24 = schema21.toString();
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
    boolean boolean34 = schema28.hasProps();
    org.apache.avro.Schema schema35 = org.apache.avro.Schema.applyAliases(schema21, schema28);
    org.apache.avro.Schema schema36 = parseContext17.resolve(schema35);
    org.apache.avro.Schema schema38 = parseContext17.getNamedSchema("{\"type\":\"record\",\"fields\":[]}");
    org.apache.avro.Schema schema40 = parseContext17.getNamedSchema("{\"type\":\"record\",\"fields\":[]}");
    parseContext17.rollback();
    java.util.List list42 = parseContext17.resolveAllSchemas();
    org.apache.avro.Schema schema43 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) list42);
    org.apache.avro.Schema schema44 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) list42);
    schema6.addProp("hi!", (Object) list42);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema47 = org.apache.avro.Schema.createEnum("{\"type\":\"record\",\"fields\":[]}",
          "{\"type\":\"record\",\"fields\":[],\"aliases\":[\"record\"]}", "hi!", (java.util.List<String>) list42,
          "record");
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"record\",\"fields\":[]}");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(fieldArray3);
    org.junit.Assert.assertArrayEquals(fieldArray3, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    org.junit.Assert.assertNotNull(schema6);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertNotNull(strSet8);
    org.junit.Assert.assertNull(obj10);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str12,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str14,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNotNull(nameValidator16);
    org.junit.Assert.assertNotNull(fieldArray18);
    org.junit.Assert.assertArrayEquals(fieldArray18, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    org.junit.Assert.assertNotNull(schema21);
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    org.junit.Assert.assertNotNull(strSet23);
    org.junit.Assert.assertEquals("'" + str24 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str24,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNotNull(fieldArray25);
    org.junit.Assert.assertArrayEquals(fieldArray25, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    org.junit.Assert.assertNotNull(schema28);
    org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    org.junit.Assert.assertNotNull(strSet30);
    org.junit.Assert.assertEquals("'" + str31 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str31,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNull(field33);
    org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    org.junit.Assert.assertNotNull(schema35);
    org.junit.Assert.assertNotNull(schema36);
    org.junit.Assert.assertNull(schema38);
    org.junit.Assert.assertNull(schema40);
    org.junit.Assert.assertNotNull(list42);
    org.junit.Assert.assertNotNull(schema43);
    org.junit.Assert.assertNotNull(schema44);
  }

  @Test
  public void test028() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test028");
    org.apache.avro.NameValidator nameValidator1 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext2 = new org.apache.avro.ParseContext(nameValidator1);
    org.apache.avro.Schema.Field[] fieldArray3 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList4 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList4,
        fieldArray3);
    org.apache.avro.Schema schema6 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList4);
    boolean boolean7 = schema6.isNullable();
    java.util.Set<String> strSet8 = schema6.getAliases();
    String str9 = schema6.toString();
    org.apache.avro.Schema.Field[] fieldArray10 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList11 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList11,
        fieldArray10);
    org.apache.avro.Schema schema13 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList11);
    boolean boolean14 = schema13.isNullable();
    java.util.Set<String> strSet15 = schema13.getAliases();
    String str16 = schema13.toString();
    org.apache.avro.Schema.Field field18 = schema13.getField("long");
    boolean boolean19 = schema13.hasProps();
    org.apache.avro.Schema schema20 = org.apache.avro.Schema.applyAliases(schema6, schema13);
    org.apache.avro.Schema schema21 = parseContext2.resolve(schema20);
    org.apache.avro.Schema schema23 = parseContext2.getNamedSchema("{\"type\":\"record\",\"fields\":[]}");
    org.apache.avro.Schema schema25 = parseContext2.getNamedSchema("{\"type\":\"record\",\"fields\":[]}");
    parseContext2.rollback();
    java.util.List list27 = parseContext2.resolveAllSchemas();
    org.apache.avro.Schema schema28 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) list27);
    org.apache.avro.Schema.Field field29 = new org.apache.avro.Schema.Field("record", schema28);
    org.junit.Assert.assertNotNull(nameValidator1);
    org.junit.Assert.assertNotNull(fieldArray3);
    org.junit.Assert.assertArrayEquals(fieldArray3, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    org.junit.Assert.assertNotNull(schema6);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertNotNull(strSet8);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str9,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNotNull(fieldArray10);
    org.junit.Assert.assertArrayEquals(fieldArray10, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    org.junit.Assert.assertNotNull(schema13);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    org.junit.Assert.assertNotNull(strSet15);
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str16,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNull(field18);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    org.junit.Assert.assertNotNull(schema20);
    org.junit.Assert.assertNotNull(schema21);
    org.junit.Assert.assertNull(schema23);
    org.junit.Assert.assertNull(schema25);
    org.junit.Assert.assertNotNull(list27);
    org.junit.Assert.assertNotNull(schema28);
  }

  @Test
  public void test029() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test029");
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
    org.apache.avro.Schema schema23 = parseContext1.find("long type:RECORD pos:-1", "record");
    org.apache.avro.Schema schema26 = parseContext1.find("fixed", "hi!");
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<String> strList27 = schema26.getEnumSymbols();
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: {\"type\":\"record\",\"name\":\"UnresolvedSchema_32\",\"namespace\":\"org.apache.avro.compiler\",\"doc\":\"unresolved schema\",\"fields\":[],\"org.apache.avro.idl.unresolved.name\":\"hi!.fixed\"}");
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
    org.junit.Assert.assertNotNull(schema23);
    org.junit.Assert.assertNotNull(schema26);
  }

  @Test
  public void test030() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test030");
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
    org.apache.avro.Schema.Field[] fieldArray23 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList24 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean25 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList24,
        fieldArray23);
    org.apache.avro.Schema schema26 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList24);
    String str27 = schema26.getName();
    org.apache.avro.LogicalType logicalType28 = schema26.getLogicalType();
    org.apache.avro.SchemaParser.ParseResult parseResult29 = parseContext1.commit(schema26);
    java.util.Map map30 = parseContext1.typesByName();
    boolean boolean32 = parseContext1.contains("hi!");
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
    org.junit.Assert.assertNotNull(fieldArray23);
    org.junit.Assert.assertArrayEquals(fieldArray23, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    org.junit.Assert.assertNotNull(schema26);
    org.junit.Assert.assertNull(str27);
    org.junit.Assert.assertNull(logicalType28);
    org.junit.Assert.assertNotNull(parseResult29);
    org.junit.Assert.assertNotNull(map30);
    org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
  }

  @Test
  public void test031() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test031");
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
    org.apache.avro.Schema schema23 = parseContext1.find("long type:RECORD pos:-1", "record");
    org.apache.avro.Schema schema26 = parseContext1.find("fixed", "hi!");
    org.apache.avro.Schema.Field[] fieldArray28 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList29 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean30 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList29,
        fieldArray28);
    org.apache.avro.Schema schema31 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList29);
    boolean boolean32 = schema31.isNullable();
    java.util.Set<String> strSet33 = schema31.getAliases();
    org.apache.avro.Schema.Field field35 = new org.apache.avro.Schema.Field("long", schema31, "long");
    String str36 = field35.toString();
    org.apache.avro.Schema schema37 = field35.schema();
    org.apache.avro.Schema schema38 = org.apache.avro.Schema.createArray(schema37);
    org.apache.avro.Schema.Field[] fieldArray39 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList40 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean41 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList40,
        fieldArray39);
    org.apache.avro.Schema schema42 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList40);
    boolean boolean44 = schema42.equals((Object) 1.0f);
    boolean boolean45 = schema38.equals((Object) schema42);
    schema38.addProp("", "record");
    org.apache.avro.SchemaParser.ParseResult parseResult49 = parseContext1.commit(schema38);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema.Field field51 = schema38.getField("record");
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: {\"type\":\"array\",\"items\":{\"type\":\"record\",\"fields\":[]},\"\":\"record\"}");
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
    org.junit.Assert.assertNotNull(schema23);
    org.junit.Assert.assertNotNull(schema26);
    org.junit.Assert.assertNotNull(fieldArray28);
    org.junit.Assert.assertArrayEquals(fieldArray28, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    org.junit.Assert.assertNotNull(schema31);
    org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    org.junit.Assert.assertNotNull(strSet33);
    org.junit.Assert.assertEquals("'" + str36 + "' != '" + "long type:RECORD pos:-1" + "'", str36,
        "long type:RECORD pos:-1");
    org.junit.Assert.assertNotNull(schema37);
    org.junit.Assert.assertNotNull(schema38);
    org.junit.Assert.assertNotNull(fieldArray39);
    org.junit.Assert.assertArrayEquals(fieldArray39, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    org.junit.Assert.assertNotNull(schema42);
    org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    org.junit.Assert.assertNotNull(parseResult49);
  }

  @Test
  public void test032() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test032");
    org.apache.avro.NameValidator nameValidator4 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext5 = new org.apache.avro.ParseContext(nameValidator4);
    org.apache.avro.Schema.Field[] fieldArray6 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList7 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList7,
        fieldArray6);
    org.apache.avro.Schema schema9 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList7);
    boolean boolean10 = schema9.isNullable();
    java.util.Set<String> strSet11 = schema9.getAliases();
    String str12 = schema9.toString();
    org.apache.avro.Schema.Field[] fieldArray13 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList14 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList14,
        fieldArray13);
    org.apache.avro.Schema schema16 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList14);
    boolean boolean17 = schema16.isNullable();
    java.util.Set<String> strSet18 = schema16.getAliases();
    String str19 = schema16.toString();
    org.apache.avro.Schema.Field field21 = schema16.getField("long");
    boolean boolean22 = schema16.hasProps();
    org.apache.avro.Schema schema23 = org.apache.avro.Schema.applyAliases(schema9, schema16);
    org.apache.avro.Schema schema24 = parseContext5.resolve(schema23);
    org.apache.avro.Schema schema26 = parseContext5.getNamedSchema("{\"type\":\"record\",\"fields\":[]}");
    org.apache.avro.Schema schema28 = parseContext5.getNamedSchema("{\"type\":\"record\",\"fields\":[]}");
    parseContext5.commit();
    java.util.List list30 = parseContext5.resolveAllSchemas();
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema31 = org.apache.avro.Schema.createRecord(
          "{\"type\":\"record\",\"fields\":[],\"aliases\":[\"record\"]}", "enum", "record", false,
          (java.util.List<org.apache.avro.Schema.Field>) list30);
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"record\",\"fields\":[],\"aliases\":[\"record\"]}");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(nameValidator4);
    org.junit.Assert.assertNotNull(fieldArray6);
    org.junit.Assert.assertArrayEquals(fieldArray6, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    org.junit.Assert.assertNotNull(schema9);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    org.junit.Assert.assertNotNull(strSet11);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str12,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNotNull(fieldArray13);
    org.junit.Assert.assertArrayEquals(fieldArray13, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    org.junit.Assert.assertNotNull(schema16);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    org.junit.Assert.assertNotNull(strSet18);
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str19,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNull(field21);
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    org.junit.Assert.assertNotNull(schema23);
    org.junit.Assert.assertNotNull(schema24);
    org.junit.Assert.assertNull(schema26);
    org.junit.Assert.assertNull(schema28);
    org.junit.Assert.assertNotNull(list30);
  }

  @Test
  public void test033() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test033");
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
    String str18 = schema3.getNamespace();
    org.apache.avro.NameValidator nameValidator19 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext20 = new org.apache.avro.ParseContext(nameValidator19);
    org.apache.avro.Schema.Field[] fieldArray21 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList22 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean23 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList22,
        fieldArray21);
    org.apache.avro.Schema schema24 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList22);
    boolean boolean25 = schema24.isNullable();
    java.util.Set<String> strSet26 = schema24.getAliases();
    String str27 = schema24.toString();
    org.apache.avro.Schema.Field[] fieldArray28 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList29 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean30 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList29,
        fieldArray28);
    org.apache.avro.Schema schema31 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList29);
    boolean boolean32 = schema31.isNullable();
    java.util.Set<String> strSet33 = schema31.getAliases();
    String str34 = schema31.toString();
    org.apache.avro.Schema.Field field36 = schema31.getField("long");
    boolean boolean37 = schema31.hasProps();
    org.apache.avro.Schema schema38 = org.apache.avro.Schema.applyAliases(schema24, schema31);
    org.apache.avro.Schema schema39 = parseContext20.resolve(schema38);
    org.apache.avro.Schema schema41 = parseContext20.getNamedSchema("{\"type\":\"record\",\"fields\":[]}");
    org.apache.avro.Schema.Field[] fieldArray42 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList43 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean44 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList43,
        fieldArray42);
    org.apache.avro.Schema schema45 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList43);
    String str46 = schema45.getName();
    org.apache.avro.LogicalType logicalType47 = schema45.getLogicalType();
    org.apache.avro.SchemaParser.ParseResult parseResult48 = parseContext20.commit(schema45);
    boolean boolean49 = schema3.equals((Object) parseContext20);
    org.apache.avro.Schema.Field[] fieldArray50 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList51 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean52 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList51,
        fieldArray50);
    org.apache.avro.Schema schema53 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList51);
    String str54 = schema53.getName();
    boolean boolean55 = schema53.isUnion();
    org.apache.avro.Schema schema56 = org.apache.avro.Schema.createArray(schema53);
    org.apache.avro.Schema schema57 = parseContext20.resolve(schema53);
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
    org.junit.Assert.assertNull(str18);
    org.junit.Assert.assertNotNull(nameValidator19);
    org.junit.Assert.assertNotNull(fieldArray21);
    org.junit.Assert.assertArrayEquals(fieldArray21, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    org.junit.Assert.assertNotNull(schema24);
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    org.junit.Assert.assertNotNull(strSet26);
    org.junit.Assert.assertEquals("'" + str27 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str27,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNotNull(fieldArray28);
    org.junit.Assert.assertArrayEquals(fieldArray28, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    org.junit.Assert.assertNotNull(schema31);
    org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    org.junit.Assert.assertNotNull(strSet33);
    org.junit.Assert.assertEquals("'" + str34 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str34,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNull(field36);
    org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    org.junit.Assert.assertNotNull(schema38);
    org.junit.Assert.assertNotNull(schema39);
    org.junit.Assert.assertNull(schema41);
    org.junit.Assert.assertNotNull(fieldArray42);
    org.junit.Assert.assertArrayEquals(fieldArray42, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    org.junit.Assert.assertNotNull(schema45);
    org.junit.Assert.assertNull(str46);
    org.junit.Assert.assertNull(logicalType47);
    org.junit.Assert.assertNotNull(parseResult48);
    org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    org.junit.Assert.assertNotNull(fieldArray50);
    org.junit.Assert.assertArrayEquals(fieldArray50, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    org.junit.Assert.assertNotNull(schema53);
    org.junit.Assert.assertNull(str54);
    org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    org.junit.Assert.assertNotNull(schema56);
    org.junit.Assert.assertNotNull(schema57);
  }

  @Test
  public void test034() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test034");
    org.apache.avro.NameValidator nameValidator0 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext1 = new org.apache.avro.ParseContext(nameValidator0);
    boolean boolean3 = parseContext1.contains("long type:RECORD pos:-1");
    java.util.List list4 = parseContext1.resolveAllSchemas();
    org.junit.Assert.assertNotNull(nameValidator0);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    org.junit.Assert.assertNotNull(list4);
  }

  @Test
  public void test035() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test035");
    org.apache.avro.NameValidator nameValidator0 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext1 = new org.apache.avro.ParseContext(nameValidator0);
    org.apache.avro.Schema.Field[] fieldArray2 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList3 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList3,
        fieldArray2);
    org.apache.avro.Schema schema5 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList3);
    org.apache.avro.SchemaParser.ParseResult parseResult6 = parseContext1.commit(schema5);
    java.util.List list7 = parseContext1.resolveAllSchemas();
    org.apache.avro.Schema schema10 = parseContext1.find("fixed", "long type:RECORD pos:-1");
    org.apache.avro.Schema schema13 = parseContext1.find("hi!", "");
    org.apache.avro.Schema schema14 = org.apache.avro.Schema.createArray(schema13);
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<org.apache.avro.Schema> schemaList15 = schema13.getTypes();
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a union: {\"type\":\"record\",\"name\":\"UnresolvedSchema_38\",\"namespace\":\"org.apache.avro.compiler\",\"doc\":\"unresolved schema\",\"fields\":[],\"org.apache.avro.idl.unresolved.name\":\".hi!\"}");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(nameValidator0);
    org.junit.Assert.assertNotNull(fieldArray2);
    org.junit.Assert.assertArrayEquals(fieldArray2, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertNotNull(parseResult6);
    org.junit.Assert.assertNotNull(list7);
    org.junit.Assert.assertNotNull(schema10);
    org.junit.Assert.assertNotNull(schema13);
    org.junit.Assert.assertNotNull(schema14);
  }

  @Test
  public void test036() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test036");
    org.apache.avro.NameValidator nameValidator0 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext1 = new org.apache.avro.ParseContext(nameValidator0);
    org.apache.avro.Schema.Field[] fieldArray2 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList3 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList3,
        fieldArray2);
    org.apache.avro.Schema schema5 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList3);
    org.apache.avro.SchemaParser.ParseResult parseResult6 = parseContext1.commit(schema5);
    org.apache.avro.Schema.Parser parser7 = new org.apache.avro.Schema.Parser(parseContext1);
    java.util.Map<String, org.apache.avro.Schema> strMap8 = parser7.getTypes();
    org.apache.avro.Schema.Parser parser10 = parser7.setValidateDefaults(true);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema12 = parser10.parseInternal("record");
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.SchemaParseException; message: com.fasterxml.jackson.core.JsonParseException: Unrecognized token 'record': was expecting (JSON String, Number, Array, Object or token 'null', 'true' or 'false')? at [Source: REDACTED (`StreamReadFeature.INCLUDE_SOURCE_IN_LOCATION` disabled); line: 1, column: 1]");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(nameValidator0);
    org.junit.Assert.assertNotNull(fieldArray2);
    org.junit.Assert.assertArrayEquals(fieldArray2, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertNotNull(parseResult6);
    org.junit.Assert.assertNotNull(strMap8);
    org.junit.Assert.assertNotNull(parser10);
  }

  @Test
  public void test037() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test037");
    org.apache.avro.NameValidator nameValidator3 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext4 = new org.apache.avro.ParseContext(nameValidator3);
    org.apache.avro.Schema.Field[] fieldArray5 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList6 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList6,
        fieldArray5);
    org.apache.avro.Schema schema8 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList6);
    boolean boolean9 = schema8.isNullable();
    java.util.Set<String> strSet10 = schema8.getAliases();
    String str11 = schema8.toString();
    org.apache.avro.Schema.Field[] fieldArray12 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList13 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList13,
        fieldArray12);
    org.apache.avro.Schema schema15 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList13);
    boolean boolean16 = schema15.isNullable();
    java.util.Set<String> strSet17 = schema15.getAliases();
    String str18 = schema15.toString();
    org.apache.avro.Schema.Field field20 = schema15.getField("long");
    boolean boolean21 = schema15.hasProps();
    org.apache.avro.Schema schema22 = org.apache.avro.Schema.applyAliases(schema8, schema15);
    org.apache.avro.Schema schema23 = parseContext4.resolve(schema22);
    org.apache.avro.Schema schema25 = parseContext4.getNamedSchema("{\"type\":\"record\",\"fields\":[]}");
    org.apache.avro.Schema schema27 = parseContext4.getNamedSchema("{\"type\":\"record\",\"fields\":[]}");
    parseContext4.rollback();
    java.util.List list29 = parseContext4.resolveAllSchemas();
    org.apache.avro.Schema schema30 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) list29);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema32 = org.apache.avro.Schema.createEnum("record",
          "{\"type\":\"record\",\"fields\":[]}", "enum", (java.util.List<String>) list29, "");
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.SchemaParseException; message: The Enum Default:  is not in the enum symbol set: []");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(nameValidator3);
    org.junit.Assert.assertNotNull(fieldArray5);
    org.junit.Assert.assertArrayEquals(fieldArray5, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertNotNull(schema8);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    org.junit.Assert.assertNotNull(strSet10);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str11,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNotNull(fieldArray12);
    org.junit.Assert.assertArrayEquals(fieldArray12, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    org.junit.Assert.assertNotNull(schema15);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    org.junit.Assert.assertNotNull(strSet17);
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str18,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNull(field20);
    org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    org.junit.Assert.assertNotNull(schema22);
    org.junit.Assert.assertNotNull(schema23);
    org.junit.Assert.assertNull(schema25);
    org.junit.Assert.assertNull(schema27);
    org.junit.Assert.assertNotNull(list29);
    org.junit.Assert.assertNotNull(schema30);
  }

  @Test
  public void test038() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test038");
    org.apache.avro.Schema.Field[] fieldArray1 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList2 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList2,
        fieldArray1);
    org.apache.avro.Schema schema4 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList2);
    boolean boolean5 = schema4.isNullable();
    java.util.Set<String> strSet6 = schema4.getAliases();
    org.apache.avro.Schema.Field field8 = new org.apache.avro.Schema.Field("long", schema4, "long");
    String str9 = field8.toString();
    org.apache.avro.Schema schema10 = field8.schema();
    boolean boolean11 = schema10.isNullable();
    org.apache.avro.NameValidator nameValidator12 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext13 = new org.apache.avro.ParseContext(nameValidator12);
    java.util.List list14 = parseContext13.resolveAllSchemas();
    org.apache.avro.Schema schema15 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) list14);
    // The following exception was thrown during execution in test generation
    try {
      schema10.setFields((java.util.List<org.apache.avro.Schema.Field>) list14);
      org.junit.Assert
          .fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Fields are already set");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(fieldArray1);
    org.junit.Assert.assertArrayEquals(fieldArray1, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    org.junit.Assert.assertNotNull(schema4);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    org.junit.Assert.assertNotNull(strSet6);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "long type:RECORD pos:-1" + "'", str9,
        "long type:RECORD pos:-1");
    org.junit.Assert.assertNotNull(schema10);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    org.junit.Assert.assertNotNull(nameValidator12);
    org.junit.Assert.assertNotNull(list14);
    org.junit.Assert.assertNotNull(schema15);
  }

  @Test
  public void test039() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test039");
    org.apache.avro.NameValidator nameValidator0 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.Schema.Parser parser1 = new org.apache.avro.Schema.Parser(nameValidator0);
    org.apache.avro.Schema.setNameValidator(nameValidator0);
    org.apache.avro.ParseContext parseContext3 = new org.apache.avro.ParseContext(nameValidator0);
    org.apache.avro.Schema schema5 = parseContext3.getNamedSchema("fixed");
    org.junit.Assert.assertNotNull(nameValidator0);
    org.junit.Assert.assertNull(schema5);
  }

  @Test
  public void test040() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test040");
    org.apache.avro.NameValidator nameValidator0 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext1 = new org.apache.avro.ParseContext(nameValidator0);
    org.apache.avro.Schema.Field[] fieldArray2 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList3 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList3,
        fieldArray2);
    org.apache.avro.Schema schema5 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList3);
    org.apache.avro.SchemaParser.ParseResult parseResult6 = parseContext1.commit(schema5);
    java.util.List list7 = parseContext1.resolveAllSchemas();
    org.apache.avro.Schema schema10 = parseContext1.find("fixed", "long type:RECORD pos:-1");
    org.apache.avro.Schema schema13 = parseContext1.find("hi!", "");
    org.apache.avro.Schema schema14 = org.apache.avro.Schema.createArray(schema13);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema15 = schema13.getElementType();
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an array: {\"type\":\"record\",\"name\":\"UnresolvedSchema_40\",\"namespace\":\"org.apache.avro.compiler\",\"doc\":\"unresolved schema\",\"fields\":[],\"org.apache.avro.idl.unresolved.name\":\".hi!\"}");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(nameValidator0);
    org.junit.Assert.assertNotNull(fieldArray2);
    org.junit.Assert.assertArrayEquals(fieldArray2, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertNotNull(parseResult6);
    org.junit.Assert.assertNotNull(list7);
    org.junit.Assert.assertNotNull(schema10);
    org.junit.Assert.assertNotNull(schema13);
    org.junit.Assert.assertNotNull(schema14);
  }

  @Test
  public void test041() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test041");
    org.apache.avro.NameValidator nameValidator0 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext1 = new org.apache.avro.ParseContext(nameValidator0);
    org.apache.avro.Schema.Field[] fieldArray2 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList3 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList3,
        fieldArray2);
    org.apache.avro.Schema schema5 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList3);
    org.apache.avro.SchemaParser.ParseResult parseResult6 = parseContext1.commit(schema5);
    org.apache.avro.Schema.Parser parser7 = new org.apache.avro.Schema.Parser(parseContext1);
    java.util.Map<String, org.apache.avro.Schema> strMap8 = parser7.getTypes();
    org.apache.avro.Schema.Parser parser10 = parser7.setValidateDefaults(true);
    java.io.InputStream inputStream11 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema12 = parser7.parse(inputStream11);
      org.junit.Assert
          .fail("Expected exception of type org.apache.avro.SchemaParseException; message: Cannot parse <null> schema");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(nameValidator0);
    org.junit.Assert.assertNotNull(fieldArray2);
    org.junit.Assert.assertArrayEquals(fieldArray2, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertNotNull(parseResult6);
    org.junit.Assert.assertNotNull(strMap8);
    org.junit.Assert.assertNotNull(parser10);
  }

  @Test
  public void test042() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test042");
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
    Object obj27 = null;
    org.apache.avro.Schema.SeenPair seenPair28 = new org.apache.avro.Schema.SeenPair((Object) schema24, obj27);
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
  public void test043() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test043");
    org.apache.avro.Schema.Field[] fieldArray1 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList2 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList2,
        fieldArray1);
    org.apache.avro.Schema schema4 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList2);
    boolean boolean5 = schema4.isNullable();
    java.util.Set<String> strSet6 = schema4.getAliases();
    org.apache.avro.Schema.Field field8 = new org.apache.avro.Schema.Field("long", schema4, "long");
    org.apache.avro.Schema schema9 = field8.schema();
    String str10 = field8.doc();
    int int11 = field8.pos();
    Object obj12 = field8.defaultVal();
    org.apache.avro.Schema.Field[] fieldArray13 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList14 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList14,
        fieldArray13);
    org.apache.avro.Schema schema16 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList14);
    boolean boolean17 = schema16.isNullable();
    org.apache.avro.Schema schema18 = org.apache.avro.Schema.createArray(schema16);
    boolean boolean19 = field8.equals((Object) schema16);
    org.apache.avro.Schema.Parser parser20 = new org.apache.avro.Schema.Parser();
    java.util.Map<String, org.apache.avro.Schema> strMap21 = parser20.getTypes();
    org.apache.avro.Schema.Parser parser22 = new org.apache.avro.Schema.Parser();
    java.util.Map<String, org.apache.avro.Schema> strMap23 = parser22.getTypes();
    org.apache.avro.Schema.Parser parser24 = parser20.addTypes(strMap23);
    boolean boolean25 = field8.equals((Object) parser24);
    org.apache.avro.NameValidator nameValidator26 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext27 = new org.apache.avro.ParseContext(nameValidator26);
    org.apache.avro.Schema.Field[] fieldArray28 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList29 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean30 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList29,
        fieldArray28);
    org.apache.avro.Schema schema31 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList29);
    boolean boolean32 = schema31.isNullable();
    java.util.Set<String> strSet33 = schema31.getAliases();
    String str34 = schema31.toString();
    org.apache.avro.Schema.Field[] fieldArray35 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList36 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean37 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList36,
        fieldArray35);
    org.apache.avro.Schema schema38 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList36);
    boolean boolean39 = schema38.isNullable();
    java.util.Set<String> strSet40 = schema38.getAliases();
    String str41 = schema38.toString();
    org.apache.avro.Schema.Field field43 = schema38.getField("long");
    boolean boolean44 = schema38.hasProps();
    org.apache.avro.Schema schema45 = org.apache.avro.Schema.applyAliases(schema31, schema38);
    org.apache.avro.Schema schema46 = parseContext27.resolve(schema45);
    org.apache.avro.Schema schema49 = parseContext27.find("long type:RECORD pos:-1", "record");
    org.apache.avro.Schema schema52 = parseContext27.find("fixed", "hi!");
    org.apache.avro.Schema.Field[] fieldArray54 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList55 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean56 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList55,
        fieldArray54);
    org.apache.avro.Schema schema57 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList55);
    boolean boolean58 = schema57.isNullable();
    java.util.Set<String> strSet59 = schema57.getAliases();
    org.apache.avro.Schema.Field field61 = new org.apache.avro.Schema.Field("long", schema57, "long");
    String str62 = field61.toString();
    org.apache.avro.Schema schema63 = field61.schema();
    org.apache.avro.Schema schema64 = org.apache.avro.Schema.createArray(schema63);
    org.apache.avro.Schema.Field[] fieldArray65 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList66 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean67 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList66,
        fieldArray65);
    org.apache.avro.Schema schema68 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList66);
    boolean boolean70 = schema68.equals((Object) 1.0f);
    boolean boolean71 = schema64.equals((Object) schema68);
    schema64.addProp("", "record");
    org.apache.avro.SchemaParser.ParseResult parseResult75 = parseContext27.commit(schema64);
    org.apache.avro.Schema schema78 = parseContext27.find("bytes", "fixed");
    boolean boolean79 = field8.equals((Object) "fixed");
    org.junit.Assert.assertNotNull(fieldArray1);
    org.junit.Assert.assertArrayEquals(fieldArray1, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    org.junit.Assert.assertNotNull(schema4);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    org.junit.Assert.assertNotNull(strSet6);
    org.junit.Assert.assertNotNull(schema9);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "long" + "'", str10, "long");
    org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    org.junit.Assert.assertNull(obj12);
    org.junit.Assert.assertNotNull(fieldArray13);
    org.junit.Assert.assertArrayEquals(fieldArray13, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    org.junit.Assert.assertNotNull(schema16);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    org.junit.Assert.assertNotNull(schema18);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    org.junit.Assert.assertNotNull(strMap21);
    org.junit.Assert.assertNotNull(strMap23);
    org.junit.Assert.assertNotNull(parser24);
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    org.junit.Assert.assertNotNull(nameValidator26);
    org.junit.Assert.assertNotNull(fieldArray28);
    org.junit.Assert.assertArrayEquals(fieldArray28, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    org.junit.Assert.assertNotNull(schema31);
    org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    org.junit.Assert.assertNotNull(strSet33);
    org.junit.Assert.assertEquals("'" + str34 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str34,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNotNull(fieldArray35);
    org.junit.Assert.assertArrayEquals(fieldArray35, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    org.junit.Assert.assertNotNull(schema38);
    org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    org.junit.Assert.assertNotNull(strSet40);
    org.junit.Assert.assertEquals("'" + str41 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str41,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNull(field43);
    org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    org.junit.Assert.assertNotNull(schema45);
    org.junit.Assert.assertNotNull(schema46);
    org.junit.Assert.assertNotNull(schema49);
    org.junit.Assert.assertNotNull(schema52);
    org.junit.Assert.assertNotNull(fieldArray54);
    org.junit.Assert.assertArrayEquals(fieldArray54, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    org.junit.Assert.assertNotNull(schema57);
    org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    org.junit.Assert.assertNotNull(strSet59);
    org.junit.Assert.assertEquals("'" + str62 + "' != '" + "long type:RECORD pos:-1" + "'", str62,
        "long type:RECORD pos:-1");
    org.junit.Assert.assertNotNull(schema63);
    org.junit.Assert.assertNotNull(schema64);
    org.junit.Assert.assertNotNull(fieldArray65);
    org.junit.Assert.assertArrayEquals(fieldArray65, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    org.junit.Assert.assertNotNull(schema68);
    org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    org.junit.Assert.assertNotNull(parseResult75);
    org.junit.Assert.assertNotNull(schema78);
    org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
  }

  @Test
  public void test044() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test044");
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
    org.apache.avro.Schema.Field[] fieldArray22 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList23 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean24 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList23,
        fieldArray22);
    org.apache.avro.Schema schema25 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList23);
    boolean boolean26 = schema25.isNullable();
    java.util.Set<String> strSet27 = schema25.getAliases();
    com.fasterxml.jackson.databind.JsonNode jsonNode28 = null;
    boolean boolean29 = schema25.isValidDefault(jsonNode28);
    boolean boolean30 = schema25.isUnion();
    org.apache.avro.Schema.Field field32 = new org.apache.avro.Schema.Field("boolean", schema25, "boolean");
    org.apache.avro.LogicalType logicalType33 = schema25.getLogicalType();
    schema25.addProp("record", (Object) "boolean");
    org.apache.avro.Schema.Type type38 = org.apache.avro.Schema.Type.LONG;
    String str39 = type38.getName();
    schema25.addProp("hi!", (Object) str39);
    org.apache.avro.SchemaParser.ParseResult parseResult41 = parseContext1.commit(schema25);
    // The following exception was thrown during execution in test generation
    try {
      String str42 = schema25.getEnumDefault();
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: {\"type\":\"record\",\"fields\":[],\"record\":\"boolean\",\"hi!\":\"long\"}");
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
    org.junit.Assert.assertNotNull(fieldArray22);
    org.junit.Assert.assertArrayEquals(fieldArray22, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    org.junit.Assert.assertNotNull(schema25);
    org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    org.junit.Assert.assertNotNull(strSet27);
    org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    org.junit.Assert.assertNull(logicalType33);
    org.junit.Assert.assertTrue("'" + type38 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type38.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertEquals("'" + str39 + "' != '" + "long" + "'", str39, "long");
    org.junit.Assert.assertNotNull(parseResult41);
  }

  @Test
  public void test045() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test045");
    org.apache.avro.Schema.Field[] fieldArray0 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList1 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList1,
        fieldArray0);
    org.apache.avro.Schema schema3 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
    boolean boolean4 = schema3.isNullable();
    java.util.Set<String> strSet5 = schema3.getAliases();
    Object obj7 = schema3.getObjectProp("hi!");
    String str9 = schema3.toString(false);
    String str11 = schema3.toString(false);
    org.apache.avro.NameValidator nameValidator13 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext14 = new org.apache.avro.ParseContext(nameValidator13);
    org.apache.avro.Schema.Field[] fieldArray15 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList16 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList16,
        fieldArray15);
    org.apache.avro.Schema schema18 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList16);
    boolean boolean19 = schema18.isNullable();
    java.util.Set<String> strSet20 = schema18.getAliases();
    String str21 = schema18.toString();
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
    boolean boolean31 = schema25.hasProps();
    org.apache.avro.Schema schema32 = org.apache.avro.Schema.applyAliases(schema18, schema25);
    org.apache.avro.Schema schema33 = parseContext14.resolve(schema32);
    org.apache.avro.Schema schema35 = parseContext14.getNamedSchema("{\"type\":\"record\",\"fields\":[]}");
    org.apache.avro.Schema schema37 = parseContext14.getNamedSchema("{\"type\":\"record\",\"fields\":[]}");
    parseContext14.rollback();
    java.util.List list39 = parseContext14.resolveAllSchemas();
    org.apache.avro.Schema schema40 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) list39);
    org.apache.avro.Schema schema41 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) list39);
    schema3.addProp("hi!", (Object) list39);
    Class<?> wildcardClass43 = list39.getClass();
    org.junit.Assert.assertNotNull(fieldArray0);
    org.junit.Assert.assertArrayEquals(fieldArray0, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertNotNull(schema3);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    org.junit.Assert.assertNotNull(strSet5);
    org.junit.Assert.assertNull(obj7);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str9,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str11,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNotNull(nameValidator13);
    org.junit.Assert.assertNotNull(fieldArray15);
    org.junit.Assert.assertArrayEquals(fieldArray15, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    org.junit.Assert.assertNotNull(schema18);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    org.junit.Assert.assertNotNull(strSet20);
    org.junit.Assert.assertEquals("'" + str21 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str21,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNotNull(fieldArray22);
    org.junit.Assert.assertArrayEquals(fieldArray22, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    org.junit.Assert.assertNotNull(schema25);
    org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    org.junit.Assert.assertNotNull(strSet27);
    org.junit.Assert.assertEquals("'" + str28 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str28,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNull(field30);
    org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    org.junit.Assert.assertNotNull(schema32);
    org.junit.Assert.assertNotNull(schema33);
    org.junit.Assert.assertNull(schema35);
    org.junit.Assert.assertNull(schema37);
    org.junit.Assert.assertNotNull(list39);
    org.junit.Assert.assertNotNull(schema40);
    org.junit.Assert.assertNotNull(schema41);
    org.junit.Assert.assertNotNull(wildcardClass43);
  }

  @Test
  public void test046() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test046");
    org.apache.avro.NameValidator nameValidator3 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext4 = new org.apache.avro.ParseContext(nameValidator3);
    org.apache.avro.Schema.Field[] fieldArray5 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList6 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList6,
        fieldArray5);
    org.apache.avro.Schema schema8 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList6);
    org.apache.avro.SchemaParser.ParseResult parseResult9 = parseContext4.commit(schema8);
    java.util.List list10 = parseContext4.resolveAllSchemas();
    org.apache.avro.Schema schema11 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) list10);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema12 = org.apache.avro.Schema.createEnum(
          "{\"type\":\"record\",\"fields\":[],\"{\\n  \\\"type\\\" : \\\"record\\\",\\n  \\\"fields\\\" : [ ]\\n}\":\"enum\",\"aliases\":[\"fixed\"]}",
          "{\n  \"type\" : \"record\",\n  \"fields\" : [ ]\n}", "", (java.util.List<String>) list10);
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"record\",\"fields\":[],\"{\\n  \\\"type\\\" : \\\"record\\\",\\n  \\\"fields\\\" : [ ]\\n}\":\"enum\",\"aliases\":[\"fixed\"]}");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(nameValidator3);
    org.junit.Assert.assertNotNull(fieldArray5);
    org.junit.Assert.assertArrayEquals(fieldArray5, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertNotNull(schema8);
    org.junit.Assert.assertNotNull(parseResult9);
    org.junit.Assert.assertNotNull(list10);
    org.junit.Assert.assertNotNull(schema11);
  }

  @Test
  public void test047() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test047");
    org.apache.avro.NameValidator nameValidator4 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext5 = new org.apache.avro.ParseContext(nameValidator4);
    java.util.List list6 = parseContext5.resolveAllSchemas();
    org.apache.avro.Schema schema7 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) list6);
    org.apache.avro.Schema schema8 = org.apache.avro.Schema.createRecord("enum", "bytes", "enum", true,
        (java.util.List<org.apache.avro.Schema.Field>) list6);
    org.junit.Assert.assertNotNull(nameValidator4);
    org.junit.Assert.assertNotNull(list6);
    org.junit.Assert.assertNotNull(schema7);
    org.junit.Assert.assertNotNull(schema8);
  }

  @Test
  public void test048() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test048");
    org.apache.avro.Schema.Field[] fieldArray1 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList2 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList2,
        fieldArray1);
    org.apache.avro.Schema schema4 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList2);
    boolean boolean5 = schema4.isNullable();
    java.util.Set<String> strSet6 = schema4.getAliases();
    org.apache.avro.Schema.Field field8 = new org.apache.avro.Schema.Field("long", schema4, "long");
    String str9 = field8.toString();
    org.apache.avro.Schema schema10 = field8.schema();
    org.apache.avro.NameValidator nameValidator11 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext12 = new org.apache.avro.ParseContext(nameValidator11);
    org.apache.avro.Schema.Field[] fieldArray13 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList14 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList14,
        fieldArray13);
    org.apache.avro.Schema schema16 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList14);
    org.apache.avro.SchemaParser.ParseResult parseResult17 = parseContext12.commit(schema16);
    java.util.List list18 = parseContext12.resolveAllSchemas();
    org.apache.avro.Schema schema21 = parseContext12.find("fixed", "long type:RECORD pos:-1");
    org.apache.avro.Schema.SeenPair seenPair22 = new org.apache.avro.Schema.SeenPair((Object) field8,
        (Object) schema21);
    org.apache.avro.Schema.Field[] fieldArray23 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList24 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean25 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList24,
        fieldArray23);
    org.apache.avro.Schema schema26 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList24);
    boolean boolean27 = schema26.isNullable();
    java.util.Set<String> strSet28 = schema26.getAliases();
    String str29 = schema26.toString();
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
    boolean boolean39 = schema33.hasProps();
    org.apache.avro.Schema schema40 = org.apache.avro.Schema.applyAliases(schema26, schema33);
    boolean boolean41 = schema33.hasProps();
    boolean boolean42 = seenPair22.equals((Object) schema33);
    org.junit.Assert.assertNotNull(fieldArray1);
    org.junit.Assert.assertArrayEquals(fieldArray1, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    org.junit.Assert.assertNotNull(schema4);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    org.junit.Assert.assertNotNull(strSet6);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "long type:RECORD pos:-1" + "'", str9,
        "long type:RECORD pos:-1");
    org.junit.Assert.assertNotNull(schema10);
    org.junit.Assert.assertNotNull(nameValidator11);
    org.junit.Assert.assertNotNull(fieldArray13);
    org.junit.Assert.assertArrayEquals(fieldArray13, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    org.junit.Assert.assertNotNull(schema16);
    org.junit.Assert.assertNotNull(parseResult17);
    org.junit.Assert.assertNotNull(list18);
    org.junit.Assert.assertNotNull(schema21);
    org.junit.Assert.assertNotNull(fieldArray23);
    org.junit.Assert.assertArrayEquals(fieldArray23, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    org.junit.Assert.assertNotNull(schema26);
    org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    org.junit.Assert.assertNotNull(strSet28);
    org.junit.Assert.assertEquals("'" + str29 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str29,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNotNull(fieldArray30);
    org.junit.Assert.assertArrayEquals(fieldArray30, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    org.junit.Assert.assertNotNull(schema33);
    org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    org.junit.Assert.assertNotNull(strSet35);
    org.junit.Assert.assertEquals("'" + str36 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str36,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNull(field38);
    org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    org.junit.Assert.assertNotNull(schema40);
    org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
  }

  @Test
  public void test049() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test049");
    org.apache.avro.NameValidator nameValidator0 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.Schema.Parser parser1 = new org.apache.avro.Schema.Parser(nameValidator0);
    org.apache.avro.Schema.setNameValidator(nameValidator0);
    org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser(nameValidator0);
    org.apache.avro.ParseContext parseContext4 = new org.apache.avro.ParseContext(nameValidator0);
    org.apache.avro.Schema.Parser parser5 = new org.apache.avro.Schema.Parser(nameValidator0);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema7 = parser5.parse("hi!");
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.SchemaParseException; message: com.fasterxml.jackson.core.JsonParseException: Unrecognized token 'hi': was expecting (JSON String, Number, Array, Object or token 'null', 'true' or 'false')? at [Source: REDACTED (`StreamReadFeature.INCLUDE_SOURCE_IN_LOCATION` disabled); line: 1, column: 1]");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(nameValidator0);
  }

  @Test
  public void test050() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test050");
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
      org.apache.avro.Schema schema21 = schema19.getElementType();
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an array: {\"type\":\"record\",\"fields\":[]}");
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
  public void test051() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test051");
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
    org.apache.avro.Schema.Field[] fieldArray23 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList24 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean25 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList24,
        fieldArray23);
    org.apache.avro.Schema schema26 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList24);
    boolean boolean27 = schema26.isNullable();
    java.util.Set<String> strSet28 = schema26.getAliases();
    org.apache.avro.Schema.Field field30 = new org.apache.avro.Schema.Field("long", schema26, "long");
    boolean boolean31 = field30.hasDefaultValue();
    int int32 = field30.pos();
    String str33 = field30.doc();
    org.apache.avro.Schema.Field[] fieldArray34 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList35 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean36 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList35,
        fieldArray34);
    org.apache.avro.Schema schema37 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList35);
    boolean boolean38 = schema37.isNullable();
    java.util.Set<String> strSet39 = schema37.getAliases();
    String str40 = schema37.toString();
    org.apache.avro.Schema.Field field42 = schema37.getField("long");
    java.util.List<org.apache.avro.Schema.Field> fieldList43 = schema37.getFields();
    schema37.addAlias("long");
    boolean boolean47 = schema37.propsContainsKey("record");
    org.apache.avro.Schema.Field field48 = new org.apache.avro.Schema.Field(field30, schema37);
    Object obj49 = schema19.getObjectProp("float", (Object) schema37);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema50 = schema37.getElementType();
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an array: {\"type\":\"record\",\"fields\":[],\"aliases\":[\"long\"]}");
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
    org.junit.Assert.assertNotNull(fieldArray23);
    org.junit.Assert.assertArrayEquals(fieldArray23, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    org.junit.Assert.assertNotNull(schema26);
    org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    org.junit.Assert.assertNotNull(strSet28);
    org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    org.junit.Assert.assertEquals("'" + str33 + "' != '" + "long" + "'", str33, "long");
    org.junit.Assert.assertNotNull(fieldArray34);
    org.junit.Assert.assertArrayEquals(fieldArray34, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    org.junit.Assert.assertNotNull(schema37);
    org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    org.junit.Assert.assertNotNull(strSet39);
    org.junit.Assert.assertEquals("'" + str40 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str40,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNull(field42);
    org.junit.Assert.assertNotNull(fieldList43);
    org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    org.junit.Assert.assertNotNull(obj49);
    org.junit.Assert.assertEquals(obj49.toString(), "{\"type\":\"record\",\"fields\":[],\"aliases\":[\"long\"]}");
    org.junit.Assert.assertEquals(String.valueOf(obj49), "{\"type\":\"record\",\"fields\":[],\"aliases\":[\"long\"]}");
    org.junit.Assert.assertEquals(java.util.Objects.toString(obj49),
        "{\"type\":\"record\",\"fields\":[],\"aliases\":[\"long\"]}");
  }

  @Test
  public void test052() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test052");
    org.apache.avro.NameValidator nameValidator0 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext1 = new org.apache.avro.ParseContext(nameValidator0);
    org.apache.avro.Schema.Field[] fieldArray2 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList3 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList3,
        fieldArray2);
    org.apache.avro.Schema schema5 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList3);
    org.apache.avro.SchemaParser.ParseResult parseResult6 = parseContext1.commit(schema5);
    java.util.List list7 = parseContext1.resolveAllSchemas();
    org.apache.avro.Schema schema10 = parseContext1.find("fixed", "long type:RECORD pos:-1");
    org.apache.avro.Schema schema13 = parseContext1.find("hi!", "");
    java.util.Map map14 = parseContext1.typesByName();
    boolean boolean16 = parseContext1.contains("enum");
    parseContext1.rollback();
    boolean boolean18 = parseContext1.hasNewSchemas();
    org.junit.Assert.assertNotNull(nameValidator0);
    org.junit.Assert.assertNotNull(fieldArray2);
    org.junit.Assert.assertArrayEquals(fieldArray2, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertNotNull(parseResult6);
    org.junit.Assert.assertNotNull(list7);
    org.junit.Assert.assertNotNull(schema10);
    org.junit.Assert.assertNotNull(schema13);
    org.junit.Assert.assertNotNull(map14);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
  }

  @Test
  public void test053() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test053");
    org.apache.avro.NameValidator nameValidator1 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext2 = new org.apache.avro.ParseContext(nameValidator1);
    org.apache.avro.Schema.Field[] fieldArray3 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList4 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList4,
        fieldArray3);
    org.apache.avro.Schema schema6 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList4);
    boolean boolean7 = schema6.isNullable();
    java.util.Set<String> strSet8 = schema6.getAliases();
    String str9 = schema6.toString();
    org.apache.avro.Schema.Field[] fieldArray10 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList11 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList11,
        fieldArray10);
    org.apache.avro.Schema schema13 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList11);
    boolean boolean14 = schema13.isNullable();
    java.util.Set<String> strSet15 = schema13.getAliases();
    String str16 = schema13.toString();
    org.apache.avro.Schema.Field field18 = schema13.getField("long");
    boolean boolean19 = schema13.hasProps();
    org.apache.avro.Schema schema20 = org.apache.avro.Schema.applyAliases(schema6, schema13);
    org.apache.avro.Schema schema21 = parseContext2.resolve(schema20);
    org.apache.avro.Schema.Field[] fieldArray24 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList25 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean26 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList25,
        fieldArray24);
    org.apache.avro.Schema schema27 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList25);
    boolean boolean28 = schema27.isNullable();
    java.util.Set<String> strSet29 = schema27.getAliases();
    org.apache.avro.Schema.Field field31 = new org.apache.avro.Schema.Field("long", schema27, "long");
    boolean boolean32 = field31.hasDefaultValue();
    int int33 = field31.pos();
    String str34 = field31.doc();
    org.apache.avro.Schema.Field[] fieldArray35 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList36 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean37 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList36,
        fieldArray35);
    org.apache.avro.Schema schema38 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList36);
    boolean boolean39 = schema38.isNullable();
    java.util.Set<String> strSet40 = schema38.getAliases();
    String str41 = schema38.toString();
    org.apache.avro.Schema.Field field43 = schema38.getField("long");
    java.util.List<org.apache.avro.Schema.Field> fieldList44 = schema38.getFields();
    schema38.addAlias("long");
    boolean boolean48 = schema38.propsContainsKey("record");
    org.apache.avro.Schema.Field field49 = new org.apache.avro.Schema.Field(field31, schema38);
    Object obj50 = schema20.getObjectProp("float", (Object) schema38);
    org.apache.avro.Schema.Field[] fieldArray52 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList53 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean54 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList53,
        fieldArray52);
    org.apache.avro.Schema schema55 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList53);
    boolean boolean56 = schema55.isNullable();
    java.util.Set<String> strSet57 = schema55.getAliases();
    String str58 = schema55.toString();
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
    boolean boolean68 = schema62.hasProps();
    org.apache.avro.Schema schema69 = org.apache.avro.Schema.applyAliases(schema55, schema62);
    boolean boolean70 = schema62.hasProps();
    java.util.List<org.apache.avro.Schema.Field> fieldList71 = schema62.getFields();
    org.apache.avro.Schema.Field.Order order72 = org.apache.avro.Schema.Field.Order.IGNORE;
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema.Field field73 = new org.apache.avro.Schema.Field(
          "{\n  \"type\" : \"record\",\n  \"fields\" : [ ]\n}", schema38, "float", (Object) schema62, order72);
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Unknown datum class: class org.apache.avro.Schema$RecordSchema");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(nameValidator1);
    org.junit.Assert.assertNotNull(fieldArray3);
    org.junit.Assert.assertArrayEquals(fieldArray3, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    org.junit.Assert.assertNotNull(schema6);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertNotNull(strSet8);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str9,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNotNull(fieldArray10);
    org.junit.Assert.assertArrayEquals(fieldArray10, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    org.junit.Assert.assertNotNull(schema13);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    org.junit.Assert.assertNotNull(strSet15);
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str16,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNull(field18);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    org.junit.Assert.assertNotNull(schema20);
    org.junit.Assert.assertNotNull(schema21);
    org.junit.Assert.assertNotNull(fieldArray24);
    org.junit.Assert.assertArrayEquals(fieldArray24, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    org.junit.Assert.assertNotNull(schema27);
    org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    org.junit.Assert.assertNotNull(strSet29);
    org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    org.junit.Assert.assertEquals("'" + str34 + "' != '" + "long" + "'", str34, "long");
    org.junit.Assert.assertNotNull(fieldArray35);
    org.junit.Assert.assertArrayEquals(fieldArray35, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    org.junit.Assert.assertNotNull(schema38);
    org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    org.junit.Assert.assertNotNull(strSet40);
    org.junit.Assert.assertEquals("'" + str41 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str41,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNull(field43);
    org.junit.Assert.assertNotNull(fieldList44);
    org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    org.junit.Assert.assertNotNull(obj50);
    org.junit.Assert.assertEquals(obj50.toString(), "{\"type\":\"record\",\"fields\":[],\"aliases\":[\"long\"]}");
    org.junit.Assert.assertEquals(String.valueOf(obj50), "{\"type\":\"record\",\"fields\":[],\"aliases\":[\"long\"]}");
    org.junit.Assert.assertEquals(java.util.Objects.toString(obj50),
        "{\"type\":\"record\",\"fields\":[],\"aliases\":[\"long\"]}");
    org.junit.Assert.assertNotNull(fieldArray52);
    org.junit.Assert.assertArrayEquals(fieldArray52, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    org.junit.Assert.assertNotNull(schema55);
    org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    org.junit.Assert.assertNotNull(strSet57);
    org.junit.Assert.assertEquals("'" + str58 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str58,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNotNull(fieldArray59);
    org.junit.Assert.assertArrayEquals(fieldArray59, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    org.junit.Assert.assertNotNull(schema62);
    org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    org.junit.Assert.assertNotNull(strSet64);
    org.junit.Assert.assertEquals("'" + str65 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str65,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNull(field67);
    org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    org.junit.Assert.assertNotNull(schema69);
    org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    org.junit.Assert.assertNotNull(fieldList71);
    org.junit.Assert.assertTrue("'" + order72 + "' != '" + org.apache.avro.Schema.Field.Order.IGNORE + "'",
        order72.equals(org.apache.avro.Schema.Field.Order.IGNORE));
  }

  @Test
  public void test054() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test054");
    org.apache.avro.NameValidator nameValidator3 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext4 = new org.apache.avro.ParseContext(nameValidator3);
    org.apache.avro.Schema.Field[] fieldArray5 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList6 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList6,
        fieldArray5);
    org.apache.avro.Schema schema8 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList6);
    org.apache.avro.SchemaParser.ParseResult parseResult9 = parseContext4.commit(schema8);
    java.util.List list10 = parseContext4.resolveAllSchemas();
    org.apache.avro.Schema schema11 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) list10);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema13 = org.apache.avro.Schema.createEnum("hi!", "float", "",
          (java.util.List<String>) list10, "record");
      org.junit.Assert
          .fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal character in: hi!");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(nameValidator3);
    org.junit.Assert.assertNotNull(fieldArray5);
    org.junit.Assert.assertArrayEquals(fieldArray5, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertNotNull(schema8);
    org.junit.Assert.assertNotNull(parseResult9);
    org.junit.Assert.assertNotNull(list10);
    org.junit.Assert.assertNotNull(schema11);
  }

  @Test
  public void test055() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test055");
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
    parseContext1.rollback();
    java.util.List list26 = parseContext1.resolveAllSchemas();
    org.apache.avro.Schema schema27 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) list26);
    org.apache.avro.Schema.Field[] fieldArray29 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList30 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean31 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList30,
        fieldArray29);
    org.apache.avro.Schema schema32 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList30);
    boolean boolean33 = schema32.isNullable();
    java.util.Set<String> strSet34 = schema32.getAliases();
    org.apache.avro.Schema.Field field36 = new org.apache.avro.Schema.Field("long", schema32, "long");
    org.apache.avro.Schema schema37 = field36.schema();
    boolean boolean39 = field36.propsContainsKey("long type:RECORD pos:-1");
    String str40 = field36.doc();
    java.util.Set<String> strSet41 = field36.aliases();
    org.apache.avro.Schema.SeenPair seenPair42 = new org.apache.avro.Schema.SeenPair((Object) schema27,
        (Object) strSet41);
    Object obj43 = null;
    boolean boolean44 = seenPair42.equals(obj43);
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
    org.junit.Assert.assertNotNull(list26);
    org.junit.Assert.assertNotNull(schema27);
    org.junit.Assert.assertNotNull(fieldArray29);
    org.junit.Assert.assertArrayEquals(fieldArray29, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    org.junit.Assert.assertNotNull(schema32);
    org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    org.junit.Assert.assertNotNull(strSet34);
    org.junit.Assert.assertNotNull(schema37);
    org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    org.junit.Assert.assertEquals("'" + str40 + "' != '" + "long" + "'", str40, "long");
    org.junit.Assert.assertNotNull(strSet41);
    org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
  }

  @Test
  public void test056() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test056");
    org.apache.avro.NameValidator nameValidator1 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext2 = new org.apache.avro.ParseContext(nameValidator1);
    org.apache.avro.Schema.Field[] fieldArray3 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList4 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList4,
        fieldArray3);
    org.apache.avro.Schema schema6 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList4);
    boolean boolean7 = schema6.isNullable();
    java.util.Set<String> strSet8 = schema6.getAliases();
    String str9 = schema6.toString();
    org.apache.avro.Schema.Field[] fieldArray10 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList11 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList11,
        fieldArray10);
    org.apache.avro.Schema schema13 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList11);
    boolean boolean14 = schema13.isNullable();
    java.util.Set<String> strSet15 = schema13.getAliases();
    String str16 = schema13.toString();
    org.apache.avro.Schema.Field field18 = schema13.getField("long");
    boolean boolean19 = schema13.hasProps();
    org.apache.avro.Schema schema20 = org.apache.avro.Schema.applyAliases(schema6, schema13);
    org.apache.avro.Schema schema21 = parseContext2.resolve(schema20);
    org.apache.avro.Schema schema24 = parseContext2.find("long type:RECORD pos:-1", "record");
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema.Field field26 = new org.apache.avro.Schema.Field("{\"type\":\"record\",\"fields\":[]}",
          schema24, "long");
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"record\",\"fields\":[]}");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(nameValidator1);
    org.junit.Assert.assertNotNull(fieldArray3);
    org.junit.Assert.assertArrayEquals(fieldArray3, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    org.junit.Assert.assertNotNull(schema6);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertNotNull(strSet8);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str9,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNotNull(fieldArray10);
    org.junit.Assert.assertArrayEquals(fieldArray10, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    org.junit.Assert.assertNotNull(schema13);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    org.junit.Assert.assertNotNull(strSet15);
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str16,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNull(field18);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    org.junit.Assert.assertNotNull(schema20);
    org.junit.Assert.assertNotNull(schema21);
    org.junit.Assert.assertNotNull(schema24);
  }

  @Test
  public void test057() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test057");
    org.apache.avro.NameValidator nameValidator0 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.Schema.Parser parser1 = new org.apache.avro.Schema.Parser(nameValidator0);
    org.apache.avro.Schema.setNameValidator(nameValidator0);
    org.apache.avro.ParseContext parseContext3 = new org.apache.avro.ParseContext(nameValidator0);
    org.apache.avro.Schema.Parser parser4 = new org.apache.avro.Schema.Parser(nameValidator0);
    org.junit.Assert.assertNotNull(nameValidator0);
  }

  @Test
  public void test058() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test058");
    org.apache.avro.NameValidator nameValidator4 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext5 = new org.apache.avro.ParseContext(nameValidator4);
    org.apache.avro.Schema.Field[] fieldArray6 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList7 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList7,
        fieldArray6);
    org.apache.avro.Schema schema9 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList7);
    boolean boolean10 = schema9.isNullable();
    java.util.Set<String> strSet11 = schema9.getAliases();
    String str12 = schema9.toString();
    org.apache.avro.Schema.Field[] fieldArray13 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList14 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList14,
        fieldArray13);
    org.apache.avro.Schema schema16 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList14);
    boolean boolean17 = schema16.isNullable();
    java.util.Set<String> strSet18 = schema16.getAliases();
    String str19 = schema16.toString();
    org.apache.avro.Schema.Field field21 = schema16.getField("long");
    boolean boolean22 = schema16.hasProps();
    org.apache.avro.Schema schema23 = org.apache.avro.Schema.applyAliases(schema9, schema16);
    org.apache.avro.Schema schema24 = parseContext5.resolve(schema23);
    java.util.List<org.apache.avro.Schema.Field> fieldList25 = schema23.getFields();
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema26 = org.apache.avro.Schema.createRecord("{\"type\":\"record\",\"fields\":[]}",
          "{\"type\":\"record\",\"fields\":[],\"aliases\":[\"record\"]}", "enum", true, fieldList25);
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"record\",\"fields\":[]}");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(nameValidator4);
    org.junit.Assert.assertNotNull(fieldArray6);
    org.junit.Assert.assertArrayEquals(fieldArray6, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    org.junit.Assert.assertNotNull(schema9);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    org.junit.Assert.assertNotNull(strSet11);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str12,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNotNull(fieldArray13);
    org.junit.Assert.assertArrayEquals(fieldArray13, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    org.junit.Assert.assertNotNull(schema16);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    org.junit.Assert.assertNotNull(strSet18);
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str19,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNull(field21);
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    org.junit.Assert.assertNotNull(schema23);
    org.junit.Assert.assertNotNull(schema24);
    org.junit.Assert.assertNotNull(fieldList25);
  }

  @Test
  public void test059() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test059");
    org.apache.avro.NameValidator nameValidator4 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext5 = new org.apache.avro.ParseContext(nameValidator4);
    org.apache.avro.Schema.Field[] fieldArray6 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList7 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList7,
        fieldArray6);
    org.apache.avro.Schema schema9 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList7);
    boolean boolean10 = schema9.isNullable();
    java.util.Set<String> strSet11 = schema9.getAliases();
    String str12 = schema9.toString();
    org.apache.avro.Schema.Field[] fieldArray13 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList14 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList14,
        fieldArray13);
    org.apache.avro.Schema schema16 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList14);
    boolean boolean17 = schema16.isNullable();
    java.util.Set<String> strSet18 = schema16.getAliases();
    String str19 = schema16.toString();
    org.apache.avro.Schema.Field field21 = schema16.getField("long");
    boolean boolean22 = schema16.hasProps();
    org.apache.avro.Schema schema23 = org.apache.avro.Schema.applyAliases(schema9, schema16);
    org.apache.avro.Schema schema24 = parseContext5.resolve(schema23);
    org.apache.avro.Schema schema26 = parseContext5.getNamedSchema("{\"type\":\"record\",\"fields\":[]}");
    org.apache.avro.Schema schema28 = parseContext5.getNamedSchema("{\"type\":\"record\",\"fields\":[]}");
    parseContext5.rollback();
    java.util.List list30 = parseContext5.resolveAllSchemas();
    org.apache.avro.Schema schema31 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) list30);
    org.apache.avro.Schema schema32 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) list30);
    org.apache.avro.Schema schema33 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) list30);
    org.apache.avro.Schema schema34 = org.apache.avro.Schema.createRecord("float", "array",
        "{\n  \"type\" : \"record\",\n  \"fields\" : [ ]\n}", false,
        (java.util.List<org.apache.avro.Schema.Field>) list30);
    String str35 = schema34.getFullName();
    org.junit.Assert.assertNotNull(nameValidator4);
    org.junit.Assert.assertNotNull(fieldArray6);
    org.junit.Assert.assertArrayEquals(fieldArray6, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    org.junit.Assert.assertNotNull(schema9);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    org.junit.Assert.assertNotNull(strSet11);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str12,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNotNull(fieldArray13);
    org.junit.Assert.assertArrayEquals(fieldArray13, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    org.junit.Assert.assertNotNull(schema16);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    org.junit.Assert.assertNotNull(strSet18);
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str19,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNull(field21);
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    org.junit.Assert.assertNotNull(schema23);
    org.junit.Assert.assertNotNull(schema24);
    org.junit.Assert.assertNull(schema26);
    org.junit.Assert.assertNull(schema28);
    org.junit.Assert.assertNotNull(list30);
    org.junit.Assert.assertNotNull(schema31);
    org.junit.Assert.assertNotNull(schema32);
    org.junit.Assert.assertNotNull(schema33);
    org.junit.Assert.assertNotNull(schema34);
    org.junit.Assert.assertEquals(
        "'" + str35 + "' != '" + "{\n  \"type\" : \"record\",\n  \"fields\" : [ ]\n}.float" + "'", str35,
        "{\n  \"type\" : \"record\",\n  \"fields\" : [ ]\n}.float");
  }

  @Test
  public void test060() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test060");
    org.apache.avro.Schema.Field[] fieldArray1 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList2 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList2,
        fieldArray1);
    org.apache.avro.Schema schema4 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList2);
    boolean boolean5 = schema4.isNullable();
    java.util.Set<String> strSet6 = schema4.getAliases();
    org.apache.avro.Schema.Field field8 = new org.apache.avro.Schema.Field("long", schema4, "long");
    String str9 = field8.toString();
    org.apache.avro.Schema schema10 = field8.schema();
    org.apache.avro.NameValidator nameValidator11 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext12 = new org.apache.avro.ParseContext(nameValidator11);
    org.apache.avro.Schema.Field[] fieldArray13 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList14 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList14,
        fieldArray13);
    org.apache.avro.Schema schema16 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList14);
    org.apache.avro.SchemaParser.ParseResult parseResult17 = parseContext12.commit(schema16);
    java.util.List list18 = parseContext12.resolveAllSchemas();
    org.apache.avro.Schema schema21 = parseContext12.find("fixed", "long type:RECORD pos:-1");
    org.apache.avro.Schema.SeenPair seenPair22 = new org.apache.avro.Schema.SeenPair((Object) field8,
        (Object) schema21);
    org.apache.avro.NameValidator nameValidator23 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext24 = new org.apache.avro.ParseContext(nameValidator23);
    org.apache.avro.Schema.Field[] fieldArray25 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList26 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean27 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList26,
        fieldArray25);
    org.apache.avro.Schema schema28 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList26);
    boolean boolean29 = schema28.isNullable();
    java.util.Set<String> strSet30 = schema28.getAliases();
    String str31 = schema28.toString();
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
    boolean boolean41 = schema35.hasProps();
    org.apache.avro.Schema schema42 = org.apache.avro.Schema.applyAliases(schema28, schema35);
    org.apache.avro.Schema schema43 = parseContext24.resolve(schema42);
    org.apache.avro.Schema.Field[] fieldArray45 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList46 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean47 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList46,
        fieldArray45);
    org.apache.avro.Schema schema48 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList46);
    boolean boolean49 = schema48.isNullable();
    java.util.Set<String> strSet50 = schema48.getAliases();
    com.fasterxml.jackson.databind.JsonNode jsonNode51 = null;
    boolean boolean52 = schema48.isValidDefault(jsonNode51);
    boolean boolean53 = schema48.isUnion();
    org.apache.avro.Schema.Field field55 = new org.apache.avro.Schema.Field("boolean", schema48, "boolean");
    org.apache.avro.LogicalType logicalType56 = schema48.getLogicalType();
    schema48.addProp("record", (Object) "boolean");
    org.apache.avro.Schema.Type type61 = org.apache.avro.Schema.Type.LONG;
    String str62 = type61.getName();
    schema48.addProp("hi!", (Object) str62);
    org.apache.avro.SchemaParser.ParseResult parseResult64 = parseContext24.commit(schema48);
    boolean boolean65 = field8.equals((Object) parseResult64);
    org.junit.Assert.assertNotNull(fieldArray1);
    org.junit.Assert.assertArrayEquals(fieldArray1, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    org.junit.Assert.assertNotNull(schema4);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    org.junit.Assert.assertNotNull(strSet6);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "long type:RECORD pos:-1" + "'", str9,
        "long type:RECORD pos:-1");
    org.junit.Assert.assertNotNull(schema10);
    org.junit.Assert.assertNotNull(nameValidator11);
    org.junit.Assert.assertNotNull(fieldArray13);
    org.junit.Assert.assertArrayEquals(fieldArray13, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    org.junit.Assert.assertNotNull(schema16);
    org.junit.Assert.assertNotNull(parseResult17);
    org.junit.Assert.assertNotNull(list18);
    org.junit.Assert.assertNotNull(schema21);
    org.junit.Assert.assertNotNull(nameValidator23);
    org.junit.Assert.assertNotNull(fieldArray25);
    org.junit.Assert.assertArrayEquals(fieldArray25, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    org.junit.Assert.assertNotNull(schema28);
    org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    org.junit.Assert.assertNotNull(strSet30);
    org.junit.Assert.assertEquals("'" + str31 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str31,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNotNull(fieldArray32);
    org.junit.Assert.assertArrayEquals(fieldArray32, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    org.junit.Assert.assertNotNull(schema35);
    org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    org.junit.Assert.assertNotNull(strSet37);
    org.junit.Assert.assertEquals("'" + str38 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str38,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNull(field40);
    org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    org.junit.Assert.assertNotNull(schema42);
    org.junit.Assert.assertNotNull(schema43);
    org.junit.Assert.assertNotNull(fieldArray45);
    org.junit.Assert.assertArrayEquals(fieldArray45, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    org.junit.Assert.assertNotNull(schema48);
    org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    org.junit.Assert.assertNotNull(strSet50);
    org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    org.junit.Assert.assertNull(logicalType56);
    org.junit.Assert.assertTrue("'" + type61 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type61.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertEquals("'" + str62 + "' != '" + "long" + "'", str62, "long");
    org.junit.Assert.assertNotNull(parseResult64);
    org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
  }

  @Test
  public void test061() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test061");
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
    String str18 = schema3.getNamespace();
    org.apache.avro.NameValidator nameValidator19 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext20 = new org.apache.avro.ParseContext(nameValidator19);
    org.apache.avro.Schema.Field[] fieldArray21 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList22 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean23 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList22,
        fieldArray21);
    org.apache.avro.Schema schema24 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList22);
    boolean boolean25 = schema24.isNullable();
    java.util.Set<String> strSet26 = schema24.getAliases();
    String str27 = schema24.toString();
    org.apache.avro.Schema.Field[] fieldArray28 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList29 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean30 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList29,
        fieldArray28);
    org.apache.avro.Schema schema31 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList29);
    boolean boolean32 = schema31.isNullable();
    java.util.Set<String> strSet33 = schema31.getAliases();
    String str34 = schema31.toString();
    org.apache.avro.Schema.Field field36 = schema31.getField("long");
    boolean boolean37 = schema31.hasProps();
    org.apache.avro.Schema schema38 = org.apache.avro.Schema.applyAliases(schema24, schema31);
    org.apache.avro.Schema schema39 = parseContext20.resolve(schema38);
    org.apache.avro.Schema schema41 = parseContext20.getNamedSchema("{\"type\":\"record\",\"fields\":[]}");
    org.apache.avro.Schema.Field[] fieldArray42 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList43 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean44 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList43,
        fieldArray42);
    org.apache.avro.Schema schema45 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList43);
    String str46 = schema45.getName();
    org.apache.avro.LogicalType logicalType47 = schema45.getLogicalType();
    org.apache.avro.SchemaParser.ParseResult parseResult48 = parseContext20.commit(schema45);
    boolean boolean49 = schema3.equals((Object) parseContext20);
    org.apache.avro.Schema.Parser parser50 = new org.apache.avro.Schema.Parser(parseContext20);
    java.util.Map map51 = parseContext20.typesByName();
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
    org.junit.Assert.assertNull(str18);
    org.junit.Assert.assertNotNull(nameValidator19);
    org.junit.Assert.assertNotNull(fieldArray21);
    org.junit.Assert.assertArrayEquals(fieldArray21, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    org.junit.Assert.assertNotNull(schema24);
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    org.junit.Assert.assertNotNull(strSet26);
    org.junit.Assert.assertEquals("'" + str27 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str27,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNotNull(fieldArray28);
    org.junit.Assert.assertArrayEquals(fieldArray28, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    org.junit.Assert.assertNotNull(schema31);
    org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    org.junit.Assert.assertNotNull(strSet33);
    org.junit.Assert.assertEquals("'" + str34 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str34,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNull(field36);
    org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    org.junit.Assert.assertNotNull(schema38);
    org.junit.Assert.assertNotNull(schema39);
    org.junit.Assert.assertNull(schema41);
    org.junit.Assert.assertNotNull(fieldArray42);
    org.junit.Assert.assertArrayEquals(fieldArray42, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    org.junit.Assert.assertNotNull(schema45);
    org.junit.Assert.assertNull(str46);
    org.junit.Assert.assertNull(logicalType47);
    org.junit.Assert.assertNotNull(parseResult48);
    org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    org.junit.Assert.assertNotNull(map51);
  }

  @Test
  public void test062() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test062");
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
    parseContext1.rollback();
    java.util.List list26 = parseContext1.resolveAllSchemas();
    org.apache.avro.Schema.Field[] fieldArray27 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList28 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean29 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList28,
        fieldArray27);
    org.apache.avro.Schema schema30 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList28);
    boolean boolean31 = schema30.isNullable();
    java.util.Set<String> strSet32 = schema30.getAliases();
    String str33 = schema30.toString();
    org.apache.avro.Schema.Field field35 = schema30.getField("long");
    org.apache.avro.Schema schema36 = parseContext1.resolve(schema30);
    java.util.Map map37 = parseContext1.typesByName();
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
    org.junit.Assert.assertNotNull(list26);
    org.junit.Assert.assertNotNull(fieldArray27);
    org.junit.Assert.assertArrayEquals(fieldArray27, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    org.junit.Assert.assertNotNull(schema30);
    org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    org.junit.Assert.assertNotNull(strSet32);
    org.junit.Assert.assertEquals("'" + str33 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str33,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNull(field35);
    org.junit.Assert.assertNotNull(schema36);
    org.junit.Assert.assertNotNull(map37);
  }

  @Test
  public void test063() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test063");
    org.apache.avro.Schema.Field[] fieldArray1 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList2 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList2,
        fieldArray1);
    org.apache.avro.Schema schema4 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList2);
    boolean boolean5 = schema4.isNullable();
    java.util.Set<String> strSet6 = schema4.getAliases();
    org.apache.avro.Schema.Field field8 = new org.apache.avro.Schema.Field("long", schema4, "long");
    String str9 = field8.toString();
    org.apache.avro.Schema schema10 = field8.schema();
    org.apache.avro.NameValidator nameValidator11 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext12 = new org.apache.avro.ParseContext(nameValidator11);
    org.apache.avro.Schema.Field[] fieldArray13 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList14 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList14,
        fieldArray13);
    org.apache.avro.Schema schema16 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList14);
    org.apache.avro.SchemaParser.ParseResult parseResult17 = parseContext12.commit(schema16);
    java.util.List list18 = parseContext12.resolveAllSchemas();
    org.apache.avro.Schema schema21 = parseContext12.find("fixed", "long type:RECORD pos:-1");
    org.apache.avro.Schema.SeenPair seenPair22 = new org.apache.avro.Schema.SeenPair((Object) field8,
        (Object) schema21);
    org.apache.avro.Schema.Field[] fieldArray25 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList26 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean27 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList26,
        fieldArray25);
    org.apache.avro.Schema schema28 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList26);
    boolean boolean29 = schema28.isNullable();
    java.util.Set<String> strSet30 = schema28.getAliases();
    com.fasterxml.jackson.databind.JsonNode jsonNode31 = null;
    boolean boolean32 = schema28.isValidDefault(jsonNode31);
    boolean boolean33 = schema28.isUnion();
    org.apache.avro.Schema.Field field35 = new org.apache.avro.Schema.Field("boolean", schema28, "boolean");
    org.apache.avro.LogicalType logicalType36 = schema28.getLogicalType();
    schema28.addProp("record", (Object) "boolean");
    org.apache.avro.Schema.Field field41 = new org.apache.avro.Schema.Field("record", schema28, "boolean");
    String str42 = field41.doc();
    boolean boolean43 = seenPair22.equals((Object) field41);
    org.apache.avro.Schema.Field[] fieldArray45 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList46 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean47 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList46,
        fieldArray45);
    org.apache.avro.Schema schema48 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList46);
    boolean boolean49 = schema48.isNullable();
    java.util.Set<String> strSet50 = schema48.getAliases();
    org.apache.avro.Schema.Field field52 = new org.apache.avro.Schema.Field("long", schema48, "long");
    String str53 = field52.toString();
    org.apache.avro.Schema schema54 = field52.schema();
    org.apache.avro.Schema schema55 = org.apache.avro.Schema.createArray(schema54);
    org.apache.avro.Schema.Field[] fieldArray56 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList57 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean58 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList57,
        fieldArray56);
    org.apache.avro.Schema schema59 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList57);
    boolean boolean61 = schema59.equals((Object) 1.0f);
    boolean boolean62 = schema55.equals((Object) schema59);
    boolean boolean63 = schema59.isError();
    boolean boolean64 = seenPair22.equals((Object) boolean63);
    org.junit.Assert.assertNotNull(fieldArray1);
    org.junit.Assert.assertArrayEquals(fieldArray1, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    org.junit.Assert.assertNotNull(schema4);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    org.junit.Assert.assertNotNull(strSet6);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "long type:RECORD pos:-1" + "'", str9,
        "long type:RECORD pos:-1");
    org.junit.Assert.assertNotNull(schema10);
    org.junit.Assert.assertNotNull(nameValidator11);
    org.junit.Assert.assertNotNull(fieldArray13);
    org.junit.Assert.assertArrayEquals(fieldArray13, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    org.junit.Assert.assertNotNull(schema16);
    org.junit.Assert.assertNotNull(parseResult17);
    org.junit.Assert.assertNotNull(list18);
    org.junit.Assert.assertNotNull(schema21);
    org.junit.Assert.assertNotNull(fieldArray25);
    org.junit.Assert.assertArrayEquals(fieldArray25, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    org.junit.Assert.assertNotNull(schema28);
    org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    org.junit.Assert.assertNotNull(strSet30);
    org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    org.junit.Assert.assertNull(logicalType36);
    org.junit.Assert.assertEquals("'" + str42 + "' != '" + "boolean" + "'", str42, "boolean");
    org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    org.junit.Assert.assertNotNull(fieldArray45);
    org.junit.Assert.assertArrayEquals(fieldArray45, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    org.junit.Assert.assertNotNull(schema48);
    org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    org.junit.Assert.assertNotNull(strSet50);
    org.junit.Assert.assertEquals("'" + str53 + "' != '" + "long type:RECORD pos:-1" + "'", str53,
        "long type:RECORD pos:-1");
    org.junit.Assert.assertNotNull(schema54);
    org.junit.Assert.assertNotNull(schema55);
    org.junit.Assert.assertNotNull(fieldArray56);
    org.junit.Assert.assertArrayEquals(fieldArray56, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    org.junit.Assert.assertNotNull(schema59);
    org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
  }

  @Test
  public void test064() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test064");
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
    parseContext1.rollback();
    org.apache.avro.Schema.Field[] fieldArray26 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList27 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean28 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList27,
        fieldArray26);
    org.apache.avro.Schema schema29 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList27);
    boolean boolean30 = schema29.isUnion();
    java.util.Set<String> strSet31 = schema29.getAliases();
    String str32 = schema29.getDoc();
    org.apache.avro.Schema schema33 = parseContext1.resolve(schema29);
    parseContext1.commit();
    java.util.Map map35 = parseContext1.typesByName();
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
    org.junit.Assert.assertNotNull(fieldArray26);
    org.junit.Assert.assertArrayEquals(fieldArray26, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    org.junit.Assert.assertNotNull(schema29);
    org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    org.junit.Assert.assertNotNull(strSet31);
    org.junit.Assert.assertNull(str32);
    org.junit.Assert.assertNotNull(schema33);
    org.junit.Assert.assertNotNull(map35);
  }

  @Test
  public void test065() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test065");
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
    parseContext1.rollback();
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
  }

  @Test
  public void test066() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test066");
    org.apache.avro.NameValidator nameValidator3 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext4 = new org.apache.avro.ParseContext(nameValidator3);
    org.apache.avro.Schema.Field[] fieldArray5 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList6 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList6,
        fieldArray5);
    org.apache.avro.Schema schema8 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList6);
    boolean boolean9 = schema8.isNullable();
    java.util.Set<String> strSet10 = schema8.getAliases();
    String str11 = schema8.toString();
    org.apache.avro.Schema.Field[] fieldArray12 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList13 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList13,
        fieldArray12);
    org.apache.avro.Schema schema15 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList13);
    boolean boolean16 = schema15.isNullable();
    java.util.Set<String> strSet17 = schema15.getAliases();
    String str18 = schema15.toString();
    org.apache.avro.Schema.Field field20 = schema15.getField("long");
    boolean boolean21 = schema15.hasProps();
    org.apache.avro.Schema schema22 = org.apache.avro.Schema.applyAliases(schema8, schema15);
    org.apache.avro.Schema schema23 = parseContext4.resolve(schema22);
    org.apache.avro.Schema schema25 = parseContext4.getNamedSchema("{\"type\":\"record\",\"fields\":[]}");
    org.apache.avro.Schema schema27 = parseContext4.getNamedSchema("{\"type\":\"record\",\"fields\":[]}");
    parseContext4.commit();
    java.util.List list29 = parseContext4.resolveAllSchemas();
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema31 = org.apache.avro.Schema.createEnum(
          "{\"type\":\"record\",\"fields\":[],\"aliases\":[\"record\"]}", "long", "long type:RECORD pos:-1",
          (java.util.List<String>) list29,
          "{\n  \"type\" : \"record\",\n  \"name\" : \"array\",\n  \"namespace\" : \"hi!\",\n  \"doc\" : \"record\",\n  \"fields\" : [ ]\n}");
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"record\",\"fields\":[],\"aliases\":[\"record\"]}");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(nameValidator3);
    org.junit.Assert.assertNotNull(fieldArray5);
    org.junit.Assert.assertArrayEquals(fieldArray5, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertNotNull(schema8);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    org.junit.Assert.assertNotNull(strSet10);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str11,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNotNull(fieldArray12);
    org.junit.Assert.assertArrayEquals(fieldArray12, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    org.junit.Assert.assertNotNull(schema15);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    org.junit.Assert.assertNotNull(strSet17);
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str18,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNull(field20);
    org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    org.junit.Assert.assertNotNull(schema22);
    org.junit.Assert.assertNotNull(schema23);
    org.junit.Assert.assertNull(schema25);
    org.junit.Assert.assertNull(schema27);
    org.junit.Assert.assertNotNull(list29);
  }

  @Test
  public void test067() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test067");
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
    org.apache.avro.Schema schema23 = parseContext1.find("long type:RECORD pos:-1", "record");
    org.apache.avro.Schema schema26 = parseContext1.find("fixed", "hi!");
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<org.apache.avro.Schema> schemaList27 = schema26.getTypes();
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a union: {\"type\":\"record\",\"name\":\"UnresolvedSchema_56\",\"namespace\":\"org.apache.avro.compiler\",\"doc\":\"unresolved schema\",\"fields\":[],\"org.apache.avro.idl.unresolved.name\":\"hi!.fixed\"}");
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
    org.junit.Assert.assertNotNull(schema23);
    org.junit.Assert.assertNotNull(schema26);
  }

  @Test
  public void test068() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test068");
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
    org.apache.avro.Schema.Field[] fieldArray23 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList24 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean25 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList24,
        fieldArray23);
    org.apache.avro.Schema schema26 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList24);
    String str27 = schema26.getName();
    org.apache.avro.LogicalType logicalType28 = schema26.getLogicalType();
    org.apache.avro.SchemaParser.ParseResult parseResult29 = parseContext1.commit(schema26);
    boolean boolean30 = schema26.hasFields();
    org.apache.avro.Schema.Type type31 = schema26.getType();
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
    org.junit.Assert.assertNotNull(fieldArray23);
    org.junit.Assert.assertArrayEquals(fieldArray23, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    org.junit.Assert.assertNotNull(schema26);
    org.junit.Assert.assertNull(str27);
    org.junit.Assert.assertNull(logicalType28);
    org.junit.Assert.assertNotNull(parseResult29);
    org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    org.junit.Assert.assertTrue("'" + type31 + "' != '" + org.apache.avro.Schema.Type.RECORD + "'",
        type31.equals(org.apache.avro.Schema.Type.RECORD));
  }

  @Test
  public void test069() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test069");
    org.apache.avro.NameValidator nameValidator4 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext5 = new org.apache.avro.ParseContext(nameValidator4);
    org.apache.avro.Schema.Field[] fieldArray6 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList7 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList7,
        fieldArray6);
    org.apache.avro.Schema schema9 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList7);
    boolean boolean10 = schema9.isNullable();
    java.util.Set<String> strSet11 = schema9.getAliases();
    String str12 = schema9.toString();
    org.apache.avro.Schema.Field[] fieldArray13 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList14 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList14,
        fieldArray13);
    org.apache.avro.Schema schema16 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList14);
    boolean boolean17 = schema16.isNullable();
    java.util.Set<String> strSet18 = schema16.getAliases();
    String str19 = schema16.toString();
    org.apache.avro.Schema.Field field21 = schema16.getField("long");
    boolean boolean22 = schema16.hasProps();
    org.apache.avro.Schema schema23 = org.apache.avro.Schema.applyAliases(schema9, schema16);
    org.apache.avro.Schema schema24 = parseContext5.resolve(schema23);
    org.apache.avro.Schema schema26 = parseContext5.getNamedSchema("{\"type\":\"record\",\"fields\":[]}");
    org.apache.avro.Schema schema28 = parseContext5.getNamedSchema("{\"type\":\"record\",\"fields\":[]}");
    parseContext5.commit();
    java.util.List list30 = parseContext5.resolveAllSchemas();
    org.apache.avro.Schema schema31 = org.apache.avro.Schema.createRecord("long", "enum",
        "{\n  \"type\" : \"record\",\n  \"fields\" : [ ]\n}.float", true,
        (java.util.List<org.apache.avro.Schema.Field>) list30);
    org.junit.Assert.assertNotNull(nameValidator4);
    org.junit.Assert.assertNotNull(fieldArray6);
    org.junit.Assert.assertArrayEquals(fieldArray6, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    org.junit.Assert.assertNotNull(schema9);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    org.junit.Assert.assertNotNull(strSet11);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str12,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNotNull(fieldArray13);
    org.junit.Assert.assertArrayEquals(fieldArray13, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    org.junit.Assert.assertNotNull(schema16);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    org.junit.Assert.assertNotNull(strSet18);
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str19,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNull(field21);
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    org.junit.Assert.assertNotNull(schema23);
    org.junit.Assert.assertNotNull(schema24);
    org.junit.Assert.assertNull(schema26);
    org.junit.Assert.assertNull(schema28);
    org.junit.Assert.assertNotNull(list30);
    org.junit.Assert.assertNotNull(schema31);
  }

  @Test
  public void test070() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test070");
    org.apache.avro.NameValidator nameValidator1 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext2 = new org.apache.avro.ParseContext(nameValidator1);
    org.apache.avro.Schema.Field[] fieldArray3 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList4 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList4,
        fieldArray3);
    org.apache.avro.Schema schema6 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList4);
    boolean boolean7 = schema6.isNullable();
    java.util.Set<String> strSet8 = schema6.getAliases();
    String str9 = schema6.toString();
    org.apache.avro.Schema.Field[] fieldArray10 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList11 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList11,
        fieldArray10);
    org.apache.avro.Schema schema13 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList11);
    boolean boolean14 = schema13.isNullable();
    java.util.Set<String> strSet15 = schema13.getAliases();
    String str16 = schema13.toString();
    org.apache.avro.Schema.Field field18 = schema13.getField("long");
    boolean boolean19 = schema13.hasProps();
    org.apache.avro.Schema schema20 = org.apache.avro.Schema.applyAliases(schema6, schema13);
    org.apache.avro.Schema schema21 = parseContext2.resolve(schema20);
    org.apache.avro.Schema schema23 = parseContext2.getNamedSchema("{\"type\":\"record\",\"fields\":[]}");
    org.apache.avro.Schema schema25 = parseContext2.getNamedSchema("{\"type\":\"record\",\"fields\":[]}");
    parseContext2.rollback();
    java.util.List list27 = parseContext2.resolveAllSchemas();
    org.apache.avro.Schema.Field[] fieldArray28 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList29 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean30 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList29,
        fieldArray28);
    org.apache.avro.Schema schema31 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList29);
    boolean boolean32 = schema31.isNullable();
    java.util.Set<String> strSet33 = schema31.getAliases();
    String str34 = schema31.toString();
    org.apache.avro.Schema.Field field36 = schema31.getField("long");
    org.apache.avro.Schema schema37 = parseContext2.resolve(schema31);
    org.apache.avro.Schema schema40 = parseContext2.find(
        "{\"type\":\"record\",\"fields\":[],\"{\\n  \\\"type\\\" : \\\"record\\\",\\n  \\\"fields\\\" : [ ]\\n}\":\"enum\",\"aliases\":[\"fixed\"]}",
        "fixed");
    org.apache.avro.NameValidator nameValidator42 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext43 = new org.apache.avro.ParseContext(nameValidator42);
    org.apache.avro.Schema.Field[] fieldArray44 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList45 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean46 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList45,
        fieldArray44);
    org.apache.avro.Schema schema47 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList45);
    boolean boolean48 = schema47.isNullable();
    java.util.Set<String> strSet49 = schema47.getAliases();
    String str50 = schema47.toString();
    org.apache.avro.Schema.Field[] fieldArray51 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList52 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean53 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList52,
        fieldArray51);
    org.apache.avro.Schema schema54 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList52);
    boolean boolean55 = schema54.isNullable();
    java.util.Set<String> strSet56 = schema54.getAliases();
    String str57 = schema54.toString();
    org.apache.avro.Schema.Field field59 = schema54.getField("long");
    boolean boolean60 = schema54.hasProps();
    org.apache.avro.Schema schema61 = org.apache.avro.Schema.applyAliases(schema47, schema54);
    org.apache.avro.Schema schema62 = parseContext43.resolve(schema61);
    org.apache.avro.Schema schema65 = parseContext43.find("long type:RECORD pos:-1", "record");
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema.Field field66 = new org.apache.avro.Schema.Field(
          "{\n  \"type\" : \"record\",\n  \"fields\" : [ ]\n}", schema40,
          "{\"type\":\"record\",\"fields\":[],\"aliases\":[\"record\"]}", (Object) "long type:RECORD pos:-1");
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {?  \"type\" : \"record\",?  \"fields\" : [ ]?}");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(nameValidator1);
    org.junit.Assert.assertNotNull(fieldArray3);
    org.junit.Assert.assertArrayEquals(fieldArray3, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    org.junit.Assert.assertNotNull(schema6);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertNotNull(strSet8);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str9,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNotNull(fieldArray10);
    org.junit.Assert.assertArrayEquals(fieldArray10, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    org.junit.Assert.assertNotNull(schema13);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    org.junit.Assert.assertNotNull(strSet15);
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str16,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNull(field18);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    org.junit.Assert.assertNotNull(schema20);
    org.junit.Assert.assertNotNull(schema21);
    org.junit.Assert.assertNull(schema23);
    org.junit.Assert.assertNull(schema25);
    org.junit.Assert.assertNotNull(list27);
    org.junit.Assert.assertNotNull(fieldArray28);
    org.junit.Assert.assertArrayEquals(fieldArray28, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    org.junit.Assert.assertNotNull(schema31);
    org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    org.junit.Assert.assertNotNull(strSet33);
    org.junit.Assert.assertEquals("'" + str34 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str34,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNull(field36);
    org.junit.Assert.assertNotNull(schema37);
    org.junit.Assert.assertNotNull(schema40);
    org.junit.Assert.assertNotNull(nameValidator42);
    org.junit.Assert.assertNotNull(fieldArray44);
    org.junit.Assert.assertArrayEquals(fieldArray44, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    org.junit.Assert.assertNotNull(schema47);
    org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    org.junit.Assert.assertNotNull(strSet49);
    org.junit.Assert.assertEquals("'" + str50 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str50,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNotNull(fieldArray51);
    org.junit.Assert.assertArrayEquals(fieldArray51, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    org.junit.Assert.assertNotNull(schema54);
    org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    org.junit.Assert.assertNotNull(strSet56);
    org.junit.Assert.assertEquals("'" + str57 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str57,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNull(field59);
    org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    org.junit.Assert.assertNotNull(schema61);
    org.junit.Assert.assertNotNull(schema62);
    org.junit.Assert.assertNotNull(schema65);
  }

  @Test
  public void test071() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test071");
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
    org.apache.avro.Schema.Field[] fieldArray22 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList23 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean24 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList23,
        fieldArray22);
    org.apache.avro.Schema schema25 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList23);
    boolean boolean26 = schema25.isNullable();
    java.util.Set<String> strSet27 = schema25.getAliases();
    com.fasterxml.jackson.databind.JsonNode jsonNode28 = null;
    boolean boolean29 = schema25.isValidDefault(jsonNode28);
    boolean boolean30 = schema25.isUnion();
    org.apache.avro.Schema.Field field32 = new org.apache.avro.Schema.Field("boolean", schema25, "boolean");
    org.apache.avro.LogicalType logicalType33 = schema25.getLogicalType();
    schema25.addProp("record", (Object) "boolean");
    org.apache.avro.Schema.Type type38 = org.apache.avro.Schema.Type.LONG;
    String str39 = type38.getName();
    schema25.addProp("hi!", (Object) str39);
    org.apache.avro.SchemaParser.ParseResult parseResult41 = parseContext1.commit(schema25);
    org.apache.avro.Schema.Field[] fieldArray43 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList44 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean45 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList44,
        fieldArray43);
    org.apache.avro.Schema schema46 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList44);
    boolean boolean47 = schema46.isNullable();
    java.util.Set<String> strSet48 = schema46.getAliases();
    org.apache.avro.Schema.Field field50 = new org.apache.avro.Schema.Field("long", schema46, "long");
    boolean boolean51 = field50.hasDefaultValue();
    org.apache.avro.Schema schema52 = field50.schema();
    String str53 = schema52.getName();
    // The following exception was thrown during execution in test generation
    try {
      parseContext1.put(schema52);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"String.split(String)\" because \"fullName\" is null");
    } catch (NullPointerException e) {
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
    org.junit.Assert.assertNotNull(fieldArray22);
    org.junit.Assert.assertArrayEquals(fieldArray22, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    org.junit.Assert.assertNotNull(schema25);
    org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    org.junit.Assert.assertNotNull(strSet27);
    org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    org.junit.Assert.assertNull(logicalType33);
    org.junit.Assert.assertTrue("'" + type38 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type38.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertEquals("'" + str39 + "' != '" + "long" + "'", str39, "long");
    org.junit.Assert.assertNotNull(parseResult41);
    org.junit.Assert.assertNotNull(fieldArray43);
    org.junit.Assert.assertArrayEquals(fieldArray43, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    org.junit.Assert.assertNotNull(schema46);
    org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    org.junit.Assert.assertNotNull(strSet48);
    org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    org.junit.Assert.assertNotNull(schema52);
    org.junit.Assert.assertNull(str53);
  }

  @Test
  public void test072() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test072");
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
    parseContext1.rollback();
    java.util.List list26 = parseContext1.resolveAllSchemas();
    org.apache.avro.Schema schema27 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) list26);
    org.apache.avro.Schema schema28 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) list26);
    java.util.function.BiConsumer<String, Object> strBiConsumer29 = null;
    schema28.forEachProperty(strBiConsumer29);
    org.apache.avro.Schema.Field.Order order32 = org.apache.avro.Schema.Field.Order.ASCENDING;
    schema28.addProp("long type:RECORD pos:-1", (Object) order32);
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
    org.junit.Assert.assertNotNull(list26);
    org.junit.Assert.assertNotNull(schema27);
    org.junit.Assert.assertNotNull(schema28);
    org.junit.Assert.assertTrue("'" + order32 + "' != '" + org.apache.avro.Schema.Field.Order.ASCENDING + "'",
        order32.equals(org.apache.avro.Schema.Field.Order.ASCENDING));
  }

  @Test
  public void test073() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test073");
    org.apache.avro.NameValidator nameValidator0 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.Schema.Parser parser1 = new org.apache.avro.Schema.Parser(nameValidator0);
    org.apache.avro.Schema.setNameValidator(nameValidator0);
    org.apache.avro.ParseContext parseContext3 = new org.apache.avro.ParseContext(nameValidator0);
    org.apache.avro.ParseContext parseContext4 = new org.apache.avro.ParseContext(nameValidator0);
    org.apache.avro.ParseContext parseContext5 = new org.apache.avro.ParseContext(nameValidator0);
    org.apache.avro.Schema schema7 = parseContext5.getNamedSchema("");
    org.junit.Assert.assertNotNull(nameValidator0);
    org.junit.Assert.assertNull(schema7);
  }

  @Test
  public void test074() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test074");
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
    java.util.List<org.apache.avro.Schema.Field> fieldList21 = schema19.getFields();
    boolean boolean22 = schema19.isError();
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
    org.junit.Assert.assertNotNull(fieldList21);
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
  }

  @Test
  public void test075() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test075");
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
    java.util.Set<String> strSet27 = schema24.getAliases();
    // The following exception was thrown during execution in test generation
    try {
      boolean boolean29 = schema24.hasEnumSymbol(
          "{\"type\":\"record\",\"fields\":[],\"{\\n  \\\"type\\\" : \\\"record\\\",\\n  \\\"fields\\\" : [ ]\\n}\":\"enum\",\"aliases\":[\"fixed\"]}");
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
    org.junit.Assert.assertNotNull(strSet27);
  }

  @Test
  public void test076() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test076");
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
    org.apache.avro.Schema.Field[] fieldArray23 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList24 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean25 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList24,
        fieldArray23);
    org.apache.avro.Schema schema26 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList24);
    String str27 = schema26.getName();
    org.apache.avro.LogicalType logicalType28 = schema26.getLogicalType();
    org.apache.avro.SchemaParser.ParseResult parseResult29 = parseContext1.commit(schema26);
    parseContext1.rollback();
    org.apache.avro.Schema.Parser parser31 = new org.apache.avro.Schema.Parser(parseContext1);
    Iterable<org.apache.avro.Schema> schemaIterable32 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema.Parser parser33 = parser31.addTypes(schemaIterable32);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.Iterable.iterator()\" because \"types\" is null");
    } catch (NullPointerException e) {
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
    org.junit.Assert.assertNull(schema22);
    org.junit.Assert.assertNotNull(fieldArray23);
    org.junit.Assert.assertArrayEquals(fieldArray23, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    org.junit.Assert.assertNotNull(schema26);
    org.junit.Assert.assertNull(str27);
    org.junit.Assert.assertNull(logicalType28);
    org.junit.Assert.assertNotNull(parseResult29);
  }

  @Test
  public void test077() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test077");
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
    parseContext1.rollback();
    org.apache.avro.Schema.Field[] fieldArray26 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList27 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean28 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList27,
        fieldArray26);
    org.apache.avro.Schema schema29 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList27);
    boolean boolean30 = schema29.isUnion();
    java.util.Set<String> strSet31 = schema29.getAliases();
    String str32 = schema29.getDoc();
    org.apache.avro.Schema schema33 = parseContext1.resolve(schema29);
    boolean boolean35 = parseContext1.contains(
        "{\n  \"type\" : \"record\",\n  \"name\" : \"array\",\n  \"namespace\" : \"hi!\",\n  \"doc\" : \"record\",\n  \"fields\" : [ ]\n}");
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
    org.junit.Assert.assertNotNull(fieldArray26);
    org.junit.Assert.assertArrayEquals(fieldArray26, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    org.junit.Assert.assertNotNull(schema29);
    org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    org.junit.Assert.assertNotNull(strSet31);
    org.junit.Assert.assertNull(str32);
    org.junit.Assert.assertNotNull(schema33);
    org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
  }

  @Test
  public void test078() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test078");
    org.apache.avro.NameValidator nameValidator0 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext1 = new org.apache.avro.ParseContext(nameValidator0);
    org.apache.avro.Schema.Field[] fieldArray2 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList3 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList3,
        fieldArray2);
    org.apache.avro.Schema schema5 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList3);
    org.apache.avro.SchemaParser.ParseResult parseResult6 = parseContext1.commit(schema5);
    java.util.List list7 = parseContext1.resolveAllSchemas();
    org.apache.avro.Schema schema10 = parseContext1.find("fixed", "long type:RECORD pos:-1");
    boolean boolean12 = parseContext1.contains("");
    org.junit.Assert.assertNotNull(nameValidator0);
    org.junit.Assert.assertNotNull(fieldArray2);
    org.junit.Assert.assertArrayEquals(fieldArray2, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertNotNull(parseResult6);
    org.junit.Assert.assertNotNull(list7);
    org.junit.Assert.assertNotNull(schema10);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
  }

  @Test
  public void test079() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test079");
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
    org.apache.avro.Schema schema23 = parseContext1.find("long type:RECORD pos:-1", "record");
    org.apache.avro.Schema schema26 = parseContext1.find("fixed", "hi!");
    schema26.addProp("{\"type\":\"record\",\"fields\":[],\"aliases\":[\"record\"]}",
        "{\"type\":\"array\",\"items\":{\"type\":\"fixed\",\"name\":\"fixed\",\"namespace\":\"{\\\"type\\\":\\\"record\\\",\\\"fields\\\":[]}\",\"doc\":\"\",\"size\":32}}");
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
    org.junit.Assert.assertNotNull(schema23);
    org.junit.Assert.assertNotNull(schema26);
  }

  @Test
  public void test080() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test080");
    org.apache.avro.NameValidator nameValidator0 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext1 = new org.apache.avro.ParseContext(nameValidator0);
    org.apache.avro.Schema schema4 = parseContext1.find("hi!", "hi!");
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema5 = schema4.getValueType();
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a map: {\"type\":\"record\",\"name\":\"UnresolvedSchema_62\",\"namespace\":\"org.apache.avro.compiler\",\"doc\":\"unresolved schema\",\"fields\":[],\"org.apache.avro.idl.unresolved.name\":\"hi!.hi!\"}");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(nameValidator0);
    org.junit.Assert.assertNotNull(schema4);
  }

  @Test
  public void test081() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test081");
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
    org.apache.avro.Schema.Field[] fieldArray23 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList24 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean25 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList24,
        fieldArray23);
    org.apache.avro.Schema schema26 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList24);
    boolean boolean27 = schema26.isNullable();
    java.util.Set<String> strSet28 = schema26.getAliases();
    org.apache.avro.Schema.Field field30 = new org.apache.avro.Schema.Field("long", schema26, "long");
    boolean boolean31 = field30.hasDefaultValue();
    int int32 = field30.pos();
    String str33 = field30.doc();
    org.apache.avro.Schema.Field[] fieldArray34 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList35 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean36 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList35,
        fieldArray34);
    org.apache.avro.Schema schema37 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList35);
    boolean boolean38 = schema37.isNullable();
    java.util.Set<String> strSet39 = schema37.getAliases();
    String str40 = schema37.toString();
    org.apache.avro.Schema.Field field42 = schema37.getField("long");
    java.util.List<org.apache.avro.Schema.Field> fieldList43 = schema37.getFields();
    schema37.addAlias("long");
    boolean boolean47 = schema37.propsContainsKey("record");
    org.apache.avro.Schema.Field field48 = new org.apache.avro.Schema.Field(field30, schema37);
    Object obj49 = schema19.getObjectProp("float", (Object) schema37);
    org.apache.avro.Schema schema50 = org.apache.avro.Schema.createArray(schema19);
    String str51 = schema50.toString();
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
    org.junit.Assert.assertNotNull(fieldArray23);
    org.junit.Assert.assertArrayEquals(fieldArray23, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    org.junit.Assert.assertNotNull(schema26);
    org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    org.junit.Assert.assertNotNull(strSet28);
    org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    org.junit.Assert.assertEquals("'" + str33 + "' != '" + "long" + "'", str33, "long");
    org.junit.Assert.assertNotNull(fieldArray34);
    org.junit.Assert.assertArrayEquals(fieldArray34, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    org.junit.Assert.assertNotNull(schema37);
    org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    org.junit.Assert.assertNotNull(strSet39);
    org.junit.Assert.assertEquals("'" + str40 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str40,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNull(field42);
    org.junit.Assert.assertNotNull(fieldList43);
    org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    org.junit.Assert.assertNotNull(obj49);
    org.junit.Assert.assertEquals(obj49.toString(), "{\"type\":\"record\",\"fields\":[],\"aliases\":[\"long\"]}");
    org.junit.Assert.assertEquals(String.valueOf(obj49), "{\"type\":\"record\",\"fields\":[],\"aliases\":[\"long\"]}");
    org.junit.Assert.assertEquals(java.util.Objects.toString(obj49),
        "{\"type\":\"record\",\"fields\":[],\"aliases\":[\"long\"]}");
    org.junit.Assert.assertNotNull(schema50);
    org.junit.Assert.assertEquals(
        "'" + str51 + "' != '" + "{\"type\":\"array\",\"items\":{\"type\":\"record\",\"fields\":[]}}" + "'", str51,
        "{\"type\":\"array\",\"items\":{\"type\":\"record\",\"fields\":[]}}");
  }

  @Test
  public void test082() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test082");
    org.apache.avro.NameValidator nameValidator0 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext1 = new org.apache.avro.ParseContext(nameValidator0);
    org.apache.avro.Schema.Field[] fieldArray2 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList3 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList3,
        fieldArray2);
    org.apache.avro.Schema schema5 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList3);
    org.apache.avro.SchemaParser.ParseResult parseResult6 = parseContext1.commit(schema5);
    java.util.List list7 = parseContext1.resolveAllSchemas();
    org.apache.avro.Schema schema10 = parseContext1.find("fixed", "hi!");
    org.apache.avro.NameValidator nameValidator15 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext16 = new org.apache.avro.ParseContext(nameValidator15);
    org.apache.avro.Schema.Field[] fieldArray17 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList18 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList18,
        fieldArray17);
    org.apache.avro.Schema schema20 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList18);
    boolean boolean21 = schema20.isNullable();
    java.util.Set<String> strSet22 = schema20.getAliases();
    String str23 = schema20.toString();
    org.apache.avro.Schema.Field[] fieldArray24 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList25 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean26 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList25,
        fieldArray24);
    org.apache.avro.Schema schema27 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList25);
    boolean boolean28 = schema27.isNullable();
    java.util.Set<String> strSet29 = schema27.getAliases();
    String str30 = schema27.toString();
    org.apache.avro.Schema.Field field32 = schema27.getField("long");
    boolean boolean33 = schema27.hasProps();
    org.apache.avro.Schema schema34 = org.apache.avro.Schema.applyAliases(schema20, schema27);
    org.apache.avro.Schema schema35 = parseContext16.resolve(schema34);
    org.apache.avro.Schema schema37 = parseContext16.getNamedSchema("{\"type\":\"record\",\"fields\":[]}");
    org.apache.avro.Schema schema39 = parseContext16.getNamedSchema("{\"type\":\"record\",\"fields\":[]}");
    parseContext16.rollback();
    java.util.List list41 = parseContext16.resolveAllSchemas();
    org.apache.avro.Schema schema42 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) list41);
    org.apache.avro.Schema schema43 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) list41);
    org.apache.avro.Schema schema44 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) list41);
    org.apache.avro.Schema schema45 = org.apache.avro.Schema.createRecord("float", "array",
        "{\n  \"type\" : \"record\",\n  \"fields\" : [ ]\n}", false,
        (java.util.List<org.apache.avro.Schema.Field>) list41);
    org.apache.avro.SchemaParser.ParseResult parseResult46 = parseContext1.commit(schema45);
    // The following exception was thrown during execution in test generation
    try {
      int int47 = schema45.getFixedSize();
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Not fixed: {\"type\":\"record\",\"name\":\"float\",\"namespace\":\"{\\n  \\\"type\\\" : \\\"record\\\",\\n  \\\"fields\\\" : [ ]\\n}\",\"doc\":\"array\",\"fields\":[]}");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(nameValidator0);
    org.junit.Assert.assertNotNull(fieldArray2);
    org.junit.Assert.assertArrayEquals(fieldArray2, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertNotNull(parseResult6);
    org.junit.Assert.assertNotNull(list7);
    org.junit.Assert.assertNotNull(schema10);
    org.junit.Assert.assertNotNull(nameValidator15);
    org.junit.Assert.assertNotNull(fieldArray17);
    org.junit.Assert.assertArrayEquals(fieldArray17, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    org.junit.Assert.assertNotNull(schema20);
    org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    org.junit.Assert.assertNotNull(strSet22);
    org.junit.Assert.assertEquals("'" + str23 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str23,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNotNull(fieldArray24);
    org.junit.Assert.assertArrayEquals(fieldArray24, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    org.junit.Assert.assertNotNull(schema27);
    org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    org.junit.Assert.assertNotNull(strSet29);
    org.junit.Assert.assertEquals("'" + str30 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str30,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNull(field32);
    org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    org.junit.Assert.assertNotNull(schema34);
    org.junit.Assert.assertNotNull(schema35);
    org.junit.Assert.assertNull(schema37);
    org.junit.Assert.assertNull(schema39);
    org.junit.Assert.assertNotNull(list41);
    org.junit.Assert.assertNotNull(schema42);
    org.junit.Assert.assertNotNull(schema43);
    org.junit.Assert.assertNotNull(schema44);
    org.junit.Assert.assertNotNull(schema45);
    org.junit.Assert.assertNotNull(parseResult46);
  }

  @Test
  public void test083() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test083");
    org.apache.avro.Schema.Field[] fieldArray1 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList2 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList2,
        fieldArray1);
    org.apache.avro.Schema schema4 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList2);
    boolean boolean5 = schema4.isNullable();
    java.util.Set<String> strSet6 = schema4.getAliases();
    org.apache.avro.Schema.Field field8 = new org.apache.avro.Schema.Field("long", schema4, "long");
    String str9 = field8.toString();
    org.apache.avro.Schema schema10 = field8.schema();
    org.apache.avro.NameValidator nameValidator11 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext12 = new org.apache.avro.ParseContext(nameValidator11);
    org.apache.avro.Schema.Field[] fieldArray13 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList14 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList14,
        fieldArray13);
    org.apache.avro.Schema schema16 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList14);
    org.apache.avro.SchemaParser.ParseResult parseResult17 = parseContext12.commit(schema16);
    java.util.List list18 = parseContext12.resolveAllSchemas();
    org.apache.avro.Schema schema21 = parseContext12.find("fixed", "long type:RECORD pos:-1");
    org.apache.avro.Schema.SeenPair seenPair22 = new org.apache.avro.Schema.SeenPair((Object) field8,
        (Object) schema21);
    org.apache.avro.Schema.Field[] fieldArray25 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList26 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean27 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList26,
        fieldArray25);
    org.apache.avro.Schema schema28 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList26);
    boolean boolean29 = schema28.isNullable();
    java.util.Set<String> strSet30 = schema28.getAliases();
    com.fasterxml.jackson.databind.JsonNode jsonNode31 = null;
    boolean boolean32 = schema28.isValidDefault(jsonNode31);
    boolean boolean33 = schema28.isUnion();
    org.apache.avro.Schema.Field field35 = new org.apache.avro.Schema.Field("boolean", schema28, "boolean");
    org.apache.avro.LogicalType logicalType36 = schema28.getLogicalType();
    schema28.addProp("record", (Object) "boolean");
    org.apache.avro.Schema.Field field41 = new org.apache.avro.Schema.Field("record", schema28, "boolean");
    String str42 = field41.doc();
    boolean boolean43 = seenPair22.equals((Object) field41);
    boolean boolean45 = seenPair22
        .equals((Object) "{\"type\":\"array\",\"items\":{\"type\":\"record\",\"fields\":[]}}");
    org.junit.Assert.assertNotNull(fieldArray1);
    org.junit.Assert.assertArrayEquals(fieldArray1, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    org.junit.Assert.assertNotNull(schema4);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    org.junit.Assert.assertNotNull(strSet6);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "long type:RECORD pos:-1" + "'", str9,
        "long type:RECORD pos:-1");
    org.junit.Assert.assertNotNull(schema10);
    org.junit.Assert.assertNotNull(nameValidator11);
    org.junit.Assert.assertNotNull(fieldArray13);
    org.junit.Assert.assertArrayEquals(fieldArray13, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    org.junit.Assert.assertNotNull(schema16);
    org.junit.Assert.assertNotNull(parseResult17);
    org.junit.Assert.assertNotNull(list18);
    org.junit.Assert.assertNotNull(schema21);
    org.junit.Assert.assertNotNull(fieldArray25);
    org.junit.Assert.assertArrayEquals(fieldArray25, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    org.junit.Assert.assertNotNull(schema28);
    org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    org.junit.Assert.assertNotNull(strSet30);
    org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    org.junit.Assert.assertNull(logicalType36);
    org.junit.Assert.assertEquals("'" + str42 + "' != '" + "boolean" + "'", str42, "boolean");
    org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
  }

  @Test
  public void test084() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test084");
    org.apache.avro.NameValidator nameValidator0 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.Schema.Parser parser1 = new org.apache.avro.Schema.Parser(nameValidator0);
    org.apache.avro.Schema.setNameValidator(nameValidator0);
    org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser(nameValidator0);
    org.apache.avro.ParseContext parseContext4 = new org.apache.avro.ParseContext(nameValidator0);
    org.apache.avro.Schema.Parser parser5 = new org.apache.avro.Schema.Parser(nameValidator0);
    Class<?> wildcardClass6 = parser5.getClass();
    org.junit.Assert.assertNotNull(nameValidator0);
    org.junit.Assert.assertNotNull(wildcardClass6);
  }

  @Test
  public void test085() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test085");
    org.apache.avro.NameValidator nameValidator0 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.Schema.Parser parser1 = new org.apache.avro.Schema.Parser(nameValidator0);
    org.apache.avro.Schema.setNameValidator(nameValidator0);
    org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser(nameValidator0);
    org.apache.avro.Schema.Parser parser4 = new org.apache.avro.Schema.Parser(nameValidator0);
    org.apache.avro.ParseContext parseContext5 = new org.apache.avro.ParseContext(nameValidator0);
    org.apache.avro.Schema.Parser parser6 = new org.apache.avro.Schema.Parser(nameValidator0);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema8 = parser6.parse(
          "{\n  \"type\" : \"record\",\n  \"name\" : \"array\",\n  \"namespace\" : \"hi!\",\n  \"doc\" : \"record\",\n  \"fields\" : [ ]\n}");
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.SchemaParseException; message: Namespace part \"hi!\" is invalid: Illegal character in: hi!");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(nameValidator0);
  }

  @Test
  public void test086() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test086");
    org.apache.avro.Schema.Field[] fieldArray0 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList1 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList1,
        fieldArray0);
    org.apache.avro.Schema schema3 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
    boolean boolean4 = schema3.isNullable();
    java.util.Set<String> strSet5 = schema3.getAliases();
    Object obj7 = schema3.getObjectProp("hi!");
    String str9 = schema3.toString(false);
    String str11 = schema3.toString(false);
    org.apache.avro.NameValidator nameValidator13 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext14 = new org.apache.avro.ParseContext(nameValidator13);
    org.apache.avro.Schema.Field[] fieldArray15 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList16 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList16,
        fieldArray15);
    org.apache.avro.Schema schema18 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList16);
    boolean boolean19 = schema18.isNullable();
    java.util.Set<String> strSet20 = schema18.getAliases();
    String str21 = schema18.toString();
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
    boolean boolean31 = schema25.hasProps();
    org.apache.avro.Schema schema32 = org.apache.avro.Schema.applyAliases(schema18, schema25);
    org.apache.avro.Schema schema33 = parseContext14.resolve(schema32);
    org.apache.avro.Schema schema35 = parseContext14.getNamedSchema("{\"type\":\"record\",\"fields\":[]}");
    org.apache.avro.Schema schema37 = parseContext14.getNamedSchema("{\"type\":\"record\",\"fields\":[]}");
    parseContext14.rollback();
    java.util.List list39 = parseContext14.resolveAllSchemas();
    org.apache.avro.Schema schema40 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) list39);
    org.apache.avro.Schema schema41 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) list39);
    schema3.addProp("hi!", (Object) list39);
    boolean boolean43 = schema3.hasFields();
    org.junit.Assert.assertNotNull(fieldArray0);
    org.junit.Assert.assertArrayEquals(fieldArray0, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertNotNull(schema3);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    org.junit.Assert.assertNotNull(strSet5);
    org.junit.Assert.assertNull(obj7);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str9,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str11,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNotNull(nameValidator13);
    org.junit.Assert.assertNotNull(fieldArray15);
    org.junit.Assert.assertArrayEquals(fieldArray15, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    org.junit.Assert.assertNotNull(schema18);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    org.junit.Assert.assertNotNull(strSet20);
    org.junit.Assert.assertEquals("'" + str21 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str21,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNotNull(fieldArray22);
    org.junit.Assert.assertArrayEquals(fieldArray22, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    org.junit.Assert.assertNotNull(schema25);
    org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    org.junit.Assert.assertNotNull(strSet27);
    org.junit.Assert.assertEquals("'" + str28 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str28,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNull(field30);
    org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    org.junit.Assert.assertNotNull(schema32);
    org.junit.Assert.assertNotNull(schema33);
    org.junit.Assert.assertNull(schema35);
    org.junit.Assert.assertNull(schema37);
    org.junit.Assert.assertNotNull(list39);
    org.junit.Assert.assertNotNull(schema40);
    org.junit.Assert.assertNotNull(schema41);
    org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
  }

  @Test
  public void test087() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test087");
    org.apache.avro.NameValidator nameValidator3 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext4 = new org.apache.avro.ParseContext(nameValidator3);
    org.apache.avro.Schema.Field[] fieldArray5 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList6 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList6,
        fieldArray5);
    org.apache.avro.Schema schema8 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList6);
    boolean boolean9 = schema8.isNullable();
    java.util.Set<String> strSet10 = schema8.getAliases();
    String str11 = schema8.toString();
    org.apache.avro.Schema.Field[] fieldArray12 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList13 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList13,
        fieldArray12);
    org.apache.avro.Schema schema15 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList13);
    boolean boolean16 = schema15.isNullable();
    java.util.Set<String> strSet17 = schema15.getAliases();
    String str18 = schema15.toString();
    org.apache.avro.Schema.Field field20 = schema15.getField("long");
    boolean boolean21 = schema15.hasProps();
    org.apache.avro.Schema schema22 = org.apache.avro.Schema.applyAliases(schema8, schema15);
    org.apache.avro.Schema schema23 = parseContext4.resolve(schema22);
    org.apache.avro.Schema schema25 = parseContext4.getNamedSchema("{\"type\":\"record\",\"fields\":[]}");
    org.apache.avro.Schema schema27 = parseContext4.getNamedSchema("{\"type\":\"record\",\"fields\":[]}");
    parseContext4.rollback();
    java.util.List list29 = parseContext4.resolveAllSchemas();
    org.apache.avro.Schema schema30 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) list29);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema31 = org.apache.avro.Schema.createEnum("long type:RECORD pos:-1", "hi!", "bytes",
          (java.util.List<String>) list29);
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.SchemaParseException; message: Illegal character in: long type:RECORD pos:-1");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(nameValidator3);
    org.junit.Assert.assertNotNull(fieldArray5);
    org.junit.Assert.assertArrayEquals(fieldArray5, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertNotNull(schema8);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    org.junit.Assert.assertNotNull(strSet10);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str11,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNotNull(fieldArray12);
    org.junit.Assert.assertArrayEquals(fieldArray12, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    org.junit.Assert.assertNotNull(schema15);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    org.junit.Assert.assertNotNull(strSet17);
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str18,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNull(field20);
    org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    org.junit.Assert.assertNotNull(schema22);
    org.junit.Assert.assertNotNull(schema23);
    org.junit.Assert.assertNull(schema25);
    org.junit.Assert.assertNull(schema27);
    org.junit.Assert.assertNotNull(list29);
    org.junit.Assert.assertNotNull(schema30);
  }

  @Test
  public void test088() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test088");
    org.apache.avro.NameValidator nameValidator0 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext1 = new org.apache.avro.ParseContext(nameValidator0);
    org.apache.avro.ParseContext parseContext2 = new org.apache.avro.ParseContext(nameValidator0);
    org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser(nameValidator0);
    org.junit.Assert.assertNotNull(nameValidator0);
  }

  @Test
  public void test089() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test089");
    org.apache.avro.NameValidator nameValidator0 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext1 = new org.apache.avro.ParseContext(nameValidator0);
    org.apache.avro.Schema.Field[] fieldArray2 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList3 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList3,
        fieldArray2);
    org.apache.avro.Schema schema5 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList3);
    org.apache.avro.SchemaParser.ParseResult parseResult6 = parseContext1.commit(schema5);
    org.apache.avro.Schema.Parser parser7 = new org.apache.avro.Schema.Parser(parseContext1);
    java.util.List list8 = parseContext1.resolveAllSchemas();
    org.apache.avro.Schema schema9 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) list8);
    org.junit.Assert.assertNotNull(nameValidator0);
    org.junit.Assert.assertNotNull(fieldArray2);
    org.junit.Assert.assertArrayEquals(fieldArray2, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertNotNull(parseResult6);
    org.junit.Assert.assertNotNull(list8);
    org.junit.Assert.assertNotNull(schema9);
  }

  @Test
  public void test090() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test090");
    org.apache.avro.NameValidator nameValidator1 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext2 = new org.apache.avro.ParseContext(nameValidator1);
    org.apache.avro.Schema.Field[] fieldArray3 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList4 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList4,
        fieldArray3);
    org.apache.avro.Schema schema6 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList4);
    boolean boolean7 = schema6.isNullable();
    java.util.Set<String> strSet8 = schema6.getAliases();
    String str9 = schema6.toString();
    org.apache.avro.Schema.Field[] fieldArray10 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList11 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList11,
        fieldArray10);
    org.apache.avro.Schema schema13 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList11);
    boolean boolean14 = schema13.isNullable();
    java.util.Set<String> strSet15 = schema13.getAliases();
    String str16 = schema13.toString();
    org.apache.avro.Schema.Field field18 = schema13.getField("long");
    boolean boolean19 = schema13.hasProps();
    org.apache.avro.Schema schema20 = org.apache.avro.Schema.applyAliases(schema6, schema13);
    org.apache.avro.Schema schema21 = parseContext2.resolve(schema20);
    java.util.List<org.apache.avro.Schema.Field> fieldList22 = schema20.getFields();
    org.apache.avro.NameValidator nameValidator24 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.Schema.Parser parser25 = new org.apache.avro.Schema.Parser(nameValidator24);
    org.apache.avro.Schema.setNameValidator(nameValidator24);
    org.apache.avro.ParseContext parseContext27 = new org.apache.avro.ParseContext(nameValidator24);
    org.apache.avro.Schema.Field[] fieldArray29 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList30 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean31 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList30,
        fieldArray29);
    org.apache.avro.Schema schema32 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList30);
    boolean boolean33 = schema32.isNullable();
    java.util.Set<String> strSet34 = schema32.getAliases();
    org.apache.avro.Schema.Field field36 = new org.apache.avro.Schema.Field("long", schema32, "long");
    org.apache.avro.Schema.Field.Order order37 = field36.order();
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema.Field field38 = new org.apache.avro.Schema.Field("enum", schema20,
          "{\"type\":\"record\",\"fields\":[]}", (Object) parseContext27, order37);
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Unknown datum class: class org.apache.avro.ParseContext");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(nameValidator1);
    org.junit.Assert.assertNotNull(fieldArray3);
    org.junit.Assert.assertArrayEquals(fieldArray3, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    org.junit.Assert.assertNotNull(schema6);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertNotNull(strSet8);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str9,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNotNull(fieldArray10);
    org.junit.Assert.assertArrayEquals(fieldArray10, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    org.junit.Assert.assertNotNull(schema13);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    org.junit.Assert.assertNotNull(strSet15);
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str16,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNull(field18);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    org.junit.Assert.assertNotNull(schema20);
    org.junit.Assert.assertNotNull(schema21);
    org.junit.Assert.assertNotNull(fieldList22);
    org.junit.Assert.assertNotNull(nameValidator24);
    org.junit.Assert.assertNotNull(fieldArray29);
    org.junit.Assert.assertArrayEquals(fieldArray29, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    org.junit.Assert.assertNotNull(schema32);
    org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    org.junit.Assert.assertNotNull(strSet34);
    org.junit.Assert.assertTrue("'" + order37 + "' != '" + org.apache.avro.Schema.Field.Order.ASCENDING + "'",
        order37.equals(org.apache.avro.Schema.Field.Order.ASCENDING));
  }

  @Test
  public void test091() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test091");
    org.apache.avro.NameValidator nameValidator0 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.Schema.Parser parser1 = new org.apache.avro.Schema.Parser(nameValidator0);
    org.apache.avro.Schema.setNameValidator(nameValidator0);
    org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser(nameValidator0);
    org.apache.avro.ParseContext parseContext4 = new org.apache.avro.ParseContext(nameValidator0);
    org.apache.avro.Schema.Parser parser5 = new org.apache.avro.Schema.Parser(nameValidator0);
    org.apache.avro.ParseContext parseContext6 = new org.apache.avro.ParseContext(nameValidator0);
    java.util.List list7 = parseContext6.resolveAllSchemas();
    org.junit.Assert.assertNotNull(nameValidator0);
    org.junit.Assert.assertNotNull(list7);
  }

  @Test
  public void test092() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test092");
    org.apache.avro.NameValidator nameValidator0 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext1 = new org.apache.avro.ParseContext(nameValidator0);
    org.apache.avro.Schema.Field[] fieldArray2 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList3 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList3,
        fieldArray2);
    org.apache.avro.Schema schema5 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList3);
    org.apache.avro.SchemaParser.ParseResult parseResult6 = parseContext1.commit(schema5);
    java.util.List list7 = parseContext1.resolveAllSchemas();
    org.apache.avro.Schema schema10 = parseContext1.find("fixed", "long type:RECORD pos:-1");
    org.apache.avro.Schema schema13 = parseContext1.find("hi!", "");
    org.apache.avro.Schema schema16 = parseContext1.find("",
        "{\"type\":\"record\",\"fields\":[],\"{\\n  \\\"type\\\" : \\\"record\\\",\\n  \\\"fields\\\" : [ ]\\n}\":\"enum\",\"aliases\":[\"fixed\"]}");
    org.apache.avro.Schema.Field[] fieldArray17 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList18 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList18,
        fieldArray17);
    org.apache.avro.Schema schema20 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList18);
    boolean boolean21 = schema20.isNullable();
    java.util.Set<String> strSet22 = schema20.getAliases();
    String str23 = schema20.toString();
    org.apache.avro.Schema.Field[] fieldArray24 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList25 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean26 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList25,
        fieldArray24);
    org.apache.avro.Schema schema27 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList25);
    boolean boolean28 = schema27.isNullable();
    java.util.Set<String> strSet29 = schema27.getAliases();
    String str30 = schema27.toString();
    org.apache.avro.Schema.Field field32 = schema27.getField("long");
    java.util.List<org.apache.avro.Schema.Field> fieldList33 = schema27.getFields();
    String str35 = schema27.toString(false);
    java.util.function.BiConsumer<String, Object> strBiConsumer36 = null;
    schema27.forEachProperty(strBiConsumer36);
    schema20.addAllProps((org.apache.avro.JsonProperties) schema27);
    org.apache.avro.Schema.Field[] fieldArray39 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList40 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean41 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList40,
        fieldArray39);
    org.apache.avro.Schema schema42 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList40);
    boolean boolean43 = schema42.isNullable();
    org.apache.avro.Schema schema44 = org.apache.avro.Schema.createArray(schema42);
    org.apache.avro.Schema schema45 = org.apache.avro.Schema.applyAliases(schema27, schema42);
    java.util.List<org.apache.avro.Schema.Field> fieldList46 = schema42.getFields();
    // The following exception was thrown during execution in test generation
    try {
      schema16.setFields(fieldList46);
      org.junit.Assert
          .fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Fields are already set");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(nameValidator0);
    org.junit.Assert.assertNotNull(fieldArray2);
    org.junit.Assert.assertArrayEquals(fieldArray2, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertNotNull(parseResult6);
    org.junit.Assert.assertNotNull(list7);
    org.junit.Assert.assertNotNull(schema10);
    org.junit.Assert.assertNotNull(schema13);
    org.junit.Assert.assertNotNull(schema16);
    org.junit.Assert.assertNotNull(fieldArray17);
    org.junit.Assert.assertArrayEquals(fieldArray17, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    org.junit.Assert.assertNotNull(schema20);
    org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    org.junit.Assert.assertNotNull(strSet22);
    org.junit.Assert.assertEquals("'" + str23 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str23,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNotNull(fieldArray24);
    org.junit.Assert.assertArrayEquals(fieldArray24, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    org.junit.Assert.assertNotNull(schema27);
    org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    org.junit.Assert.assertNotNull(strSet29);
    org.junit.Assert.assertEquals("'" + str30 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str30,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNull(field32);
    org.junit.Assert.assertNotNull(fieldList33);
    org.junit.Assert.assertEquals("'" + str35 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str35,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNotNull(fieldArray39);
    org.junit.Assert.assertArrayEquals(fieldArray39, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    org.junit.Assert.assertNotNull(schema42);
    org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    org.junit.Assert.assertNotNull(schema44);
    org.junit.Assert.assertNotNull(schema45);
    org.junit.Assert.assertNotNull(fieldList46);
  }

  @Test
  public void test093() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test093");
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
    parseContext1.rollback();
    org.apache.avro.Schema.Field[] fieldArray26 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList27 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean28 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList27,
        fieldArray26);
    org.apache.avro.Schema schema29 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList27);
    boolean boolean30 = schema29.isUnion();
    java.util.Set<String> strSet31 = schema29.getAliases();
    String str32 = schema29.getDoc();
    org.apache.avro.Schema schema33 = parseContext1.resolve(schema29);
    parseContext1.commit();
    org.apache.avro.Schema schema37 = parseContext1.find("record", "bytes");
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
    org.junit.Assert.assertNotNull(fieldArray26);
    org.junit.Assert.assertArrayEquals(fieldArray26, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    org.junit.Assert.assertNotNull(schema29);
    org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    org.junit.Assert.assertNotNull(strSet31);
    org.junit.Assert.assertNull(str32);
    org.junit.Assert.assertNotNull(schema33);
    org.junit.Assert.assertNotNull(schema37);
  }

  @Test
  public void test094() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test094");
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
    parseContext1.rollback();
    java.util.List list26 = parseContext1.resolveAllSchemas();
    org.apache.avro.Schema schema27 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) list26);
    org.apache.avro.Schema.Field[] fieldArray29 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList30 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean31 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList30,
        fieldArray29);
    org.apache.avro.Schema schema32 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList30);
    boolean boolean33 = schema32.isNullable();
    java.util.Set<String> strSet34 = schema32.getAliases();
    org.apache.avro.Schema.Field field36 = new org.apache.avro.Schema.Field("long", schema32, "long");
    org.apache.avro.Schema schema37 = field36.schema();
    boolean boolean39 = field36.propsContainsKey("long type:RECORD pos:-1");
    String str40 = field36.doc();
    java.util.Set<String> strSet41 = field36.aliases();
    org.apache.avro.Schema.SeenPair seenPair42 = new org.apache.avro.Schema.SeenPair((Object) schema27,
        (Object) strSet41);
    org.apache.avro.NameValidator nameValidator44 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.Schema.Parser parser45 = new org.apache.avro.Schema.Parser(nameValidator44);
    org.apache.avro.Schema.setNameValidator(nameValidator44);
    // The following exception was thrown during execution in test generation
    try {
      schema27.addProp(
          "{\n  \"type\" : \"record\",\n  \"name\" : \"array\",\n  \"namespace\" : \"hi!\",\n  \"doc\" : \"record\",\n  \"fields\" : [ ]\n}",
          (Object) nameValidator44);
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Unknown datum class: class org.apache.avro.NameValidator$2");
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
    org.junit.Assert.assertNull(schema22);
    org.junit.Assert.assertNull(schema24);
    org.junit.Assert.assertNotNull(list26);
    org.junit.Assert.assertNotNull(schema27);
    org.junit.Assert.assertNotNull(fieldArray29);
    org.junit.Assert.assertArrayEquals(fieldArray29, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    org.junit.Assert.assertNotNull(schema32);
    org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    org.junit.Assert.assertNotNull(strSet34);
    org.junit.Assert.assertNotNull(schema37);
    org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    org.junit.Assert.assertEquals("'" + str40 + "' != '" + "long" + "'", str40, "long");
    org.junit.Assert.assertNotNull(strSet41);
    org.junit.Assert.assertNotNull(nameValidator44);
  }

  @Test
  public void test095() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test095");
    org.apache.avro.NameValidator nameValidator0 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext1 = new org.apache.avro.ParseContext(nameValidator0);
    org.apache.avro.Schema.Field[] fieldArray2 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList3 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList3,
        fieldArray2);
    org.apache.avro.Schema schema5 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList3);
    org.apache.avro.SchemaParser.ParseResult parseResult6 = parseContext1.commit(schema5);
    java.util.List list7 = parseContext1.resolveAllSchemas();
    org.apache.avro.Schema schema8 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) list7);
    org.junit.Assert.assertNotNull(nameValidator0);
    org.junit.Assert.assertNotNull(fieldArray2);
    org.junit.Assert.assertArrayEquals(fieldArray2, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertNotNull(parseResult6);
    org.junit.Assert.assertNotNull(list7);
    org.junit.Assert.assertNotNull(schema8);
  }

  @Test
  public void test096() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test096");
    org.apache.avro.NameValidator nameValidator0 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.Schema.Parser parser1 = new org.apache.avro.Schema.Parser(nameValidator0);
    org.apache.avro.Schema.setNameValidator(nameValidator0);
    org.apache.avro.ParseContext parseContext3 = new org.apache.avro.ParseContext(nameValidator0);
    org.apache.avro.ParseContext parseContext4 = new org.apache.avro.ParseContext(nameValidator0);
    org.apache.avro.ParseContext parseContext5 = new org.apache.avro.ParseContext(nameValidator0);
    org.apache.avro.ParseContext parseContext6 = new org.apache.avro.ParseContext(nameValidator0);
    org.apache.avro.ParseContext parseContext7 = new org.apache.avro.ParseContext(nameValidator0);
    org.junit.Assert.assertNotNull(nameValidator0);
  }

  @Test
  public void test097() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test097");
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
    parseContext1.commit();
    org.apache.avro.Schema.Field[] fieldArray26 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList27 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean28 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList27,
        fieldArray26);
    org.apache.avro.Schema schema29 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList27);
    String str30 = schema29.getName();
    org.apache.avro.NameValidator nameValidator31 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext32 = new org.apache.avro.ParseContext(nameValidator31);
    org.apache.avro.Schema.Field[] fieldArray33 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList34 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean35 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList34,
        fieldArray33);
    org.apache.avro.Schema schema36 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList34);
    boolean boolean37 = schema36.isNullable();
    java.util.Set<String> strSet38 = schema36.getAliases();
    String str39 = schema36.toString();
    org.apache.avro.Schema.Field[] fieldArray40 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList41 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean42 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList41,
        fieldArray40);
    org.apache.avro.Schema schema43 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList41);
    boolean boolean44 = schema43.isNullable();
    java.util.Set<String> strSet45 = schema43.getAliases();
    String str46 = schema43.toString();
    org.apache.avro.Schema.Field field48 = schema43.getField("long");
    boolean boolean49 = schema43.hasProps();
    org.apache.avro.Schema schema50 = org.apache.avro.Schema.applyAliases(schema36, schema43);
    org.apache.avro.Schema schema51 = parseContext32.resolve(schema50);
    org.apache.avro.Schema schema52 = org.apache.avro.Schema.applyAliases(schema29, schema50);
    org.apache.avro.SchemaParser.ParseResult parseResult53 = parseContext1.commit(schema50);
    com.fasterxml.jackson.databind.JsonNode jsonNode54 = null;
    boolean boolean55 = schema50.isValidDefault(jsonNode54);
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
    org.junit.Assert.assertNotNull(fieldArray26);
    org.junit.Assert.assertArrayEquals(fieldArray26, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    org.junit.Assert.assertNotNull(schema29);
    org.junit.Assert.assertNull(str30);
    org.junit.Assert.assertNotNull(nameValidator31);
    org.junit.Assert.assertNotNull(fieldArray33);
    org.junit.Assert.assertArrayEquals(fieldArray33, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    org.junit.Assert.assertNotNull(schema36);
    org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    org.junit.Assert.assertNotNull(strSet38);
    org.junit.Assert.assertEquals("'" + str39 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str39,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNotNull(fieldArray40);
    org.junit.Assert.assertArrayEquals(fieldArray40, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    org.junit.Assert.assertNotNull(schema43);
    org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    org.junit.Assert.assertNotNull(strSet45);
    org.junit.Assert.assertEquals("'" + str46 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str46,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNull(field48);
    org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    org.junit.Assert.assertNotNull(schema50);
    org.junit.Assert.assertNotNull(schema51);
    org.junit.Assert.assertNotNull(schema52);
    org.junit.Assert.assertNotNull(parseResult53);
    org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
  }

  @Test
  public void test098() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test098");
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
    org.apache.avro.Schema.Field[] fieldArray23 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList24 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean25 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList24,
        fieldArray23);
    org.apache.avro.Schema schema26 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList24);
    String str27 = schema26.getName();
    org.apache.avro.LogicalType logicalType28 = schema26.getLogicalType();
    org.apache.avro.SchemaParser.ParseResult parseResult29 = parseContext1.commit(schema26);
    java.util.Map map30 = parseContext1.typesByName();
    boolean boolean32 = parseContext1.contains("{\"type\":\"record\",\"fields\":[],\"aliases\":[\"record\"]}");
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
    org.junit.Assert.assertNotNull(fieldArray23);
    org.junit.Assert.assertArrayEquals(fieldArray23, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    org.junit.Assert.assertNotNull(schema26);
    org.junit.Assert.assertNull(str27);
    org.junit.Assert.assertNull(logicalType28);
    org.junit.Assert.assertNotNull(parseResult29);
    org.junit.Assert.assertNotNull(map30);
    org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
  }

  @Test
  public void test099() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test099");
    org.apache.avro.Schema.Field[] fieldArray2 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList3 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList3,
        fieldArray2);
    org.apache.avro.Schema schema5 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList3);
    boolean boolean6 = schema5.isNullable();
    java.util.Set<String> strSet7 = schema5.getAliases();
    org.apache.avro.Schema.Field field9 = new org.apache.avro.Schema.Field("long", schema5, "long");
    org.apache.avro.Schema schema10 = field9.schema();
    String str11 = field9.doc();
    int int12 = field9.pos();
    org.apache.avro.Schema.Field[] fieldArray14 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList15 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList15,
        fieldArray14);
    org.apache.avro.Schema schema17 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList15);
    boolean boolean18 = schema17.isNullable();
    java.util.Set<String> strSet19 = schema17.getAliases();
    org.apache.avro.Schema.Field field21 = new org.apache.avro.Schema.Field("long", schema17, "long");
    int int22 = field21.pos();
    boolean boolean23 = field9.equals((Object) int22);
    boolean boolean24 = field9.hasDefaultValue();
    String str26 = field9.getProp("{\"type\":\"record\",\"fields\":[]}");
    field9.addAlias("long type:RECORD pos:-1");
    java.util.Map<String, Object> strMap29 = field9.getObjectProps();
    org.apache.avro.NameValidator nameValidator30 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext31 = new org.apache.avro.ParseContext(nameValidator30);
    java.util.List list32 = parseContext31.resolveAllSchemas();
    org.apache.avro.Schema schema33 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) list32);
    org.apache.avro.Schema.Field field34 = new org.apache.avro.Schema.Field(field9, schema33);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema.Field field35 = new org.apache.avro.Schema.Field(
          "{\n  \"type\" : \"record\",\n  \"fields\" : [ ]\n}.float", schema33);
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {?  \"type\" : \"record\",?  \"fields\" : [ ]?}.float");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(fieldArray2);
    org.junit.Assert.assertArrayEquals(fieldArray2, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    org.junit.Assert.assertNotNull(strSet7);
    org.junit.Assert.assertNotNull(schema10);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "long" + "'", str11, "long");
    org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    org.junit.Assert.assertNotNull(fieldArray14);
    org.junit.Assert.assertArrayEquals(fieldArray14, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    org.junit.Assert.assertNotNull(schema17);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    org.junit.Assert.assertNotNull(strSet19);
    org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    org.junit.Assert.assertNull(str26);
    org.junit.Assert.assertNotNull(strMap29);
    org.junit.Assert.assertNotNull(nameValidator30);
    org.junit.Assert.assertNotNull(list32);
    org.junit.Assert.assertNotNull(schema33);
  }

  @Test
  public void test100() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test100");
    org.apache.avro.NameValidator nameValidator0 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.Schema.Parser parser1 = new org.apache.avro.Schema.Parser(nameValidator0);
    org.apache.avro.Schema.setNameValidator(nameValidator0);
    org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser(nameValidator0);
    org.apache.avro.Schema.Parser parser4 = new org.apache.avro.Schema.Parser(nameValidator0);
    org.apache.avro.ParseContext parseContext5 = new org.apache.avro.ParseContext(nameValidator0);
    org.apache.avro.Schema schema10 = org.apache.avro.Schema.createFixed("fixed", "",
        "{\"type\":\"record\",\"fields\":[]}", (int) ' ');
    org.apache.avro.SchemaParser.ParseResult parseResult11 = parseContext5.commit(schema10);
    parseContext5.rollback();
    org.apache.avro.NameValidator nameValidator13 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext14 = new org.apache.avro.ParseContext(nameValidator13);
    org.apache.avro.Schema.Field[] fieldArray15 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList16 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList16,
        fieldArray15);
    org.apache.avro.Schema schema18 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList16);
    boolean boolean19 = schema18.isNullable();
    java.util.Set<String> strSet20 = schema18.getAliases();
    String str21 = schema18.toString();
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
    boolean boolean31 = schema25.hasProps();
    org.apache.avro.Schema schema32 = org.apache.avro.Schema.applyAliases(schema18, schema25);
    org.apache.avro.Schema schema33 = parseContext14.resolve(schema32);
    org.apache.avro.Schema.Field[] fieldArray35 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList36 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean37 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList36,
        fieldArray35);
    org.apache.avro.Schema schema38 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList36);
    boolean boolean39 = schema38.isNullable();
    java.util.Set<String> strSet40 = schema38.getAliases();
    com.fasterxml.jackson.databind.JsonNode jsonNode41 = null;
    boolean boolean42 = schema38.isValidDefault(jsonNode41);
    boolean boolean43 = schema38.isUnion();
    org.apache.avro.Schema.Field field45 = new org.apache.avro.Schema.Field("boolean", schema38, "boolean");
    org.apache.avro.LogicalType logicalType46 = schema38.getLogicalType();
    schema38.addProp("record", (Object) "boolean");
    org.apache.avro.Schema.Type type51 = org.apache.avro.Schema.Type.LONG;
    String str52 = type51.getName();
    schema38.addProp("hi!", (Object) str52);
    org.apache.avro.SchemaParser.ParseResult parseResult54 = parseContext14.commit(schema38);
    schema38.addProp("array", "{\n  \"type\" : \"record\",\n  \"fields\" : [ ]\n}");
    // The following exception was thrown during execution in test generation
    try {
      parseContext5.put(schema38);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"String.split(String)\" because \"fullName\" is null");
    } catch (NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(nameValidator0);
    org.junit.Assert.assertNotNull(schema10);
    org.junit.Assert.assertNotNull(parseResult11);
    org.junit.Assert.assertNotNull(nameValidator13);
    org.junit.Assert.assertNotNull(fieldArray15);
    org.junit.Assert.assertArrayEquals(fieldArray15, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    org.junit.Assert.assertNotNull(schema18);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    org.junit.Assert.assertNotNull(strSet20);
    org.junit.Assert.assertEquals("'" + str21 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str21,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNotNull(fieldArray22);
    org.junit.Assert.assertArrayEquals(fieldArray22, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    org.junit.Assert.assertNotNull(schema25);
    org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    org.junit.Assert.assertNotNull(strSet27);
    org.junit.Assert.assertEquals("'" + str28 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str28,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNull(field30);
    org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    org.junit.Assert.assertNotNull(schema32);
    org.junit.Assert.assertNotNull(schema33);
    org.junit.Assert.assertNotNull(fieldArray35);
    org.junit.Assert.assertArrayEquals(fieldArray35, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    org.junit.Assert.assertNotNull(schema38);
    org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    org.junit.Assert.assertNotNull(strSet40);
    org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    org.junit.Assert.assertNull(logicalType46);
    org.junit.Assert.assertTrue("'" + type51 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type51.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertEquals("'" + str52 + "' != '" + "long" + "'", str52, "long");
    org.junit.Assert.assertNotNull(parseResult54);
  }

  @Test
  public void test101() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test101");
    org.apache.avro.NameValidator nameValidator8 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext9 = new org.apache.avro.ParseContext(nameValidator8);
    org.apache.avro.Schema.Field[] fieldArray10 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList11 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList11,
        fieldArray10);
    org.apache.avro.Schema schema13 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList11);
    boolean boolean14 = schema13.isNullable();
    java.util.Set<String> strSet15 = schema13.getAliases();
    String str16 = schema13.toString();
    org.apache.avro.Schema.Field[] fieldArray17 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList18 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList18,
        fieldArray17);
    org.apache.avro.Schema schema20 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList18);
    boolean boolean21 = schema20.isNullable();
    java.util.Set<String> strSet22 = schema20.getAliases();
    String str23 = schema20.toString();
    org.apache.avro.Schema.Field field25 = schema20.getField("long");
    boolean boolean26 = schema20.hasProps();
    org.apache.avro.Schema schema27 = org.apache.avro.Schema.applyAliases(schema13, schema20);
    org.apache.avro.Schema schema28 = parseContext9.resolve(schema27);
    org.apache.avro.Schema schema30 = parseContext9.getNamedSchema("{\"type\":\"record\",\"fields\":[]}");
    org.apache.avro.Schema schema32 = parseContext9.getNamedSchema("{\"type\":\"record\",\"fields\":[]}");
    parseContext9.rollback();
    java.util.List list34 = parseContext9.resolveAllSchemas();
    org.apache.avro.Schema schema35 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) list34);
    org.apache.avro.Schema schema36 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) list34);
    org.apache.avro.Schema schema37 = org.apache.avro.Schema.createRecord("record",
        "{\n  \"type\" : \"record\",\n  \"fields\" : [ ]\n}", "long", false,
        (java.util.List<org.apache.avro.Schema.Field>) list34);
    org.apache.avro.Schema schema38 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) list34);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema39 = org.apache.avro.Schema.createRecord(
          "{\"type\":\"array\",\"items\":{\"type\":\"fixed\",\"name\":\"fixed\",\"namespace\":\"{\\\"type\\\":\\\"record\\\",\\\"fields\\\":[]}\",\"doc\":\"\",\"size\":32}}",
          "{\"type\":\"record\",\"fields\":[],\"aliases\":[\"record\"]}",
          "{\n  \"type\" : \"record\",\n  \"name\" : \"array\",\n  \"namespace\" : \"hi!\",\n  \"doc\" : \"record\",\n  \"fields\" : [ ]\n}",
          false, (java.util.List<org.apache.avro.Schema.Field>) list34);
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"array\",\"items\":{\"type\":\"fixed\",\"name\":\"fixed\",\"namespace\":\"{\\\"type\\\":\\\"record\\\",\\\"fields\\\":[]}\",\"doc\":\"\",\"size\":32}}");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(nameValidator8);
    org.junit.Assert.assertNotNull(fieldArray10);
    org.junit.Assert.assertArrayEquals(fieldArray10, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    org.junit.Assert.assertNotNull(schema13);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    org.junit.Assert.assertNotNull(strSet15);
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str16,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNotNull(fieldArray17);
    org.junit.Assert.assertArrayEquals(fieldArray17, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    org.junit.Assert.assertNotNull(schema20);
    org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    org.junit.Assert.assertNotNull(strSet22);
    org.junit.Assert.assertEquals("'" + str23 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str23,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNull(field25);
    org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    org.junit.Assert.assertNotNull(schema27);
    org.junit.Assert.assertNotNull(schema28);
    org.junit.Assert.assertNull(schema30);
    org.junit.Assert.assertNull(schema32);
    org.junit.Assert.assertNotNull(list34);
    org.junit.Assert.assertNotNull(schema35);
    org.junit.Assert.assertNotNull(schema36);
    org.junit.Assert.assertNotNull(schema37);
    org.junit.Assert.assertNotNull(schema38);
  }

  @Test
  public void test102() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test102");
    org.apache.avro.NameValidator nameValidator0 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.Schema.Parser parser1 = new org.apache.avro.Schema.Parser(nameValidator0);
    org.apache.avro.Schema.setNameValidator(nameValidator0);
    org.apache.avro.ParseContext parseContext3 = new org.apache.avro.ParseContext(nameValidator0);
    org.apache.avro.Schema.SeenPair seenPair5 = new org.apache.avro.Schema.SeenPair((Object) nameValidator0,
        (Object) "fixed");
    org.junit.Assert.assertNotNull(nameValidator0);
  }

  @Test
  public void test103() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test103");
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
    org.apache.avro.Schema schema23 = parseContext1.find("long type:RECORD pos:-1", "record");
    org.apache.avro.Schema schema26 = parseContext1.find("fixed", "hi!");
    org.apache.avro.Schema.Field[] fieldArray28 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList29 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean30 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList29,
        fieldArray28);
    org.apache.avro.Schema schema31 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList29);
    boolean boolean32 = schema31.isNullable();
    java.util.Set<String> strSet33 = schema31.getAliases();
    org.apache.avro.Schema.Field field35 = new org.apache.avro.Schema.Field("long", schema31, "long");
    String str36 = field35.toString();
    org.apache.avro.Schema schema37 = field35.schema();
    org.apache.avro.Schema schema38 = org.apache.avro.Schema.createArray(schema37);
    org.apache.avro.Schema.Field[] fieldArray39 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList40 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean41 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList40,
        fieldArray39);
    org.apache.avro.Schema schema42 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList40);
    boolean boolean44 = schema42.equals((Object) 1.0f);
    boolean boolean45 = schema38.equals((Object) schema42);
    schema38.addProp("", "record");
    org.apache.avro.SchemaParser.ParseResult parseResult49 = parseContext1.commit(schema38);
    org.apache.avro.Schema schema52 = parseContext1.find("bytes", "fixed");
    org.apache.avro.Schema.Field[] fieldArray53 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList54 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean55 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList54,
        fieldArray53);
    org.apache.avro.Schema schema56 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList54);
    boolean boolean57 = schema56.isNullable();
    java.util.Set<String> strSet58 = schema56.getAliases();
    Object obj60 = schema56.getObjectProp("hi!");
    String str62 = schema56.toString(false);
    String str64 = schema56.toString(false);
    org.apache.avro.Schema.Field[] fieldArray65 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList66 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean67 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList66,
        fieldArray65);
    org.apache.avro.Schema schema68 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList66);
    schema56.addAllProps((org.apache.avro.JsonProperties) schema68);
    org.apache.avro.Schema schema70 = parseContext1.resolve(schema68);
    org.apache.avro.Schema.Parser parser72 = new org.apache.avro.Schema.Parser();
    java.util.Map<String, org.apache.avro.Schema> strMap73 = parser72.getTypes();
    org.apache.avro.Schema.Parser parser74 = new org.apache.avro.Schema.Parser();
    java.util.Map<String, org.apache.avro.Schema> strMap75 = parser74.getTypes();
    org.apache.avro.Schema.Parser parser76 = parser72.addTypes(strMap75);
    java.util.Map<String, org.apache.avro.Schema> strMap77 = parser72.getTypes();
    schema70.addProp("boolean", (Object) strMap77);
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
    org.junit.Assert.assertNotNull(schema23);
    org.junit.Assert.assertNotNull(schema26);
    org.junit.Assert.assertNotNull(fieldArray28);
    org.junit.Assert.assertArrayEquals(fieldArray28, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    org.junit.Assert.assertNotNull(schema31);
    org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    org.junit.Assert.assertNotNull(strSet33);
    org.junit.Assert.assertEquals("'" + str36 + "' != '" + "long type:RECORD pos:-1" + "'", str36,
        "long type:RECORD pos:-1");
    org.junit.Assert.assertNotNull(schema37);
    org.junit.Assert.assertNotNull(schema38);
    org.junit.Assert.assertNotNull(fieldArray39);
    org.junit.Assert.assertArrayEquals(fieldArray39, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    org.junit.Assert.assertNotNull(schema42);
    org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    org.junit.Assert.assertNotNull(parseResult49);
    org.junit.Assert.assertNotNull(schema52);
    org.junit.Assert.assertNotNull(fieldArray53);
    org.junit.Assert.assertArrayEquals(fieldArray53, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    org.junit.Assert.assertNotNull(schema56);
    org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    org.junit.Assert.assertNotNull(strSet58);
    org.junit.Assert.assertNull(obj60);
    org.junit.Assert.assertEquals("'" + str62 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str62,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertEquals("'" + str64 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str64,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNotNull(fieldArray65);
    org.junit.Assert.assertArrayEquals(fieldArray65, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    org.junit.Assert.assertNotNull(schema68);
    org.junit.Assert.assertNotNull(schema70);
    org.junit.Assert.assertNotNull(strMap73);
    org.junit.Assert.assertNotNull(strMap75);
    org.junit.Assert.assertNotNull(parser76);
    org.junit.Assert.assertNotNull(strMap77);
  }

  @Test
  public void test104() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test104");
    org.apache.avro.Schema.Field[] fieldArray1 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList2 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList2,
        fieldArray1);
    org.apache.avro.Schema schema4 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList2);
    boolean boolean5 = schema4.isNullable();
    java.util.Set<String> strSet6 = schema4.getAliases();
    org.apache.avro.Schema.Field field8 = new org.apache.avro.Schema.Field("long", schema4, "long");
    String str9 = field8.toString();
    org.apache.avro.Schema schema10 = field8.schema();
    org.apache.avro.NameValidator nameValidator11 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext12 = new org.apache.avro.ParseContext(nameValidator11);
    org.apache.avro.Schema.Field[] fieldArray13 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList14 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList14,
        fieldArray13);
    org.apache.avro.Schema schema16 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList14);
    org.apache.avro.SchemaParser.ParseResult parseResult17 = parseContext12.commit(schema16);
    java.util.List list18 = parseContext12.resolveAllSchemas();
    org.apache.avro.Schema schema21 = parseContext12.find("fixed", "long type:RECORD pos:-1");
    org.apache.avro.Schema.SeenPair seenPair22 = new org.apache.avro.Schema.SeenPair((Object) field8,
        (Object) schema21);
    org.apache.avro.Schema.Field[] fieldArray24 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList25 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean26 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList25,
        fieldArray24);
    org.apache.avro.Schema schema27 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList25);
    boolean boolean28 = schema27.isNullable();
    java.util.Set<String> strSet29 = schema27.getAliases();
    org.apache.avro.Schema.Field field31 = new org.apache.avro.Schema.Field("long", schema27, "long");
    boolean boolean32 = field31.hasDefaultValue();
    String str33 = field31.name();
    boolean boolean34 = field31.hasDefaultValue();
    String str35 = field31.toString();
    boolean boolean36 = seenPair22.equals((Object) str35);
    org.junit.Assert.assertNotNull(fieldArray1);
    org.junit.Assert.assertArrayEquals(fieldArray1, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    org.junit.Assert.assertNotNull(schema4);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    org.junit.Assert.assertNotNull(strSet6);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "long type:RECORD pos:-1" + "'", str9,
        "long type:RECORD pos:-1");
    org.junit.Assert.assertNotNull(schema10);
    org.junit.Assert.assertNotNull(nameValidator11);
    org.junit.Assert.assertNotNull(fieldArray13);
    org.junit.Assert.assertArrayEquals(fieldArray13, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    org.junit.Assert.assertNotNull(schema16);
    org.junit.Assert.assertNotNull(parseResult17);
    org.junit.Assert.assertNotNull(list18);
    org.junit.Assert.assertNotNull(schema21);
    org.junit.Assert.assertNotNull(fieldArray24);
    org.junit.Assert.assertArrayEquals(fieldArray24, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    org.junit.Assert.assertNotNull(schema27);
    org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    org.junit.Assert.assertNotNull(strSet29);
    org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    org.junit.Assert.assertEquals("'" + str33 + "' != '" + "long" + "'", str33, "long");
    org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    org.junit.Assert.assertEquals("'" + str35 + "' != '" + "long type:RECORD pos:-1" + "'", str35,
        "long type:RECORD pos:-1");
    org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
  }

  @Test
  public void test105() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test105");
    org.apache.avro.Schema.Field[] fieldArray1 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList2 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList2,
        fieldArray1);
    org.apache.avro.Schema schema4 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList2);
    boolean boolean5 = schema4.isNullable();
    java.util.Set<String> strSet6 = schema4.getAliases();
    org.apache.avro.Schema.Field field8 = new org.apache.avro.Schema.Field("long", schema4, "long");
    org.apache.avro.Schema schema9 = field8.schema();
    boolean boolean11 = field8.propsContainsKey("long type:RECORD pos:-1");
    Object obj12 = field8.defaultVal();
    java.util.function.BiConsumer<String, Object> strBiConsumer13 = null;
    field8.forEachProperty(strBiConsumer13);
    boolean boolean15 = field8.hasDefaultValue();
    String str16 = field8.name();
    org.apache.avro.NameValidator nameValidator21 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext22 = new org.apache.avro.ParseContext(nameValidator21);
    org.apache.avro.Schema.Field[] fieldArray23 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList24 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean25 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList24,
        fieldArray23);
    org.apache.avro.Schema schema26 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList24);
    boolean boolean27 = schema26.isNullable();
    java.util.Set<String> strSet28 = schema26.getAliases();
    String str29 = schema26.toString();
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
    boolean boolean39 = schema33.hasProps();
    org.apache.avro.Schema schema40 = org.apache.avro.Schema.applyAliases(schema26, schema33);
    org.apache.avro.Schema schema41 = parseContext22.resolve(schema40);
    org.apache.avro.Schema schema43 = parseContext22.getNamedSchema("{\"type\":\"record\",\"fields\":[]}");
    org.apache.avro.Schema schema45 = parseContext22.getNamedSchema("{\"type\":\"record\",\"fields\":[]}");
    parseContext22.rollback();
    java.util.List list47 = parseContext22.resolveAllSchemas();
    org.apache.avro.Schema schema48 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) list47);
    org.apache.avro.Schema schema49 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) list47);
    org.apache.avro.Schema schema50 = org.apache.avro.Schema.createRecord("record",
        "{\n  \"type\" : \"record\",\n  \"fields\" : [ ]\n}", "long", false,
        (java.util.List<org.apache.avro.Schema.Field>) list47);
    org.apache.avro.Schema schema51 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) list47);
    boolean boolean52 = field8.equals((Object) schema51);
    org.junit.Assert.assertNotNull(fieldArray1);
    org.junit.Assert.assertArrayEquals(fieldArray1, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    org.junit.Assert.assertNotNull(schema4);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    org.junit.Assert.assertNotNull(strSet6);
    org.junit.Assert.assertNotNull(schema9);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    org.junit.Assert.assertNull(obj12);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "long" + "'", str16, "long");
    org.junit.Assert.assertNotNull(nameValidator21);
    org.junit.Assert.assertNotNull(fieldArray23);
    org.junit.Assert.assertArrayEquals(fieldArray23, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    org.junit.Assert.assertNotNull(schema26);
    org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    org.junit.Assert.assertNotNull(strSet28);
    org.junit.Assert.assertEquals("'" + str29 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str29,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNotNull(fieldArray30);
    org.junit.Assert.assertArrayEquals(fieldArray30, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    org.junit.Assert.assertNotNull(schema33);
    org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    org.junit.Assert.assertNotNull(strSet35);
    org.junit.Assert.assertEquals("'" + str36 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str36,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNull(field38);
    org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    org.junit.Assert.assertNotNull(schema40);
    org.junit.Assert.assertNotNull(schema41);
    org.junit.Assert.assertNull(schema43);
    org.junit.Assert.assertNull(schema45);
    org.junit.Assert.assertNotNull(list47);
    org.junit.Assert.assertNotNull(schema48);
    org.junit.Assert.assertNotNull(schema49);
    org.junit.Assert.assertNotNull(schema50);
    org.junit.Assert.assertNotNull(schema51);
    org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
  }

  @Test
  public void test106() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test106");
    org.apache.avro.NameValidator nameValidator4 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext5 = new org.apache.avro.ParseContext(nameValidator4);
    org.apache.avro.Schema.Field[] fieldArray6 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList7 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList7,
        fieldArray6);
    org.apache.avro.Schema schema9 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList7);
    org.apache.avro.SchemaParser.ParseResult parseResult10 = parseContext5.commit(schema9);
    org.apache.avro.Schema.Parser parser11 = new org.apache.avro.Schema.Parser(parseContext5);
    java.util.List list12 = parseContext5.resolveAllSchemas();
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema13 = org.apache.avro.Schema.createRecord(
          "{\"type\":\"array\",\"items\":{\"type\":\"record\",\"fields\":[]}}",
          "{\n  \"type\" : \"record\",\n  \"name\" : \"array\",\n  \"namespace\" : \"hi!\",\n  \"doc\" : \"record\",\n  \"fields\" : [ ]\n}",
          "record", true, (java.util.List<org.apache.avro.Schema.Field>) list12);
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"array\",\"items\":{\"type\":\"record\",\"fields\":[]}}");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(nameValidator4);
    org.junit.Assert.assertNotNull(fieldArray6);
    org.junit.Assert.assertArrayEquals(fieldArray6, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    org.junit.Assert.assertNotNull(schema9);
    org.junit.Assert.assertNotNull(parseResult10);
    org.junit.Assert.assertNotNull(list12);
  }

  @Test
  public void test107() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test107");
    org.apache.avro.NameValidator nameValidator0 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext1 = new org.apache.avro.ParseContext(nameValidator0);
    org.apache.avro.Schema.Field[] fieldArray2 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList3 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList3,
        fieldArray2);
    org.apache.avro.Schema schema5 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList3);
    org.apache.avro.SchemaParser.ParseResult parseResult6 = parseContext1.commit(schema5);
    org.apache.avro.Schema.Parser parser7 = new org.apache.avro.Schema.Parser(parseContext1);
    java.util.List list8 = parseContext1.resolveAllSchemas();
    org.apache.avro.Schema schema9 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) list8);
    org.junit.Assert.assertNotNull(nameValidator0);
    org.junit.Assert.assertNotNull(fieldArray2);
    org.junit.Assert.assertArrayEquals(fieldArray2, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertNotNull(parseResult6);
    org.junit.Assert.assertNotNull(list8);
    org.junit.Assert.assertNotNull(schema9);
  }

  @Test
  public void test108() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test108");
    org.apache.avro.NameValidator nameValidator4 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext5 = new org.apache.avro.ParseContext(nameValidator4);
    org.apache.avro.Schema.Field[] fieldArray6 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList7 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList7,
        fieldArray6);
    org.apache.avro.Schema schema9 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList7);
    boolean boolean10 = schema9.isNullable();
    java.util.Set<String> strSet11 = schema9.getAliases();
    String str12 = schema9.toString();
    org.apache.avro.Schema.Field[] fieldArray13 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList14 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList14,
        fieldArray13);
    org.apache.avro.Schema schema16 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList14);
    boolean boolean17 = schema16.isNullable();
    java.util.Set<String> strSet18 = schema16.getAliases();
    String str19 = schema16.toString();
    org.apache.avro.Schema.Field field21 = schema16.getField("long");
    boolean boolean22 = schema16.hasProps();
    org.apache.avro.Schema schema23 = org.apache.avro.Schema.applyAliases(schema9, schema16);
    org.apache.avro.Schema schema24 = parseContext5.resolve(schema23);
    org.apache.avro.Schema schema26 = parseContext5.getNamedSchema("{\"type\":\"record\",\"fields\":[]}");
    org.apache.avro.Schema schema28 = parseContext5.getNamedSchema("{\"type\":\"record\",\"fields\":[]}");
    parseContext5.rollback();
    java.util.List list30 = parseContext5.resolveAllSchemas();
    org.apache.avro.Schema schema31 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) list30);
    org.apache.avro.Schema schema32 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) list30);
    org.apache.avro.Schema schema33 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) list30);
    org.apache.avro.Schema schema34 = org.apache.avro.Schema.createRecord("float", "array",
        "{\n  \"type\" : \"record\",\n  \"fields\" : [ ]\n}", false,
        (java.util.List<org.apache.avro.Schema.Field>) list30);
    boolean boolean35 = schema34.hasProps();
    org.junit.Assert.assertNotNull(nameValidator4);
    org.junit.Assert.assertNotNull(fieldArray6);
    org.junit.Assert.assertArrayEquals(fieldArray6, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    org.junit.Assert.assertNotNull(schema9);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    org.junit.Assert.assertNotNull(strSet11);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str12,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNotNull(fieldArray13);
    org.junit.Assert.assertArrayEquals(fieldArray13, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    org.junit.Assert.assertNotNull(schema16);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    org.junit.Assert.assertNotNull(strSet18);
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str19,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNull(field21);
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    org.junit.Assert.assertNotNull(schema23);
    org.junit.Assert.assertNotNull(schema24);
    org.junit.Assert.assertNull(schema26);
    org.junit.Assert.assertNull(schema28);
    org.junit.Assert.assertNotNull(list30);
    org.junit.Assert.assertNotNull(schema31);
    org.junit.Assert.assertNotNull(schema32);
    org.junit.Assert.assertNotNull(schema33);
    org.junit.Assert.assertNotNull(schema34);
    org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
  }

  @Test
  public void test109() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test109");
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
    org.apache.avro.Schema schema23 = parseContext1.find("long type:RECORD pos:-1", "record");
    org.apache.avro.Schema schema26 = parseContext1.find("fixed", "hi!");
    java.util.Map map27 = parseContext1.typesByName();
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
    org.junit.Assert.assertNotNull(schema23);
    org.junit.Assert.assertNotNull(schema26);
    org.junit.Assert.assertNotNull(map27);
  }

  @Test
  public void test110() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test110");
    org.apache.avro.Schema.Field[] fieldArray1 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList2 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList2,
        fieldArray1);
    org.apache.avro.Schema schema4 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList2);
    boolean boolean5 = schema4.isNullable();
    java.util.Set<String> strSet6 = schema4.getAliases();
    org.apache.avro.Schema.Field field8 = new org.apache.avro.Schema.Field("long", schema4, "long");
    org.apache.avro.Schema schema9 = field8.schema();
    String str10 = field8.doc();
    int int11 = field8.pos();
    Object obj12 = field8.defaultVal();
    org.apache.avro.Schema.Field[] fieldArray13 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList14 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList14,
        fieldArray13);
    org.apache.avro.Schema schema16 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList14);
    boolean boolean17 = schema16.isNullable();
    org.apache.avro.Schema schema18 = org.apache.avro.Schema.createArray(schema16);
    boolean boolean19 = field8.equals((Object) schema16);
    org.apache.avro.Schema.Parser parser20 = new org.apache.avro.Schema.Parser();
    java.util.Map<String, org.apache.avro.Schema> strMap21 = parser20.getTypes();
    org.apache.avro.Schema.Parser parser22 = new org.apache.avro.Schema.Parser();
    java.util.Map<String, org.apache.avro.Schema> strMap23 = parser22.getTypes();
    org.apache.avro.Schema.Parser parser24 = parser20.addTypes(strMap23);
    boolean boolean25 = field8.equals((Object) parser24);
    org.apache.avro.NameValidator nameValidator26 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext27 = new org.apache.avro.ParseContext(nameValidator26);
    org.apache.avro.Schema.Field[] fieldArray28 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList29 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean30 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList29,
        fieldArray28);
    org.apache.avro.Schema schema31 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList29);
    org.apache.avro.SchemaParser.ParseResult parseResult32 = parseContext27.commit(schema31);
    org.apache.avro.Schema.Parser parser33 = new org.apache.avro.Schema.Parser(parseContext27);
    java.util.Map<String, org.apache.avro.Schema> strMap34 = parser33.getTypes();
    boolean boolean35 = field8.equals((Object) strMap34);
    org.junit.Assert.assertNotNull(fieldArray1);
    org.junit.Assert.assertArrayEquals(fieldArray1, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    org.junit.Assert.assertNotNull(schema4);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    org.junit.Assert.assertNotNull(strSet6);
    org.junit.Assert.assertNotNull(schema9);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "long" + "'", str10, "long");
    org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    org.junit.Assert.assertNull(obj12);
    org.junit.Assert.assertNotNull(fieldArray13);
    org.junit.Assert.assertArrayEquals(fieldArray13, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    org.junit.Assert.assertNotNull(schema16);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    org.junit.Assert.assertNotNull(schema18);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    org.junit.Assert.assertNotNull(strMap21);
    org.junit.Assert.assertNotNull(strMap23);
    org.junit.Assert.assertNotNull(parser24);
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    org.junit.Assert.assertNotNull(nameValidator26);
    org.junit.Assert.assertNotNull(fieldArray28);
    org.junit.Assert.assertArrayEquals(fieldArray28, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    org.junit.Assert.assertNotNull(schema31);
    org.junit.Assert.assertNotNull(parseResult32);
    org.junit.Assert.assertNotNull(strMap34);
    org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
  }

  @Test
  public void test111() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test111");
    org.apache.avro.NameValidator nameValidator0 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.Schema.Parser parser1 = new org.apache.avro.Schema.Parser(nameValidator0);
    org.apache.avro.Schema.setNameValidator(nameValidator0);
    org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser(nameValidator0);
    org.apache.avro.Schema.Parser parser4 = new org.apache.avro.Schema.Parser(nameValidator0);
    org.apache.avro.ParseContext parseContext5 = new org.apache.avro.ParseContext(nameValidator0);
    org.apache.avro.Schema.Parser parser6 = new org.apache.avro.Schema.Parser(nameValidator0);
    java.io.File file7 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema8 = parser6.parse(file7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    } catch (NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(nameValidator0);
  }

  @Test
  public void test112() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test112");
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
      java.util.List<org.apache.avro.Schema> schemaList21 = schema20.getTypes();
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
  }

  @Test
  public void test113() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test113");
    org.apache.avro.Schema.Field[] fieldArray1 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList2 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList2,
        fieldArray1);
    org.apache.avro.Schema schema4 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList2);
    boolean boolean5 = schema4.isNullable();
    java.util.Set<String> strSet6 = schema4.getAliases();
    org.apache.avro.Schema.Field field8 = new org.apache.avro.Schema.Field("long", schema4, "long");
    org.apache.avro.Schema schema9 = field8.schema();
    boolean boolean11 = field8.propsContainsKey("long type:RECORD pos:-1");
    Object obj12 = field8.defaultVal();
    java.util.function.BiConsumer<String, Object> strBiConsumer13 = null;
    field8.forEachProperty(strBiConsumer13);
    boolean boolean15 = field8.hasDefaultValue();
    org.apache.avro.NameValidator nameValidator16 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext17 = new org.apache.avro.ParseContext(nameValidator16);
    org.apache.avro.Schema.Field[] fieldArray18 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList19 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList19,
        fieldArray18);
    org.apache.avro.Schema schema21 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList19);
    org.apache.avro.SchemaParser.ParseResult parseResult22 = parseContext17.commit(schema21);
    java.util.List list23 = parseContext17.resolveAllSchemas();
    org.apache.avro.Schema schema26 = parseContext17.find("fixed", "hi!");
    org.apache.avro.NameValidator nameValidator31 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext32 = new org.apache.avro.ParseContext(nameValidator31);
    org.apache.avro.Schema.Field[] fieldArray33 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList34 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean35 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList34,
        fieldArray33);
    org.apache.avro.Schema schema36 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList34);
    boolean boolean37 = schema36.isNullable();
    java.util.Set<String> strSet38 = schema36.getAliases();
    String str39 = schema36.toString();
    org.apache.avro.Schema.Field[] fieldArray40 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList41 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean42 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList41,
        fieldArray40);
    org.apache.avro.Schema schema43 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList41);
    boolean boolean44 = schema43.isNullable();
    java.util.Set<String> strSet45 = schema43.getAliases();
    String str46 = schema43.toString();
    org.apache.avro.Schema.Field field48 = schema43.getField("long");
    boolean boolean49 = schema43.hasProps();
    org.apache.avro.Schema schema50 = org.apache.avro.Schema.applyAliases(schema36, schema43);
    org.apache.avro.Schema schema51 = parseContext32.resolve(schema50);
    org.apache.avro.Schema schema53 = parseContext32.getNamedSchema("{\"type\":\"record\",\"fields\":[]}");
    org.apache.avro.Schema schema55 = parseContext32.getNamedSchema("{\"type\":\"record\",\"fields\":[]}");
    parseContext32.rollback();
    java.util.List list57 = parseContext32.resolveAllSchemas();
    org.apache.avro.Schema schema58 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) list57);
    org.apache.avro.Schema schema59 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) list57);
    org.apache.avro.Schema schema60 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) list57);
    org.apache.avro.Schema schema61 = org.apache.avro.Schema.createRecord("float", "array",
        "{\n  \"type\" : \"record\",\n  \"fields\" : [ ]\n}", false,
        (java.util.List<org.apache.avro.Schema.Field>) list57);
    org.apache.avro.SchemaParser.ParseResult parseResult62 = parseContext17.commit(schema61);
    boolean boolean63 = field8.equals((Object) schema61);
    org.junit.Assert.assertNotNull(fieldArray1);
    org.junit.Assert.assertArrayEquals(fieldArray1, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    org.junit.Assert.assertNotNull(schema4);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    org.junit.Assert.assertNotNull(strSet6);
    org.junit.Assert.assertNotNull(schema9);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    org.junit.Assert.assertNull(obj12);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    org.junit.Assert.assertNotNull(nameValidator16);
    org.junit.Assert.assertNotNull(fieldArray18);
    org.junit.Assert.assertArrayEquals(fieldArray18, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    org.junit.Assert.assertNotNull(schema21);
    org.junit.Assert.assertNotNull(parseResult22);
    org.junit.Assert.assertNotNull(list23);
    org.junit.Assert.assertNotNull(schema26);
    org.junit.Assert.assertNotNull(nameValidator31);
    org.junit.Assert.assertNotNull(fieldArray33);
    org.junit.Assert.assertArrayEquals(fieldArray33, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    org.junit.Assert.assertNotNull(schema36);
    org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    org.junit.Assert.assertNotNull(strSet38);
    org.junit.Assert.assertEquals("'" + str39 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str39,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNotNull(fieldArray40);
    org.junit.Assert.assertArrayEquals(fieldArray40, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    org.junit.Assert.assertNotNull(schema43);
    org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    org.junit.Assert.assertNotNull(strSet45);
    org.junit.Assert.assertEquals("'" + str46 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str46,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNull(field48);
    org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    org.junit.Assert.assertNotNull(schema50);
    org.junit.Assert.assertNotNull(schema51);
    org.junit.Assert.assertNull(schema53);
    org.junit.Assert.assertNull(schema55);
    org.junit.Assert.assertNotNull(list57);
    org.junit.Assert.assertNotNull(schema58);
    org.junit.Assert.assertNotNull(schema59);
    org.junit.Assert.assertNotNull(schema60);
    org.junit.Assert.assertNotNull(schema61);
    org.junit.Assert.assertNotNull(parseResult62);
    org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
  }

  @Test
  public void test114() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test114");
    org.apache.avro.NameValidator nameValidator0 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.Schema.Parser parser1 = new org.apache.avro.Schema.Parser(nameValidator0);
    org.apache.avro.Schema.setNameValidator(nameValidator0);
    org.apache.avro.ParseContext parseContext3 = new org.apache.avro.ParseContext(nameValidator0);
    org.apache.avro.ParseContext parseContext4 = new org.apache.avro.ParseContext(nameValidator0);
    parseContext4.rollback();
    org.junit.Assert.assertNotNull(nameValidator0);
  }

  @Test
  public void test115() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test115");
    org.apache.avro.NameValidator nameValidator3 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext4 = new org.apache.avro.ParseContext(nameValidator3);
    org.apache.avro.Schema.Field[] fieldArray5 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList6 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList6,
        fieldArray5);
    org.apache.avro.Schema schema8 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList6);
    boolean boolean9 = schema8.isNullable();
    java.util.Set<String> strSet10 = schema8.getAliases();
    String str11 = schema8.toString();
    org.apache.avro.Schema.Field[] fieldArray12 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList13 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList13,
        fieldArray12);
    org.apache.avro.Schema schema15 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList13);
    boolean boolean16 = schema15.isNullable();
    java.util.Set<String> strSet17 = schema15.getAliases();
    String str18 = schema15.toString();
    org.apache.avro.Schema.Field field20 = schema15.getField("long");
    boolean boolean21 = schema15.hasProps();
    org.apache.avro.Schema schema22 = org.apache.avro.Schema.applyAliases(schema8, schema15);
    org.apache.avro.Schema schema23 = parseContext4.resolve(schema22);
    org.apache.avro.Schema schema25 = parseContext4.getNamedSchema("{\"type\":\"record\",\"fields\":[]}");
    org.apache.avro.Schema schema27 = parseContext4.getNamedSchema("{\"type\":\"record\",\"fields\":[]}");
    parseContext4.rollback();
    java.util.List list29 = parseContext4.resolveAllSchemas();
    org.apache.avro.Schema schema30 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) list29);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema31 = org.apache.avro.Schema.createEnum("long type:RECORD pos:-1", "bytes",
          "{\n  \"type\" : \"record\",\n  \"fields\" : [ ]\n}", (java.util.List<String>) list29);
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.SchemaParseException; message: Illegal character in: long type:RECORD pos:-1");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(nameValidator3);
    org.junit.Assert.assertNotNull(fieldArray5);
    org.junit.Assert.assertArrayEquals(fieldArray5, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertNotNull(schema8);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    org.junit.Assert.assertNotNull(strSet10);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str11,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNotNull(fieldArray12);
    org.junit.Assert.assertArrayEquals(fieldArray12, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    org.junit.Assert.assertNotNull(schema15);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    org.junit.Assert.assertNotNull(strSet17);
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str18,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNull(field20);
    org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    org.junit.Assert.assertNotNull(schema22);
    org.junit.Assert.assertNotNull(schema23);
    org.junit.Assert.assertNull(schema25);
    org.junit.Assert.assertNull(schema27);
    org.junit.Assert.assertNotNull(list29);
    org.junit.Assert.assertNotNull(schema30);
  }

  @Test
  public void test116() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test116");
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
    parseContext1.rollback();
    java.util.List list26 = parseContext1.resolveAllSchemas();
    java.util.Map map27 = parseContext1.typesByName();
    org.apache.avro.Schema schema30 = parseContext1.find("long", "record");
    boolean boolean32 = parseContext1.contains("bytes");
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
    org.junit.Assert.assertNotNull(list26);
    org.junit.Assert.assertNotNull(map27);
    org.junit.Assert.assertNotNull(schema30);
    org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
  }

  @Test
  public void test117() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test117");
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
    org.apache.avro.Schema.Field[] fieldArray23 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList24 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean25 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList24,
        fieldArray23);
    org.apache.avro.Schema schema26 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList24);
    String str27 = schema26.getName();
    org.apache.avro.LogicalType logicalType28 = schema26.getLogicalType();
    org.apache.avro.SchemaParser.ParseResult parseResult29 = parseContext1.commit(schema26);
    String str30 = schema26.getDoc();
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
    org.junit.Assert.assertNotNull(fieldArray23);
    org.junit.Assert.assertArrayEquals(fieldArray23, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    org.junit.Assert.assertNotNull(schema26);
    org.junit.Assert.assertNull(str27);
    org.junit.Assert.assertNull(logicalType28);
    org.junit.Assert.assertNotNull(parseResult29);
    org.junit.Assert.assertNull(str30);
  }

  @Test
  public void test118() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test118");
    org.apache.avro.NameValidator nameValidator0 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext1 = new org.apache.avro.ParseContext(nameValidator0);
    java.util.List list2 = parseContext1.resolveAllSchemas();
    java.util.Map map3 = parseContext1.typesByName();
    org.junit.Assert.assertNotNull(nameValidator0);
    org.junit.Assert.assertNotNull(list2);
    org.junit.Assert.assertNotNull(map3);
  }

  @Test
  public void test119() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test119");
    org.apache.avro.ParseContext parseContext0 = new org.apache.avro.ParseContext();
    boolean boolean1 = parseContext0.hasNewSchemas();
    boolean boolean2 = parseContext0.hasNewSchemas();
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
  }

  @Test
  public void test120() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test120");
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
    String str18 = schema3.getNamespace();
    org.apache.avro.NameValidator nameValidator20 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.Schema.Parser parser21 = new org.apache.avro.Schema.Parser(nameValidator20);
    org.apache.avro.Schema.setNameValidator(nameValidator20);
    org.apache.avro.Schema.Parser parser23 = new org.apache.avro.Schema.Parser(nameValidator20);
    org.apache.avro.Schema.Parser parser24 = new org.apache.avro.Schema.Parser(nameValidator20);
    org.apache.avro.ParseContext parseContext25 = new org.apache.avro.ParseContext(nameValidator20);
    org.apache.avro.Schema schema30 = org.apache.avro.Schema.createFixed("fixed", "",
        "{\"type\":\"record\",\"fields\":[]}", (int) ' ');
    org.apache.avro.SchemaParser.ParseResult parseResult31 = parseContext25.commit(schema30);
    parseContext25.rollback();
    Object obj33 = schema3.getObjectProp("{\n  \"type\" : \"record\",\n  \"fields\" : [ ]\n}.float",
        (Object) parseContext25);
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
    org.junit.Assert.assertNull(str18);
    org.junit.Assert.assertNotNull(nameValidator20);
    org.junit.Assert.assertNotNull(schema30);
    org.junit.Assert.assertNotNull(parseResult31);
    org.junit.Assert.assertNotNull(obj33);
  }

  @Test
  public void test121() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test121");
    org.apache.avro.NameValidator nameValidator7 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext8 = new org.apache.avro.ParseContext(nameValidator7);
    org.apache.avro.Schema.Field[] fieldArray9 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList10 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList10,
        fieldArray9);
    org.apache.avro.Schema schema12 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList10);
    boolean boolean13 = schema12.isNullable();
    java.util.Set<String> strSet14 = schema12.getAliases();
    String str15 = schema12.toString();
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
    boolean boolean25 = schema19.hasProps();
    org.apache.avro.Schema schema26 = org.apache.avro.Schema.applyAliases(schema12, schema19);
    org.apache.avro.Schema schema27 = parseContext8.resolve(schema26);
    org.apache.avro.Schema schema29 = parseContext8.getNamedSchema("{\"type\":\"record\",\"fields\":[]}");
    org.apache.avro.Schema schema31 = parseContext8.getNamedSchema("{\"type\":\"record\",\"fields\":[]}");
    parseContext8.rollback();
    java.util.List list33 = parseContext8.resolveAllSchemas();
    org.apache.avro.Schema schema34 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) list33);
    org.apache.avro.Schema schema35 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) list33);
    org.apache.avro.Schema schema36 = org.apache.avro.Schema.createRecord("record",
        "{\n  \"type\" : \"record\",\n  \"fields\" : [ ]\n}", "long", false,
        (java.util.List<org.apache.avro.Schema.Field>) list33);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema38 = org.apache.avro.Schema.createEnum(
          "{\n  \"type\" : \"record\",\n  \"fields\" : [ ]\n}", "double", "", (java.util.List<String>) list33,
          "{\"type\":\"record\",\"fields\":[],\"aliases\":[\"long type:RECORD pos:-1.record\"]}");
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {?  \"type\" : \"record\",?  \"fields\" : [ ]?}");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(nameValidator7);
    org.junit.Assert.assertNotNull(fieldArray9);
    org.junit.Assert.assertArrayEquals(fieldArray9, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    org.junit.Assert.assertNotNull(schema12);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    org.junit.Assert.assertNotNull(strSet14);
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str15,
        "{\"type\":\"record\",\"fields\":[]}");
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
    org.junit.Assert.assertNotNull(schema26);
    org.junit.Assert.assertNotNull(schema27);
    org.junit.Assert.assertNull(schema29);
    org.junit.Assert.assertNull(schema31);
    org.junit.Assert.assertNotNull(list33);
    org.junit.Assert.assertNotNull(schema34);
    org.junit.Assert.assertNotNull(schema35);
    org.junit.Assert.assertNotNull(schema36);
  }

  @Test
  public void test122() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test122");
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
    org.apache.avro.Schema.Field[] fieldArray23 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList24 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean25 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList24,
        fieldArray23);
    org.apache.avro.Schema schema26 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList24);
    String str27 = schema26.getName();
    org.apache.avro.LogicalType logicalType28 = schema26.getLogicalType();
    org.apache.avro.SchemaParser.ParseResult parseResult29 = parseContext1.commit(schema26);
    parseContext1.rollback();
    org.apache.avro.Schema.Parser parser31 = new org.apache.avro.Schema.Parser(parseContext1);
    org.apache.avro.Schema schema33 = parseContext1
        .getNamedSchema("{\"type\":\"array\",\"items\":{\"type\":\"record\",\"fields\":[]}}");
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
    org.junit.Assert.assertNotNull(fieldArray23);
    org.junit.Assert.assertArrayEquals(fieldArray23, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    org.junit.Assert.assertNotNull(schema26);
    org.junit.Assert.assertNull(str27);
    org.junit.Assert.assertNull(logicalType28);
    org.junit.Assert.assertNotNull(parseResult29);
    org.junit.Assert.assertNull(schema33);
  }

  @Test
  public void test123() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test123");
    org.apache.avro.NameValidator nameValidator7 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext8 = new org.apache.avro.ParseContext(nameValidator7);
    org.apache.avro.Schema.Field[] fieldArray9 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList10 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList10,
        fieldArray9);
    org.apache.avro.Schema schema12 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList10);
    boolean boolean13 = schema12.isNullable();
    java.util.Set<String> strSet14 = schema12.getAliases();
    String str15 = schema12.toString();
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
    boolean boolean25 = schema19.hasProps();
    org.apache.avro.Schema schema26 = org.apache.avro.Schema.applyAliases(schema12, schema19);
    org.apache.avro.Schema schema27 = parseContext8.resolve(schema26);
    org.apache.avro.Schema schema29 = parseContext8.getNamedSchema("{\"type\":\"record\",\"fields\":[]}");
    org.apache.avro.Schema schema31 = parseContext8.getNamedSchema("{\"type\":\"record\",\"fields\":[]}");
    parseContext8.rollback();
    java.util.List list33 = parseContext8.resolveAllSchemas();
    org.apache.avro.Schema schema34 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) list33);
    org.apache.avro.Schema schema35 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) list33);
    org.apache.avro.Schema schema36 = org.apache.avro.Schema.createRecord("record",
        "{\n  \"type\" : \"record\",\n  \"fields\" : [ ]\n}", "long", false,
        (java.util.List<org.apache.avro.Schema.Field>) list33);
    org.apache.avro.Schema schema37 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) list33);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema38 = org.apache.avro.Schema.createEnum("long type:RECORD pos:-1",
          "{\n  \"type\" : \"record\",\n  \"fields\" : [ ]\n}", "boolean", (java.util.List<String>) list33);
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.SchemaParseException; message: Illegal character in: long type:RECORD pos:-1");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(nameValidator7);
    org.junit.Assert.assertNotNull(fieldArray9);
    org.junit.Assert.assertArrayEquals(fieldArray9, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    org.junit.Assert.assertNotNull(schema12);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    org.junit.Assert.assertNotNull(strSet14);
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str15,
        "{\"type\":\"record\",\"fields\":[]}");
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
    org.junit.Assert.assertNotNull(schema26);
    org.junit.Assert.assertNotNull(schema27);
    org.junit.Assert.assertNull(schema29);
    org.junit.Assert.assertNull(schema31);
    org.junit.Assert.assertNotNull(list33);
    org.junit.Assert.assertNotNull(schema34);
    org.junit.Assert.assertNotNull(schema35);
    org.junit.Assert.assertNotNull(schema36);
    org.junit.Assert.assertNotNull(schema37);
  }

  @Test
  public void test124() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test124");
    org.apache.avro.NameValidator nameValidator4 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext5 = new org.apache.avro.ParseContext(nameValidator4);
    org.apache.avro.Schema.Field[] fieldArray6 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList7 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList7,
        fieldArray6);
    org.apache.avro.Schema schema9 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList7);
    boolean boolean10 = schema9.isNullable();
    java.util.Set<String> strSet11 = schema9.getAliases();
    String str12 = schema9.toString();
    org.apache.avro.Schema.Field[] fieldArray13 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList14 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList14,
        fieldArray13);
    org.apache.avro.Schema schema16 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList14);
    boolean boolean17 = schema16.isNullable();
    java.util.Set<String> strSet18 = schema16.getAliases();
    String str19 = schema16.toString();
    org.apache.avro.Schema.Field field21 = schema16.getField("long");
    boolean boolean22 = schema16.hasProps();
    org.apache.avro.Schema schema23 = org.apache.avro.Schema.applyAliases(schema9, schema16);
    org.apache.avro.Schema schema24 = parseContext5.resolve(schema23);
    org.apache.avro.Schema schema26 = parseContext5.getNamedSchema("{\"type\":\"record\",\"fields\":[]}");
    org.apache.avro.Schema schema28 = parseContext5.getNamedSchema("{\"type\":\"record\",\"fields\":[]}");
    parseContext5.rollback();
    java.util.List list30 = parseContext5.resolveAllSchemas();
    org.apache.avro.Schema schema31 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) list30);
    org.apache.avro.Schema schema32 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) list30);
    org.apache.avro.Schema schema33 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) list30);
    org.apache.avro.Schema schema34 = org.apache.avro.Schema.createRecord("float", "array",
        "{\n  \"type\" : \"record\",\n  \"fields\" : [ ]\n}", false,
        (java.util.List<org.apache.avro.Schema.Field>) list30);
    org.apache.avro.LogicalType logicalType35 = schema34.getLogicalType();
    org.junit.Assert.assertNotNull(nameValidator4);
    org.junit.Assert.assertNotNull(fieldArray6);
    org.junit.Assert.assertArrayEquals(fieldArray6, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    org.junit.Assert.assertNotNull(schema9);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    org.junit.Assert.assertNotNull(strSet11);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str12,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNotNull(fieldArray13);
    org.junit.Assert.assertArrayEquals(fieldArray13, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    org.junit.Assert.assertNotNull(schema16);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    org.junit.Assert.assertNotNull(strSet18);
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str19,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNull(field21);
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    org.junit.Assert.assertNotNull(schema23);
    org.junit.Assert.assertNotNull(schema24);
    org.junit.Assert.assertNull(schema26);
    org.junit.Assert.assertNull(schema28);
    org.junit.Assert.assertNotNull(list30);
    org.junit.Assert.assertNotNull(schema31);
    org.junit.Assert.assertNotNull(schema32);
    org.junit.Assert.assertNotNull(schema33);
    org.junit.Assert.assertNotNull(schema34);
    org.junit.Assert.assertNull(logicalType35);
  }

  @Test
  public void test125() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test125");
    org.apache.avro.Schema.Field[] fieldArray0 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList1 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList1,
        fieldArray0);
    org.apache.avro.Schema schema3 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
    boolean boolean4 = schema3.isNullable();
    java.util.Set<String> strSet5 = schema3.getAliases();
    Object obj7 = schema3.getObjectProp("hi!");
    String str9 = schema3.toString(false);
    String str11 = schema3.toString(false);
    org.apache.avro.NameValidator nameValidator13 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext14 = new org.apache.avro.ParseContext(nameValidator13);
    org.apache.avro.Schema.Field[] fieldArray15 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList16 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList16,
        fieldArray15);
    org.apache.avro.Schema schema18 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList16);
    boolean boolean19 = schema18.isNullable();
    java.util.Set<String> strSet20 = schema18.getAliases();
    String str21 = schema18.toString();
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
    boolean boolean31 = schema25.hasProps();
    org.apache.avro.Schema schema32 = org.apache.avro.Schema.applyAliases(schema18, schema25);
    org.apache.avro.Schema schema33 = parseContext14.resolve(schema32);
    org.apache.avro.Schema schema35 = parseContext14.getNamedSchema("{\"type\":\"record\",\"fields\":[]}");
    org.apache.avro.Schema schema37 = parseContext14.getNamedSchema("{\"type\":\"record\",\"fields\":[]}");
    parseContext14.rollback();
    java.util.List list39 = parseContext14.resolveAllSchemas();
    org.apache.avro.Schema schema40 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) list39);
    org.apache.avro.Schema schema41 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) list39);
    schema3.addProp("hi!", (Object) list39);
    org.apache.avro.Schema schema43 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) list39);
    org.junit.Assert.assertNotNull(fieldArray0);
    org.junit.Assert.assertArrayEquals(fieldArray0, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertNotNull(schema3);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    org.junit.Assert.assertNotNull(strSet5);
    org.junit.Assert.assertNull(obj7);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str9,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str11,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNotNull(nameValidator13);
    org.junit.Assert.assertNotNull(fieldArray15);
    org.junit.Assert.assertArrayEquals(fieldArray15, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    org.junit.Assert.assertNotNull(schema18);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    org.junit.Assert.assertNotNull(strSet20);
    org.junit.Assert.assertEquals("'" + str21 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str21,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNotNull(fieldArray22);
    org.junit.Assert.assertArrayEquals(fieldArray22, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    org.junit.Assert.assertNotNull(schema25);
    org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    org.junit.Assert.assertNotNull(strSet27);
    org.junit.Assert.assertEquals("'" + str28 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str28,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNull(field30);
    org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    org.junit.Assert.assertNotNull(schema32);
    org.junit.Assert.assertNotNull(schema33);
    org.junit.Assert.assertNull(schema35);
    org.junit.Assert.assertNull(schema37);
    org.junit.Assert.assertNotNull(list39);
    org.junit.Assert.assertNotNull(schema40);
    org.junit.Assert.assertNotNull(schema41);
    org.junit.Assert.assertNotNull(schema43);
  }

  @Test
  public void test126() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test126");
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
    parseContext1.commit();
    boolean boolean27 = parseContext1.contains("double");
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
    org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
  }

  @Test
  public void test127() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test127");
    org.apache.avro.NameValidator nameValidator0 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext1 = new org.apache.avro.ParseContext(nameValidator0);
    java.util.List list2 = parseContext1.resolveAllSchemas();
    org.apache.avro.Schema schema3 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) list2);
    String str4 = schema3.getName();
    org.junit.Assert.assertNotNull(nameValidator0);
    org.junit.Assert.assertNotNull(list2);
    org.junit.Assert.assertNotNull(schema3);
    org.junit.Assert.assertNull(str4);
  }

  @Test
  public void test128() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test128");
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
    org.apache.avro.Schema.Field[] fieldArray23 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList24 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean25 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList24,
        fieldArray23);
    org.apache.avro.Schema schema26 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList24);
    boolean boolean27 = schema26.isNullable();
    java.util.Set<String> strSet28 = schema26.getAliases();
    org.apache.avro.Schema.Field field30 = new org.apache.avro.Schema.Field("long", schema26, "long");
    boolean boolean31 = field30.hasDefaultValue();
    int int32 = field30.pos();
    String str33 = field30.doc();
    org.apache.avro.Schema.Field[] fieldArray34 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList35 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean36 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList35,
        fieldArray34);
    org.apache.avro.Schema schema37 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList35);
    boolean boolean38 = schema37.isNullable();
    java.util.Set<String> strSet39 = schema37.getAliases();
    String str40 = schema37.toString();
    org.apache.avro.Schema.Field field42 = schema37.getField("long");
    java.util.List<org.apache.avro.Schema.Field> fieldList43 = schema37.getFields();
    schema37.addAlias("long");
    boolean boolean47 = schema37.propsContainsKey("record");
    org.apache.avro.Schema.Field field48 = new org.apache.avro.Schema.Field(field30, schema37);
    Object obj49 = schema19.getObjectProp("float", (Object) schema37);
    org.apache.avro.Schema schema50 = org.apache.avro.Schema.createArray(schema19);
    // The following exception was thrown during execution in test generation
    try {
      schema19.addAlias("boolean type:RECORD pos:-1");
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.SchemaParseException; message: Illegal character in: boolean type:RECORD pos:-1");
    } catch (org.apache.avro.SchemaParseException e) {
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
    org.junit.Assert.assertNotNull(fieldArray23);
    org.junit.Assert.assertArrayEquals(fieldArray23, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    org.junit.Assert.assertNotNull(schema26);
    org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    org.junit.Assert.assertNotNull(strSet28);
    org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    org.junit.Assert.assertEquals("'" + str33 + "' != '" + "long" + "'", str33, "long");
    org.junit.Assert.assertNotNull(fieldArray34);
    org.junit.Assert.assertArrayEquals(fieldArray34, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    org.junit.Assert.assertNotNull(schema37);
    org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    org.junit.Assert.assertNotNull(strSet39);
    org.junit.Assert.assertEquals("'" + str40 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str40,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNull(field42);
    org.junit.Assert.assertNotNull(fieldList43);
    org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    org.junit.Assert.assertNotNull(obj49);
    org.junit.Assert.assertEquals(obj49.toString(), "{\"type\":\"record\",\"fields\":[],\"aliases\":[\"long\"]}");
    org.junit.Assert.assertEquals(String.valueOf(obj49), "{\"type\":\"record\",\"fields\":[],\"aliases\":[\"long\"]}");
    org.junit.Assert.assertEquals(java.util.Objects.toString(obj49),
        "{\"type\":\"record\",\"fields\":[],\"aliases\":[\"long\"]}");
    org.junit.Assert.assertNotNull(schema50);
  }

  @Test
  public void test129() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test129");
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
    org.apache.avro.Schema schema23 = parseContext1.find("long type:RECORD pos:-1", "record");
    org.apache.avro.Schema schema25 = parseContext1.getNamedSchema("long");
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
    org.junit.Assert.assertNotNull(schema23);
    org.junit.Assert.assertNull(schema25);
  }

  @Test
  public void test130() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test130");
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
    String str14 = schema3.toString(true);
    org.apache.avro.Schema.Type type15 = schema3.getType();
    org.apache.avro.NameValidator nameValidator17 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext18 = new org.apache.avro.ParseContext(nameValidator17);
    org.apache.avro.Schema.Field[] fieldArray19 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList20 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean21 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList20,
        fieldArray19);
    org.apache.avro.Schema schema22 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList20);
    org.apache.avro.SchemaParser.ParseResult parseResult23 = parseContext18.commit(schema22);
    java.util.List list24 = parseContext18.resolveAllSchemas();
    org.apache.avro.Schema schema25 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) list24);
    // The following exception was thrown during execution in test generation
    try {
      schema3.addProp("long", (Object) schema25);
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Unknown datum class: class org.apache.avro.Schema$UnionSchema");
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
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{\n  \"type\" : \"record\",\n  \"fields\" : [ ]\n}" + "'",
        str14, "{\n  \"type\" : \"record\",\n  \"fields\" : [ ]\n}");
    org.junit.Assert.assertTrue("'" + type15 + "' != '" + org.apache.avro.Schema.Type.RECORD + "'",
        type15.equals(org.apache.avro.Schema.Type.RECORD));
    org.junit.Assert.assertNotNull(nameValidator17);
    org.junit.Assert.assertNotNull(fieldArray19);
    org.junit.Assert.assertArrayEquals(fieldArray19, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    org.junit.Assert.assertNotNull(schema22);
    org.junit.Assert.assertNotNull(parseResult23);
    org.junit.Assert.assertNotNull(list24);
    org.junit.Assert.assertNotNull(schema25);
  }

  @Test
  public void test131() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test131");
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
    org.apache.avro.Schema schema23 = parseContext1.find("long type:RECORD pos:-1", "record");
    org.apache.avro.Schema schema26 = parseContext1.find("fixed", "hi!");
    org.apache.avro.Schema.Field[] fieldArray28 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList29 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean30 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList29,
        fieldArray28);
    org.apache.avro.Schema schema31 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList29);
    boolean boolean32 = schema31.isNullable();
    java.util.Set<String> strSet33 = schema31.getAliases();
    org.apache.avro.Schema.Field field35 = new org.apache.avro.Schema.Field("long", schema31, "long");
    String str36 = field35.toString();
    org.apache.avro.Schema schema37 = field35.schema();
    org.apache.avro.Schema schema38 = org.apache.avro.Schema.createArray(schema37);
    org.apache.avro.Schema.Field[] fieldArray39 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList40 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean41 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList40,
        fieldArray39);
    org.apache.avro.Schema schema42 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList40);
    boolean boolean44 = schema42.equals((Object) 1.0f);
    boolean boolean45 = schema38.equals((Object) schema42);
    schema38.addProp("", "record");
    org.apache.avro.SchemaParser.ParseResult parseResult49 = parseContext1.commit(schema38);
    org.apache.avro.Schema schema51 = parseContext1.getNamedSchema("boolean");
    boolean boolean53 = parseContext1.contains(
        "{\"type\":\"array\",\"items\":{\"type\":\"fixed\",\"name\":\"fixed\",\"namespace\":\"{\\\"type\\\":\\\"record\\\",\\\"fields\\\":[]}\",\"doc\":\"\",\"size\":32}}");
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
    org.junit.Assert.assertNotNull(schema23);
    org.junit.Assert.assertNotNull(schema26);
    org.junit.Assert.assertNotNull(fieldArray28);
    org.junit.Assert.assertArrayEquals(fieldArray28, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    org.junit.Assert.assertNotNull(schema31);
    org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    org.junit.Assert.assertNotNull(strSet33);
    org.junit.Assert.assertEquals("'" + str36 + "' != '" + "long type:RECORD pos:-1" + "'", str36,
        "long type:RECORD pos:-1");
    org.junit.Assert.assertNotNull(schema37);
    org.junit.Assert.assertNotNull(schema38);
    org.junit.Assert.assertNotNull(fieldArray39);
    org.junit.Assert.assertArrayEquals(fieldArray39, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    org.junit.Assert.assertNotNull(schema42);
    org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    org.junit.Assert.assertNotNull(parseResult49);
    org.junit.Assert.assertNull(schema51);
    org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
  }

  @Test
  public void test132() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test132");
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
    org.apache.avro.NameValidator nameValidator32 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext33 = new org.apache.avro.ParseContext(nameValidator32);
    org.apache.avro.Schema.Field[] fieldArray34 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList35 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean36 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList35,
        fieldArray34);
    org.apache.avro.Schema schema37 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList35);
    org.apache.avro.SchemaParser.ParseResult parseResult38 = parseContext33.commit(schema37);
    java.util.List list39 = parseContext33.resolveAllSchemas();
    org.apache.avro.Schema schema40 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) list39);
    org.apache.avro.Schema schema41 = org.apache.avro.Schema.createRecord("boolean", "hi!",
        "{\"type\":\"record\",\"fields\":[]}", true, (java.util.List<org.apache.avro.Schema.Field>) list39);
    Object obj42 = schema24.getObjectProp("", (Object) list39);
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
    org.junit.Assert.assertNotNull(nameValidator32);
    org.junit.Assert.assertNotNull(fieldArray34);
    org.junit.Assert.assertArrayEquals(fieldArray34, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    org.junit.Assert.assertNotNull(schema37);
    org.junit.Assert.assertNotNull(parseResult38);
    org.junit.Assert.assertNotNull(list39);
    org.junit.Assert.assertNotNull(schema40);
    org.junit.Assert.assertNotNull(schema41);
    org.junit.Assert.assertNotNull(obj42);
    org.junit.Assert.assertEquals(obj42.toString(), "[]");
    org.junit.Assert.assertEquals(String.valueOf(obj42), "[]");
    org.junit.Assert.assertEquals(java.util.Objects.toString(obj42), "[]");
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
    boolean boolean4 = schema3.isNullable();
    boolean boolean5 = schema3.hasFields();
    org.apache.avro.Schema.Field[] fieldArray7 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList8 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean9 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList8,
        fieldArray7);
    org.apache.avro.Schema schema10 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList8);
    boolean boolean11 = schema10.isNullable();
    java.util.Set<String> strSet12 = schema10.getAliases();
    org.apache.avro.Schema.Field field14 = new org.apache.avro.Schema.Field("long", schema10, "long");
    org.apache.avro.Schema schema15 = field14.schema();
    String str16 = field14.doc();
    int int17 = field14.pos();
    org.apache.avro.Schema.Field[] fieldArray19 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList20 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean21 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList20,
        fieldArray19);
    org.apache.avro.Schema schema22 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList20);
    boolean boolean23 = schema22.isNullable();
    java.util.Set<String> strSet24 = schema22.getAliases();
    org.apache.avro.Schema.Field field26 = new org.apache.avro.Schema.Field("long", schema22, "long");
    int int27 = field26.pos();
    boolean boolean28 = field14.equals((Object) int27);
    boolean boolean29 = field14.hasDefaultValue();
    org.apache.avro.Schema.SeenPair seenPair30 = new org.apache.avro.Schema.SeenPair((Object) boolean5,
        (Object) boolean29);
    org.apache.avro.NameValidator nameValidator31 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.Schema.Parser parser32 = new org.apache.avro.Schema.Parser(nameValidator31);
    org.apache.avro.Schema.setNameValidator(nameValidator31);
    org.apache.avro.Schema.Parser parser34 = new org.apache.avro.Schema.Parser(nameValidator31);
    org.apache.avro.Schema.Parser parser35 = new org.apache.avro.Schema.Parser(nameValidator31);
    org.apache.avro.ParseContext parseContext36 = new org.apache.avro.ParseContext(nameValidator31);
    boolean boolean37 = seenPair30.equals((Object) parseContext36);
    org.junit.Assert.assertNotNull(fieldArray0);
    org.junit.Assert.assertArrayEquals(fieldArray0, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertNotNull(schema3);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    org.junit.Assert.assertNotNull(fieldArray7);
    org.junit.Assert.assertArrayEquals(fieldArray7, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    org.junit.Assert.assertNotNull(schema10);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    org.junit.Assert.assertNotNull(strSet12);
    org.junit.Assert.assertNotNull(schema15);
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "long" + "'", str16, "long");
    org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    org.junit.Assert.assertNotNull(fieldArray19);
    org.junit.Assert.assertArrayEquals(fieldArray19, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    org.junit.Assert.assertNotNull(schema22);
    org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    org.junit.Assert.assertNotNull(strSet24);
    org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    org.junit.Assert.assertNotNull(nameValidator31);
    org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
  }

  @Test
  public void test134() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test134");
    org.apache.avro.NameValidator nameValidator0 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.Schema.Parser parser1 = new org.apache.avro.Schema.Parser(nameValidator0);
    org.apache.avro.Schema.setNameValidator(nameValidator0);
    org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser(nameValidator0);
    org.apache.avro.ParseContext parseContext4 = new org.apache.avro.ParseContext(nameValidator0);
    org.apache.avro.Schema.Parser parser5 = new org.apache.avro.Schema.Parser(nameValidator0);
    org.apache.avro.ParseContext parseContext6 = new org.apache.avro.ParseContext(nameValidator0);
    java.util.Map map7 = parseContext6.typesByName();
    org.junit.Assert.assertNotNull(nameValidator0);
    org.junit.Assert.assertNotNull(map7);
  }

  @Test
  public void test135() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test135");
    org.apache.avro.NameValidator nameValidator3 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext4 = new org.apache.avro.ParseContext(nameValidator3);
    java.util.List list5 = parseContext4.resolveAllSchemas();
    org.apache.avro.Schema schema6 = org.apache.avro.Schema.createUnion((java.util.List<org.apache.avro.Schema>) list5);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema8 = org.apache.avro.Schema.createEnum(
          "{\n  \"type\" : \"record\",\n  \"fields\" : [ ]\n}", "boolean", "boolean type:RECORD pos:-1",
          (java.util.List<String>) list5, "long type:RECORD pos:-1");
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {?  \"type\" : \"record\",?  \"fields\" : [ ]?}");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(nameValidator3);
    org.junit.Assert.assertNotNull(list5);
    org.junit.Assert.assertNotNull(schema6);
  }

  @Test
  public void test136() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test136");
    org.apache.avro.NameValidator nameValidator0 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.Schema.Parser parser1 = new org.apache.avro.Schema.Parser(nameValidator0);
    org.apache.avro.Schema.setNameValidator(nameValidator0);
    org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser(nameValidator0);
    org.apache.avro.ParseContext parseContext4 = new org.apache.avro.ParseContext(nameValidator0);
    org.apache.avro.Schema.Parser parser5 = new org.apache.avro.Schema.Parser(nameValidator0);
    java.util.Map<String, org.apache.avro.Schema> strMap6 = parser5.getTypes();
    org.junit.Assert.assertNotNull(nameValidator0);
    org.junit.Assert.assertNotNull(strMap6);
  }

  @Test
  public void test137() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test137");
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
    parseContext1.rollback();
    java.util.List list26 = parseContext1.resolveAllSchemas();
    java.util.Map map27 = parseContext1.typesByName();
    org.apache.avro.Schema schema30 = parseContext1.find("long", "record");
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<String> strList31 = schema30.getEnumSymbols();
      org.junit.Assert
          .fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: \"long\"");
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
    org.junit.Assert.assertNull(schema22);
    org.junit.Assert.assertNull(schema24);
    org.junit.Assert.assertNotNull(list26);
    org.junit.Assert.assertNotNull(map27);
    org.junit.Assert.assertNotNull(schema30);
  }

  @Test
  public void test138() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test138");
    org.apache.avro.NameValidator nameValidator1 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext2 = new org.apache.avro.ParseContext(nameValidator1);
    org.apache.avro.Schema.Field[] fieldArray3 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList4 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList4,
        fieldArray3);
    org.apache.avro.Schema schema6 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList4);
    boolean boolean7 = schema6.isNullable();
    java.util.Set<String> strSet8 = schema6.getAliases();
    String str9 = schema6.toString();
    org.apache.avro.Schema.Field[] fieldArray10 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList11 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList11,
        fieldArray10);
    org.apache.avro.Schema schema13 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList11);
    boolean boolean14 = schema13.isNullable();
    java.util.Set<String> strSet15 = schema13.getAliases();
    String str16 = schema13.toString();
    org.apache.avro.Schema.Field field18 = schema13.getField("long");
    boolean boolean19 = schema13.hasProps();
    org.apache.avro.Schema schema20 = org.apache.avro.Schema.applyAliases(schema6, schema13);
    org.apache.avro.Schema schema21 = parseContext2.resolve(schema20);
    org.apache.avro.Schema schema24 = parseContext2.find("long type:RECORD pos:-1", "record");
    org.apache.avro.Schema schema27 = parseContext2.find("fixed", "hi!");
    org.apache.avro.Schema.Field[] fieldArray29 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList30 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean31 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList30,
        fieldArray29);
    org.apache.avro.Schema schema32 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList30);
    boolean boolean33 = schema32.isNullable();
    java.util.Set<String> strSet34 = schema32.getAliases();
    org.apache.avro.Schema.Field field36 = new org.apache.avro.Schema.Field("long", schema32, "long");
    String str37 = field36.toString();
    org.apache.avro.Schema schema38 = field36.schema();
    org.apache.avro.Schema schema39 = org.apache.avro.Schema.createArray(schema38);
    org.apache.avro.Schema.Field[] fieldArray40 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList41 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean42 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList41,
        fieldArray40);
    org.apache.avro.Schema schema43 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList41);
    boolean boolean45 = schema43.equals((Object) 1.0f);
    boolean boolean46 = schema39.equals((Object) schema43);
    schema39.addProp("", "record");
    org.apache.avro.SchemaParser.ParseResult parseResult50 = parseContext2.commit(schema39);
    org.apache.avro.Schema schema53 = parseContext2.find("bytes", "fixed");
    org.apache.avro.Schema.Field[] fieldArray54 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList55 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean56 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList55,
        fieldArray54);
    org.apache.avro.Schema schema57 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList55);
    boolean boolean58 = schema57.isNullable();
    java.util.Set<String> strSet59 = schema57.getAliases();
    Object obj61 = schema57.getObjectProp("hi!");
    String str63 = schema57.toString(false);
    String str65 = schema57.toString(false);
    org.apache.avro.Schema.Field[] fieldArray66 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList67 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean68 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList67,
        fieldArray66);
    org.apache.avro.Schema schema69 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList67);
    schema57.addAllProps((org.apache.avro.JsonProperties) schema69);
    org.apache.avro.Schema schema71 = parseContext2.resolve(schema69);
    org.apache.avro.Schema.Field field73 = new org.apache.avro.Schema.Field("long", schema71,
        "{\n  \"type\" : \"record\",\n  \"fields\" : [ ]\n}");
    org.junit.Assert.assertNotNull(nameValidator1);
    org.junit.Assert.assertNotNull(fieldArray3);
    org.junit.Assert.assertArrayEquals(fieldArray3, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    org.junit.Assert.assertNotNull(schema6);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertNotNull(strSet8);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str9,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNotNull(fieldArray10);
    org.junit.Assert.assertArrayEquals(fieldArray10, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    org.junit.Assert.assertNotNull(schema13);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    org.junit.Assert.assertNotNull(strSet15);
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str16,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNull(field18);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    org.junit.Assert.assertNotNull(schema20);
    org.junit.Assert.assertNotNull(schema21);
    org.junit.Assert.assertNotNull(schema24);
    org.junit.Assert.assertNotNull(schema27);
    org.junit.Assert.assertNotNull(fieldArray29);
    org.junit.Assert.assertArrayEquals(fieldArray29, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    org.junit.Assert.assertNotNull(schema32);
    org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    org.junit.Assert.assertNotNull(strSet34);
    org.junit.Assert.assertEquals("'" + str37 + "' != '" + "long type:RECORD pos:-1" + "'", str37,
        "long type:RECORD pos:-1");
    org.junit.Assert.assertNotNull(schema38);
    org.junit.Assert.assertNotNull(schema39);
    org.junit.Assert.assertNotNull(fieldArray40);
    org.junit.Assert.assertArrayEquals(fieldArray40, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    org.junit.Assert.assertNotNull(schema43);
    org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    org.junit.Assert.assertNotNull(parseResult50);
    org.junit.Assert.assertNotNull(schema53);
    org.junit.Assert.assertNotNull(fieldArray54);
    org.junit.Assert.assertArrayEquals(fieldArray54, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    org.junit.Assert.assertNotNull(schema57);
    org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    org.junit.Assert.assertNotNull(strSet59);
    org.junit.Assert.assertNull(obj61);
    org.junit.Assert.assertEquals("'" + str63 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str63,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertEquals("'" + str65 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str65,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNotNull(fieldArray66);
    org.junit.Assert.assertArrayEquals(fieldArray66, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    org.junit.Assert.assertNotNull(schema69);
    org.junit.Assert.assertNotNull(schema71);
  }

  @Test
  public void test139() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test139");
    org.apache.avro.Schema.Field[] fieldArray1 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList2 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList2,
        fieldArray1);
    org.apache.avro.Schema schema4 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList2);
    boolean boolean5 = schema4.isNullable();
    java.util.Set<String> strSet6 = schema4.getAliases();
    org.apache.avro.Schema.Field field8 = new org.apache.avro.Schema.Field("long", schema4, "long");
    org.apache.avro.Schema schema9 = field8.schema();
    String str10 = field8.doc();
    int int11 = field8.pos();
    String str12 = field8.doc();
    org.apache.avro.NameValidator nameValidator17 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext18 = new org.apache.avro.ParseContext(nameValidator17);
    org.apache.avro.Schema.Field[] fieldArray19 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList20 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean21 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList20,
        fieldArray19);
    org.apache.avro.Schema schema22 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList20);
    boolean boolean23 = schema22.isNullable();
    java.util.Set<String> strSet24 = schema22.getAliases();
    String str25 = schema22.toString();
    org.apache.avro.Schema.Field[] fieldArray26 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList27 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean28 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList27,
        fieldArray26);
    org.apache.avro.Schema schema29 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList27);
    boolean boolean30 = schema29.isNullable();
    java.util.Set<String> strSet31 = schema29.getAliases();
    String str32 = schema29.toString();
    org.apache.avro.Schema.Field field34 = schema29.getField("long");
    boolean boolean35 = schema29.hasProps();
    org.apache.avro.Schema schema36 = org.apache.avro.Schema.applyAliases(schema22, schema29);
    org.apache.avro.Schema schema37 = parseContext18.resolve(schema36);
    org.apache.avro.Schema schema39 = parseContext18.getNamedSchema("{\"type\":\"record\",\"fields\":[]}");
    org.apache.avro.Schema schema41 = parseContext18.getNamedSchema("{\"type\":\"record\",\"fields\":[]}");
    parseContext18.rollback();
    java.util.List list43 = parseContext18.resolveAllSchemas();
    org.apache.avro.Schema schema44 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) list43);
    org.apache.avro.Schema schema45 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) list43);
    org.apache.avro.Schema schema46 = org.apache.avro.Schema.createRecord("record",
        "{\n  \"type\" : \"record\",\n  \"fields\" : [ ]\n}", "long", false,
        (java.util.List<org.apache.avro.Schema.Field>) list43);
    org.apache.avro.Schema schema47 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) list43);
    boolean boolean48 = field8.equals((Object) schema47);
    org.junit.Assert.assertNotNull(fieldArray1);
    org.junit.Assert.assertArrayEquals(fieldArray1, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    org.junit.Assert.assertNotNull(schema4);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    org.junit.Assert.assertNotNull(strSet6);
    org.junit.Assert.assertNotNull(schema9);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "long" + "'", str10, "long");
    org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "long" + "'", str12, "long");
    org.junit.Assert.assertNotNull(nameValidator17);
    org.junit.Assert.assertNotNull(fieldArray19);
    org.junit.Assert.assertArrayEquals(fieldArray19, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    org.junit.Assert.assertNotNull(schema22);
    org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    org.junit.Assert.assertNotNull(strSet24);
    org.junit.Assert.assertEquals("'" + str25 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str25,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNotNull(fieldArray26);
    org.junit.Assert.assertArrayEquals(fieldArray26, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    org.junit.Assert.assertNotNull(schema29);
    org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    org.junit.Assert.assertNotNull(strSet31);
    org.junit.Assert.assertEquals("'" + str32 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str32,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNull(field34);
    org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    org.junit.Assert.assertNotNull(schema36);
    org.junit.Assert.assertNotNull(schema37);
    org.junit.Assert.assertNull(schema39);
    org.junit.Assert.assertNull(schema41);
    org.junit.Assert.assertNotNull(list43);
    org.junit.Assert.assertNotNull(schema44);
    org.junit.Assert.assertNotNull(schema45);
    org.junit.Assert.assertNotNull(schema46);
    org.junit.Assert.assertNotNull(schema47);
    org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
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
    com.fasterxml.jackson.databind.JsonNode jsonNode6 = null;
    boolean boolean7 = schema3.isValidDefault(jsonNode6);
    boolean boolean8 = schema3.isUnion();
    schema3.addProp("", (Object) (-1L));
    org.apache.avro.NameValidator nameValidator12 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext13 = new org.apache.avro.ParseContext(nameValidator12);
    org.apache.avro.Schema.Field[] fieldArray14 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList15 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList15,
        fieldArray14);
    org.apache.avro.Schema schema17 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList15);
    boolean boolean18 = schema17.isNullable();
    java.util.Set<String> strSet19 = schema17.getAliases();
    String str20 = schema17.toString();
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
    boolean boolean30 = schema24.hasProps();
    org.apache.avro.Schema schema31 = org.apache.avro.Schema.applyAliases(schema17, schema24);
    org.apache.avro.Schema schema32 = parseContext13.resolve(schema31);
    org.apache.avro.Schema schema34 = parseContext13.getNamedSchema("{\"type\":\"record\",\"fields\":[]}");
    org.apache.avro.Schema schema36 = parseContext13.getNamedSchema("{\"type\":\"record\",\"fields\":[]}");
    parseContext13.rollback();
    java.util.List list38 = parseContext13.resolveAllSchemas();
    org.apache.avro.Schema schema39 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) list38);
    org.apache.avro.Schema schema40 = org.apache.avro.Schema.applyAliases(schema3, schema39);
    org.apache.avro.Schema.Field[] fieldArray41 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList42 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean43 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList42,
        fieldArray41);
    org.apache.avro.Schema schema44 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList42);
    boolean boolean45 = schema44.isNullable();
    org.apache.avro.Schema schema46 = org.apache.avro.Schema.createArray(schema44);
    org.apache.avro.Schema schema47 = org.apache.avro.Schema.applyAliases(schema40, schema44);
    org.junit.Assert.assertNotNull(fieldArray0);
    org.junit.Assert.assertArrayEquals(fieldArray0, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertNotNull(schema3);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    org.junit.Assert.assertNotNull(strSet5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    org.junit.Assert.assertNotNull(nameValidator12);
    org.junit.Assert.assertNotNull(fieldArray14);
    org.junit.Assert.assertArrayEquals(fieldArray14, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    org.junit.Assert.assertNotNull(schema17);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    org.junit.Assert.assertNotNull(strSet19);
    org.junit.Assert.assertEquals("'" + str20 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str20,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNotNull(fieldArray21);
    org.junit.Assert.assertArrayEquals(fieldArray21, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    org.junit.Assert.assertNotNull(schema24);
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    org.junit.Assert.assertNotNull(strSet26);
    org.junit.Assert.assertEquals("'" + str27 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str27,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNull(field29);
    org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    org.junit.Assert.assertNotNull(schema31);
    org.junit.Assert.assertNotNull(schema32);
    org.junit.Assert.assertNull(schema34);
    org.junit.Assert.assertNull(schema36);
    org.junit.Assert.assertNotNull(list38);
    org.junit.Assert.assertNotNull(schema39);
    org.junit.Assert.assertNotNull(schema40);
    org.junit.Assert.assertNotNull(fieldArray41);
    org.junit.Assert.assertArrayEquals(fieldArray41, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    org.junit.Assert.assertNotNull(schema44);
    org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    org.junit.Assert.assertNotNull(schema46);
    org.junit.Assert.assertNotNull(schema47);
  }

  @Test
  public void test141() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test141");
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
    parseContext1.rollback();
    java.util.List list26 = parseContext1.resolveAllSchemas();
    java.util.Map map27 = parseContext1.typesByName();
    org.apache.avro.Schema schema30 = parseContext1.find("long", "record");
    org.apache.avro.Schema schema32 = parseContext1.getNamedSchema("double");
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
    org.junit.Assert.assertNotNull(list26);
    org.junit.Assert.assertNotNull(map27);
    org.junit.Assert.assertNotNull(schema30);
    org.junit.Assert.assertNull(schema32);
  }

  @Test
  public void test142() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test142");
    org.apache.avro.Schema schema0 = null;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.createArray(schema0);
    org.apache.avro.NameValidator nameValidator6 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext7 = new org.apache.avro.ParseContext(nameValidator6);
    org.apache.avro.Schema.Field[] fieldArray8 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList9 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList9,
        fieldArray8);
    org.apache.avro.Schema schema11 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList9);
    boolean boolean12 = schema11.isNullable();
    java.util.Set<String> strSet13 = schema11.getAliases();
    String str14 = schema11.toString();
    org.apache.avro.Schema.Field[] fieldArray15 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList16 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList16,
        fieldArray15);
    org.apache.avro.Schema schema18 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList16);
    boolean boolean19 = schema18.isNullable();
    java.util.Set<String> strSet20 = schema18.getAliases();
    String str21 = schema18.toString();
    org.apache.avro.Schema.Field field23 = schema18.getField("long");
    boolean boolean24 = schema18.hasProps();
    org.apache.avro.Schema schema25 = org.apache.avro.Schema.applyAliases(schema11, schema18);
    org.apache.avro.Schema schema26 = parseContext7.resolve(schema25);
    org.apache.avro.Schema schema28 = parseContext7.getNamedSchema("{\"type\":\"record\",\"fields\":[]}");
    org.apache.avro.Schema schema30 = parseContext7.getNamedSchema("{\"type\":\"record\",\"fields\":[]}");
    parseContext7.rollback();
    java.util.List list32 = parseContext7.resolveAllSchemas();
    org.apache.avro.Schema schema33 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) list32);
    org.apache.avro.Schema schema34 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) list32);
    org.apache.avro.Schema schema35 = org.apache.avro.Schema.createRecord("record",
        "{\n  \"type\" : \"record\",\n  \"fields\" : [ ]\n}", "long", false,
        (java.util.List<org.apache.avro.Schema.Field>) list32);
    // The following exception was thrown during execution in test generation
    try {
      schema1.setFields((java.util.List<org.apache.avro.Schema.Field>) list32);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.avro.Schema.toJson(java.util.Set, String, com.fasterxml.jackson.core.JsonGenerator)\" because \"this.elementType\" is null");
    } catch (NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertNotNull(nameValidator6);
    org.junit.Assert.assertNotNull(fieldArray8);
    org.junit.Assert.assertArrayEquals(fieldArray8, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    org.junit.Assert.assertNotNull(schema11);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    org.junit.Assert.assertNotNull(strSet13);
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str14,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNotNull(fieldArray15);
    org.junit.Assert.assertArrayEquals(fieldArray15, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    org.junit.Assert.assertNotNull(schema18);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    org.junit.Assert.assertNotNull(strSet20);
    org.junit.Assert.assertEquals("'" + str21 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str21,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNull(field23);
    org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    org.junit.Assert.assertNotNull(schema25);
    org.junit.Assert.assertNotNull(schema26);
    org.junit.Assert.assertNull(schema28);
    org.junit.Assert.assertNull(schema30);
    org.junit.Assert.assertNotNull(list32);
    org.junit.Assert.assertNotNull(schema33);
    org.junit.Assert.assertNotNull(schema34);
    org.junit.Assert.assertNotNull(schema35);
  }

  @Test
  public void test143() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test143");
    org.apache.avro.NameValidator nameValidator0 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext1 = new org.apache.avro.ParseContext(nameValidator0);
    org.apache.avro.Schema.Field[] fieldArray2 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList3 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList3,
        fieldArray2);
    org.apache.avro.Schema schema5 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList3);
    org.apache.avro.SchemaParser.ParseResult parseResult6 = parseContext1.commit(schema5);
    org.apache.avro.Schema.Parser parser7 = new org.apache.avro.Schema.Parser(parseContext1);
    java.util.Map<String, org.apache.avro.Schema> strMap8 = parser7.getTypes();
    Iterable<org.apache.avro.Schema> schemaIterable9 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema.Parser parser10 = parser7.addTypes(schemaIterable9);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.Iterable.iterator()\" because \"types\" is null");
    } catch (NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(nameValidator0);
    org.junit.Assert.assertNotNull(fieldArray2);
    org.junit.Assert.assertArrayEquals(fieldArray2, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertNotNull(parseResult6);
    org.junit.Assert.assertNotNull(strMap8);
  }

  @Test
  public void test144() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test144");
    org.apache.avro.NameValidator nameValidator0 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.Schema.Parser parser1 = new org.apache.avro.Schema.Parser(nameValidator0);
    org.apache.avro.Schema.setNameValidator(nameValidator0);
    org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser(nameValidator0);
    org.apache.avro.ParseContext parseContext4 = new org.apache.avro.ParseContext(nameValidator0);
    org.apache.avro.Schema.Parser parser5 = new org.apache.avro.Schema.Parser(parseContext4);
    boolean boolean6 = parser5.getValidateDefaults();
    org.junit.Assert.assertNotNull(nameValidator0);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
  }

  @Test
  public void test145() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test145");
    org.apache.avro.NameValidator nameValidator0 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext1 = new org.apache.avro.ParseContext(nameValidator0);
    org.apache.avro.Schema.Field[] fieldArray2 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList3 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList3,
        fieldArray2);
    org.apache.avro.Schema schema5 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList3);
    org.apache.avro.SchemaParser.ParseResult parseResult6 = parseContext1.commit(schema5);
    org.apache.avro.Schema.Field[] fieldArray7 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList8 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean9 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList8,
        fieldArray7);
    org.apache.avro.Schema schema10 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList8);
    boolean boolean11 = schema10.isNullable();
    org.apache.avro.Schema schema12 = org.apache.avro.Schema.createArray(schema10);
    boolean boolean14 = schema12.equals((Object) 100);
    schema12.addProp(
        "{\n  \"type\" : \"record\",\n  \"name\" : \"array\",\n  \"namespace\" : \"hi!\",\n  \"doc\" : \"record\",\n  \"fields\" : [ ]\n}",
        "boolean");
    // The following exception was thrown during execution in test generation
    try {
      parseContext1.put(schema12);
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroTypeException; message: You can only put a named schema into the context");
    } catch (org.apache.avro.AvroTypeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(nameValidator0);
    org.junit.Assert.assertNotNull(fieldArray2);
    org.junit.Assert.assertArrayEquals(fieldArray2, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertNotNull(parseResult6);
    org.junit.Assert.assertNotNull(fieldArray7);
    org.junit.Assert.assertArrayEquals(fieldArray7, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    org.junit.Assert.assertNotNull(schema10);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    org.junit.Assert.assertNotNull(schema12);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
  }

  @Test
  public void test146() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test146");
    org.apache.avro.NameValidator nameValidator4 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext5 = new org.apache.avro.ParseContext(nameValidator4);
    org.apache.avro.Schema.Field[] fieldArray6 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList7 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList7,
        fieldArray6);
    org.apache.avro.Schema schema9 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList7);
    boolean boolean10 = schema9.isNullable();
    java.util.Set<String> strSet11 = schema9.getAliases();
    String str12 = schema9.toString();
    org.apache.avro.Schema.Field[] fieldArray13 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList14 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList14,
        fieldArray13);
    org.apache.avro.Schema schema16 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList14);
    boolean boolean17 = schema16.isNullable();
    java.util.Set<String> strSet18 = schema16.getAliases();
    String str19 = schema16.toString();
    org.apache.avro.Schema.Field field21 = schema16.getField("long");
    boolean boolean22 = schema16.hasProps();
    org.apache.avro.Schema schema23 = org.apache.avro.Schema.applyAliases(schema9, schema16);
    org.apache.avro.Schema schema24 = parseContext5.resolve(schema23);
    org.apache.avro.Schema schema26 = parseContext5.getNamedSchema("{\"type\":\"record\",\"fields\":[]}");
    org.apache.avro.Schema schema28 = parseContext5.getNamedSchema("{\"type\":\"record\",\"fields\":[]}");
    parseContext5.rollback();
    java.util.List list30 = parseContext5.resolveAllSchemas();
    org.apache.avro.Schema schema31 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) list30);
    org.apache.avro.Schema schema32 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) list30);
    org.apache.avro.Schema schema33 = org.apache.avro.Schema.createRecord("record",
        "{\n  \"type\" : \"record\",\n  \"fields\" : [ ]\n}", "long", false,
        (java.util.List<org.apache.avro.Schema.Field>) list30);
    boolean boolean34 = schema33.hasProps();
    org.junit.Assert.assertNotNull(nameValidator4);
    org.junit.Assert.assertNotNull(fieldArray6);
    org.junit.Assert.assertArrayEquals(fieldArray6, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    org.junit.Assert.assertNotNull(schema9);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    org.junit.Assert.assertNotNull(strSet11);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str12,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNotNull(fieldArray13);
    org.junit.Assert.assertArrayEquals(fieldArray13, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    org.junit.Assert.assertNotNull(schema16);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    org.junit.Assert.assertNotNull(strSet18);
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str19,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNull(field21);
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    org.junit.Assert.assertNotNull(schema23);
    org.junit.Assert.assertNotNull(schema24);
    org.junit.Assert.assertNull(schema26);
    org.junit.Assert.assertNull(schema28);
    org.junit.Assert.assertNotNull(list30);
    org.junit.Assert.assertNotNull(schema31);
    org.junit.Assert.assertNotNull(schema32);
    org.junit.Assert.assertNotNull(schema33);
    org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
  }

  @Test
  public void test147() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test147");
    org.apache.avro.NameValidator nameValidator0 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext1 = new org.apache.avro.ParseContext(nameValidator0);
    org.apache.avro.Schema.Field[] fieldArray2 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList3 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList3,
        fieldArray2);
    org.apache.avro.Schema schema5 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList3);
    org.apache.avro.SchemaParser.ParseResult parseResult6 = parseContext1.commit(schema5);
    java.util.List list7 = parseContext1.resolveAllSchemas();
    org.apache.avro.Schema schema10 = parseContext1.find("fixed", "long type:RECORD pos:-1");
    org.apache.avro.Schema schema13 = parseContext1.find("hi!", "");
    java.util.Map map14 = parseContext1.typesByName();
    java.util.Map map15 = parseContext1.typesByName();
    org.junit.Assert.assertNotNull(nameValidator0);
    org.junit.Assert.assertNotNull(fieldArray2);
    org.junit.Assert.assertArrayEquals(fieldArray2, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertNotNull(parseResult6);
    org.junit.Assert.assertNotNull(list7);
    org.junit.Assert.assertNotNull(schema10);
    org.junit.Assert.assertNotNull(schema13);
    org.junit.Assert.assertNotNull(map14);
    org.junit.Assert.assertNotNull(map15);
  }

  @Test
  public void test148() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test148");
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
    parseContext1.rollback();
    java.util.List list26 = parseContext1.resolveAllSchemas();
    org.apache.avro.Schema schema27 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) list26);
    org.apache.avro.Schema schema28 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) list26);
    org.apache.avro.Schema schema29 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) list26);
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
    org.junit.Assert.assertNotNull(list26);
    org.junit.Assert.assertNotNull(schema27);
    org.junit.Assert.assertNotNull(schema28);
    org.junit.Assert.assertNotNull(schema29);
  }

  @Test
  public void test149() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test149");
    org.apache.avro.Schema.Field[] fieldArray1 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList2 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList2,
        fieldArray1);
    org.apache.avro.Schema schema4 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList2);
    boolean boolean5 = schema4.isNullable();
    java.util.Set<String> strSet6 = schema4.getAliases();
    org.apache.avro.Schema.Field field8 = new org.apache.avro.Schema.Field("long", schema4, "long");
    org.apache.avro.Schema schema9 = field8.schema();
    String str10 = field8.doc();
    int int11 = field8.pos();
    Object obj12 = field8.defaultVal();
    String str13 = field8.name();
    org.apache.avro.NameValidator nameValidator14 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext15 = new org.apache.avro.ParseContext(nameValidator14);
    org.apache.avro.Schema.Field[] fieldArray16 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList17 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList17,
        fieldArray16);
    org.apache.avro.Schema schema19 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList17);
    org.apache.avro.SchemaParser.ParseResult parseResult20 = parseContext15.commit(schema19);
    java.util.List list21 = parseContext15.resolveAllSchemas();
    org.apache.avro.Schema schema24 = parseContext15.find("fixed", "long type:RECORD pos:-1");
    org.apache.avro.Schema schema27 = parseContext15.find("hi!", "");
    org.apache.avro.Schema schema28 = org.apache.avro.Schema.createArray(schema27);
    org.apache.avro.Schema.Type type29 = schema27.getType();
    org.apache.avro.Schema.Field field30 = new org.apache.avro.Schema.Field(field8, schema27);
    String str31 = field30.name();
    org.junit.Assert.assertNotNull(fieldArray1);
    org.junit.Assert.assertArrayEquals(fieldArray1, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    org.junit.Assert.assertNotNull(schema4);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    org.junit.Assert.assertNotNull(strSet6);
    org.junit.Assert.assertNotNull(schema9);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "long" + "'", str10, "long");
    org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    org.junit.Assert.assertNull(obj12);
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "long" + "'", str13, "long");
    org.junit.Assert.assertNotNull(nameValidator14);
    org.junit.Assert.assertNotNull(fieldArray16);
    org.junit.Assert.assertArrayEquals(fieldArray16, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    org.junit.Assert.assertNotNull(schema19);
    org.junit.Assert.assertNotNull(parseResult20);
    org.junit.Assert.assertNotNull(list21);
    org.junit.Assert.assertNotNull(schema24);
    org.junit.Assert.assertNotNull(schema27);
    org.junit.Assert.assertNotNull(schema28);
    org.junit.Assert.assertTrue("'" + type29 + "' != '" + org.apache.avro.Schema.Type.RECORD + "'",
        type29.equals(org.apache.avro.Schema.Type.RECORD));
    org.junit.Assert.assertEquals("'" + str31 + "' != '" + "long" + "'", str31, "long");
  }

  @Test
  public void test150() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test150");
    org.apache.avro.NameValidator nameValidator0 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.ParseContext parseContext1 = new org.apache.avro.ParseContext(nameValidator0);
    org.apache.avro.Schema.Field[] fieldArray2 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList3 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList3,
        fieldArray2);
    org.apache.avro.Schema schema5 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList3);
    org.apache.avro.SchemaParser.ParseResult parseResult6 = parseContext1.commit(schema5);
    java.util.List list7 = parseContext1.resolveAllSchemas();
    org.apache.avro.Schema schema10 = parseContext1.find("fixed", "long type:RECORD pos:-1");
    org.apache.avro.Schema schema13 = parseContext1.find("hi!", "");
    org.apache.avro.Schema schema16 = parseContext1.find("float",
        "{\"type\":\"record\",\"fields\":[],\"aliases\":[\"long type:RECORD pos:-1.record\"]}");
    org.junit.Assert.assertNotNull(nameValidator0);
    org.junit.Assert.assertNotNull(fieldArray2);
    org.junit.Assert.assertArrayEquals(fieldArray2, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertNotNull(parseResult6);
    org.junit.Assert.assertNotNull(list7);
    org.junit.Assert.assertNotNull(schema10);
    org.junit.Assert.assertNotNull(schema13);
    org.junit.Assert.assertNotNull(schema16);
  }

  @Test
  public void test151() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test151");
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
    org.apache.avro.Schema.Field[] fieldArray22 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList23 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean24 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList23,
        fieldArray22);
    org.apache.avro.Schema schema25 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList23);
    boolean boolean26 = schema25.isNullable();
    java.util.Set<String> strSet27 = schema25.getAliases();
    com.fasterxml.jackson.databind.JsonNode jsonNode28 = null;
    boolean boolean29 = schema25.isValidDefault(jsonNode28);
    boolean boolean30 = schema25.isUnion();
    org.apache.avro.Schema.Field field32 = new org.apache.avro.Schema.Field("boolean", schema25, "boolean");
    org.apache.avro.LogicalType logicalType33 = schema25.getLogicalType();
    schema25.addProp("record", (Object) "boolean");
    org.apache.avro.Schema.Type type38 = org.apache.avro.Schema.Type.LONG;
    String str39 = type38.getName();
    schema25.addProp("hi!", (Object) str39);
    org.apache.avro.SchemaParser.ParseResult parseResult41 = parseContext1.commit(schema25);
    String str42 = schema25.getName();
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
    org.junit.Assert.assertNotNull(fieldArray22);
    org.junit.Assert.assertArrayEquals(fieldArray22, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    org.junit.Assert.assertNotNull(schema25);
    org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    org.junit.Assert.assertNotNull(strSet27);
    org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    org.junit.Assert.assertNull(logicalType33);
    org.junit.Assert.assertTrue("'" + type38 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type38.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertEquals("'" + str39 + "' != '" + "long" + "'", str39, "long");
    org.junit.Assert.assertNotNull(parseResult41);
    org.junit.Assert.assertNull(str42);
  }

  @Test
  public void test152() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test152");
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
    boolean boolean21 = parseContext1.hasNewSchemas();
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
    org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
  }

  @Test
  public void test153() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test153");
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
    org.apache.avro.Schema.Field[] fieldArray23 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList24 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean25 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList24,
        fieldArray23);
    org.apache.avro.Schema schema26 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList24);
    boolean boolean27 = schema26.isNullable();
    java.util.Set<String> strSet28 = schema26.getAliases();
    org.apache.avro.Schema.Field field30 = new org.apache.avro.Schema.Field("long", schema26, "long");
    boolean boolean31 = field30.hasDefaultValue();
    int int32 = field30.pos();
    String str33 = field30.doc();
    org.apache.avro.Schema.Field[] fieldArray34 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList35 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean36 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList35,
        fieldArray34);
    org.apache.avro.Schema schema37 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList35);
    boolean boolean38 = schema37.isNullable();
    java.util.Set<String> strSet39 = schema37.getAliases();
    String str40 = schema37.toString();
    org.apache.avro.Schema.Field field42 = schema37.getField("long");
    java.util.List<org.apache.avro.Schema.Field> fieldList43 = schema37.getFields();
    schema37.addAlias("long");
    boolean boolean47 = schema37.propsContainsKey("record");
    org.apache.avro.Schema.Field field48 = new org.apache.avro.Schema.Field(field30, schema37);
    Object obj49 = schema19.getObjectProp("float", (Object) schema37);
    org.apache.avro.Schema schema50 = org.apache.avro.Schema.createArray(schema19);
    org.apache.avro.Schema schema51 = org.apache.avro.Schema.createArray(schema19);
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
    org.junit.Assert.assertNotNull(fieldArray23);
    org.junit.Assert.assertArrayEquals(fieldArray23, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    org.junit.Assert.assertNotNull(schema26);
    org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    org.junit.Assert.assertNotNull(strSet28);
    org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    org.junit.Assert.assertEquals("'" + str33 + "' != '" + "long" + "'", str33, "long");
    org.junit.Assert.assertNotNull(fieldArray34);
    org.junit.Assert.assertArrayEquals(fieldArray34, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    org.junit.Assert.assertNotNull(schema37);
    org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    org.junit.Assert.assertNotNull(strSet39);
    org.junit.Assert.assertEquals("'" + str40 + "' != '" + "{\"type\":\"record\",\"fields\":[]}" + "'", str40,
        "{\"type\":\"record\",\"fields\":[]}");
    org.junit.Assert.assertNull(field42);
    org.junit.Assert.assertNotNull(fieldList43);
    org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    org.junit.Assert.assertNotNull(obj49);
    org.junit.Assert.assertEquals(obj49.toString(), "{\"type\":\"record\",\"fields\":[],\"aliases\":[\"long\"]}");
    org.junit.Assert.assertEquals(String.valueOf(obj49), "{\"type\":\"record\",\"fields\":[],\"aliases\":[\"long\"]}");
    org.junit.Assert.assertEquals(java.util.Objects.toString(obj49),
        "{\"type\":\"record\",\"fields\":[],\"aliases\":[\"long\"]}");
    org.junit.Assert.assertNotNull(schema50);
    org.junit.Assert.assertNotNull(schema51);
  }
}
