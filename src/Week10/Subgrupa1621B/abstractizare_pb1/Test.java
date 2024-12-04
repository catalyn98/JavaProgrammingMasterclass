package Week10.Subgrupa1621B.abstractizare_pb1;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Device> devices = new ArrayList<>();
        devices.add(new Laptop());
        devices.add(new Printer());

        for (Device device : devices) {
            device.turnOn();
            System.out.println("Tip dispozitiv: " + device.deviceType());

            if (device instanceof Networkable) {
                ((Networkable) device).connectToNetwork();
            }

            device.turnOff();
            System.out.println();
        }
    }
}
