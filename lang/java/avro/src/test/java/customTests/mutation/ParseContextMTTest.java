package customTests.mutation;

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

@RunWith(MockitoJUnitRunner.class)
public class ParseContextMTTest {

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
  public void TestFindFullyQualifiedNameStartingWithDot() {

    Schema schema = ctx.find(".simple", "explicit");

    Assert.assertTrue(SchemaResolver.isUnresolvedSchema(schema));
    Assert.assertEquals(".simple", SchemaResolver.getUnresolvedSchemaName(schema));
  }

  @Test
  public void TestPutOnlyName() {

    Schema schema = Schema.createRecord("simple", null, null, false, Collections.emptyList());

    Mockito.when(validator.validate("simple")).thenReturn(ok);
    Mockito.when(ok.isOK()).thenReturn(true);

    ctx.put(schema);

    Mockito.verify(validator, Mockito.times(1)).validate("simple");
  }

  @Test
  public void TestPutNameNamespace() {

    Schema schema = Schema.createRecord("simple", null, "explicit", false, Collections.emptyList());

    Mockito.when(validator.validate("simple")).thenReturn(ok);
    Mockito.when(validator.validate("explicit")).thenReturn(ok);
    Mockito.when(ok.isOK()).thenReturn(true);

    ctx.put(schema);

    Mockito.verify(validator, Mockito.times(1)).validate("simple");
    Mockito.verify(validator, Mockito.times(1)).validate("explicit");
  }

}
