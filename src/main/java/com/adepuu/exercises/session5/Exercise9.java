package com.adepuu.exercises.session5;
import java.util.*;
public class Exercise9 {
    /**
     * Java Program to get the number of days you have to wait after the i-th day to get a warmer temperature
     *
     * Example 1:
     * Input: temperatures = [73,74,75,71,69,72,76,73]
     * Output: [1,1,4,2,1,1,0,0]
     *
     * Example 2:
     * Input: temperatures = [30,40,50,60]
     * Output: [1,1,1,0]
     *
     * Example 3:
     * Input: temperatures = [30,60,90]
     * Output: [1,1,0]
     */

    public static int[] getDailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];

        for (int i = 0; i < temperatures.length; i++) {
            int days = 0;
            int j = i + 1;
            while ( j < temperatures.length) {
                days++;
                if (temperatures[j] > temperatures[i]) {
                    result[i] = days;
                    break;
                }

                j++;
            }
        }

        return result;
    }
    public static void main(String[] args) {
        int[] temperatures = {30, 40, 50, 60};
        int[] result = getDailyTemperatures(temperatures);
        System.out.println(Arrays.toString(result));
    }
}
