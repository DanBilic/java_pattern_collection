package pattern;

// abstrakte Creator Klasse
public abstract class Transport {
    private String costumerName;
    private String destination;
    //..

    public void collectProductsFromCustomer(){
        System.out.println("Die Produkte vom Kunden wurden abgeholt");
    }

    public abstract void transportProducts();
}
