package pl.cc.core.cmd;

/**
 * By Szczepan Faber on 7/21/13
 */
public class InfoVersionFactory implements CommandFactory {
    @Override
    public Command factoryInt(String s){
        String [] names = {"version","url"};
        String [] values = Command.getValuesINFO(s, names);
        if (values==null) return null;
        return new InfoVersion(s,values[0],values[1]);
    }
}
