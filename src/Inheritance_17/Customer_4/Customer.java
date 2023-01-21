package Inheritance_17.Customer_4;

public class Customer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public Customer() {
        this("Victoria Justice", 20000.00, "victoria_justice@yahoo.com");
        System.out.println("This is constructor with no argument.");
    }

    public Customer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
        System.out.println("This is constructor with 3 arguments.");
    }

    public Customer(String name, String emailAddress) {
        this(name, 20000.00, emailAddress);
        System.out.println("This is a constructor with just the name and email parameters, which also calls another constructor");
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
