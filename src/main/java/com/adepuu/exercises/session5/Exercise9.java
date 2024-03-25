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
    public static void main(String[] args) {
        int[] input={73,74,75,71,69,72,76,73};
        var result = warmerTemperature(input);
        System.out.println(result);
    }

    public static ArrayList<Integer> warmerTemperature(int[] input){
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < input.length-1; i++) {
            boolean foundWarmer=false;

            for (int j = i+1; j < input.length; j++) {
                if (input[j] > input[i]) {
                    result.add(j - i);
                    foundWarmer = true;
                    break;
                }
            }
            if (!foundWarmer){
                result.add(0);
            }
        }
        result.add(0);
        return result;
    }
}