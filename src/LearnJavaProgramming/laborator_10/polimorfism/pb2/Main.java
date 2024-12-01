package LearnJavaProgramming.laborator_10.polimorfism.pb2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Listă de servicii IT (polimorfism)
        List<ITService> services = new ArrayList<>();

        // Adăugăm diferite servicii în listă
        services.add(new SoftwareMaintenance());
        services.add(new Networking());
        services.add(new CyberSecurity());

        // Iterăm prin listă și apelăm executeService()
        for (ITService service : services) {
            service.executeService();
        }
    }
}
