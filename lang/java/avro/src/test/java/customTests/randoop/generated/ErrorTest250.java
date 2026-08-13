package customTests.randoop.generated;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest250 {

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
  public void test1() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ErrorTest0.test1");
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
    java.util.Set<String> strSet12 = schema10.getAliases();
    String str13 = schema10.toString();
    org.apache.avro.Schema.Field field15 = schema10.getField("long");
    java.util.List<org.apache.avro.Schema.Field> fieldList16 = schema10.getFields();
    schema10.addAlias("long");
    boolean boolean20 = schema10.propsContainsKey("record");
    java.util.Map<String, Object> strMap21 = schema10.getObjectProps();
    // during test generation this statement threw an exception of type
    // java.lang.NullPointerException in error
    parseContext1.put(schema10);
  }

  @Test
  public void test2() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ErrorTest0.test2");
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
    org.apache.avro.Schema schema12 = org.apache.avro.Schema.createRecord("long", "{\"type\":\"record\",\"fields\":[]}",
        "long", true);
    // during test generation this statement threw an exception of type
    // java.lang.NullPointerException in error
    org.apache.avro.Schema schema13 = parseContext1.resolve(schema12);
  }

  @Test
  public void test3() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ErrorTest0.test3");
    org.apache.avro.ParseContext parseContext0 = new org.apache.avro.ParseContext();
    boolean boolean1 = parseContext0.hasNewSchemas();
    java.util.List<org.apache.avro.Schema> schemaList2 = parseContext0.resolveAllSchemas();
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
    boolean boolean13 = schema6.hasFields();
    boolean boolean14 = schema6.hasFields();
    // during test generation this statement threw an exception of type
    // java.lang.NullPointerException in error
    parseContext0.put(schema6);
  }

  @Test
  public void test4() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ErrorTest0.test4");
    org.apache.avro.ParseContext parseContext0 = new org.apache.avro.ParseContext();
    boolean boolean1 = parseContext0.hasNewSchemas();
    // during test generation this statement threw an exception of type
    // java.lang.NullPointerException in error
    org.apache.avro.Schema schema4 = parseContext0.find("{\"type\":\"record\",\"fields\":[]}", "fixed");
  }

  @Test
  public void test5() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ErrorTest0.test5");
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
    // during test generation this statement threw an exception of type
    // java.lang.NullPointerException in error
    parseContext0.put(schema31);
  }

  @Test
  public void test6() throws Throwable {
    if (debug)
      System.out.format("%n%s%n", "ErrorTest0.test6");
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
    boolean boolean9 = schema3.isError();
    org.apache.avro.Schema.Parser parser10 = new org.apache.avro.Schema.Parser();
    java.util.Map<String, org.apache.avro.Schema> strMap11 = parser10.getTypes();
    org.apache.avro.Schema.Parser parser12 = new org.apache.avro.Schema.Parser();
    java.util.Map<String, org.apache.avro.Schema> strMap13 = parser12.getTypes();
    org.apache.avro.Schema.Parser parser14 = parser10.addTypes(strMap13);
    org.apache.avro.Schema.Parser parser16 = parser10.setValidateDefaults(true);
    org.apache.avro.ParseContext parseContext17 = new org.apache.avro.ParseContext();
    boolean boolean18 = parseContext17.hasNewSchemas();
    java.util.List<org.apache.avro.Schema> schemaList19 = parseContext17.resolveAllSchemas();
    org.apache.avro.Schema.Parser parser20 = parser10.addTypes((Iterable<org.apache.avro.Schema>) schemaList19);
    String str22 = schema3.toString((java.util.Collection<org.apache.avro.Schema>) schemaList19, false);
    // during test generation this statement threw an exception of type
    // java.lang.NullPointerException in error
    schema3.addAlias("long", "{\"type\":\"record\",\"fields\":[]}");
  }
}
