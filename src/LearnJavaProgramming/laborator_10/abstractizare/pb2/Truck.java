package LearnJavaProgramming.laborator_10.abstractizare.pb2;

public class Truck extends Vehicle implements CargoCapable {
    @Override
    String getVehicleType() {
        return "Camion";
    }

    @Override
    public void loadCargo() {
        System.out.println("Încărcătura a fost încărcată.");
    }
}
