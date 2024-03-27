package com.adepuu.oop.Bank;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        // Add validation and logic for deposit
        balance += amount;
    }

    public void withdraw(double amount) {
        // Add validation and logic for withdrawal
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    // Protected method to get the account number
    protected String getAccountNumber() {
        return accountNumber;
    }

    // Default (package-private) method to print account details
    void printAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

