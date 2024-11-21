package Week9._1.Moștenire;

// Clasa principală pentru testarea moștenirii
public class Main {
    public static void main(String[] args) {
        Router router = new Router("Cisco", "XR500", 4, true);
        Switch switchDevice = new Switch("Netgear", "ProSAFE", 24);

        System.out.println("Detalii Router:");
        router.afiseazaDetalii();

        System.out.println("\nDetalii Switch:");
        switchDevice.afiseazaDetalii();
    }
}
