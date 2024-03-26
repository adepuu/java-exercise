package com.adepuu.exercises.session5;

import java.util.Arrays;

public class Exercise6 {
    /**
     * Java Array Program to Remove All Occurrences of an Element in an Array
     * <p>
     * Input: array = [ 1, 2, 1, 3, 5, 1 ] , key = 1
     * Output: [2, 3, 5]
     * <p>
     * Explanation: all the occurrences of element 1 is removed from the array So, array becomes from
     * [ 1, 2, 1, 3, 5, 1 ]  to
     * Final result: [2, 3, 5]
     */
    public int[] removeDuplicates(int[] array, int key) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != key) {
                array[index++] = array[i];
            }
        }
        return Arrays.copyOf(array, index);
    }
}
