package pattern;

public class AddonTouchbar extends MacBookAddon{

    // super hat keinen Standardkonstruktor -> daher muss aufruf mit super kommen um
    // parametrisierten Konstruktor der Elternklasse aufzurufen
    public AddonTouchbar(MacBook macBook) {
        super(macBook);
    }

    @Override
    public String getDescription() {
        return macBook.getDescription() + ", zusätzlich mit touchbar";
    }

    @Override
    public double getPrice() {
        return macBook.getPrice() + 400;
    }

    @Override
    public void increaseVolume() {
        System.out.println("Die Lautstärke des MacBooks wurde über die Touchbar erhöht!");
    }
}
