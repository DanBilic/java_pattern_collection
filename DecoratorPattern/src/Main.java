import pattern.AddonI5Processor;
import pattern.AddonTouchbar;
import pattern.MacBookPro;
import string_decorator.SpecialString;


public class Main {
    public static void main(String[] args) {
        MacBookPro pc1 = new MacBookPro();
        pc1.increaseVolume();
        System.out.println(pc1.getDescription());

        AddonTouchbar macBookProWithTouchbar = new AddonTouchbar(pc1);
        System.out.println(macBookProWithTouchbar.getDescription());
        System.out.println(macBookProWithTouchbar.getPrice());

        AddonI5Processor macBookWithTouchAndI5 = new AddonI5Processor(macBookProWithTouchbar);

        System.out.println(macBookWithTouchAndI5.getDescription());


        // --------------------- String Decorator ------------------------------
        SpecialString test = new SpecialString("Das ist ein HausA");
        System.out.println(test.countCharA());

    }
}
