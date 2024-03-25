package com.adepuu.exercises.session4;

import java.util.HashMap;
import java.util.Map;

public class Exercise2Memoization {
    private static final Map<Integer, Integer> memo = new HashMap<>();

    // Initialize the memoization map with the base cases
    static {
        memo.put(0, 0);
        memo.put(1, 1);
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        int result = fibonacci(n - 1) + fibonacci(n - 2);
        memo.put(n, result);
        return result;
    }

    public static void main(String[] args) {
        int n = 2000; // Example input
        System.out.println("Fibonacci of " + n + " is " + fibonacci(n));
    }
}
