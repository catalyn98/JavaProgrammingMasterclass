package Week9._1.Moștenire;

// Clasa derivată Router care moștenește clasa Dispozitiv
public class Router extends Dispozitiv{
    private int numarPorturi;
    private boolean suportaWiFi;

    // Constructor
    public Router(String producator, String model, int numarPorturi, boolean suportaWiFi) {
        super(producator, model); // Apelăm constructorul clasei de bază
        this.numarPorturi = numarPorturi;
        this.suportaWiFi = suportaWiFi;
    }

    // Suprascrierea metodei afiseazaDetalii()
    @Override
    public void afiseazaDetalii() {
        super.afiseazaDetalii(); // Apelăm metoda din clasa de bază
        System.out.println("Număr de porturi: " + numarPorturi + ", Suport WiFi: " + (suportaWiFi ? "Da" : "Nu"));
    }
}
