package com.adepuu.oop.polymorphism.creditcard;

// Implement AMEXCard class
public class AMEXCard extends CreditCard {
    public AMEXCard(String cardNumber, String cardHolderName) {
        super(cardNumber, cardHolderName);
    }

    @Override
    public double calculateReward(double amount) {
        // Example reward calculation for AMEX
        return amount * 0.03; // 3% cashback
    }
}
