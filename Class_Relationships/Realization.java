interface Payment {
    void pay();
}
class CreditCardPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("Payment made using Credit Card.");
    }
}
class PayPalPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("Payment made using PayPal.");
    }
}

public class Realization {
    public static void main(String[] args) {
        Payment payment1 = new CreditCardPayment();
        Payment payment2 = new PayPalPayment();
        
        payment1.pay(); // Output: Payment made using Credit Card.
        payment2.pay(); // Output: Payment made using PayPal.
    }
}