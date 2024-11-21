package Week6.Subgrupa1721A.exercise12.example;

//Code wrote by Catalan Catalin

public class Masina {
    // Atribute
    private String marca;
    String model;
    int vitezaMaxima;

    public String getMarca() {
        return marca;
    }

    // Constructor
    public Masina(String marca, String model, int vitezaMaxima) {
        this.marca = marca;
        this.model = model;
        this.vitezaMaxima = vitezaMaxima;
    }

    // Metode
    public void porneste() {
        System.out.println("Masina a pornit.");
    }

    public void opreste() {
        System.out.println("Masina s-a oprit.");
    }
}
