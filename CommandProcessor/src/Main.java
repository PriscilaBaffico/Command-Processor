/**
 * The entry point for the Test program
 */
public class Main {

    public static void main(String[] args) {

        Directory currentDirectory = new Directory();
        CommandBuilder builder = new CommandBuilder();
        int i = 0;
        boolean next = true;
        while(next) {
            String[] command = args[i].split(" ");       
            next = builder.executeCommand(currentDirectory, command);
            i++;
        }
    }
}
