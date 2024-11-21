package Week9._1.Moștenire;

// lasa de bază
public class Dispozitiv {
    // Atribute
    private String producator;
    private String model;

    // Constructor
    public Dispozitiv(String producator, String model) {
        this.producator = producator;
        this.model = model;
    }

    // Metodă pentru afișarea informațiilor despre dispozitiv
    public void afiseazaDetalii() {
        System.out.println("Producător: " + producator + ", Model: " + model);
    }

    // Metoda toString() suprascrisă
    @Override
    public String toString() {
        return "Dispozitiv [Producător=" + producator + ", Model=" + model + "]";
    }
}
