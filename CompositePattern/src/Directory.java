import java.io.File;
import java.util.ArrayList;

public class Directory extends FileSystemComponent{

    private ArrayList<FileSystemComponent> includedFiles = new ArrayList<>();

    public Directory(String name){
        this.setName(name);
    }

    @Override
    public void print(String spacing) {
        System.out.println(spacing + "Verzeichnis: " + this.getName());
        for(FileSystemComponent c : includedFiles){
            // rekursiver print() aufruf
            // es wird jeder print für jedes FileSystemComponent aufgerufen,
            // dass wiederum print enthalten kann und somit auch aufgerufen wird
            c.print(spacing + "     ");
        }
    }

    public void add(FileSystemComponent component){
        includedFiles.add(component);
    }

    public void remove(FileSystemComponent component){
        includedFiles.remove(component);
    }

    public FileSystemComponent getFileSystemComponent(int index){
        return includedFiles.get(index);
    }
}
