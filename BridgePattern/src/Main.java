public class Main {
    public static void main(String[] args) {
        // Abstraktionshierarchie -> Shape -> Rectangle kann unabhängig von der
        // Implementationshierarchie -> DrawAPI -> GreenRectangle entwickelt werden

        Shape greenRectangle = new Rectangle(new GreenRectangle(), 2, 2, 10, 5);
        greenRectangle.draw();
    }
}
