package pattern;

public class AddonI5Processor extends MacBookAddon{

    public AddonI5Processor(MacBook macBook) {
        super(macBook);
    }

    @Override
    public String getDescription() {
        return macBook.getDescription() + ", zusätzlich mit I5 Prozesoor";
    }

    @Override
    public double getPrice() {
        return macBook.getPrice() + 200;
    }

    @Override
    public void increaseVolume() {
        macBook.increaseVolume();
    }
}
