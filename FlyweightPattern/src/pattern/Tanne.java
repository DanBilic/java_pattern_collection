package pattern;

import com.sun.prism.paint.Color;

// concrete flyweiht
public class Tanne implements Tree{

    private Color color;
    private TreeType treeType;

    public Tanne(){
        this.color = Color.GREEN;
        this.treeType = TreeType.TANNE;
    }


    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public TreeType getTreeType() {
        return treeType;
    }

    @Override
    public void drawTree(int x, int y, int height) {
        // Zeichne die Tanne mithilfe der extrinsischen Daten (Kontext)
        System.out.println("Tanne wurde an Position(" + x + "/" + y +") gesetzt");
    }
}
