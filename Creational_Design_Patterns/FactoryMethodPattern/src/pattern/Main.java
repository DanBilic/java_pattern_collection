package pattern;

public class Main {
    public static void main(String[] args) {
        Logistics logisticsSoftware = new SeaStreetFlightLogistics();
        Transport seaTransport = logisticsSoftware.manageTransportForCustomer("sea");
    }
}
