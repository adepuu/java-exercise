package com.adepuu.exercises.session5;

public class Exercise2 {
    public static void main(String[] args) {
        int number[] = {1, 2, 3, 4, 5, 6, 7,};
        int diff = 2;
        rotateNumber(number, diff);
        printNumber(number);
    }

    public static void rotateNumber(int[] number, int diff){
        int numberLength = number.length;
        reverseNumber(number, 0 , diff - 1);
        reverseNumber(number, diff, numberLength - 1);
        reverseNumber(number, 0, numberLength - 1);
    }

    public static void reverseNumber(int[] number, int start, int end){
        while (start < end){
            int temp = number[start];
            number[start] = number [end];
            number [end] = temp;
            start++;
            end--;
        }
    }

    public static void printNumber(int[] number){
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
    }
}
