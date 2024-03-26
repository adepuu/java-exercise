package com.adepuu.exercises.session5;

public class Exercise2 {
    /**
     * Java Array Program For Array Rotation
     * Input: arr[] = {1, 2, 3, 4, 5, 6, 7},  d = 2
     * Output:  3 4 5 6 7 1 2
     * Explanation: d=2 so 2 elements are rotated to the end of the array. So, 1 2 is rotated back
     * So, Final result: 3, 4, 5, 6, 7, 1, 2
     */
    public int[] rotateLeft(int[] input, int shiftPosition) {
        int n = input.length;
        // Create a temporary array to hold the shifted elements
        int[] tempArray = new int[shiftPosition];

        // Copy the first 'shiftPosition' elements into the temporary array
        System.arraycopy(input, 0, tempArray, 0, shiftPosition);

        // Shift the rest of the elements in the original array by 'shiftPosition' places
        for (int i = 0; i < n - shiftPosition; i++) {
            input[i] = input[i + shiftPosition];
        }

        // Copy the shifted elements from the temporary array back into the original array
        System.arraycopy(tempArray, 0, input, n - shiftPosition, shiftPosition);
        return input;
    }
}
