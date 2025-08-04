package org.assignment.tlt;

public class Q_105_Payment {

    public void makePayment(int amount) {
        System.out.println("Payment of ₹" + amount + " made in cash.");
    }

    public void makePayment(String cardNumber) {
        System.out.println("Payment made using Credit Card ending with " +
                cardNumber.substring(cardNumber.length() - 4));
    }

    public void makePayment(String walletName, double amount) {
        System.out.println("Payment of ₹" + amount + " made through " + walletName + " wallet.");
    }

    public static void main(String[] args) {
        Q_105_Payment payment = new Q_105_Payment();

        payment.makePayment(2000);                          
        payment.makePayment("1234567812345678");             
        payment.makePayment("Paytm", 750.50);             
    }
}
