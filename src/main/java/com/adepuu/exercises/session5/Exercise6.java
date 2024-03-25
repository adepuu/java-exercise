package com.adepuu.exercises.session5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise6 {
    /**
     * Java Array Program to Remove All Occurrences of an Element in an Array
     *
     * Input: array = [ 1, 2, 1, 3, 5, 1 ] , key = 1
     * Output: [2, 3, 5]
     *
     * Explanation: all the occurrences of element 1 is removed from the array So, array becomes from
     * [ 1, 2, 1, 3, 5, 1 ]  to
     * Final result: [2, 3, 5]
     */
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        System.out.print("Enter number = ");
        String numArr = myInput.nextLine();
        String[] numArrInt = numArr.replaceAll("\\[","")
                .replaceAll("]","").split(",");
        List<Integer> intList = new ArrayList<>();
        System.out.print("Enter Key = ");
        int key = myInput.nextInt();
        for(String num : numArrInt){
            if(Integer.valueOf(num) != key) {
                intList.add(Integer.valueOf(num));
            }
        }
        System.out.println(intList);
    }
}
