package com.adepuu.exercises.session5;

import java.util.Arrays;

public class Exercise9 {
    public static void main(String[] args) {
        int[] temperature1 = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] temperature2 = {30, 40, 50, 60};
        int[] temperature3 = {30, 60, 90};

        int[] result1 = waitDays(temperature1);
        int[] result2 = waitDays(temperature2);
        int[] result3 = waitDays(temperature3);

        System.out.println("Temperature : " + Arrays.toString(temperature1) + " Wait days : " + Arrays.toString(result1));
        System.out.println("Temperature : " + Arrays.toString(temperature2) + " Wait days : " + Arrays.toString(result2));
        System.out.println("Temperature : " + Arrays.toString(temperature3) + " Wait days : " + Arrays.toString(result3));
    }
    public static int[] waitDays(int[] temperature){
        int n = temperature.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (temperature[j] > temperature[i]){
                    result[i] = j - i;
                    break;
                }
                
            }
            
        } return result;
    }

}
