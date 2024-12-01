package LearnJavaProgramming.laborator_10.abstractizare.pb2;

public abstract class Vehicle {
    void start() {
        System.out.println("Vehicul pornit.");
    }

    void stop() {
        System.out.println("Vehicul oprit.");
    }

    abstract String getVehicleType(); // Fiecare subclasă specifică tipul vehiculului.
}
