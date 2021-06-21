
public class Cd implements Command{

    public boolean execute(Directory directory, String[] params) {
        String path = params[1];
        if(path.equals(".."))
            path = directory.getParentPath();

        boolean result = directory.setCurrentPath(path);
        if(!result){
            System.out.println("Directory not found");
        }
        return true;
    }
}
