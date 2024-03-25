package com.adepuu.exercises.session5;

public class Exercise1 {
    public static int findMax (int[] arr) {
        int getMax= Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > getMax) {
                getMax = arr[i];
            }
        }

        return getMax;
    }
    public static void main (String[] args) {
        int[] array = {7, 2, 5, 1, 4};
        System.out.print(findMax(array));
    }
}
