public class Rectangle extends Shape{

    private int x, y, length, width;

    //Shape hat keinen Standardkonstruktor daher super aufrufen
    public Rectangle(DrawAPI drawAPI, int x, int y, int length, int width) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.length = length;
        this.width = width;
    }

    // ruft draw von Klasse mit Typ DrawAPI auf:
    @Override
    public void draw() {
        drawAPI.draw(x, y, length, width);
    }
}
