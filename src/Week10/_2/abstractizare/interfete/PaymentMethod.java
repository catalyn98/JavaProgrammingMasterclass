package Week10._2.abstractizare.interfete;

public interface PaymentMethod {
    // platforma adaugă o taxă de procesare pentru acoperirea costurilor de tranzacție, cum ar fi taxele pentru procesarea plăților
    double procesingFee = 0.50; // implicit public static final
    void processPayment(double amount); // Metodă abstractă
}
