package com.adepuu.exercises.session5;

import java.util.Arrays;

public class Exercise4BruteForce {
    /**
     * Java Array Program to Remove Duplicate Elements From an Array
     * <p>
     * Input: [ 1, 2, 2, 3, 3, 3, 4, 5 ]
     * Output: [ 1, 2, 3, 4, 5 ]
     *
     * @param args
     */
    public int[] removeDuplicates(int[] data) {
        int index = 0;
        for (int i = 0; i < data.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (data[i] == data[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                data[index++] = data[i];
            }
        }
        return Arrays.copyOf(data, index);
    }
}
