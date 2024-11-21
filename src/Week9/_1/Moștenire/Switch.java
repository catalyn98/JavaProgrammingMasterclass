package Week9._1.Moștenire;

// Clasa derivată Switch care moștenește clasa Dispozitiv
public class Switch extends Dispozitiv {
    private int numarPorturi;

    // Constructor
    public Switch(String producator, String model, int numarPorturi) {
        super(producator, model); // Apelăm constructorul clasei de bază
        this.numarPorturi = numarPorturi;
    }

    // Suprascrierea metodei afiseazaDetalii()
    @Override
    public void afiseazaDetalii() {
        super.afiseazaDetalii(); // Apelăm metoda din clasa de bază
        System.out.println("Număr de porturi: " + numarPorturi);
    }
}
