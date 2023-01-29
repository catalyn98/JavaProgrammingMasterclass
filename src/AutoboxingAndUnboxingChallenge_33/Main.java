package AutoboxingAndUnboxingChallenge_33;

import java.util.ArrayList;

record Customer(String name, ArrayList<Double> transactions) {
    public Customer(String name, double initialDeposit) {
        this(name.toUpperCase(), new ArrayList<>());
    }
}

public class Main {
    public static void main(String[] args) {

       Bank bank = new Bank();

       // add customers
       bank.addNewCustomer("Victor", 1000);
       bank.addNewCustomer("Victor", 1000);
       bank.addNewCustomer("Sebastian", 1045);
       bank.addNewCustomer("Erica", 1062);
       bank.addNewCustomer("Zack", 4000);
       bank.printAllCustomer();

       // add transactions
       bank.addTransaction("Victor", 100);
       bank.addTransaction("Erica", -567);

       // print the statement
       bank.printStatement("Victor");
       bank.printStatement("Erica");
    }
}

class Bank {

    ArrayList<Customer> arrayListCustomer = new ArrayList<>();

    // add a new customer
    public void addNewCustomer(String customerName, double initialDeposit) {
        Customer customer = new Customer(customerName, initialDeposit);
        for(var c : arrayListCustomer) {
            if(c.name().equalsIgnoreCase(customerName)) {
                System.out.println("This customer already exists");
                return;
            }
        }
        arrayListCustomer.add(customer);
    }

    private Customer getCustomer(String customerName) {
        for(var c : arrayListCustomer) {
            if(c.name().equalsIgnoreCase(customerName)) {
                return c;
            }
        }
        System.out.println("I can 't find this customer");
        return null;
    }

    // add a transaction
    public void addTransaction(String name, double transactionAmount) {
        Customer customerName = getCustomer(name);
        if(customerName != null) {
            customerName.transactions().add(transactionAmount);
        }
    }

    // print statement
    public void printStatement(String name) {
        Customer customerName = getCustomer(name);
        System.out.println("_".repeat(30));
        System.out.println("Customer name: " + customerName.name());
        for(double d : customerName.transactions()) {
            System.out.println("Transactions: " + d);
        }
    }

    public void printAllCustomer() {
        System.out.println(arrayListCustomer);
    }
}