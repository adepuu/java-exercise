package com.adepuu.exercises.session5;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise5 {
    /**
     * Java Array Program to sort array in increasing & decreasing order
     *
     * Example 1:
     * Input: [ 8, 7, 5, 2], direction = “asc”
     * Output: [ 2, 5, 7, 8 ]
     *
     * Example 2:
     * Input: [ 8, 7, 5, 2], direction = “desc”
     * Output: [ 8,7, 5, 2 ]
     */
    public static void main(String[] args) {
        ArrayList<Integer> numberArray = ScanArray.inputArray();
        Scanner myScanner = new Scanner(System.in);

        String direction = "";
        boolean flag = true;
        
        System.out.print("Do you want to sort Ascending or Descending? (asc or desc) : ");
        do {
            direction = myScanner.nextLine();
            if(direction.toLowerCase().equals("asc") || direction.toLowerCase().equals("desc")){
                flag = true;
            }
            else{
                System.out.print("Please input only (asc or desc) : ");
                flag = false;
            }
        } while (!flag);
        
        myScanner.close();
        int tempNum;

        if(direction.toLowerCase().equals("asc")){
            for(int i = 0; i < numberArray.size(); i++){
                for(int j = i+1; j < numberArray.size(); j++){
                    if(numberArray.get(i) > numberArray.get(j)){
                        tempNum = numberArray.get(i);
                        numberArray.set(i, numberArray.get(j));
                        numberArray.set(j, tempNum);
                    }
                }
            }
        } else {
            for(int i = 0; i < numberArray.size(); i++){
                for(int j = i+1; j < numberArray.size(); j++){
                    if(numberArray.get(i) < numberArray.get(j)){
                        tempNum = numberArray.get(i);
                        numberArray.set(i, numberArray.get(j));
                        numberArray.set(j, tempNum);
                    }
                }
            }
        }
        System.out.println("This is your "+direction.toUpperCase()+ " numbers : " + numberArray.toString());
    }
}
