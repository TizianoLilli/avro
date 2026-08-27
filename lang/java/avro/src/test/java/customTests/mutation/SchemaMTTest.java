package customTests.mutation;

import org.apache.avro.Schema;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SchemaMTTest {

  @Test
  public void TestComplexSchemaWFieldPropSerialization() {

    Schema original = Schema.createRecord("Artisan", "Works with wood", "Master", false);

    List<Schema.Field> fields = new ArrayList<>();
    Schema.Field name = new Schema.Field("Name", Schema.create(Schema.Type.STRING), "Name of the Artisan");
    Schema.Field experience = new Schema.Field("Experience", Schema.create(Schema.Type.INT), "Years of work");

    fields.add(name);
    fields.add(experience);

    original.setFields(fields);
    // aggiungo una prop ad un field, invece che allo schema
    name.addProp("Field Prop", "12-01-1999");

    // serialization
    String json = original.toString();
    // deserialization
    Schema parsed = new Schema.Parser().parse(json);

    Assert.assertEquals(original, parsed);
  }

  @Test
  public void TestComplexSchemaWDifferentDocAndAliasSerialization() {

    // durante il parsing sono mantenuti solo attributi rilevanti, come name e
    // namespace, ma non doc e alias
    Schema schema1 = Schema.createRecord("Schema", "doc", null, false);
    Schema schema2 = Schema.createRecord("Schema", "different doc", null, false);

    schema1.addAlias("Alias");
    schema2.addAlias("DifferentAlias");

    List<Schema.Field> firstFields = new ArrayList<>();
    Schema.Field firstField = new Schema.Field("Field", Schema.create(Schema.Type.STRING), "field documentation");

    firstFields.add(firstField);
    schema1.setFields(firstFields);

    List<Schema.Field> secondFields = new ArrayList<>();
    Schema.Field secondField = new Schema.Field("Field", Schema.create(Schema.Type.STRING),
        "another field documentation");

    secondFields.add(secondField);
    schema2.setFields(secondFields);

    firstField.addAlias("AliasField");
    secondField.addAlias("DifferentAliasField");

    // serialization
    String json1 = schema1.toString();
    String json2 = schema2.toString();
    // deserialization
    Schema parsed1 = new Schema.Parser().parse(json1);
    Schema parsed2 = new Schema.Parser().parse(json2);

    Assert.assertEquals(parsed1, parsed2);
    Assert.assertNotEquals(parsed1.getAliases(), parsed2.getAliases());
    Assert.assertNotEquals(parsed1.getField("Field").aliases(), parsed2.getField("Field").aliases());
    Assert.assertNotEquals(parsed1.getDoc(), parsed2.getDoc());
    Assert.assertNotEquals(parsed1.getField("Field").doc(), parsed2.getField("Field").doc());
  }

  @Test
  public void TestComplexSchemaWaliasForSchemaSerialization() {

    Schema original = Schema.createRecord("Artisan", "Works with wood", "Master", false);

    List<Schema.Field> fields = new ArrayList<>();
    Schema.Field name = new Schema.Field("Name", Schema.create(Schema.Type.STRING), "Name of the Artisan");
    Schema.Field experience = new Schema.Field("Experience", Schema.create(Schema.Type.INT), "Years of work");

    fields.add(name);
    fields.add(experience);

    original.setFields(fields);
    // aggiungo un alias allo schema, invece che ad un field
    original.addAlias("Craftsman");

    // serialization
    String json = original.toString();
    // deserialization
    Schema parsed = new Schema.Parser().parse(json);

    Assert.assertEquals(original, parsed);
  }
}
