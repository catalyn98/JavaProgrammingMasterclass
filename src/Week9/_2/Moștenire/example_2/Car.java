package Week9._2.Moștenire.example_2;

public class Car extends Vehicle {
    private int numberOfDoors;

    // Constructor
    public Car(String brand, int year, int numberOfDoors) {
        super(brand, year); // Apelarea constructorului din clasa părinte
        this.numberOfDoors = numberOfDoors;
    }

    // Metodă specifică
    public void displayCarDetails() {
        super.displayInfo(); // Metodă moștenită
        System.out.println("Număr de uși: " + numberOfDoors);
    }
}
