package PolymorphismChallenge_23;

public class Main {

    public static void runRace(Car car) {
        car.startEngine();
        car.drive();
    }

    public static void main(String[] args) {
/*        Car car1 = new Car("2023 Audi A3 Sedan");
        runRace(car1);*/

        Car car2 = new GasPoweredCar("2023 Audi A4 allroad Wagon");
        runRace(car2);
    }
}