package Week10._2.abstractizare.interfete;

import static Week10._2.abstractizare.interfete.PaymentMethod.procesingFee;

public class Test {
    public static void main(String[] args) {
        PaymentMethod payment = new CreditCardPayment();
        payment.processPayment(100.50 + procesingFee); // Va afișa "Plată cu card de credit: 101.0"

        payment = new PayPalPayment();
        payment.processPayment(200.75 + procesingFee); // Va afișa "Plată cu PayPal: 201.25"
    }
}