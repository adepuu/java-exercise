package com.adepuu.exercises.session5;

import java.util.Arrays;

public class Exercise4 {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 3, 3, 4, 5};
        int[] result = removeDuplicate(array);
        System.out.println("Input : " + Arrays.toString(array));
        System.out.println("Output : " + Arrays.toString(result));
    }
    public static int[] removeDuplicate(int[] array){
        Arrays.sort(array);

        int uniqueNum = 1;
        for (int i = 1; i < array.length ; i++) {
            if (array[i] != array[i - 1]){
                uniqueNum++;
            }
        }

        int[] result = new int [uniqueNum];
        result[0] = array[0];

        int index = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i - 1]){
                result[index++] = array[i];
            }
        }
        return result;
    }
}