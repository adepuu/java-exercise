package com.adepuu.oop.polymorphism.overloading;

public class Payment {
    // Method to process a payment with a single amount
    public void processPayment(double amount) {
        System.out.println("Processing payment of $" + amount);
    }

    // Overloaded method to process a payment with a discount
    public void processPayment(double amount, double discount) {
        double finalAmount = amount - discount;
        System.out.println("Processing payment of $" + finalAmount + " with a discount of $" + discount);
    }

    // Overloaded method to process a payment with a discount and a coupon code
    public void processPayment(double amount, double discount, String couponCode) {
        double finalAmount = amount - discount;
        System.out.println("Processing payment of $" + finalAmount + " with a discount of $" + discount + " and coupon code: " + couponCode);
    }

    public static void main(String[] args) {
        Payment paymentProcessor = new Payment();

        // Process a payment with a single amount
        paymentProcessor.processPayment(100.00);

        // Process a payment with a discount
        paymentProcessor.processPayment(100.00, 10.00);

        // Process a payment with a discount and a coupon code
        paymentProcessor.processPayment(100.00, 10.00, "SAVE10");
    }
}
