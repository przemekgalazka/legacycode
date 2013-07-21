import org.apache.log4j.Logger;

import pl.cc.events.real.RealCallListListener;
import pl.cc.events.real.RealCallListener;
import pl.cc.events.real.RealQueueListListener;
import pl.cc.real.RealAgent;
import pl.cc.real.RealCall;
import pl.cc.real.RealQueue;


/**
 * Konsolowy listener dla listy połączeń 
 */
public class RealCallListObserver implements RealCallListListener, RealQueueListListener, RealCallListener {
	public static final Logger log = Logger.getLogger(RealCallListObserver.class);
	String name;
	
	public RealCallListObserver(String name) {
		this.name = name;
	}

	@Override
	public void onCallAdd(RealCall call) {
		log.info(">>"+name+"<< onCall ADD: "+call);
		call.addCallListener(this);		
	}

	@Override
	public void onCallRemoved(RealCall call) {
		log.info(">>"+name+"<< onCall DEL: "+call);
		call.removeCallListener(this);
	}

	@Override
	public void onClear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onQueueAdd(RealQueue realQueue) {
		if (realQueue.getName().equalsIgnoreCase(name)){
			log.info("Added call list listener for queue "+name);
			realQueue.getCallList().addCallListListener(this);
		}
	}

	@Override
	public void onQueueRemoved(RealQueue realQueue) {
		if (realQueue.getName().equalsIgnoreCase(name)){
			log.info("Removed call list listener for queue "+name);
			realQueue.getCallList().removeCallListListener(this);
		}
	}

	@Override
	public void onAgentConnect(RealCall call, RealAgent agent, RealQueue queue) {
		log.info(">>"+name+"<< onAgentConnect"+call+" "+agent.getExtension()+" "+queue.getName());
		
	}

	@Override
	public void onAgentHangeup(RealCall call, RealAgent agent, RealQueue queue) {
		log.info(">>"+name+"<< onAgentHangeup"+call+" "+agent.getExtension()+" "+queue.getName());
	}

}
