package _17.Inheritance.Customer_4;

public class Main {

    public static void main(String[] args) {
        Customer customer1 = new Customer();
        System.out.println(customer1.getName());
        System.out.println();
        Customer customer2 = new Customer("Andreea Justice", "andreea_justice@yahoo.com");
        System.out.println(customer2.getName());
    }
}
