package customTests.manual;

import org.apache.avro.ParseContext;
import org.apache.avro.Schema;
import org.junit.Before;
import org.junit.runner.RunWith;

import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;



@RunWith(MockitoJUnitRunner.class)
public class ParseContextIntegrationTest {

  private ParseContext ctx;

  @Mock
  private Schema schema;

  @Before
  public void setupTest() {
    ctx = new ParseContext();
  }

}
