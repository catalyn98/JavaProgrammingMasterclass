package Week6.Subgrupa1721B.exercise12.example;

//Code wrote by Catalan Catalin

public class Main {
    public static void main(String[] args) {
        Masina masinaMea = new Masina("Toyota", "Corolla", 180);
        masinaMea.porneste();
        System.out.println("Marca: " + masinaMea.getMarca());
        System.out.println("Model: " + masinaMea.model);
        System.out.println("Viteza maxima: " + masinaMea.vitezaMaxima + " km/h");
        masinaMea.opreste();
    }
}
