package com.adepuu.oop;

interface internationalPayment {
    void pcidss();
}
public class Visa extends CreditCard implements internationalPayment {
    public Visa(String cardNumber, String expiryDate, String cardHolderName) {
        super(cardNumber, expiryDate, cardHolderName);
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Visa payment of $" + amount);
        pcidss();
        // Implement specific Visa payment processing logic here
    }
    // Setter method
    public void pcidss() {

    }
}