package pkg_oops;

public class PaymentClass {
	public static void main(String[] args) {
        CreditCardPayment credit = new CreditCardPayment();
        credit.makePayment(1000.0);

        PayPalPayment paypal = new PayPalPayment();
        paypal.makePayment(2000.0);
        
    }
}