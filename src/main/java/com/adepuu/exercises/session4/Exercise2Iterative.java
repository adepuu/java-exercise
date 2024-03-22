package com.adepuu.exercises.session4;

public class Exercise2Iterative {
    public static void main(String[] args) {
        int n = 10;
        System.out.print("Fibonacci of " + n + " is: " + fib(n));
    }

    static int fib(int n) {
        if (n <= 1)
            return n;
        int prev = 0;
        int next = 1;
        for (int i = 1; i <= n; i++) {
            int curr = prev + next;
            prev = next;
            next = curr;
        }
        return prev;
    }
}
