package customTests.controlFlow;

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
public class ParseContextCFTest {

  private ParseContext ctx;

  @Mock
  NameValidator validator;

  @Mock
  NameValidator.Result ok;

  @Before
  public void setupTest() {
    ctx = new ParseContext(validator);
  }

  @Test
  public void TestPutNamedSchemaIfExistingSameCommitted() {

    Schema schema = Schema.createRecord("a.full.Name", null, null, false, Collections.emptyList());

    Mockito.when(validator.validate("a")).thenReturn(ok);
    Mockito.when(validator.validate("full")).thenReturn(ok);
    Mockito.when(validator.validate("Name")).thenReturn(ok);
    Mockito.when(ok.isOK()).thenReturn(true);

    ctx.put(schema);
    ctx.commit();
    ctx.put(schema);

    Map<String, Schema> schemas = ctx.typesByName();

    Assert.assertTrue(schemas.containsKey("a.full.Name"));
    Assert.assertEquals(1, schemas.size());
  }

  @Test
  public void TestResolveUnnamed() {

    Schema unnamed = ctx.find("string", null);

    // gli schemi unnamed vengono visitati e risolti senza validazione
    Schema resolved = ctx.resolve(unnamed);

    // uno schema di tipo primitivo è per costruzione già risolto
    Assert.assertEquals(unnamed, resolved);
    Assert.assertTrue(SchemaResolver.isFullyResolvedSchema(unnamed));
  }

}
