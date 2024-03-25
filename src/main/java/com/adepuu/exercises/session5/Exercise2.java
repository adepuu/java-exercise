package com.adepuu.exercises.session5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exercise2 {
    /**
     * Java Array Program For Array Rotation
     * Input: arr[] = {1, 2, 3, 4, 5, 6, 7},  d = 2
     * Output:  3 4 5 6 7 1 2
     * Explanation: d=2 so 2 elements are rotated to the end of the array. So, 1 2 is rotated back
     * So, Final result: 3, 4, 5, 6, 7, 1, 2
     */
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        System.out.print("Enter number = ");
        String numArr = myInput.nextLine();
        String[] numArrInt = numArr.replaceAll("\\[","")
                .replaceAll("]","").split(",");
        System.out.print("Enter d = ");
        int d = myInput.nextInt();
        int[] input = new int[numArrInt.length];
        int i = 0;
        for(String num : numArrInt){
            input[i] =Integer.valueOf(num);
            i++;
        }
        List<Integer> numList = new ArrayList<>();
        for(int j = d ; j < input.length ; j++) {
            numList.add(input[j]);
        }
        for(int k = 0; k < d;k++ ){
            numList.add(input[k]);
        }
        System.out.println(numList);
    }
}
