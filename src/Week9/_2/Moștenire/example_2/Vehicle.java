package Week9._2.Moștenire.example_2;

public class Vehicle {
    private String brand;
    private int year;

    // Constructor
    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Metodă pentru afișarea informațiilor
    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}

