package ccproxy;

import pl.cc.SystemCoreState;
import pl.cc.core.PauseTypeList;

import org.apache.log4j.Logger;

public class Parametry {

  PauseTypeList pauseTypeList;
  /**
   * Tutaj przechowywany jest aktalny stan systemu
   * Wykorzysywane do przesyłania listy aktualnie trwających połączeń dla nowo zalogowanych agentów
   */
  SystemCoreState coreState;

  AgentConnectionList agenci;
  AsteriskQueueList asteriskQueueList;


  DBConnection dbConn;
  GadajAsterisk gadajAsterisk;
  ReadConfig c;

  org.apache.log4j.Logger log = Logger.getLogger(Parametry.class);


  public Parametry() {
    pauseTypeList = new PauseTypeList();
    coreState = new SystemCoreState(pauseTypeList);
    agenci = new AgentConnectionList(coreState);
    asteriskQueueList = new AsteriskQueueList(coreState);
  }


  public Parametry(PauseTypeList pauseTypeList,
      SystemCoreState coreState,
      AgentConnectionList agenci, AsteriskQueueList asteriskQueueList) {
    this.pauseTypeList = pauseTypeList;
    this.coreState = coreState;
    this.agenci = agenci;
    this.asteriskQueueList = asteriskQueueList;
  }
}
