package pl.cc.core.cmd;

/**
 * Komenta Welcome.
 * CCProxy gotowe do przetwarzania zdarzeń
 * 
 * @since 2007-12-18
 */
public class CommandWelcome extends Command { 

	
	public CommandWelcome(String orginalLine) {
		super(orginalLine);
	}

    @Override
	public int getType() {
		return CMD_WELCOME;
	}


}
