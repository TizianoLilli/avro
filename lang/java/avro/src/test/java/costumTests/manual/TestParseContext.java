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
    ctx.resolveAllSchemas();

  }*/

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
}
