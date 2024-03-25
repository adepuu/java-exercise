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
        ArrayList<Integer> temperatures = ScanArray.inputArray();
        ArrayList<Integer> dayToWait = new ArrayList<Integer>();

        for(int i = 0; i < temperatures.size(); i++){
            int dayCount = 0;
            try {
                for(int j = i+1; j <= temperatures.size(); j++){
                    dayCount += 1;
                    if(temperatures.get(i)<temperatures.get(j)){
                        dayToWait.add(dayCount);
                        break;
                    }
                }    
            } catch (Exception e) {
                dayToWait.add(0);
            }
        }
        System.out.println(dayToWait.toString());
    }
}
