package com.adepuu.exercises.session5;

public class Exercise1 {
    public static void main(String[] args) {
        int[] numbers = {7, 2, 5, 1, 4};
        int max = numbers[0];
        for (int number: numbers) {
            if(number > max) {
                max = number;
            }
        }

        System.out.println("The largest element is " + max);
    }
}
