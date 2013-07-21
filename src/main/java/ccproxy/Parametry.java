package ccproxy;

import org.apache.log4j.Logger;

import pl.cc.SystemCoreState;
import pl.cc.core.PauseTypeList;

public class Parametry {
	
	PauseTypeList pauseTypeList = new PauseTypeList();
	/**
	 * Tutaj przechowywany jest aktalny stan systemu
	 * Wykorzysywane do przesyłania listy aktualnie trwających połączeń dla nowo zalogowanych agentów
	 */
	SystemCoreState coreState = new SystemCoreState(pauseTypeList);

	AgentConnectionList agenci = new AgentConnectionList(coreState);
	AsteriskQueueList asteriskQueueList = new AsteriskQueueList(coreState);
	
	
	DBConnection dbConn;
	org.apache.log4j.Logger log = Logger.getLogger(Parametry.class);
	GadajAsterisk gadajAsterisk;
	ReadConfig c;
	
	
}
