package _35.AbstractClassesChallenge;

public class Laptop extends ProductForSale{

    public Laptop(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("Product type: " + getType());
        System.out.println("Product description: " + getDescription());
        System.out.println("Product price: " + getPrice());
    }
}
