package pattern;


// Decorator Klasse
public abstract class MacBookAddon implements MacBook{

    // protected -> KindelKlassen können direkt darauf zugreifen ohne getter Methode
    // protected -> wird auf KinKlassen vererbt
    protected MacBook macBook;

    public MacBookAddon(MacBook macBook){
        this.macBook = macBook;
    }

}
