package pattern;

import pattern.Transport;

public class FlightTransport extends Transport {
    @Override
    public void transportProducts() {
        System.out.println("Die Produkte wurde über den Flugweg transportiert");
    }
}
