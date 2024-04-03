package com.adepuu.exercises.session5;

public class Exercise2 {
    /**
     * Java Array Program For Array Rotation
     * Input: arr[] = {1, 2, 3, 4, 5, 6, 7},  d = 2
     * Output:  3 4 5 6 7 1 2
     * Explanation: d=2 so 2 elements are rotated to the end of the array. So, 1 2 is rotated back
     * So, Final result: 3, 4, 5, 6, 7, 1, 2
     */
    public static int[] rotateArray(int[] arr, int r) {
        if (r > arr.length) {
            System.out.println("Rotation value cannot be bigger than array length");
            return arr;
        }

        for (int i = 0; i < r; i++) {
            int firstElement = arr[0];
            for (int j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }

            arr[arr.length - 1] = firstElement;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int r = 2;
        int[] rotatedArray = rotateArray(array, r);

        for (int num : rotatedArray) {
            System.out.print(num + " ");
        }
    }
}
