package customTests.manual;

import org.apache.avro.SchemaParseException;
import org.apache.avro.AvroTypeException;
import org.apache.avro.NameValidator;
import org.apache.avro.ParseContext;
import org.apache.avro.Schema;
import org.apache.avro.util.SchemaResolver;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Collections;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class ParseContextUnitTest {

  private ParseContext ctx;

  @Mock
  NameValidator validator;

  @Mock
  NameValidator.Result ok;

  @Before
  public void setupTest() {
    ctx = new ParseContext(validator);
  }

  // TF01: combinazione (name = primitive, namespace = -, schema presence = -)
  @Test
  public void TestFindPrimitiveName() {

    Schema schema = Schema.create(Schema.Type.STRING);

    Schema result = ctx.find("string", null);

    Assert.assertEquals(schema, result);
  }

  // TF02: combinazione (name = simple, namespace = null, schema presence = yes)
  @Test
  public void TestFindSimpleNameNull() {

    Schema schema = Schema.createRecord("simple", null, null, false, Collections.emptyList());

    // se il namespace è null getFullName() mi restituisce solo il name

    Mockito.when(validator.validate("simple")).thenReturn(ok);
    Mockito.when(ok.isOK()).thenReturn(true);

    ctx.put(schema);
    Schema result = ctx.find("simple", null);

    Assert.assertSame(schema, result);
  }

  // TF03: combinazione (name = simple, namespace = not "", schema presence = yes)
  @Test
  public void TestFindSimpleNameNotEmptyPresent() {

    Schema schema = Schema.createRecord("simple", null, "explicit", false, Collections.emptyList());

    Mockito.when(validator.validate("simple")).thenReturn(ok);
    Mockito.when(validator.validate("explicit")).thenReturn(ok);

    Mockito.when(ok.isOK()).thenReturn(true);

    ctx.put(schema);
    Schema result = ctx.find("simple", "explicit");

    Assert.assertSame(schema, result);
  }

  // TF04: combinazione (name = simple, namespace = "", schema presence = no)
  @Test
  public void TestFindSimpleNameEmptyAbsent() {

    Schema schema = ctx.find("simple", "");

    Assert.assertTrue(SchemaResolver.isUnresolvedSchema(schema));
    Assert.assertEquals(".simple", SchemaResolver.getUnresolvedSchemaName(schema));
  }

  // TF05: combinazione (name = simple, namespace = "", schema presence = yes)
  @Test
  public void TestFindSimpleNameEmptyPresent() {

    Schema schema = Schema.createRecord("simple", null, "", false, Collections.emptyList());

    // se namespace = "", getFullName() mi restituisce solo name

    Mockito.when(validator.validate("simple")).thenReturn(ok);
    Mockito.when(ok.isOK()).thenReturn(true);

    ctx.put(schema);
    Schema simple = ctx.find("simple", "");

    Assert.assertSame(schema, simple);

  }

  // TF06: combinazione (name = fully qualified, namespace = -, schema presence =
  // yes)
  @Test
  public void TestFindFullyQualifiedNamePresent() {

    Schema schema = Schema.createRecord("a.full.Name", null, null, false, Collections.emptyList());

    Mockito.when(validator.validate("a")).thenReturn(ok);
    Mockito.when(validator.validate("full")).thenReturn(ok);
    Mockito.when(validator.validate("Name")).thenReturn(ok);
    Mockito.when(ok.isOK()).thenReturn(true);

    ctx.put(schema);
    // non mi interessa se lo schema si trovi in oldSchemas o newSchemas; sto
    // facendo test BB,
    // quindi non so neanche che esistono quelle mappe

    Schema result = ctx.find("a.full.Name", null);

    Assert.assertSame(schema, result);
  }

  // TF07: combinazione (name = fully qualified, namespace = -, schema presence =
  // no)
  @Test
  public void TestFindFullyQualifiedNameAbsent() {

    Schema schema = ctx.find("a.full.Name", null);

    Assert.assertTrue(SchemaResolver.isUnresolvedSchema(schema));
    Assert.assertEquals("a.full.Name", SchemaResolver.getUnresolvedSchemaName(schema));

  }

  // TF08: combinazione (name = "", namespace = null, schema presence = no)
  @Test
  public void TestFindEmptyNameNullAbsent() {

    Schema schema = ctx.find("", null);

    Assert.assertTrue(SchemaResolver.isUnresolvedSchema(schema));
    Assert.assertEquals("", SchemaResolver.getUnresolvedSchemaName(schema));

  }

  // TF09: combinazione (name = "", namespace = not "", schema presence = no)
  @Test
  public void TestFindEmptyNameNotEmptyAbsent() {

    Schema schema = ctx.find("", "explicit");

    Assert.assertTrue(SchemaResolver.isUnresolvedSchema(schema));
    Assert.assertEquals("explicit.", SchemaResolver.getUnresolvedSchemaName(schema));
  }

  // TF10: combinazione (name = "", namespace = "", presence = no)
  @Test
  public void TestFindEmptyNameEmptyAbsent() {

    Schema schema = ctx.find("", "");

    Assert.assertTrue(SchemaResolver.isUnresolvedSchema(schema));
    Assert.assertEquals(".", SchemaResolver.getUnresolvedSchemaName(schema));

  }

  // TP01: combinazione (schema = unnamed, presence = -, validator = -)
  @Test
  public void TestPutUnnamedSchema() {

    Schema schema = ctx.find("string", null);

    // in ctx posso mettere solo schemi named, altrimenti viene lanciata
    // un'eccezione
    Assert.assertThrows(AvroTypeException.class, () -> ctx.put(schema));
  }

  // TP02: combinazione (schema = named, presence = absent, validator = valid)
  @Test
  public void TestPutNamedSchemaIfNotExisting() {

    Schema schema = Schema.createRecord("a.full.Name", null, null, false, Collections.emptyList());

    Mockito.when(validator.validate("a")).thenReturn(ok);
    Mockito.when(validator.validate("full")).thenReturn(ok);
    Mockito.when(validator.validate("Name")).thenReturn(ok);
    Mockito.when(ok.isOK()).thenReturn(true);

    ctx.put(schema);

    Schema result = ctx.find("a.full.Name", null);
    Assert.assertSame(schema, result);
  }

  // TP03: combinazione (schema = named, presence = same name same schema,
  // validator = valid)
  @Test
  public void TestPutNamedSchemaIfExistingSame() {

    Schema schema = Schema.createRecord("a.full.Name", null, null, false, Collections.emptyList());

    Mockito.when(validator.validate("a")).thenReturn(ok);
    Mockito.when(validator.validate("full")).thenReturn(ok);
    Mockito.when(validator.validate("Name")).thenReturn(ok);
    Mockito.when(ok.isOK()).thenReturn(true);

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

    Mockito.when(validator.validate("a")).thenReturn(ok);
    Mockito.when(validator.validate("full")).thenReturn(ok);
    Mockito.when(validator.validate("Name")).thenReturn(ok);
    Mockito.when(ok.isOK()).thenReturn(true);

    Schema differentSchema = Schema.createEnum("a.full.Name", null, null, Collections.emptyList());

    Assert.assertThrows(SchemaParseException.class, () -> {
      ctx.put(schema);
      ctx.put(differentSchema);
    });
  }

  // TP05: combinazione (schema = named, presence = -, validator = invalid)
  @Test
  public void TestPutInvalidName() {

    Schema schema = Schema.createRecord("lunedì", null, null, false, Collections.emptyList());

    NameValidator.Result error = Mockito.mock(NameValidator.Result.class);

    // Visto che posso passare un validator arbitrario a ParseContext questo può
    // decidere di non validare una stringa
    // ritenuta valida durante l'istanziazione dello schema (createRecord fa già un
    // controllo sul nome durante la
    // creazione). L'unico metodo di ParseContext che usa validate() è put()
    Mockito.when(validator.validate("lunedì")).thenReturn(error);
    Mockito.when(error.isOK()).thenReturn(false);
    Mockito.when(error.getErrors()).thenReturn("Invalid name");

    Assert.assertThrows(SchemaParseException.class, () -> ctx.put(schema));
  }

  // TR01: combinazione (schema = known, resolved schemas = all, context =
  // committed)
  @Test
  public void TestResolveKnown() {

    Schema schema = Schema.createRecord("simple", null, "explicit", false, Collections.emptyList());

    Mockito.when(validator.validate("simple")).thenReturn(ok);
    Mockito.when(validator.validate("explicit")).thenReturn(ok);

    Mockito.when(validator.validate("org")).thenReturn(ok);
    Mockito.when(validator.validate("apache")).thenReturn(ok);
    Mockito.when(validator.validate("avro")).thenReturn(ok);
    Mockito.when(validator.validate("compiler")).thenReturn(ok);
    Mockito.when(validator.validate("UnresolvedSchema_0")).thenReturn(ok);

    Mockito.when(ok.isOK()).thenReturn(true);

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

    Mockito.when(validator.validate("simple")).thenReturn(ok);
    Mockito.when(validator.validate("explicit")).thenReturn(ok);

    Mockito.when(validator.validate("org")).thenReturn(ok);
    Mockito.when(validator.validate("apache")).thenReturn(ok);
    Mockito.when(validator.validate("avro")).thenReturn(ok);
    Mockito.when(validator.validate("compiler")).thenReturn(ok);
    Mockito.when(validator.validate("UnresolvedSchema_0")).thenReturn(ok);

    Mockito.when(ok.isOK()).thenReturn(true);

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

    Mockito.when(validator.validate("org")).thenReturn(ok);
    Mockito.when(validator.validate("apache")).thenReturn(ok);
    Mockito.when(validator.validate("avro")).thenReturn(ok);
    Mockito.when(validator.validate("compiler")).thenReturn(ok);
    Mockito.when(validator.validate("UnresolvedSchema_0")).thenReturn(ok);

    Mockito.when(ok.isOK()).thenReturn(true);

    ctx.put(uncommitted);

    // per prima cosa resolve() verifica se tutti gli schemi nel contesto sono
    // committed,
    // poi se sono risolti e solo infine verifica se lo schema che riceve come
    // parametro è risolvibile

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

    Mockito.when(validator.validate("org")).thenReturn(ok);
    Mockito.when(validator.validate("apache")).thenReturn(ok);
    Mockito.when(validator.validate("avro")).thenReturn(ok);
    Mockito.when(validator.validate("compiler")).thenReturn(ok);
    Mockito.when(validator.validate("UnresolvedSchema_0")).thenReturn(ok);

    Mockito.when(ok.isOK()).thenReturn(true);

    ctx.put(unresolved);
    ctx.commit();

    Schema toResolve = ctx.find("string", null);

    // viene lanciata una AvroTypeException: Undefined schema: explicit.simple
    Assert.assertThrows(AvroTypeException.class, () -> ctx.resolve(toResolve));
  }
}
