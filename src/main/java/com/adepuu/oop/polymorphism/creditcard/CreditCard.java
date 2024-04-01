package com.adepuu.oop.polymorphism.creditcard;

// Define an abstract class or interface for CreditCard
public abstract class CreditCard {
    protected String cardNumber;
    protected String cardHolderName;

    public CreditCard(String cardNumber, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    // Abstract method for reward calculation
    public abstract double calculateReward(double amount);
}
