package com.adepuu.oop.Utils;

public class StaticExample {
    public static void main(String[] args) {
        // Using the static method
        // without creating an instance of MathUtils
        int result = Math.square(5);
//        Math util = new Math();
//        int result = util.square(5);
        System.out.println("The square of 5 is: " + result);
    }
}
