package com.adepuu.exercises.session5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

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
        Scanner myInput = new Scanner(System.in);
        System.out.print("Input Temperatures = ");
        String numArr = myInput.nextLine();
        List<Integer> tempArr = new ArrayList<>();
        String[] numArrInt = numArr.replaceAll("\\[","")
                .replaceAll("]","").split(",");
        int[] arr = new int[numArrInt.length];
        for(int i=0; i<numArrInt.length; i++) {
            arr[i] = Integer.parseInt(numArrInt[i]);
        }
        int sum = 0;
        int count = 0;
        for(int j = 0;j<arr.length;j++){
            sum = 0;
            count = 0;
            for(int k = j+1;k<arr.length;k++){
               if(arr[j] < arr[k]){
                   sum+=count+1;
                   break;
               }
               count++;
            }
            tempArr.add(sum);
        }
        System.out.println(tempArr);

    }
}
