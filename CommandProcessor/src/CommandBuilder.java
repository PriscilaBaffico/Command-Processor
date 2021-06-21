import java.util.HashMap;

public class CommandBuilder {
    
    private HashMap<String, Command> commands;

    public boolean executeCommand(Directory currentDirectory, String[] command){
        Command commandClass = commands.get(command[0]);
        if(commandClass == null){
            System.out.println("Unrecognized command");
            return true;
        }
        return commandClass.execute(currentDirectory, command);
    };
    
    private HashMap<String, Command> loadCommands(){
        
        HashMap<String, Command> commands = new HashMap<String, Command>();
        commands.put("cd", new Cd());
        commands.put("ls", new Ls());
        commands.put("pwd", new Pwd());
        commands.put("mkdir", new Mkdir());
        commands.put("touch", new Touch());       
        commands.put("quit", null);
        
        return commands;
    }
    
    public CommandBuilder(){
        this.commands = loadCommands();       
    }
}
