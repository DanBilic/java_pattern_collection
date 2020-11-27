public class Main {
    public static void main(String[] args) {

        HouseBuilder whb = new WoodHouseBuilder();
        CivilEngineer engineer = new CivilEngineer(whb);

        engineer.constructHouse();

        House house = engineer.getHouse();
        System.out.println(house);
    }
}
