package com.adepuu.exercises.session4;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise3 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] evenNumbers = removeOdds(numbers);
        System.out.println(Arrays.toString(evenNumbers));
    }

    public static int[] removeOdds(int[] input) {
        ArrayList<Integer> evenList = new ArrayList<>();
        for (int number : input) {
            if (number % 2 == 0) {
                evenList.add(number);
            }
        }
        // Convert ArrayList back to array
        int[] evenArray = new int[evenList.size()];
        for (int i = 0; i < evenList.size(); i++) {
            evenArray[i] = evenList.get(i);
        }
        return evenArray;
    }
}
