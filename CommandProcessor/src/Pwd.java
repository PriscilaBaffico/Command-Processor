

public class Pwd implements Command {

    public boolean execute(Directory directory, String[] params) {
        System.out.println(directory.getCurrentPath());  
        return true;     
    }
}
