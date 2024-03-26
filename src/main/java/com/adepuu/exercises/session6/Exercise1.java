package com.adepuu.exercises.session6;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        boolean loop = false;
        Scanner myInput = new Scanner(System.in);
        int sum = 0;
        while(!loop) {
        System.out.print("Input = ");
        String input = myInput.next();
        if(input.equals("q")){
            loop = true;
        }else{
            try{
                sum += Integer.parseInt(input);
            } catch (Exception e)
            {
                System.out.println("Invalid input. Please enter a valid number or 'q' to finish.");
            }
            }
        }
        System.out.println("Total = " + sum);
    }
}
