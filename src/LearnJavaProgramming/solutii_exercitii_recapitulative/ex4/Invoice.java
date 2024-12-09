package LearnJavaProgramming.solutii_exercitii_recapitulative.ex4;

// Clasa de bază Invoice
public class Invoice {
    private String id;
    private double amount;
    private boolean paid;

    // Constructor
    public Invoice(String id, double amount, boolean paid) {
        this.id = id;
        this.amount = amount;
        this.paid = paid;
    }

    // Getters
    public double getAmount() {
        return amount;
    }

    public boolean isPaid() {
        return paid;
    }
}
