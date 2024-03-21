package com.adepuu.conditional;

public class Ternary {
    static int number = 10;
    public static void main(String[] args) {

        // basic syntax for ternary operator in java is
        // variable = condition ? expressionIfTrue : expressionIfFalse;
        int num1 = 10;
        int num2 = 20;
        int res = (num1 > num2) ? (num1 + num2) : (num1 - num2);
        System.out.println("Result = " + res); // Output: Result = -10

        // Here, the ternary operator is used to replace an if-else statement,
        // making the code more concise and readable
        String result = (number > 0) ? "Positive Number" : "Negative Number";
        System.out.println(result); // Output: Positive Number

        // This example demonstrates the use of a nested ternary operator
        // to replace an if-else-if ladder, simplifying the code
        String numberType = (number > 0) ? "Its a positive" : (number < 0) ? "Its a negative" : "Its 0";
        System.out.println(numberType);
    }
}
