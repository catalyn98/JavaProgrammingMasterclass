package _35.AbstractClassesChallenge;

public abstract class ProductForSale {
    private String type;
    private double price;
    private String description;

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public double getSalesPrice(int quantity) {
        return quantity * price;
    }

    public void printPricedItem(int quantity) {
        System.out.println("Quantity: " + quantity + ", Price: " + price + ", Type: " + type + ", Description: " + description);
    }

    public abstract void showDetails();

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
}
