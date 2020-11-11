public class File extends FileSystemComponent {
    private String owner;

    public File(String name, String owner){
        this.setName(name);
        this.owner = owner;
    }

    @Override
    public void print(String spacing) {
        System.out.println(spacing + this.getName() + "(Ersteller: " + this.owner + ")");
    }
}
