package com.adepuu.exercises.session5;

import java.util.*;

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
        Scanner myInput = new Scanner(System.in);
        boolean loop = false;
        List<Integer> numArr = new ArrayList<>();

        while(!loop){
            System.out.print("Input Number = ");
            int input = myInput.nextInt();
            numArr.add(input);
            System.out.print("Continue (y) / Stop (n) = ");
            char choice = myInput.next().charAt(0);
            switch (choice){
                case 'y':break;
                case 'n':loop = true;
                         break;

            }
        }
        System.out.println();
        myInput.nextLine();
        System.out.print("Direction (asc) / (desc) = ");
        String directionChoice = myInput.nextLine();
        switch (directionChoice){
            case "asc" : Collections.sort(numArr);
                        System.out.print("Output = " + numArr);
                         break;

            case "desc" :Collections.sort(numArr,Collections.reverseOrder());
                         System.out.print("Output = " + numArr );
                         break;

        }
    }
}
