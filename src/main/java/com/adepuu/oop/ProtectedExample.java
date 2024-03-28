package com.adepuu.oop;

import com.adepuu.oop.Bank.Bank;
import com.adepuu.oop.Bank.BankAccount;

public class ProtectedExample {
    public static void main(String[] args) {
        Bank bankBri = new Bank("1241421", "BRI");
        bankBri.deposit(100000);
        System.out.println(bankBri.getBalance());
        System.out.println(bankBri.getBankName());
        // Can't access from other than the child

        // BankAccount account = new BankAccount("124114141");
        // Can't access from other than the child
        // var accNumber = account.getAccountNumber();
        // System.out.println(accNumber);
    }
}
