package com.adepuu.oop.polymorphism.creditcard;

// Main class to demonstrate polymorphism
public class Main {
    public static void main(String[] args) {
        CreditCard visaCard = new VisaCard("1234567890123456", "John Doe");
        CreditCard masterCard = new MasterCard("2345678901234567", "Jane Doe");
        CreditCard amexCard = new AMEXCard("3456789012345678", "Jim Smith");

        double visaReward = visaCard.calculateReward(100);
        double masterReward = masterCard.calculateReward(100);
        double amexReward = amexCard.calculateReward(100);

        System.out.println("Visa Reward: " + visaReward);
        System.out.println("MasterCard Reward: " + masterReward);
        System.out.println("AMEX Reward: " + amexReward);
    }
}
