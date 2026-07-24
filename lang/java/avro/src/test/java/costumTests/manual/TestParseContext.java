package costumTests.manual;

import org.apache.avro.*;
import org.apache.avro.util.SchemaResolver;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.mockito.internal.matchers.Any;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;

import javax.inject.Qualifier;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.mockito.Mockito.mock;

@RunWith(MockitoJUnitRunner.class)
public class TestParseContext {

  private ParseContext ctx;

  @Mock
  private Schema schema;

  @Before
  public void setupTest(){
    ctx = new ParseContext();
  }

  @Test
  public void TestFindPrimitiveName(){

    try (MockedStatic<Schema> mocked = Mockito.mockStatic(Schema.class)){

      mocked.when(() -> Schema.create(Schema.Type.STRING)).thenReturn(schema);
      Schema result = ctx.find("string", null);

      Assert.assertSame(schema, result);

      mocked.verify(() -> Schema.create(Schema.Type.STRING));
    }
  }

  //combinazione (name = simple, namespace = null, presence = yes)
  @Test
  public void TestFindSimpleNameNull(){

    Mockito.when(schema.getType()).thenReturn(Schema.Type.RECORD);
    // se il namespace è null getFullName() mi restituisce solo il name
    Mockito.when(schema.getFullName()).thenReturn("simple");

    ctx.put(schema);
    Schema result = ctx.find("simple", null);

    Assert.assertSame(schema, result);
  }

  //combinazione (name = simple, namespace = not "", presence = yes)
  @Test
  public void TestFindSimpleNameNotEmptyPresent(){

    Mockito.when(schema.getType()).thenReturn(Schema.Type.RECORD);
    Mockito.when(schema.getFullName()).thenReturn("explicit.simple");

    ctx.put(schema);
    Schema result = ctx.find("simple", "explicit");

    Assert.assertSame(schema, result);
  }

  //combinazione (name = simple, namespace = "", presence = no)
  @Test
  public void TestFindSimpleNameEmptyAbsent(){

    try (MockedStatic<SchemaResolver> mocked = Mockito.mockStatic(SchemaResolver.class)){
      mocked.when(() -> SchemaResolver.unresolvedSchema(".simple")).thenReturn(schema);
      Schema result = ctx.find("simple", "");

      Assert.assertSame(schema, result);
      mocked.verify(() -> SchemaResolver.unresolvedSchema(".simple"));
    }
  }

  //combinazione (name = simple, namespace = "", presence = yes)
  @Test
  public void TestFindSimpleNameEmptyPresent(){

    // se namespace = "", getFullName() mi restituisce solo name
    Mockito.when(schema.getType()).thenReturn(Schema.Type.RECORD);
    Mockito.when(schema.getFullName()).thenReturn("simple");

    // in questo caso c'è un doppio controllo perché se scrivessi
    // Mockito.when(schema.getFullName()).thenReturn(".simple") avrei che
    // durante l'esecuzione di put() vengono invocate requireValidFullName() e validateName();
    // quest'ultima lancia una SchemaParseException: Namespace part "" is invalid: Empty name,

    ctx.put(schema);
    Schema result = ctx.find("simple", "");

    Assert.assertSame(schema, result);

  }

  @Test
  public void TestFindFullyQualifiedNamePresent(){

    Mockito.when(schema.getType()).thenReturn(Schema.Type.RECORD);
    Mockito.when(schema.getFullName()).thenReturn("a.full.Name");

    ctx.put(schema);
    //non mi interessa se lo schema si trovi in oldSchemas o newSchemas; sto facendo test BB,
    //quindi non so neanche che esistono quelle mappe

    Schema result = ctx.find("a.full.Name", null);

    Assert.assertSame(schema, result);
  }

  @Test
  public void TestFindFullyQualifiedNameAbsent() {

    try (MockedStatic<SchemaResolver> mocked = Mockito.mockStatic(SchemaResolver.class)){

      mocked.when(() -> SchemaResolver.unresolvedSchema("a.full.Name")).thenReturn(schema);
      Schema result = ctx.find("a.full.Name", null);

      Assert.assertSame(schema, result);

      mocked.verify(() -> SchemaResolver.unresolvedSchema("a.full.Name"));
    }
  }

  //combinazione (name = "", namespace = null, presence = no)
  @Test
  public void TestFindEmptyNameNullAbsent(){

    try (MockedStatic<SchemaResolver> mocked = Mockito.mockStatic(SchemaResolver.class)){

      mocked.when(() -> SchemaResolver.unresolvedSchema("")).thenReturn(schema);
      Schema result = ctx.find("", null);

      Assert.assertSame(schema, result);

      mocked.verify(() -> SchemaResolver.unresolvedSchema(""));
    }
  }

  /*@Test
  public void prova3(){

    Schema s = Schema.createRecord("explicit", null, "", false);
    System.out.println("this is full name: " + s.getFullName());

  }*/

  //combinazione (name = "", namespace = not "", presence = no)
  @Test
  public void TestFindEmptyNameNotEmptyAbsent(){

    try (MockedStatic<SchemaResolver> mocked = Mockito.mockStatic(SchemaResolver.class)){

      mocked.when(() -> SchemaResolver.unresolvedSchema("explicit.")).thenReturn(schema);
      Schema result = ctx.find("", "explicit");

      Assert.assertSame(schema, result);

      mocked.verify(() -> SchemaResolver.unresolvedSchema("explicit."));
    }
  }

  //combinazione (name = "", namespace = "", presence = no)
  @Test
  public void TestFindEmptyNameEmptyAbsent(){

    try (MockedStatic<SchemaResolver> mocked = Mockito.mockStatic(SchemaResolver.class)){

      mocked.when(() -> SchemaResolver.unresolvedSchema(".")).thenReturn(schema);
      Schema result = ctx.find("", "");

      Assert.assertSame(schema, result);

      mocked.verify(() -> SchemaResolver.unresolvedSchema("."));
    }
  }

  /*@Test
  public void prova(){
    Schema s = ctx.find("ciao","ciao");
    ctx.put(s);
    ctx.commit();
    ctx.resolve(s);

  }*/

  @Test
  public void prova2(){
    List<Schema.Field> fields = new ArrayList<>();
    Schema s = Schema.createRecord("explicit", null, "explicit", false, fields);
    //ctx.put(s);
    ctx.commit();
    ctx.resolve(s);

    /*Schema rec = Schema.createRecord("name", null, "", false, fields);
    Schema s = Schema.createArray(rec);
    ctx.resolve(s);
*/
  }

  @Test
  public void TestPutUnnamedSchema(){
    Mockito.when(schema.getType()).thenReturn(Schema.Type.STRING);

    //in ctx posso mettere solo schemi named, altrimenti viene lanciata un'eccezione
    Assert.assertThrows(AvroTypeException.class, () -> ctx.put(schema));
  }

  @Test
  public void TestPutNamedSchemaIfNotExisting(){

    Mockito.when(schema.getType()).thenReturn(Schema.Type.RECORD);
    Mockito.when(schema.getFullName()).thenReturn("a.full.Name");

    ctx.put(schema);

    Mockito.verify(schema).getType();
    Mockito.verify(schema).getFullName();
  }

  //combinazione (schema = named, presence = same name same schema)
  @Test
  public void TestPutNamedSchemaIfExistingSame(){

    Mockito.when(schema.getType()).thenReturn(Schema.Type.RECORD);
    Mockito.when(schema.getFullName()).thenReturn("a.full.Name");

    ctx.put(schema);
    ctx.put(schema);

    Mockito.verify(schema, Mockito.times(2)).getType();
    Mockito.verify(schema, Mockito.times(2)).getFullName();
  }

  //combinazione (schema = named, presence = same name different schema)
  @Test
  public void TestPutNamedSchemaIfExistingDifferent(){

    Mockito.when(schema.getType()).thenReturn(Schema.Type.RECORD);
    Mockito.when(schema.getFullName()).thenReturn("a.full.Name");

    Schema s = mock(Schema.class);

    Mockito.when(s.getType()).thenReturn(Schema.Type.ENUM);
    Mockito.when(s.getFullName()).thenReturn("a.full.Name");

    Assert.assertThrows(SchemaParseException.class,
        () -> {
                ctx.put(schema);
                ctx.put(s);
        }
    );
  }

  @Test
  public void TestResolveNamedKnown(){
    List<Schema.Field> fields = new ArrayList<>();
    Schema res = Schema.createRecord("simple", null, "explicit", false, fields);

    Schema s = ctx.find("simple","explicit");
    ctx.put(s);
    ctx.put(res);
    ctx.commit();
    ctx.resolve(s);
  }

  @Test
  public void TestResolveNamedUnknown(){
    Schema result = ctx.find("simple","explicit");

    // otterrei un NullPointerException: Unknown schema: org.apache.avro.compiler.UnresolvedSchema_0
    Assert.assertThrows(NullPointerException.class, () -> ctx.resolve(result));
  }

  @Test
  public void TestResolveNamedUnresolvable(){
    Schema result = ctx.find("simple","explicit");
    ctx.put(result);
    ctx.commit();

    // otterrei un messaggio del tipo Undefined schema: explicit.simple
    // perché non è presente nel contesto l'istanza risolta dello stesso schema
    // (in altre parole ho il placeholder ma non lo schema referenced da sostituire);
    Assert.assertThrows(AvroTypeException.class, () -> ctx.resolve(result));
  }

  @Test
  public void TestResolveUnnamed(){
    Schema result = ctx.find("string", null);

    // nel caso unnamed non posso usare put(); otterrei una AvroTypeException: "You can only put a named schema into
    // the context"
    ctx.resolve(result);
  }

  @Test
  public void TestResolveNotAllCommitted(){

    try (MockedStatic<SchemaResolver> mocked = Mockito.mockStatic(SchemaResolver.class)){

      mocked.when(() -> SchemaResolver.unresolvedSchema("explicit.simple")).thenReturn(schema);
      Schema uncommitted = ctx.find("simple","explicit");

      Mockito.when(schema.getType()).thenReturn(Schema.Type.RECORD); //VEDI SE POSSO EVITARE LA ENUM (MAGARI CON UN MOCK)

      Mockito.when(schema.getFullName()).thenReturn("????");

      ctx.put(uncommitted);

      Schema result = ctx.find("string", null);
      Assert.assertThrows(IllegalStateException.class, () -> ctx.resolve(result));

      mocked.verify(() -> SchemaResolver.unresolvedSchema("."));
    }
  }

  @Test
  public void TestResolveNotAllResolved(){
    Schema unresolved = ctx.find("simple","explicit");
    ctx.put(unresolved);
    ctx.commit();

    Schema result = ctx.find("string", null);

    // viene lanciata una AvroTypeException: Undefined schema: explicit.simple
    Assert.assertThrows(AvroTypeException.class, () -> ctx.resolve(result));
  }
}
