package com.adepuu.oop.superMethod;

public class Visa extends CreditCard {
    protected double globalRewardMultiplier = 0.9;
    Visa() {
        super();
        System.out.println("Constructor for Visa");
    }
}
