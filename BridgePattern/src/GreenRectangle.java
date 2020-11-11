public class GreenRectangle implements DrawAPI{

    @Override
    public void draw(int x, int y, int length, int width) {
        System.out.println("Das Rechteck mit einer Länge von: " + length);
    }
}
