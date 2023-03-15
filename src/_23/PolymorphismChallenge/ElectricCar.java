package _23.PolymorphismChallenge;

public class ElectricCar extends Car {
    private int avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String description) {
        super(description);
    }

    @Override
    public void drive() {
        super.drive();
    }
}
