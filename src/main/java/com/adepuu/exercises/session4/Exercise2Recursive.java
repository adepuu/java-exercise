package com.adepuu.exercises.session4;

public class Exercise2Recursive {
    public static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 2000;
        System.out.print("Fibonacci of " + n + " is " + fibonacci(n));
    }
}

