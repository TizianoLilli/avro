package customTests.manual;

import org.apache.avro.AvroRuntimeException;
import org.apache.avro.Schema;
import org.apache.avro.SchemaParseException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SchemaBBTest {

  Schema primitiveSchema;

  Schema emptyRecord;
  Schema emptyRecordWFields;

  @Before
  public void setup() {
    primitiveSchema = Schema.create(Schema.Type.STRING);

    emptyRecord = Schema.createRecord(null, null, null, false);
    emptyRecordWFields = Schema.createRecord(null, null, null, false, Collections.emptyList());
  }

  // TF01: combinazione (schema type = primitive, old fields presence = no, fields
  // = -)
  @Test
  public void TestSetFieldsToPrimitiveSchema() {
    // è possibile assegnare dei fields solo a dei record schema
    Assert.assertThrows(AvroRuntimeException.class, () -> primitiveSchema.setFields(Collections.emptyList()));
  }

  // TF02: combinazione (schema type = complex, old fields presence = no, fields =
  // null)
  @Test
  public void TestSetFieldsNullToComplexSchema() {
    Schema schema = Schema.createRecord("Artisan", "Works with wood", "Master", false);

    // viene chiamato fields.size() dove però fields è null
    Assert.assertThrows(NullPointerException.class, () -> schema.setFields(null));
  }

  // TF03: combinazione (schema type = complex, old fields presence = no, fields =
  // empty)
  @Test
  public void TestSetFieldsEmptyToComplexSchema() {
    Schema schema = Schema.createRecord("Artisan", "Works with wood", "Master", false);

    schema.setFields(new ArrayList<>());
    List<Schema.Field> fields = schema.getFields();

    // controllo che la lista sia vuota, ovvero che abbia size = 0
    Assert.assertEquals(0, fields.size());
  }

  // TF04: combinazione (schema type = complex, old fields presence = no, fields =
  // same name)
  @Test
  public void TestSetFieldsToComplexSchemaSameNameField() {
    Schema schema = Schema.createRecord("Artisan", "Works with wood", "Master", false);

    List<Schema.Field> fields = new ArrayList<>();
    Schema.Field name = new Schema.Field("Name", Schema.create(Schema.Type.STRING), "Name of the Artisan");
    Schema.Field secondName = new Schema.Field("Name", Schema.create(Schema.Type.STRING), "Name of the Artisan");

    fields.add(name);
    fields.add(secondName);

    // non è possibile aggiungere field con lo stesso nome; l'operazione non è
    // idempotente
    Assert.assertThrows(AvroRuntimeException.class, () -> schema.setFields(fields));
  }

  // TF05: combinazione (schema type = complex, old fields presence = no, fields =
  // same name but one is nested)
  @Test
  public void TestSetFieldsToComplexSchemaSameNameFieldNested() {
    Schema schema = Schema.createRecord("Artisan", "Works with wood", "Master", false);
    Schema nestedRecord = Schema.createRecord("Container", "Contains field w same name Name", null, false);

    List<Schema.Field> nestedFields = new ArrayList<>();
    Schema.Field artisanName = new Schema.Field("Name", Schema.create(Schema.Type.STRING), "Name of the Artisan");
    nestedFields.add(artisanName);

    nestedRecord.setFields(nestedFields);

    List<Schema.Field> fields = new ArrayList<>();
    Schema.Field name = new Schema.Field("Name", Schema.create(Schema.Type.STRING), "Name of the Artisan");
    Schema.Field nested = new Schema.Field("Nested", nestedRecord);

    fields.add(name);
    fields.add(nested);

    schema.setFields(fields);
    // verifico che due field possono avere stesso nome solo se non si trovano allo
    // stesso livello di annidamento
    Assert.assertEquals(schema.getField("Name"), schema.getField("Nested").schema().getField("Name"));
  }

  // TF06: combinazione (schema type = complex, old fields presence = no, fields =
  // different)
  @Test
  public void TestSetFieldsToComplexSchema() {
    Schema schema = Schema.createRecord("Artisan", "Works with wood", "Master", false);

    List<Schema.Field> fields = new ArrayList<>();
    Schema.Field name = new Schema.Field("Name", Schema.create(Schema.Type.STRING), "Name of the Artisan");
    Schema.Field experience = new Schema.Field("Experience", Schema.create(Schema.Type.INT), "Years of work");

    fields.add(name);
    fields.add(experience);

    schema.setFields(fields);

    Assert.assertEquals(name, schema.getField("Name"));
    Assert.assertEquals(experience, schema.getField("Experience"));
  }

  // TF07: combinazione (schema type = complex, old fields presence = yes, fields
  // = -)
  @Test
  public void TestSetFieldsMoreThanOnceToComplexSchema() {
    emptyRecord.setFields(Collections.emptyList());
    Assert.assertThrows(AvroRuntimeException.class, () -> emptyRecord.setFields(Collections.emptyList()));
  }

  // TP01: combinazione (schema type = primitive, prop presence = no, name = not
  // empty, value (string) = not empty)
  @Test
  public void TestAddNewProp() {
    primitiveSchema.addProp("description", "emptyProp");

    Assert.assertEquals("emptyProp", primitiveSchema.getProp("description"));
  }

  // TP02: combinazione (schema type = complex, prop presence = same, name = not
  // empty, value (string) = not empty)
  @Test
  public void TestAddSameProp() {
    emptyRecord.addProp("description", "emptyProp");

    // è un'operazione idempotente
    emptyRecord.addProp("description", "emptyProp");
  }

  // TP03: combinazione (schema type = complex, prop presence = different w same
  // name, name = not empty, value (string) = not empty)
  @Test
  public void TestAddDifferentPropsWSameName() {
    emptyRecord.addProp("description", "emptyProp");

    // è illegale aggiungere una prop con stesso nome ma valore differente
    Assert.assertThrows(AvroRuntimeException.class, () -> emptyRecord.addProp("description", "newEmptyProp"));
  }

  // TP04: combinazione (schema type = complex, prop presence = no, name = empty,
  // value (string) = empty)
  @Test
  public void TestAddPropEmpty() {
    emptyRecord.addProp("", "");

    Assert.assertEquals("", emptyRecord.getProp(""));
  }

  // TP05: combinazione (schema type = complex, prop presence = -, name = null,
  // value (string) = not empty)
  @Test
  public void TestAddPropNullName() {
    Assert.assertThrows(NullPointerException.class, () -> emptyRecord.addProp(null, "value"));
  }

  // TP06: combinazione (schema type = complex, prop presence = -, name = not
  // empty, value (string) = null)
  @Test
  public void TestAddPropNullValue() {
    Assert.assertThrows(AvroRuntimeException.class, () -> emptyRecord.addProp("name", null));
  }

  // TSP01: combinazione (schema type = primitive, props = -, fields = absent)
  @Test
  public void TestPrimitiveSchemaSerialization() {

    primitiveSchema.addProp("Creation Date", "12-01-1999");
    // serialization
    String json = primitiveSchema.toString();
    // deserialization
    Schema parsed = new Schema.Parser().parse(json);

    Assert.assertEquals(primitiveSchema, parsed);
  }

  // TSP02: combinazione (schema type = complex, props = not empty, fields = not
  // empty)
  @Test
  public void TestComplexSchemaSerialization() {

    Schema original = Schema.createRecord("Artisan", "Works with wood", "Master", false);

    List<Schema.Field> fields = new ArrayList<>();
    fields.add(new Schema.Field("Name", Schema.create(Schema.Type.STRING), "Name of the Artisan"));
    fields.add(new Schema.Field("Experience", Schema.create(Schema.Type.INT), "Years of work"));

    original.setFields(fields);
    original.addProp("Creation Date", "12-01-1999");

    // serialization
    String json = original.toString();
    // deserialization
    Schema parsed = new Schema.Parser().parse(json);

    Assert.assertEquals(original, parsed);
  }

  // TSP03: combinazione (schema type = complex, props = not empty, fields =
  // absent)
  @Test
  public void TestComplexSchemaWoutFieldsSerialization() {

    Schema original = Schema.createRecord("Artisan", "Works with wood", "Master", false);
    original.addProp("Creation Date", "12-01-1999");

    // serialization
    String json = original.toString();
    // deserialization
    Assert.assertThrows(SchemaParseException.class, () -> new Schema.Parser().parse(json));
  }

  // TSP04: combinazione (schema type = complex, props = absent, fields = not
  // empty)
  @Test
  public void TestComplexSchemaWoutPropSerialization() {

    Schema original = Schema.createRecord("Artisan", "Works with wood", "Master", false);

    List<Schema.Field> fields = new ArrayList<>();
    fields.add(new Schema.Field("Name", Schema.create(Schema.Type.STRING), "Name of the Artisan"));
    fields.add(new Schema.Field("Experience", Schema.create(Schema.Type.INT), "Years of work"));

    original.setFields(fields);

    // serialization
    String json = original.toString();
    // deserialization
    Schema parsed = new Schema.Parser().parse(json);

    Assert.assertEquals(original, parsed);
  }

  // TSP05: combinazione (schema type = complex, props = -, fields = empty)
  @Test
  public void TestComplexSchemaWEmptyFieldsSerialization() {

    Schema original = Schema.createRecord("Artisan", "Works with wood", "Master", false);

    List<Schema.Field> fields = new ArrayList<>();

    original.setFields(fields);
    original.addProp("Creation Date", "12-01-1999");

    // serialization
    String json = original.toString();
    // deserialization
    Schema parsed = new Schema.Parser().parse(json);

    Assert.assertEquals(original, parsed);
  }

  // TSP06: combinazione (schema type = empty complex, props = -, fields = -)
  @Test
  public void TestComplexSchemaEmptySerialization() {
    // serialization
    String json = emptyRecord.toString();
    // deserialization: can't parse schemas without name
    Assert.assertThrows(SchemaParseException.class, () -> new Schema.Parser().parse(json));
  }

  // TSP07: combinazione (schema type = nested complex, props = not empty, fields
  // = not empty)
  @Test
  public void TestComplexSchemaSerializationNested() {

    Schema original = Schema.createRecord("Artisan", "Works with wood", "Master", false);
    Schema nestedSchema = Schema.createRecord("CoWorkers", "Artisan co-workers", null, false);

    List<Schema.Field> nestedFields = new ArrayList<>();
    nestedFields.add(new Schema.Field("CoName", Schema.create(Schema.Type.STRING), "Name of co-worker 1"));
    nestedSchema.setFields(nestedFields);

    List<Schema.Field> fields = new ArrayList<>();
    fields.add(new Schema.Field("Name", Schema.create(Schema.Type.STRING), "Name of the Artisan"));
    fields.add(new Schema.Field("Experience", Schema.create(Schema.Type.INT), "Years of work"));
    fields.add(new Schema.Field("Other", nestedSchema));

    original.setFields(fields);
    original.addProp("Creation Date", "12-01-1999");

    // serialization
    String json = original.toString();
    // deserialization
    Schema parsed = new Schema.Parser().parse(json);

    Assert.assertEquals(original, parsed);
  }
}
