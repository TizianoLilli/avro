package customTests.randoop.generated;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest100 {

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
}
