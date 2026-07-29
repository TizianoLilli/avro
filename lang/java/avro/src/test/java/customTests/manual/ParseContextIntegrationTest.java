package customTests.manual;

import org.apache.avro.AvroTypeException;
import org.apache.avro.NameValidator;
import org.apache.avro.ParseContext;
import org.apache.avro.Schema;
import org.apache.avro.SchemaParseException;
import org.apache.avro.util.SchemaResolver;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;
import java.util.Map;

public class ParseContextIntegrationTest {

  private ParseContext ctx;

  @Before
  public void setupTest() {
    ctx = new ParseContext();
  }

  // TF02: combinazione (name = simple, namespace = null, schema presence = yes)
  @Test
  public void TestFindSimpleNameNull() {

    Schema schema = Schema.createRecord("simple", null, null, false, Collections.emptyList());

    // se il namespace è null getFullName() mi restituisce solo il name

    ctx.put(schema);
    Schema result = ctx.find("simple", null);

    Assert.assertSame(schema, result);
  }

  // TF03: combinazione (name = simple, namespace = not "", schema presence = yes)
  @Test
  public void TestFindSimpleNameNotEmptyPresent() {

    Schema schema = Schema.createRecord("simple", null, "explicit", false, Collections.emptyList());

    ctx.put(schema);
    Schema result = ctx.find("simple", "explicit");

    Assert.assertSame(schema, result);
  }

  // TF05: combinazione (name = simple, namespace = "", schema presence = yes)
  @Test
  public void TestFindSimpleNameEmptyPresent() {

    Schema schema = Schema.createRecord("simple", null, "", false, Collections.emptyList());

    // se namespace = "", getFullName() mi restituisce solo name

    ctx.put(schema);
    Schema simple = ctx.find("simple", "");

    Assert.assertSame(schema, simple);

  }

  // TF06: combinazione (name = fully qualified, namespace = -, schema presence =
  // yes)
  @Test
  public void TestFindFullyQualifiedNamePresent() {

    Schema schema = Schema.createRecord("a.full.Name", null, null, false, Collections.emptyList());

    ctx.put(schema);
    // non mi interessa se lo schema si trovi in oldSchemas o newSchemas; sto
    // facendo test BB,
    // quindi non so neanche che esistono quelle mappe

    Schema result = ctx.find("a.full.Name", null);

    Assert.assertSame(schema, result);
  }

  // TP02: combinazione (schema = named, presence = absent, validator = valid)
  @Test
  public void TestPutNamedSchemaIfNotExisting() {

    Schema schema = Schema.createRecord("a.full.Name", null, null, false, Collections.emptyList());

    ctx.put(schema);

    Schema result = ctx.find("a.full.Name", null);
    Assert.assertSame(schema, result);
  }

  // TP03: combinazione (schema = named, presence = same name same schema,
  // validator = valid)
  @Test
  public void TestPutNamedSchemaIfExistingSame() {

    Schema schema = Schema.createRecord("a.full.Name", null, null, false, Collections.emptyList());

    ctx.put(schema);
    ctx.put(schema);

    Map<String, Schema> schemas = ctx.typesByName();

    Assert.assertTrue(schemas.containsKey("a.full.Name"));
    Assert.assertEquals(1, schemas.size());

  }

  // TP04: combinazione (schema = named, presence = same name different schema,
  // validator = valid)
  @Test
  public void TestPutNamedSchemaIfExistingDifferent() {

    Schema schema = Schema.createRecord("a.full.Name", null, null, false, Collections.emptyList());

    Schema differentSchema = Schema.createEnum("a.full.Name", null, null, Collections.emptyList());

    Assert.assertThrows(SchemaParseException.class, () -> {
      ctx.put(schema);
      ctx.put(differentSchema);
    });
  }

  // TP05: combinazione (schema = named, presence = -, validator = invalid)
  @Test
  public void TestPutInvalidName() {

    ParseContext strict = new ParseContext(NameValidator.STRICT_VALIDATOR);
    Schema schema = Schema.createRecord("lunedì", null, null, false, Collections.emptyList());

    // valido per UTF_VALIDATOR ma non per STRICT_VALIDATOR

    Assert.assertThrows(SchemaParseException.class, () -> strict.put(schema));
  }

  // TR01: combinazione (schema = known, resolved schemas = all, context =
  // committed)
  @Test
  public void TestResolveKnown() {

    Schema schema = Schema.createRecord("simple", null, "explicit", false, Collections.emptyList());

    Schema unresolved = ctx.find("simple", "explicit");

    Assert.assertTrue(SchemaResolver.isUnresolvedSchema(unresolved));
    Assert.assertEquals("explicit.simple", SchemaResolver.getUnresolvedSchemaName(unresolved));

    ctx.put(unresolved);
    ctx.put(schema);
    ctx.commit();
    Schema resolved = ctx.resolve(unresolved);

    // uso assertEquals() perché non mi viene restituito lo stesso schema risolto
    // che ho inserito con il put()
    // ma ne viene creato uno nuovo
    Assert.assertEquals(schema, resolved);
  }

  // TR02: combinazione (schema = unknown, resolved schemas = all, context =
  // committed)
  @Test
  public void TestResolveUnknown() {

    Schema schema = Schema.createRecord("simple", null, "explicit", false, Collections.emptyList());

    Schema unresolved = ctx.find("simple", "explicit");

    Assert.assertTrue(SchemaResolver.isUnresolvedSchema(unresolved));
    Assert.assertEquals("explicit.simple", SchemaResolver.getUnresolvedSchemaName(unresolved));

    ctx.put(schema);
    ctx.commit();

    // otterrei un NullPointerException: Unknown schema: explicit.simple
    // non essendo presente nel contesto questo stesso schema unresolved (e non la
    // sua resolved reference!)
    Assert.assertThrows(NullPointerException.class, () -> ctx.resolve(unresolved));
  }

  // TR03: combinazione (schema = -, resolved schemas = -, context = uncommitted)
  @Test
  public void TestResolveNotFullyCommitted() {

    Schema uncommitted = ctx.find("simple", "explicit");

    Assert.assertTrue(SchemaResolver.isUnresolvedSchema(uncommitted));
    Assert.assertEquals("explicit.simple", SchemaResolver.getUnresolvedSchemaName(uncommitted));

    ctx.put(uncommitted);

    Schema unresolved = ctx.find("string", null);
    Assert.assertThrows(IllegalStateException.class, () -> ctx.resolve(unresolved));
  }

  // TR04: combinazione (schema = -, resolved schema = not all, context =
  // committed)
  @Test
  public void TestResolveNotAllResolved() {
    Schema unresolved = ctx.find("simple", "explicit");

    Assert.assertTrue(SchemaResolver.isUnresolvedSchema(unresolved));
    Assert.assertEquals("explicit.simple", SchemaResolver.getUnresolvedSchemaName(unresolved));

    ctx.put(unresolved);
    ctx.commit();

    Schema toResolve = ctx.find("string", null);

    // viene lanciata una AvroTypeException: Undefined schema: explicit.simple
    Assert.assertThrows(AvroTypeException.class, () -> ctx.resolve(toResolve));
  }

}
