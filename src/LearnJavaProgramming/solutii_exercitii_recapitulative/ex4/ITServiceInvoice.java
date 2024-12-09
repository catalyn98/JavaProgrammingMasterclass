package LearnJavaProgramming.solutii_exercitii_recapitulative.ex4;

// Clasa derivată ITServiceInvoice
public class ITServiceInvoice extends Invoice {
    private String serviceDescription;

    // Constructor
    public ITServiceInvoice(String id, double amount, boolean paid, String serviceDescription) {
        super(id, amount, paid); // Inițializare clasa de bază
        this.serviceDescription = serviceDescription;
    }

    // Getter pentru serviceDescription
    public String getServiceDescription() {
        return serviceDescription;
    }

    // Metodă pentru calcularea TVA-ului
    public double calculateVAT() {
        return getAmount() * 0.19;
    }
}
