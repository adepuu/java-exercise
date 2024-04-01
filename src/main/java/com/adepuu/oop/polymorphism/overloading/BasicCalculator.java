package com.adepuu.oop.polymorphism.overloading;

public class BasicCalculator {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    // Overloaded method to add an integer and a double
    public double add(int a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        BasicCalculator calculator = new BasicCalculator();

        // Adding two integers
        System.out.println("Sum of integers: " + calculator.add(5, 3));

        // Adding two doubles
        System.out.println("Sum of doubles: " + calculator.add(5.5, 3.5));

        // Adding an integer and a double
        System.out.println("Sum of integer and double: " + calculator.add(5, 3.5));
    }
}
