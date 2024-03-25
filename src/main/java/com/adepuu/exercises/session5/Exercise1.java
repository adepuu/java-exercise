package com.adepuu.exercises.session5;

public class Exercise1 {
    /**
     * Write a Java Program to Find the Largest Element in Array
     * Input: [ 7, 2, 5, 1, 4]
     * Output: 7
    **/
    public static void main(String[] args) {
        int[] input={7,2,5,1,4,10,11};

        System.out.println(findMax(input));
    }
    public static int findMax(int[] input){
        int max=input[0];
        for (int i = 1; i < input.length; i++) {
            if (max < input[i]) {
                max=input[i];
            }
        }return max;
    }
}
