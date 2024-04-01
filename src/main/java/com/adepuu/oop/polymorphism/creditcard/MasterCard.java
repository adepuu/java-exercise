package com.adepuu.oop.polymorphism.creditcard;

// Implement MasterCard class
public class MasterCard extends CreditCard {
    public MasterCard(String cardNumber, String cardHolderName) {
        super(cardNumber, cardHolderName);
    }

    @Override
    public double calculateReward(double amount) {
        // Example reward calculation for MasterCard
        return amount * 0.015; // 1.5% cashback
    }
}
