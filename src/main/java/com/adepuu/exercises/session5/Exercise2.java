package com.adepuu.exercises.session5;

import java.util.Arrays;

public class Exercise2 {
    /**
     * Java Array Program For Array Rotation
     * Input: arr[] = {1, 2, 3, 4, 5, 6, 7},  d = 2
     * Output:  3 4 5 6 7 1 2
     * Explanation: d=2 so 2 elements are rotated to the end of the array. So, 1 2 is rotated back
     * So, Final result: 3, 4, 5, 6, 7, 1, 2
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(rotateArray(arr, 2)));
    }

    public static int[] rotateArray(int[] inputArray, int d) {

        for (int i = 0; i < d; i++) {
            int last = inputArray[0];
            for (int j = 0; j < inputArray.length - 1; j++) {
                inputArray[j] = inputArray[j + 1];
            }
            inputArray[inputArray.length - 1] = last;
        }

        return inputArray;
    }
}
