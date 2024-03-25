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
        for(int j = 0 ; j < input.length-1;j++){
            if(input[j] > input[j+1]){
                input[j+1] = input[j];
            }
        }
        System.out.print("Output = " + input[input.length-1]);
    }
}
