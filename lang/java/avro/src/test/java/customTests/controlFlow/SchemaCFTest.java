package customTests.controlFlow;

import org.apache.avro.AvroRuntimeException;
import org.apache.avro.Schema;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SchemaCFTest {

  @Test
  public void TestSetFieldsToComplexSchemasSharingField() {
    Schema firstSchema = Schema.createRecord("First", "First schema", null, false);
    Schema secondSchema = Schema.createRecord("Second", "Second schema", null, false);

    List<Schema.Field> fields = new ArrayList<>();
    Schema.Field name = new Schema.Field("Name", Schema.create(Schema.Type.STRING));

    fields.add(name);

    firstSchema.setFields(fields);
    // non è possibile riutilizzare field di altri schemi
    Assert.assertThrows(AvroRuntimeException.class, () -> secondSchema.setFields(fields));
  }

  @Test
  public void TestComplexSchemaErrorSerialization() {

    // error field settato a true
    Schema original = Schema.createRecord("Artisan", "Works with wood", "Master", true);

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

  @Test
  public void TestComplexSchemaWaliasSerialization() {

    Schema original = Schema.createRecord("Artisan", "Works with wood", "Master", false);

    List<Schema.Field> fields = new ArrayList<>();
    Schema.Field name = new Schema.Field("Name", Schema.create(Schema.Type.STRING), "Name of the Artisan");
    Schema.Field experience = new Schema.Field("Experience", Schema.create(Schema.Type.INT), "Years of work");

    fields.add(name);
    fields.add(experience);

    original.setFields(fields);
    original.addProp("Creation Date", "12-01-1999");
    name.addAlias("Craft-man");

    // serialization
    String json = original.toString();
    // deserialization
    Schema parsed = new Schema.Parser().parse(json);

    Assert.assertEquals(original, parsed);
  }

}
