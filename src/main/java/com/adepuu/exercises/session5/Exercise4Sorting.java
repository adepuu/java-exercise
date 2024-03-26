package com.adepuu.exercises.session5;

import java.util.Arrays;

public class Exercise4Sorting {
    /**
     * Java Array Program to Remove Duplicate Elements From an Array
     * <p>
     * Input: [ 1, 2, 2, 3, 3, 3, 4, 5 ]
     * Output: [ 1, 2, 3, 4, 5 ]
     */
    public int[] removeDuplicates(int[] data) {
        if (data.length == 0) return new int[0];
        Arrays.sort(data);
        int[] result = new int[data.length];
        int index = 0;
        for (int i = 0; i < data.length - 1; i++) {
            if (data[i] != data[i + 1]) {
                result[index++] = data[i];
            }
        }
        result[index++] = data[data.length - 1]; // Add the last element
        return Arrays.copyOf(result, index);
    }
}
