package customTests.refactorized;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SchemaC_4RandoopTest {

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
    org.apache.avro.Schema schema0 = null;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.createArray(schema0);
    org.apache.avro.Schema schema2 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema3 = org.apache.avro.Schema.applyAliases(schema0, schema2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.avro.Schema.equals(Object)\" because \"writer\" is null");
    } catch (NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(schema1);
  }

  @Test
  public void test002() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test002");
    String[] strArray4 = new String[] { "hi!" };
    java.util.ArrayList<String> strList5 = new java.util.ArrayList<String>();
    boolean boolean6 = java.util.Collections.addAll((java.util.Collection<String>) strList5, strArray4);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema8 = org.apache.avro.Schema.createEnum("", "", "hi!",
          (java.util.List<String>) strList5, "");
      org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Empty name");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(strArray4);
    org.junit.Assert.assertArrayEquals(strArray4, new String[] { "hi!" });
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
  }

  @Test
  public void test003() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test003");
    org.apache.avro.Schema schema0 = null;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.createArray(schema0);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema2 = schema1.getValueType();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.avro.Schema.toJson(java.util.Set, String, com.fasterxml.jackson.core.JsonGenerator)\" because \"this.elementType\" is null");
    } catch (NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(schema1);
  }

  @Test
  public void test004() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test004");
    org.apache.avro.Schema schema0 = null;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.createArray(schema0);
    org.apache.avro.Schema schema2 = null;
    org.apache.avro.Schema schema3 = org.apache.avro.Schema.createArray(schema2);
    // The following exception was thrown during execution in test generation
    try {
      schema1.addAllProps((org.apache.avro.JsonProperties) schema2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: Cannot read field \"props\" because \"properties\" is null");
    } catch (NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertNotNull(schema3);
  }

  @Test
  public void test005() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test005");
    org.apache.avro.Schema schema0 = null;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.createArray(schema0);
    // The following exception was thrown during execution in test generation
    try {
      schema1.addProp("", (Object) '4');
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Unknown datum class: class java.lang.Character");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(schema1);
  }

  @Test
  public void test006() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test006");
    org.apache.avro.Schema.Field[] fieldArray4 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList5 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList5,
        fieldArray4);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema7 = org.apache.avro.Schema.createRecord("", "hi!", "", false,
          (java.util.List<org.apache.avro.Schema.Field>) fieldList5);
      org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Empty name");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(fieldArray4);
    org.junit.Assert.assertArrayEquals(fieldArray4, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
  }

  @Test
  public void test007() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test007");
    org.apache.avro.Schema schema1 = null;
    org.apache.avro.Schema schema2 = org.apache.avro.Schema.createArray(schema1);
    org.apache.avro.Schema.Field.Order order5 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema.Field field6 = new org.apache.avro.Schema.Field("", schema1, "hi!", (Object) (byte) 10,
          order5);
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Unknown datum class: class java.lang.Byte");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(schema2);
  }

  @Test
  public void test008() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test008");
    org.apache.avro.Schema schema0 = null;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.createArray(schema0);
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<org.apache.avro.Schema.Field> fieldList2 = schema1.getFields();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.avro.Schema.toJson(java.util.Set, String, com.fasterxml.jackson.core.JsonGenerator)\" because \"this.elementType\" is null");
    } catch (NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(schema1);
  }

  @Test
  public void test009() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test009");
    org.apache.avro.Schema schema0 = null;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.createArray(schema0);
    // The following exception was thrown during execution in test generation
    try {
      String str2 = schema1.getNamespace();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.avro.Schema.toJson(java.util.Set, String, com.fasterxml.jackson.core.JsonGenerator)\" because \"this.elementType\" is null");
    } catch (NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(schema1);
  }

  @Test
  public void test010() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test010");
    org.apache.avro.Schema schema0 = null;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.createArray(schema0);
    org.apache.avro.Schema schema2 = null;
    org.apache.avro.Schema schema3 = org.apache.avro.Schema.createArray(schema2);
    // The following exception was thrown during execution in test generation
    try {
      schema1.putAll((org.apache.avro.JsonProperties) schema2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: Cannot read field \"props\" because \"np\" is null");
    } catch (NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertNotNull(schema3);
  }

  @Test
  public void test011() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test011");
    Object obj1 = org.apache.avro.Schema.parseJsonToObject("");
    org.junit.Assert.assertNull(obj1);
  }

  @Test
  public void test012() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test012");
    org.apache.avro.Schema schema0 = null;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.createArray(schema0);
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<String> strList2 = schema1.getEnumSymbols();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.avro.Schema.toJson(java.util.Set, String, com.fasterxml.jackson.core.JsonGenerator)\" because \"this.elementType\" is null");
    } catch (NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(schema1);
  }

  @Test
  public void test013() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test013");
    org.apache.avro.Schema schema0 = null;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.createArray(schema0);
    // The following exception was thrown during execution in test generation
    try {
      schema1.addProp("", (Object) (byte) 100);
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Unknown datum class: class java.lang.Byte");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(schema1);
  }

  @Test
  public void test014() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test014");
    org.apache.avro.Schema schema0 = null;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.createArray(schema0);
    org.apache.avro.Schema schema2 = null;
    org.apache.avro.Schema schema3 = org.apache.avro.Schema.createArray(schema2);
    org.apache.avro.Schema schema4 = null;
    org.apache.avro.Schema schema5 = org.apache.avro.Schema.createArray(schema4);
    org.apache.avro.Schema schema6 = null;
    org.apache.avro.Schema schema7 = org.apache.avro.Schema.createArray(schema6);
    org.apache.avro.Schema schema8 = null;
    org.apache.avro.Schema schema9 = org.apache.avro.Schema.createArray(schema8);
    org.apache.avro.Schema schema10 = null;
    org.apache.avro.Schema schema11 = org.apache.avro.Schema.createArray(schema10);
    org.apache.avro.Schema[] schemaArray12 = new org.apache.avro.Schema[] { schema1, schema2, schema5, schema7, schema8,
        schema10 };
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema13 = org.apache.avro.Schema.createUnion(schemaArray12);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.avro.Schema.getType()\" because \"type\" is null");
    } catch (NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertNotNull(schema3);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertNotNull(schema7);
    org.junit.Assert.assertNotNull(schema9);
    org.junit.Assert.assertNotNull(schema11);
    org.junit.Assert.assertNotNull(schemaArray12);
  }

  @Test
  public void test015() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test015");
    org.apache.avro.Schema schema0 = null;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.createArray(schema0);
    org.apache.avro.Schema schema2 = null;
    org.apache.avro.Schema schema3 = org.apache.avro.Schema.createArray(schema2);
    org.apache.avro.Schema schema4 = null;
    org.apache.avro.Schema schema5 = org.apache.avro.Schema.createArray(schema4);
    org.apache.avro.Schema schema6 = null;
    org.apache.avro.Schema schema7 = org.apache.avro.Schema.createArray(schema6);
    org.apache.avro.Schema[] schemaArray8 = new org.apache.avro.Schema[] { schema1, schema2, schema5, schema6 };
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema9 = org.apache.avro.Schema.createUnion(schemaArray8);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.avro.Schema.getType()\" because \"type\" is null");
    } catch (NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertNotNull(schema3);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertNotNull(schema7);
    org.junit.Assert.assertNotNull(schemaArray8);
  }

  @Test
  public void test016() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test016");
    org.apache.avro.NameValidator nameValidator0 = org.apache.avro.Schema.getNameValidator();
    Class<?> wildcardClass1 = nameValidator0.getClass();
    org.junit.Assert.assertNotNull(nameValidator0);
    org.junit.Assert.assertNotNull(wildcardClass1);
  }

  @Test
  public void test017() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test017");
    org.apache.avro.Schema schema1 = null;
    org.apache.avro.Schema schema2 = org.apache.avro.Schema.createArray(schema1);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema.Field field4 = new org.apache.avro.Schema.Field("hi!", schema2, "");
      org.junit.Assert
          .fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal character in: hi!");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(schema2);
  }

  @Test
  public void test018() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test018");
    org.apache.avro.Schema schema0 = null;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.createArray(schema0);
    // The following exception was thrown during execution in test generation
    try {
      boolean boolean3 = schema1.hasEnumSymbol("");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.avro.Schema.toJson(java.util.Set, String, com.fasterxml.jackson.core.JsonGenerator)\" because \"this.elementType\" is null");
    } catch (NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(schema1);
  }

  @Test
  public void test019() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test019");
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("", "hi!", "", false);
      org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Empty name");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
  }

  @Test
  public void test020() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test020");
    String[] strArray5 = new String[] { "record", "" };
    java.util.ArrayList<String> strList6 = new java.util.ArrayList<String>();
    boolean boolean7 = java.util.Collections.addAll((java.util.Collection<String>) strList6, strArray5);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema8 = org.apache.avro.Schema.createEnum("hi!", "record", "record",
          (java.util.List<String>) strList6);
      org.junit.Assert
          .fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal character in: hi!");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(strArray5);
    org.junit.Assert.assertArrayEquals(strArray5, new String[] { "record", "" });
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
  }

  @Test
  public void test021() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test021");
    org.apache.avro.Schema schema0 = null;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.createArray(schema0);
    // The following exception was thrown during execution in test generation
    try {
      int int3 = schema1.getEnumOrdinal("record");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.avro.Schema.toJson(java.util.Set, String, com.fasterxml.jackson.core.JsonGenerator)\" because \"this.elementType\" is null");
    } catch (NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(schema1);
  }

  @Test
  public void test022() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test022");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    // The following exception was thrown during execution in test generation
    try {
      String str2 = schema1.getNamespace();
      org.junit.Assert
          .fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: \"long\"");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
  }

  @Test
  public void test023() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test023");
    org.apache.avro.Schema schema0 = null;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.createArray(schema0);
    // The following exception was thrown during execution in test generation
    try {
      int int3 = schema1.getEnumOrdinal("");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.avro.Schema.toJson(java.util.Set, String, com.fasterxml.jackson.core.JsonGenerator)\" because \"this.elementType\" is null");
    } catch (NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(schema1);
  }

  @Test
  public void test024() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test024");
    org.apache.avro.Schema schema0 = null;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.createArray(schema0);
    // The following exception was thrown during execution in test generation
    try {
      int int2 = schema1.getFixedSize();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.avro.Schema.toJson(java.util.Set, String, com.fasterxml.jackson.core.JsonGenerator)\" because \"this.elementType\" is null");
    } catch (NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(schema1);
  }

  @Test
  public void test025() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test025");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.FIXED;
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
      org.junit.Assert
          .fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Can't create a: FIXED");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.FIXED + "'",
        type0.equals(org.apache.avro.Schema.Type.FIXED));
  }

  @Test
  public void test026() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test026");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    org.apache.avro.Schema.Parser parser2 = new org.apache.avro.Schema.Parser();
    boolean boolean3 = schema1.equals((Object) parser2);
    // The following exception was thrown during execution in test generation
    try {
      boolean boolean4 = schema1.isError();
      org.junit.Assert
          .fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: \"long\"");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
  }

  @Test
  public void test027() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test027");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    org.apache.avro.Schema.Parser parser2 = new org.apache.avro.Schema.Parser();
    boolean boolean3 = schema1.equals((Object) parser2);
    String[] strArray8 = new String[] { "", "long", "" };
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema9 = parser2.parse("\"long\"", strArray8);
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.SchemaParseException; message: dangling content after end of schema: long");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    org.junit.Assert.assertNotNull(strArray8);
    org.junit.Assert.assertArrayEquals(strArray8, new String[] { "", "long", "" });
  }

  @Test
  public void test028() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test028");
    java.io.InputStream inputStream0 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse(inputStream0);
      org.junit.Assert
          .fail("Expected exception of type org.apache.avro.SchemaParseException; message: Cannot parse <null> schema");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
  }

  @Test
  public void test029() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test029");
    java.io.File file0 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse(file0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    } catch (NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test030() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test030");
    org.apache.avro.Schema.Field[] fieldArray4 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList5 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList5,
        fieldArray4);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema7 = org.apache.avro.Schema.createRecord("", "long", "\"long\"", false,
          (java.util.List<org.apache.avro.Schema.Field>) fieldList5);
      org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Empty name");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(fieldArray4);
    org.junit.Assert.assertArrayEquals(fieldArray4, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
  }

  @Test
  public void test031() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test031");
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("", "hi!", "record", false);
      org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Empty name");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
  }

  @Test
  public void test032() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test032");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    org.apache.avro.Schema.Parser parser2 = new org.apache.avro.Schema.Parser();
    boolean boolean3 = schema1.equals((Object) parser2);
    org.apache.avro.Schema.Type type4 = org.apache.avro.Schema.Type.UNION;
    org.apache.avro.Schema.SeenPair seenPair5 = new org.apache.avro.Schema.SeenPair((Object) boolean3, (Object) type4);
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    org.junit.Assert.assertTrue("'" + type4 + "' != '" + org.apache.avro.Schema.Type.UNION + "'",
        type4.equals(org.apache.avro.Schema.Type.UNION));
  }

  @Test
  public void test033() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test033");
    String[] strArray6 = new String[] { "record", "", "\"long\"" };
    java.util.ArrayList<String> strList7 = new java.util.ArrayList<String>();
    boolean boolean8 = java.util.Collections.addAll((java.util.Collection<String>) strList7, strArray6);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema9 = org.apache.avro.Schema.createEnum("hi!", "hi!", "\"long\"",
          (java.util.List<String>) strList7);
      org.junit.Assert
          .fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal character in: hi!");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(strArray6);
    org.junit.Assert.assertArrayEquals(strArray6, new String[] { "record", "", "\"long\"" });
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
  }

  @Test
  public void test034() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test034");
    org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("record", "long", "record", true);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema5 = schema4.getElementType();
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an array: {\"type\":\"error\",\"name\":\"record\",\"namespace\":\"record\",\"doc\":\"long\"}");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(schema4);
  }

  @Test
  public void test035() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test035");
    org.apache.avro.Schema.Type type1 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema2 = org.apache.avro.Schema.create(type1);
    org.apache.avro.Schema.Field field4 = new org.apache.avro.Schema.Field("long", schema2, "");
    org.apache.avro.Schema.Type type5 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema6 = org.apache.avro.Schema.create(type5);
    org.apache.avro.Schema.Parser parser7 = new org.apache.avro.Schema.Parser();
    boolean boolean8 = schema6.equals((Object) parser7);
    org.apache.avro.Schema.Field field9 = new org.apache.avro.Schema.Field(field4, schema6);
    // The following exception was thrown during execution in test generation
    try {
      Integer int11 = schema6.getIndexNamed("record");
      org.junit.Assert
          .fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a union: \"long\"");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type1 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type1.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema2);
    org.junit.Assert.assertTrue("'" + type5 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type5.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
  }

  @Test
  public void test036() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test036");
    org.apache.avro.Schema.Type type1 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema2 = org.apache.avro.Schema.create(type1);
    org.apache.avro.Schema.Field field4 = new org.apache.avro.Schema.Field("long", schema2, "");
    org.apache.avro.Schema schema5 = field4.schema();
    String str6 = field4.toString();
    org.junit.Assert.assertTrue("'" + type1 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type1.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema2);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "long type:LONG pos:-1" + "'", str6, "long type:LONG pos:-1");
  }

  /*
   * @Test public void test037() throws Throwable { if (debug)
   * System.out.format("%n%s%n", "RegressionTest0.test037"); // The following
   * exception was thrown during execution in test generation try { Object obj1 =
   * org.apache.avro.Schema.parseJsonToObject("long"); org.junit.Assert.
   * fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: com.fasterxml.jackson.core.JsonParseException: Unrecognized token 'long': was expecting (JSON String, Number, Array, Object or token 'null', 'true' or 'false')? at [Source: REDACTED (`StreamReadFeature.INCLUDE_SOURCE_IN_LOCATION` disabled); line: 1, column: 1]"
   * ); } catch (org.apache.avro.AvroRuntimeException e) { // Expected exception.
   * } }
   */

  @Test
  public void test038() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test038");
    org.apache.avro.Schema schema1 = null;
    org.apache.avro.Schema schema2 = org.apache.avro.Schema.createArray(schema1);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema.Field field3 = new org.apache.avro.Schema.Field("long", schema1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: schema is required and cannot be null");
    } catch (NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(schema2);
  }

  @Test
  public void test039() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test039");
    String[] strArray10 = new String[] { "long type:LONG pos:-1", "long type:LONG pos:-1", "",
        "{\n  \"type\" : \"long\",\n  \"hi!\" : \"record\"\n}", "\"long\"", "hi!", "hi!" };
    java.util.ArrayList<String> strList11 = new java.util.ArrayList<String>();
    boolean boolean12 = java.util.Collections.addAll((java.util.Collection<String>) strList11, strArray10);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema14 = org.apache.avro.Schema.createEnum("long", "", "hi!",
          (java.util.List<String>) strList11, "long type:LONG pos:-1");
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.SchemaParseException; message: Illegal character in: long type:LONG pos:-1");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(strArray10);
    org.junit.Assert.assertArrayEquals(strArray10, new String[] { "long type:LONG pos:-1", "long type:LONG pos:-1", "",
        "{\n  \"type\" : \"long\",\n  \"hi!\" : \"record\"\n}", "\"long\"", "hi!", "hi!" });
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
  }

  @Test
  public void test040() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test040");
    org.apache.avro.Schema.Type type2 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema3 = org.apache.avro.Schema.create(type2);
    org.apache.avro.Schema.Field field5 = new org.apache.avro.Schema.Field("long", schema3, "");
    org.apache.avro.Schema schema6 = field5.schema();
    org.apache.avro.Schema.Type type8 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema9 = org.apache.avro.Schema.create(type8);
    String str10 = schema9.toString();
    boolean boolean11 = schema9.isNullable();
    org.apache.avro.Schema.Field.Order order12 = org.apache.avro.Schema.Field.Order.IGNORE;
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema.Field field13 = new org.apache.avro.Schema.Field("long", schema6, "long", (Object) schema9,
          order12);
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Unknown datum class: class org.apache.avro.Schema$LongSchema");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type2 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type2.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema3);
    org.junit.Assert.assertNotNull(schema6);
    org.junit.Assert.assertTrue("'" + type8 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type8.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema9);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"long\"" + "'", str10, "\"long\"");
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    org.junit.Assert.assertTrue("'" + order12 + "' != '" + org.apache.avro.Schema.Field.Order.IGNORE + "'",
        order12.equals(org.apache.avro.Schema.Field.Order.IGNORE));
  }

  @Test
  public void test041() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test041");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    org.apache.avro.Schema.Parser parser2 = new org.apache.avro.Schema.Parser();
    boolean boolean3 = schema1.equals((Object) parser2);
    java.io.InputStream inputStream4 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema5 = parser2.parse(inputStream4);
      org.junit.Assert
          .fail("Expected exception of type org.apache.avro.SchemaParseException; message: Cannot parse <null> schema");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
  }

  @Test
  public void test042() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test042");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    String str2 = schema1.getFullName();
    schema1.addProp("hi!", (Object) "record");
    String str6 = schema1.getFullName();
    java.util.function.BiConsumer<String, Object> strBiConsumer7 = null;
    // The following exception was thrown during execution in test generation
    try {
      schema1.forEachProperty(strBiConsumer7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiConsumer.accept(Object, Object)\" because \"consumer\" is null");
    } catch (NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "long" + "'", str2, "long");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "long" + "'", str6, "long");
  }

  @Test
  public void test043() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test043");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    String str2 = schema1.getFullName();
    schema1.addProp("record", (Object) 10.0d);
    String str7 = schema1.getProp("record");
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<org.apache.avro.Schema.Field> fieldList8 = schema1.getFields();
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: {\"type\":\"long\",\"record\":10.0}");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "long" + "'", str2, "long");
    org.junit.Assert.assertNull(str7);
  }

  @Test
  public void test044() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test044");
    org.apache.avro.Schema schema5 = org.apache.avro.Schema.createRecord("record", "long", "record", true);
    org.apache.avro.Schema.Type type7 = org.apache.avro.Schema.Type.NULL;
    org.apache.avro.Schema.Field.Order order8 = org.apache.avro.Schema.Field.Order.IGNORE;
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema.Field field9 = new org.apache.avro.Schema.Field("long type:LONG pos:-1", schema5,
          "long type:LONG pos:-1", (Object) type7, order8);
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.SchemaParseException; message: Illegal character in: long type:LONG pos:-1");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertTrue("'" + type7 + "' != '" + org.apache.avro.Schema.Type.NULL + "'",
        type7.equals(org.apache.avro.Schema.Type.NULL));
    org.junit.Assert.assertTrue("'" + order8 + "' != '" + org.apache.avro.Schema.Field.Order.IGNORE + "'",
        order8.equals(org.apache.avro.Schema.Field.Order.IGNORE));
  }

  @Test
  public void test045() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test045");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    org.apache.avro.Schema.Parser parser2 = new org.apache.avro.Schema.Parser();
    boolean boolean3 = schema1.equals((Object) parser2);
    Class<?> wildcardClass4 = parser2.getClass();
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    org.junit.Assert.assertNotNull(wildcardClass4);
  }

  @Test
  public void test046() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test046");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    String str2 = schema1.toString();
    boolean boolean3 = schema1.isNullable();
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema4 = schema1.getElementType();
      org.junit.Assert
          .fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an array: \"long\"");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"long\"" + "'", str2, "\"long\"");
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
  }

  @Test
  public void test047() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test047");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    String str2 = schema1.getFullName();
    schema1.addProp("hi!", (Object) "record");
    String str6 = schema1.getFullName();
    com.fasterxml.jackson.databind.JsonNode jsonNode7 = null;
    boolean boolean8 = schema1.isValidDefault(jsonNode7);
    // The following exception was thrown during execution in test generation
    try {
      Integer int10 = schema1.getIndexNamed("long");
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a union: {\"type\":\"long\",\"hi!\":\"record\"}");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "long" + "'", str2, "long");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "long" + "'", str6, "long");
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
  }

  @Test
  public void test048() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test048");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    org.apache.avro.Schema.Parser parser2 = new org.apache.avro.Schema.Parser();
    boolean boolean3 = schema1.equals((Object) parser2);
    com.fasterxml.jackson.databind.JsonNode jsonNode4 = null;
    boolean boolean5 = schema1.isValidDefault(jsonNode4);
    boolean boolean6 = schema1.hasProps();
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<String> strList7 = schema1.getEnumSymbols();
      org.junit.Assert
          .fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: \"long\"");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
  }

  @Test
  public void test049() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test049");
    org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("record", "long", "record", true);
    // The following exception was thrown during execution in test generation
    try {
      int int5 = schema4.getFixedSize();
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Not fixed: {\"type\":\"error\",\"name\":\"record\",\"namespace\":\"record\",\"doc\":\"long\"}");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(schema4);
  }

  @Test
  public void test050() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test050");
    org.apache.avro.NameValidator nameValidator0 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.Schema.setNameValidator(nameValidator0);
    org.apache.avro.Schema.setNameValidator(nameValidator0);
    org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser(nameValidator0);
    String[] strArray11 = new String[] { "long", "", "record", "{\"type\":\"long\",\"hi!\":\"record\"}",
        "{\n  \"type\" : \"long\",\n  \"hi!\" : \"record\"\n}", "long type:LONG pos:-1" };
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema12 = parser3.parse("\"long\"", strArray11);
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.SchemaParseException; message: dangling content after end of schema: longrecord{\"type\":\"long\",\"hi!\":\"record\"}{?  \"type\" : \"long\",?  \"hi!\" : \"record\"?}long type:LONG pos:-1");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(nameValidator0);
    org.junit.Assert.assertNotNull(strArray11);
    org.junit.Assert.assertArrayEquals(strArray11,
        new String[] { "long", "", "record", "{\"type\":\"long\",\"hi!\":\"record\"}",
            "{\n  \"type\" : \"long\",\n  \"hi!\" : \"record\"\n}", "long type:LONG pos:-1" });
  }

  @Test
  public void test051() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test051");
    org.apache.avro.Schema.Type type1 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema2 = org.apache.avro.Schema.create(type1);
    org.apache.avro.Schema.Field field4 = new org.apache.avro.Schema.Field("long", schema2, "");
    // The following exception was thrown during execution in test generation
    try {
      schema2.addAlias("{\"type\":\"long\",\"hi!\":\"record\"}");
      org.junit.Assert
          .fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: \"long\"");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type1 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type1.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema2);
  }

  /*
   * @Test public void test052() throws Throwable { if (debug)
   * System.out.format("%n%s%n", "RegressionTest0.test052"); // The following
   * exception was thrown during execution in test generation try { Object obj1 =
   * org.apache.avro.Schema.parseJsonToObject("record"); org.junit.Assert.
   * fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: com.fasterxml.jackson.core.JsonParseException: Unrecognized token 'record': was expecting (JSON String, Number, Array, Object or token 'null', 'true' or 'false')? at [Source: REDACTED (`StreamReadFeature.INCLUDE_SOURCE_IN_LOCATION` disabled); line: 1, column: 1]"
   * ); } catch (org.apache.avro.AvroRuntimeException e) { // Expected exception.
   * } }
   */

  @Test
  public void test053() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test053");
    org.apache.avro.Schema.Type type1 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema2 = org.apache.avro.Schema.create(type1);
    org.apache.avro.Schema.Field field4 = new org.apache.avro.Schema.Field("long", schema2, "");
    org.apache.avro.Schema.Type type5 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema6 = org.apache.avro.Schema.create(type5);
    org.apache.avro.Schema.Parser parser7 = new org.apache.avro.Schema.Parser();
    boolean boolean8 = schema6.equals((Object) parser7);
    org.apache.avro.Schema.Field field9 = new org.apache.avro.Schema.Field(field4, schema6);
    org.apache.avro.Schema.Type type11 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema12 = org.apache.avro.Schema.create(type11);
    org.apache.avro.Schema.Field field14 = new org.apache.avro.Schema.Field("long", schema12, "");
    org.apache.avro.Schema schema15 = field14.schema();
    Object obj16 = field14.defaultVal();
    org.apache.avro.Schema.Type type18 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema19 = org.apache.avro.Schema.create(type18);
    org.apache.avro.Schema.Field field21 = new org.apache.avro.Schema.Field("long", schema19, "");
    org.apache.avro.Schema schema22 = field21.schema();
    Object obj23 = field21.defaultVal();
    org.apache.avro.Schema schema24 = field21.schema();
    org.apache.avro.Schema.Type type26 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema27 = org.apache.avro.Schema.create(type26);
    org.apache.avro.Schema.Field field29 = new org.apache.avro.Schema.Field("long", schema27, "");
    org.apache.avro.Schema.Type type30 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema31 = org.apache.avro.Schema.create(type30);
    org.apache.avro.Schema.Parser parser32 = new org.apache.avro.Schema.Parser();
    boolean boolean33 = schema31.equals((Object) parser32);
    org.apache.avro.Schema.Field field34 = new org.apache.avro.Schema.Field(field29, schema31);
    org.apache.avro.Schema.Type type36 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema37 = org.apache.avro.Schema.create(type36);
    org.apache.avro.Schema.Field field39 = new org.apache.avro.Schema.Field("long", schema37, "");
    org.apache.avro.Schema.Type type40 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema41 = org.apache.avro.Schema.create(type40);
    org.apache.avro.Schema.Parser parser42 = new org.apache.avro.Schema.Parser();
    boolean boolean43 = schema41.equals((Object) parser42);
    org.apache.avro.Schema.Field field44 = new org.apache.avro.Schema.Field(field39, schema41);
    org.apache.avro.Schema.Type type46 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema47 = org.apache.avro.Schema.create(type46);
    org.apache.avro.Schema.Field field49 = new org.apache.avro.Schema.Field("long", schema47, "");
    org.apache.avro.Schema.Type type50 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema51 = org.apache.avro.Schema.create(type50);
    org.apache.avro.Schema.Parser parser52 = new org.apache.avro.Schema.Parser();
    boolean boolean53 = schema51.equals((Object) parser52);
    org.apache.avro.Schema.Field field54 = new org.apache.avro.Schema.Field(field49, schema51);
    org.apache.avro.Schema.Type type56 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema57 = org.apache.avro.Schema.create(type56);
    org.apache.avro.Schema.Field field59 = new org.apache.avro.Schema.Field("long", schema57, "");
    org.apache.avro.Schema schema60 = field59.schema();
    Object obj61 = field59.defaultVal();
    org.apache.avro.Schema.Type type63 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema64 = org.apache.avro.Schema.create(type63);
    org.apache.avro.Schema.Field field66 = new org.apache.avro.Schema.Field("long", schema64, "");
    org.apache.avro.Schema.Type type67 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema68 = org.apache.avro.Schema.create(type67);
    org.apache.avro.Schema.Parser parser69 = new org.apache.avro.Schema.Parser();
    boolean boolean70 = schema68.equals((Object) parser69);
    org.apache.avro.Schema.Field field71 = new org.apache.avro.Schema.Field(field66, schema68);
    org.apache.avro.Schema.Type type73 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema74 = org.apache.avro.Schema.create(type73);
    org.apache.avro.Schema.Field field76 = new org.apache.avro.Schema.Field("long", schema74, "");
    org.apache.avro.Schema.Type type77 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema78 = org.apache.avro.Schema.create(type77);
    org.apache.avro.Schema.Parser parser79 = new org.apache.avro.Schema.Parser();
    boolean boolean80 = schema78.equals((Object) parser79);
    org.apache.avro.Schema.Field field81 = new org.apache.avro.Schema.Field(field76, schema78);
    boolean boolean83 = field81.equals((Object) 1.0d);
    org.apache.avro.Schema.Field[] fieldArray84 = new org.apache.avro.Schema.Field[] { field14, field21, field34,
        field44, field54, field59, field71, field81 };
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList85 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean86 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList85,
        fieldArray84);
    // The following exception was thrown during execution in test generation
    try {
      schema6.setFields((java.util.List<org.apache.avro.Schema.Field>) fieldList85);
      org.junit.Assert
          .fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: \"long\"");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type1 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type1.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema2);
    org.junit.Assert.assertTrue("'" + type5 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type5.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    org.junit.Assert.assertTrue("'" + type11 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type11.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema12);
    org.junit.Assert.assertNotNull(schema15);
    org.junit.Assert.assertNull(obj16);
    org.junit.Assert.assertTrue("'" + type18 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type18.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema19);
    org.junit.Assert.assertNotNull(schema22);
    org.junit.Assert.assertNull(obj23);
    org.junit.Assert.assertNotNull(schema24);
    org.junit.Assert.assertTrue("'" + type26 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type26.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema27);
    org.junit.Assert.assertTrue("'" + type30 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type30.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema31);
    org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    org.junit.Assert.assertTrue("'" + type36 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type36.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema37);
    org.junit.Assert.assertTrue("'" + type40 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type40.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema41);
    org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    org.junit.Assert.assertTrue("'" + type46 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type46.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema47);
    org.junit.Assert.assertTrue("'" + type50 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type50.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema51);
    org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    org.junit.Assert.assertTrue("'" + type56 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type56.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema57);
    org.junit.Assert.assertNotNull(schema60);
    org.junit.Assert.assertNull(obj61);
    org.junit.Assert.assertTrue("'" + type63 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type63.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema64);
    org.junit.Assert.assertTrue("'" + type67 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type67.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema68);
    org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    org.junit.Assert.assertTrue("'" + type73 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type73.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema74);
    org.junit.Assert.assertTrue("'" + type77 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type77.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema78);
    org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    org.junit.Assert.assertNotNull(fieldArray84);
    org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
  }

  @Test
  public void test054() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test054");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    org.apache.avro.Schema.Parser parser2 = new org.apache.avro.Schema.Parser();
    boolean boolean3 = schema1.equals((Object) parser2);
    com.fasterxml.jackson.databind.JsonNode jsonNode4 = null;
    boolean boolean5 = schema1.isValidDefault(jsonNode4);
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<String> strList6 = schema1.getEnumSymbols();
      org.junit.Assert
          .fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: \"long\"");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
  }

  @Test
  public void test055() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test055");
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("long type:LONG pos:-1", false);
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.SchemaParseException; message: com.fasterxml.jackson.core.JsonParseException: Unrecognized token 'long': was expecting (JSON String, Number, Array, Object or token 'null', 'true' or 'false')? at [Source: REDACTED (`StreamReadFeature.INCLUDE_SOURCE_IN_LOCATION` disabled); line: 1, column: 1]");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
  }

  @Test
  public void test056() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test056");
    org.apache.avro.NameValidator nameValidator0 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.Schema.setNameValidator(nameValidator0);
    org.apache.avro.Schema.setNameValidator(nameValidator0);
    org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser(nameValidator0);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema5 = parser3.parseInternal("long");
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.SchemaParseException; message: com.fasterxml.jackson.core.JsonParseException: Unrecognized token 'long': was expecting (JSON String, Number, Array, Object or token 'null', 'true' or 'false')? at [Source: REDACTED (`StreamReadFeature.INCLUDE_SOURCE_IN_LOCATION` disabled); line: 1, column: 1]");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(nameValidator0);
  }

  @Test
  public void test057() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test057");
    org.apache.avro.Schema.Type type1 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema2 = org.apache.avro.Schema.create(type1);
    org.apache.avro.Schema.Field field4 = new org.apache.avro.Schema.Field("long", schema2, "");
    String str5 = field4.toString();
    java.util.Map<String, Object> strMap6 = field4.getObjectProps();
    org.junit.Assert.assertTrue("'" + type1 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type1.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema2);
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "long type:LONG pos:-1" + "'", str5, "long type:LONG pos:-1");
    org.junit.Assert.assertNotNull(strMap6);
  }

  @Test
  public void test058() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test058");
    org.apache.avro.NameValidator nameValidator0 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.Schema.setNameValidator(nameValidator0);
    org.apache.avro.Schema.setNameValidator(nameValidator0);
    org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser(nameValidator0);
    org.apache.avro.Schema schema5 = parser3.parse("{\n  \"type\" : \"long\",\n  \"hi!\" : \"record\"\n}");
    java.io.InputStream inputStream6 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema7 = parser3.parse(inputStream6);
      org.junit.Assert
          .fail("Expected exception of type org.apache.avro.SchemaParseException; message: Cannot parse <null> schema");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(nameValidator0);
    org.junit.Assert.assertNotNull(schema5);
  }

  @Test
  public void test059() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test059");
    org.apache.avro.Schema.Type type1 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema2 = org.apache.avro.Schema.create(type1);
    org.apache.avro.Schema.Field field4 = new org.apache.avro.Schema.Field("long", schema2, "");
    String str5 = field4.toString();
    java.util.Map<String, Object> strMap6 = field4.getObjectProps();
    org.apache.avro.Schema.Type type8 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema9 = org.apache.avro.Schema.create(type8);
    org.apache.avro.Schema.Field field11 = new org.apache.avro.Schema.Field("long", schema9, "");
    org.apache.avro.Schema schema12 = field11.schema();
    Object obj13 = field11.defaultVal();
    org.apache.avro.Schema.Type type15 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema16 = org.apache.avro.Schema.create(type15);
    org.apache.avro.Schema.Field field18 = new org.apache.avro.Schema.Field("long", schema16, "");
    org.apache.avro.Schema schema19 = field18.schema();
    String str20 = field18.toString();
    org.apache.avro.Schema.Type type22 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema23 = org.apache.avro.Schema.create(type22);
    org.apache.avro.Schema.Field field25 = new org.apache.avro.Schema.Field("long", schema23, "");
    org.apache.avro.Schema.Type type26 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema27 = org.apache.avro.Schema.create(type26);
    org.apache.avro.Schema.Parser parser28 = new org.apache.avro.Schema.Parser();
    boolean boolean29 = schema27.equals((Object) parser28);
    org.apache.avro.Schema.Field field30 = new org.apache.avro.Schema.Field(field25, schema27);
    org.apache.avro.Schema.Type type32 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema33 = org.apache.avro.Schema.create(type32);
    org.apache.avro.Schema.Field field35 = new org.apache.avro.Schema.Field("long", schema33, "");
    org.apache.avro.Schema schema36 = field35.schema();
    String str37 = field35.toString();
    org.apache.avro.Schema.Type type39 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema40 = org.apache.avro.Schema.create(type39);
    org.apache.avro.Schema.Field field42 = new org.apache.avro.Schema.Field("long", schema40, "");
    org.apache.avro.Schema.Type type43 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema44 = org.apache.avro.Schema.create(type43);
    org.apache.avro.Schema.Parser parser45 = new org.apache.avro.Schema.Parser();
    boolean boolean46 = schema44.equals((Object) parser45);
    org.apache.avro.Schema.Field field47 = new org.apache.avro.Schema.Field(field42, schema44);
    org.apache.avro.Schema.Type type49 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema50 = org.apache.avro.Schema.create(type49);
    org.apache.avro.Schema.Field field52 = new org.apache.avro.Schema.Field("long", schema50, "");
    org.apache.avro.Schema schema53 = field52.schema();
    org.apache.avro.Schema.Type type55 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema56 = org.apache.avro.Schema.create(type55);
    org.apache.avro.Schema.Field field58 = new org.apache.avro.Schema.Field("long", schema56, "");
    org.apache.avro.Schema.Type type59 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema60 = org.apache.avro.Schema.create(type59);
    org.apache.avro.Schema.Parser parser61 = new org.apache.avro.Schema.Parser();
    boolean boolean62 = schema60.equals((Object) parser61);
    org.apache.avro.Schema.Field field63 = new org.apache.avro.Schema.Field(field58, schema60);
    org.apache.avro.Schema.Field[] fieldArray64 = new org.apache.avro.Schema.Field[] { field4, field11, field18,
        field30, field35, field42, field52, field63 };
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList65 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean66 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList65,
        fieldArray64);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema67 = org.apache.avro.Schema
          .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList65);
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Duplicate field long in record null: long type:LONG pos:1 and long type:LONG pos:0.");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type1 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type1.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema2);
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "long type:LONG pos:-1" + "'", str5, "long type:LONG pos:-1");
    org.junit.Assert.assertNotNull(strMap6);
    org.junit.Assert.assertTrue("'" + type8 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type8.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema9);
    org.junit.Assert.assertNotNull(schema12);
    org.junit.Assert.assertNull(obj13);
    org.junit.Assert.assertTrue("'" + type15 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type15.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema16);
    org.junit.Assert.assertNotNull(schema19);
    org.junit.Assert.assertEquals("'" + str20 + "' != '" + "long type:LONG pos:-1" + "'", str20,
        "long type:LONG pos:-1");
    org.junit.Assert.assertTrue("'" + type22 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type22.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema23);
    org.junit.Assert.assertTrue("'" + type26 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type26.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema27);
    org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    org.junit.Assert.assertTrue("'" + type32 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type32.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema33);
    org.junit.Assert.assertNotNull(schema36);
    org.junit.Assert.assertEquals("'" + str37 + "' != '" + "long type:LONG pos:-1" + "'", str37,
        "long type:LONG pos:-1");
    org.junit.Assert.assertTrue("'" + type39 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type39.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema40);
    org.junit.Assert.assertTrue("'" + type43 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type43.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema44);
    org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    org.junit.Assert.assertTrue("'" + type49 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type49.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema50);
    org.junit.Assert.assertNotNull(schema53);
    org.junit.Assert.assertTrue("'" + type55 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type55.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema56);
    org.junit.Assert.assertTrue("'" + type59 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type59.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema60);
    org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    org.junit.Assert.assertNotNull(fieldArray64);
    org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
  }

  @Test
  public void test060() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test060");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    org.apache.avro.Schema.Parser parser2 = new org.apache.avro.Schema.Parser();
    boolean boolean3 = schema1.equals((Object) parser2);
    com.fasterxml.jackson.databind.JsonNode jsonNode4 = null;
    boolean boolean5 = schema1.isValidDefault(jsonNode4);
    // The following exception was thrown during execution in test generation
    try {
      boolean boolean6 = schema1.isError();
      org.junit.Assert
          .fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: \"long\"");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
  }

  @Test
  public void test061() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test061");
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("hi!",
          "{\n  \"type\" : \"long\",\n  \"hi!\" : \"record\"\n}",
          "{\n  \"type\" : \"long\",\n  \"hi!\" : \"record\"\n}", false);
      org.junit.Assert
          .fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal character in: hi!");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
  }

  @Test
  public void test062() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test062");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    org.apache.avro.Schema.Parser parser2 = new org.apache.avro.Schema.Parser();
    boolean boolean3 = schema1.equals((Object) parser2);
    String str4 = schema1.toString();
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema.Field field6 = schema1.getField("{\n  \"type\" : \"long\",\n  \"hi!\" : \"record\"\n}");
      org.junit.Assert
          .fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: \"long\"");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"long\"" + "'", str4, "\"long\"");
  }

  @Test
  public void test063() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test063");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    org.apache.avro.Schema.Parser parser2 = new org.apache.avro.Schema.Parser();
    boolean boolean3 = schema1.equals((Object) parser2);
    schema1.addProp("{\"type\":\"long\",\"hi!\":\"record\"}", (Object) 10.0d);
    // The following exception was thrown during execution in test generation
    try {
      String str7 = schema1.getEnumDefault();
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: {\"type\":\"long\",\"{\\\"type\\\":\\\"long\\\",\\\"hi!\\\":\\\"record\\\"}\":10.0}");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
  }

  @Test
  public void test064() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test064");
    org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("{\"type\":\"long\",\"hi!\":\"record\"}");
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema.Field field4 = new org.apache.avro.Schema.Field("", schema2, "array");
      org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Empty name");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(schema2);
  }

  @Test
  public void test065() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test065");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    String str2 = schema1.toString();
    boolean boolean3 = schema1.isNullable();
    // The following exception was thrown during execution in test generation
    try {
      String str4 = schema1.getEnumDefault();
      org.junit.Assert
          .fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: \"long\"");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"long\"" + "'", str2, "\"long\"");
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
  }

  @Test
  public void test066() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test066");
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("\"long\"", "long type:LONG pos:-1", "array",
          10);
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: \"long\"");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
  }

  @Test
  public void test067() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test067");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    String str2 = schema1.getFullName();
    schema1.addProp("hi!", (Object) "record");
    org.apache.avro.Schema.Type type6 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema7 = org.apache.avro.Schema.create(type6);
    org.apache.avro.Schema.Parser parser8 = new org.apache.avro.Schema.Parser();
    boolean boolean9 = schema7.equals((Object) parser8);
    schema7.addProp("", "long");
    org.apache.avro.Schema schema13 = org.apache.avro.Schema.applyAliases(schema1, schema7);
    Object obj14 = null;
    org.apache.avro.Schema.SeenPair seenPair15 = new org.apache.avro.Schema.SeenPair((Object) schema1, obj14);
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "long" + "'", str2, "long");
    org.junit.Assert.assertTrue("'" + type6 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type6.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema7);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    org.junit.Assert.assertNotNull(schema13);
  }

  @Test
  public void test068() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test068");
    org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("record", "long", "record", true);
    // The following exception was thrown during execution in test generation
    try {
      int int6 = schema4.getEnumOrdinal("array");
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: {\"type\":\"error\",\"name\":\"record\",\"namespace\":\"record\",\"doc\":\"long\"}");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(schema4);
  }

  @Test
  public void test069() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test069");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    String str2 = schema1.getFullName();
    schema1.addProp("hi!", (Object) "record");
    String str6 = schema1.getFullName();
    com.fasterxml.jackson.databind.JsonNode jsonNode7 = null;
    boolean boolean8 = schema1.isValidDefault(jsonNode7);
    // The following exception was thrown during execution in test generation
    try {
      boolean boolean9 = schema1.isError();
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: {\"type\":\"long\",\"hi!\":\"record\"}");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "long" + "'", str2, "long");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "long" + "'", str6, "long");
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
  }

  @Test
  public void test070() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test070");
    org.apache.avro.NameValidator nameValidator0 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.Schema.setNameValidator(nameValidator0);
    org.apache.avro.Schema.setNameValidator(nameValidator0);
    org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser(nameValidator0);
    org.apache.avro.Schema.Type type4 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema5 = org.apache.avro.Schema.create(type4);
    String str6 = schema5.getFullName();
    schema5.addProp("hi!", (Object) "record");
    org.apache.avro.Schema.Type type10 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema11 = org.apache.avro.Schema.create(type10);
    String str12 = schema11.getFullName();
    org.apache.avro.Schema.Type type13 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema14 = org.apache.avro.Schema.create(type13);
    org.apache.avro.Schema.Parser parser15 = new org.apache.avro.Schema.Parser();
    boolean boolean16 = schema14.equals((Object) parser15);
    String str17 = schema14.toString();
    org.apache.avro.Schema.Type type18 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema19 = org.apache.avro.Schema.create(type18);
    String str20 = schema19.getFullName();
    schema19.addProp("hi!", (Object) "record");
    org.apache.avro.Schema[] schemaArray24 = new org.apache.avro.Schema[] { schema11, schema14, schema19 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList25 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean26 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList25,
        schemaArray24);
    String str28 = schema5.toString((java.util.Collection<org.apache.avro.Schema>) schemaList25, true);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema.Parser parser29 = parser3.addTypes((Iterable<org.apache.avro.Schema>) schemaList25);
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroTypeException; message: You can only put a named schema into the context");
    } catch (org.apache.avro.AvroTypeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(nameValidator0);
    org.junit.Assert.assertTrue("'" + type4 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type4.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "long" + "'", str6, "long");
    org.junit.Assert.assertTrue("'" + type10 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type10.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema11);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "long" + "'", str12, "long");
    org.junit.Assert.assertTrue("'" + type13 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type13.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema14);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"long\"" + "'", str17, "\"long\"");
    org.junit.Assert.assertTrue("'" + type18 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type18.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema19);
    org.junit.Assert.assertEquals("'" + str20 + "' != '" + "long" + "'", str20, "long");
    org.junit.Assert.assertNotNull(schemaArray24);
    org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    org.junit.Assert.assertEquals("'" + str28 + "' != '" + "{\n  \"type\" : \"long\",\n  \"hi!\" : \"record\"\n}" + "'",
        str28, "{\n  \"type\" : \"long\",\n  \"hi!\" : \"record\"\n}");
  }

  @Test
  public void test071() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test071");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    String str2 = schema1.getFullName();
    schema1.addProp("hi!", (Object) "record");
    org.apache.avro.Schema.Type type6 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema7 = org.apache.avro.Schema.create(type6);
    org.apache.avro.Schema.Parser parser8 = new org.apache.avro.Schema.Parser();
    boolean boolean9 = schema7.equals((Object) parser8);
    schema7.addProp("", "long");
    org.apache.avro.Schema schema13 = org.apache.avro.Schema.applyAliases(schema1, schema7);
    // The following exception was thrown during execution in test generation
    try {
      String str14 = schema13.getNamespace();
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: {\"type\":\"long\",\"hi!\":\"record\"}");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "long" + "'", str2, "long");
    org.junit.Assert.assertTrue("'" + type6 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type6.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema7);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    org.junit.Assert.assertNotNull(schema13);
  }

  @Test
  public void test072() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test072");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    String str2 = schema1.getFullName();
    schema1.addProp("record", (Object) 10.0d);
    String str7 = schema1.getProp("record");
    String str8 = schema1.toString();
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "long" + "'", str2, "long");
    org.junit.Assert.assertNull(str7);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{\"type\":\"long\",\"record\":10.0}" + "'", str8,
        "{\"type\":\"long\",\"record\":10.0}");
  }

  @Test
  public void test073() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test073");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.STRING;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.STRING + "'",
        type0.equals(org.apache.avro.Schema.Type.STRING));
    org.junit.Assert.assertNotNull(schema1);
  }

  @Test
  public void test074() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test074");
    Object obj1 = org.apache.avro.Schema.parseJsonToObject("\"long\"");
    org.junit.Assert.assertEquals("'" + obj1 + "' != '" + "long" + "'", obj1, "long");
  }

  @Test
  public void test075() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test075");
    org.apache.avro.NameValidator nameValidator0 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.Schema.setNameValidator(nameValidator0);
    org.apache.avro.Schema.Parser parser2 = new org.apache.avro.Schema.Parser(nameValidator0);
    String[] strArray7 = new String[] { "hi!", "{\"type\":\"long\",\"record\":10.0}",
        "{\n  \"type\" : \"long\",\n  \"hi!\" : \"record\"\n}" };
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema8 = parser2.parse("long", strArray7);
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.SchemaParseException; message: com.fasterxml.jackson.core.JsonParseException: Unrecognized token 'longhi': was expecting (JSON String, Number, Array, Object or token 'null', 'true' or 'false')? at [Source: REDACTED (`StreamReadFeature.INCLUDE_SOURCE_IN_LOCATION` disabled); line: 1, column: 1]");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(nameValidator0);
    org.junit.Assert.assertNotNull(strArray7);
    org.junit.Assert.assertArrayEquals(strArray7, new String[] { "hi!", "{\"type\":\"long\",\"record\":10.0}",
        "{\n  \"type\" : \"long\",\n  \"hi!\" : \"record\"\n}" });
  }

  @Test
  public void test076() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test076");
    org.apache.avro.NameValidator nameValidator0 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.Schema.setNameValidator(nameValidator0);
    org.apache.avro.Schema.setNameValidator(nameValidator0);
    org.apache.avro.Schema.setNameValidator(nameValidator0);
    org.junit.Assert.assertNotNull(nameValidator0);
  }

  @Test
  public void test077() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test077");
    org.apache.avro.Schema.Type type1 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema2 = org.apache.avro.Schema.create(type1);
    org.apache.avro.Schema.Field field4 = new org.apache.avro.Schema.Field("long", schema2, "");
    org.apache.avro.Schema schema5 = field4.schema();
    java.util.Set<String> strSet6 = field4.aliases();
    org.junit.Assert.assertTrue("'" + type1 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type1.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema2);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertNotNull(strSet6);
  }

  @Test
  public void test078() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test078");
    org.apache.avro.NameValidator nameValidator0 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.Schema.setNameValidator(nameValidator0);
    org.apache.avro.Schema.setNameValidator(nameValidator0);
    org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser(nameValidator0);
    org.apache.avro.Schema schema5 = parser3.parse("{\n  \"type\" : \"long\",\n  \"hi!\" : \"record\"\n}");
    java.util.Map<String, org.apache.avro.Schema> strMap6 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema.Parser parser7 = parser3.addTypes(strMap6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Map.values()\" because \"types\" is null");
    } catch (NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(nameValidator0);
    org.junit.Assert.assertNotNull(schema5);
  }

  @Test
  public void test079() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test079");
    org.apache.avro.Schema.Type type1 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema2 = org.apache.avro.Schema.create(type1);
    org.apache.avro.Schema.Field field4 = new org.apache.avro.Schema.Field("long", schema2, "");
    org.apache.avro.Schema.Type type5 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema6 = org.apache.avro.Schema.create(type5);
    org.apache.avro.Schema.Parser parser7 = new org.apache.avro.Schema.Parser();
    boolean boolean8 = schema6.equals((Object) parser7);
    org.apache.avro.Schema.Field field9 = new org.apache.avro.Schema.Field(field4, schema6);
    org.apache.avro.Schema.Type type11 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema12 = org.apache.avro.Schema.create(type11);
    org.apache.avro.Schema.Field field14 = new org.apache.avro.Schema.Field("long", schema12, "");
    org.apache.avro.Schema.Type type15 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema16 = org.apache.avro.Schema.create(type15);
    org.apache.avro.Schema.Parser parser17 = new org.apache.avro.Schema.Parser();
    boolean boolean18 = schema16.equals((Object) parser17);
    org.apache.avro.Schema.Field field19 = new org.apache.avro.Schema.Field(field14, schema16);
    boolean boolean21 = field19.equals((Object) 1.0d);
    field19.addAlias("");
    org.apache.avro.Schema.Type type25 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema26 = org.apache.avro.Schema.create(type25);
    org.apache.avro.Schema.Field field28 = new org.apache.avro.Schema.Field("long", schema26, "");
    org.apache.avro.Schema.Field[] fieldArray29 = new org.apache.avro.Schema.Field[] { field19, field28 };
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList30 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean31 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList30,
        fieldArray29);
    // The following exception was thrown during execution in test generation
    try {
      schema6.setFields((java.util.List<org.apache.avro.Schema.Field>) fieldList30);
      org.junit.Assert
          .fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: \"long\"");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type1 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type1.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema2);
    org.junit.Assert.assertTrue("'" + type5 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type5.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    org.junit.Assert.assertTrue("'" + type11 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type11.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema12);
    org.junit.Assert.assertTrue("'" + type15 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type15.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema16);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    org.junit.Assert.assertTrue("'" + type25 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type25.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema26);
    org.junit.Assert.assertNotNull(fieldArray29);
    org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
  }

  @Test
  public void test080() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test080");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    String str2 = schema1.toString();
    boolean boolean3 = schema1.isNullable();
    org.apache.avro.LogicalType logicalType4 = schema1.getLogicalType();
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"long\"" + "'", str2, "\"long\"");
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    org.junit.Assert.assertNull(logicalType4);
  }

  @Test
  public void test081() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test081");
    org.apache.avro.NameValidator nameValidator0 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.Schema.setNameValidator(nameValidator0);
    org.apache.avro.Schema.setNameValidator(nameValidator0);
    org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser(nameValidator0);
    java.util.Map<String, org.apache.avro.Schema> strMap4 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema.Parser parser5 = parser3.addTypes(strMap4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Map.values()\" because \"types\" is null");
    } catch (NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(nameValidator0);
  }

  @Test
  public void test082() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test082");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    String str2 = schema1.getFullName();
    schema1.addProp("hi!", (Object) "record");
    org.apache.avro.Schema.Type type6 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema7 = org.apache.avro.Schema.create(type6);
    String str8 = schema7.getFullName();
    org.apache.avro.Schema.Type type9 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema10 = org.apache.avro.Schema.create(type9);
    org.apache.avro.Schema.Parser parser11 = new org.apache.avro.Schema.Parser();
    boolean boolean12 = schema10.equals((Object) parser11);
    String str13 = schema10.toString();
    org.apache.avro.Schema.Type type14 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema15 = org.apache.avro.Schema.create(type14);
    String str16 = schema15.getFullName();
    schema15.addProp("hi!", (Object) "record");
    org.apache.avro.Schema[] schemaArray20 = new org.apache.avro.Schema[] { schema7, schema10, schema15 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList21 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList21,
        schemaArray20);
    String str24 = schema1.toString((java.util.Collection<org.apache.avro.Schema>) schemaList21, true);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema25 = org.apache.avro.Schema
          .createUnion((java.util.List<org.apache.avro.Schema>) schemaList21);
      org.junit.Assert
          .fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Duplicate in union:long");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "long" + "'", str2, "long");
    org.junit.Assert.assertTrue("'" + type6 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type6.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema7);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "long" + "'", str8, "long");
    org.junit.Assert.assertTrue("'" + type9 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type9.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema10);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"long\"" + "'", str13, "\"long\"");
    org.junit.Assert.assertTrue("'" + type14 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type14.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema15);
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "long" + "'", str16, "long");
    org.junit.Assert.assertNotNull(schemaArray20);
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    org.junit.Assert.assertEquals("'" + str24 + "' != '" + "{\n  \"type\" : \"long\",\n  \"hi!\" : \"record\"\n}" + "'",
        str24, "{\n  \"type\" : \"long\",\n  \"hi!\" : \"record\"\n}");
  }

  @Test
  public void test083() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test083");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    String str2 = schema1.getFullName();
    schema1.addProp("hi!", (Object) "record");
    String str6 = schema1.getFullName();
    com.fasterxml.jackson.databind.JsonNode jsonNode7 = null;
    boolean boolean8 = schema1.isValidDefault(jsonNode7);
    org.apache.avro.Schema.Type type9 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema10 = org.apache.avro.Schema.create(type9);
    schema1.addAllProps((org.apache.avro.JsonProperties) schema10);
    // The following exception was thrown during execution in test generation
    try {
      boolean boolean12 = schema1.isError();
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: {\"type\":\"long\",\"hi!\":\"record\"}");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "long" + "'", str2, "long");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "long" + "'", str6, "long");
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    org.junit.Assert.assertTrue("'" + type9 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type9.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema10);
  }

  @Test
  public void test084() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test084");
    org.apache.avro.Schema.Type type1 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema2 = org.apache.avro.Schema.create(type1);
    org.apache.avro.Schema.Field field4 = new org.apache.avro.Schema.Field("long", schema2, "");
    org.apache.avro.Schema schema5 = field4.schema();
    field4.addAlias("{\"type\":\"long\",\"hi!\":\"record\"}");
    org.junit.Assert.assertTrue("'" + type1 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type1.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema2);
    org.junit.Assert.assertNotNull(schema5);
  }

  @Test
  public void test085() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test085");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    String str2 = schema1.toString();
    boolean boolean3 = schema1.isNullable();
    boolean boolean4 = schema1.isNullable();
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"long\"" + "'", str2, "\"long\"");
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
  }

  @Test
  public void test086() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test086");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    org.apache.avro.Schema.Parser parser2 = new org.apache.avro.Schema.Parser();
    boolean boolean3 = schema1.equals((Object) parser2);
    String str4 = schema1.toString();
    boolean boolean5 = schema1.hasProps();
    String str6 = schema1.getDoc();
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema7 = schema1.getElementType();
      org.junit.Assert
          .fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an array: \"long\"");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"long\"" + "'", str4, "\"long\"");
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    org.junit.Assert.assertNull(str6);
  }

  @Test
  public void test087() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test087");
    org.apache.avro.NameValidator nameValidator0 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.Schema.setNameValidator(nameValidator0);
    org.apache.avro.Schema.Parser parser2 = new org.apache.avro.Schema.Parser(nameValidator0);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema4 = parser2.parse("long");
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.SchemaParseException; message: com.fasterxml.jackson.core.JsonParseException: Unrecognized token 'long': was expecting (JSON String, Number, Array, Object or token 'null', 'true' or 'false')? at [Source: REDACTED (`StreamReadFeature.INCLUDE_SOURCE_IN_LOCATION` disabled); line: 1, column: 1]");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(nameValidator0);
  }

  @Test
  public void test088() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test088");
    boolean boolean0 = org.apache.avro.Schema.getValidateDefaults();
    org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + true + "'", boolean0 == true);
  }

  @Test
  public void test089() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test089");
    org.apache.avro.Schema.Type type1 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema2 = org.apache.avro.Schema.create(type1);
    org.apache.avro.Schema.Field field4 = new org.apache.avro.Schema.Field("long", schema2, "");
    org.apache.avro.Schema.Type type5 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema6 = org.apache.avro.Schema.create(type5);
    org.apache.avro.Schema.Parser parser7 = new org.apache.avro.Schema.Parser();
    boolean boolean8 = schema6.equals((Object) parser7);
    org.apache.avro.Schema.Field field9 = new org.apache.avro.Schema.Field(field4, schema6);
    Class<?> wildcardClass10 = schema6.getClass();
    org.junit.Assert.assertTrue("'" + type1 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type1.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema2);
    org.junit.Assert.assertTrue("'" + type5 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type5.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    org.junit.Assert.assertNotNull(wildcardClass10);
  }

  @Test
  public void test090() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test090");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    org.apache.avro.Schema.Parser parser2 = new org.apache.avro.Schema.Parser();
    boolean boolean3 = schema1.equals((Object) parser2);
    schema1.addProp("", "long");
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema.Field field8 = schema1.getField("{\"type\":\"long\",\"record\":10.0}");
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: {\"type\":\"long\",\"\":\"long\"}");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
  }

  @Test
  public void test091() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test091");
    org.apache.avro.NameValidator nameValidator0 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.Schema.setNameValidator(nameValidator0);
    org.apache.avro.Schema.Parser parser2 = new org.apache.avro.Schema.Parser(nameValidator0);
    java.util.Map<String, org.apache.avro.Schema> strMap3 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema.Parser parser4 = parser2.addTypes(strMap3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Map.values()\" because \"types\" is null");
    } catch (NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(nameValidator0);
  }

  @Test
  public void test092() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test092");
    org.apache.avro.Schema.Type type2 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema3 = org.apache.avro.Schema.create(type2);
    org.apache.avro.Schema.Field field5 = new org.apache.avro.Schema.Field("long", schema3, "");
    org.apache.avro.Schema schema6 = field5.schema();
    org.apache.avro.Schema schema7 = field5.schema();
    org.apache.avro.Schema.Type type9 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema10 = org.apache.avro.Schema.create(type9);
    String str11 = schema10.getFullName();
    schema10.addProp("hi!", (Object) "record");
    org.apache.avro.Schema.Type type15 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema16 = org.apache.avro.Schema.create(type15);
    org.apache.avro.Schema.Parser parser17 = new org.apache.avro.Schema.Parser();
    boolean boolean18 = schema16.equals((Object) parser17);
    schema16.addProp("", "long");
    org.apache.avro.Schema schema22 = org.apache.avro.Schema.applyAliases(schema10, schema16);
    org.apache.avro.LogicalType logicalType23 = schema22.getLogicalType();
    org.apache.avro.Schema.Field.Order order24 = org.apache.avro.Schema.Field.Order.IGNORE;
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema.Field field25 = new org.apache.avro.Schema.Field("", schema7, "array", (Object) schema22,
          order24);
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Unknown datum class: class org.apache.avro.Schema$LongSchema");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type2 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type2.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema3);
    org.junit.Assert.assertNotNull(schema6);
    org.junit.Assert.assertNotNull(schema7);
    org.junit.Assert.assertTrue("'" + type9 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type9.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema10);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "long" + "'", str11, "long");
    org.junit.Assert.assertTrue("'" + type15 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type15.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema16);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    org.junit.Assert.assertNotNull(schema22);
    org.junit.Assert.assertNull(logicalType23);
    org.junit.Assert.assertTrue("'" + order24 + "' != '" + org.apache.avro.Schema.Field.Order.IGNORE + "'",
        order24.equals(org.apache.avro.Schema.Field.Order.IGNORE));
  }

  @Test
  public void test093() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test093");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    String str2 = schema1.getFullName();
    boolean boolean3 = schema1.isUnion();
    org.apache.avro.Schema.Type type4 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema5 = org.apache.avro.Schema.create(type4);
    String str6 = schema5.toString();
    boolean boolean7 = schema5.isNullable();
    schema1.putAll((org.apache.avro.JsonProperties) schema5);
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "long" + "'", str2, "long");
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    org.junit.Assert.assertTrue("'" + type4 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type4.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"long\"" + "'", str6, "\"long\"");
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
  }

  @Test
  public void test094() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test094");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    String str2 = schema1.toString();
    boolean boolean3 = schema1.isNullable();
    org.apache.avro.Schema.Type type5 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema6 = org.apache.avro.Schema.create(type5);
    org.apache.avro.Schema.Field field8 = new org.apache.avro.Schema.Field("long", schema6, "");
    org.apache.avro.Schema schema9 = field8.schema();
    org.apache.avro.Schema schema10 = field8.schema();
    schema1.addAllProps((org.apache.avro.JsonProperties) schema10);
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"long\"" + "'", str2, "\"long\"");
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    org.junit.Assert.assertTrue("'" + type5 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type5.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema6);
    org.junit.Assert.assertNotNull(schema9);
    org.junit.Assert.assertNotNull(schema10);
  }

  @Test
  public void test095() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test095");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    String str2 = schema1.getFullName();
    schema1.addProp("hi!", (Object) "record");
    String str6 = schema1.toString();
    java.util.function.BiConsumer<String, Object> strBiConsumer7 = null;
    // The following exception was thrown during execution in test generation
    try {
      schema1.forEachProperty(strBiConsumer7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiConsumer.accept(Object, Object)\" because \"consumer\" is null");
    } catch (NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "long" + "'", str2, "long");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{\"type\":\"long\",\"hi!\":\"record\"}" + "'", str6,
        "{\"type\":\"long\",\"hi!\":\"record\"}");
  }

  @Test
  public void test096() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test096");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    String str2 = schema1.getFullName();
    schema1.addProp("hi!", (Object) "record");
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema6 = schema1.getElementType();
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an array: {\"type\":\"long\",\"hi!\":\"record\"}");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "long" + "'", str2, "long");
  }

  @Test
  public void test097() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test097");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    org.apache.avro.Schema.Parser parser2 = new org.apache.avro.Schema.Parser();
    boolean boolean3 = schema1.equals((Object) parser2);
    schema1.addProp("{\"type\":\"long\",\"hi!\":\"record\"}", (Object) 10.0d);
    boolean boolean7 = schema1.isNullable();
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema.Field field9 = schema1.getField("hi!");
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: {\"type\":\"long\",\"{\\\"type\\\":\\\"long\\\",\\\"hi!\\\":\\\"record\\\"}\":10.0}");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
  }

  @Test
  public void test098() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test098");
    org.apache.avro.Schema.Type type1 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema2 = org.apache.avro.Schema.create(type1);
    org.apache.avro.Schema.Field field4 = new org.apache.avro.Schema.Field("long", schema2, "");
    field4.addAlias("long");
    field4.addAlias("{\"type\":\"long\",\"hi!\":\"record\"}");
    org.junit.Assert.assertTrue("'" + type1 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type1.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema2);
  }

  @Test
  public void test099() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test099");
    org.apache.avro.Schema.Type type1 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema2 = org.apache.avro.Schema.create(type1);
    org.apache.avro.Schema.Field field4 = new org.apache.avro.Schema.Field("long", schema2, "");
    org.apache.avro.Schema.Type type5 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema6 = org.apache.avro.Schema.create(type5);
    org.apache.avro.Schema.Parser parser7 = new org.apache.avro.Schema.Parser();
    boolean boolean8 = schema6.equals((Object) parser7);
    org.apache.avro.Schema.Field field9 = new org.apache.avro.Schema.Field(field4, schema6);
    boolean boolean11 = field9.equals((Object) 1.0d);
    field9.addAlias("");
    int int14 = field9.pos();
    org.junit.Assert.assertTrue("'" + type1 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type1.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema2);
    org.junit.Assert.assertTrue("'" + type5 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type5.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
  }

  @Test
  public void test100() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test100");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    org.apache.avro.Schema.Parser parser2 = new org.apache.avro.Schema.Parser();
    boolean boolean3 = schema1.equals((Object) parser2);
    org.apache.avro.Schema schema5 = parser2.parseInternal("{\"type\":\"long\",\"hi!\":\"record\"}");
    java.io.InputStream inputStream6 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema7 = parser2.parse(inputStream6);
      org.junit.Assert
          .fail("Expected exception of type org.apache.avro.SchemaParseException; message: Cannot parse <null> schema");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    org.junit.Assert.assertNotNull(schema5);
  }

  @Test
  public void test101() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test101");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    org.apache.avro.Schema.Parser parser2 = new org.apache.avro.Schema.Parser();
    boolean boolean3 = schema1.equals((Object) parser2);
    com.fasterxml.jackson.databind.JsonNode jsonNode4 = null;
    boolean boolean5 = schema1.isValidDefault(jsonNode4);
    Object obj7 = schema1.getObjectProp("record");
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema8 = schema1.getElementType();
      org.junit.Assert
          .fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an array: \"long\"");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    org.junit.Assert.assertNull(obj7);
  }

  @Test
  public void test102() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test102");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    String str2 = schema1.toString();
    // The following exception was thrown during execution in test generation
    try {
      int int3 = schema1.getFixedSize();
      org.junit.Assert
          .fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not fixed: \"long\"");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"long\"" + "'", str2, "\"long\"");
  }

  @Test
  public void test103() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test103");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    org.apache.avro.Schema.Parser parser2 = new org.apache.avro.Schema.Parser();
    boolean boolean3 = schema1.equals((Object) parser2);
    com.fasterxml.jackson.databind.JsonNode jsonNode4 = null;
    boolean boolean5 = schema1.isValidDefault(jsonNode4);
    Object obj7 = schema1.getObjectProp("record");
    org.apache.avro.LogicalType logicalType8 = schema1.getLogicalType();
    String str9 = schema1.getDoc();
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    org.junit.Assert.assertNull(obj7);
    org.junit.Assert.assertNull(logicalType8);
    org.junit.Assert.assertNull(str9);
  }

  @Test
  public void test104() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test104");
    org.apache.avro.Schema.Type type1 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema2 = org.apache.avro.Schema.create(type1);
    org.apache.avro.Schema.Field field4 = new org.apache.avro.Schema.Field("long", schema2, "");
    org.apache.avro.Schema schema5 = field4.schema();
    Object obj6 = field4.defaultVal();
    org.apache.avro.Schema schema7 = field4.schema();
    java.util.Set<String> strSet8 = field4.aliases();
    org.junit.Assert.assertTrue("'" + type1 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type1.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema2);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertNull(obj6);
    org.junit.Assert.assertNotNull(schema7);
    org.junit.Assert.assertNotNull(strSet8);
  }

  @Test
  public void test105() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test105");
    org.apache.avro.Schema.Type type1 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema2 = org.apache.avro.Schema.create(type1);
    org.apache.avro.Schema.Field field4 = new org.apache.avro.Schema.Field("long", schema2, "");
    org.apache.avro.Schema.Type type5 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema6 = org.apache.avro.Schema.create(type5);
    org.apache.avro.Schema.Parser parser7 = new org.apache.avro.Schema.Parser();
    boolean boolean8 = schema6.equals((Object) parser7);
    org.apache.avro.Schema.Field field9 = new org.apache.avro.Schema.Field(field4, schema6);
    field4.addProp("record", "");
    field4.addAlias("long type:LONG pos:-1");
    org.junit.Assert.assertTrue("'" + type1 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type1.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema2);
    org.junit.Assert.assertTrue("'" + type5 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type5.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
  }

  @Test
  public void test106() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test106");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    String str2 = schema1.getFullName();
    schema1.addProp("hi!", (Object) "record");
    org.apache.avro.Schema.Type type6 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema7 = org.apache.avro.Schema.create(type6);
    String str8 = schema7.getFullName();
    org.apache.avro.Schema.Type type9 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema10 = org.apache.avro.Schema.create(type9);
    org.apache.avro.Schema.Parser parser11 = new org.apache.avro.Schema.Parser();
    boolean boolean12 = schema10.equals((Object) parser11);
    String str13 = schema10.toString();
    org.apache.avro.Schema.Type type14 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema15 = org.apache.avro.Schema.create(type14);
    String str16 = schema15.getFullName();
    schema15.addProp("hi!", (Object) "record");
    org.apache.avro.Schema[] schemaArray20 = new org.apache.avro.Schema[] { schema7, schema10, schema15 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList21 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList21,
        schemaArray20);
    String str24 = schema1.toString((java.util.Collection<org.apache.avro.Schema>) schemaList21, true);
    String str25 = schema1.getDoc();
    boolean boolean27 = schema1.propsContainsKey("hi!");
    // The following exception was thrown during execution in test generation
    try {
      schema1.addAlias("{\"type\":\"long\",\"hi!\":\"record\"}");
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: {\"type\":\"long\",\"hi!\":\"record\"}");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "long" + "'", str2, "long");
    org.junit.Assert.assertTrue("'" + type6 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type6.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema7);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "long" + "'", str8, "long");
    org.junit.Assert.assertTrue("'" + type9 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type9.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema10);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"long\"" + "'", str13, "\"long\"");
    org.junit.Assert.assertTrue("'" + type14 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type14.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema15);
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "long" + "'", str16, "long");
    org.junit.Assert.assertNotNull(schemaArray20);
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    org.junit.Assert.assertEquals("'" + str24 + "' != '" + "{\n  \"type\" : \"long\",\n  \"hi!\" : \"record\"\n}" + "'",
        str24, "{\n  \"type\" : \"long\",\n  \"hi!\" : \"record\"\n}");
    org.junit.Assert.assertNull(str25);
    org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
  }

  @Test
  public void test107() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test107");
    org.apache.avro.NameValidator nameValidator0 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.Schema.setNameValidator(nameValidator0);
    org.apache.avro.Schema.setNameValidator(nameValidator0);
    org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser(nameValidator0);
    org.apache.avro.Schema schema5 = parser3.parse("{\n  \"type\" : \"long\",\n  \"hi!\" : \"record\"\n}");
    String[] strArray11 = new String[] { "{\n  \"type\" : \"long\",\n  \"hi!\" : \"record\"\n}", "hi!",
        "{\n  \"type\" : \"long\",\n  \"hi!\" : \"record\"\n}",
        "{\n  \"type\" : \"long\",\n  \"hi!\" : \"record\"\n}" };
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema12 = parser3.parse("{\"type\":\"long\",\"record\":10.0}", strArray11);
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.SchemaParseException; message: dangling content after end of schema: {?  \"type\" : \"long\",?  \"hi!\" : \"record\"?}hi!{?  \"type\" : \"long\",?  \"hi!\" : \"record\"?}{?  \"type\" : \"long\",?  \"hi!\" : \"record\"?}");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(nameValidator0);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertNotNull(strArray11);
    org.junit.Assert.assertArrayEquals(strArray11,
        new String[] { "{\n  \"type\" : \"long\",\n  \"hi!\" : \"record\"\n}", "hi!",
            "{\n  \"type\" : \"long\",\n  \"hi!\" : \"record\"\n}",
            "{\n  \"type\" : \"long\",\n  \"hi!\" : \"record\"\n}" });
  }

  @Test
  public void test108() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test108");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    org.apache.avro.Schema.Parser parser2 = new org.apache.avro.Schema.Parser();
    boolean boolean3 = schema1.equals((Object) parser2);
    org.apache.avro.Schema.SeenPair seenPair5 = new org.apache.avro.Schema.SeenPair((Object) boolean3,
        (Object) (short) 100);
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
  }

  @Test
  public void test109() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test109");
    org.apache.avro.Schema.SeenPair seenPair2 = new org.apache.avro.Schema.SeenPair((Object) (-1L), (Object) 100.0f);
    boolean boolean4 = seenPair2.equals((Object) 0.0f);
    org.apache.avro.Schema.Type type5 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema6 = org.apache.avro.Schema.create(type5);
    String str7 = schema6.getFullName();
    schema6.addProp("record", (Object) 10.0d);
    String str12 = schema6.getProp("record");
    String str14 = schema6.toString(false);
    boolean boolean15 = seenPair2.equals((Object) schema6);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    org.junit.Assert.assertTrue("'" + type5 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type5.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema6);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "long" + "'", str7, "long");
    org.junit.Assert.assertNull(str12);
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{\"type\":\"long\",\"record\":10.0}" + "'", str14,
        "{\"type\":\"long\",\"record\":10.0}");
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
  }

  @Test
  public void test110() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test110");
    org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
    org.apache.avro.Schema schema2 = parser0.parse("{\"type\":\"long\",\"record\":10.0}");
    org.apache.avro.Schema.Type type4 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema5 = org.apache.avro.Schema.create(type4);
    org.apache.avro.Schema.Field field7 = new org.apache.avro.Schema.Field("long", schema5, "");
    field7.addAlias("long");
    field7.addAlias("{\"type\":\"long\",\"hi!\":\"record\"}");
    org.apache.avro.Schema.Type type13 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema14 = org.apache.avro.Schema.create(type13);
    org.apache.avro.Schema.Field field16 = new org.apache.avro.Schema.Field("long", schema14, "");
    String str17 = field16.toString();
    java.util.Map<String, Object> strMap18 = field16.getObjectProps();
    org.apache.avro.Schema.Type type20 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema21 = org.apache.avro.Schema.create(type20);
    org.apache.avro.Schema.Field field23 = new org.apache.avro.Schema.Field("long", schema21, "");
    org.apache.avro.Schema.Type type24 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema25 = org.apache.avro.Schema.create(type24);
    org.apache.avro.Schema.Parser parser26 = new org.apache.avro.Schema.Parser();
    boolean boolean27 = schema25.equals((Object) parser26);
    org.apache.avro.Schema.Field field28 = new org.apache.avro.Schema.Field(field23, schema25);
    boolean boolean30 = field28.equals((Object) 1.0d);
    field28.addAlias("");
    int int33 = field28.pos();
    org.apache.avro.Schema.Type type35 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema36 = org.apache.avro.Schema.create(type35);
    org.apache.avro.Schema.Field field38 = new org.apache.avro.Schema.Field("long", schema36, "");
    org.apache.avro.Schema schema39 = field38.schema();
    Object obj40 = field38.defaultVal();
    org.apache.avro.Schema schema41 = field38.schema();
    org.apache.avro.Schema.Field[] fieldArray42 = new org.apache.avro.Schema.Field[] { field7, field16, field28,
        field38 };
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList43 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean44 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList43,
        fieldArray42);
    // The following exception was thrown during execution in test generation
    try {
      schema2.setFields((java.util.List<org.apache.avro.Schema.Field>) fieldList43);
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: {\"type\":\"long\",\"record\":10.0}");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(schema2);
    org.junit.Assert.assertTrue("'" + type4 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type4.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertTrue("'" + type13 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type13.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema14);
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "long type:LONG pos:-1" + "'", str17,
        "long type:LONG pos:-1");
    org.junit.Assert.assertNotNull(strMap18);
    org.junit.Assert.assertTrue("'" + type20 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type20.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema21);
    org.junit.Assert.assertTrue("'" + type24 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type24.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema25);
    org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    org.junit.Assert.assertTrue("'" + type35 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type35.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema36);
    org.junit.Assert.assertNotNull(schema39);
    org.junit.Assert.assertNull(obj40);
    org.junit.Assert.assertNotNull(schema41);
    org.junit.Assert.assertNotNull(fieldArray42);
    org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
  }

  @Test
  public void test111() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test111");
    org.apache.avro.Schema.Type type1 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema2 = org.apache.avro.Schema.create(type1);
    org.apache.avro.Schema.Field field4 = new org.apache.avro.Schema.Field("long", schema2, "");
    org.apache.avro.Schema.Type type5 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema6 = org.apache.avro.Schema.create(type5);
    org.apache.avro.Schema.Parser parser7 = new org.apache.avro.Schema.Parser();
    boolean boolean8 = schema6.equals((Object) parser7);
    org.apache.avro.Schema.Field field9 = new org.apache.avro.Schema.Field(field4, schema6);
    String str10 = schema6.getDoc();
    org.apache.avro.Schema.Type type11 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema12 = org.apache.avro.Schema.create(type11);
    String str13 = schema12.getFullName();
    schema12.addProp("hi!", (Object) "record");
    org.apache.avro.Schema.Type type17 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema18 = org.apache.avro.Schema.create(type17);
    String str19 = schema18.getFullName();
    org.apache.avro.Schema.Type type20 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema21 = org.apache.avro.Schema.create(type20);
    org.apache.avro.Schema.Parser parser22 = new org.apache.avro.Schema.Parser();
    boolean boolean23 = schema21.equals((Object) parser22);
    String str24 = schema21.toString();
    org.apache.avro.Schema.Type type25 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema26 = org.apache.avro.Schema.create(type25);
    String str27 = schema26.getFullName();
    schema26.addProp("hi!", (Object) "record");
    org.apache.avro.Schema[] schemaArray31 = new org.apache.avro.Schema[] { schema18, schema21, schema26 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList32 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean33 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList32,
        schemaArray31);
    String str35 = schema12.toString((java.util.Collection<org.apache.avro.Schema>) schemaList32, true);
    String str37 = schema6.toString((java.util.Collection<org.apache.avro.Schema>) schemaList32, false);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema38 = org.apache.avro.Schema
          .createUnion((java.util.List<org.apache.avro.Schema>) schemaList32);
      org.junit.Assert
          .fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Duplicate in union:long");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type1 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type1.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema2);
    org.junit.Assert.assertTrue("'" + type5 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type5.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    org.junit.Assert.assertNull(str10);
    org.junit.Assert.assertTrue("'" + type11 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type11.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema12);
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "long" + "'", str13, "long");
    org.junit.Assert.assertTrue("'" + type17 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type17.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema18);
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "long" + "'", str19, "long");
    org.junit.Assert.assertTrue("'" + type20 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type20.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema21);
    org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\"long\"" + "'", str24, "\"long\"");
    org.junit.Assert.assertTrue("'" + type25 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type25.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema26);
    org.junit.Assert.assertEquals("'" + str27 + "' != '" + "long" + "'", str27, "long");
    org.junit.Assert.assertNotNull(schemaArray31);
    org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    org.junit.Assert.assertEquals("'" + str35 + "' != '" + "{\n  \"type\" : \"long\",\n  \"hi!\" : \"record\"\n}" + "'",
        str35, "{\n  \"type\" : \"long\",\n  \"hi!\" : \"record\"\n}");
    org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\"long\"" + "'", str37, "\"long\"");
  }

  @Test
  public void test112() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test112");
    org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
    org.apache.avro.Schema schema2 = parser0.parse("{\"type\":\"long\",\"record\":10.0}");
    org.apache.avro.Schema.Type type3 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema4 = org.apache.avro.Schema.create(type3);
    String str5 = schema4.getFullName();
    schema4.addProp("hi!", (Object) "record");
    org.apache.avro.Schema.Type type9 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema10 = org.apache.avro.Schema.create(type9);
    String str11 = schema10.getFullName();
    org.apache.avro.Schema.Type type12 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema13 = org.apache.avro.Schema.create(type12);
    org.apache.avro.Schema.Parser parser14 = new org.apache.avro.Schema.Parser();
    boolean boolean15 = schema13.equals((Object) parser14);
    String str16 = schema13.toString();
    org.apache.avro.Schema.Type type17 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema18 = org.apache.avro.Schema.create(type17);
    String str19 = schema18.getFullName();
    schema18.addProp("hi!", (Object) "record");
    org.apache.avro.Schema[] schemaArray23 = new org.apache.avro.Schema[] { schema10, schema13, schema18 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList24 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean25 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList24,
        schemaArray23);
    String str27 = schema4.toString((java.util.Collection<org.apache.avro.Schema>) schemaList24, true);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema.Parser parser28 = parser0.addTypes((Iterable<org.apache.avro.Schema>) schemaList24);
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroTypeException; message: You can only put a named schema into the context");
    } catch (org.apache.avro.AvroTypeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(schema2);
    org.junit.Assert.assertTrue("'" + type3 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type3.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema4);
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "long" + "'", str5, "long");
    org.junit.Assert.assertTrue("'" + type9 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type9.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema10);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "long" + "'", str11, "long");
    org.junit.Assert.assertTrue("'" + type12 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type12.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema13);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"long\"" + "'", str16, "\"long\"");
    org.junit.Assert.assertTrue("'" + type17 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type17.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema18);
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "long" + "'", str19, "long");
    org.junit.Assert.assertNotNull(schemaArray23);
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    org.junit.Assert.assertEquals("'" + str27 + "' != '" + "{\n  \"type\" : \"long\",\n  \"hi!\" : \"record\"\n}" + "'",
        str27, "{\n  \"type\" : \"long\",\n  \"hi!\" : \"record\"\n}");
  }

  @Test
  public void test113() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test113");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    org.apache.avro.Schema.Parser parser2 = new org.apache.avro.Schema.Parser();
    boolean boolean3 = schema1.equals((Object) parser2);
    com.fasterxml.jackson.databind.JsonNode jsonNode4 = null;
    boolean boolean5 = schema1.isValidDefault(jsonNode4);
    Object obj7 = schema1.getObjectProp("record");
    org.apache.avro.Schema.Type type8 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema9 = org.apache.avro.Schema.create(type8);
    String str10 = schema9.getFullName();
    schema9.addProp("hi!", (Object) "record");
    String str14 = schema9.getFullName();
    com.fasterxml.jackson.databind.JsonNode jsonNode15 = null;
    boolean boolean16 = schema9.isValidDefault(jsonNode15);
    org.apache.avro.Schema schema17 = org.apache.avro.Schema.applyAliases(schema1, schema9);
    org.apache.avro.NameValidator nameValidator18 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.Schema.setNameValidator(nameValidator18);
    org.apache.avro.Schema.setNameValidator(nameValidator18);
    org.apache.avro.Schema.Parser parser21 = new org.apache.avro.Schema.Parser(nameValidator18);
    org.apache.avro.Schema schema23 = parser21.parse("{\n  \"type\" : \"long\",\n  \"hi!\" : \"record\"\n}");
    schema17.putAll((org.apache.avro.JsonProperties) schema23);
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    org.junit.Assert.assertNull(obj7);
    org.junit.Assert.assertTrue("'" + type8 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type8.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema9);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "long" + "'", str10, "long");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "long" + "'", str14, "long");
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    org.junit.Assert.assertNotNull(schema17);
    org.junit.Assert.assertNotNull(nameValidator18);
    org.junit.Assert.assertNotNull(schema23);
  }

  @Test
  public void test114() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test114");
    String[] strArray4 = new String[] { "{\"type\":\"long\",\"hi!\":\"record\"}" };
    java.util.ArrayList<String> strList5 = new java.util.ArrayList<String>();
    boolean boolean6 = java.util.Collections.addAll((java.util.Collection<String>) strList5, strArray4);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema7 = org.apache.avro.Schema.createEnum("string",
          "{\"type\":\"long\",\"hi!\":\"record\"}", "array", (java.util.List<String>) strList5);
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"long\",\"hi!\":\"record\"}");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(strArray4);
    org.junit.Assert.assertArrayEquals(strArray4, new String[] { "{\"type\":\"long\",\"hi!\":\"record\"}" });
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
  }

  @Test
  public void test115() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test115");
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("array", true);
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.SchemaParseException; message: com.fasterxml.jackson.core.JsonParseException: Unrecognized token 'array': was expecting (JSON String, Number, Array, Object or token 'null', 'true' or 'false')? at [Source: REDACTED (`StreamReadFeature.INCLUDE_SOURCE_IN_LOCATION` disabled); line: 1, column: 1]");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
  }

  @Test
  public void test116() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test116");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    String str2 = schema1.getFullName();
    schema1.addProp("hi!", (Object) "record");
    org.apache.avro.Schema.Type type6 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema7 = org.apache.avro.Schema.create(type6);
    String str8 = schema7.getFullName();
    org.apache.avro.Schema.Type type9 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema10 = org.apache.avro.Schema.create(type9);
    org.apache.avro.Schema.Parser parser11 = new org.apache.avro.Schema.Parser();
    boolean boolean12 = schema10.equals((Object) parser11);
    String str13 = schema10.toString();
    org.apache.avro.Schema.Type type14 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema15 = org.apache.avro.Schema.create(type14);
    String str16 = schema15.getFullName();
    schema15.addProp("hi!", (Object) "record");
    org.apache.avro.Schema[] schemaArray20 = new org.apache.avro.Schema[] { schema7, schema10, schema15 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList21 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList21,
        schemaArray20);
    String str24 = schema1.toString((java.util.Collection<org.apache.avro.Schema>) schemaList21, true);
    String str25 = schema1.getDoc();
    // The following exception was thrown during execution in test generation
    try {
      String str26 = schema1.getEnumDefault();
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: {\"type\":\"long\",\"hi!\":\"record\"}");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "long" + "'", str2, "long");
    org.junit.Assert.assertTrue("'" + type6 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type6.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema7);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "long" + "'", str8, "long");
    org.junit.Assert.assertTrue("'" + type9 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type9.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema10);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"long\"" + "'", str13, "\"long\"");
    org.junit.Assert.assertTrue("'" + type14 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type14.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema15);
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "long" + "'", str16, "long");
    org.junit.Assert.assertNotNull(schemaArray20);
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    org.junit.Assert.assertEquals("'" + str24 + "' != '" + "{\n  \"type\" : \"long\",\n  \"hi!\" : \"record\"\n}" + "'",
        str24, "{\n  \"type\" : \"long\",\n  \"hi!\" : \"record\"\n}");
    org.junit.Assert.assertNull(str25);
  }

  @Test
  public void test117() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test117");
    org.apache.avro.Schema.Type type1 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema2 = org.apache.avro.Schema.create(type1);
    org.apache.avro.Schema.Field field4 = new org.apache.avro.Schema.Field("long", schema2, "");
    org.apache.avro.Schema schema5 = field4.schema();
    Object obj6 = field4.defaultVal();
    org.apache.avro.Schema schema7 = field4.schema();
    boolean boolean8 = field4.hasDefaultValue();
    org.junit.Assert.assertTrue("'" + type1 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type1.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema2);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertNull(obj6);
    org.junit.Assert.assertNotNull(schema7);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
  }

  @Test
  public void test118() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test118");
    org.apache.avro.Schema.Type type1 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema2 = org.apache.avro.Schema.create(type1);
    org.apache.avro.Schema.Field field4 = new org.apache.avro.Schema.Field("long", schema2, "");
    org.apache.avro.Schema.Type type5 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema6 = org.apache.avro.Schema.create(type5);
    org.apache.avro.Schema.Parser parser7 = new org.apache.avro.Schema.Parser();
    boolean boolean8 = schema6.equals((Object) parser7);
    org.apache.avro.Schema.Field field9 = new org.apache.avro.Schema.Field(field4, schema6);
    String str10 = schema6.getDoc();
    // The following exception was thrown during execution in test generation
    try {
      String str11 = schema6.getEnumDefault();
      org.junit.Assert
          .fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: \"long\"");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type1 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type1.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema2);
    org.junit.Assert.assertTrue("'" + type5 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type5.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    org.junit.Assert.assertNull(str10);
  }

  @Test
  public void test119() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test119");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    String str2 = schema1.getFullName();
    org.apache.avro.NameValidator nameValidator4 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.Schema.setNameValidator(nameValidator4);
    org.apache.avro.Schema.setNameValidator(nameValidator4);
    org.apache.avro.Schema.Parser parser7 = new org.apache.avro.Schema.Parser(nameValidator4);
    Object obj8 = schema1.getObjectProp("string", (Object) parser7);
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "long" + "'", str2, "long");
    org.junit.Assert.assertNotNull(nameValidator4);
    org.junit.Assert.assertNotNull(obj8);
  }

  @Test
  public void test120() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test120");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    String str2 = schema1.getFullName();
    schema1.addProp("hi!", (Object) "record");
    String str6 = schema1.toString();
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<String> strList7 = schema1.getEnumSymbols();
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: {\"type\":\"long\",\"hi!\":\"record\"}");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "long" + "'", str2, "long");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{\"type\":\"long\",\"hi!\":\"record\"}" + "'", str6,
        "{\"type\":\"long\",\"hi!\":\"record\"}");
  }

  @Test
  public void test121() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test121");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    String str2 = schema1.getFullName();
    schema1.addProp("hi!", (Object) "record");
    String str6 = schema1.toString();
    org.apache.avro.Schema.Type type7 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema8 = org.apache.avro.Schema.create(type7);
    org.apache.avro.Schema.Parser parser9 = new org.apache.avro.Schema.Parser();
    boolean boolean10 = schema8.equals((Object) parser9);
    String str11 = schema8.toString();
    org.apache.avro.Schema.SeenPair seenPair12 = new org.apache.avro.Schema.SeenPair((Object) schema1, (Object) str11);
    com.fasterxml.jackson.databind.JsonNode jsonNode13 = null;
    boolean boolean14 = schema1.isValidDefault(jsonNode13);
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "long" + "'", str2, "long");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{\"type\":\"long\",\"hi!\":\"record\"}" + "'", str6,
        "{\"type\":\"long\",\"hi!\":\"record\"}");
    org.junit.Assert.assertTrue("'" + type7 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type7.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema8);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"long\"" + "'", str11, "\"long\"");
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
  }

  @Test
  public void test122() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test122");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    org.apache.avro.Schema.Parser parser2 = new org.apache.avro.Schema.Parser();
    boolean boolean3 = schema1.equals((Object) parser2);
    com.fasterxml.jackson.databind.JsonNode jsonNode4 = null;
    boolean boolean5 = schema1.isValidDefault(jsonNode4);
    Object obj7 = schema1.getObjectProp("record");
    org.apache.avro.Schema.Type type8 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema9 = org.apache.avro.Schema.create(type8);
    String str10 = schema9.getFullName();
    schema9.addProp("hi!", (Object) "record");
    String str14 = schema9.getFullName();
    com.fasterxml.jackson.databind.JsonNode jsonNode15 = null;
    boolean boolean16 = schema9.isValidDefault(jsonNode15);
    org.apache.avro.Schema schema17 = org.apache.avro.Schema.applyAliases(schema1, schema9);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema18 = schema17.getValueType();
      org.junit.Assert
          .fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a map: \"long\"");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    org.junit.Assert.assertNull(obj7);
    org.junit.Assert.assertTrue("'" + type8 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type8.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema9);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "long" + "'", str10, "long");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "long" + "'", str14, "long");
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    org.junit.Assert.assertNotNull(schema17);
  }

  @Test
  public void test123() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test123");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    String str2 = schema1.getFullName();
    schema1.addProp("hi!", (Object) "record");
    String str6 = schema1.getFullName();
    com.fasterxml.jackson.databind.JsonNode jsonNode7 = null;
    boolean boolean8 = schema1.isValidDefault(jsonNode7);
    org.apache.avro.Schema.Type type9 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema10 = org.apache.avro.Schema.create(type9);
    schema1.addAllProps((org.apache.avro.JsonProperties) schema10);
    String str12 = schema1.getFullName();
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "long" + "'", str2, "long");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "long" + "'", str6, "long");
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    org.junit.Assert.assertTrue("'" + type9 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type9.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema10);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "long" + "'", str12, "long");
  }

  @Test
  public void test124() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test124");
    org.apache.avro.NameValidator nameValidator0 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.Schema.setNameValidator(nameValidator0);
    org.apache.avro.Schema.Parser parser2 = new org.apache.avro.Schema.Parser(nameValidator0);
    org.apache.avro.Schema.setNameValidator(nameValidator0);
    org.junit.Assert.assertNotNull(nameValidator0);
  }

  @Test
  public void test125() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test125");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    org.apache.avro.Schema.Parser parser2 = new org.apache.avro.Schema.Parser();
    boolean boolean3 = schema1.equals((Object) parser2);
    schema1.addProp("{\"type\":\"long\",\"hi!\":\"record\"}", (Object) 10.0d);
    java.util.Map<String, Object> strMap7 = schema1.getObjectProps();
    // The following exception was thrown during execution in test generation
    try {
      schema1.addProp("{\"type\":\"long\",\"record\":10.0}", (Object) ' ');
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Unknown datum class: class java.lang.Character");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    org.junit.Assert.assertNotNull(strMap7);
  }

  @Test
  public void test126() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test126");
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("hi!", "array",
          "{\"type\":\"long\",\"hi!\":\"record\"}", (int) (short) 10);
      org.junit.Assert
          .fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal character in: hi!");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
  }

  @Test
  public void test127() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test127");
    org.apache.avro.NameValidator nameValidator0 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.Schema.setNameValidator(nameValidator0);
    org.apache.avro.Schema.setNameValidator(nameValidator0);
    org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser(nameValidator0);
    org.apache.avro.Schema schema5 = parser3.parse("{\n  \"type\" : \"long\",\n  \"hi!\" : \"record\"\n}");
    com.fasterxml.jackson.databind.JsonNode jsonNode6 = null;
    boolean boolean7 = schema5.isValidDefault(jsonNode6);
    org.junit.Assert.assertNotNull(nameValidator0);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
  }

  @Test
  public void test128() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test128");
    org.apache.avro.Schema.Type type1 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema2 = org.apache.avro.Schema.create(type1);
    org.apache.avro.Schema.Field field4 = new org.apache.avro.Schema.Field("long", schema2, "");
    org.apache.avro.Schema schema5 = field4.schema();
    schema5.addProp("{\"type\":\"long\",\"record\":10.0}", "{\"type\":\"long\",\"record\":10.0}");
    org.junit.Assert.assertTrue("'" + type1 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type1.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema2);
    org.junit.Assert.assertNotNull(schema5);
  }

  @Test
  public void test129() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test129");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    String str2 = schema1.getFullName();
    schema1.addProp("hi!", (Object) "record");
    String str6 = schema1.toString();
    org.apache.avro.Schema.Type type7 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema8 = org.apache.avro.Schema.create(type7);
    org.apache.avro.Schema.Parser parser9 = new org.apache.avro.Schema.Parser();
    boolean boolean10 = schema8.equals((Object) parser9);
    String str11 = schema8.toString();
    org.apache.avro.Schema.SeenPair seenPair12 = new org.apache.avro.Schema.SeenPair((Object) schema1, (Object) str11);
    org.apache.avro.LogicalType logicalType13 = schema1.getLogicalType();
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "long" + "'", str2, "long");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{\"type\":\"long\",\"hi!\":\"record\"}" + "'", str6,
        "{\"type\":\"long\",\"hi!\":\"record\"}");
    org.junit.Assert.assertTrue("'" + type7 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type7.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema8);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"long\"" + "'", str11, "\"long\"");
    org.junit.Assert.assertNull(logicalType13);
  }

  @Test
  public void test130() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test130");
    org.apache.avro.Schema.Type type1 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema2 = org.apache.avro.Schema.create(type1);
    org.apache.avro.Schema.Field field4 = new org.apache.avro.Schema.Field("long", schema2, "");
    org.apache.avro.Schema schema5 = field4.schema();
    field4.addAlias("hi!");
    org.apache.avro.Schema.Type type8 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema9 = org.apache.avro.Schema.create(type8);
    org.apache.avro.Schema.Parser parser10 = new org.apache.avro.Schema.Parser();
    boolean boolean11 = schema9.equals((Object) parser10);
    String str12 = schema9.toString();
    boolean boolean13 = schema9.hasProps();
    String str14 = schema9.getDoc();
    boolean boolean15 = field4.equals((Object) str14);
    org.apache.avro.Schema schema16 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema.Field field17 = new org.apache.avro.Schema.Field(field4, schema16);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: schema is required and cannot be null");
    } catch (NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type1 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type1.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema2);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertTrue("'" + type8 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type8.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema9);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"long\"" + "'", str12, "\"long\"");
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    org.junit.Assert.assertNull(str14);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
  }

  @Test
  public void test131() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test131");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    org.apache.avro.Schema.Parser parser2 = new org.apache.avro.Schema.Parser();
    boolean boolean3 = schema1.equals((Object) parser2);
    com.fasterxml.jackson.databind.JsonNode jsonNode4 = null;
    boolean boolean5 = schema1.isValidDefault(jsonNode4);
    Object obj7 = schema1.getObjectProp("record");
    org.apache.avro.Schema.Type type8 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema9 = org.apache.avro.Schema.create(type8);
    String str10 = schema9.getFullName();
    schema9.addProp("hi!", (Object) "record");
    String str14 = schema9.getFullName();
    com.fasterxml.jackson.databind.JsonNode jsonNode15 = null;
    boolean boolean16 = schema9.isValidDefault(jsonNode15);
    org.apache.avro.Schema schema17 = org.apache.avro.Schema.applyAliases(schema1, schema9);
    schema9.addProp("array", "string");
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    org.junit.Assert.assertNull(obj7);
    org.junit.Assert.assertTrue("'" + type8 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type8.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema9);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "long" + "'", str10, "long");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "long" + "'", str14, "long");
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    org.junit.Assert.assertNotNull(schema17);
  }

  @Test
  public void test132() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test132");
    org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
    org.apache.avro.Schema schema2 = parser0.parse("{\"type\":\"long\",\"record\":10.0}");
    String str3 = schema2.getName();
    // The following exception was thrown during execution in test generation
    try {
      String str4 = schema2.getNamespace();
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: {\"type\":\"long\",\"record\":10.0}");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(schema2);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "long" + "'", str3, "long");
  }

  @Test
  public void test133() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test133");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    String str2 = schema1.getFullName();
    schema1.addProp("hi!", (Object) "record");
    String str6 = schema1.getFullName();
    com.fasterxml.jackson.databind.JsonNode jsonNode7 = null;
    boolean boolean8 = schema1.isValidDefault(jsonNode7);
    org.apache.avro.Schema.Type type9 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema10 = org.apache.avro.Schema.create(type9);
    schema1.addAllProps((org.apache.avro.JsonProperties) schema10);
    org.apache.avro.Schema.Type type12 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema13 = org.apache.avro.Schema.create(type12);
    org.apache.avro.Schema.Parser parser14 = new org.apache.avro.Schema.Parser();
    boolean boolean15 = schema13.equals((Object) parser14);
    schema13.addProp("{\"type\":\"long\",\"hi!\":\"record\"}", (Object) 10.0d);
    boolean boolean19 = schema1.equals((Object) "{\"type\":\"long\",\"hi!\":\"record\"}");
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "long" + "'", str2, "long");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "long" + "'", str6, "long");
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    org.junit.Assert.assertTrue("'" + type9 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type9.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema10);
    org.junit.Assert.assertTrue("'" + type12 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type12.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema13);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
  }

  @Test
  public void test134() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test134");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    org.apache.avro.Schema.Parser parser2 = new org.apache.avro.Schema.Parser();
    boolean boolean3 = schema1.equals((Object) parser2);
    com.fasterxml.jackson.databind.JsonNode jsonNode4 = null;
    boolean boolean5 = schema1.isValidDefault(jsonNode4);
    Object obj7 = schema1.getObjectProp("record");
    org.apache.avro.Schema.Type type8 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema9 = org.apache.avro.Schema.create(type8);
    String str10 = schema9.getFullName();
    schema9.addProp("hi!", (Object) "record");
    String str14 = schema9.getFullName();
    com.fasterxml.jackson.databind.JsonNode jsonNode15 = null;
    boolean boolean16 = schema9.isValidDefault(jsonNode15);
    org.apache.avro.Schema schema17 = org.apache.avro.Schema.applyAliases(schema1, schema9);
    // The following exception was thrown during execution in test generation
    try {
      boolean boolean18 = schema17.isError();
      org.junit.Assert
          .fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: \"long\"");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    org.junit.Assert.assertNull(obj7);
    org.junit.Assert.assertTrue("'" + type8 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type8.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema9);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "long" + "'", str10, "long");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "long" + "'", str14, "long");
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    org.junit.Assert.assertNotNull(schema17);
  }

  @Test
  public void test135() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test135");
    org.apache.avro.Schema.Type type1 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema2 = org.apache.avro.Schema.create(type1);
    org.apache.avro.Schema.Field field4 = new org.apache.avro.Schema.Field("long", schema2, "");
    org.apache.avro.Schema.Type type5 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema6 = org.apache.avro.Schema.create(type5);
    org.apache.avro.Schema.Parser parser7 = new org.apache.avro.Schema.Parser();
    boolean boolean8 = schema6.equals((Object) parser7);
    org.apache.avro.Schema.Field field9 = new org.apache.avro.Schema.Field(field4, schema6);
    Object obj10 = field9.defaultVal();
    org.junit.Assert.assertTrue("'" + type1 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type1.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema2);
    org.junit.Assert.assertTrue("'" + type5 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type5.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    org.junit.Assert.assertNull(obj10);
  }

  @Test
  public void test136() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test136");
    org.apache.avro.Schema schema2 = org.apache.avro.Schema
        .parse("{\n  \"type\" : \"long\",\n  \"hi!\" : \"record\"\n}", false);
    org.junit.Assert.assertNotNull(schema2);
  }

  @Test
  public void test137() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test137");
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse("\"long\"");
    org.junit.Assert.assertNotNull(schema1);
  }

  @Test
  public void test138() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test138");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    org.apache.avro.Schema.Parser parser2 = new org.apache.avro.Schema.Parser();
    boolean boolean3 = schema1.equals((Object) parser2);
    schema1.addProp("", "long");
    String str7 = schema1.getDoc();
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema.Field field9 = schema1.getField("");
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: {\"type\":\"long\",\"\":\"long\"}");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    org.junit.Assert.assertNull(str7);
  }

  @Test
  public void test139() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test139");
    String[] strArray6 = new String[] { "string", "hi!", "array" };
    java.util.ArrayList<String> strList7 = new java.util.ArrayList<String>();
    boolean boolean8 = java.util.Collections.addAll((java.util.Collection<String>) strList7, strArray6);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema9 = org.apache.avro.Schema.createEnum("\"long\"", "",
          "{\"type\":\"long\",\"record\":10.0}", (java.util.List<String>) strList7);
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: \"long\"");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(strArray6);
    org.junit.Assert.assertArrayEquals(strArray6, new String[] { "string", "hi!", "array" });
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
  }

  @Test
  public void test140() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test140");
    org.apache.avro.Schema.Type type1 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema2 = org.apache.avro.Schema.create(type1);
    org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser();
    boolean boolean4 = schema2.equals((Object) parser3);
    schema2.addProp("{\"type\":\"long\",\"hi!\":\"record\"}", (Object) 10.0d);
    org.apache.avro.Schema.Field field8 = new org.apache.avro.Schema.Field("long", schema2);
    org.junit.Assert.assertTrue("'" + type1 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type1.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
  }

  @Test
  public void test141() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test141");
    org.apache.avro.Schema.Type type1 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema2 = org.apache.avro.Schema.create(type1);
    org.apache.avro.Schema.Field field4 = new org.apache.avro.Schema.Field("long", schema2, "");
    java.util.Set<String> strSet5 = field4.aliases();
    org.junit.Assert.assertTrue("'" + type1 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type1.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema2);
    org.junit.Assert.assertNotNull(strSet5);
  }

  @Test
  public void test142() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test142");
    org.apache.avro.Schema.Type type1 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema2 = org.apache.avro.Schema.create(type1);
    org.apache.avro.Schema.Field field4 = new org.apache.avro.Schema.Field("long", schema2, "");
    org.apache.avro.Schema.Type type5 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema6 = org.apache.avro.Schema.create(type5);
    org.apache.avro.Schema.Parser parser7 = new org.apache.avro.Schema.Parser();
    boolean boolean8 = schema6.equals((Object) parser7);
    org.apache.avro.Schema.Field field9 = new org.apache.avro.Schema.Field(field4, schema6);
    boolean boolean11 = field9.equals((Object) 1.0d);
    field9.addAlias("");
    int int14 = field9.pos();
    org.apache.avro.Schema.Type type16 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema17 = org.apache.avro.Schema.create(type16);
    org.apache.avro.Schema.Field field19 = new org.apache.avro.Schema.Field("long", schema17, "");
    org.apache.avro.Schema schema20 = field19.schema();
    Object obj21 = field19.defaultVal();
    org.apache.avro.Schema schema22 = field19.schema();
    java.util.Set<String> strSet23 = field19.aliases();
    org.apache.avro.Schema.Type type25 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema26 = org.apache.avro.Schema.create(type25);
    org.apache.avro.Schema.Parser parser27 = new org.apache.avro.Schema.Parser();
    boolean boolean28 = schema26.equals((Object) parser27);
    schema26.addProp("{\"type\":\"long\",\"hi!\":\"record\"}", (Object) 10.0d);
    org.apache.avro.Schema.Field field32 = new org.apache.avro.Schema.Field("long", schema26);
    org.apache.avro.Schema.Type type34 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema35 = org.apache.avro.Schema.create(type34);
    org.apache.avro.Schema.Field field37 = new org.apache.avro.Schema.Field("long", schema35, "");
    org.apache.avro.Schema schema38 = field37.schema();
    org.apache.avro.Schema schema39 = field37.schema();
    org.apache.avro.Schema.Type type41 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema42 = org.apache.avro.Schema.create(type41);
    org.apache.avro.Schema.Field field44 = new org.apache.avro.Schema.Field("long", schema42, "");
    org.apache.avro.Schema schema45 = field44.schema();
    Object obj46 = field44.defaultVal();
    org.apache.avro.Schema.Type type48 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema49 = org.apache.avro.Schema.create(type48);
    org.apache.avro.Schema.Field field51 = new org.apache.avro.Schema.Field("long", schema49, "");
    org.apache.avro.Schema.Type type52 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema53 = org.apache.avro.Schema.create(type52);
    org.apache.avro.Schema.Parser parser54 = new org.apache.avro.Schema.Parser();
    boolean boolean55 = schema53.equals((Object) parser54);
    org.apache.avro.Schema.Field field56 = new org.apache.avro.Schema.Field(field51, schema53);
    Object obj57 = field56.defaultVal();
    org.apache.avro.Schema.Type type59 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema60 = org.apache.avro.Schema.create(type59);
    org.apache.avro.Schema.Field field62 = new org.apache.avro.Schema.Field("long", schema60, "");
    org.apache.avro.Schema.Type type63 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema64 = org.apache.avro.Schema.create(type63);
    org.apache.avro.Schema.Parser parser65 = new org.apache.avro.Schema.Parser();
    boolean boolean66 = schema64.equals((Object) parser65);
    org.apache.avro.Schema.Field field67 = new org.apache.avro.Schema.Field(field62, schema64);
    org.apache.avro.Schema.Type type69 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema70 = org.apache.avro.Schema.create(type69);
    org.apache.avro.Schema.Field field72 = new org.apache.avro.Schema.Field("long", schema70, "");
    org.apache.avro.Schema schema73 = field72.schema();
    Object obj74 = field72.defaultVal();
    org.apache.avro.Schema schema75 = field72.schema();
    java.util.Set<String> strSet76 = field72.aliases();
    org.apache.avro.Schema.Field[] fieldArray77 = new org.apache.avro.Schema.Field[] { field9, field19, field32,
        field37, field44, field56, field67, field72 };
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList78 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean79 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList78,
        fieldArray77);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema80 = org.apache.avro.Schema
          .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList78);
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Duplicate field long in record null: long type:LONG pos:1 and long type:LONG pos:0.");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type1 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type1.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema2);
    org.junit.Assert.assertTrue("'" + type5 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type5.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    org.junit.Assert.assertTrue("'" + type16 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type16.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema17);
    org.junit.Assert.assertNotNull(schema20);
    org.junit.Assert.assertNull(obj21);
    org.junit.Assert.assertNotNull(schema22);
    org.junit.Assert.assertNotNull(strSet23);
    org.junit.Assert.assertTrue("'" + type25 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type25.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema26);
    org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    org.junit.Assert.assertTrue("'" + type34 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type34.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema35);
    org.junit.Assert.assertNotNull(schema38);
    org.junit.Assert.assertNotNull(schema39);
    org.junit.Assert.assertTrue("'" + type41 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type41.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema42);
    org.junit.Assert.assertNotNull(schema45);
    org.junit.Assert.assertNull(obj46);
    org.junit.Assert.assertTrue("'" + type48 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type48.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema49);
    org.junit.Assert.assertTrue("'" + type52 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type52.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema53);
    org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    org.junit.Assert.assertNull(obj57);
    org.junit.Assert.assertTrue("'" + type59 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type59.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema60);
    org.junit.Assert.assertTrue("'" + type63 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type63.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema64);
    org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    org.junit.Assert.assertTrue("'" + type69 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type69.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema70);
    org.junit.Assert.assertNotNull(schema73);
    org.junit.Assert.assertNull(obj74);
    org.junit.Assert.assertNotNull(schema75);
    org.junit.Assert.assertNotNull(strSet76);
    org.junit.Assert.assertNotNull(fieldArray77);
    org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
  }

  @Test
  public void test143() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test143");
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("\"long\"", "array",
          "{\"type\":\"long\",\"record\":10.0}", 0);
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: \"long\"");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
  }

  @Test
  public void test144() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test144");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    org.apache.avro.Schema.Parser parser2 = new org.apache.avro.Schema.Parser();
    boolean boolean3 = schema1.equals((Object) parser2);
    Object obj5 = schema1.getObjectProp("array");
    boolean boolean6 = schema1.hasProps();
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    org.junit.Assert.assertNull(obj5);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
  }

  @Test
  public void test145() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test145");
    String[] strArray13 = new String[] { "{\n  \"type\" : \"long\",\n  \"hi!\" : \"record\"\n}", "long", "hi!",
        "record", "long type:LONG pos:-1", "hi!", "long", "record", "{\"type\":\"long\",\"record\":10.0}",
        "{\"type\":\"long\",\"hi!\":\"record\"}" };
    java.util.ArrayList<String> strList14 = new java.util.ArrayList<String>();
    boolean boolean15 = java.util.Collections.addAll((java.util.Collection<String>) strList14, strArray13);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema16 = org.apache.avro.Schema.createEnum("{\"type\":\"long\",\"record\":10.0}",
          "{\n  \"type\" : \"long\",\n  \"hi!\" : \"record\"\n}", "{\"type\":\"long\",\"record\":10.0}",
          (java.util.List<String>) strList14);
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: 0}");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(strArray13);
    org.junit.Assert.assertArrayEquals(strArray13,
        new String[] { "{\n  \"type\" : \"long\",\n  \"hi!\" : \"record\"\n}", "long", "hi!", "record",
            "long type:LONG pos:-1", "hi!", "long", "record", "{\"type\":\"long\",\"record\":10.0}",
            "{\"type\":\"long\",\"hi!\":\"record\"}" });
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
  }

  @Test
  public void test146() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test146");
    org.apache.avro.NameValidator nameValidator1 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.Schema.setNameValidator(nameValidator1);
    org.apache.avro.Schema.setNameValidator(nameValidator1);
    org.apache.avro.Schema.Parser parser4 = new org.apache.avro.Schema.Parser(nameValidator1);
    org.apache.avro.Schema schema6 = parser4.parse("{\n  \"type\" : \"long\",\n  \"hi!\" : \"record\"\n}");
    org.apache.avro.Schema.Type type7 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema8 = org.apache.avro.Schema.create(type7);
    org.apache.avro.Schema.Parser parser9 = new org.apache.avro.Schema.Parser();
    boolean boolean10 = schema8.equals((Object) parser9);
    schema8.addProp("", "long");
    org.apache.avro.Schema.Type type14 = schema8.getType();
    org.apache.avro.Schema schema15 = org.apache.avro.Schema.applyAliases(schema6, schema8);
    String str16 = schema6.getName();
    org.apache.avro.Schema.Field field17 = new org.apache.avro.Schema.Field("record", schema6);
    org.junit.Assert.assertNotNull(nameValidator1);
    org.junit.Assert.assertNotNull(schema6);
    org.junit.Assert.assertTrue("'" + type7 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type7.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema8);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    org.junit.Assert.assertTrue("'" + type14 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type14.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema15);
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "long" + "'", str16, "long");
  }

  @Test
  public void test147() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test147");
    org.apache.avro.Schema.setValidateDefaults(false);
  }

  @Test
  public void test148() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test148");
    org.apache.avro.Schema.Type type1 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema2 = org.apache.avro.Schema.create(type1);
    org.apache.avro.Schema.Field field4 = new org.apache.avro.Schema.Field("long", schema2, "");
    org.apache.avro.Schema schema5 = field4.schema();
    org.apache.avro.Schema schema6 = field4.schema();
    int int7 = field4.pos();
    String str8 = field4.toString();
    org.junit.Assert.assertTrue("'" + type1 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type1.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema2);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertNotNull(schema6);
    org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "long type:LONG pos:-1" + "'", str8, "long type:LONG pos:-1");
  }

  @Test
  public void test149() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test149");
    org.apache.avro.NameValidator nameValidator0 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.Schema.setNameValidator(nameValidator0);
    org.apache.avro.Schema.setNameValidator(nameValidator0);
    org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser(nameValidator0);
    org.apache.avro.Schema schema5 = parser3.parse("{\n  \"type\" : \"long\",\n  \"hi!\" : \"record\"\n}");
    org.apache.avro.Schema.Parser parser7 = parser3.setValidateDefaults(false);
    org.apache.avro.Schema.Parser parser8 = new org.apache.avro.Schema.Parser();
    java.util.Map<String, org.apache.avro.Schema> strMap9 = parser8.getTypes();
    org.apache.avro.Schema.Parser parser10 = parser3.addTypes(strMap9);
    boolean boolean11 = parser10.getValidateDefaults();
    org.junit.Assert.assertNotNull(nameValidator0);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertNotNull(parser7);
    org.junit.Assert.assertNotNull(strMap9);
    org.junit.Assert.assertNotNull(parser10);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
  }

  @Test
  public void test150() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test150");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    org.apache.avro.Schema.Parser parser2 = new org.apache.avro.Schema.Parser();
    boolean boolean3 = schema1.equals((Object) parser2);
    org.apache.avro.Schema schema4 = org.apache.avro.Schema.createArray(schema1);
    boolean boolean6 = schema1.propsContainsKey("{\n  \"type\" : \"long\",\n  \"hi!\" : \"record\"\n}");
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema7 = schema1.getElementType();
      org.junit.Assert
          .fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an array: \"long\"");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    org.junit.Assert.assertNotNull(schema4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
  }

  @Test
  public void test151() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test151");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    String str2 = schema1.getFullName();
    schema1.addProp("hi!", (Object) "record");
    org.apache.avro.Schema.Type type6 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema7 = org.apache.avro.Schema.create(type6);
    org.apache.avro.Schema.Parser parser8 = new org.apache.avro.Schema.Parser();
    boolean boolean9 = schema7.equals((Object) parser8);
    schema7.addProp("", "long");
    org.apache.avro.Schema schema13 = org.apache.avro.Schema.applyAliases(schema1, schema7);
    org.apache.avro.LogicalType logicalType14 = schema13.getLogicalType();
    // The following exception was thrown during execution in test generation
    try {
      schema13.addAlias("hi!", "{\"type\":\"long\",\"record\":10.0}");
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: {\"type\":\"long\",\"hi!\":\"record\"}");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "long" + "'", str2, "long");
    org.junit.Assert.assertTrue("'" + type6 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type6.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema7);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    org.junit.Assert.assertNotNull(schema13);
    org.junit.Assert.assertNull(logicalType14);
  }

  @Test
  public void test152() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test152");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    String str2 = schema1.getFullName();
    schema1.addProp("hi!", (Object) "record");
    org.apache.avro.Schema.Type type6 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema7 = org.apache.avro.Schema.create(type6);
    org.apache.avro.Schema.Parser parser8 = new org.apache.avro.Schema.Parser();
    boolean boolean9 = schema7.equals((Object) parser8);
    schema7.addProp("", "long");
    org.apache.avro.Schema schema13 = org.apache.avro.Schema.applyAliases(schema1, schema7);
    schema1.addProp("{\n  \"type\" : \"long\",\n  \"hi!\" : \"record\"\n}", "long type:LONG pos:-1");
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema17 = schema1.getValueType();
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a map: {\"type\":\"long\",\"hi!\":\"record\",\"{\\n  \\\"type\\\" : \\\"long\\\",\\n  \\\"hi!\\\" : \\\"record\\\"\\n}\":\"long type:LONG pos:-1\"}");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "long" + "'", str2, "long");
    org.junit.Assert.assertTrue("'" + type6 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type6.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema7);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    org.junit.Assert.assertNotNull(schema13);
  }

  @Test
  public void test153() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test153");
    org.apache.avro.Schema.Type type9 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema10 = org.apache.avro.Schema.create(type9);
    org.apache.avro.Schema.Field field12 = new org.apache.avro.Schema.Field("long", schema10, "");
    String str13 = field12.toString();
    java.util.Map<String, Object> strMap14 = field12.getObjectProps();
    org.apache.avro.Schema.Field[] fieldArray15 = new org.apache.avro.Schema.Field[] { field12 };
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList16 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList16,
        fieldArray15);
    org.apache.avro.Schema schema18 = org.apache.avro.Schema.createRecord("array", "record",
        "{\"type\":\"long\",\"hi!\":\"record\"}", false, (java.util.List<org.apache.avro.Schema.Field>) fieldList16);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema19 = org.apache.avro.Schema.createRecord("\"long\"", "", "long", true,
          (java.util.List<org.apache.avro.Schema.Field>) fieldList16);
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: \"long\"");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type9 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type9.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema10);
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "long type:LONG pos:-1" + "'", str13,
        "long type:LONG pos:-1");
    org.junit.Assert.assertNotNull(strMap14);
    org.junit.Assert.assertNotNull(fieldArray15);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    org.junit.Assert.assertNotNull(schema18);
  }

  @Test
  public void test154() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test154");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    org.apache.avro.Schema.Parser parser2 = new org.apache.avro.Schema.Parser();
    boolean boolean3 = schema1.equals((Object) parser2);
    org.apache.avro.Schema schema4 = org.apache.avro.Schema.createArray(schema1);
    boolean boolean6 = schema1.propsContainsKey("{\n  \"type\" : \"long\",\n  \"hi!\" : \"record\"\n}");
    // The following exception was thrown during execution in test generation
    try {
      String str7 = schema1.getNamespace();
      org.junit.Assert
          .fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: \"long\"");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    org.junit.Assert.assertNotNull(schema4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
  }

  @Test
  public void test155() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test155");
    org.apache.avro.Schema schema5 = org.apache.avro.Schema.createRecord("record", "long", "record", true);
    org.apache.avro.Schema.Type type7 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema8 = org.apache.avro.Schema.create(type7);
    org.apache.avro.Schema.Parser parser9 = new org.apache.avro.Schema.Parser();
    boolean boolean10 = schema8.equals((Object) parser9);
    com.fasterxml.jackson.databind.JsonNode jsonNode11 = null;
    boolean boolean12 = schema8.isValidDefault(jsonNode11);
    Object obj14 = schema8.getObjectProp("record");
    org.apache.avro.Schema.Type type15 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema16 = org.apache.avro.Schema.create(type15);
    String str17 = schema16.getFullName();
    schema16.addProp("hi!", (Object) "record");
    String str21 = schema16.getFullName();
    com.fasterxml.jackson.databind.JsonNode jsonNode22 = null;
    boolean boolean23 = schema16.isValidDefault(jsonNode22);
    org.apache.avro.Schema schema24 = org.apache.avro.Schema.applyAliases(schema8, schema16);
    org.apache.avro.Schema.Field.Order order25 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema.Field field26 = new org.apache.avro.Schema.Field("string", schema5,
          "{\"type\":\"long\",\"record\":10.0}", (Object) schema24, order25);
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Unknown datum class: class org.apache.avro.Schema$LongSchema");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertTrue("'" + type7 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type7.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema8);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    org.junit.Assert.assertNull(obj14);
    org.junit.Assert.assertTrue("'" + type15 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type15.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema16);
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "long" + "'", str17, "long");
    org.junit.Assert.assertEquals("'" + str21 + "' != '" + "long" + "'", str21, "long");
    org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    org.junit.Assert.assertNotNull(schema24);
  }

  @Test
  public void test156() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test156");
    org.apache.avro.Schema.Type type1 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema2 = org.apache.avro.Schema.create(type1);
    org.apache.avro.Schema.Field field4 = new org.apache.avro.Schema.Field("long", schema2, "");
    org.apache.avro.Schema schema5 = field4.schema();
    field4.addAlias("hi!");
    org.apache.avro.Schema.Type type8 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema9 = org.apache.avro.Schema.create(type8);
    org.apache.avro.Schema.Parser parser10 = new org.apache.avro.Schema.Parser();
    boolean boolean11 = schema9.equals((Object) parser10);
    String str12 = schema9.toString();
    boolean boolean13 = schema9.hasProps();
    String str14 = schema9.getDoc();
    boolean boolean15 = field4.equals((Object) str14);
    field4.addAlias("hi!");
    org.junit.Assert.assertTrue("'" + type1 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type1.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema2);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertTrue("'" + type8 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type8.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema9);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"long\"" + "'", str12, "\"long\"");
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    org.junit.Assert.assertNull(str14);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
  }

  @Test
  public void test157() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test157");
    org.apache.avro.Schema.Type type1 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema2 = org.apache.avro.Schema.create(type1);
    org.apache.avro.Schema.Field field4 = new org.apache.avro.Schema.Field("long", schema2, "");
    org.apache.avro.Schema schema5 = field4.schema();
    String str6 = field4.name();
    org.apache.avro.Schema.Type type7 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema8 = org.apache.avro.Schema.create(type7);
    org.apache.avro.Schema.Parser parser9 = new org.apache.avro.Schema.Parser();
    boolean boolean10 = schema8.equals((Object) parser9);
    String str11 = schema8.toString();
    boolean boolean12 = schema8.hasProps();
    org.apache.avro.Schema.SeenPair seenPair16 = new org.apache.avro.Schema.SeenPair((Object) (-1L), (Object) 100.0f);
    boolean boolean18 = seenPair16.equals((Object) (-1));
    schema8.addProp("{\"type\":\"long\",\"hi!\":\"record\"}", (Object) boolean18);
    org.apache.avro.Schema.Field field20 = new org.apache.avro.Schema.Field(field4, schema8);
    org.apache.avro.Schema schema21 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema.Field field22 = new org.apache.avro.Schema.Field(field20, schema21);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: schema is required and cannot be null");
    } catch (NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type1 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type1.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema2);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "long" + "'", str6, "long");
    org.junit.Assert.assertTrue("'" + type7 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type7.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema8);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"long\"" + "'", str11, "\"long\"");
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
  }

  @Test
  public void test158() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test158");
    String[] strArray11 = new String[] { "{\"type\":\"long\",\"hi!\":\"record\"}", "array", "long",
        "{\"type\":\"long\",\"record\":10.0}", "array", "{\"type\":\"long\",\"record\":10.0}",
        "{\n  \"type\" : \"long\",\n  \"hi!\" : \"record\"\n}", "{\"type\":\"long\",\"hi!\":\"record\"}" };
    java.util.ArrayList<String> strList12 = new java.util.ArrayList<String>();
    boolean boolean13 = java.util.Collections.addAll((java.util.Collection<String>) strList12, strArray11);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema14 = org.apache.avro.Schema.createEnum("string", "string", "",
          (java.util.List<String>) strList12);
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroTypeException; message: Schemas may not be named after primitives: string");
    } catch (org.apache.avro.AvroTypeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(strArray11);
    org.junit.Assert.assertArrayEquals(strArray11,
        new String[] { "{\"type\":\"long\",\"hi!\":\"record\"}", "array", "long", "{\"type\":\"long\",\"record\":10.0}",
            "array", "{\"type\":\"long\",\"record\":10.0}", "{\n  \"type\" : \"long\",\n  \"hi!\" : \"record\"\n}",
            "{\"type\":\"long\",\"hi!\":\"record\"}" });
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
  }

  @Test
  public void test159() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test159");
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse("{\"type\":\"long\",\"record\":10.0}");
    org.junit.Assert.assertNotNull(schema1);
  }

  @Test
  public void test160() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test160");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    String str2 = schema1.getFullName();
    schema1.addProp("hi!", (Object) "record");
    org.apache.avro.Schema.Type type6 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema7 = org.apache.avro.Schema.create(type6);
    org.apache.avro.Schema.Parser parser8 = new org.apache.avro.Schema.Parser();
    boolean boolean9 = schema7.equals((Object) parser8);
    schema7.addProp("", "long");
    org.apache.avro.Schema schema13 = org.apache.avro.Schema.applyAliases(schema1, schema7);
    Class<?> wildcardClass14 = schema13.getClass();
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "long" + "'", str2, "long");
    org.junit.Assert.assertTrue("'" + type6 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type6.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema7);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    org.junit.Assert.assertNotNull(schema13);
    org.junit.Assert.assertNotNull(wildcardClass14);
  }

  @Test
  public void test161() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test161");
    org.apache.avro.Schema.Type type1 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema2 = org.apache.avro.Schema.create(type1);
    org.apache.avro.Schema.Field field4 = new org.apache.avro.Schema.Field("long", schema2, "");
    org.apache.avro.Schema schema5 = field4.schema();
    String str6 = field4.name();
    org.apache.avro.Schema.Type type7 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema8 = org.apache.avro.Schema.create(type7);
    org.apache.avro.Schema.Parser parser9 = new org.apache.avro.Schema.Parser();
    boolean boolean10 = schema8.equals((Object) parser9);
    String str11 = schema8.toString();
    boolean boolean12 = schema8.hasProps();
    org.apache.avro.Schema.SeenPair seenPair16 = new org.apache.avro.Schema.SeenPair((Object) (-1L), (Object) 100.0f);
    boolean boolean18 = seenPair16.equals((Object) (-1));
    schema8.addProp("{\"type\":\"long\",\"hi!\":\"record\"}", (Object) boolean18);
    org.apache.avro.Schema.Field field20 = new org.apache.avro.Schema.Field(field4, schema8);
    boolean boolean21 = field20.hasDefaultValue();
    org.junit.Assert.assertTrue("'" + type1 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type1.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema2);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "long" + "'", str6, "long");
    org.junit.Assert.assertTrue("'" + type7 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type7.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema8);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"long\"" + "'", str11, "\"long\"");
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
  }

  @Test
  public void test162() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test162");
    org.apache.avro.Schema.Type type9 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema10 = org.apache.avro.Schema.create(type9);
    org.apache.avro.Schema.Field field12 = new org.apache.avro.Schema.Field("long", schema10, "");
    String str13 = field12.toString();
    java.util.Map<String, Object> strMap14 = field12.getObjectProps();
    org.apache.avro.Schema.Field[] fieldArray15 = new org.apache.avro.Schema.Field[] { field12 };
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList16 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList16,
        fieldArray15);
    org.apache.avro.Schema schema18 = org.apache.avro.Schema.createRecord("array", "record",
        "{\"type\":\"long\",\"hi!\":\"record\"}", false, (java.util.List<org.apache.avro.Schema.Field>) fieldList16);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema19 = org.apache.avro.Schema.createRecord("hi!", "array",
          "{\n  \"type\" : \"long\",\n  \"hi!\" : \"record\"\n}", false,
          (java.util.List<org.apache.avro.Schema.Field>) fieldList16);
      org.junit.Assert
          .fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal character in: hi!");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type9 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type9.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema10);
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "long type:LONG pos:-1" + "'", str13,
        "long type:LONG pos:-1");
    org.junit.Assert.assertNotNull(strMap14);
    org.junit.Assert.assertNotNull(fieldArray15);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    org.junit.Assert.assertNotNull(schema18);
  }

  @Test
  public void test163() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test163");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    String str2 = schema1.toString();
    // The following exception was thrown during execution in test generation
    try {
      boolean boolean3 = schema1.hasFields();
      org.junit.Assert
          .fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: \"long\"");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"long\"" + "'", str2, "\"long\"");
  }

  @Test
  public void test164() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test164");
    org.apache.avro.NameValidator nameValidator1 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.Schema.setNameValidator(nameValidator1);
    org.apache.avro.Schema.setNameValidator(nameValidator1);
    org.apache.avro.Schema.Parser parser4 = new org.apache.avro.Schema.Parser(nameValidator1);
    org.apache.avro.Schema schema6 = parser4.parse("{\n  \"type\" : \"long\",\n  \"hi!\" : \"record\"\n}");
    org.apache.avro.Schema.Type type7 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema8 = org.apache.avro.Schema.create(type7);
    org.apache.avro.Schema.Parser parser9 = new org.apache.avro.Schema.Parser();
    boolean boolean10 = schema8.equals((Object) parser9);
    schema8.addProp("", "long");
    org.apache.avro.Schema.Type type14 = schema8.getType();
    org.apache.avro.Schema schema15 = org.apache.avro.Schema.applyAliases(schema6, schema8);
    String str16 = schema6.getName();
    org.apache.avro.Schema.Field field17 = new org.apache.avro.Schema.Field("record", schema6);
    org.apache.avro.Schema.Field[] fieldArray18 = new org.apache.avro.Schema.Field[] { field17 };
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList19 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList19,
        fieldArray18);
    org.apache.avro.Schema schema21 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList19);
    org.junit.Assert.assertNotNull(nameValidator1);
    org.junit.Assert.assertNotNull(schema6);
    org.junit.Assert.assertTrue("'" + type7 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type7.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema8);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    org.junit.Assert.assertTrue("'" + type14 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type14.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema15);
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "long" + "'", str16, "long");
    org.junit.Assert.assertNotNull(fieldArray18);
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    org.junit.Assert.assertNotNull(schema21);
  }

  @Test
  public void test165() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test165");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    String str2 = schema1.getFullName();
    schema1.addProp("hi!", (Object) "record");
    org.apache.avro.Schema.Type type6 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema7 = org.apache.avro.Schema.create(type6);
    String str8 = schema7.getFullName();
    org.apache.avro.Schema.Type type9 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema10 = org.apache.avro.Schema.create(type9);
    org.apache.avro.Schema.Parser parser11 = new org.apache.avro.Schema.Parser();
    boolean boolean12 = schema10.equals((Object) parser11);
    String str13 = schema10.toString();
    org.apache.avro.Schema.Type type14 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema15 = org.apache.avro.Schema.create(type14);
    String str16 = schema15.getFullName();
    schema15.addProp("hi!", (Object) "record");
    org.apache.avro.Schema[] schemaArray20 = new org.apache.avro.Schema[] { schema7, schema10, schema15 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList21 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList21,
        schemaArray20);
    String str24 = schema1.toString((java.util.Collection<org.apache.avro.Schema>) schemaList21, true);
    String str25 = schema1.getDoc();
    boolean boolean27 = schema1.propsContainsKey("hi!");
    // The following exception was thrown during execution in test generation
    try {
      boolean boolean28 = schema1.isError();
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: {\"type\":\"long\",\"hi!\":\"record\"}");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "long" + "'", str2, "long");
    org.junit.Assert.assertTrue("'" + type6 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type6.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema7);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "long" + "'", str8, "long");
    org.junit.Assert.assertTrue("'" + type9 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type9.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema10);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"long\"" + "'", str13, "\"long\"");
    org.junit.Assert.assertTrue("'" + type14 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type14.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema15);
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "long" + "'", str16, "long");
    org.junit.Assert.assertNotNull(schemaArray20);
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    org.junit.Assert.assertEquals("'" + str24 + "' != '" + "{\n  \"type\" : \"long\",\n  \"hi!\" : \"record\"\n}" + "'",
        str24, "{\n  \"type\" : \"long\",\n  \"hi!\" : \"record\"\n}");
    org.junit.Assert.assertNull(str25);
    org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
  }

  @Test
  public void test166() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test166");
    org.apache.avro.Schema.Type type1 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema2 = org.apache.avro.Schema.create(type1);
    org.apache.avro.Schema.Field field4 = new org.apache.avro.Schema.Field("long", schema2, "");
    org.apache.avro.Schema schema5 = field4.schema();
    org.apache.avro.Schema schema6 = field4.schema();
    org.apache.avro.Schema.Field.Order order7 = field4.order();
    org.junit.Assert.assertTrue("'" + type1 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type1.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema2);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertNotNull(schema6);
    org.junit.Assert.assertTrue("'" + order7 + "' != '" + org.apache.avro.Schema.Field.Order.ASCENDING + "'",
        order7.equals(org.apache.avro.Schema.Field.Order.ASCENDING));
  }

  @Test
  public void test167() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test167");
    org.apache.avro.NameValidator nameValidator0 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.Schema.setNameValidator(nameValidator0);
    org.apache.avro.Schema.Parser parser2 = new org.apache.avro.Schema.Parser(nameValidator0);
    org.apache.avro.Schema.Type type4 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema5 = org.apache.avro.Schema.create(type4);
    org.apache.avro.Schema.Field field7 = new org.apache.avro.Schema.Field("long", schema5, "");
    org.apache.avro.Schema.Type type8 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema9 = org.apache.avro.Schema.create(type8);
    org.apache.avro.Schema.Parser parser10 = new org.apache.avro.Schema.Parser();
    boolean boolean11 = schema9.equals((Object) parser10);
    org.apache.avro.Schema.Field field12 = new org.apache.avro.Schema.Field(field7, schema9);
    String str13 = schema9.getDoc();
    org.apache.avro.Schema.Type type14 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema15 = org.apache.avro.Schema.create(type14);
    String str16 = schema15.getFullName();
    schema15.addProp("hi!", (Object) "record");
    org.apache.avro.Schema.Type type20 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema21 = org.apache.avro.Schema.create(type20);
    String str22 = schema21.getFullName();
    org.apache.avro.Schema.Type type23 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema24 = org.apache.avro.Schema.create(type23);
    org.apache.avro.Schema.Parser parser25 = new org.apache.avro.Schema.Parser();
    boolean boolean26 = schema24.equals((Object) parser25);
    String str27 = schema24.toString();
    org.apache.avro.Schema.Type type28 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema29 = org.apache.avro.Schema.create(type28);
    String str30 = schema29.getFullName();
    schema29.addProp("hi!", (Object) "record");
    org.apache.avro.Schema[] schemaArray34 = new org.apache.avro.Schema[] { schema21, schema24, schema29 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList35 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean36 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList35,
        schemaArray34);
    String str38 = schema15.toString((java.util.Collection<org.apache.avro.Schema>) schemaList35, true);
    String str40 = schema9.toString((java.util.Collection<org.apache.avro.Schema>) schemaList35, false);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema.Parser parser41 = parser2.addTypes((Iterable<org.apache.avro.Schema>) schemaList35);
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroTypeException; message: You can only put a named schema into the context");
    } catch (org.apache.avro.AvroTypeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(nameValidator0);
    org.junit.Assert.assertTrue("'" + type4 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type4.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertTrue("'" + type8 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type8.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema9);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    org.junit.Assert.assertNull(str13);
    org.junit.Assert.assertTrue("'" + type14 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type14.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema15);
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "long" + "'", str16, "long");
    org.junit.Assert.assertTrue("'" + type20 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type20.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema21);
    org.junit.Assert.assertEquals("'" + str22 + "' != '" + "long" + "'", str22, "long");
    org.junit.Assert.assertTrue("'" + type23 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type23.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema24);
    org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\"long\"" + "'", str27, "\"long\"");
    org.junit.Assert.assertTrue("'" + type28 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type28.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema29);
    org.junit.Assert.assertEquals("'" + str30 + "' != '" + "long" + "'", str30, "long");
    org.junit.Assert.assertNotNull(schemaArray34);
    org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    org.junit.Assert.assertEquals("'" + str38 + "' != '" + "{\n  \"type\" : \"long\",\n  \"hi!\" : \"record\"\n}" + "'",
        str38, "{\n  \"type\" : \"long\",\n  \"hi!\" : \"record\"\n}");
    org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\"long\"" + "'", str40, "\"long\"");
  }

  @Test
  public void test168() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test168");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    org.apache.avro.Schema.Parser parser2 = new org.apache.avro.Schema.Parser();
    boolean boolean3 = schema1.equals((Object) parser2);
    com.fasterxml.jackson.databind.JsonNode jsonNode4 = null;
    boolean boolean5 = schema1.isValidDefault(jsonNode4);
    Object obj7 = schema1.getObjectProp("record");
    org.apache.avro.Schema.Type type9 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema10 = org.apache.avro.Schema.create(type9);
    org.apache.avro.Schema.Parser parser11 = new org.apache.avro.Schema.Parser();
    boolean boolean12 = schema10.equals((Object) parser11);
    schema10.addProp("", "long");
    String str16 = schema10.getDoc();
    // The following exception was thrown during execution in test generation
    try {
      schema1.addProp("long type:LONG pos:-1", (Object) schema10);
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Unknown datum class: class org.apache.avro.Schema$LongSchema");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    org.junit.Assert.assertNull(obj7);
    org.junit.Assert.assertTrue("'" + type9 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type9.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema10);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    org.junit.Assert.assertNull(str16);
  }

  @Test
  public void test169() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test169");
    org.apache.avro.NameValidator nameValidator0 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.Schema.setNameValidator(nameValidator0);
    org.apache.avro.Schema.setNameValidator(nameValidator0);
    org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser(nameValidator0);
    org.apache.avro.Schema schema5 = parser3.parse("{\n  \"type\" : \"long\",\n  \"hi!\" : \"record\"\n}");
    org.apache.avro.Schema.Type type6 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema7 = org.apache.avro.Schema.create(type6);
    org.apache.avro.Schema.Parser parser8 = new org.apache.avro.Schema.Parser();
    boolean boolean9 = schema7.equals((Object) parser8);
    schema7.addProp("", "long");
    org.apache.avro.Schema.Type type13 = schema7.getType();
    org.apache.avro.Schema schema14 = org.apache.avro.Schema.applyAliases(schema5, schema7);
    boolean boolean16 = schema5.propsContainsKey("long type:LONG pos:-1");
    org.junit.Assert.assertNotNull(nameValidator0);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertTrue("'" + type6 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type6.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema7);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    org.junit.Assert.assertTrue("'" + type13 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type13.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema14);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
  }

  @Test
  public void test170() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test170");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    org.apache.avro.Schema.Parser parser2 = new org.apache.avro.Schema.Parser();
    boolean boolean3 = schema1.equals((Object) parser2);
    org.apache.avro.Schema.Parser parser5 = parser2.setValidateDefaults(true);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema7 = parser2.parseInternal("double");
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.SchemaParseException; message: com.fasterxml.jackson.core.JsonParseException: Unrecognized token 'double': was expecting (JSON String, Number, Array, Object or token 'null', 'true' or 'false')? at [Source: REDACTED (`StreamReadFeature.INCLUDE_SOURCE_IN_LOCATION` disabled); line: 1, column: 1]");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    org.junit.Assert.assertNotNull(parser5);
  }

  @Test
  public void test171() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test171");
    org.apache.avro.NameValidator nameValidator0 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.Schema.setNameValidator(nameValidator0);
    org.apache.avro.Schema.Parser parser2 = new org.apache.avro.Schema.Parser(nameValidator0);
    org.apache.avro.Schema.Parser parser4 = parser2.setValidateDefaults(true);
    java.io.InputStream inputStream5 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema6 = parser4.parse(inputStream5);
      org.junit.Assert
          .fail("Expected exception of type org.apache.avro.SchemaParseException; message: Cannot parse <null> schema");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(nameValidator0);
    org.junit.Assert.assertNotNull(parser4);
  }

  @Test
  public void test172() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test172");
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("\"long\"", "long", "", false);
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: \"long\"");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
  }

  @Test
  public void test173() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test173");
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("string", false);
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.SchemaParseException; message: com.fasterxml.jackson.core.JsonParseException: Unrecognized token 'string': was expecting (JSON String, Number, Array, Object or token 'null', 'true' or 'false')? at [Source: REDACTED (`StreamReadFeature.INCLUDE_SOURCE_IN_LOCATION` disabled); line: 1, column: 1]");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
  }
}
