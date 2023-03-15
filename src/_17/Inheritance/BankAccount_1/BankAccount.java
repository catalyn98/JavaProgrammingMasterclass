package _17.Inheritance.BankAccount_1;

public class BankAccount {
    private int accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositingFunds(double amount) {
        accountBalance += amount;
        System.out.println("Current account balance after depositing " + accountBalance);
    }

    public void withdrawingFunds(double amount) {
        if(accountBalance - amount < 0)
            System.out.println("Operation can't be completed. Insufficient funds!");
        else
        {
            accountBalance -= amount;
            System.out.println("Current account balance after withdraw " + accountBalance);
        }
    }

    public void describeBankAccount() {
        System.out.println("Name: " + customerName +
                "\nemail: " + email +
                "\nphone number: " + phoneNumber +
                "\naccount number: " + accountNumber +
                "\naccount balance: " + accountBalance);
    }
}
