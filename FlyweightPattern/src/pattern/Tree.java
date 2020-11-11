package pattern;

import com.sun.prism.paint.Color;

// Flyweight
public interface Tree {
    public Color getColor();
    public TreeType getTreeType();

    // Extrinsischer Zustand wird übergeben => Kontext
    public void drawTree(int x, int y, int height);
}
