package Week10.subgrupa1722A.polimorfism_pb1;


import java.util.ArrayList;
import java.util.List;

// Clasa principală
public class Main {
       public static void main(String[] args) {
       // Listă de dispozitive (polimorfism)
       List<Device> devices = new ArrayList<>();

       // Adăugăm diferite dispozitive în listă
       devices.add(new Laptop());
       devices.add(new Phone());
       devices.add(new Printer());
       // Iterăm prin listă și apelăm performOperation()
           for (Device device : devices) {
            device.performOperation();
           }
       }
}
