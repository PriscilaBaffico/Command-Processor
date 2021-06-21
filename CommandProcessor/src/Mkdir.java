
public class Mkdir implements Command {

    public boolean execute(Directory directory, String[] params) {
        String newDir = params[1];      
        
        if(newDir.length() > 100)
            newDir = newDir.substring(0,100);
        
         boolean result = directory.createNewDirectory(newDir);  
        if(!result)
            System.out.println("Directory already exists");

        return true; 
    }
}
