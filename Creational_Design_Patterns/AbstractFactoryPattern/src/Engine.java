public abstract class Engine {
    private double engineSpeed; // Drehzahl des Motors

    public abstract void revCounter();

    public double getEngineSpeed() {
        return engineSpeed;
    }

    public void setEngineSpeed(double engineSpeed) {
        this.engineSpeed = engineSpeed;
    }
}
