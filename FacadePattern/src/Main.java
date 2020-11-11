import motivation.Airplane;
import motivation.AirportSystem;
import motivation.Hotel;
import motivation.LocalLogisticsCompany;
import pattern.FacadeLuggageManagement;

public class Main {
    public static void main(String[] args) {

        // ---------------- motivation -------------------------
        // Client muss alle Klassen des Systems und dere Methoden kennen
        // lösung Facade Pattern -> Client arbeitet mit Schnittstelle und stäßt prozess nur an

        AirportSystem airport = new AirportSystem();
        airport.checkLuggage();
        airport.transportToAirplane();

        Airplane airplane = new Airplane();
        airplane.putLuggageToPlane();
        airplane.takeLuggageOut();

        LocalLogisticsCompany company = new LocalLogisticsCompany();
        company.putLuggageToTruck();
        company.transportHotel();

        Hotel hotel = new Hotel();
        hotel.transportLuggageToGuest();





        // -------------- Facade Pattern ---------------
        FacadeLuggageManagement bookingSystem = new FacadeLuggageManagement();
        bookingSystem.sendLuggage();

    }
}
