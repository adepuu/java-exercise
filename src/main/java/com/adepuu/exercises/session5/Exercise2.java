package com.adepuu.exercises.session5;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise2 {
    /**
     * Java Array Program For Array Rotation
     * Input: arr[] = {1, 2, 3, 4, 5, 6, 7},  d = 2
     * Output:  3 4 5 6 7 1 2
     * Explanation: d=2 so 2 elements are rotated to the end of the array. So, 1 2 is rotated back
     * So, Final result: 3, 4, 5, 6, 7, 1, 2
     */
    public static void main(String[] args) {
        ArrayList<Integer> arr = ScanArray.inputArray();
        Scanner numInput = new Scanner(System.in);
        boolean isDone = true;
        int d = 0;
        
        System.out.print("Input how much number you want to rotate : ");

        do {
            d = numInput.nextInt();
            if(d > arr.size()){
                isDone = false;
                System.out.print("You can't rotate more than your number, input less : ");
            }
            else{
                isDone= true;
            }
        } while (!isDone);

        numInput.close();

        for(int i = 0; i < d; i++){
            int tempNum = arr.get(i);
            arr.add(tempNum);
        }
        for(int i = 0; i < d; i++){
            arr.remove(0);
        }
        
        System.out.println("This is your rotated number : " + arr.toString());
    }
}
