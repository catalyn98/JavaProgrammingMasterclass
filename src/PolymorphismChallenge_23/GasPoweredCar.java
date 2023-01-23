package PolymorphismChallenge_23;

public class GasPoweredCar extends Car{
    private double avgKmPerLiter;
    private int cylinder = 6;

    public GasPoweredCar(String description) {
        super(description);
    }

    @Override
    public void drive() {
        super.drive();
    }
}
