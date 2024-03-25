package com.adepuu.exercises.session5;

public class Exercise1 {
    public static void main(String[] args) {
        int[] allNumber = {0, 7, 2, 5, 1, 4};
        int highestNumber = 0;
        for (int i : allNumber) {
            if(highestNumber <= i)
                highestNumber = i;
        }
        System.out.println("The highest number is : "+highestNumber);
    }
}
