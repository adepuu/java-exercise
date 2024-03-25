package com.adepuu.exercises.session5;

import java.util.ArrayList;

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
    static ArrayList<Integer> daysToWarmer(int[] temperatures) {
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0; i < temperatures.length; i++) {
            int temp = 0;

            for(int j = i + 1; j < temperatures.length; j++) {
                if(temperatures[j] > temperatures[i]) {
                    temp = j - i;
                    break;
                }
            }
            result.add(temp);
        }

        return result;
    }
    public static void main(String[] args) {
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
        System.out.println(daysToWarmer(temperatures));
    }
}
