package com.adepuu.exception;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String msg) {
        super(msg);
    }
}

public class CustomException {
    public static void main(String[] args) {
        int amount = 10;
        int balance = 5;
        try {
            withdraw(amount, balance);
        } catch (InsufficientFundsException e) {
            e.printStackTrace();
            System.out.println(e.toString());
        }
    }
    static void withdraw(int amount, int balance) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds to withdraw: " + amount);
        }
        System.out.println("Withdrawed!");
    }
}
