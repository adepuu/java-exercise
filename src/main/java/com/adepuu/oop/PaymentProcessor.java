package com.adepuu.oop;

public class PaymentProcessor {
    public static void main(String[] args) {
        CreditCard myCard = new Visa("1234 5678 9012 3456", "12/24", "John Doe");
        myCard.processPayment(100.00);
    }
}
