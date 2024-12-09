package LearnJavaProgramming.solutii_exercitii_recapitulative.ex4;

// Clasa Test
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        // Listă de facturi
        List<ITServiceInvoice> invoices = new ArrayList<>();

        // Adăugare facturi
        invoices.add(new ITServiceInvoice("INV001", 1000, false, "Setup server"));
        invoices.add(new ITServiceInvoice("INV002", 500, true, "Maintenance contract"));
        invoices.add(new ITServiceInvoice("INV003", 1500, false, "Cybersecurity audit"));

        // Calculul totalului facturilor neplătite
        double totalUnpaid = 0;
        System.out.println("Facturi neplătite:");
        for (ITServiceInvoice invoice : invoices) {
            if (!invoice.isPaid()) {
                double totalWithTVA = invoice.getAmount() + invoice.calculateVAT();
                totalUnpaid += totalWithTVA;
                System.out.println("- " + invoice.getServiceDescription() + ": " + totalWithTVA);
            }
        }

        // Afișare total
        System.out.println("Total facturi neplătite (inclusiv TVA): " + totalUnpaid);
    }
}
