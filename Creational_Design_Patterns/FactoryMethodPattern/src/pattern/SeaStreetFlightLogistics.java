package pattern;

public class SeaStreetFlightLogistics extends Logistics{


    @Override
    protected Transport transportFactory(String transportType) {
        Transport transport = null;

        // zur laufzeit wird ermittelt welcher der Fälle vorliegt
        if(transportType.equals("sea")){
            transport = new SeaTransport();
        }

        else if(transportType.equals("street")){
            transport = new StreetTransport();
        }

        else if(transportType.equals("fligt")){
            transport = new FlightTransport();
        }

        else{
            System.out.println("ungültiger transport typ");
        }
        return transport;
    }
}
