package customTests.randoop.generated;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SchemaRandoopTest250 {

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
    java.io.File file0 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse(file0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test002() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test002");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.ARRAY;
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.ARRAY + "'",
        type0.equals(org.apache.avro.Schema.Type.ARRAY));
  }

  @Test
  public void test003() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test003");
    org.apache.avro.JsonProperties.Null null0 = org.apache.avro.JsonProperties.NULL_VALUE;
    org.junit.Assert.assertNotNull(null0);
  }

  @Test
  public void test004() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test004");
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema1 = org.apache.avro.Schema.parse("hi!");
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.SchemaParseException; message: com.fasterxml.jackson.core.JsonParseException: Unrecognized token 'hi': was expecting (JSON String, Number, Array, Object or token 'null', 'true' or 'false')? at [Source: REDACTED (`StreamReadFeature.INCLUDE_SOURCE_IN_LOCATION` disabled); line: 1, column: 1]");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
  }

  @Test
  public void test005() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test005");
    java.lang.Object obj0 = org.apache.avro.Schema.Field.NULL_DEFAULT_VALUE;
    org.junit.Assert.assertNotNull(obj0);
  }

  @Test
  public void test006() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test006");
    java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
    boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema8 = org.apache.avro.Schema.createEnum("", "", "hi!",
          (java.util.List<java.lang.String>) strList5, "");
      org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Empty name");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(strArray4);
    org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!" });
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
  }

  @Test
  public void test007() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test007");
    org.apache.avro.Schema schema0 = null;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.createMap(schema0);
    java.lang.Object obj3 = null;
    // The following exception was thrown during execution in test generation
    try {
      schema1.addProp("hi!", obj3);
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Can't set a property to null: hi!");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(schema1);
  }

  @Test
  public void test008() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test008");
    org.apache.avro.Schema schema0 = null;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.createMap(schema0);
    // The following exception was thrown during execution in test generation
    try {
      schema1.addProp("", (java.lang.Object) (byte) 10);
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Unknown datum class: class java.lang.Byte");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(schema1);
  }

  @Test
  public void test009() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test009");
    org.apache.avro.Schema schema0 = null;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.createMap(schema0);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema.Field field3 = schema1.getField("hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.avro.Schema.toJson(java.util.Set, String, com.fasterxml.jackson.core.JsonGenerator)\" because \"this.valueType\" is null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(schema1);
  }

  @Test
  public void test010() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test010");
    org.apache.avro.NameValidator nameValidator0 = null;
    org.apache.avro.Schema.Parser parser1 = new org.apache.avro.Schema.Parser(nameValidator0);
    java.io.InputStream inputStream2 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema3 = parser1.parse(inputStream2);
      org.junit.Assert
          .fail("Expected exception of type org.apache.avro.SchemaParseException; message: Cannot parse <null> schema");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
  }

  @Test
  public void test011() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test011");
    org.apache.avro.NameValidator nameValidator0 = null;
    org.apache.avro.Schema.Parser parser1 = new org.apache.avro.Schema.Parser(nameValidator0);
    java.lang.String[] strArray9 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema10 = parser1.parse("", strArray9);
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.SchemaParseException; message: com.fasterxml.jackson.core.JsonParseException: Unrecognized token 'hi': was expecting (JSON String, Number, Array, Object or token 'null', 'true' or 'false')? at [Source: REDACTED (`StreamReadFeature.INCLUDE_SOURCE_IN_LOCATION` disabled); line: 1, column: 1]");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(strArray9);
    org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" });
  }

  @Test
  public void test012() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test012");
    org.apache.avro.Schema schema0 = null;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.createMap(schema0);
    // The following exception was thrown during execution in test generation
    try {
      boolean boolean3 = schema1.hasEnumSymbol("");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.avro.Schema.toJson(java.util.Set, String, com.fasterxml.jackson.core.JsonGenerator)\" because \"this.valueType\" is null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(schema1);
  }

  @Test
  public void test013() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test013");
    org.apache.avro.Schema schema0 = null;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.createMap(schema0);
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<org.apache.avro.Schema.Field> fieldList2 = schema1.getFields();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.avro.Schema.toJson(java.util.Set, String, com.fasterxml.jackson.core.JsonGenerator)\" because \"this.valueType\" is null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(schema1);
  }

  @Test
  public void test014() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test014");
    org.apache.avro.Schema schema0 = null;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.createMap(schema0);
    org.apache.avro.Schema schema2 = null;
    org.apache.avro.Schema schema3 = org.apache.avro.Schema.createMap(schema2);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema4 = org.apache.avro.Schema.applyAliases(schema0, schema2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.avro.Schema.equals(Object)\" because \"writer\" is null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertNotNull(schema3);
  }

  @Test
  public void test015() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test015");
    org.apache.avro.NameValidator nameValidator0 = null;
    org.apache.avro.Schema.Parser parser1 = new org.apache.avro.Schema.Parser(nameValidator0);
    java.lang.String[] strArray3 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema4 = parser1.parse("", strArray3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"<local4>\" is null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test016() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test016");
    org.apache.avro.Schema schema0 = null;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.createMap(schema0);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str2 = schema1.getNamespace();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.avro.Schema.toJson(java.util.Set, String, com.fasterxml.jackson.core.JsonGenerator)\" because \"this.valueType\" is null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(schema1);
  }

  @Test
  public void test017() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test017");
    org.apache.avro.NameValidator nameValidator0 = null;
    org.apache.avro.Schema.Parser parser1 = new org.apache.avro.Schema.Parser(nameValidator0);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema3 = parser1.parseInternal("");
      org.junit.Assert
          .fail("Expected exception of type org.apache.avro.SchemaParseException; message: Cannot parse <null> schema");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
  }

  @Test
  public void test018() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test018");
    org.apache.avro.Schema schema0 = null;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.createMap(schema0);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema2 = schema1.getElementType();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.avro.Schema.toJson(java.util.Set, String, com.fasterxml.jackson.core.JsonGenerator)\" because \"this.valueType\" is null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(schema1);
  }

  @Test
  public void test019() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test019");
    org.apache.avro.Schema schema0 = null;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.createMap(schema0);
    // The following exception was thrown during execution in test generation
    try {
      boolean boolean2 = schema1.isError();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.avro.Schema.toJson(java.util.Set, String, com.fasterxml.jackson.core.JsonGenerator)\" because \"this.valueType\" is null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(schema1);
  }

  @Test
  public void test020() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test020");
    boolean boolean0 = org.apache.avro.Schema.getValidateDefaults();
    org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + true + "'", boolean0 == true);
  }

  @Test
  public void test021() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test021");
    org.apache.avro.Schema.Field[] fieldArray4 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList5 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList5,
        fieldArray4);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema7 = org.apache.avro.Schema.createRecord("", "", "hi!", true,
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
  public void test022() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test022");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList2 = schema1.getEnumSymbols();
      org.junit.Assert
          .fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: \"long\"");
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
    org.apache.avro.Schema.Type type1 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema2 = org.apache.avro.Schema.create(type1);
    org.apache.avro.Schema.Field.Order order5 = org.apache.avro.Schema.Field.Order.IGNORE;
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema.Field field6 = new org.apache.avro.Schema.Field("hi!", schema2, "hi!",
          (java.lang.Object) (short) 10, order5);
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Unknown datum class: class java.lang.Short");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type1 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type1.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema2);
    org.junit.Assert.assertTrue("'" + order5 + "' != '" + org.apache.avro.Schema.Field.Order.IGNORE + "'",
        order5.equals(org.apache.avro.Schema.Field.Order.IGNORE));
  }

  @Test
  public void test024() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test024");
    org.apache.avro.NameValidator nameValidator0 = null;
    org.apache.avro.Schema.Parser parser1 = new org.apache.avro.Schema.Parser(nameValidator0);
    java.lang.Iterable<org.apache.avro.Schema> schemaIterable2 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema.Parser parser3 = parser1.addTypes(schemaIterable2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.Iterable.iterator()\" because \"types\" is null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test025() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test025");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    // The following exception was thrown during execution in test generation
    try {
      int int3 = schema1.getEnumOrdinal("");
      org.junit.Assert
          .fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: \"long\"");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
  }

  @Test
  public void test026() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test026");
    org.apache.avro.Schema.Field field0 = null;
    org.apache.avro.Schema.Type type1 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema2 = org.apache.avro.Schema.create(type1);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema.Field field3 = new org.apache.avro.Schema.Field(field0, schema2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: Cannot read field \"name\" because \"field\" is null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type1 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type1.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema2);
  }

  @Test
  public void test027() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test027");
    org.apache.avro.NameValidator nameValidator0 = null;
    org.apache.avro.Schema.Parser parser1 = new org.apache.avro.Schema.Parser(nameValidator0);
    org.apache.avro.Schema.Type type2 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema3 = org.apache.avro.Schema.create(type2);
    org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] { schema3 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5,
        schemaArray4);
    org.apache.avro.Schema schema7 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
    org.apache.avro.Schema schema8 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema.Parser parser9 = parser1
          .addTypes((java.lang.Iterable<org.apache.avro.Schema>) schemaList5);
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroTypeException; message: You can only put a named schema into the context");
    } catch (org.apache.avro.AvroTypeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type2 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type2.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema3);
    org.junit.Assert.assertNotNull(schemaArray4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    org.junit.Assert.assertNotNull(schema7);
    org.junit.Assert.assertNotNull(schema8);
  }

  @Test
  public void test028() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test028");
    org.apache.avro.NameValidator nameValidator0 = null;
    org.apache.avro.Schema.Parser parser1 = new org.apache.avro.Schema.Parser(nameValidator0);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema3 = parser1.parse("");
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
    org.apache.avro.Schema.Type type1 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema2 = org.apache.avro.Schema.create(type1);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema.Field field4 = new org.apache.avro.Schema.Field("", schema2, "long");
      org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Empty name");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type1 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type1.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema2);
  }

  @Test
  public void test030() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test030");
    org.apache.avro.NameValidator nameValidator0 = null;
    org.apache.avro.Schema.Parser parser1 = new org.apache.avro.Schema.Parser(nameValidator0);
    java.lang.String[] strArray4 = new java.lang.String[] { "long" };
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema5 = parser1.parse("long", strArray4);
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.SchemaParseException; message: com.fasterxml.jackson.core.JsonParseException: Unrecognized token 'longlong': was expecting (JSON String, Number, Array, Object or token 'null', 'true' or 'false')? at [Source: REDACTED (`StreamReadFeature.INCLUDE_SOURCE_IN_LOCATION` disabled); line: 1, column: 1]");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(strArray4);
    org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "long" });
  }

  @Test
  public void test031() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test031");
    org.apache.avro.Schema.Type type1 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema2 = org.apache.avro.Schema.create(type1);
    org.apache.avro.Schema[] schemaArray3 = new org.apache.avro.Schema[] { schema2 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList4 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList4,
        schemaArray3);
    org.apache.avro.Schema schema6 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList4);
    org.apache.avro.Schema.Field.Order order9 = org.apache.avro.Schema.Field.Order.IGNORE;
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema.Field field10 = new org.apache.avro.Schema.Field("hi!", schema6, "", (java.lang.Object) 10,
          order9);
      org.junit.Assert
          .fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal character in: hi!");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type1 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type1.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema2);
    org.junit.Assert.assertNotNull(schemaArray3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    org.junit.Assert.assertNotNull(schema6);
    org.junit.Assert.assertTrue("'" + order9 + "' != '" + org.apache.avro.Schema.Field.Order.IGNORE + "'",
        order9.equals(org.apache.avro.Schema.Field.Order.IGNORE));
  }

  @Test
  public void test032() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test032");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    org.apache.avro.Schema[] schemaArray2 = new org.apache.avro.Schema[] { schema1 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList3 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList3,
        schemaArray2);
    org.apache.avro.Schema schema5 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
    // The following exception was thrown during execution in test generation
    try {
      java.util.Set<java.lang.String> strSet6 = schema5.getAliases();
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: [\"long\"]");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertNotNull(schemaArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertNotNull(schema5);
  }

  @Test
  public void test033() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test033");
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema2 = org.apache.avro.Schema.parse("hi!", true);
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.SchemaParseException; message: com.fasterxml.jackson.core.JsonParseException: Unrecognized token 'hi': was expecting (JSON String, Number, Array, Object or token 'null', 'true' or 'false')? at [Source: REDACTED (`StreamReadFeature.INCLUDE_SOURCE_IN_LOCATION` disabled); line: 1, column: 1]");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
  }

  @Test
  public void test034() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test034");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.DOUBLE;
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.DOUBLE + "'",
        type0.equals(org.apache.avro.Schema.Type.DOUBLE));
  }

  @Test
  public void test035() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test035");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    java.lang.String str2 = type0.getName();
    java.lang.String str3 = type0.getName();
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "long" + "'", str2, "long");
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "long" + "'", str3, "long");
  }

  @Test
  public void test036() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test036");
    org.apache.avro.Schema schema1 = null;
    org.apache.avro.Schema schema2 = org.apache.avro.Schema.createMap(schema1);
    org.apache.avro.NameValidator nameValidator4 = null;
    org.apache.avro.Schema.Parser parser5 = new org.apache.avro.Schema.Parser(nameValidator4);
    org.apache.avro.Schema.Field.Order order6 = org.apache.avro.Schema.Field.Order.IGNORE;
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema.Field field7 = new org.apache.avro.Schema.Field("long", schema1, "long",
          (java.lang.Object) nameValidator4, order6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: schema is required and cannot be null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(schema2);
    org.junit.Assert.assertTrue("'" + order6 + "' != '" + org.apache.avro.Schema.Field.Order.IGNORE + "'",
        order6.equals(org.apache.avro.Schema.Field.Order.IGNORE));
  }

  @Test
  public void test037() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test037");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.INT;
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.INT + "'",
        type0.equals(org.apache.avro.Schema.Type.INT));
  }

  @Test
  public void test038() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test038");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    org.apache.avro.Schema[] schemaArray2 = new org.apache.avro.Schema[] { schema1 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList3 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList3,
        schemaArray2);
    org.apache.avro.Schema schema5 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
    org.apache.avro.Schema schema6 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
    // The following exception was thrown during execution in test generation
    try {
      schema6.addProp("long", (java.lang.Object) (byte) 1);
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Unknown datum class: class java.lang.Byte");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertNotNull(schemaArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertNotNull(schema6);
  }

  @Test
  public void test039() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test039");
    org.apache.avro.Schema schema1 = null;
    org.apache.avro.Schema schema2 = org.apache.avro.Schema.createMap(schema1);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema.Field field3 = new org.apache.avro.Schema.Field("", schema1);
      org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Empty name");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(schema2);
  }

  @Test
  public void test040() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test040");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    org.apache.avro.Schema[] schemaArray2 = new org.apache.avro.Schema[] { schema1 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList3 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList3,
        schemaArray2);
    org.apache.avro.Schema schema5 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
    org.apache.avro.Schema.Type type6 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema7 = org.apache.avro.Schema.create(type6);
    java.lang.String str8 = type6.getName();
    boolean boolean9 = schema5.equals((java.lang.Object) str8);
    org.apache.avro.Schema.Type type10 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema11 = org.apache.avro.Schema.create(type10);
    org.apache.avro.Schema[] schemaArray12 = new org.apache.avro.Schema[] { schema11 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList13 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList13,
        schemaArray12);
    org.apache.avro.Schema schema15 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList13);
    com.fasterxml.jackson.databind.JsonNode jsonNode16 = null;
    boolean boolean17 = schema15.isValidDefault(jsonNode16);
    org.apache.avro.Schema schema18 = org.apache.avro.Schema.createArray(schema15);
    org.apache.avro.Schema.Type type19 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema20 = org.apache.avro.Schema.create(type19);
    org.apache.avro.Schema[] schemaArray21 = new org.apache.avro.Schema[] { schema20 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList22 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean23 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList22,
        schemaArray21);
    org.apache.avro.Schema schema24 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList22);
    com.fasterxml.jackson.databind.JsonNode jsonNode25 = null;
    boolean boolean26 = schema24.isValidDefault(jsonNode25);
    org.apache.avro.Schema schema27 = org.apache.avro.Schema.createArray(schema24);
    org.apache.avro.Schema.Type type28 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema29 = org.apache.avro.Schema.create(type28);
    org.apache.avro.Schema[] schemaArray30 = new org.apache.avro.Schema[] { schema29 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList31 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean32 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList31,
        schemaArray30);
    org.apache.avro.Schema schema33 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList31);
    org.apache.avro.Schema[] schemaArray34 = new org.apache.avro.Schema[] { schema5, schema18, schema27, schema33 };
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema35 = org.apache.avro.Schema.createUnion(schemaArray34);
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Nested union: [[\"long\"],{\"type\":\"array\",\"items\":[\"long\"]},{\"type\":\"array\",\"items\":[\"long\"]},[\"long\"]]");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertNotNull(schemaArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertTrue("'" + type6 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type6.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema7);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "long" + "'", str8, "long");
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    org.junit.Assert.assertTrue("'" + type10 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type10.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema11);
    org.junit.Assert.assertNotNull(schemaArray12);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    org.junit.Assert.assertNotNull(schema15);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    org.junit.Assert.assertNotNull(schema18);
    org.junit.Assert.assertTrue("'" + type19 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type19.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema20);
    org.junit.Assert.assertNotNull(schemaArray21);
    org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    org.junit.Assert.assertNotNull(schema24);
    org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    org.junit.Assert.assertNotNull(schema27);
    org.junit.Assert.assertTrue("'" + type28 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type28.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema29);
    org.junit.Assert.assertNotNull(schemaArray30);
    org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    org.junit.Assert.assertNotNull(schema33);
    org.junit.Assert.assertNotNull(schemaArray34);
  }

  @Test
  public void test041() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test041");
    org.apache.avro.ParseContext parseContext0 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema.Parser parser1 = new org.apache.avro.Schema.Parser(parseContext0);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: Cannot read field \"nameValidator\" because \"context\" is null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test042() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test042");
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
  public void test043() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test043");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    org.apache.avro.Schema[] schemaArray2 = new org.apache.avro.Schema[] { schema1 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList3 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList3,
        schemaArray2);
    org.apache.avro.Schema schema5 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
    com.fasterxml.jackson.databind.JsonNode jsonNode6 = null;
    boolean boolean7 = schema5.isValidDefault(jsonNode6);
    org.apache.avro.Schema schema8 = org.apache.avro.Schema.createArray(schema5);
    org.apache.avro.Schema.Type type9 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema10 = org.apache.avro.Schema.create(type9);
    org.apache.avro.Schema[] schemaArray11 = new org.apache.avro.Schema[] { schema10 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList12 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList12,
        schemaArray11);
    org.apache.avro.Schema schema14 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList12);
    org.apache.avro.Schema schema15 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList12);
    schema5.putAll((org.apache.avro.JsonProperties) schema15);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema.Field field18 = schema15.getField("");
      org.junit.Assert
          .fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: [\"long\"]");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertNotNull(schemaArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertNotNull(schema8);
    org.junit.Assert.assertTrue("'" + type9 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type9.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema10);
    org.junit.Assert.assertNotNull(schemaArray11);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    org.junit.Assert.assertNotNull(schema14);
    org.junit.Assert.assertNotNull(schema15);
  }

  @Test
  public void test044() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test044");
    org.apache.avro.Schema.Type type1 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema2 = org.apache.avro.Schema.create(type1);
    org.apache.avro.Schema.Type type5 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema6 = org.apache.avro.Schema.create(type5);
    org.apache.avro.Schema[] schemaArray7 = new org.apache.avro.Schema[] { schema6 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList8 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean9 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList8,
        schemaArray7);
    org.apache.avro.Schema schema10 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList8);
    org.apache.avro.Schema schema11 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList8);
    org.apache.avro.Schema.SeenPair seenPair12 = new org.apache.avro.Schema.SeenPair((java.lang.Object) 1,
        (java.lang.Object) schemaList8);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema.Field field13 = new org.apache.avro.Schema.Field("", schema2, "long",
          (java.lang.Object) 1);
      org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Empty name");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type1 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type1.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema2);
    org.junit.Assert.assertTrue("'" + type5 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type5.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema6);
    org.junit.Assert.assertNotNull(schemaArray7);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    org.junit.Assert.assertNotNull(schema10);
    org.junit.Assert.assertNotNull(schema11);
  }

  @Test
  public void test045() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test045");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    org.apache.avro.Schema[] schemaArray2 = new org.apache.avro.Schema[] { schema1 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList3 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList3,
        schemaArray2);
    org.apache.avro.Schema schema5 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
    org.apache.avro.Schema schema6 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
    // The following exception was thrown during execution in test generation
    try {
      schema6.addProp("hi!", (java.lang.Object) (short) -1);
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Unknown datum class: class java.lang.Short");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertNotNull(schemaArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertNotNull(schema6);
  }

  @Test
  public void test046() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test046");
    org.apache.avro.Schema.Field field0 = null;
    org.apache.avro.Schema.Type type1 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema2 = org.apache.avro.Schema.create(type1);
    org.apache.avro.Schema[] schemaArray3 = new org.apache.avro.Schema[] { schema2 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList4 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList4,
        schemaArray3);
    org.apache.avro.Schema schema6 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList4);
    com.fasterxml.jackson.databind.JsonNode jsonNode7 = null;
    boolean boolean8 = schema6.isValidDefault(jsonNode7);
    org.apache.avro.Schema schema9 = org.apache.avro.Schema.createArray(schema6);
    org.apache.avro.Schema.Type type10 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema11 = org.apache.avro.Schema.create(type10);
    org.apache.avro.Schema[] schemaArray12 = new org.apache.avro.Schema[] { schema11 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList13 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList13,
        schemaArray12);
    org.apache.avro.Schema schema15 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList13);
    org.apache.avro.Schema schema16 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList13);
    schema6.putAll((org.apache.avro.JsonProperties) schema16);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema.Field field18 = new org.apache.avro.Schema.Field(field0, schema6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: Cannot read field \"name\" because \"field\" is null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type1 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type1.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema2);
    org.junit.Assert.assertNotNull(schemaArray3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    org.junit.Assert.assertNotNull(schema6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    org.junit.Assert.assertNotNull(schema9);
    org.junit.Assert.assertTrue("'" + type10 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type10.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema11);
    org.junit.Assert.assertNotNull(schemaArray12);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    org.junit.Assert.assertNotNull(schema15);
    org.junit.Assert.assertNotNull(schema16);
  }

  @Test
  public void test047() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test047");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema2 = schema1.getValueType();
      org.junit.Assert
          .fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a map: \"long\"");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
  }

  @Test
  public void test048() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test048");
    org.apache.avro.Schema.Field field0 = null;
    org.apache.avro.Schema.Type type1 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema2 = org.apache.avro.Schema.create(type1);
    org.apache.avro.Schema[] schemaArray3 = new org.apache.avro.Schema[] { schema2 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList4 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList4,
        schemaArray3);
    org.apache.avro.Schema schema6 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList4);
    com.fasterxml.jackson.databind.JsonNode jsonNode7 = null;
    boolean boolean8 = schema6.isValidDefault(jsonNode7);
    org.apache.avro.Schema schema9 = org.apache.avro.Schema.createArray(schema6);
    org.apache.avro.Schema.Type type10 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema11 = org.apache.avro.Schema.create(type10);
    org.apache.avro.Schema[] schemaArray12 = new org.apache.avro.Schema[] { schema11 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList13 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList13,
        schemaArray12);
    org.apache.avro.Schema schema15 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList13);
    org.apache.avro.Schema schema16 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList13);
    schema6.putAll((org.apache.avro.JsonProperties) schema16);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema.Field field18 = new org.apache.avro.Schema.Field(field0, schema16);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: Cannot read field \"name\" because \"field\" is null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type1 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type1.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema2);
    org.junit.Assert.assertNotNull(schemaArray3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    org.junit.Assert.assertNotNull(schema6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    org.junit.Assert.assertNotNull(schema9);
    org.junit.Assert.assertTrue("'" + type10 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type10.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema11);
    org.junit.Assert.assertNotNull(schemaArray12);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    org.junit.Assert.assertNotNull(schema15);
    org.junit.Assert.assertNotNull(schema16);
  }

  @Test
  public void test049() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test049");
    org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
    boolean boolean1 = parser0.getValidateDefaults();
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema3 = parser0.parse("long");
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.SchemaParseException; message: com.fasterxml.jackson.core.JsonParseException: Unrecognized token 'long': was expecting (JSON String, Number, Array, Object or token 'null', 'true' or 'false')? at [Source: REDACTED (`StreamReadFeature.INCLUDE_SOURCE_IN_LOCATION` disabled); line: 1, column: 1]");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
  }

  @Test
  public void test050() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test050");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    org.apache.avro.Schema[] schemaArray2 = new org.apache.avro.Schema[] { schema1 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList3 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList3,
        schemaArray2);
    org.apache.avro.Schema schema5 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
    org.apache.avro.Schema schema6 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
    java.lang.String str7 = schema6.getFullName();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str8 = schema6.getNamespace();
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: [\"long\"]");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertNotNull(schemaArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertNotNull(schema6);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "union[long]" + "'", str7, "union[long]");
  }

  @Test
  public void test051() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test051");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    org.apache.avro.Schema[] schemaArray2 = new org.apache.avro.Schema[] { schema1 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList3 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList3,
        schemaArray2);
    org.apache.avro.Schema schema5 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
    com.fasterxml.jackson.databind.JsonNode jsonNode6 = null;
    boolean boolean7 = schema5.isValidDefault(jsonNode6);
    org.apache.avro.Schema schema8 = org.apache.avro.Schema.createArray(schema5);
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<org.apache.avro.Schema.Field> fieldList9 = schema8.getFields();
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: {\"type\":\"array\",\"items\":[\"long\"]}");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertNotNull(schemaArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertNotNull(schema8);
  }

  @Test
  public void test052() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test052");
    org.apache.avro.Schema.Type type1 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema2 = org.apache.avro.Schema.create(type1);
    org.apache.avro.Schema[] schemaArray3 = new org.apache.avro.Schema[] { schema2 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList4 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList4,
        schemaArray3);
    org.apache.avro.Schema schema6 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList4);
    org.apache.avro.Schema schema7 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList4);
    java.lang.String str8 = schema7.getFullName();
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema.Field field10 = new org.apache.avro.Schema.Field("hi!", schema7, "long");
      org.junit.Assert
          .fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal character in: hi!");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type1 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type1.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema2);
    org.junit.Assert.assertNotNull(schemaArray3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    org.junit.Assert.assertNotNull(schema6);
    org.junit.Assert.assertNotNull(schema7);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "union[long]" + "'", str8, "union[long]");
  }

  @Test
  public void test053() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test053");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.BOOLEAN;
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.BOOLEAN + "'",
        type0.equals(org.apache.avro.Schema.Type.BOOLEAN));
  }

  @Test
  public void test054() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test054");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    org.apache.avro.Schema[] schemaArray2 = new org.apache.avro.Schema[] { schema1 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList3 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList3,
        schemaArray2);
    org.apache.avro.Schema schema5 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
    com.fasterxml.jackson.databind.JsonNode jsonNode6 = null;
    boolean boolean7 = schema5.isValidDefault(jsonNode6);
    org.apache.avro.Schema schema8 = org.apache.avro.Schema.createMap(schema5);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema.Field field10 = schema8.getField("union[long]");
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: {\"type\":\"map\",\"values\":[\"long\"]}");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertNotNull(schemaArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertNotNull(schema8);
  }

  @Test
  public void test055() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test055");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    org.apache.avro.Schema[] schemaArray2 = new org.apache.avro.Schema[] { schema1 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList3 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList3,
        schemaArray2);
    org.apache.avro.Schema schema5 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
    org.apache.avro.Schema schema6 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
    org.apache.avro.Schema schema7 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
    org.apache.avro.Schema.Type type8 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema9 = org.apache.avro.Schema.create(type8);
    schema7.addAllProps((org.apache.avro.JsonProperties) schema9);
    // The following exception was thrown during execution in test generation
    try {
      java.util.Set<java.lang.String> strSet11 = schema9.getAliases();
      org.junit.Assert
          .fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: \"long\"");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertNotNull(schemaArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertNotNull(schema6);
    org.junit.Assert.assertNotNull(schema7);
    org.junit.Assert.assertTrue("'" + type8 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type8.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema9);
  }

  @Test
  public void test056() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test056");
    org.apache.avro.Schema schema0 = null;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.createMap(schema0);
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList2 = schema1.getEnumSymbols();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.avro.Schema.toJson(java.util.Set, String, com.fasterxml.jackson.core.JsonGenerator)\" because \"this.valueType\" is null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(schema1);
  }

  @Test
  public void test057() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test057");
    org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
    java.io.InputStream inputStream1 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema2 = parser0.parse(inputStream1);
      org.junit.Assert
          .fail("Expected exception of type org.apache.avro.SchemaParseException; message: Cannot parse <null> schema");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
  }

  @Test
  public void test058() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test058");
    java.lang.String[] strArray4 = new java.lang.String[] { "union[long]" };
    java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
    boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema7 = org.apache.avro.Schema.createEnum("long", "hi!", "",
          (java.util.List<java.lang.String>) strList5);
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroTypeException; message: Schemas may not be named after primitives: long");
    } catch (org.apache.avro.AvroTypeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(strArray4);
    org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "union[long]" });
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
  }

  @Test
  public void test059() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test059");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    org.apache.avro.Schema[] schemaArray2 = new org.apache.avro.Schema[] { schema1 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList3 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList3,
        schemaArray2);
    org.apache.avro.Schema schema5 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
    org.apache.avro.Schema schema6 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
    org.apache.avro.Schema schema7 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema8 = schema7.getValueType();
      org.junit.Assert
          .fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a map: [\"long\"]");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertNotNull(schemaArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertNotNull(schema6);
    org.junit.Assert.assertNotNull(schema7);
  }

  @Test
  public void test060() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test060");
    org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
    boolean boolean1 = parser0.getValidateDefaults();
    java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema4 = parser0.parse("long");
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.SchemaParseException; message: com.fasterxml.jackson.core.JsonParseException: Unrecognized token 'long': was expecting (JSON String, Number, Array, Object or token 'null', 'true' or 'false')? at [Source: REDACTED (`StreamReadFeature.INCLUDE_SOURCE_IN_LOCATION` disabled); line: 1, column: 1]");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    org.junit.Assert.assertNotNull(strMap2);
  }

  @Test
  public void test061() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test061");
    org.apache.avro.Schema schema1 = null;
    org.apache.avro.Schema schema2 = org.apache.avro.Schema.createMap(schema1);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema.Field field4 = new org.apache.avro.Schema.Field("", schema1, "");
      org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Empty name");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(schema2);
  }

  @Test
  public void test062() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test062");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    org.apache.avro.Schema[] schemaArray2 = new org.apache.avro.Schema[] { schema1 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList3 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList3,
        schemaArray2);
    org.apache.avro.Schema schema5 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
    com.fasterxml.jackson.databind.JsonNode jsonNode6 = null;
    boolean boolean7 = schema5.isValidDefault(jsonNode6);
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList8 = schema5.getEnumSymbols();
      org.junit.Assert
          .fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: [\"long\"]");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertNotNull(schemaArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
  }

  @Test
  public void test063() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test063");
    org.apache.avro.Schema.Field[] fieldArray0 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList1 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList1,
        fieldArray0);
    org.apache.avro.Schema schema3 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
    java.lang.Class<?> wildcardClass4 = schema3.getClass();
    org.junit.Assert.assertNotNull(fieldArray0);
    org.junit.Assert.assertArrayEquals(fieldArray0, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertNotNull(schema3);
    org.junit.Assert.assertNotNull(wildcardClass4);
  }

  @Test
  public void test064() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test064");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.NULL;
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.NULL + "'",
        type0.equals(org.apache.avro.Schema.Type.NULL));
  }

  @Test
  public void test065() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test065");
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj1 = org.apache.avro.Schema.parseJsonToObject("union[long]");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.RuntimeException; message: com.fasterxml.jackson.core.JsonParseException: Unrecognized token 'union': was expecting (JSON String, Number, Array, Object or token 'null', 'true' or 'false')? at [Source: REDACTED (`StreamReadFeature.INCLUDE_SOURCE_IN_LOCATION` disabled); line: 1, column: 1]");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
  }

  @Test
  public void test066() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test066");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    org.apache.avro.Schema[] schemaArray2 = new org.apache.avro.Schema[] { schema1 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList3 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList3,
        schemaArray2);
    org.apache.avro.Schema schema5 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
    com.fasterxml.jackson.databind.JsonNode jsonNode6 = null;
    boolean boolean7 = schema5.isValidDefault(jsonNode6);
    org.apache.avro.Schema schema8 = org.apache.avro.Schema.createArray(schema5);
    org.apache.avro.Schema.Type type9 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema10 = org.apache.avro.Schema.create(type9);
    org.apache.avro.Schema[] schemaArray11 = new org.apache.avro.Schema[] { schema10 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList12 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList12,
        schemaArray11);
    org.apache.avro.Schema schema14 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList12);
    org.apache.avro.Schema schema15 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList12);
    schema5.putAll((org.apache.avro.JsonProperties) schema15);
    boolean boolean18 = schema15.propsContainsKey("hi!");
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertNotNull(schemaArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertNotNull(schema8);
    org.junit.Assert.assertTrue("'" + type9 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type9.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema10);
    org.junit.Assert.assertNotNull(schemaArray11);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    org.junit.Assert.assertNotNull(schema14);
    org.junit.Assert.assertNotNull(schema15);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
  }

  @Test
  public void test067() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test067");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    org.apache.avro.Schema[] schemaArray2 = new org.apache.avro.Schema[] { schema1 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList3 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList3,
        schemaArray2);
    org.apache.avro.Schema schema5 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
    org.apache.avro.Schema.Type type6 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema7 = org.apache.avro.Schema.create(type6);
    java.lang.String str8 = type6.getName();
    boolean boolean9 = schema5.equals((java.lang.Object) str8);
    // The following exception was thrown during execution in test generation
    try {
      schema5.addProp("hi!", "");
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Can't set properties on a union: [\"long\"]");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertNotNull(schemaArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertTrue("'" + type6 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type6.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema7);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "long" + "'", str8, "long");
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
  }

  @Test
  public void test068() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test068");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.RECORD;
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.RECORD + "'",
        type0.equals(org.apache.avro.Schema.Type.RECORD));
  }

  @Test
  public void test069() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test069");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.FIXED;
    java.lang.String str1 = type0.getName();
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.FIXED + "'",
        type0.equals(org.apache.avro.Schema.Type.FIXED));
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fixed" + "'", str1, "fixed");
  }

  @Test
  public void test070() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test070");
    org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
    boolean boolean1 = parser0.getValidateDefaults();
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema3 = parser0.parse("");
      org.junit.Assert
          .fail("Expected exception of type org.apache.avro.SchemaParseException; message: Cannot parse <null> schema");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
  }

  @Test
  public void test071() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test071");
    org.apache.avro.Schema.Type type1 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema2 = org.apache.avro.Schema.create(type1);
    org.apache.avro.Schema[] schemaArray3 = new org.apache.avro.Schema[] { schema2 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList4 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList4,
        schemaArray3);
    org.apache.avro.Schema schema6 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList4);
    org.apache.avro.Schema schema7 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList4);
    org.apache.avro.Schema.SeenPair seenPair8 = new org.apache.avro.Schema.SeenPair((java.lang.Object) 1,
        (java.lang.Object) schemaList4);
    org.apache.avro.Schema.Type type9 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema10 = org.apache.avro.Schema.create(type9);
    boolean boolean11 = seenPair8.equals((java.lang.Object) type9);
    org.junit.Assert.assertTrue("'" + type1 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type1.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema2);
    org.junit.Assert.assertNotNull(schemaArray3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    org.junit.Assert.assertNotNull(schema6);
    org.junit.Assert.assertNotNull(schema7);
    org.junit.Assert.assertTrue("'" + type9 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type9.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema10);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
  }

  @Test
  public void test072() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test072");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    org.apache.avro.Schema[] schemaArray2 = new org.apache.avro.Schema[] { schema1 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList3 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList3,
        schemaArray2);
    org.apache.avro.Schema schema5 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
    com.fasterxml.jackson.databind.JsonNode jsonNode6 = null;
    boolean boolean7 = schema5.isValidDefault(jsonNode6);
    org.apache.avro.Schema schema8 = org.apache.avro.Schema.createMap(schema5);
    // The following exception was thrown during execution in test generation
    try {
      schema5.addProp("union[long]", "");
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Can't set properties on a union: [\"long\"]");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertNotNull(schemaArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertNotNull(schema8);
  }

  @Test
  public void test073() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test073");
    org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
    boolean boolean1 = parser0.getValidateDefaults();
    java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema4 = parser0.parseInternal("fixed");
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.SchemaParseException; message: com.fasterxml.jackson.core.JsonParseException: Unrecognized token 'fixed': was expecting (JSON String, Number, Array, Object or token 'null', 'true' or 'false')? at [Source: REDACTED (`StreamReadFeature.INCLUDE_SOURCE_IN_LOCATION` disabled); line: 1, column: 1]");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    org.junit.Assert.assertNotNull(strMap2);
  }

  @Test
  public void test074() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test074");
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("fixed", "", "long", (int) (byte) -1);
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Malformed data. Length is negative: -1");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
  }

  @Test
  public void test075() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test075");
    org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
    boolean boolean1 = parser0.getValidateDefaults();
    java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
    org.apache.avro.Schema.Type type3 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema4 = org.apache.avro.Schema.create(type3);
    org.apache.avro.Schema[] schemaArray5 = new org.apache.avro.Schema[] { schema4 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList6 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList6,
        schemaArray5);
    org.apache.avro.Schema schema8 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList6);
    org.apache.avro.Schema schema9 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList6);
    org.apache.avro.Schema schema10 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList6);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema.Parser parser11 = parser0
          .addTypes((java.lang.Iterable<org.apache.avro.Schema>) schemaList6);
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroTypeException; message: You can only put a named schema into the context");
    } catch (org.apache.avro.AvroTypeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    org.junit.Assert.assertNotNull(strMap2);
    org.junit.Assert.assertTrue("'" + type3 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type3.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema4);
    org.junit.Assert.assertNotNull(schemaArray5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    org.junit.Assert.assertNotNull(schema8);
    org.junit.Assert.assertNotNull(schema9);
    org.junit.Assert.assertNotNull(schema10);
  }

  @Test
  public void test076() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test076");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    org.apache.avro.Schema[] schemaArray2 = new org.apache.avro.Schema[] { schema1 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList3 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList3,
        schemaArray2);
    org.apache.avro.Schema schema5 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
    com.fasterxml.jackson.databind.JsonNode jsonNode6 = null;
    boolean boolean7 = schema5.isValidDefault(jsonNode6);
    org.apache.avro.Schema schema8 = org.apache.avro.Schema.createMap(schema5);
    java.lang.String str10 = schema8.toString(true);
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertNotNull(schemaArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertNotNull(schema8);
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "{\n  \"type\" : \"map\",\n  \"values\" : [ \"long\" ]\n}" + "'", str10,
        "{\n  \"type\" : \"map\",\n  \"values\" : [ \"long\" ]\n}");
  }

  @Test
  public void test077() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test077");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    org.apache.avro.Schema[] schemaArray2 = new org.apache.avro.Schema[] { schema1 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList3 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList3,
        schemaArray2);
    org.apache.avro.Schema schema5 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
    org.apache.avro.Schema schema6 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
    org.apache.avro.Schema schema7 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
    org.apache.avro.Schema.Type type8 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema9 = org.apache.avro.Schema.create(type8);
    schema7.addAllProps((org.apache.avro.JsonProperties) schema9);
    // The following exception was thrown during execution in test generation
    try {
      schema9.addAlias("fixed", "");
      org.junit.Assert
          .fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: \"long\"");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertNotNull(schemaArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertNotNull(schema6);
    org.junit.Assert.assertNotNull(schema7);
    org.junit.Assert.assertTrue("'" + type8 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type8.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema9);
  }

  @Test
  public void test078() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test078");
    org.apache.avro.Schema schema0 = null;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.createMap(schema0);
    // The following exception was thrown during execution in test generation
    try {
      schema1.addProp("{\n  \"type\" : \"map\",\n  \"values\" : [ \"long\" ]\n}", (java.lang.Object) ' ');
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Unknown datum class: class java.lang.Character");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(schema1);
  }

  @Test
  public void test079() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test079");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    org.apache.avro.Schema[] schemaArray2 = new org.apache.avro.Schema[] { schema1 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList3 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList3,
        schemaArray2);
    org.apache.avro.Schema schema5 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
    com.fasterxml.jackson.databind.JsonNode jsonNode6 = null;
    boolean boolean7 = schema5.isValidDefault(jsonNode6);
    org.apache.avro.Schema schema8 = org.apache.avro.Schema.createArray(schema5);
    org.apache.avro.Schema.Type type9 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema10 = org.apache.avro.Schema.create(type9);
    org.apache.avro.Schema[] schemaArray11 = new org.apache.avro.Schema[] { schema10 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList12 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList12,
        schemaArray11);
    org.apache.avro.Schema schema14 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList12);
    org.apache.avro.Schema schema15 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList12);
    schema5.putAll((org.apache.avro.JsonProperties) schema15);
    // The following exception was thrown during execution in test generation
    try {
      schema15.addProp("{\n  \"type\" : \"map\",\n  \"values\" : [ \"long\" ]\n}", "union[long]");
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Can't set properties on a union: [\"long\"]");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertNotNull(schemaArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertNotNull(schema8);
    org.junit.Assert.assertTrue("'" + type9 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type9.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema10);
    org.junit.Assert.assertNotNull(schemaArray11);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    org.junit.Assert.assertNotNull(schema14);
    org.junit.Assert.assertNotNull(schema15);
  }

  @Test
  public void test080() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test080");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    org.apache.avro.Schema[] schemaArray2 = new org.apache.avro.Schema[] { schema1 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList3 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList3,
        schemaArray2);
    org.apache.avro.Schema schema5 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
    com.fasterxml.jackson.databind.JsonNode jsonNode6 = null;
    boolean boolean7 = schema5.isValidDefault(jsonNode6);
    org.apache.avro.Schema schema8 = org.apache.avro.Schema.createArray(schema5);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema9 = schema5.getValueType();
      org.junit.Assert
          .fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a map: [\"long\"]");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertNotNull(schemaArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertNotNull(schema8);
  }

  @Test
  public void test081() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test081");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    org.apache.avro.Schema[] schemaArray2 = new org.apache.avro.Schema[] { schema1 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList3 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList3,
        schemaArray2);
    org.apache.avro.Schema schema5 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
    com.fasterxml.jackson.databind.JsonNode jsonNode6 = null;
    boolean boolean7 = schema5.isValidDefault(jsonNode6);
    org.apache.avro.Schema schema8 = org.apache.avro.Schema.createArray(schema5);
    org.apache.avro.Schema.Type type9 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema10 = org.apache.avro.Schema.create(type9);
    org.apache.avro.Schema[] schemaArray11 = new org.apache.avro.Schema[] { schema10 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList12 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList12,
        schemaArray11);
    org.apache.avro.Schema schema14 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList12);
    org.apache.avro.Schema schema15 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList12);
    schema5.putAll((org.apache.avro.JsonProperties) schema15);
    org.apache.avro.Schema schema17 = org.apache.avro.Schema.createArray(schema15);
    boolean boolean19 = schema17.equals((java.lang.Object) 100);
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<org.apache.avro.Schema> schemaList20 = schema17.getTypes();
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a union: {\"type\":\"array\",\"items\":[\"long\"]}");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertNotNull(schemaArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertNotNull(schema8);
    org.junit.Assert.assertTrue("'" + type9 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type9.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema10);
    org.junit.Assert.assertNotNull(schemaArray11);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    org.junit.Assert.assertNotNull(schema14);
    org.junit.Assert.assertNotNull(schema15);
    org.junit.Assert.assertNotNull(schema17);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
  }

  @Test
  public void test082() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test082");
    org.apache.avro.Schema.Field[] fieldArray0 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList1 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList1,
        fieldArray0);
    org.apache.avro.Schema schema3 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
    // The following exception was thrown during execution in test generation
    try {
      int int5 = schema3.getEnumOrdinal("fixed");
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: {\"type\":\"record\",\"fields\":[]}");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(fieldArray0);
    org.junit.Assert.assertArrayEquals(fieldArray0, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertNotNull(schema3);
  }

  @Test
  public void test083() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test083");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.UNION;
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.UNION + "'",
        type0.equals(org.apache.avro.Schema.Type.UNION));
  }

  @Test
  public void test084() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test084");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    org.apache.avro.Schema[] schemaArray2 = new org.apache.avro.Schema[] { schema1 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList3 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList3,
        schemaArray2);
    org.apache.avro.Schema schema5 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
    com.fasterxml.jackson.databind.JsonNode jsonNode6 = null;
    boolean boolean7 = schema5.isValidDefault(jsonNode6);
    org.apache.avro.Schema schema8 = org.apache.avro.Schema.createMap(schema5);
    org.apache.avro.Schema schema9 = schema8.getValueType();
    java.lang.String str10 = schema8.toString();
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertNotNull(schemaArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertNotNull(schema8);
    org.junit.Assert.assertNotNull(schema9);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{\"type\":\"map\",\"values\":[\"long\"]}" + "'", str10,
        "{\"type\":\"map\",\"values\":[\"long\"]}");
  }

  @Test
  public void test085() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test085");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    org.apache.avro.Schema[] schemaArray2 = new org.apache.avro.Schema[] { schema1 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList3 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList3,
        schemaArray2);
    org.apache.avro.Schema schema5 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
    org.apache.avro.Schema schema6 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
    java.lang.String str7 = schema6.getFullName();
    org.apache.avro.Schema.Type type8 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema9 = org.apache.avro.Schema.create(type8);
    org.apache.avro.Schema[] schemaArray10 = new org.apache.avro.Schema[] { schema9 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList11 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList11,
        schemaArray10);
    org.apache.avro.Schema schema13 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList11);
    com.fasterxml.jackson.databind.JsonNode jsonNode14 = null;
    boolean boolean15 = schema13.isValidDefault(jsonNode14);
    org.apache.avro.Schema schema16 = org.apache.avro.Schema.createArray(schema13);
    org.apache.avro.Schema.Type type17 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema18 = org.apache.avro.Schema.create(type17);
    org.apache.avro.Schema[] schemaArray19 = new org.apache.avro.Schema[] { schema18 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList20 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean21 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList20,
        schemaArray19);
    org.apache.avro.Schema schema22 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList20);
    org.apache.avro.Schema schema23 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList20);
    schema13.putAll((org.apache.avro.JsonProperties) schema23);
    org.apache.avro.Schema schema25 = org.apache.avro.Schema.createArray(schema23);
    java.util.function.BiConsumer<java.lang.String, java.lang.Object> strBiConsumer26 = null;
    schema23.forEachProperty(strBiConsumer26);
    java.lang.String str28 = schema23.getDoc();
    boolean boolean29 = schema6.equals((java.lang.Object) schema23);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema.Field field31 = schema23.getField("union[long]");
      org.junit.Assert
          .fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: [\"long\"]");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertNotNull(schemaArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertNotNull(schema6);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "union[long]" + "'", str7, "union[long]");
    org.junit.Assert.assertTrue("'" + type8 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type8.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema9);
    org.junit.Assert.assertNotNull(schemaArray10);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    org.junit.Assert.assertNotNull(schema13);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    org.junit.Assert.assertNotNull(schema16);
    org.junit.Assert.assertTrue("'" + type17 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type17.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema18);
    org.junit.Assert.assertNotNull(schemaArray19);
    org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    org.junit.Assert.assertNotNull(schema22);
    org.junit.Assert.assertNotNull(schema23);
    org.junit.Assert.assertNotNull(schema25);
    org.junit.Assert.assertNull(str28);
    org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
  }

  @Test
  public void test086() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test086");
    org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
    org.apache.avro.NameValidator nameValidator1 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.Schema.SeenPair seenPair2 = new org.apache.avro.Schema.SeenPair((java.lang.Object) parser0,
        (java.lang.Object) nameValidator1);
    org.apache.avro.Schema.Parser parser4 = parser0.setValidateDefaults(true);
    org.junit.Assert.assertNotNull(nameValidator1);
    org.junit.Assert.assertNotNull(parser4);
  }

  @Test
  public void test087() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test087");
    org.apache.avro.Schema schema0 = null;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.createMap(schema0);
    org.apache.avro.Schema.Type type2 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema3 = org.apache.avro.Schema.create(type2);
    org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] { schema3 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5,
        schemaArray4);
    org.apache.avro.Schema schema7 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
    org.apache.avro.Schema schema8 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
    java.lang.String str9 = schema8.getFullName();
    org.apache.avro.Schema.Type type10 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema11 = org.apache.avro.Schema.create(type10);
    org.apache.avro.Schema[] schemaArray12 = new org.apache.avro.Schema[] { schema11 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList13 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList13,
        schemaArray12);
    org.apache.avro.Schema schema15 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList13);
    com.fasterxml.jackson.databind.JsonNode jsonNode16 = null;
    boolean boolean17 = schema15.isValidDefault(jsonNode16);
    org.apache.avro.Schema schema18 = org.apache.avro.Schema.createMap(schema15);
    java.lang.String str20 = schema18.toString(true);
    org.apache.avro.Schema[] schemaArray21 = new org.apache.avro.Schema[] { schema1, schema8, schema18 };
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema22 = org.apache.avro.Schema.createUnion(schemaArray21);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.avro.Schema.toJson(java.util.Set, String, com.fasterxml.jackson.core.JsonGenerator)\" because \"this.valueType\" is null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertTrue("'" + type2 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type2.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema3);
    org.junit.Assert.assertNotNull(schemaArray4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    org.junit.Assert.assertNotNull(schema7);
    org.junit.Assert.assertNotNull(schema8);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "union[long]" + "'", str9, "union[long]");
    org.junit.Assert.assertTrue("'" + type10 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type10.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema11);
    org.junit.Assert.assertNotNull(schemaArray12);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    org.junit.Assert.assertNotNull(schema15);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    org.junit.Assert.assertNotNull(schema18);
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "{\n  \"type\" : \"map\",\n  \"values\" : [ \"long\" ]\n}" + "'", str20,
        "{\n  \"type\" : \"map\",\n  \"values\" : [ \"long\" ]\n}");
    org.junit.Assert.assertNotNull(schemaArray21);
  }

  @Test
  public void test088() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test088");
    org.apache.avro.Schema.setValidateDefaults(false);
  }

  @Test
  public void test089() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test089");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    org.apache.avro.Schema[] schemaArray2 = new org.apache.avro.Schema[] { schema1 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList3 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList3,
        schemaArray2);
    org.apache.avro.Schema schema5 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
    com.fasterxml.jackson.databind.JsonNode jsonNode6 = null;
    boolean boolean7 = schema5.isValidDefault(jsonNode6);
    org.apache.avro.Schema schema8 = org.apache.avro.Schema.createArray(schema5);
    org.apache.avro.Schema.Type type9 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema10 = org.apache.avro.Schema.create(type9);
    org.apache.avro.Schema[] schemaArray11 = new org.apache.avro.Schema[] { schema10 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList12 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList12,
        schemaArray11);
    org.apache.avro.Schema schema14 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList12);
    org.apache.avro.Schema schema15 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList12);
    schema5.putAll((org.apache.avro.JsonProperties) schema15);
    java.lang.Object obj18 = schema15.getObjectProp("hi!");
    // The following exception was thrown during execution in test generation
    try {
      java.util.Set<java.lang.String> strSet19 = schema15.getAliases();
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: [\"long\"]");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertNotNull(schemaArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertNotNull(schema8);
    org.junit.Assert.assertTrue("'" + type9 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type9.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema10);
    org.junit.Assert.assertNotNull(schemaArray11);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    org.junit.Assert.assertNotNull(schema14);
    org.junit.Assert.assertNotNull(schema15);
    org.junit.Assert.assertNull(obj18);
  }

  @Test
  public void test090() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test090");
    org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
    boolean boolean1 = parser0.getValidateDefaults();
    boolean boolean2 = parser0.getValidateDefaults();
    java.lang.String[] strArray4 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema5 = parser0.parse("union[long]", strArray4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"<local4>\" is null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
  }

  @Test
  public void test091() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test091");
    org.apache.avro.Schema.Type type1 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema2 = org.apache.avro.Schema.create(type1);
    org.apache.avro.Schema[] schemaArray3 = new org.apache.avro.Schema[] { schema2 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList4 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList4,
        schemaArray3);
    org.apache.avro.Schema schema6 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList4);
    org.apache.avro.Schema schema7 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList4);
    org.apache.avro.Schema.SeenPair seenPair8 = new org.apache.avro.Schema.SeenPair((java.lang.Object) 1,
        (java.lang.Object) schemaList4);
    java.lang.Class<?> wildcardClass9 = schemaList4.getClass();
    org.junit.Assert.assertTrue("'" + type1 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type1.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema2);
    org.junit.Assert.assertNotNull(schemaArray3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    org.junit.Assert.assertNotNull(schema6);
    org.junit.Assert.assertNotNull(schema7);
    org.junit.Assert.assertNotNull(wildcardClass9);
  }

  @Test
  public void test092() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test092");
    org.apache.avro.Schema.Field field0 = null;
    org.apache.avro.Schema schema1 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema.Field field2 = new org.apache.avro.Schema.Field(field0, schema1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: Cannot read field \"name\" because \"field\" is null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test093() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test093");
    org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
    boolean boolean1 = parser0.getValidateDefaults();
    java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
    org.apache.avro.NameValidator nameValidator3 = null;
    org.apache.avro.Schema.Parser parser4 = new org.apache.avro.Schema.Parser(nameValidator3);
    org.apache.avro.Schema.Parser parser5 = new org.apache.avro.Schema.Parser();
    boolean boolean6 = parser5.getValidateDefaults();
    java.util.Map<java.lang.String, org.apache.avro.Schema> strMap7 = parser5.getTypes();
    org.apache.avro.Schema.Parser parser8 = parser4.addTypes(strMap7);
    org.apache.avro.Schema.Parser parser9 = parser0.addTypes(strMap7);
    java.io.File file10 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema11 = parser9.parse(file10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    org.junit.Assert.assertNotNull(strMap2);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    org.junit.Assert.assertNotNull(strMap7);
    org.junit.Assert.assertNotNull(parser8);
    org.junit.Assert.assertNotNull(parser9);
  }

  @Test
  public void test094() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test094");
    org.apache.avro.Schema.Type type1 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema2 = org.apache.avro.Schema.create(type1);
    org.apache.avro.Schema[] schemaArray3 = new org.apache.avro.Schema[] { schema2 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList4 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList4,
        schemaArray3);
    org.apache.avro.Schema schema6 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList4);
    com.fasterxml.jackson.databind.JsonNode jsonNode7 = null;
    boolean boolean8 = schema6.isValidDefault(jsonNode7);
    org.apache.avro.Schema.Field[] fieldArray10 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList11 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList11,
        fieldArray10);
    org.apache.avro.Schema schema13 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList11);
    org.apache.avro.Schema schema14 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList11);
    org.apache.avro.Schema.SeenPair seenPair16 = new org.apache.avro.Schema.SeenPair((java.lang.Object) fieldList11,
        (java.lang.Object) (short) 100);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema.Field field17 = new org.apache.avro.Schema.Field(
          "{\n  \"type\" : \"map\",\n  \"values\" : [ \"long\" ]\n}", schema6,
          "{\"type\":\"map\",\"values\":[\"long\"]}", (java.lang.Object) fieldList11);
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {?  \"type\" : \"map\",?  \"values\" : [ \"long\" ]?}");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type1 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type1.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema2);
    org.junit.Assert.assertNotNull(schemaArray3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    org.junit.Assert.assertNotNull(schema6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    org.junit.Assert.assertNotNull(fieldArray10);
    org.junit.Assert.assertArrayEquals(fieldArray10, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    org.junit.Assert.assertNotNull(schema13);
    org.junit.Assert.assertNotNull(schema14);
  }

  @Test
  public void test095() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test095");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    org.apache.avro.Schema[] schemaArray2 = new org.apache.avro.Schema[] { schema1 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList3 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList3,
        schemaArray2);
    org.apache.avro.Schema schema5 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
    org.apache.avro.Schema schema6 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
    org.apache.avro.Schema schema7 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
    org.apache.avro.Schema.Type type8 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema9 = org.apache.avro.Schema.create(type8);
    schema7.addAllProps((org.apache.avro.JsonProperties) schema9);
    java.lang.String str11 = schema7.getName();
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertNotNull(schemaArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertNotNull(schema6);
    org.junit.Assert.assertNotNull(schema7);
    org.junit.Assert.assertTrue("'" + type8 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type8.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema9);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "union[long]" + "'", str11, "union[long]");
  }

  @Test
  public void test096() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test096");
    org.apache.avro.Schema.Field[] fieldArray1 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList2 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList2,
        fieldArray1);
    org.apache.avro.Schema schema4 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList2);
    org.apache.avro.Schema schema5 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList2);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema.Field field6 = new org.apache.avro.Schema.Field("union[long]", schema5);
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.SchemaParseException; message: Illegal character in: union[long]");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(fieldArray1);
    org.junit.Assert.assertArrayEquals(fieldArray1, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    org.junit.Assert.assertNotNull(schema4);
    org.junit.Assert.assertNotNull(schema5);
  }

  @Test
  public void test097() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test097");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    org.apache.avro.Schema.Type type2 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema3 = org.apache.avro.Schema.create(type2);
    org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] { schema3 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5,
        schemaArray4);
    org.apache.avro.Schema schema7 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
    com.fasterxml.jackson.databind.JsonNode jsonNode8 = null;
    boolean boolean9 = schema7.isValidDefault(jsonNode8);
    org.apache.avro.Schema schema10 = org.apache.avro.Schema.createArray(schema7);
    org.apache.avro.Schema.Type type11 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema12 = org.apache.avro.Schema.create(type11);
    org.apache.avro.Schema[] schemaArray13 = new org.apache.avro.Schema[] { schema12 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList14 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList14,
        schemaArray13);
    org.apache.avro.Schema schema16 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList14);
    org.apache.avro.Schema schema17 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList14);
    schema7.putAll((org.apache.avro.JsonProperties) schema17);
    org.apache.avro.Schema schema19 = org.apache.avro.Schema.createArray(schema17);
    java.util.function.BiConsumer<java.lang.String, java.lang.Object> strBiConsumer20 = null;
    schema17.forEachProperty(strBiConsumer20);
    schema1.putAll((org.apache.avro.JsonProperties) schema17);
    org.apache.avro.Schema.Type type23 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema24 = org.apache.avro.Schema.create(type23);
    org.apache.avro.Schema[] schemaArray25 = new org.apache.avro.Schema[] { schema24 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList26 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean27 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList26,
        schemaArray25);
    org.apache.avro.Schema schema28 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList26);
    org.apache.avro.Schema schema29 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList26);
    org.apache.avro.Schema schema30 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList26);
    org.apache.avro.Schema.Type type31 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema32 = org.apache.avro.Schema.create(type31);
    schema30.addAllProps((org.apache.avro.JsonProperties) schema32);
    org.apache.avro.Schema schema34 = org.apache.avro.Schema.applyAliases(schema1, schema32);
    org.apache.avro.JsonProperties jsonProperties35 = null;
    // The following exception was thrown during execution in test generation
    try {
      schema34.addAllProps(jsonProperties35);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: Cannot read field \"props\" because \"properties\" is null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertTrue("'" + type2 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type2.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema3);
    org.junit.Assert.assertNotNull(schemaArray4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    org.junit.Assert.assertNotNull(schema7);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    org.junit.Assert.assertNotNull(schema10);
    org.junit.Assert.assertTrue("'" + type11 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type11.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema12);
    org.junit.Assert.assertNotNull(schemaArray13);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    org.junit.Assert.assertNotNull(schema16);
    org.junit.Assert.assertNotNull(schema17);
    org.junit.Assert.assertNotNull(schema19);
    org.junit.Assert.assertTrue("'" + type23 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type23.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema24);
    org.junit.Assert.assertNotNull(schemaArray25);
    org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    org.junit.Assert.assertNotNull(schema28);
    org.junit.Assert.assertNotNull(schema29);
    org.junit.Assert.assertNotNull(schema30);
    org.junit.Assert.assertTrue("'" + type31 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type31.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema32);
    org.junit.Assert.assertNotNull(schema34);
  }

  @Test
  public void test098() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test098");
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("{\"type\":\"map\",\"values\":[\"long\"]}",
          "fixed", "{\n  \"type\" : \"map\",\n  \"values\" : [ \"long\" ]\n}", (int) (short) 100);
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {\"type\":\"map\",\"values\":[\"long\"]}");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
  }

  @Test
  public void test099() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test099");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    org.apache.avro.Schema[] schemaArray2 = new org.apache.avro.Schema[] { schema1 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList3 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList3,
        schemaArray2);
    org.apache.avro.Schema schema5 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
    com.fasterxml.jackson.databind.JsonNode jsonNode6 = null;
    boolean boolean7 = schema5.isValidDefault(jsonNode6);
    org.apache.avro.Schema schema8 = org.apache.avro.Schema.createArray(schema5);
    org.apache.avro.Schema.Type type9 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema10 = org.apache.avro.Schema.create(type9);
    org.apache.avro.Schema[] schemaArray11 = new org.apache.avro.Schema[] { schema10 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList12 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList12,
        schemaArray11);
    org.apache.avro.Schema schema14 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList12);
    org.apache.avro.Schema schema15 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList12);
    schema5.putAll((org.apache.avro.JsonProperties) schema15);
    org.apache.avro.Schema.Parser parser18 = new org.apache.avro.Schema.Parser();
    boolean boolean19 = parser18.getValidateDefaults();
    java.util.Map<java.lang.String, org.apache.avro.Schema> strMap20 = parser18.getTypes();
    org.apache.avro.NameValidator nameValidator21 = null;
    org.apache.avro.Schema.Parser parser22 = new org.apache.avro.Schema.Parser(nameValidator21);
    org.apache.avro.Schema.Parser parser23 = new org.apache.avro.Schema.Parser();
    boolean boolean24 = parser23.getValidateDefaults();
    java.util.Map<java.lang.String, org.apache.avro.Schema> strMap25 = parser23.getTypes();
    org.apache.avro.Schema.Parser parser26 = parser22.addTypes(strMap25);
    org.apache.avro.Schema.Parser parser27 = parser18.addTypes(strMap25);
    // The following exception was thrown during execution in test generation
    try {
      schema5.addProp("{\n  \"type\" : \"map\",\n  \"values\" : [ \"long\" ]\n}", (java.lang.Object) parser27);
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Unknown datum class: class org.apache.avro.Schema$Parser");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertNotNull(schemaArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertNotNull(schema8);
    org.junit.Assert.assertTrue("'" + type9 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type9.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema10);
    org.junit.Assert.assertNotNull(schemaArray11);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    org.junit.Assert.assertNotNull(schema14);
    org.junit.Assert.assertNotNull(schema15);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    org.junit.Assert.assertNotNull(strMap20);
    org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    org.junit.Assert.assertNotNull(strMap25);
    org.junit.Assert.assertNotNull(parser26);
    org.junit.Assert.assertNotNull(parser27);
  }

  @Test
  public void test100() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test100");
    org.apache.avro.NameValidator nameValidator0 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.Schema.setNameValidator(nameValidator0);
    org.junit.Assert.assertNotNull(nameValidator0);
  }

  @Test
  public void test101() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test101");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    org.apache.avro.Schema[] schemaArray2 = new org.apache.avro.Schema[] { schema1 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList3 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList3,
        schemaArray2);
    org.apache.avro.Schema schema5 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
    com.fasterxml.jackson.databind.JsonNode jsonNode6 = null;
    boolean boolean7 = schema5.isValidDefault(jsonNode6);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema8 = schema5.getValueType();
      org.junit.Assert
          .fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a map: [\"long\"]");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertNotNull(schemaArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
  }

  @Test
  public void test102() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test102");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    org.apache.avro.Schema[] schemaArray2 = new org.apache.avro.Schema[] { schema1 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList3 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList3,
        schemaArray2);
    org.apache.avro.Schema schema5 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
    org.apache.avro.Schema schema6 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
    java.lang.String str7 = schema6.getFullName();
    org.apache.avro.Schema.Type type8 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema9 = org.apache.avro.Schema.create(type8);
    org.apache.avro.Schema[] schemaArray10 = new org.apache.avro.Schema[] { schema9 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList11 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList11,
        schemaArray10);
    org.apache.avro.Schema schema13 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList11);
    com.fasterxml.jackson.databind.JsonNode jsonNode14 = null;
    boolean boolean15 = schema13.isValidDefault(jsonNode14);
    org.apache.avro.Schema schema16 = org.apache.avro.Schema.createArray(schema13);
    org.apache.avro.Schema.Type type17 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema18 = org.apache.avro.Schema.create(type17);
    org.apache.avro.Schema[] schemaArray19 = new org.apache.avro.Schema[] { schema18 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList20 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean21 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList20,
        schemaArray19);
    org.apache.avro.Schema schema22 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList20);
    org.apache.avro.Schema schema23 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList20);
    schema13.putAll((org.apache.avro.JsonProperties) schema23);
    org.apache.avro.Schema schema25 = org.apache.avro.Schema.createArray(schema23);
    java.util.function.BiConsumer<java.lang.String, java.lang.Object> strBiConsumer26 = null;
    schema23.forEachProperty(strBiConsumer26);
    java.lang.String str28 = schema23.getDoc();
    boolean boolean29 = schema6.equals((java.lang.Object) schema23);
    boolean boolean30 = schema6.hasProps();
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertNotNull(schemaArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertNotNull(schema6);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "union[long]" + "'", str7, "union[long]");
    org.junit.Assert.assertTrue("'" + type8 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type8.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema9);
    org.junit.Assert.assertNotNull(schemaArray10);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    org.junit.Assert.assertNotNull(schema13);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    org.junit.Assert.assertNotNull(schema16);
    org.junit.Assert.assertTrue("'" + type17 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type17.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema18);
    org.junit.Assert.assertNotNull(schemaArray19);
    org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    org.junit.Assert.assertNotNull(schema22);
    org.junit.Assert.assertNotNull(schema23);
    org.junit.Assert.assertNotNull(schema25);
    org.junit.Assert.assertNull(str28);
    org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
  }

  @Test
  public void test103() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test103");
    org.apache.avro.Schema.Field[] fieldArray4 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList5 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList5,
        fieldArray4);
    org.apache.avro.Schema schema7 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList5);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema8 = org.apache.avro.Schema.createRecord(
          "{\n  \"type\" : \"map\",\n  \"values\" : [ \"long\" ]\n}", "", "[\"long\"]", false,
          (java.util.List<org.apache.avro.Schema.Field>) fieldList5);
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {?  \"type\" : \"map\",?  \"values\" : [ \"long\" ]?}");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(fieldArray4);
    org.junit.Assert.assertArrayEquals(fieldArray4, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    org.junit.Assert.assertNotNull(schema7);
  }

  @Test
  public void test104() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test104");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    org.apache.avro.Schema[] schemaArray2 = new org.apache.avro.Schema[] { schema1 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList3 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList3,
        schemaArray2);
    org.apache.avro.Schema schema5 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
    com.fasterxml.jackson.databind.JsonNode jsonNode6 = null;
    boolean boolean7 = schema5.isValidDefault(jsonNode6);
    org.apache.avro.Schema schema8 = org.apache.avro.Schema.createArray(schema5);
    org.apache.avro.Schema.Type type9 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema10 = org.apache.avro.Schema.create(type9);
    org.apache.avro.Schema[] schemaArray11 = new org.apache.avro.Schema[] { schema10 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList12 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList12,
        schemaArray11);
    org.apache.avro.Schema schema14 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList12);
    org.apache.avro.Schema schema15 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList12);
    schema5.putAll((org.apache.avro.JsonProperties) schema15);
    org.apache.avro.Schema schema17 = org.apache.avro.Schema.createArray(schema15);
    java.util.function.BiConsumer<java.lang.String, java.lang.Object> strBiConsumer18 = null;
    schema15.forEachProperty(strBiConsumer18);
    java.lang.String str20 = schema15.getDoc();
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList21 = schema15.getEnumSymbols();
      org.junit.Assert
          .fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: [\"long\"]");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertNotNull(schemaArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertNotNull(schema8);
    org.junit.Assert.assertTrue("'" + type9 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type9.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema10);
    org.junit.Assert.assertNotNull(schemaArray11);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    org.junit.Assert.assertNotNull(schema14);
    org.junit.Assert.assertNotNull(schema15);
    org.junit.Assert.assertNotNull(schema17);
    org.junit.Assert.assertNull(str20);
  }

  @Test
  public void test105() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test105");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    org.apache.avro.Schema[] schemaArray2 = new org.apache.avro.Schema[] { schema1 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList3 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList3,
        schemaArray2);
    org.apache.avro.Schema schema5 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
    com.fasterxml.jackson.databind.JsonNode jsonNode6 = null;
    boolean boolean7 = schema5.isValidDefault(jsonNode6);
    org.apache.avro.Schema schema8 = org.apache.avro.Schema.createArray(schema5);
    org.apache.avro.Schema.Type type9 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema10 = org.apache.avro.Schema.create(type9);
    org.apache.avro.Schema[] schemaArray11 = new org.apache.avro.Schema[] { schema10 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList12 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList12,
        schemaArray11);
    org.apache.avro.Schema schema14 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList12);
    org.apache.avro.Schema schema15 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList12);
    schema5.putAll((org.apache.avro.JsonProperties) schema15);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema.Field field18 = schema5.getField("union[long]");
      org.junit.Assert
          .fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: [\"long\"]");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertNotNull(schemaArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertNotNull(schema8);
    org.junit.Assert.assertTrue("'" + type9 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type9.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema10);
    org.junit.Assert.assertNotNull(schemaArray11);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    org.junit.Assert.assertNotNull(schema14);
    org.junit.Assert.assertNotNull(schema15);
  }

  @Test
  public void test106() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test106");
    org.apache.avro.NameValidator nameValidator0 = null;
    org.apache.avro.Schema.Parser parser1 = new org.apache.avro.Schema.Parser(nameValidator0);
    org.apache.avro.Schema.Parser parser2 = new org.apache.avro.Schema.Parser();
    boolean boolean3 = parser2.getValidateDefaults();
    java.util.Map<java.lang.String, org.apache.avro.Schema> strMap4 = parser2.getTypes();
    org.apache.avro.Schema.Parser parser5 = parser1.addTypes(strMap4);
    java.io.InputStream inputStream6 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema7 = parser5.parse(inputStream6);
      org.junit.Assert
          .fail("Expected exception of type org.apache.avro.SchemaParseException; message: Cannot parse <null> schema");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    org.junit.Assert.assertNotNull(strMap4);
    org.junit.Assert.assertNotNull(parser5);
  }

  @Test
  public void test107() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test107");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    org.apache.avro.Schema[] schemaArray2 = new org.apache.avro.Schema[] { schema1 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList3 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList3,
        schemaArray2);
    org.apache.avro.Schema schema5 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
    com.fasterxml.jackson.databind.JsonNode jsonNode6 = null;
    boolean boolean7 = schema5.isValidDefault(jsonNode6);
    org.apache.avro.Schema schema8 = org.apache.avro.Schema.createMap(schema5);
    // The following exception was thrown during execution in test generation
    try {
      int int9 = schema5.getFixedSize();
      org.junit.Assert
          .fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not fixed: [\"long\"]");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertNotNull(schemaArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertNotNull(schema8);
  }

  @Test
  public void test108() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test108");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    org.apache.avro.Schema[] schemaArray2 = new org.apache.avro.Schema[] { schema1 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList3 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList3,
        schemaArray2);
    org.apache.avro.Schema schema5 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
    org.apache.avro.LogicalType logicalType6 = schema5.getLogicalType();
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertNotNull(schemaArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertNull(logicalType6);
  }

  @Test
  public void test109() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test109");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    org.apache.avro.Schema[] schemaArray2 = new org.apache.avro.Schema[] { schema1 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList3 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList3,
        schemaArray2);
    org.apache.avro.Schema schema5 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
    com.fasterxml.jackson.databind.JsonNode jsonNode6 = null;
    boolean boolean7 = schema5.isValidDefault(jsonNode6);
    org.apache.avro.Schema schema8 = org.apache.avro.Schema.createArray(schema5);
    org.apache.avro.Schema.Type type9 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema10 = org.apache.avro.Schema.create(type9);
    org.apache.avro.Schema[] schemaArray11 = new org.apache.avro.Schema[] { schema10 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList12 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList12,
        schemaArray11);
    org.apache.avro.Schema schema14 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList12);
    org.apache.avro.Schema schema15 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList12);
    schema5.putAll((org.apache.avro.JsonProperties) schema15);
    org.apache.avro.Schema schema17 = org.apache.avro.Schema.createArray(schema15);
    boolean boolean19 = schema17.equals((java.lang.Object) 100);
    // The following exception was thrown during execution in test generation
    try {
      java.util.Set<java.lang.String> strSet20 = schema17.getAliases();
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: {\"type\":\"array\",\"items\":[\"long\"]}");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertNotNull(schemaArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertNotNull(schema8);
    org.junit.Assert.assertTrue("'" + type9 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type9.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema10);
    org.junit.Assert.assertNotNull(schemaArray11);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    org.junit.Assert.assertNotNull(schema14);
    org.junit.Assert.assertNotNull(schema15);
    org.junit.Assert.assertNotNull(schema17);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
  }

  @Test
  public void test110() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test110");
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema4 = org.apache.avro.Schema.createRecord("", "fixed", "union[long]", true);
      org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Empty name");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
  }

  @Test
  public void test111() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test111");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    org.apache.avro.Schema[] schemaArray2 = new org.apache.avro.Schema[] { schema1 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList3 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList3,
        schemaArray2);
    org.apache.avro.Schema schema5 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
    com.fasterxml.jackson.databind.JsonNode jsonNode6 = null;
    boolean boolean7 = schema5.isValidDefault(jsonNode6);
    org.apache.avro.Schema schema8 = org.apache.avro.Schema.createArray(schema5);
    org.apache.avro.Schema.Type type9 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema10 = org.apache.avro.Schema.create(type9);
    org.apache.avro.Schema[] schemaArray11 = new org.apache.avro.Schema[] { schema10 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList12 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList12,
        schemaArray11);
    org.apache.avro.Schema schema14 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList12);
    org.apache.avro.Schema schema15 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList12);
    schema5.putAll((org.apache.avro.JsonProperties) schema15);
    org.apache.avro.Schema schema17 = org.apache.avro.Schema.createArray(schema15);
    java.util.function.BiConsumer<java.lang.String, java.lang.Object> strBiConsumer18 = null;
    schema15.forEachProperty(strBiConsumer18);
    java.lang.String str20 = schema15.getDoc();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str21 = schema15.getEnumDefault();
      org.junit.Assert
          .fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: [\"long\"]");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertNotNull(schemaArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertNotNull(schema8);
    org.junit.Assert.assertTrue("'" + type9 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type9.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema10);
    org.junit.Assert.assertNotNull(schemaArray11);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    org.junit.Assert.assertNotNull(schema14);
    org.junit.Assert.assertNotNull(schema15);
    org.junit.Assert.assertNotNull(schema17);
    org.junit.Assert.assertNull(str20);
  }

  @Test
  public void test112() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test112");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    org.apache.avro.Schema[] schemaArray2 = new org.apache.avro.Schema[] { schema1 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList3 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList3,
        schemaArray2);
    org.apache.avro.Schema schema5 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
    org.apache.avro.Schema schema6 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
    java.lang.String str7 = schema6.getFullName();
    org.apache.avro.Schema.Type type8 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema9 = org.apache.avro.Schema.create(type8);
    org.apache.avro.Schema[] schemaArray10 = new org.apache.avro.Schema[] { schema9 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList11 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList11,
        schemaArray10);
    org.apache.avro.Schema schema13 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList11);
    com.fasterxml.jackson.databind.JsonNode jsonNode14 = null;
    boolean boolean15 = schema13.isValidDefault(jsonNode14);
    org.apache.avro.Schema schema16 = org.apache.avro.Schema.createArray(schema13);
    org.apache.avro.Schema.Type type17 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema18 = org.apache.avro.Schema.create(type17);
    org.apache.avro.Schema[] schemaArray19 = new org.apache.avro.Schema[] { schema18 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList20 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean21 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList20,
        schemaArray19);
    org.apache.avro.Schema schema22 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList20);
    org.apache.avro.Schema schema23 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList20);
    schema13.putAll((org.apache.avro.JsonProperties) schema23);
    org.apache.avro.Schema schema25 = org.apache.avro.Schema.createArray(schema23);
    java.util.function.BiConsumer<java.lang.String, java.lang.Object> strBiConsumer26 = null;
    schema23.forEachProperty(strBiConsumer26);
    java.lang.String str28 = schema23.getDoc();
    boolean boolean29 = schema6.equals((java.lang.Object) schema23);
    org.apache.avro.Schema.Type type30 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema31 = org.apache.avro.Schema.create(type30);
    org.apache.avro.Schema.Type type32 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema33 = org.apache.avro.Schema.create(type32);
    org.apache.avro.Schema[] schemaArray34 = new org.apache.avro.Schema[] { schema33 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList35 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean36 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList35,
        schemaArray34);
    org.apache.avro.Schema schema37 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList35);
    com.fasterxml.jackson.databind.JsonNode jsonNode38 = null;
    boolean boolean39 = schema37.isValidDefault(jsonNode38);
    org.apache.avro.Schema schema40 = org.apache.avro.Schema.createArray(schema37);
    org.apache.avro.Schema.Type type41 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema42 = org.apache.avro.Schema.create(type41);
    org.apache.avro.Schema[] schemaArray43 = new org.apache.avro.Schema[] { schema42 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList44 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean45 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList44,
        schemaArray43);
    org.apache.avro.Schema schema46 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList44);
    org.apache.avro.Schema schema47 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList44);
    schema37.putAll((org.apache.avro.JsonProperties) schema47);
    org.apache.avro.Schema schema49 = org.apache.avro.Schema.createArray(schema47);
    java.util.function.BiConsumer<java.lang.String, java.lang.Object> strBiConsumer50 = null;
    schema47.forEachProperty(strBiConsumer50);
    schema31.putAll((org.apache.avro.JsonProperties) schema47);
    schema6.addAllProps((org.apache.avro.JsonProperties) schema31);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema54 = schema6.getElementType();
      org.junit.Assert
          .fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an array: [\"long\"]");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertNotNull(schemaArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertNotNull(schema6);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "union[long]" + "'", str7, "union[long]");
    org.junit.Assert.assertTrue("'" + type8 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type8.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema9);
    org.junit.Assert.assertNotNull(schemaArray10);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    org.junit.Assert.assertNotNull(schema13);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    org.junit.Assert.assertNotNull(schema16);
    org.junit.Assert.assertTrue("'" + type17 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type17.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema18);
    org.junit.Assert.assertNotNull(schemaArray19);
    org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    org.junit.Assert.assertNotNull(schema22);
    org.junit.Assert.assertNotNull(schema23);
    org.junit.Assert.assertNotNull(schema25);
    org.junit.Assert.assertNull(str28);
    org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    org.junit.Assert.assertTrue("'" + type30 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type30.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema31);
    org.junit.Assert.assertTrue("'" + type32 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type32.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema33);
    org.junit.Assert.assertNotNull(schemaArray34);
    org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    org.junit.Assert.assertNotNull(schema37);
    org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    org.junit.Assert.assertNotNull(schema40);
    org.junit.Assert.assertTrue("'" + type41 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type41.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema42);
    org.junit.Assert.assertNotNull(schemaArray43);
    org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    org.junit.Assert.assertNotNull(schema46);
    org.junit.Assert.assertNotNull(schema47);
    org.junit.Assert.assertNotNull(schema49);
  }

  @Test
  public void test113() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test113");
    org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
    boolean boolean1 = parser0.getValidateDefaults();
    java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
    org.apache.avro.NameValidator nameValidator3 = null;
    org.apache.avro.Schema.Parser parser4 = new org.apache.avro.Schema.Parser(nameValidator3);
    org.apache.avro.Schema.Parser parser5 = new org.apache.avro.Schema.Parser();
    boolean boolean6 = parser5.getValidateDefaults();
    java.util.Map<java.lang.String, org.apache.avro.Schema> strMap7 = parser5.getTypes();
    org.apache.avro.Schema.Parser parser8 = parser4.addTypes(strMap7);
    org.apache.avro.Schema.Parser parser9 = parser0.addTypes(strMap7);
    org.apache.avro.Schema.Type type10 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema11 = org.apache.avro.Schema.create(type10);
    org.apache.avro.Schema[] schemaArray12 = new org.apache.avro.Schema[] { schema11 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList13 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList13,
        schemaArray12);
    org.apache.avro.Schema schema15 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList13);
    org.apache.avro.Schema schema16 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList13);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema.Parser parser17 = parser9
          .addTypes((java.lang.Iterable<org.apache.avro.Schema>) schemaList13);
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroTypeException; message: You can only put a named schema into the context");
    } catch (org.apache.avro.AvroTypeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    org.junit.Assert.assertNotNull(strMap2);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    org.junit.Assert.assertNotNull(strMap7);
    org.junit.Assert.assertNotNull(parser8);
    org.junit.Assert.assertNotNull(parser9);
    org.junit.Assert.assertTrue("'" + type10 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type10.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema11);
    org.junit.Assert.assertNotNull(schemaArray12);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    org.junit.Assert.assertNotNull(schema15);
    org.junit.Assert.assertNotNull(schema16);
  }

  @Test
  public void test114() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test114");
    org.apache.avro.Schema.Field[] fieldArray0 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList1 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList1,
        fieldArray0);
    org.apache.avro.Schema schema3 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
    org.apache.avro.Schema schema4 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
    org.apache.avro.Schema.Type type5 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema6 = org.apache.avro.Schema.create(type5);
    org.apache.avro.Schema[] schemaArray7 = new org.apache.avro.Schema[] { schema6 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList8 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean9 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList8,
        schemaArray7);
    org.apache.avro.Schema schema10 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList8);
    org.apache.avro.Schema schema11 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList8);
    java.lang.String str13 = schema4.toString((java.util.Collection<org.apache.avro.Schema>) schemaList8, true);
    org.junit.Assert.assertNotNull(fieldArray0);
    org.junit.Assert.assertArrayEquals(fieldArray0, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertNotNull(schema3);
    org.junit.Assert.assertNotNull(schema4);
    org.junit.Assert.assertTrue("'" + type5 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type5.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema6);
    org.junit.Assert.assertNotNull(schemaArray7);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    org.junit.Assert.assertNotNull(schema10);
    org.junit.Assert.assertNotNull(schema11);
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{\n  \"type\" : \"record\",\n  \"fields\" : [ ]\n}" + "'",
        str13, "{\n  \"type\" : \"record\",\n  \"fields\" : [ ]\n}");
  }

  @Test
  public void test115() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test115");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    org.apache.avro.Schema[] schemaArray2 = new org.apache.avro.Schema[] { schema1 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList3 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList3,
        schemaArray2);
    org.apache.avro.Schema schema5 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
    org.apache.avro.Schema schema6 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
    java.lang.String str7 = schema6.getFullName();
    java.lang.String str8 = schema6.getFullName();
    java.lang.String str9 = schema6.getDoc();
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertNotNull(schemaArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertNotNull(schema6);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "union[long]" + "'", str7, "union[long]");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "union[long]" + "'", str8, "union[long]");
    org.junit.Assert.assertNull(str9);
  }

  @Test
  public void test116() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test116");
    org.apache.avro.Schema.Type type1 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema2 = org.apache.avro.Schema.create(type1);
    org.apache.avro.Schema[] schemaArray3 = new org.apache.avro.Schema[] { schema2 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList4 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList4,
        schemaArray3);
    org.apache.avro.Schema schema6 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList4);
    org.apache.avro.Schema schema7 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList4);
    org.apache.avro.Schema schema8 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList4);
    java.lang.String str10 = schema8.toString(false);
    org.apache.avro.Schema.Type type11 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema12 = org.apache.avro.Schema.create(type11);
    org.apache.avro.Schema[] schemaArray13 = new org.apache.avro.Schema[] { schema12 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList14 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList14,
        schemaArray13);
    org.apache.avro.Schema schema16 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList14);
    com.fasterxml.jackson.databind.JsonNode jsonNode17 = null;
    boolean boolean18 = schema16.isValidDefault(jsonNode17);
    org.apache.avro.Schema schema19 = org.apache.avro.Schema.createArray(schema16);
    org.apache.avro.Schema.Type type21 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema22 = org.apache.avro.Schema.create(type21);
    org.apache.avro.Schema[] schemaArray23 = new org.apache.avro.Schema[] { schema22 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList24 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean25 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList24,
        schemaArray23);
    org.apache.avro.Schema schema26 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList24);
    com.fasterxml.jackson.databind.JsonNode jsonNode27 = null;
    boolean boolean28 = schema26.isValidDefault(jsonNode27);
    org.apache.avro.Schema schema29 = org.apache.avro.Schema.createArray(schema26);
    java.lang.Object obj30 = schema19.getObjectProp("hi!", (java.lang.Object) schema29);
    org.apache.avro.Schema.SeenPair seenPair31 = new org.apache.avro.Schema.SeenPair((java.lang.Object) schema8,
        (java.lang.Object) "hi!");
    org.apache.avro.Schema.Type type33 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema34 = org.apache.avro.Schema.create(type33);
    org.apache.avro.Schema[] schemaArray35 = new org.apache.avro.Schema[] { schema34 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList36 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean37 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList36,
        schemaArray35);
    org.apache.avro.Schema schema38 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList36);
    org.apache.avro.Schema schema39 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList36);
    org.apache.avro.Schema schema40 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList36);
    org.apache.avro.Schema.Type type41 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema42 = org.apache.avro.Schema.create(type41);
    schema40.addAllProps((org.apache.avro.JsonProperties) schema42);
    org.apache.avro.Schema.Field.Order order44 = org.apache.avro.Schema.Field.Order.DESCENDING;
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema.Field field45 = new org.apache.avro.Schema.Field("", schema8, "\"long\"",
          (java.lang.Object) schema40, order44);
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Unknown datum class: class org.apache.avro.Schema$UnionSchema");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type1 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type1.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema2);
    org.junit.Assert.assertNotNull(schemaArray3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    org.junit.Assert.assertNotNull(schema6);
    org.junit.Assert.assertNotNull(schema7);
    org.junit.Assert.assertNotNull(schema8);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[\"long\"]" + "'", str10, "[\"long\"]");
    org.junit.Assert.assertTrue("'" + type11 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type11.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema12);
    org.junit.Assert.assertNotNull(schemaArray13);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    org.junit.Assert.assertNotNull(schema16);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    org.junit.Assert.assertNotNull(schema19);
    org.junit.Assert.assertTrue("'" + type21 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type21.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema22);
    org.junit.Assert.assertNotNull(schemaArray23);
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    org.junit.Assert.assertNotNull(schema26);
    org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    org.junit.Assert.assertNotNull(schema29);
    org.junit.Assert.assertNotNull(obj30);
    org.junit.Assert.assertEquals(obj30.toString(), "{\"type\":\"array\",\"items\":[\"long\"]}");
    org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "{\"type\":\"array\",\"items\":[\"long\"]}");
    org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "{\"type\":\"array\",\"items\":[\"long\"]}");
    org.junit.Assert.assertTrue("'" + type33 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type33.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema34);
    org.junit.Assert.assertNotNull(schemaArray35);
    org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    org.junit.Assert.assertNotNull(schema38);
    org.junit.Assert.assertNotNull(schema39);
    org.junit.Assert.assertNotNull(schema40);
    org.junit.Assert.assertTrue("'" + type41 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type41.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema42);
    org.junit.Assert.assertTrue("'" + order44 + "' != '" + org.apache.avro.Schema.Field.Order.DESCENDING + "'",
        order44.equals(org.apache.avro.Schema.Field.Order.DESCENDING));
  }

  @Test
  public void test117() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test117");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    org.apache.avro.Schema[] schemaArray2 = new org.apache.avro.Schema[] { schema1 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList3 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList3,
        schemaArray2);
    org.apache.avro.Schema schema5 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
    com.fasterxml.jackson.databind.JsonNode jsonNode6 = null;
    boolean boolean7 = schema5.isValidDefault(jsonNode6);
    org.apache.avro.Schema schema8 = org.apache.avro.Schema.createArray(schema5);
    // The following exception was thrown during execution in test generation
    try {
      int int10 = schema5.getEnumOrdinal("{\n  \"type\" : \"record\",\n  \"fields\" : [ ]\n}");
      org.junit.Assert
          .fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: [\"long\"]");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertNotNull(schemaArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertNotNull(schema8);
  }

  @Test
  public void test118() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test118");
    java.lang.String[] strArray5 = new java.lang.String[] { "{\n  \"type\" : \"record\",\n  \"fields\" : [ ]\n}",
        "fixed" };
    java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
    boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema8 = org.apache.avro.Schema.createEnum("hi!", "union[long]", "",
          (java.util.List<java.lang.String>) strList6);
      org.junit.Assert
          .fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal character in: hi!");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(strArray5);
    org.junit.Assert.assertArrayEquals(strArray5,
        new java.lang.String[] { "{\n  \"type\" : \"record\",\n  \"fields\" : [ ]\n}", "fixed" });
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
  }

  @Test
  public void test119() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test119");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    org.apache.avro.Schema.Type type2 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema3 = org.apache.avro.Schema.create(type2);
    org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] { schema3 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5,
        schemaArray4);
    org.apache.avro.Schema schema7 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
    com.fasterxml.jackson.databind.JsonNode jsonNode8 = null;
    boolean boolean9 = schema7.isValidDefault(jsonNode8);
    org.apache.avro.Schema schema10 = org.apache.avro.Schema.createArray(schema7);
    org.apache.avro.Schema.Type type11 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema12 = org.apache.avro.Schema.create(type11);
    org.apache.avro.Schema[] schemaArray13 = new org.apache.avro.Schema[] { schema12 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList14 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList14,
        schemaArray13);
    org.apache.avro.Schema schema16 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList14);
    org.apache.avro.Schema schema17 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList14);
    schema7.putAll((org.apache.avro.JsonProperties) schema17);
    org.apache.avro.Schema schema19 = org.apache.avro.Schema.createArray(schema17);
    java.util.function.BiConsumer<java.lang.String, java.lang.Object> strBiConsumer20 = null;
    schema17.forEachProperty(strBiConsumer20);
    schema1.putAll((org.apache.avro.JsonProperties) schema17);
    org.apache.avro.Schema.Type type23 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema24 = org.apache.avro.Schema.create(type23);
    org.apache.avro.Schema[] schemaArray25 = new org.apache.avro.Schema[] { schema24 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList26 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean27 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList26,
        schemaArray25);
    org.apache.avro.Schema schema28 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList26);
    org.apache.avro.Schema schema29 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList26);
    org.apache.avro.Schema schema30 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList26);
    org.apache.avro.Schema.Type type31 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema32 = org.apache.avro.Schema.create(type31);
    schema30.addAllProps((org.apache.avro.JsonProperties) schema32);
    org.apache.avro.Schema schema34 = org.apache.avro.Schema.applyAliases(schema1, schema32);
    boolean boolean35 = schema1.isUnion();
    // The following exception was thrown during execution in test generation
    try {
      boolean boolean36 = schema1.isError();
      org.junit.Assert
          .fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: \"long\"");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertTrue("'" + type2 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type2.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema3);
    org.junit.Assert.assertNotNull(schemaArray4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    org.junit.Assert.assertNotNull(schema7);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    org.junit.Assert.assertNotNull(schema10);
    org.junit.Assert.assertTrue("'" + type11 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type11.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema12);
    org.junit.Assert.assertNotNull(schemaArray13);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    org.junit.Assert.assertNotNull(schema16);
    org.junit.Assert.assertNotNull(schema17);
    org.junit.Assert.assertNotNull(schema19);
    org.junit.Assert.assertTrue("'" + type23 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type23.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema24);
    org.junit.Assert.assertNotNull(schemaArray25);
    org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    org.junit.Assert.assertNotNull(schema28);
    org.junit.Assert.assertNotNull(schema29);
    org.junit.Assert.assertNotNull(schema30);
    org.junit.Assert.assertTrue("'" + type31 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type31.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema32);
    org.junit.Assert.assertNotNull(schema34);
    org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
  }

  @Test
  public void test120() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test120");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    org.apache.avro.Schema[] schemaArray2 = new org.apache.avro.Schema[] { schema1 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList3 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList3,
        schemaArray2);
    org.apache.avro.Schema schema5 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
    org.apache.avro.Schema schema6 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
    org.apache.avro.Schema schema7 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
    java.lang.String str9 = schema7.toString(false);
    org.apache.avro.Schema.Field[] fieldArray10 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList11 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList11,
        fieldArray10);
    org.apache.avro.Schema schema13 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList11);
    org.apache.avro.Schema schema14 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList11);
    org.apache.avro.Schema.SeenPair seenPair16 = new org.apache.avro.Schema.SeenPair((java.lang.Object) fieldList11,
        (java.lang.Object) (short) 100);
    // The following exception was thrown during execution in test generation
    try {
      schema7.setFields((java.util.List<org.apache.avro.Schema.Field>) fieldList11);
      org.junit.Assert
          .fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: [\"long\"]");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertNotNull(schemaArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertNotNull(schema6);
    org.junit.Assert.assertNotNull(schema7);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[\"long\"]" + "'", str9, "[\"long\"]");
    org.junit.Assert.assertNotNull(fieldArray10);
    org.junit.Assert.assertArrayEquals(fieldArray10, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    org.junit.Assert.assertNotNull(schema13);
    org.junit.Assert.assertNotNull(schema14);
  }

  @Test
  public void test121() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test121");
    org.apache.avro.Schema.Type type1 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema2 = org.apache.avro.Schema.create(type1);
    org.apache.avro.Schema[] schemaArray3 = new org.apache.avro.Schema[] { schema2 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList4 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList4,
        schemaArray3);
    org.apache.avro.Schema schema6 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList4);
    org.apache.avro.Schema schema7 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList4);
    org.apache.avro.Schema.SeenPair seenPair8 = new org.apache.avro.Schema.SeenPair((java.lang.Object) 1,
        (java.lang.Object) schemaList4);
    java.lang.Object obj9 = null;
    boolean boolean10 = seenPair8.equals(obj9);
    org.apache.avro.Schema.Type type11 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema12 = org.apache.avro.Schema.create(type11);
    org.apache.avro.Schema[] schemaArray13 = new org.apache.avro.Schema[] { schema12 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList14 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList14,
        schemaArray13);
    org.apache.avro.Schema schema16 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList14);
    com.fasterxml.jackson.databind.JsonNode jsonNode17 = null;
    boolean boolean18 = schema16.isValidDefault(jsonNode17);
    org.apache.avro.Schema schema19 = org.apache.avro.Schema.createArray(schema16);
    org.apache.avro.Schema.Type type20 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema21 = org.apache.avro.Schema.create(type20);
    org.apache.avro.Schema[] schemaArray22 = new org.apache.avro.Schema[] { schema21 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList23 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean24 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList23,
        schemaArray22);
    org.apache.avro.Schema schema25 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList23);
    org.apache.avro.Schema schema26 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList23);
    schema16.putAll((org.apache.avro.JsonProperties) schema26);
    org.apache.avro.Schema schema28 = org.apache.avro.Schema.createArray(schema26);
    java.util.function.BiConsumer<java.lang.String, java.lang.Object> strBiConsumer29 = null;
    schema26.forEachProperty(strBiConsumer29);
    boolean boolean31 = seenPair8.equals((java.lang.Object) schema26);
    // The following exception was thrown during execution in test generation
    try {
      boolean boolean32 = schema26.hasFields();
      org.junit.Assert
          .fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: [\"long\"]");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type1 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type1.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema2);
    org.junit.Assert.assertNotNull(schemaArray3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    org.junit.Assert.assertNotNull(schema6);
    org.junit.Assert.assertNotNull(schema7);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    org.junit.Assert.assertTrue("'" + type11 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type11.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema12);
    org.junit.Assert.assertNotNull(schemaArray13);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    org.junit.Assert.assertNotNull(schema16);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    org.junit.Assert.assertNotNull(schema19);
    org.junit.Assert.assertTrue("'" + type20 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type20.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema21);
    org.junit.Assert.assertNotNull(schemaArray22);
    org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    org.junit.Assert.assertNotNull(schema25);
    org.junit.Assert.assertNotNull(schema26);
    org.junit.Assert.assertNotNull(schema28);
    org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
  }

  @Test
  public void test122() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test122");
    org.apache.avro.Schema.Type type1 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema2 = org.apache.avro.Schema.create(type1);
    org.apache.avro.Schema[] schemaArray3 = new org.apache.avro.Schema[] { schema2 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList4 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList4,
        schemaArray3);
    org.apache.avro.Schema schema6 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList4);
    com.fasterxml.jackson.databind.JsonNode jsonNode7 = null;
    boolean boolean8 = schema6.isValidDefault(jsonNode7);
    org.apache.avro.Schema schema9 = org.apache.avro.Schema.createArray(schema6);
    java.util.Map<java.lang.String, java.lang.Object> strMap10 = schema6.getObjectProps();
    org.apache.avro.Schema.Type type12 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema13 = org.apache.avro.Schema.create(type12);
    org.apache.avro.Schema[] schemaArray14 = new org.apache.avro.Schema[] { schema13 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList15 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList15,
        schemaArray14);
    org.apache.avro.Schema schema17 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList15);
    com.fasterxml.jackson.databind.JsonNode jsonNode18 = null;
    boolean boolean19 = schema17.isValidDefault(jsonNode18);
    org.apache.avro.Schema schema20 = org.apache.avro.Schema.createArray(schema17);
    org.apache.avro.Schema.Type type21 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema22 = org.apache.avro.Schema.create(type21);
    org.apache.avro.Schema[] schemaArray23 = new org.apache.avro.Schema[] { schema22 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList24 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean25 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList24,
        schemaArray23);
    org.apache.avro.Schema schema26 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList24);
    org.apache.avro.Schema schema27 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList24);
    schema17.putAll((org.apache.avro.JsonProperties) schema27);
    org.apache.avro.Schema schema29 = org.apache.avro.Schema.createArray(schema27);
    java.util.function.BiConsumer<java.lang.String, java.lang.Object> strBiConsumer30 = null;
    schema27.forEachProperty(strBiConsumer30);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema.Field field32 = new org.apache.avro.Schema.Field(
          "{\"type\":\"map\",\"values\":[\"long\"]}", schema6, "{\"type\":\"map\",\"values\":[\"long\"]}",
          (java.lang.Object) schema27);
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Unknown datum class: class org.apache.avro.Schema$UnionSchema");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type1 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type1.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema2);
    org.junit.Assert.assertNotNull(schemaArray3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    org.junit.Assert.assertNotNull(schema6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    org.junit.Assert.assertNotNull(schema9);
    org.junit.Assert.assertNotNull(strMap10);
    org.junit.Assert.assertTrue("'" + type12 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type12.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema13);
    org.junit.Assert.assertNotNull(schemaArray14);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    org.junit.Assert.assertNotNull(schema17);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    org.junit.Assert.assertNotNull(schema20);
    org.junit.Assert.assertTrue("'" + type21 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type21.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema22);
    org.junit.Assert.assertNotNull(schemaArray23);
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    org.junit.Assert.assertNotNull(schema26);
    org.junit.Assert.assertNotNull(schema27);
    org.junit.Assert.assertNotNull(schema29);
  }

  @Test
  public void test123() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test123");
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
  public void test124() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test124");
    org.apache.avro.Schema.setValidateDefaults(true);
  }

  @Test
  public void test125() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test125");
    java.lang.String[] strArray5 = new java.lang.String[] { "\"long\"", "union[long]" };
    java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
    boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema9 = org.apache.avro.Schema.createEnum("\"long\"",
          "{\n  \"type\" : \"record\",\n  \"fields\" : [ ]\n}", "hi!", (java.util.List<java.lang.String>) strList6, "");
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: \"long\"");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(strArray5);
    org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "\"long\"", "union[long]" });
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
  }

  @Test
  public void test126() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test126");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    org.apache.avro.Schema[] schemaArray2 = new org.apache.avro.Schema[] { schema1 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList3 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList3,
        schemaArray2);
    org.apache.avro.Schema schema5 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
    com.fasterxml.jackson.databind.JsonNode jsonNode6 = null;
    boolean boolean7 = schema5.isValidDefault(jsonNode6);
    org.apache.avro.Schema schema8 = org.apache.avro.Schema.createArray(schema5);
    java.util.Map<java.lang.String, java.lang.Object> strMap9 = schema5.getObjectProps();
    com.fasterxml.jackson.databind.JsonNode jsonNode10 = null;
    boolean boolean11 = schema5.isValidDefault(jsonNode10);
    org.apache.avro.Schema.Type type12 = org.apache.avro.Schema.Type.BYTES;
    org.apache.avro.Schema.SeenPair seenPair13 = new org.apache.avro.Schema.SeenPair((java.lang.Object) boolean11,
        (java.lang.Object) type12);
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertNotNull(schemaArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertNotNull(schema8);
    org.junit.Assert.assertNotNull(strMap9);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    org.junit.Assert.assertTrue("'" + type12 + "' != '" + org.apache.avro.Schema.Type.BYTES + "'",
        type12.equals(org.apache.avro.Schema.Type.BYTES));
  }

  @Test
  public void test127() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test127");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    org.apache.avro.Schema[] schemaArray2 = new org.apache.avro.Schema[] { schema1 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList3 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList3,
        schemaArray2);
    org.apache.avro.Schema schema5 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
    com.fasterxml.jackson.databind.JsonNode jsonNode6 = null;
    boolean boolean7 = schema5.isValidDefault(jsonNode6);
    org.apache.avro.Schema schema8 = org.apache.avro.Schema.createArray(schema5);
    org.apache.avro.Schema.Type type9 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema10 = org.apache.avro.Schema.create(type9);
    org.apache.avro.Schema[] schemaArray11 = new org.apache.avro.Schema[] { schema10 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList12 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList12,
        schemaArray11);
    org.apache.avro.Schema schema14 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList12);
    org.apache.avro.Schema schema15 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList12);
    schema5.putAll((org.apache.avro.JsonProperties) schema15);
    org.apache.avro.Schema schema17 = org.apache.avro.Schema.createArray(schema15);
    boolean boolean19 = schema17.equals((java.lang.Object) 100);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str20 = schema17.getNamespace();
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: {\"type\":\"array\",\"items\":[\"long\"]}");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertNotNull(schemaArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertNotNull(schema8);
    org.junit.Assert.assertTrue("'" + type9 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type9.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema10);
    org.junit.Assert.assertNotNull(schemaArray11);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    org.junit.Assert.assertNotNull(schema14);
    org.junit.Assert.assertNotNull(schema15);
    org.junit.Assert.assertNotNull(schema17);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
  }

  @Test
  public void test128() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test128");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    org.apache.avro.Schema[] schemaArray2 = new org.apache.avro.Schema[] { schema1 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList3 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList3,
        schemaArray2);
    org.apache.avro.Schema schema5 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
    com.fasterxml.jackson.databind.JsonNode jsonNode6 = null;
    boolean boolean7 = schema5.isValidDefault(jsonNode6);
    org.apache.avro.Schema schema8 = org.apache.avro.Schema.createArray(schema5);
    // The following exception was thrown during execution in test generation
    try {
      int int10 = schema8.getEnumOrdinal("{\"type\":\"map\",\"values\":[\"long\"]}");
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: {\"type\":\"array\",\"items\":[\"long\"]}");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertNotNull(schemaArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertNotNull(schema8);
  }

  @Test
  public void test129() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test129");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    org.apache.avro.Schema[] schemaArray2 = new org.apache.avro.Schema[] { schema1 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList3 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList3,
        schemaArray2);
    org.apache.avro.Schema schema5 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
    com.fasterxml.jackson.databind.JsonNode jsonNode6 = null;
    boolean boolean7 = schema5.isValidDefault(jsonNode6);
    org.apache.avro.Schema schema8 = org.apache.avro.Schema.createArray(schema5);
    org.apache.avro.Schema.Type type10 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema11 = org.apache.avro.Schema.create(type10);
    org.apache.avro.Schema[] schemaArray12 = new org.apache.avro.Schema[] { schema11 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList13 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList13,
        schemaArray12);
    org.apache.avro.Schema schema15 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList13);
    com.fasterxml.jackson.databind.JsonNode jsonNode16 = null;
    boolean boolean17 = schema15.isValidDefault(jsonNode16);
    org.apache.avro.Schema schema18 = org.apache.avro.Schema.createArray(schema15);
    java.lang.Object obj19 = schema8.getObjectProp("hi!", (java.lang.Object) schema18);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema20 = schema18.getValueType();
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a map: {\"type\":\"array\",\"items\":[\"long\"]}");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertNotNull(schemaArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertNotNull(schema8);
    org.junit.Assert.assertTrue("'" + type10 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type10.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema11);
    org.junit.Assert.assertNotNull(schemaArray12);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    org.junit.Assert.assertNotNull(schema15);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    org.junit.Assert.assertNotNull(schema18);
    org.junit.Assert.assertNotNull(obj19);
    org.junit.Assert.assertEquals(obj19.toString(), "{\"type\":\"array\",\"items\":[\"long\"]}");
    org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "{\"type\":\"array\",\"items\":[\"long\"]}");
    org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "{\"type\":\"array\",\"items\":[\"long\"]}");
  }

  @Test
  public void test130() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test130");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    org.apache.avro.Schema.Type type2 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema3 = org.apache.avro.Schema.create(type2);
    org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] { schema3 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5,
        schemaArray4);
    org.apache.avro.Schema schema7 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
    com.fasterxml.jackson.databind.JsonNode jsonNode8 = null;
    boolean boolean9 = schema7.isValidDefault(jsonNode8);
    org.apache.avro.Schema schema10 = org.apache.avro.Schema.createArray(schema7);
    org.apache.avro.Schema.Type type11 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema12 = org.apache.avro.Schema.create(type11);
    org.apache.avro.Schema[] schemaArray13 = new org.apache.avro.Schema[] { schema12 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList14 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList14,
        schemaArray13);
    org.apache.avro.Schema schema16 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList14);
    org.apache.avro.Schema schema17 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList14);
    schema7.putAll((org.apache.avro.JsonProperties) schema17);
    org.apache.avro.Schema schema19 = org.apache.avro.Schema.createArray(schema17);
    java.util.function.BiConsumer<java.lang.String, java.lang.Object> strBiConsumer20 = null;
    schema17.forEachProperty(strBiConsumer20);
    schema1.putAll((org.apache.avro.JsonProperties) schema17);
    // The following exception was thrown during execution in test generation
    try {
      schema17.addProp("{\"type\":\"map\",\"values\":[\"long\"]}", "");
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Can't set properties on a union: [\"long\"]");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertTrue("'" + type2 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type2.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema3);
    org.junit.Assert.assertNotNull(schemaArray4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    org.junit.Assert.assertNotNull(schema7);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    org.junit.Assert.assertNotNull(schema10);
    org.junit.Assert.assertTrue("'" + type11 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type11.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema12);
    org.junit.Assert.assertNotNull(schemaArray13);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    org.junit.Assert.assertNotNull(schema16);
    org.junit.Assert.assertNotNull(schema17);
    org.junit.Assert.assertNotNull(schema19);
  }

  @Test
  public void test131() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test131");
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("hi!", "", "", (int) (short) 100);
      org.junit.Assert
          .fail("Expected exception of type org.apache.avro.SchemaParseException; message: Illegal character in: hi!");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
  }

  @Test
  public void test132() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test132");
    org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
    boolean boolean1 = parser0.getValidateDefaults();
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema3 = parser0.parseInternal("long");
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.SchemaParseException; message: com.fasterxml.jackson.core.JsonParseException: Unrecognized token 'long': was expecting (JSON String, Number, Array, Object or token 'null', 'true' or 'false')? at [Source: REDACTED (`StreamReadFeature.INCLUDE_SOURCE_IN_LOCATION` disabled); line: 1, column: 1]");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
  }

  @Test
  public void test133() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test133");
    org.apache.avro.Schema.Type type1 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema2 = org.apache.avro.Schema.create(type1);
    org.apache.avro.Schema[] schemaArray3 = new org.apache.avro.Schema[] { schema2 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList4 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList4,
        schemaArray3);
    org.apache.avro.Schema schema6 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList4);
    org.apache.avro.Schema schema7 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList4);
    java.lang.String str8 = schema7.getFullName();
    org.apache.avro.Schema.Type type9 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema10 = org.apache.avro.Schema.create(type9);
    org.apache.avro.Schema[] schemaArray11 = new org.apache.avro.Schema[] { schema10 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList12 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList12,
        schemaArray11);
    org.apache.avro.Schema schema14 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList12);
    com.fasterxml.jackson.databind.JsonNode jsonNode15 = null;
    boolean boolean16 = schema14.isValidDefault(jsonNode15);
    org.apache.avro.Schema schema17 = org.apache.avro.Schema.createArray(schema14);
    org.apache.avro.Schema.Type type18 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema19 = org.apache.avro.Schema.create(type18);
    org.apache.avro.Schema[] schemaArray20 = new org.apache.avro.Schema[] { schema19 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList21 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList21,
        schemaArray20);
    org.apache.avro.Schema schema23 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList21);
    org.apache.avro.Schema schema24 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList21);
    schema14.putAll((org.apache.avro.JsonProperties) schema24);
    org.apache.avro.Schema schema26 = org.apache.avro.Schema.createArray(schema24);
    java.util.function.BiConsumer<java.lang.String, java.lang.Object> strBiConsumer27 = null;
    schema24.forEachProperty(strBiConsumer27);
    java.lang.String str29 = schema24.getDoc();
    boolean boolean30 = schema7.equals((java.lang.Object) schema24);
    org.apache.avro.Schema.Type type31 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema32 = org.apache.avro.Schema.create(type31);
    org.apache.avro.Schema.Type type33 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema34 = org.apache.avro.Schema.create(type33);
    org.apache.avro.Schema[] schemaArray35 = new org.apache.avro.Schema[] { schema34 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList36 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean37 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList36,
        schemaArray35);
    org.apache.avro.Schema schema38 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList36);
    com.fasterxml.jackson.databind.JsonNode jsonNode39 = null;
    boolean boolean40 = schema38.isValidDefault(jsonNode39);
    org.apache.avro.Schema schema41 = org.apache.avro.Schema.createArray(schema38);
    org.apache.avro.Schema.Type type42 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema43 = org.apache.avro.Schema.create(type42);
    org.apache.avro.Schema[] schemaArray44 = new org.apache.avro.Schema[] { schema43 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList45 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean46 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList45,
        schemaArray44);
    org.apache.avro.Schema schema47 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList45);
    org.apache.avro.Schema schema48 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList45);
    schema38.putAll((org.apache.avro.JsonProperties) schema48);
    org.apache.avro.Schema schema50 = org.apache.avro.Schema.createArray(schema48);
    java.util.function.BiConsumer<java.lang.String, java.lang.Object> strBiConsumer51 = null;
    schema48.forEachProperty(strBiConsumer51);
    schema32.putAll((org.apache.avro.JsonProperties) schema48);
    schema7.addAllProps((org.apache.avro.JsonProperties) schema32);
    org.apache.avro.Schema.Field.Order order57 = org.apache.avro.Schema.Field.Order.DESCENDING;
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema.Field field58 = new org.apache.avro.Schema.Field("hi!", schema32, "[\"long\"]",
          (java.lang.Object) (byte) -1, order57);
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Unknown datum class: class java.lang.Byte");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type1 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type1.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema2);
    org.junit.Assert.assertNotNull(schemaArray3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    org.junit.Assert.assertNotNull(schema6);
    org.junit.Assert.assertNotNull(schema7);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "union[long]" + "'", str8, "union[long]");
    org.junit.Assert.assertTrue("'" + type9 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type9.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema10);
    org.junit.Assert.assertNotNull(schemaArray11);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    org.junit.Assert.assertNotNull(schema14);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    org.junit.Assert.assertNotNull(schema17);
    org.junit.Assert.assertTrue("'" + type18 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type18.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema19);
    org.junit.Assert.assertNotNull(schemaArray20);
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    org.junit.Assert.assertNotNull(schema23);
    org.junit.Assert.assertNotNull(schema24);
    org.junit.Assert.assertNotNull(schema26);
    org.junit.Assert.assertNull(str29);
    org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    org.junit.Assert.assertTrue("'" + type31 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type31.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema32);
    org.junit.Assert.assertTrue("'" + type33 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type33.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema34);
    org.junit.Assert.assertNotNull(schemaArray35);
    org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    org.junit.Assert.assertNotNull(schema38);
    org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    org.junit.Assert.assertNotNull(schema41);
    org.junit.Assert.assertTrue("'" + type42 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type42.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema43);
    org.junit.Assert.assertNotNull(schemaArray44);
    org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    org.junit.Assert.assertNotNull(schema47);
    org.junit.Assert.assertNotNull(schema48);
    org.junit.Assert.assertNotNull(schema50);
    org.junit.Assert.assertTrue("'" + order57 + "' != '" + org.apache.avro.Schema.Field.Order.DESCENDING + "'",
        order57.equals(org.apache.avro.Schema.Field.Order.DESCENDING));
  }

  @Test
  public void test134() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test134");
    org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
    org.apache.avro.Schema.Parser parser2 = parser0.setValidateDefaults(false);
    org.junit.Assert.assertNotNull(parser2);
  }

  @Test
  public void test135() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test135");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    org.apache.avro.Schema[] schemaArray2 = new org.apache.avro.Schema[] { schema1 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList3 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList3,
        schemaArray2);
    org.apache.avro.Schema schema5 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
    com.fasterxml.jackson.databind.JsonNode jsonNode6 = null;
    boolean boolean7 = schema5.isValidDefault(jsonNode6);
    org.apache.avro.Schema schema8 = org.apache.avro.Schema.createArray(schema5);
    org.apache.avro.Schema.Type type9 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema10 = org.apache.avro.Schema.create(type9);
    org.apache.avro.Schema[] schemaArray11 = new org.apache.avro.Schema[] { schema10 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList12 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList12,
        schemaArray11);
    org.apache.avro.Schema schema14 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList12);
    org.apache.avro.Schema schema15 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList12);
    schema5.putAll((org.apache.avro.JsonProperties) schema15);
    org.apache.avro.Schema schema17 = org.apache.avro.Schema.createArray(schema15);
    org.apache.avro.Schema.Type type18 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema19 = org.apache.avro.Schema.create(type18);
    org.apache.avro.Schema.Type type20 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema21 = org.apache.avro.Schema.create(type20);
    org.apache.avro.Schema[] schemaArray22 = new org.apache.avro.Schema[] { schema21 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList23 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean24 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList23,
        schemaArray22);
    org.apache.avro.Schema schema25 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList23);
    com.fasterxml.jackson.databind.JsonNode jsonNode26 = null;
    boolean boolean27 = schema25.isValidDefault(jsonNode26);
    org.apache.avro.Schema schema28 = org.apache.avro.Schema.createArray(schema25);
    org.apache.avro.Schema.Type type29 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema30 = org.apache.avro.Schema.create(type29);
    org.apache.avro.Schema[] schemaArray31 = new org.apache.avro.Schema[] { schema30 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList32 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean33 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList32,
        schemaArray31);
    org.apache.avro.Schema schema34 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList32);
    org.apache.avro.Schema schema35 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList32);
    schema25.putAll((org.apache.avro.JsonProperties) schema35);
    org.apache.avro.Schema schema37 = org.apache.avro.Schema.createArray(schema35);
    java.util.function.BiConsumer<java.lang.String, java.lang.Object> strBiConsumer38 = null;
    schema35.forEachProperty(strBiConsumer38);
    schema19.putAll((org.apache.avro.JsonProperties) schema35);
    org.apache.avro.Schema.Type type41 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema42 = org.apache.avro.Schema.create(type41);
    org.apache.avro.Schema[] schemaArray43 = new org.apache.avro.Schema[] { schema42 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList44 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean45 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList44,
        schemaArray43);
    org.apache.avro.Schema schema46 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList44);
    org.apache.avro.Schema schema47 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList44);
    org.apache.avro.Schema schema48 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList44);
    org.apache.avro.Schema.Type type49 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema50 = org.apache.avro.Schema.create(type49);
    schema48.addAllProps((org.apache.avro.JsonProperties) schema50);
    org.apache.avro.Schema schema52 = org.apache.avro.Schema.applyAliases(schema19, schema50);
    java.lang.String str53 = schema52.getName();
    schema15.addAllProps((org.apache.avro.JsonProperties) schema52);
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertNotNull(schemaArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertNotNull(schema8);
    org.junit.Assert.assertTrue("'" + type9 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type9.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema10);
    org.junit.Assert.assertNotNull(schemaArray11);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    org.junit.Assert.assertNotNull(schema14);
    org.junit.Assert.assertNotNull(schema15);
    org.junit.Assert.assertNotNull(schema17);
    org.junit.Assert.assertTrue("'" + type18 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type18.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema19);
    org.junit.Assert.assertTrue("'" + type20 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type20.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema21);
    org.junit.Assert.assertNotNull(schemaArray22);
    org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    org.junit.Assert.assertNotNull(schema25);
    org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    org.junit.Assert.assertNotNull(schema28);
    org.junit.Assert.assertTrue("'" + type29 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type29.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema30);
    org.junit.Assert.assertNotNull(schemaArray31);
    org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    org.junit.Assert.assertNotNull(schema34);
    org.junit.Assert.assertNotNull(schema35);
    org.junit.Assert.assertNotNull(schema37);
    org.junit.Assert.assertTrue("'" + type41 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type41.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema42);
    org.junit.Assert.assertNotNull(schemaArray43);
    org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    org.junit.Assert.assertNotNull(schema46);
    org.junit.Assert.assertNotNull(schema47);
    org.junit.Assert.assertNotNull(schema48);
    org.junit.Assert.assertTrue("'" + type49 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type49.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema50);
    org.junit.Assert.assertNotNull(schema52);
    org.junit.Assert.assertEquals("'" + str53 + "' != '" + "long" + "'", str53, "long");
  }

  @Test
  public void test136() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test136");
    java.lang.String[] strArray11 = new java.lang.String[] { "{\n  \"type\" : \"map\",\n  \"values\" : [ \"long\" ]\n}",
        "long", "{\"type\":\"map\",\"values\":[\"long\"]}", "union[long]", "[\"long\"]", "long", "hi!", "long" };
    java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
    boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema15 = org.apache.avro.Schema.createEnum("\"long\"", "[\"long\"]", "fixed",
          (java.util.List<java.lang.String>) strList12, "");
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: \"long\"");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(strArray11);
    org.junit.Assert.assertArrayEquals(strArray11,
        new java.lang.String[] { "{\n  \"type\" : \"map\",\n  \"values\" : [ \"long\" ]\n}", "long",
            "{\"type\":\"map\",\"values\":[\"long\"]}", "union[long]", "[\"long\"]", "long", "hi!", "long" });
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
  }

  @Test
  public void test137() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test137");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    org.apache.avro.Schema.Type type2 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema3 = org.apache.avro.Schema.create(type2);
    org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] { schema3 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5,
        schemaArray4);
    org.apache.avro.Schema schema7 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
    com.fasterxml.jackson.databind.JsonNode jsonNode8 = null;
    boolean boolean9 = schema7.isValidDefault(jsonNode8);
    org.apache.avro.Schema schema10 = org.apache.avro.Schema.createArray(schema7);
    org.apache.avro.Schema.Type type11 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema12 = org.apache.avro.Schema.create(type11);
    org.apache.avro.Schema[] schemaArray13 = new org.apache.avro.Schema[] { schema12 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList14 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList14,
        schemaArray13);
    org.apache.avro.Schema schema16 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList14);
    org.apache.avro.Schema schema17 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList14);
    schema7.putAll((org.apache.avro.JsonProperties) schema17);
    org.apache.avro.Schema schema19 = org.apache.avro.Schema.createArray(schema17);
    java.util.function.BiConsumer<java.lang.String, java.lang.Object> strBiConsumer20 = null;
    schema17.forEachProperty(strBiConsumer20);
    schema1.putAll((org.apache.avro.JsonProperties) schema17);
    org.apache.avro.Schema.Type type23 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema24 = org.apache.avro.Schema.create(type23);
    org.apache.avro.Schema[] schemaArray25 = new org.apache.avro.Schema[] { schema24 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList26 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean27 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList26,
        schemaArray25);
    org.apache.avro.Schema schema28 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList26);
    org.apache.avro.Schema schema29 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList26);
    org.apache.avro.Schema schema30 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList26);
    org.apache.avro.Schema.Type type31 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema32 = org.apache.avro.Schema.create(type31);
    schema30.addAllProps((org.apache.avro.JsonProperties) schema32);
    org.apache.avro.Schema schema34 = org.apache.avro.Schema.applyAliases(schema1, schema32);
    java.lang.String str35 = schema34.getName();
    java.lang.String str36 = schema34.toString();
    org.apache.avro.Schema schema37 = org.apache.avro.Schema.createArray(schema34);
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertTrue("'" + type2 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type2.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema3);
    org.junit.Assert.assertNotNull(schemaArray4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    org.junit.Assert.assertNotNull(schema7);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    org.junit.Assert.assertNotNull(schema10);
    org.junit.Assert.assertTrue("'" + type11 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type11.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema12);
    org.junit.Assert.assertNotNull(schemaArray13);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    org.junit.Assert.assertNotNull(schema16);
    org.junit.Assert.assertNotNull(schema17);
    org.junit.Assert.assertNotNull(schema19);
    org.junit.Assert.assertTrue("'" + type23 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type23.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema24);
    org.junit.Assert.assertNotNull(schemaArray25);
    org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    org.junit.Assert.assertNotNull(schema28);
    org.junit.Assert.assertNotNull(schema29);
    org.junit.Assert.assertNotNull(schema30);
    org.junit.Assert.assertTrue("'" + type31 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type31.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema32);
    org.junit.Assert.assertNotNull(schema34);
    org.junit.Assert.assertEquals("'" + str35 + "' != '" + "long" + "'", str35, "long");
    org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\"long\"" + "'", str36, "\"long\"");
    org.junit.Assert.assertNotNull(schema37);
  }

  @Test
  public void test138() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test138");
    org.apache.avro.Schema.Field[] fieldArray4 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList5 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList5,
        fieldArray4);
    org.apache.avro.Schema schema7 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList5);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema8 = org.apache.avro.Schema.createRecord("",
          "{\n  \"type\" : \"record\",\n  \"fields\" : [ ]\n}", "{\"type\":\"map\",\"values\":[\"long\"]}", true,
          (java.util.List<org.apache.avro.Schema.Field>) fieldList5);
      org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Empty name");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(fieldArray4);
    org.junit.Assert.assertArrayEquals(fieldArray4, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    org.junit.Assert.assertNotNull(schema7);
  }

  @Test
  public void test139() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test139");
    org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
    org.apache.avro.NameValidator nameValidator1 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.Schema.SeenPair seenPair2 = new org.apache.avro.Schema.SeenPair((java.lang.Object) parser0,
        (java.lang.Object) nameValidator1);
    org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser(nameValidator1);
    org.apache.avro.Schema.Parser parser4 = new org.apache.avro.Schema.Parser(nameValidator1);
    org.junit.Assert.assertNotNull(nameValidator1);
  }

  @Test
  public void test140() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test140");
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema4 = org.apache.avro.Schema
          .createRecord("{\n  \"type\" : \"record\",\n  \"fields\" : [ ]\n}", "hi!", "", true);
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {?  \"type\" : \"record\",?  \"fields\" : [ ]?}");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
  }

  @Test
  public void test141() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test141");
    org.apache.avro.Schema.Field[] fieldArray0 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList1 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList1,
        fieldArray0);
    org.apache.avro.Schema schema3 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
    org.apache.avro.Schema schema4 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
    org.apache.avro.Schema.SeenPair seenPair6 = new org.apache.avro.Schema.SeenPair((java.lang.Object) fieldList1,
        (java.lang.Object) (short) 100);
    org.apache.avro.Schema schema7 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
    org.junit.Assert.assertNotNull(fieldArray0);
    org.junit.Assert.assertArrayEquals(fieldArray0, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertNotNull(schema3);
    org.junit.Assert.assertNotNull(schema4);
    org.junit.Assert.assertNotNull(schema7);
  }

  @Test
  public void test142() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test142");
    org.apache.avro.NameValidator nameValidator0 = null;
    org.apache.avro.Schema.Parser parser1 = new org.apache.avro.Schema.Parser(nameValidator0);
    org.apache.avro.Schema.Parser parser2 = new org.apache.avro.Schema.Parser();
    boolean boolean3 = parser2.getValidateDefaults();
    java.util.Map<java.lang.String, org.apache.avro.Schema> strMap4 = parser2.getTypes();
    org.apache.avro.Schema.Parser parser5 = parser1.addTypes(strMap4);
    boolean boolean6 = parser5.getValidateDefaults();
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    org.junit.Assert.assertNotNull(strMap4);
    org.junit.Assert.assertNotNull(parser5);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
  }

  @Test
  public void test143() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test143");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    org.apache.avro.Schema[] schemaArray2 = new org.apache.avro.Schema[] { schema1 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList3 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList3,
        schemaArray2);
    org.apache.avro.Schema schema5 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
    org.apache.avro.Schema schema6 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
    org.apache.avro.Schema schema7 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
    org.apache.avro.Schema.Type type8 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema9 = org.apache.avro.Schema.create(type8);
    schema7.addAllProps((org.apache.avro.JsonProperties) schema9);
    java.util.function.BiConsumer<java.lang.String, java.lang.Object> strBiConsumer11 = null;
    schema9.forEachProperty(strBiConsumer11);
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertNotNull(schemaArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertNotNull(schema6);
    org.junit.Assert.assertNotNull(schema7);
    org.junit.Assert.assertTrue("'" + type8 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type8.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema9);
  }

  @Test
  public void test144() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test144");
    org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
    org.apache.avro.NameValidator nameValidator1 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.Schema.SeenPair seenPair2 = new org.apache.avro.Schema.SeenPair((java.lang.Object) parser0,
        (java.lang.Object) nameValidator1);
    org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser(nameValidator1);
    org.apache.avro.Schema.Parser parser5 = parser3.setValidateDefaults(true);
    java.io.File file6 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema7 = parser5.parse(file6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(nameValidator1);
    org.junit.Assert.assertNotNull(parser5);
  }

  @Test
  public void test145() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test145");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    org.apache.avro.Schema[] schemaArray2 = new org.apache.avro.Schema[] { schema1 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList3 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList3,
        schemaArray2);
    org.apache.avro.Schema schema5 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
    com.fasterxml.jackson.databind.JsonNode jsonNode6 = null;
    boolean boolean7 = schema5.isValidDefault(jsonNode6);
    org.apache.avro.Schema schema8 = org.apache.avro.Schema.createArray(schema5);
    org.apache.avro.Schema.Type type9 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema10 = org.apache.avro.Schema.create(type9);
    org.apache.avro.Schema[] schemaArray11 = new org.apache.avro.Schema[] { schema10 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList12 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList12,
        schemaArray11);
    org.apache.avro.Schema schema14 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList12);
    org.apache.avro.Schema schema15 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList12);
    schema5.putAll((org.apache.avro.JsonProperties) schema15);
    org.apache.avro.Schema schema17 = org.apache.avro.Schema.createArray(schema15);
    boolean boolean19 = schema17.equals((java.lang.Object) 100);
    java.lang.String str20 = schema17.getName();
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertNotNull(schemaArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertNotNull(schema8);
    org.junit.Assert.assertTrue("'" + type9 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type9.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema10);
    org.junit.Assert.assertNotNull(schemaArray11);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    org.junit.Assert.assertNotNull(schema14);
    org.junit.Assert.assertNotNull(schema15);
    org.junit.Assert.assertNotNull(schema17);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    org.junit.Assert.assertEquals("'" + str20 + "' != '" + "array" + "'", str20, "array");
  }

  @Test
  public void test146() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test146");
    org.apache.avro.Schema.Type type1 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema2 = org.apache.avro.Schema.create(type1);
    org.apache.avro.Schema[] schemaArray3 = new org.apache.avro.Schema[] { schema2 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList4 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList4,
        schemaArray3);
    org.apache.avro.Schema schema6 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList4);
    com.fasterxml.jackson.databind.JsonNode jsonNode7 = null;
    boolean boolean8 = schema6.isValidDefault(jsonNode7);
    org.apache.avro.Schema schema9 = org.apache.avro.Schema.createArray(schema6);
    boolean boolean11 = schema9.propsContainsKey("{\"type\":\"map\",\"values\":[\"long\"]}");
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema.Field field13 = new org.apache.avro.Schema.Field(
          "{\n  \"type\" : \"record\",\n  \"fields\" : [ ]\n}", schema9, "\"long\"");
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {?  \"type\" : \"record\",?  \"fields\" : [ ]?}");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type1 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type1.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema2);
    org.junit.Assert.assertNotNull(schemaArray3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    org.junit.Assert.assertNotNull(schema6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    org.junit.Assert.assertNotNull(schema9);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
  }

  @Test
  public void test147() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test147");
    org.apache.avro.Schema.Type type1 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema2 = org.apache.avro.Schema.create(type1);
    org.apache.avro.Schema[] schemaArray3 = new org.apache.avro.Schema[] { schema2 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList4 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList4,
        schemaArray3);
    org.apache.avro.Schema schema6 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList4);
    com.fasterxml.jackson.databind.JsonNode jsonNode7 = null;
    boolean boolean8 = schema6.isValidDefault(jsonNode7);
    org.apache.avro.Schema schema9 = org.apache.avro.Schema.createArray(schema6);
    java.util.Map<java.lang.String, java.lang.Object> strMap10 = schema6.getObjectProps();
    org.apache.avro.Schema.Field.Order order13 = org.apache.avro.Schema.Field.Order.DESCENDING;
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema.Field field14 = new org.apache.avro.Schema.Field(
          "{\n  \"type\" : \"record\",\n  \"fields\" : [ ]\n}", schema6,
          "{\n  \"type\" : \"record\",\n  \"fields\" : [ ]\n}", (java.lang.Object) ' ', order13);
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Unknown datum class: class java.lang.Character");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type1 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type1.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema2);
    org.junit.Assert.assertNotNull(schemaArray3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    org.junit.Assert.assertNotNull(schema6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    org.junit.Assert.assertNotNull(schema9);
    org.junit.Assert.assertNotNull(strMap10);
    org.junit.Assert.assertTrue("'" + order13 + "' != '" + org.apache.avro.Schema.Field.Order.DESCENDING + "'",
        order13.equals(org.apache.avro.Schema.Field.Order.DESCENDING));
  }

  @Test
  public void test148() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test148");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    org.apache.avro.Schema.Type type2 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema3 = org.apache.avro.Schema.create(type2);
    org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] { schema3 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5,
        schemaArray4);
    org.apache.avro.Schema schema7 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
    com.fasterxml.jackson.databind.JsonNode jsonNode8 = null;
    boolean boolean9 = schema7.isValidDefault(jsonNode8);
    org.apache.avro.Schema schema10 = org.apache.avro.Schema.createArray(schema7);
    org.apache.avro.Schema.Type type11 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema12 = org.apache.avro.Schema.create(type11);
    org.apache.avro.Schema[] schemaArray13 = new org.apache.avro.Schema[] { schema12 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList14 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList14,
        schemaArray13);
    org.apache.avro.Schema schema16 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList14);
    org.apache.avro.Schema schema17 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList14);
    schema7.putAll((org.apache.avro.JsonProperties) schema17);
    org.apache.avro.Schema schema19 = org.apache.avro.Schema.createArray(schema17);
    java.util.function.BiConsumer<java.lang.String, java.lang.Object> strBiConsumer20 = null;
    schema17.forEachProperty(strBiConsumer20);
    schema1.putAll((org.apache.avro.JsonProperties) schema17);
    org.apache.avro.Schema.Type type23 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema24 = org.apache.avro.Schema.create(type23);
    org.apache.avro.Schema[] schemaArray25 = new org.apache.avro.Schema[] { schema24 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList26 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean27 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList26,
        schemaArray25);
    org.apache.avro.Schema schema28 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList26);
    org.apache.avro.Schema schema29 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList26);
    org.apache.avro.Schema schema30 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList26);
    org.apache.avro.Schema.Type type31 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema32 = org.apache.avro.Schema.create(type31);
    schema30.addAllProps((org.apache.avro.JsonProperties) schema32);
    org.apache.avro.Schema schema34 = org.apache.avro.Schema.applyAliases(schema1, schema32);
    boolean boolean35 = schema1.isUnion();
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema36 = schema1.getValueType();
      org.junit.Assert
          .fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a map: \"long\"");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertTrue("'" + type2 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type2.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema3);
    org.junit.Assert.assertNotNull(schemaArray4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    org.junit.Assert.assertNotNull(schema7);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    org.junit.Assert.assertNotNull(schema10);
    org.junit.Assert.assertTrue("'" + type11 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type11.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema12);
    org.junit.Assert.assertNotNull(schemaArray13);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    org.junit.Assert.assertNotNull(schema16);
    org.junit.Assert.assertNotNull(schema17);
    org.junit.Assert.assertNotNull(schema19);
    org.junit.Assert.assertTrue("'" + type23 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type23.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema24);
    org.junit.Assert.assertNotNull(schemaArray25);
    org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    org.junit.Assert.assertNotNull(schema28);
    org.junit.Assert.assertNotNull(schema29);
    org.junit.Assert.assertNotNull(schema30);
    org.junit.Assert.assertTrue("'" + type31 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type31.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema32);
    org.junit.Assert.assertNotNull(schema34);
    org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
  }

  @Test
  public void test149() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test149");
    org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("long", "long",
        "{\"type\":\"map\",\"values\":[\"long\"]}", 100);
    org.junit.Assert.assertNotNull(schema4);
  }

  @Test
  public void test150() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test150");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    org.apache.avro.Schema[] schemaArray2 = new org.apache.avro.Schema[] { schema1 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList3 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList3,
        schemaArray2);
    org.apache.avro.Schema schema5 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
    com.fasterxml.jackson.databind.JsonNode jsonNode6 = null;
    boolean boolean7 = schema5.isValidDefault(jsonNode6);
    org.apache.avro.Schema schema8 = org.apache.avro.Schema.createArray(schema5);
    org.apache.avro.Schema.Type type10 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema11 = org.apache.avro.Schema.create(type10);
    org.apache.avro.Schema[] schemaArray12 = new org.apache.avro.Schema[] { schema11 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList13 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList13,
        schemaArray12);
    org.apache.avro.Schema schema15 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList13);
    com.fasterxml.jackson.databind.JsonNode jsonNode16 = null;
    boolean boolean17 = schema15.isValidDefault(jsonNode16);
    org.apache.avro.Schema schema18 = org.apache.avro.Schema.createArray(schema15);
    java.lang.Object obj19 = schema8.getObjectProp("hi!", (java.lang.Object) schema18);
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<org.apache.avro.Schema.Field> fieldList20 = schema8.getFields();
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a record: {\"type\":\"array\",\"items\":[\"long\"]}");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertNotNull(schemaArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertNotNull(schema8);
    org.junit.Assert.assertTrue("'" + type10 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type10.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema11);
    org.junit.Assert.assertNotNull(schemaArray12);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    org.junit.Assert.assertNotNull(schema15);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    org.junit.Assert.assertNotNull(schema18);
    org.junit.Assert.assertNotNull(obj19);
    org.junit.Assert.assertEquals(obj19.toString(), "{\"type\":\"array\",\"items\":[\"long\"]}");
    org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "{\"type\":\"array\",\"items\":[\"long\"]}");
    org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "{\"type\":\"array\",\"items\":[\"long\"]}");
  }

  @Test
  public void test151() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test151");
    org.apache.avro.NameValidator nameValidator0 = null;
    org.apache.avro.Schema.Parser parser1 = new org.apache.avro.Schema.Parser(nameValidator0);
    org.apache.avro.Schema.Parser parser2 = new org.apache.avro.Schema.Parser();
    boolean boolean3 = parser2.getValidateDefaults();
    java.util.Map<java.lang.String, org.apache.avro.Schema> strMap4 = parser2.getTypes();
    org.apache.avro.Schema.Parser parser5 = parser1.addTypes(strMap4);
    java.io.InputStream inputStream6 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema7 = parser1.parse(inputStream6);
      org.junit.Assert
          .fail("Expected exception of type org.apache.avro.SchemaParseException; message: Cannot parse <null> schema");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    org.junit.Assert.assertNotNull(strMap4);
    org.junit.Assert.assertNotNull(parser5);
  }

  @Test
  public void test152() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test152");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    org.apache.avro.Schema[] schemaArray2 = new org.apache.avro.Schema[] { schema1 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList3 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList3,
        schemaArray2);
    org.apache.avro.Schema schema5 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
    com.fasterxml.jackson.databind.JsonNode jsonNode6 = null;
    boolean boolean7 = schema5.isValidDefault(jsonNode6);
    org.apache.avro.Schema schema8 = org.apache.avro.Schema.createArray(schema5);
    org.apache.avro.Schema.Type type10 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema11 = org.apache.avro.Schema.create(type10);
    org.apache.avro.Schema[] schemaArray12 = new org.apache.avro.Schema[] { schema11 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList13 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList13,
        schemaArray12);
    org.apache.avro.Schema schema15 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList13);
    com.fasterxml.jackson.databind.JsonNode jsonNode16 = null;
    boolean boolean17 = schema15.isValidDefault(jsonNode16);
    org.apache.avro.Schema schema18 = org.apache.avro.Schema.createArray(schema15);
    java.lang.Object obj19 = schema8.getObjectProp("hi!", (java.lang.Object) schema18);
    java.lang.String str20 = schema18.getName();
    org.apache.avro.Schema.Type type22 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema23 = org.apache.avro.Schema.create(type22);
    org.apache.avro.Schema[] schemaArray24 = new org.apache.avro.Schema[] { schema23 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList25 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean26 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList25,
        schemaArray24);
    org.apache.avro.Schema schema27 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList25);
    org.apache.avro.Schema schema28 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList25);
    java.lang.String str29 = schema28.getFullName();
    org.apache.avro.Schema.Type type30 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema31 = org.apache.avro.Schema.create(type30);
    org.apache.avro.Schema[] schemaArray32 = new org.apache.avro.Schema[] { schema31 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList33 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean34 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList33,
        schemaArray32);
    org.apache.avro.Schema schema35 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList33);
    com.fasterxml.jackson.databind.JsonNode jsonNode36 = null;
    boolean boolean37 = schema35.isValidDefault(jsonNode36);
    org.apache.avro.Schema schema38 = org.apache.avro.Schema.createArray(schema35);
    org.apache.avro.Schema.Type type39 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema40 = org.apache.avro.Schema.create(type39);
    org.apache.avro.Schema[] schemaArray41 = new org.apache.avro.Schema[] { schema40 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList42 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean43 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList42,
        schemaArray41);
    org.apache.avro.Schema schema44 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList42);
    org.apache.avro.Schema schema45 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList42);
    schema35.putAll((org.apache.avro.JsonProperties) schema45);
    org.apache.avro.Schema schema47 = org.apache.avro.Schema.createArray(schema45);
    java.util.function.BiConsumer<java.lang.String, java.lang.Object> strBiConsumer48 = null;
    schema45.forEachProperty(strBiConsumer48);
    java.lang.String str50 = schema45.getDoc();
    boolean boolean51 = schema28.equals((java.lang.Object) schema45);
    java.lang.Object obj52 = schema18.getObjectProp("", (java.lang.Object) boolean51);
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertNotNull(schemaArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertNotNull(schema8);
    org.junit.Assert.assertTrue("'" + type10 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type10.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema11);
    org.junit.Assert.assertNotNull(schemaArray12);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    org.junit.Assert.assertNotNull(schema15);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    org.junit.Assert.assertNotNull(schema18);
    org.junit.Assert.assertNotNull(obj19);
    org.junit.Assert.assertEquals(obj19.toString(), "{\"type\":\"array\",\"items\":[\"long\"]}");
    org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "{\"type\":\"array\",\"items\":[\"long\"]}");
    org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "{\"type\":\"array\",\"items\":[\"long\"]}");
    org.junit.Assert.assertEquals("'" + str20 + "' != '" + "array" + "'", str20, "array");
    org.junit.Assert.assertTrue("'" + type22 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type22.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema23);
    org.junit.Assert.assertNotNull(schemaArray24);
    org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    org.junit.Assert.assertNotNull(schema27);
    org.junit.Assert.assertNotNull(schema28);
    org.junit.Assert.assertEquals("'" + str29 + "' != '" + "union[long]" + "'", str29, "union[long]");
    org.junit.Assert.assertTrue("'" + type30 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type30.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema31);
    org.junit.Assert.assertNotNull(schemaArray32);
    org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    org.junit.Assert.assertNotNull(schema35);
    org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    org.junit.Assert.assertNotNull(schema38);
    org.junit.Assert.assertTrue("'" + type39 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type39.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema40);
    org.junit.Assert.assertNotNull(schemaArray41);
    org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    org.junit.Assert.assertNotNull(schema44);
    org.junit.Assert.assertNotNull(schema45);
    org.junit.Assert.assertNotNull(schema47);
    org.junit.Assert.assertNull(str50);
    org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
    org.junit.Assert.assertEquals("'" + obj52 + "' != '" + true + "'", obj52, true);
  }

  @Test
  public void test153() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test153");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    org.apache.avro.Schema[] schemaArray2 = new org.apache.avro.Schema[] { schema1 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList3 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList3,
        schemaArray2);
    org.apache.avro.Schema schema5 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
    com.fasterxml.jackson.databind.JsonNode jsonNode6 = null;
    boolean boolean7 = schema5.isValidDefault(jsonNode6);
    org.apache.avro.Schema schema8 = org.apache.avro.Schema.createArray(schema5);
    org.apache.avro.Schema.Type type9 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema10 = org.apache.avro.Schema.create(type9);
    org.apache.avro.Schema[] schemaArray11 = new org.apache.avro.Schema[] { schema10 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList12 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList12,
        schemaArray11);
    org.apache.avro.Schema schema14 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList12);
    org.apache.avro.Schema schema15 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList12);
    schema5.putAll((org.apache.avro.JsonProperties) schema15);
    org.apache.avro.Schema schema17 = org.apache.avro.Schema.createArray(schema15);
    java.util.function.BiConsumer<java.lang.String, java.lang.Object> strBiConsumer18 = null;
    schema15.forEachProperty(strBiConsumer18);
    // The following exception was thrown during execution in test generation
    try {
      schema15.addProp("{\n  \"type\" : \"map\",\n  \"values\" : [ \"long\" ]\n}", "fixed");
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Can't set properties on a union: [\"long\"]");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertNotNull(schemaArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertNotNull(schema8);
    org.junit.Assert.assertTrue("'" + type9 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type9.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema10);
    org.junit.Assert.assertNotNull(schemaArray11);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    org.junit.Assert.assertNotNull(schema14);
    org.junit.Assert.assertNotNull(schema15);
    org.junit.Assert.assertNotNull(schema17);
  }

  @Test
  public void test154() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test154");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    org.apache.avro.Schema[] schemaArray2 = new org.apache.avro.Schema[] { schema1 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList3 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList3,
        schemaArray2);
    org.apache.avro.Schema schema5 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
    com.fasterxml.jackson.databind.JsonNode jsonNode6 = null;
    boolean boolean7 = schema5.isValidDefault(jsonNode6);
    org.apache.avro.Schema schema8 = org.apache.avro.Schema.createArray(schema5);
    org.apache.avro.Schema.Type type9 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema10 = org.apache.avro.Schema.create(type9);
    org.apache.avro.Schema[] schemaArray11 = new org.apache.avro.Schema[] { schema10 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList12 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList12,
        schemaArray11);
    org.apache.avro.Schema schema14 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList12);
    org.apache.avro.Schema schema15 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList12);
    schema5.putAll((org.apache.avro.JsonProperties) schema15);
    java.lang.Object obj18 = schema15.getObjectProp("hi!");
    // The following exception was thrown during execution in test generation
    try {
      int int20 = schema15.getEnumOrdinal("{\n  \"type\" : \"map\",\n  \"values\" : [ \"long\" ]\n}");
      org.junit.Assert
          .fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: [\"long\"]");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertNotNull(schemaArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertNotNull(schema8);
    org.junit.Assert.assertTrue("'" + type9 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type9.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema10);
    org.junit.Assert.assertNotNull(schemaArray11);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    org.junit.Assert.assertNotNull(schema14);
    org.junit.Assert.assertNotNull(schema15);
    org.junit.Assert.assertNull(obj18);
  }

  @Test
  public void test155() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test155");
    java.lang.Object obj1 = org.apache.avro.Schema.parseJsonToObject("");
    org.junit.Assert.assertNull(obj1);
  }

  @Test
  public void test156() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test156");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    org.apache.avro.Schema[] schemaArray2 = new org.apache.avro.Schema[] { schema1 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList3 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList3,
        schemaArray2);
    org.apache.avro.Schema schema5 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
    com.fasterxml.jackson.databind.JsonNode jsonNode6 = null;
    boolean boolean7 = schema5.isValidDefault(jsonNode6);
    org.apache.avro.Schema schema8 = org.apache.avro.Schema.createArray(schema5);
    org.apache.avro.Schema.Type type9 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema10 = org.apache.avro.Schema.create(type9);
    org.apache.avro.Schema[] schemaArray11 = new org.apache.avro.Schema[] { schema10 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList12 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList12,
        schemaArray11);
    org.apache.avro.Schema schema14 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList12);
    org.apache.avro.Schema schema15 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList12);
    schema5.putAll((org.apache.avro.JsonProperties) schema15);
    org.apache.avro.Schema schema17 = org.apache.avro.Schema.createArray(schema15);
    boolean boolean19 = schema17.equals((java.lang.Object) 100);
    boolean boolean21 = schema17.propsContainsKey("{\"type\":\"map\",\"values\":[\"long\"]}");
    boolean boolean22 = schema17.hasProps();
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertNotNull(schemaArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertNotNull(schema8);
    org.junit.Assert.assertTrue("'" + type9 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type9.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema10);
    org.junit.Assert.assertNotNull(schemaArray11);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    org.junit.Assert.assertNotNull(schema14);
    org.junit.Assert.assertNotNull(schema15);
    org.junit.Assert.assertNotNull(schema17);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
  }

  @Test
  public void test157() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test157");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.STRING;
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.STRING + "'",
        type0.equals(org.apache.avro.Schema.Type.STRING));
  }

  @Test
  public void test158() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test158");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    org.apache.avro.Schema[] schemaArray2 = new org.apache.avro.Schema[] { schema1 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList3 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList3,
        schemaArray2);
    org.apache.avro.Schema schema5 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
    com.fasterxml.jackson.databind.JsonNode jsonNode6 = null;
    boolean boolean7 = schema5.isValidDefault(jsonNode6);
    org.apache.avro.Schema schema8 = org.apache.avro.Schema.createArray(schema5);
    org.apache.avro.Schema schema9 = org.apache.avro.Schema.createArray(schema5);
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertNotNull(schemaArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertNotNull(schema8);
    org.junit.Assert.assertNotNull(schema9);
  }

  @Test
  public void test159() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test159");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    org.apache.avro.Schema[] schemaArray2 = new org.apache.avro.Schema[] { schema1 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList3 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList3,
        schemaArray2);
    org.apache.avro.Schema schema5 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
    org.apache.avro.Schema.Type type6 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema7 = org.apache.avro.Schema.create(type6);
    java.lang.String str8 = type6.getName();
    boolean boolean9 = schema5.equals((java.lang.Object) str8);
    boolean boolean11 = schema5.equals((java.lang.Object) "");
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertNotNull(schemaArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertTrue("'" + type6 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type6.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema7);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "long" + "'", str8, "long");
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
  }

  @Test
  public void test160() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test160");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    org.apache.avro.Schema[] schemaArray2 = new org.apache.avro.Schema[] { schema1 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList3 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList3,
        schemaArray2);
    org.apache.avro.Schema schema5 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
    com.fasterxml.jackson.databind.JsonNode jsonNode6 = null;
    boolean boolean7 = schema5.isValidDefault(jsonNode6);
    org.apache.avro.Schema schema8 = org.apache.avro.Schema.createArray(schema5);
    java.lang.String str10 = schema5.toString(false);
    // The following exception was thrown during execution in test generation
    try {
      schema5.addProp("hi!", "{\n  \"type\" : \"record\",\n  \"fields\" : [ ]\n}");
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Can't set properties on a union: [\"long\"]");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertNotNull(schemaArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertNotNull(schema8);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[\"long\"]" + "'", str10, "[\"long\"]");
  }

  @Test
  public void test161() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test161");
    org.apache.avro.Schema.Type type1 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema2 = org.apache.avro.Schema.create(type1);
    org.apache.avro.Schema[] schemaArray3 = new org.apache.avro.Schema[] { schema2 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList4 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList4,
        schemaArray3);
    org.apache.avro.Schema schema6 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList4);
    org.apache.avro.Schema schema7 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList4);
    java.lang.String str8 = schema7.getFullName();
    org.apache.avro.Schema.Type type9 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema10 = org.apache.avro.Schema.create(type9);
    org.apache.avro.Schema[] schemaArray11 = new org.apache.avro.Schema[] { schema10 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList12 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList12,
        schemaArray11);
    org.apache.avro.Schema schema14 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList12);
    com.fasterxml.jackson.databind.JsonNode jsonNode15 = null;
    boolean boolean16 = schema14.isValidDefault(jsonNode15);
    org.apache.avro.Schema schema17 = org.apache.avro.Schema.createArray(schema14);
    org.apache.avro.Schema.Type type18 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema19 = org.apache.avro.Schema.create(type18);
    org.apache.avro.Schema[] schemaArray20 = new org.apache.avro.Schema[] { schema19 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList21 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList21,
        schemaArray20);
    org.apache.avro.Schema schema23 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList21);
    org.apache.avro.Schema schema24 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList21);
    schema14.putAll((org.apache.avro.JsonProperties) schema24);
    org.apache.avro.Schema schema26 = org.apache.avro.Schema.createArray(schema24);
    java.util.function.BiConsumer<java.lang.String, java.lang.Object> strBiConsumer27 = null;
    schema24.forEachProperty(strBiConsumer27);
    java.lang.String str29 = schema24.getDoc();
    boolean boolean30 = schema7.equals((java.lang.Object) schema24);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema.Field field31 = new org.apache.avro.Schema.Field("[\"long\"]", schema7);
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: [\"long\"]");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type1 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type1.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema2);
    org.junit.Assert.assertNotNull(schemaArray3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    org.junit.Assert.assertNotNull(schema6);
    org.junit.Assert.assertNotNull(schema7);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "union[long]" + "'", str8, "union[long]");
    org.junit.Assert.assertTrue("'" + type9 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type9.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema10);
    org.junit.Assert.assertNotNull(schemaArray11);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    org.junit.Assert.assertNotNull(schema14);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    org.junit.Assert.assertNotNull(schema17);
    org.junit.Assert.assertTrue("'" + type18 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type18.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema19);
    org.junit.Assert.assertNotNull(schemaArray20);
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    org.junit.Assert.assertNotNull(schema23);
    org.junit.Assert.assertNotNull(schema24);
    org.junit.Assert.assertNotNull(schema26);
    org.junit.Assert.assertNull(str29);
    org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
  }

  @Test
  public void test162() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test162");
    org.apache.avro.Schema.Type type1 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema2 = org.apache.avro.Schema.create(type1);
    org.apache.avro.Schema[] schemaArray3 = new org.apache.avro.Schema[] { schema2 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList4 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList4,
        schemaArray3);
    org.apache.avro.Schema schema6 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList4);
    com.fasterxml.jackson.databind.JsonNode jsonNode7 = null;
    boolean boolean8 = schema6.isValidDefault(jsonNode7);
    org.apache.avro.Schema.Field.Order order11 = org.apache.avro.Schema.Field.Order.DESCENDING;
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema.Field field12 = new org.apache.avro.Schema.Field("array", schema6, "long",
          (java.lang.Object) "[\"long\"]", order11);
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroTypeException; message: Invalid default for field array: \"[\\\"long\\\"]\" not a [\"long\"]");
    } catch (org.apache.avro.AvroTypeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type1 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type1.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema2);
    org.junit.Assert.assertNotNull(schemaArray3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    org.junit.Assert.assertNotNull(schema6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    org.junit.Assert.assertTrue("'" + order11 + "' != '" + org.apache.avro.Schema.Field.Order.DESCENDING + "'",
        order11.equals(org.apache.avro.Schema.Field.Order.DESCENDING));
  }

  @Test
  public void test163() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test163");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    org.apache.avro.Schema[] schemaArray2 = new org.apache.avro.Schema[] { schema1 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList3 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList3,
        schemaArray2);
    org.apache.avro.Schema schema5 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
    com.fasterxml.jackson.databind.JsonNode jsonNode6 = null;
    boolean boolean7 = schema5.isValidDefault(jsonNode6);
    org.apache.avro.Schema schema8 = org.apache.avro.Schema.createArray(schema5);
    org.apache.avro.Schema.Type type9 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema10 = org.apache.avro.Schema.create(type9);
    org.apache.avro.Schema[] schemaArray11 = new org.apache.avro.Schema[] { schema10 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList12 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList12,
        schemaArray11);
    org.apache.avro.Schema schema14 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList12);
    org.apache.avro.Schema schema15 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList12);
    schema5.putAll((org.apache.avro.JsonProperties) schema15);
    org.apache.avro.Schema schema17 = org.apache.avro.Schema.createArray(schema15);
    java.util.function.BiConsumer<java.lang.String, java.lang.Object> strBiConsumer18 = null;
    schema15.forEachProperty(strBiConsumer18);
    java.lang.String str20 = schema15.getDoc();
    boolean boolean21 = schema15.isNullable();
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertNotNull(schemaArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertNotNull(schema8);
    org.junit.Assert.assertTrue("'" + type9 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type9.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema10);
    org.junit.Assert.assertNotNull(schemaArray11);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    org.junit.Assert.assertNotNull(schema14);
    org.junit.Assert.assertNotNull(schema15);
    org.junit.Assert.assertNotNull(schema17);
    org.junit.Assert.assertNull(str20);
    org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
  }

  @Test
  public void test164() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test164");
    org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
    boolean boolean1 = parser0.getValidateDefaults();
    java.util.Map<java.lang.String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
    org.apache.avro.NameValidator nameValidator3 = null;
    org.apache.avro.Schema.Parser parser4 = new org.apache.avro.Schema.Parser(nameValidator3);
    org.apache.avro.Schema.Parser parser5 = new org.apache.avro.Schema.Parser();
    boolean boolean6 = parser5.getValidateDefaults();
    java.util.Map<java.lang.String, org.apache.avro.Schema> strMap7 = parser5.getTypes();
    org.apache.avro.Schema.Parser parser8 = parser4.addTypes(strMap7);
    org.apache.avro.Schema.Parser parser9 = parser0.addTypes(strMap7);
    org.apache.avro.NameValidator nameValidator10 = null;
    org.apache.avro.Schema.Parser parser11 = new org.apache.avro.Schema.Parser(nameValidator10);
    org.apache.avro.Schema.Parser parser12 = new org.apache.avro.Schema.Parser();
    boolean boolean13 = parser12.getValidateDefaults();
    java.util.Map<java.lang.String, org.apache.avro.Schema> strMap14 = parser12.getTypes();
    org.apache.avro.Schema.Parser parser15 = parser11.addTypes(strMap14);
    org.apache.avro.Schema.Parser parser16 = parser9.addTypes(strMap14);
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    org.junit.Assert.assertNotNull(strMap2);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    org.junit.Assert.assertNotNull(strMap7);
    org.junit.Assert.assertNotNull(parser8);
    org.junit.Assert.assertNotNull(parser9);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    org.junit.Assert.assertNotNull(strMap14);
    org.junit.Assert.assertNotNull(parser15);
    org.junit.Assert.assertNotNull(parser16);
  }

  @Test
  public void test165() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test165");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    org.apache.avro.Schema[] schemaArray2 = new org.apache.avro.Schema[] { schema1 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList3 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList3,
        schemaArray2);
    org.apache.avro.Schema schema5 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
    org.apache.avro.Schema schema6 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
    java.lang.String str7 = schema6.getFullName();
    java.lang.String str8 = schema6.getFullName();
    com.fasterxml.jackson.databind.JsonNode jsonNode9 = null;
    boolean boolean10 = schema6.isValidDefault(jsonNode9);
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertNotNull(schemaArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertNotNull(schema6);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "union[long]" + "'", str7, "union[long]");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "union[long]" + "'", str8, "union[long]");
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
  }

  @Test
  public void test166() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test166");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    org.apache.avro.Schema[] schemaArray2 = new org.apache.avro.Schema[] { schema1 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList3 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList3,
        schemaArray2);
    org.apache.avro.Schema schema5 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
    java.lang.String str7 = schema5.toString(true);
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertNotNull(schemaArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[ \"long\" ]" + "'", str7, "[ \"long\" ]");
  }

  @Test
  public void test167() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test167");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    org.apache.avro.Schema[] schemaArray2 = new org.apache.avro.Schema[] { schema1 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList3 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList3,
        schemaArray2);
    org.apache.avro.Schema schema5 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
    com.fasterxml.jackson.databind.JsonNode jsonNode6 = null;
    boolean boolean7 = schema5.isValidDefault(jsonNode6);
    org.apache.avro.Schema schema8 = org.apache.avro.Schema.createArray(schema5);
    java.lang.String str9 = schema5.getFullName();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str10 = schema5.getNamespace();
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: [\"long\"]");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertNotNull(schemaArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertNotNull(schema8);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "union[long]" + "'", str9, "union[long]");
  }

  @Test
  public void test168() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test168");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    org.apache.avro.Schema[] schemaArray2 = new org.apache.avro.Schema[] { schema1 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList3 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList3,
        schemaArray2);
    org.apache.avro.Schema schema5 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
    org.apache.avro.Schema schema6 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
    java.lang.String str7 = schema6.getFullName();
    org.apache.avro.Schema.Type type8 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema9 = org.apache.avro.Schema.create(type8);
    org.apache.avro.Schema[] schemaArray10 = new org.apache.avro.Schema[] { schema9 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList11 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList11,
        schemaArray10);
    org.apache.avro.Schema schema13 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList11);
    org.apache.avro.Schema schema14 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList11);
    org.apache.avro.Schema schema15 = org.apache.avro.Schema.applyAliases(schema6, schema14);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema16 = schema6.getElementType();
      org.junit.Assert
          .fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an array: [\"long\"]");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertNotNull(schemaArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertNotNull(schema6);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "union[long]" + "'", str7, "union[long]");
    org.junit.Assert.assertTrue("'" + type8 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type8.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema9);
    org.junit.Assert.assertNotNull(schemaArray10);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    org.junit.Assert.assertNotNull(schema13);
    org.junit.Assert.assertNotNull(schema14);
    org.junit.Assert.assertNotNull(schema15);
  }

  @Test
  public void test169() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test169");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    org.apache.avro.Schema[] schemaArray2 = new org.apache.avro.Schema[] { schema1 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList3 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList3,
        schemaArray2);
    org.apache.avro.Schema schema5 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
    org.apache.avro.Schema schema6 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
    org.apache.avro.Schema schema7 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
    java.lang.String str9 = schema7.toString(false);
    org.apache.avro.Schema.Type type10 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema11 = org.apache.avro.Schema.create(type10);
    org.apache.avro.Schema[] schemaArray12 = new org.apache.avro.Schema[] { schema11 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList13 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList13,
        schemaArray12);
    org.apache.avro.Schema schema15 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList13);
    com.fasterxml.jackson.databind.JsonNode jsonNode16 = null;
    boolean boolean17 = schema15.isValidDefault(jsonNode16);
    org.apache.avro.Schema schema18 = org.apache.avro.Schema.createArray(schema15);
    org.apache.avro.Schema.Type type20 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema21 = org.apache.avro.Schema.create(type20);
    org.apache.avro.Schema[] schemaArray22 = new org.apache.avro.Schema[] { schema21 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList23 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean24 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList23,
        schemaArray22);
    org.apache.avro.Schema schema25 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList23);
    com.fasterxml.jackson.databind.JsonNode jsonNode26 = null;
    boolean boolean27 = schema25.isValidDefault(jsonNode26);
    org.apache.avro.Schema schema28 = org.apache.avro.Schema.createArray(schema25);
    java.lang.Object obj29 = schema18.getObjectProp("hi!", (java.lang.Object) schema28);
    org.apache.avro.Schema.SeenPair seenPair30 = new org.apache.avro.Schema.SeenPair((java.lang.Object) schema7,
        (java.lang.Object) "hi!");
    java.util.Map<java.lang.String, java.lang.Object> strMap31 = schema7.getObjectProps();
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertNotNull(schemaArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertNotNull(schema6);
    org.junit.Assert.assertNotNull(schema7);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[\"long\"]" + "'", str9, "[\"long\"]");
    org.junit.Assert.assertTrue("'" + type10 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type10.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema11);
    org.junit.Assert.assertNotNull(schemaArray12);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    org.junit.Assert.assertNotNull(schema15);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    org.junit.Assert.assertNotNull(schema18);
    org.junit.Assert.assertTrue("'" + type20 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type20.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema21);
    org.junit.Assert.assertNotNull(schemaArray22);
    org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    org.junit.Assert.assertNotNull(schema25);
    org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    org.junit.Assert.assertNotNull(schema28);
    org.junit.Assert.assertNotNull(obj29);
    org.junit.Assert.assertEquals(obj29.toString(), "{\"type\":\"array\",\"items\":[\"long\"]}");
    org.junit.Assert.assertEquals(java.lang.String.valueOf(obj29), "{\"type\":\"array\",\"items\":[\"long\"]}");
    org.junit.Assert.assertEquals(java.util.Objects.toString(obj29), "{\"type\":\"array\",\"items\":[\"long\"]}");
    org.junit.Assert.assertNotNull(strMap31);
  }

  @Test
  public void test170() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test170");
    org.apache.avro.Schema.Type type1 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema2 = org.apache.avro.Schema.create(type1);
    org.apache.avro.Schema[] schemaArray3 = new org.apache.avro.Schema[] { schema2 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList4 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList4,
        schemaArray3);
    org.apache.avro.Schema schema6 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList4);
    org.apache.avro.Schema schema7 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList4);
    org.apache.avro.Schema.SeenPair seenPair8 = new org.apache.avro.Schema.SeenPair((java.lang.Object) 1,
        (java.lang.Object) schemaList4);
    java.lang.Object obj9 = null;
    boolean boolean10 = seenPair8.equals(obj9);
    org.apache.avro.Schema.Type type11 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema12 = org.apache.avro.Schema.create(type11);
    org.apache.avro.Schema[] schemaArray13 = new org.apache.avro.Schema[] { schema12 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList14 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList14,
        schemaArray13);
    org.apache.avro.Schema schema16 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList14);
    com.fasterxml.jackson.databind.JsonNode jsonNode17 = null;
    boolean boolean18 = schema16.isValidDefault(jsonNode17);
    org.apache.avro.Schema schema19 = org.apache.avro.Schema.createArray(schema16);
    org.apache.avro.Schema.Type type20 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema21 = org.apache.avro.Schema.create(type20);
    org.apache.avro.Schema[] schemaArray22 = new org.apache.avro.Schema[] { schema21 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList23 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean24 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList23,
        schemaArray22);
    org.apache.avro.Schema schema25 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList23);
    org.apache.avro.Schema schema26 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList23);
    schema16.putAll((org.apache.avro.JsonProperties) schema26);
    org.apache.avro.Schema schema28 = org.apache.avro.Schema.createArray(schema26);
    java.util.function.BiConsumer<java.lang.String, java.lang.Object> strBiConsumer29 = null;
    schema26.forEachProperty(strBiConsumer29);
    boolean boolean31 = seenPair8.equals((java.lang.Object) schema26);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema32 = schema26.getValueType();
      org.junit.Assert
          .fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a map: [\"long\"]");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type1 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type1.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema2);
    org.junit.Assert.assertNotNull(schemaArray3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    org.junit.Assert.assertNotNull(schema6);
    org.junit.Assert.assertNotNull(schema7);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    org.junit.Assert.assertTrue("'" + type11 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type11.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema12);
    org.junit.Assert.assertNotNull(schemaArray13);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    org.junit.Assert.assertNotNull(schema16);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    org.junit.Assert.assertNotNull(schema19);
    org.junit.Assert.assertTrue("'" + type20 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type20.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema21);
    org.junit.Assert.assertNotNull(schemaArray22);
    org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    org.junit.Assert.assertNotNull(schema25);
    org.junit.Assert.assertNotNull(schema26);
    org.junit.Assert.assertNotNull(schema28);
    org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
  }

  @Test
  public void test171() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test171");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    org.apache.avro.Schema[] schemaArray2 = new org.apache.avro.Schema[] { schema1 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList3 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList3,
        schemaArray2);
    org.apache.avro.Schema schema5 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
    com.fasterxml.jackson.databind.JsonNode jsonNode6 = null;
    boolean boolean7 = schema5.isValidDefault(jsonNode6);
    org.apache.avro.Schema schema8 = org.apache.avro.Schema.createArray(schema5);
    org.apache.avro.Schema.Type type9 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema10 = org.apache.avro.Schema.create(type9);
    org.apache.avro.Schema[] schemaArray11 = new org.apache.avro.Schema[] { schema10 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList12 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList12,
        schemaArray11);
    org.apache.avro.Schema schema14 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList12);
    org.apache.avro.Schema schema15 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList12);
    schema5.putAll((org.apache.avro.JsonProperties) schema15);
    org.apache.avro.Schema schema17 = org.apache.avro.Schema.createArray(schema15);
    // The following exception was thrown during execution in test generation
    try {
      schema15.addAlias("{\"type\":\"map\",\"values\":[\"long\"]}", "");
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a named type: [\"long\"]");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertNotNull(schemaArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertNotNull(schema8);
    org.junit.Assert.assertTrue("'" + type9 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type9.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema10);
    org.junit.Assert.assertNotNull(schemaArray11);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    org.junit.Assert.assertNotNull(schema14);
    org.junit.Assert.assertNotNull(schema15);
    org.junit.Assert.assertNotNull(schema17);
  }

  @Test
  public void test172() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test172");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    org.apache.avro.Schema.Type type2 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema3 = org.apache.avro.Schema.create(type2);
    org.apache.avro.Schema[] schemaArray4 = new org.apache.avro.Schema[] { schema3 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList5 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList5,
        schemaArray4);
    org.apache.avro.Schema schema7 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList5);
    com.fasterxml.jackson.databind.JsonNode jsonNode8 = null;
    boolean boolean9 = schema7.isValidDefault(jsonNode8);
    org.apache.avro.Schema schema10 = org.apache.avro.Schema.createArray(schema7);
    org.apache.avro.Schema.Type type11 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema12 = org.apache.avro.Schema.create(type11);
    org.apache.avro.Schema[] schemaArray13 = new org.apache.avro.Schema[] { schema12 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList14 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList14,
        schemaArray13);
    org.apache.avro.Schema schema16 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList14);
    org.apache.avro.Schema schema17 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList14);
    schema7.putAll((org.apache.avro.JsonProperties) schema17);
    org.apache.avro.Schema schema19 = org.apache.avro.Schema.createArray(schema17);
    java.util.function.BiConsumer<java.lang.String, java.lang.Object> strBiConsumer20 = null;
    schema17.forEachProperty(strBiConsumer20);
    schema1.putAll((org.apache.avro.JsonProperties) schema17);
    java.lang.String str23 = schema1.getName();
    java.lang.Object obj25 = schema1.getObjectProp("");
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertTrue("'" + type2 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type2.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema3);
    org.junit.Assert.assertNotNull(schemaArray4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    org.junit.Assert.assertNotNull(schema7);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    org.junit.Assert.assertNotNull(schema10);
    org.junit.Assert.assertTrue("'" + type11 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type11.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema12);
    org.junit.Assert.assertNotNull(schemaArray13);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    org.junit.Assert.assertNotNull(schema16);
    org.junit.Assert.assertNotNull(schema17);
    org.junit.Assert.assertNotNull(schema19);
    org.junit.Assert.assertEquals("'" + str23 + "' != '" + "long" + "'", str23, "long");
    org.junit.Assert.assertNull(obj25);
  }

  @Test
  public void test173() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test173");
    java.lang.String[] strArray9 = new java.lang.String[] { "{\n  \"type\" : \"record\",\n  \"fields\" : [ ]\n}",
        "\"long\"", "union[long]", "\"long\"", "hi!", "fixed" };
    java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
    boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema13 = org.apache.avro.Schema.createEnum(
          "{\n  \"type\" : \"map\",\n  \"values\" : [ \"long\" ]\n}",
          "{\n  \"type\" : \"map\",\n  \"values\" : [ \"long\" ]\n}",
          "{\n  \"type\" : \"map\",\n  \"values\" : [ \"long\" ]\n}", (java.util.List<java.lang.String>) strList10, "");
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: {?  \"type\" : \"map\",?  \"values\" : [ \"long\" ]?}");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(strArray9);
    org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {
        "{\n  \"type\" : \"record\",\n  \"fields\" : [ ]\n}", "\"long\"", "union[long]", "\"long\"", "hi!", "fixed" });
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
  }

  @Test
  public void test174() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test174");
    java.lang.String[] strArray13 = new java.lang.String[] { "fixed", "{\"type\":\"map\",\"values\":[\"long\"]}", "",
        "", "\"long\"", "array", "fixed", "\"long\"", "{\n  \"type\" : \"map\",\n  \"values\" : [ \"long\" ]\n}",
        "{\"type\":\"map\",\"values\":[\"long\"]}" };
    java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
    boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema17 = org.apache.avro.Schema.createEnum("", "",
          "{\n  \"type\" : \"record\",\n  \"fields\" : [ ]\n}", (java.util.List<java.lang.String>) strList14, "fixed");
      org.junit.Assert.fail("Expected exception of type org.apache.avro.SchemaParseException; message: Empty name");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(strArray13);
    org.junit.Assert.assertArrayEquals(strArray13,
        new java.lang.String[] { "fixed", "{\"type\":\"map\",\"values\":[\"long\"]}", "", "", "\"long\"", "array",
            "fixed", "\"long\"", "{\n  \"type\" : \"map\",\n  \"values\" : [ \"long\" ]\n}",
            "{\"type\":\"map\",\"values\":[\"long\"]}" });
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
  }

  @Test
  public void test175() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test175");
    org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
    org.apache.avro.NameValidator nameValidator1 = org.apache.avro.Schema.getNameValidator();
    org.apache.avro.Schema.SeenPair seenPair2 = new org.apache.avro.Schema.SeenPair((java.lang.Object) parser0,
        (java.lang.Object) nameValidator1);
    org.apache.avro.Schema.Parser parser3 = new org.apache.avro.Schema.Parser(nameValidator1);
    org.apache.avro.Schema.Parser parser5 = parser3.setValidateDefaults(true);
    java.lang.String[] strArray7 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema8 = parser5.parse("[ \"long\" ]", strArray7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"<local4>\" is null");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(nameValidator1);
    org.junit.Assert.assertNotNull(parser5);
  }

  @Test
  public void test176() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test176");
    org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("long", "[\"long\"]", "\"long\"", 1);
    org.apache.avro.NameValidator nameValidator6 = null;
    org.apache.avro.Schema.Parser parser7 = new org.apache.avro.Schema.Parser(nameValidator6);
    org.apache.avro.Schema.Parser parser8 = new org.apache.avro.Schema.Parser();
    boolean boolean9 = parser8.getValidateDefaults();
    java.util.Map<java.lang.String, org.apache.avro.Schema> strMap10 = parser8.getTypes();
    org.apache.avro.Schema.Parser parser11 = parser7.addTypes(strMap10);
    org.apache.avro.Schema.Parser parser12 = new org.apache.avro.Schema.Parser();
    boolean boolean13 = parser12.getValidateDefaults();
    java.util.Map<java.lang.String, org.apache.avro.Schema> strMap14 = parser12.getTypes();
    org.apache.avro.NameValidator nameValidator15 = null;
    org.apache.avro.Schema.Parser parser16 = new org.apache.avro.Schema.Parser(nameValidator15);
    org.apache.avro.Schema.Parser parser17 = new org.apache.avro.Schema.Parser();
    boolean boolean18 = parser17.getValidateDefaults();
    java.util.Map<java.lang.String, org.apache.avro.Schema> strMap19 = parser17.getTypes();
    org.apache.avro.Schema.Parser parser20 = parser16.addTypes(strMap19);
    org.apache.avro.Schema.Parser parser21 = parser12.addTypes(strMap19);
    org.apache.avro.Schema.Parser parser22 = parser7.addTypes(strMap19);
    java.lang.Object obj23 = schema4.getObjectProp("", (java.lang.Object) strMap19);
    org.junit.Assert.assertNotNull(schema4);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    org.junit.Assert.assertNotNull(strMap10);
    org.junit.Assert.assertNotNull(parser11);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    org.junit.Assert.assertNotNull(strMap14);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    org.junit.Assert.assertNotNull(strMap19);
    org.junit.Assert.assertNotNull(parser20);
    org.junit.Assert.assertNotNull(parser21);
    org.junit.Assert.assertNotNull(parser22);
    org.junit.Assert.assertNotNull(obj23);
    org.junit.Assert.assertEquals(obj23.toString(), "{}");
    org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "{}");
    org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "{}");
  }

  @Test
  public void test177() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test177");
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema4 = org.apache.avro.Schema.createFixed("[ \"long\" ]", "array", "fixed",
          (int) (short) 1);
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: [ \"long\" ]");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
  }

  @Test
  public void test178() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test178");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    org.apache.avro.Schema[] schemaArray2 = new org.apache.avro.Schema[] { schema1 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList3 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList3,
        schemaArray2);
    org.apache.avro.Schema schema5 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
    org.apache.avro.Schema schema6 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
    org.apache.avro.Schema schema7 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
    org.apache.avro.LogicalType logicalType8 = schema7.getLogicalType();
    java.lang.String str10 = schema7.getProp("union[long]");
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertNotNull(schemaArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertNotNull(schema6);
    org.junit.Assert.assertNotNull(schema7);
    org.junit.Assert.assertNull(logicalType8);
    org.junit.Assert.assertNull(str10);
  }

  @Test
  public void test179() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test179");
    org.apache.avro.Schema.Type type1 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema2 = org.apache.avro.Schema.create(type1);
    org.apache.avro.Schema[] schemaArray3 = new org.apache.avro.Schema[] { schema2 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList4 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList4,
        schemaArray3);
    org.apache.avro.Schema schema6 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList4);
    com.fasterxml.jackson.databind.JsonNode jsonNode7 = null;
    boolean boolean8 = schema6.isValidDefault(jsonNode7);
    org.apache.avro.Schema schema9 = org.apache.avro.Schema.createArray(schema6);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema.Field field10 = new org.apache.avro.Schema.Field("\"long\"", schema6);
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.SchemaParseException; message: Illegal initial character: \"long\"");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type1 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type1.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema2);
    org.junit.Assert.assertNotNull(schemaArray3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    org.junit.Assert.assertNotNull(schema6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    org.junit.Assert.assertNotNull(schema9);
  }

  @Test
  public void test180() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test180");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    org.apache.avro.Schema[] schemaArray2 = new org.apache.avro.Schema[] { schema1 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList3 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList3,
        schemaArray2);
    org.apache.avro.Schema schema5 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
    com.fasterxml.jackson.databind.JsonNode jsonNode6 = null;
    boolean boolean7 = schema5.isValidDefault(jsonNode6);
    org.apache.avro.Schema schema8 = org.apache.avro.Schema.createArray(schema5);
    java.lang.String str10 = schema5.toString(false);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema11 = schema5.getValueType();
      org.junit.Assert
          .fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not a map: [\"long\"]");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertNotNull(schemaArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertNotNull(schema8);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[\"long\"]" + "'", str10, "[\"long\"]");
  }

  @Test
  public void test181() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test181");
    org.apache.avro.Schema.Field[] fieldArray0 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList1 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList1,
        fieldArray0);
    org.apache.avro.Schema schema3 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
    org.apache.avro.Schema schema4 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
    org.apache.avro.Schema schema5 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
    org.apache.avro.Schema.Field[] fieldArray6 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList7 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList7,
        fieldArray6);
    org.apache.avro.Schema schema9 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList7);
    // The following exception was thrown during execution in test generation
    try {
      schema5.setFields((java.util.List<org.apache.avro.Schema.Field>) fieldList7);
      org.junit.Assert
          .fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Fields are already set");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(fieldArray0);
    org.junit.Assert.assertArrayEquals(fieldArray0, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertNotNull(schema3);
    org.junit.Assert.assertNotNull(schema4);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertNotNull(fieldArray6);
    org.junit.Assert.assertArrayEquals(fieldArray6, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    org.junit.Assert.assertNotNull(schema9);
  }

  @Test
  public void test182() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test182");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.MAP;
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.MAP + "'",
        type0.equals(org.apache.avro.Schema.Type.MAP));
  }

  @Test
  public void test183() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test183");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    org.apache.avro.Schema[] schemaArray2 = new org.apache.avro.Schema[] { schema1 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList3 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList3,
        schemaArray2);
    org.apache.avro.Schema schema5 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
    org.apache.avro.Schema schema6 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
    java.lang.String str7 = schema6.getFullName();
    org.apache.avro.Schema.Type type8 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema9 = org.apache.avro.Schema.create(type8);
    org.apache.avro.Schema[] schemaArray10 = new org.apache.avro.Schema[] { schema9 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList11 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList11,
        schemaArray10);
    org.apache.avro.Schema schema13 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList11);
    com.fasterxml.jackson.databind.JsonNode jsonNode14 = null;
    boolean boolean15 = schema13.isValidDefault(jsonNode14);
    org.apache.avro.Schema schema16 = org.apache.avro.Schema.createArray(schema13);
    org.apache.avro.Schema.Type type17 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema18 = org.apache.avro.Schema.create(type17);
    org.apache.avro.Schema[] schemaArray19 = new org.apache.avro.Schema[] { schema18 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList20 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean21 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList20,
        schemaArray19);
    org.apache.avro.Schema schema22 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList20);
    org.apache.avro.Schema schema23 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList20);
    schema13.putAll((org.apache.avro.JsonProperties) schema23);
    org.apache.avro.Schema schema25 = org.apache.avro.Schema.createArray(schema23);
    java.util.function.BiConsumer<java.lang.String, java.lang.Object> strBiConsumer26 = null;
    schema23.forEachProperty(strBiConsumer26);
    java.lang.String str28 = schema23.getDoc();
    boolean boolean29 = schema6.equals((java.lang.Object) schema23);
    org.apache.avro.Schema.Type type30 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema31 = org.apache.avro.Schema.create(type30);
    org.apache.avro.Schema.Type type32 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema33 = org.apache.avro.Schema.create(type32);
    org.apache.avro.Schema[] schemaArray34 = new org.apache.avro.Schema[] { schema33 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList35 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean36 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList35,
        schemaArray34);
    org.apache.avro.Schema schema37 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList35);
    com.fasterxml.jackson.databind.JsonNode jsonNode38 = null;
    boolean boolean39 = schema37.isValidDefault(jsonNode38);
    org.apache.avro.Schema schema40 = org.apache.avro.Schema.createArray(schema37);
    org.apache.avro.Schema.Type type41 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema42 = org.apache.avro.Schema.create(type41);
    org.apache.avro.Schema[] schemaArray43 = new org.apache.avro.Schema[] { schema42 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList44 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean45 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList44,
        schemaArray43);
    org.apache.avro.Schema schema46 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList44);
    org.apache.avro.Schema schema47 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList44);
    schema37.putAll((org.apache.avro.JsonProperties) schema47);
    org.apache.avro.Schema schema49 = org.apache.avro.Schema.createArray(schema47);
    java.util.function.BiConsumer<java.lang.String, java.lang.Object> strBiConsumer50 = null;
    schema47.forEachProperty(strBiConsumer50);
    schema31.putAll((org.apache.avro.JsonProperties) schema47);
    schema6.addAllProps((org.apache.avro.JsonProperties) schema31);
    boolean boolean54 = schema6.isNullable();
    java.lang.Object obj57 = schema6.getObjectProp("[\"long\"]", (java.lang.Object) (-1.0d));
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertNotNull(schemaArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertNotNull(schema6);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "union[long]" + "'", str7, "union[long]");
    org.junit.Assert.assertTrue("'" + type8 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type8.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema9);
    org.junit.Assert.assertNotNull(schemaArray10);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    org.junit.Assert.assertNotNull(schema13);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    org.junit.Assert.assertNotNull(schema16);
    org.junit.Assert.assertTrue("'" + type17 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type17.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema18);
    org.junit.Assert.assertNotNull(schemaArray19);
    org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    org.junit.Assert.assertNotNull(schema22);
    org.junit.Assert.assertNotNull(schema23);
    org.junit.Assert.assertNotNull(schema25);
    org.junit.Assert.assertNull(str28);
    org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    org.junit.Assert.assertTrue("'" + type30 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type30.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema31);
    org.junit.Assert.assertTrue("'" + type32 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type32.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema33);
    org.junit.Assert.assertNotNull(schemaArray34);
    org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    org.junit.Assert.assertNotNull(schema37);
    org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    org.junit.Assert.assertNotNull(schema40);
    org.junit.Assert.assertTrue("'" + type41 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type41.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema42);
    org.junit.Assert.assertNotNull(schemaArray43);
    org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    org.junit.Assert.assertNotNull(schema46);
    org.junit.Assert.assertNotNull(schema47);
    org.junit.Assert.assertNotNull(schema49);
    org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    org.junit.Assert.assertEquals("'" + obj57 + "' != '" + (-1.0d) + "'", obj57, (-1.0d));
  }

  @Test
  public void test184() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test184");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    org.apache.avro.Schema[] schemaArray2 = new org.apache.avro.Schema[] { schema1 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList3 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList3,
        schemaArray2);
    org.apache.avro.Schema schema5 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
    org.apache.avro.Schema schema6 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
    org.apache.avro.Schema schema7 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList3);
    java.lang.String str9 = schema7.toString(false);
    org.apache.avro.Schema.Type type10 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema11 = org.apache.avro.Schema.create(type10);
    org.apache.avro.Schema[] schemaArray12 = new org.apache.avro.Schema[] { schema11 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList13 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList13,
        schemaArray12);
    org.apache.avro.Schema schema15 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList13);
    com.fasterxml.jackson.databind.JsonNode jsonNode16 = null;
    boolean boolean17 = schema15.isValidDefault(jsonNode16);
    org.apache.avro.Schema schema18 = org.apache.avro.Schema.createArray(schema15);
    org.apache.avro.Schema.Type type20 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema21 = org.apache.avro.Schema.create(type20);
    org.apache.avro.Schema[] schemaArray22 = new org.apache.avro.Schema[] { schema21 };
    java.util.ArrayList<org.apache.avro.Schema> schemaList23 = new java.util.ArrayList<org.apache.avro.Schema>();
    boolean boolean24 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema>) schemaList23,
        schemaArray22);
    org.apache.avro.Schema schema25 = org.apache.avro.Schema
        .createUnion((java.util.List<org.apache.avro.Schema>) schemaList23);
    com.fasterxml.jackson.databind.JsonNode jsonNode26 = null;
    boolean boolean27 = schema25.isValidDefault(jsonNode26);
    org.apache.avro.Schema schema28 = org.apache.avro.Schema.createArray(schema25);
    java.lang.Object obj29 = schema18.getObjectProp("hi!", (java.lang.Object) schema28);
    org.apache.avro.Schema.SeenPair seenPair30 = new org.apache.avro.Schema.SeenPair((java.lang.Object) schema7,
        (java.lang.Object) "hi!");
    // The following exception was thrown during execution in test generation
    try {
      int int32 = schema7.getEnumOrdinal("");
      org.junit.Assert
          .fail("Expected exception of type org.apache.avro.AvroRuntimeException; message: Not an enum: [\"long\"]");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertNotNull(schemaArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertNotNull(schema5);
    org.junit.Assert.assertNotNull(schema6);
    org.junit.Assert.assertNotNull(schema7);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[\"long\"]" + "'", str9, "[\"long\"]");
    org.junit.Assert.assertTrue("'" + type10 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type10.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema11);
    org.junit.Assert.assertNotNull(schemaArray12);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    org.junit.Assert.assertNotNull(schema15);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    org.junit.Assert.assertNotNull(schema18);
    org.junit.Assert.assertTrue("'" + type20 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type20.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema21);
    org.junit.Assert.assertNotNull(schemaArray22);
    org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    org.junit.Assert.assertNotNull(schema25);
    org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    org.junit.Assert.assertNotNull(schema28);
    org.junit.Assert.assertNotNull(obj29);
    org.junit.Assert.assertEquals(obj29.toString(), "{\"type\":\"array\",\"items\":[\"long\"]}");
    org.junit.Assert.assertEquals(java.lang.String.valueOf(obj29), "{\"type\":\"array\",\"items\":[\"long\"]}");
    org.junit.Assert.assertEquals(java.util.Objects.toString(obj29), "{\"type\":\"array\",\"items\":[\"long\"]}");
  }
}
