package com.adepuu.oop;

public abstract class CreditCard {
    protected String cardNumber;
    protected String expiryDate;
    protected String cardHolderName;

    public CreditCard(String cardNumber, String expiryDate, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cardHolderName = cardHolderName;
    }

    public abstract void processPayment(double amount);
}