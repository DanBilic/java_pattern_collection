package pattern;

import pattern.Transport;

public class StreetTransport extends Transport {
    @Override
    public void transportProducts() {
        System.out.println("Die Produkte werden über den Seeweg transportiert");
    }
}