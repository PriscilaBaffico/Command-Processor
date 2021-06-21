import java.util.ArrayList;

public class Ls implements Command {

    public boolean execute(Directory directory, String[] params) {
        if(params.length > 1 && params[1].equals("-r"))
            printAllSubDirectories(directory);
        else {
            ArrayList<String> files = directory.getCurrentPathFiles();
            Folder currentFolder = directory.getCurrentFolder();
            for (String file : files) {
                System.out.println(file);
            }
            ArrayList<Folder> folders = currentFolder.getFolders();
            for (Folder folder : folders) {
                System.out.println(folder.getName());
            }
        }
        return true;
    }

    private void printAllSubDirectories(Directory directory) {
        if(directory.getCurrentPath() != ""){
            Folder currentFolder = directory.getCurrentFolder();
            System.out.println();
            printFiles(directory.getCurrentPathFiles());
            _printAllSubDirectories(currentFolder);
        }       
    }

    private void _printAllSubDirectories(Folder folder){
        if(folder.getFolders().isEmpty()) {
            System.out.println(folder.getName());
            printFiles(folder.getFiles());
        }
        else {
            ArrayList<Folder> folders = folder.getFolders();
            for (Folder childFolder : folders) {
                _printAllSubDirectories(childFolder);
            }
        }
    }

    private void printFiles(ArrayList<String> files){
        for (String file : files) {
            System.out.println(file);
        }
    }

}
