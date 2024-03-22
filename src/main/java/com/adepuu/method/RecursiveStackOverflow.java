package com.adepuu.method;

public class RecursiveStackOverflow {
    public static void main(String[] args) {
        recursiveMethod(0);
    }

    public static void recursiveMethod(int i) {
        // This method calls itself without a proper base case to terminate the recursion
        recursiveMethod(i + 1);
    }
}
