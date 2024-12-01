package Week10._2.abstractizare.interfete;

public class CreditCardPayment implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Plată cu card de credit: " + amount);
    }
}
