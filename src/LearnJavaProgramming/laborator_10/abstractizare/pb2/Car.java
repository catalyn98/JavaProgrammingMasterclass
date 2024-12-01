package LearnJavaProgramming.laborator_10.abstractizare.pb2;

public class Car extends Vehicle implements CargoCapable {
    @Override
    String getVehicleType() {
        return "Mașină";
    }

    @Override
    public void loadCargo() {
        System.out.println("Încărcătura a fost încărcată.");
    }
}
