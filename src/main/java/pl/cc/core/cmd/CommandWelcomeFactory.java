package pl.cc.core.cmd;

/**
 * By Szczepan Faber on 7/21/13
 */
public class CommandWelcomeFactory implements CommandFactory {
    public Command factoryInt(String line){
        if (Command.equalsExtended(line, "Welcome. Please authorize.")){
            return new CommandWelcome(line);
        } else {
            return null;
        }
    }
}
