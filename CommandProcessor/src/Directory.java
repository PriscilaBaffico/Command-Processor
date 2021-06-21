//package com.salesforce.tests.fs;
import java.util.ArrayList;
import java.util.HashMap;

public class Directory {
    private String currentPath = "";
    private HashMap<String, Folder> contents = new HashMap<String, Folder>();

    public String getCurrentPath(){
      return this.currentPath;
    }

    public boolean setCurrentPath(String newPath){
      Folder folder = contents.get(newPath);
      if(folder.getRoot() != currentPath)
        return false;
      this.currentPath = newPath;
      return true;
    }

    public boolean createNewDirectory(String name){
        if(this.contents.get(name) != null)
            return false;
        
        else {
            Folder currentDir = contents.get(this.currentPath);
            Folder newDir = new Folder(this.currentPath, name);
            currentDir.addDirectory(newDir);
            this.contents.put(name, newDir);
            return true;
        }
    }

    public ArrayList<String> getCurrentPathFiles(){
        Folder currentPathContent = this.contents.get(this.currentPath);
        return currentPathContent.getFiles();
    }

    public Folder getCurrentFolder(){
      return this.contents.get(this.currentPath);
    }

    public void CreateNewFile(String File) {
        Folder currentDic = this.contents.get(this.currentPath);
        currentDic.addFile(File);
    }

    public Directory(){
      this.currentPath ="";
      this.contents.put(this.currentPath, new Folder("", ""));
    }

    public String getParentPath() {
        Folder currentDir = contents.get(this.currentPath);
        return currentDir.getRoot();
    }

    
}
