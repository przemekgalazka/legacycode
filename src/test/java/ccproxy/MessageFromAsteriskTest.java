package ccproxy;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

/**
 * @author Przemysław Gałązka
 * @since 25-07-2013
 */
public class MessageFromAsteriskTest {

  Parametry parametry;
  MessageFromAsterisk sut;


  @Before
  public void setUp() throws Exception {
    parametry = mock(Parametry.class);
    sut = new MessageFromAsterisk(parametry);
  }


  @Test
  public void shouldCharacteriseMessageProcessing() throws Exception {

    //-------------------- GIVEN -------------------------------------------------------------------


    //-------------------- WHEN --------------------------------------------------------------------
    sut.parseEvent(mock(WiadomoscOdAsteriskaList.class));

    //-------------------- THEN --------------------------------------------------------------------
  }


  @Test
  public void shouldProcessAgentLogIn() throws Exception {
    //-------------------- GIVEN -------------------------------------------------------------------


    //-------------------- WHEN --------------------------------------------------------------------
    String asteriskResponse = "aa Agent logged in";
    AgentConnection agentConnection = mock(AgentConnection.class);
    WiadomoscOdAsteriska wiadomosc = new WiadomoscOdAsteriska();
    boolean knownMsg = false;

    boolean actualResult = sut.agentLoggedIn(asteriskResponse, agentConnection,
        knownMsg, wiadomosc);

    //-------------------- THEN --------------------------------------------------------------------


//    assertThat(actualResult).isEqualTo(true);

  }
}
