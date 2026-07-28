package customTests.manual;

import org.apache.avro.*;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.mock;

@RunWith(MockitoJUnitRunner.class)
public class ParseContextIntegrationTest {

  private ParseContext ctx;

  @Mock
  private Schema schema;

  @Before
  public void setupTest(){
    ctx = new ParseContext();
  }

}
