package Inheritance_17.Customer_4;

public class Main {

    public static void main(String[] args) {
        Inheritance_17.Customer_4.Customer customer1 = new Inheritance_17.Customer_4.Customer();
        System.out.println(customer1.getName());
        System.out.println();
        Inheritance_17.Customer_4.Customer customer2 = new Inheritance_17.Customer_4.Customer("Andreea Justice", "andreea_justice@yahoo.com");
        System.out.println(customer2.getName());
    }
}
