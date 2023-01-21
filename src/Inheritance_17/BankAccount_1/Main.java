package Inheritance_17.BankAccount_1;

public class Main {

    public static void main(String[] args) {
        Inheritance_17.BankAccount_1.BankAccount bankAccount = new Inheritance_17.BankAccount_1.BankAccount();
        bankAccount.setCustomerName("Victoria Justice");
        bankAccount.setEmail("victoria_justice@yahoo.com");
        bankAccount.setPhoneNumber("+(40) 737 728 737");
        bankAccount.setAccountNumber(1998);
        bankAccount.setAccountBalance(1395.67);
        bankAccount.describeBankAccount();
        System.out.println();
        bankAccount.depositingFunds(1000.00);
        bankAccount.withdrawingFunds(100000.00);
    }
}
