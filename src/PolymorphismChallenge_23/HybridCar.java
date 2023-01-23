package PolymorphismChallenge_23;

public class HybridCar extends Car {
    private double avgKmPerLiter;
    private int cylinder = 6;
    private int batterySize;

    public HybridCar(String description) {
        super(description);
    }

    @Override
    public void drive() {
        super.drive();
    }
}
