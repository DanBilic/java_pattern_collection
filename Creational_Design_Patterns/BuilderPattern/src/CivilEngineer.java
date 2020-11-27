public class CivilEngineer {
    private HouseBuilder houseBuilder;

    public CivilEngineer(HouseBuilder houseBuilder){
        this.houseBuilder = houseBuilder;
    }

    public void constructHouse(){
        this.houseBuilder.buildBasement();
        this.houseBuilder.buildRoof();
        this.houseBuilder.buildKitchen();
        this.houseBuilder.buildMaterial();
    }

    public House getHouse(){
        return this.houseBuilder.getHouse();
    }
}
