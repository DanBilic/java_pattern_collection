package adapter_pattern;

public class GameEngine {
    public static void main(String[] args) {
        EnemyObject orc1 = new EnemyObjectOrc();
        orc1.attack();
        orc1.sayHello();

        Wizard wiz = new Wizard();
        EnemyObject wiz1 = new AdapterWizard(wiz);
        wiz1.attack();
        wiz1.sayHello();
    }
}
