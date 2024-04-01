package com.adepuu.oop.polymorphism.creditcard;

// Implement VisaCard class
public class VisaCard extends CreditCard {
    public VisaCard(String cardNumber, String cardHolderName) {
        super(cardNumber, cardHolderName);
    }

    @Override
    public double calculateReward(double amount) {
        // Example reward calculation for Visa
        return amount * 0.02; // 2% cashback
    }
}
