package customTests.LLM;

import org.apache.avro.AvroRuntimeException;
import org.apache.avro.Schema;
import org.apache.avro.Schema.Field;
import org.apache.avro.Schema.Field.Order;
import org.apache.avro.SchemaParseException;
import org.apache.avro.AvroTypeException;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;
import static org.junit.Assert.assertNotNull;

public class SchemaLLMzsTest {

  @Test
  public void testCreatePrimitiveSchemas() {
    assertEquals(Schema.Type.STRING, Schema.create(Schema.Type.STRING).getType());
    assertEquals(Schema.Type.INT, Schema.create(Schema.Type.INT).getType());
    assertEquals(Schema.Type.NULL, Schema.create(Schema.Type.NULL).getType());
  }

  @Test(expected = AvroRuntimeException.class)
  public void testCreateNonPrimitiveTypeThrows() {
    Schema.create(Schema.Type.RECORD);
  }

  @Test
  public void testRecordFieldsAndSetFieldsOnlyOnce() {
    Schema record = Schema.createRecord("R", null, null, false);
    Field field = new Field("f", Schema.create(Schema.Type.STRING));

    record.setFields(Collections.singletonList(field));

    assertTrue(record.hasFields());
    assertEquals(field, record.getField("f"));
    assertEquals(0, record.getField("f").pos());

    try {
      record.setFields(Collections.singletonList(new Field("other", Schema.create(Schema.Type.INT))));
      fail("Expected exception");
    } catch (AvroRuntimeException e) {
      assertTrue(e.getMessage().contains("already set"));
    }
  }

  @Test
  public void testDuplicateFieldNamesThrowException() {
    Schema record = Schema.createRecord("R", null, null, false);

    Field f1 = new Field("dup", Schema.create(Schema.Type.STRING));
    Field f2 = new Field("dup", Schema.create(Schema.Type.INT));

    try {
      record.setFields(Arrays.asList(f1, f2));
      fail("Expected exception");
    } catch (AvroRuntimeException e) {
      assertTrue(e.getMessage().contains("Duplicate field"));
    }
  }

  @Test
  public void testEnumOperations() {
    Schema e = Schema.createEnum("MyEnum", null, null, Arrays.asList("A", "B"), "A");

    assertEquals(Arrays.asList("A", "B"), e.getEnumSymbols());
    assertEquals("A", e.getEnumDefault());
    assertTrue(e.hasEnumSymbol("A"));
    assertFalse(e.hasEnumSymbol("Z"));
    assertEquals(1, e.getEnumOrdinal("B"));
  }

  @Test
  public void testEnumOrdinalUnknownSymbolThrows() {
    Schema e = Schema.createEnum("MyEnum", null, null, Arrays.asList("A", "B"));

    try {
      e.getEnumOrdinal("X");
      fail("Expected exception");
    } catch (Exception ex) {
      assertTrue(ex.getCause() instanceof AvroTypeException || ex instanceof AvroTypeException);
    }
  }

  @Test(expected = SchemaParseException.class)
  public void testEnumDefaultMustBeExistingSymbol() {
    Schema.createEnum("MyEnum", null, null, Arrays.asList("A", "B"), "Z");
  }

  @Test
  public void testArrayMapAndUnionAccessors() {
    Schema stringSchema = Schema.create(Schema.Type.STRING);

    Schema array = Schema.createArray(stringSchema);
    assertEquals(stringSchema, array.getElementType());

    Schema map = Schema.createMap(stringSchema);
    assertEquals(stringSchema, map.getValueType());

    Schema union = Schema.createUnion(Schema.create(Schema.Type.NULL), stringSchema);

    assertTrue(union.isUnion());
    assertTrue(union.isNullable());
    assertEquals(2, union.getTypes().size());
    assertNotNull(union.getIndexNamed("null"));
    assertNotNull(union.getIndexNamed("string"));
  }

  @Test
  public void testNullableForNonUnionSchemas() {
    assertTrue(Schema.create(Schema.Type.NULL).isNullable());
    assertFalse(Schema.create(Schema.Type.STRING).isNullable());
  }

  @Test
  public void testFieldAliasesAndDefaultValue() {
    Field field = new Field("name", Schema.create(Schema.Type.STRING), "doc", "default", Order.DESCENDING);

    field.addAlias("alias1");
    field.addAlias("alias2");

    assertTrue(field.hasDefaultValue());
    assertEquals("default", field.defaultVal());
    assertEquals(Order.DESCENDING, field.order());
    assertTrue(field.aliases().contains("alias1"));
    assertTrue(field.aliases().contains("alias2"));
  }

  @Test
  public void testNamedSchemaAliases() {
    Schema record = Schema.createRecord("RecordName", null, "ns", false);

    record.addAlias("Alias");
    assertTrue(record.getAliases().contains("ns.Alias"));
  }

  @Test
  public void testSchemaEqualityAndHashCode() {
    Schema s1 = Schema.create(Schema.Type.STRING);
    Schema s2 = Schema.create(Schema.Type.STRING);
    Schema s3 = Schema.create(Schema.Type.INT);

    assertEquals(s1, s2);
    assertEquals(s1.hashCode(), s2.hashCode());
    assertNotEquals(s1, s3);
  }
}
