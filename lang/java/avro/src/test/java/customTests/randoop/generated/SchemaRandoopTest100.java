package customTests.randoop.generated;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SchemaRandoopTest100 {

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
  public void test02() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test02");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.ARRAY;
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.ARRAY + "'",
        type0.equals(org.apache.avro.Schema.Type.ARRAY));
  }

  @Test
  public void test03() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test03");
    org.apache.avro.JsonProperties.Null null0 = org.apache.avro.JsonProperties.NULL_VALUE;
    org.junit.Assert.assertNotNull(null0);
  }

  @Test
  public void test04() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test04");
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
  public void test05() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test05");
    Object obj0 = org.apache.avro.Schema.Field.NULL_DEFAULT_VALUE;
    org.junit.Assert.assertNotNull(obj0);
  }

  @Test
  public void test06() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test06");
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
  public void test07() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test07");
    org.apache.avro.Schema schema0 = null;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.createMap(schema0);
    Object obj3 = null;
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
  public void test08() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test08");
    org.apache.avro.Schema schema0 = null;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.createMap(schema0);
    // The following exception was thrown during execution in test generation
    try {
      schema1.addProp("", (Object) (byte) 10);
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroRuntimeException; message: Unknown datum class: class java.lang.Byte");
    } catch (org.apache.avro.AvroRuntimeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(schema1);
  }

  @Test
  public void test09() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test09");
    org.apache.avro.Schema schema0 = null;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.createMap(schema0);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema.Field field3 = schema1.getField("hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.avro.Schema.toJson(java.util.Set, String, com.fasterxml.jackson.core.JsonGenerator)\" because \"this.valueType\" is null");
    } catch (NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(schema1);
  }

  @Test
  public void test10() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test10");
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
  public void test11() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test11");
    org.apache.avro.NameValidator nameValidator0 = null;
    org.apache.avro.Schema.Parser parser1 = new org.apache.avro.Schema.Parser(nameValidator0);
    String[] strArray9 = new String[] { "", "", "hi!", "", "hi!", "hi!" };
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema10 = parser1.parse("", strArray9);
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.SchemaParseException; message: com.fasterxml.jackson.core.JsonParseException: Unrecognized token 'hi': was expecting (JSON String, Number, Array, Object or token 'null', 'true' or 'false')? at [Source: REDACTED (`StreamReadFeature.INCLUDE_SOURCE_IN_LOCATION` disabled); line: 1, column: 1]");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(strArray9);
    org.junit.Assert.assertArrayEquals(strArray9, new String[] { "", "", "hi!", "", "hi!", "hi!" });
  }

  @Test
  public void test12() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test12");
    org.apache.avro.Schema schema0 = null;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.createMap(schema0);
    // The following exception was thrown during execution in test generation
    try {
      boolean boolean3 = schema1.hasEnumSymbol("");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.avro.Schema.toJson(java.util.Set, String, com.fasterxml.jackson.core.JsonGenerator)\" because \"this.valueType\" is null");
    } catch (NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(schema1);
  }

  @Test
  public void test13() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test13");
    org.apache.avro.Schema schema0 = null;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.createMap(schema0);
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<org.apache.avro.Schema.Field> fieldList2 = schema1.getFields();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.avro.Schema.toJson(java.util.Set, String, com.fasterxml.jackson.core.JsonGenerator)\" because \"this.valueType\" is null");
    } catch (NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(schema1);
  }

  @Test
  public void test14() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test14");
    org.apache.avro.Schema schema0 = null;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.createMap(schema0);
    org.apache.avro.Schema schema2 = null;
    org.apache.avro.Schema schema3 = org.apache.avro.Schema.createMap(schema2);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema4 = org.apache.avro.Schema.applyAliases(schema0, schema2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.avro.Schema.equals(Object)\" because \"writer\" is null");
    } catch (NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertNotNull(schema3);
  }

  @Test
  public void test15() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test15");
    org.apache.avro.NameValidator nameValidator0 = null;
    org.apache.avro.Schema.Parser parser1 = new org.apache.avro.Schema.Parser(nameValidator0);
    String[] strArray3 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema4 = parser1.parse("", strArray3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"<local4>\" is null");
    } catch (NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test16() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test16");
    org.apache.avro.Schema schema0 = null;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.createMap(schema0);
    // The following exception was thrown during execution in test generation
    try {
      String str2 = schema1.getNamespace();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.avro.Schema.toJson(java.util.Set, String, com.fasterxml.jackson.core.JsonGenerator)\" because \"this.valueType\" is null");
    } catch (NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(schema1);
  }

  @Test
  public void test17() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test17");
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
  public void test18() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test18");
    org.apache.avro.Schema schema0 = null;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.createMap(schema0);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema2 = schema1.getElementType();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.avro.Schema.toJson(java.util.Set, String, com.fasterxml.jackson.core.JsonGenerator)\" because \"this.valueType\" is null");
    } catch (NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(schema1);
  }

  @Test
  public void test19() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test19");
    org.apache.avro.Schema schema0 = null;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.createMap(schema0);
    // The following exception was thrown during execution in test generation
    try {
      boolean boolean2 = schema1.isError();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.avro.Schema.toJson(java.util.Set, String, com.fasterxml.jackson.core.JsonGenerator)\" because \"this.valueType\" is null");
    } catch (NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(schema1);
  }

  @Test
  public void test20() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test20");
    boolean boolean0 = org.apache.avro.Schema.getValidateDefaults();
    org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + true + "'", boolean0 == true);
  }

  @Test
  public void test21() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test21");
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
  public void test22() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test22");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<String> strList2 = schema1.getEnumSymbols();
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
  public void test23() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test23");
    org.apache.avro.Schema.Type type1 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema2 = org.apache.avro.Schema.create(type1);
    org.apache.avro.Schema.Field.Order order5 = org.apache.avro.Schema.Field.Order.IGNORE;
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema.Field field6 = new org.apache.avro.Schema.Field("hi!", schema2, "hi!", (Object) (short) 10,
          order5);
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
  public void test24() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test24");
    org.apache.avro.NameValidator nameValidator0 = null;
    org.apache.avro.Schema.Parser parser1 = new org.apache.avro.Schema.Parser(nameValidator0);
    Iterable<org.apache.avro.Schema> schemaIterable2 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema.Parser parser3 = parser1.addTypes(schemaIterable2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.Iterable.iterator()\" because \"types\" is null");
    } catch (NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test25() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test25");
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
  public void test26() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test26");
    org.apache.avro.Schema.Field field0 = null;
    org.apache.avro.Schema.Type type1 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema2 = org.apache.avro.Schema.create(type1);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema.Field field3 = new org.apache.avro.Schema.Field(field0, schema2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: Cannot read field \"name\" because \"field\" is null");
    } catch (NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertTrue("'" + type1 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type1.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema2);
  }

  @Test
  public void test27() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test27");
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
      org.apache.avro.Schema.Parser parser9 = parser1.addTypes((Iterable<org.apache.avro.Schema>) schemaList5);
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
  public void test28() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test28");
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
  public void test29() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test29");
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
  public void test30() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test30");
    org.apache.avro.NameValidator nameValidator0 = null;
    org.apache.avro.Schema.Parser parser1 = new org.apache.avro.Schema.Parser(nameValidator0);
    String[] strArray4 = new String[] { "long" };
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema5 = parser1.parse("long", strArray4);
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.SchemaParseException; message: com.fasterxml.jackson.core.JsonParseException: Unrecognized token 'longlong': was expecting (JSON String, Number, Array, Object or token 'null', 'true' or 'false')? at [Source: REDACTED (`StreamReadFeature.INCLUDE_SOURCE_IN_LOCATION` disabled); line: 1, column: 1]");
    } catch (org.apache.avro.SchemaParseException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(strArray4);
    org.junit.Assert.assertArrayEquals(strArray4, new String[] { "long" });
  }

  @Test
  public void test31() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test31");
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
      org.apache.avro.Schema.Field field10 = new org.apache.avro.Schema.Field("hi!", schema6, "", (Object) 10, order9);
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
  public void test32() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test32");
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
      java.util.Set<String> strSet6 = schema5.getAliases();
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
  public void test33() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test33");
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
  public void test34() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test34");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.DOUBLE;
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.DOUBLE + "'",
        type0.equals(org.apache.avro.Schema.Type.DOUBLE));
  }

  @Test
  public void test35() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test35");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.LONG;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.create(type0);
    String str2 = type0.getName();
    String str3 = type0.getName();
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.LONG + "'",
        type0.equals(org.apache.avro.Schema.Type.LONG));
    org.junit.Assert.assertNotNull(schema1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "long" + "'", str2, "long");
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "long" + "'", str3, "long");
  }

  @Test
  public void test36() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test36");
    org.apache.avro.Schema schema1 = null;
    org.apache.avro.Schema schema2 = org.apache.avro.Schema.createMap(schema1);
    org.apache.avro.NameValidator nameValidator4 = null;
    org.apache.avro.Schema.Parser parser5 = new org.apache.avro.Schema.Parser(nameValidator4);
    org.apache.avro.Schema.Field.Order order6 = org.apache.avro.Schema.Field.Order.IGNORE;
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema.Field field7 = new org.apache.avro.Schema.Field("long", schema1, "long",
          (Object) nameValidator4, order6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: schema is required and cannot be null");
    } catch (NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(schema2);
    org.junit.Assert.assertTrue("'" + order6 + "' != '" + org.apache.avro.Schema.Field.Order.IGNORE + "'",
        order6.equals(org.apache.avro.Schema.Field.Order.IGNORE));
  }

  @Test
  public void test37() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test37");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.INT;
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.INT + "'",
        type0.equals(org.apache.avro.Schema.Type.INT));
  }

  @Test
  public void test38() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test38");
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
      schema6.addProp("long", (Object) (byte) 1);
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
  public void test39() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test39");
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
  public void test40() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test40");
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
    String str8 = type6.getName();
    boolean boolean9 = schema5.equals((Object) str8);
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
  public void test41() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test41");
    org.apache.avro.ParseContext parseContext0 = null;
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema.Parser parser1 = new org.apache.avro.Schema.Parser(parseContext0);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: Cannot read field \"nameValidator\" because \"context\" is null");
    } catch (NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test42() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test42");
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
  public void test43() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test43");
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
  public void test44() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test44");
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
    Object obj18 = schema15.getObjectProp("hi!");
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
  public void test45() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test45");
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
    org.apache.avro.Schema.SeenPair seenPair12 = new org.apache.avro.Schema.SeenPair((Object) 1, (Object) schemaList8);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema.Field field13 = new org.apache.avro.Schema.Field("", schema2, "long", (Object) 1);
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
  public void test46() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test46");
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
      schema6.addProp("hi!", (Object) (short) -1);
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
  public void test47() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test47");
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
    } catch (NullPointerException e) {
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
  public void test48() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test48");
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
    java.util.Map<String, Object> strMap9 = schema5.getObjectProps();
    com.fasterxml.jackson.databind.JsonNode jsonNode10 = null;
    boolean boolean11 = schema5.isValidDefault(jsonNode10);
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
  }

  @Test
  public void test49() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test49");
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
  public void test50() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test50");
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
    } catch (NullPointerException e) {
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
  public void test51() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test51");
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
  public void test52() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test52");
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
    String str7 = schema6.getFullName();
    // The following exception was thrown during execution in test generation
    try {
      String str8 = schema6.getNamespace();
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
  public void test53() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test53");
    org.apache.avro.NameValidator nameValidator0 = org.apache.avro.Schema.getNameValidator();
    org.junit.Assert.assertNotNull(nameValidator0);
  }

  @Test
  public void test54() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test54");
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
  public void test55() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test55");
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
    String str8 = schema7.getFullName();
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
  public void test56() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test56");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.BOOLEAN;
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.BOOLEAN + "'",
        type0.equals(org.apache.avro.Schema.Type.BOOLEAN));
  }

  @Test
  public void test57() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test57");
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
  public void test58() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test58");
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
    boolean boolean19 = schema17.equals((Object) 100);
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
  public void test59() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test59");
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
      java.util.Set<String> strSet11 = schema9.getAliases();
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
  public void test60() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test60");
    org.apache.avro.Schema schema0 = null;
    org.apache.avro.Schema schema1 = org.apache.avro.Schema.createMap(schema0);
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<String> strList2 = schema1.getEnumSymbols();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.avro.Schema.toJson(java.util.Set, String, com.fasterxml.jackson.core.JsonGenerator)\" because \"this.valueType\" is null");
    } catch (NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(schema1);
  }

  @Test
  public void test61() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test61");
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
  public void test62() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test62");
    String[] strArray4 = new String[] { "union[long]" };
    java.util.ArrayList<String> strList5 = new java.util.ArrayList<String>();
    boolean boolean6 = java.util.Collections.addAll((java.util.Collection<String>) strList5, strArray4);
    // The following exception was thrown during execution in test generation
    try {
      org.apache.avro.Schema schema7 = org.apache.avro.Schema.createEnum("long", "hi!", "",
          (java.util.List<String>) strList5);
      org.junit.Assert.fail(
          "Expected exception of type org.apache.avro.AvroTypeException; message: Schemas may not be named after primitives: long");
    } catch (org.apache.avro.AvroTypeException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(strArray4);
    org.junit.Assert.assertArrayEquals(strArray4, new String[] { "union[long]" });
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
  }

  @Test
  public void test63() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test63");
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
  public void test64() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test64");
    org.apache.avro.Schema.Parser parser0 = new org.apache.avro.Schema.Parser();
    boolean boolean1 = parser0.getValidateDefaults();
    java.util.Map<String, org.apache.avro.Schema> strMap2 = parser0.getTypes();
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
  public void test65() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test65");
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
    String str7 = schema6.getFullName();
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
    java.util.function.BiConsumer<String, Object> strBiConsumer26 = null;
    schema23.forEachProperty(strBiConsumer26);
    String str28 = schema23.getDoc();
    boolean boolean29 = schema6.equals((Object) schema23);
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
  public void test66() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test66");
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
  public void test67() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test67");
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
      java.util.List<String> strList8 = schema5.getEnumSymbols();
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
  public void test68() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test68");
    org.apache.avro.Schema.Field[] fieldArray0 = new org.apache.avro.Schema.Field[] {};
    java.util.ArrayList<org.apache.avro.Schema.Field> fieldList1 = new java.util.ArrayList<org.apache.avro.Schema.Field>();
    boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.avro.Schema.Field>) fieldList1,
        fieldArray0);
    org.apache.avro.Schema schema3 = org.apache.avro.Schema
        .createRecord((java.util.List<org.apache.avro.Schema.Field>) fieldList1);
    Class<?> wildcardClass4 = schema3.getClass();
    org.junit.Assert.assertNotNull(fieldArray0);
    org.junit.Assert.assertArrayEquals(fieldArray0, new org.apache.avro.Schema.Field[] {});
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertNotNull(schema3);
    org.junit.Assert.assertNotNull(wildcardClass4);
  }

  @Test
  public void test69() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test69");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.NULL;
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.NULL + "'",
        type0.equals(org.apache.avro.Schema.Type.NULL));
  }

  @Test
  public void test70() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test70");
    // The following exception was thrown during execution in test generation
    try {
      Object obj1 = org.apache.avro.Schema.parseJsonToObject("union[long]");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.RuntimeException; message: com.fasterxml.jackson.core.JsonParseException: Unrecognized token 'union': was expecting (JSON String, Number, Array, Object or token 'null', 'true' or 'false')? at [Source: REDACTED (`StreamReadFeature.INCLUDE_SOURCE_IN_LOCATION` disabled); line: 1, column: 1]");
    } catch (RuntimeException e) {
      // Expected exception.
    }
  }

  @Test
  public void test71() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test71");
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
  public void test72() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test72");
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
    String str8 = type6.getName();
    boolean boolean9 = schema5.equals((Object) str8);
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
  public void test73() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test73");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.RECORD;
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.RECORD + "'",
        type0.equals(org.apache.avro.Schema.Type.RECORD));
  }

  @Test
  public void test74() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "RegressionTest0.test74");
    org.apache.avro.Schema.Type type0 = org.apache.avro.Schema.Type.FIXED;
    String str1 = type0.getName();
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.avro.Schema.Type.FIXED + "'",
        type0.equals(org.apache.avro.Schema.Type.FIXED));
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fixed" + "'", str1, "fixed");
  }
}
