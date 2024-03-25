package com.adepuu.exercises.session5;

public class Exercise1 {
    public static int largest(int[] array) {
        int largestArray = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > largestArray) {
                largestArray = array[i];
            }
        }
        return largestArray;
    }

    public static void main(String[] args) {
        int[] array = {7, 2, 5, 1, 4};
        int largestElement = largest(array);
        System.out.println("Largest element in the array is: " + largestElement);
    }
}
