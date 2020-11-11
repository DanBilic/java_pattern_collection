package adapter_pattern;

// WrapperKlasse für Wizard Klasse
public class AdapterWizard implements EnemyObject{

    private Wizard wizard;

    public AdapterWizard(Wizard wizard){
        this.wizard = wizard;
    }

    @Override
    public void attack() {
        wizard.attackEnemy();
    }

    @Override
    public void sleep() {
        wizard.goToBed();
    }

    @Override
    public void sayHello() {
        wizard.communicate();
    }
}
