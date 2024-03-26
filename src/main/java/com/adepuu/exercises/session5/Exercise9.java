package com.adepuu.exercises.session5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

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
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] temprature = new int[n];
        List<Integer> tempResult = new ArrayList<>();

        int gap = 0, count = 0;

        for (int i = 0; i < n; i++){
            temprature[i] = input.nextInt();
        }

        for (int j = 0; j < temprature.length; j++){
            gap = 0;
            count = 0;
            for (int k = j + 1; k < temprature.length; k++){
                if (temprature[j] < temprature[k]){
                    gap+=count+1;
                    break;
                }
                count+=1;
            }
            tempResult.add(gap);
        }
        System.out.println(tempResult);
    }
}