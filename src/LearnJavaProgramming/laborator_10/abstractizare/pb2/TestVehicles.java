package LearnJavaProgramming.laborator_10.abstractizare.pb2;

import java.util.ArrayList;
import java.util.List;

public class TestVehicles {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car());
        vehicles.add(new Truck());
        vehicles.add(new Motorcycle());

        for (Vehicle vehicle : vehicles) {
            vehicle.start();
            System.out.println("Tip vehicul: " + vehicle.getVehicleType());

            if (vehicle instanceof CargoCapable) {
                ((CargoCapable) vehicle).loadCargo();
            }

            vehicle.stop();
            System.out.println();
        }
    }
}
