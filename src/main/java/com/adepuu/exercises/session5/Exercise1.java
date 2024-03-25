package com.adepuu.exercises.session5;

public class Exercise1 {
    public static void main(String[] args) {
        int[] number = {7, 2, 5, 1, 4};
        int largestNumber = findLargest(number);
        System.out.println("The largest number in the array is : " + largestNumber);
    }

    public static int findLargest(int[] number) {
        int largestNumber = number[0];
        for (int i = 0; i < number.length; i++) {
            if (number[i] > largestNumber) {
                largestNumber = number[i];
            }
        }
        return largestNumber;
    }
}