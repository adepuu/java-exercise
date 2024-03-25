package com.adepuu.exercises.session5;

public class Exercise1 {
    public int getHighestNumber(int[] input) {
        if (input.length == 0) return 0;

        int max = input[0]; // Initialize max with the first element of the array

        for (int i = 1; i < input.length; i++) { // Start from the second element
            if (input[i] > max) {
                max = input[i]; // Update max if the current element is larger
            }
        }
        return max;
    }
}
