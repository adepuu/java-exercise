package com.adepuu.exercises.session5;

import java.util.ArrayList;
import java.util.Scanner;

public class ScanArray {
    public ArrayList<Integer> inputArray(){
        Scanner numInput = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<Integer>();
        boolean isDone = false;
        
        do {
            System.out.print("Input a number : ");
            nums.add(numInput.nextInt());
            System.out.print("Input again? (press y to continue) ");
            numInput.nextLine();
            if(!numInput.nextLine().equals("y"))
            isDone = true;
        } while (!isDone);
        numInput.close();

        return nums;
    }
}
