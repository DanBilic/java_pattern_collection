// concrete builder
public class StoneHouseBuilder extends HouseBuilder{
    private House house;

    StoneHouseBuilder(){
        this.house = new House();
    }

    @Override
    public void buildBasement() {
        house.setBasement("Keller aus Stein, mit Strom und Wasserleitungen");
    }

    @Override
    public void buildMaterial() {
        house.setMaterial("Speziell angefertigte Mauersteine");
    }

    @Override
    public void buildKitchen() {
        house.setKitchen("Granit Küche");
    }

    @Override
    public void buildRoof() {
        house.setRoof("Schwarze Dachziegel");
    }

    @Override
    public House getHouse() {
        return this.house;    }
}
