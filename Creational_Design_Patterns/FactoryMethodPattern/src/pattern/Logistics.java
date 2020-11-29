package pattern;

// verstößt gegen das open closed principle
// neuer transport typ müsste hier im ifelse construct hinzugefügt werde
public abstract class Logistics {
    protected abstract Transport transportFactory(String transportType);

    // definition der factory method
    public pattern.Transport manageTransportForCustomer(String transportType){

        // delegation der entscheidung welcher klasse instanziert an die concrete builder -> subklasse
        Transport transport = transportFactory(transportType);



        transport.collectProductsFromCustomer();
        transport.transportProducts();



        return transport;
    }
}