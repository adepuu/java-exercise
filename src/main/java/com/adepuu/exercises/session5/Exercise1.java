package com.adepuu.exercises.session5;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) throws ClassNotFoundException{
        Scanner input = new Scanner(System.in);
        int nLength = 5;
        int[] array = new int[nLength];
        int maxNumber = array[0];

        System.out.println("Input your Array: ");
        for (int i = 0; i < nLength; i++){
            array[i] = input.nextInt();
            maxNumber = Math.max(maxNumber, array[i]);
        }

        input.close();

        System.out.println("The biggest number is: "+maxNumber);
    }
}
