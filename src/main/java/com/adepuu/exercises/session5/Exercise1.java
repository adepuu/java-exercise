package com.adepuu.exercises.session5;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        System.out.print("Enter number = ");
        String numArr = myInput.nextLine();
        String[] numArrInt = numArr.replaceAll("\\[","")
                .replaceAll("]","").split(",");
        int[] input = new int[numArrInt.length];
        int i = 0;
        for(String num : numArrInt){
            input[i] =Integer.valueOf(num);
            i++;
        }
        Arrays.sort(input);
        System.out.print("Output = " + input[input.length-1]);
    }
}
