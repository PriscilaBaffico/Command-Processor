import java.util.ArrayList;

public class Folder {
    private String name;
    private String root;
    private ArrayList<String> files;
    private ArrayList<Folder> folders;

    public String getRoot(){
        return this.root;
    }

    public ArrayList<String> getFiles(){
        return this.files;
    }

    public void addFile(String file){
        this.files.add(file);
    }

    public ArrayList<Folder> getFolders(){
        return this.folders;
    }

    public void addDirectory(Folder Directory){
        this.folders.add(Directory);
    }

    public String getName(){
        return this.name;
    }

    public Folder(String root, String name){
        this.root = root;
        this.name = name;
        this.files = new ArrayList<String>();
        this.folders = new ArrayList<Folder>();
    }
}