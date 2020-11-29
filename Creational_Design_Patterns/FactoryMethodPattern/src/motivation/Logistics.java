package motivation;

// verstößt gegen das open closed principle
// neuer transport typ müsste hier im ifelse construct hinzugefügt werde
public class Logistics {
    public Transport manageTransportForCustomer(String tranportType){
        Transport transport = null;

        // zur laufzeit wird ermittelt welcher der Fälle vorliegt
        if(tranportType.equals("sea")){
            transport = new SeaTransport();
        }

        else if(tranportType.equals("street")){
            transport = new Streettransport();
        }

        else if(tranportType.equals("fligt")){
            transport = new FlightTransport();
        }

        else{
            System.out.println("ungültiger transport typ");
        }

        transport.collectProductsFromCustomer();
        transport.transportProducts();



        return transport;
    }
}
