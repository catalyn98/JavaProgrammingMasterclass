package Week10.subgrupa1721B.polimorfism_pb1;

import java.util.ArrayList;
import java.util.List;

// Code wrote by Girz Ionut Alexandru
public class Test {
    public static void main(String[] args) {
        List<Device> devices = new ArrayList<>();

        // Adăugăm diferite dispozitive în listă
        devices.add(new Laptop());
        devices.add(new Phone());
        devices.add(new Printer());

        // Iterăm prin listă și apelăm performOperation()
        for (Device device : devices) {
            System.out.println(device.performOperation());

        }
    }
}
