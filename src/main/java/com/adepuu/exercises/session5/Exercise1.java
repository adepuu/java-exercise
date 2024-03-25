package com.adepuu.exercises.session5;

import java.util.ArrayList;

public class Exercise1 {
    public static void main(String[] args) {
        ArrayList<Integer> allNumber = new ArrayList<Integer>();

        allNumber = ScanArray.inputArray();
        
        int highestNumber = 0;
        for (int i : allNumber) {
            if(highestNumber <= i)
                highestNumber = i;
        }
        System.out.println("The highest number is : "+highestNumber);
    }
}
