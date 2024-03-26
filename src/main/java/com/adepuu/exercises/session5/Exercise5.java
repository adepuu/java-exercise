package com.adepuu.exercises.session5;

import java.util.Arrays;

public class Exercise5 {
    public static void main(String[] args) {
        int[] array1 = {8, 7, 5, 2};
        String direction1 = "asc";
        sortArray(array1, direction1);
        System.out.println(Arrays.toString(array1));

        int[] array2 = {8, 7, 5, 2};
        String direction2= "desc";
        sortArray(array2, direction2);
        System.out.println(Arrays.toString(array2));
    }
    public static void sortArray(int[] arr, String direction){
        if (direction.equals("asc")){
            Arrays.sort(arr);
        } else if (direction.equals("desc")) {
            Arrays.sort(arr);
            reverse(arr);
        }
    }

    public static void reverse(int[] arr){
        int left = 0;
        int right = arr.length - 1;
        while (left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

}
