package com.adepuu.exercises.session5;

import java.util.Arrays;

public class Exercise5 {
    public static void main(String[] args) {
        int[] input = {8,2,1,6,15,3,34,90,7};
        System.out.println(Arrays.toString(sortArray(input, SORT_DIRECTION.DESC)));
    }
    
    public static int[] sortArray(int[] arr, SORT_DIRECTION direction){
        boolean swapped;
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                switch (direction) {
                    case ASC -> {
                        if (arr[j] > arr[j + 1]) {
                            int temp = arr[j];
                            arr[j] = arr[j + 1];
                            arr[j + 1] = temp;
                            swapped = true;
                        }
                    }
                    case DESC -> {
                        if (arr[j] < arr[j + 1]) {
                            int temp = arr[j];
                            arr[j] = arr[j + 1];
                            arr[j + 1] = temp;
                            swapped = true;
                        }
                    }
                }
            }
            if (!swapped){
                break;
            }
        }
        return arr;
    }

    public enum SORT_DIRECTION {ASC, DESC}
}
