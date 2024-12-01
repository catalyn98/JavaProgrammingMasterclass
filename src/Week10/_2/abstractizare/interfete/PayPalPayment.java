package Week10._2.abstractizare.interfete;

public class PayPalPayment implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Plată cu PayPal: " + amount);
    }
}
