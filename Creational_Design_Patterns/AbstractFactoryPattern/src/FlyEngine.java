public class FlyEngine extends Engine{

    public FlyEngine(){
        System.out.println("Die FlyEngine wurde erfolgreich erzeug!");
    }

    @Override
    public void revCounter() {
        System.out.println("Die aktuelle Drehzahl der FlyEngine beträgt 300 Umdrehungen/Minute");
    }
}
