package com.adepuu.exercises.session5;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner numInput = new Scanner(System.in);
        ArrayList<Integer> allNumber = new ArrayList<Integer>();
        boolean isDone = false;
        
        do {
            System.out.print("Input a number : ");
            allNumber.add(numInput.nextInt());
            System.out.print("Input again? (press y to continue) ");
            numInput.nextLine();
            if(!numInput.nextLine().equals("y"))
            isDone = true;
        } while (!isDone);
        numInput.close();

        int highestNumber = 0;
        for (int i : allNumber) {
            if(highestNumber <= i)
                highestNumber = i;
        }
        System.out.println("The highest number is : "+highestNumber);
    }
}
