package com.adepuu.method;

public class Recursive {
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int n = 5; // Example: Calculate the factorial of 5
        System.out.println(factorial(n));
    }
}
