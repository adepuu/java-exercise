package com.adepuu.exercises.session5;

import java.util.Arrays;

public class Exercise6 {
    public static void main(String[] args) {
        int[] array = {1, 2, 1, 3, 5, 1};
        int key = 1;

        System.out.println("Input Array : " + Arrays.toString(array));
        int[] result = removeArray(array, key);
        System.out.println("Removed Array : " + Arrays.toString(result));
    }
    public static int[] removeArray(int[] array, int key){
        int count = 0;

        for (int number : array) {
            if (number != key){
                count++;
            }
        }
        int[] result = new int[count];
        int index = 0;

        for (int number : array){
            if (number != key){
                result[index++] = number;
            }
        }
        return result;
    }

}
