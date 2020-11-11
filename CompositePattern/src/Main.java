import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        Directory videokurs = new Directory("Videocourse");

        File kursskript = new File("Kursskript", "Daniel");
        Directory kursvideos = new Directory("Kursvideos");

        videokurs.add(kursskript);
        videokurs.add(kursvideos);

        Directory modul1 = new Directory("Modul1");
        Directory modul2 = new Directory("Modul2");
        kursvideos.add(modul1);
        kursvideos.add(modul2);

        File f1 = new File("Einführung", "Hendrik");
        File f2 = new File("Installation", "Franz");
        modul1.add(f1);
        modul2.add(f2);


        videokurs.print("");
    }
}
