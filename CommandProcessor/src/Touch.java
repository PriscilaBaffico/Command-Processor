public class Touch implements Command {

    public boolean execute(Directory terminal, String[] params) {
        String newFile = params[1];      
        
        if(newFile.length() > 100)
            newFile = newFile.substring(0,100);
     
        terminal.CreateNewFile(newFile);
        return true;
    }
}
