import pattern.Tree;
import pattern.TreeFactory;
import pattern.TreeType;

public class Main {
    public static void main(String[] args) {

        // Eine Tanne wird nur einmal erzeugt
        Tree tree1 = TreeFactory.getTree(TreeType.TANNE);
        tree1.drawTree(10, 10, 30);

        //keine weiteren Tannen - Objekte werden erzeugt -> es wird die bereits erstellte genutzt
        Tree tree2 = TreeFactory.getTree(TreeType.TANNE);
        tree2.drawTree(5, 5, 30);

        // Birke wird nur einmal erzeugt
        Tree tree3 = TreeFactory.getTree(TreeType.BIRKE);
        tree3.drawTree(3, 4, 10);
    }
}
