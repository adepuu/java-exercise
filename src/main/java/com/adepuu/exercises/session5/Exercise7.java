package com.adepuu.exercises.session5;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise7 {
    /**
     * Java String Program to Check Anagram
     *
     * Example 1:
     * Input: s = "anagram", t = "nagaram"
     * Output: true
     *
     * Example 2:
     * Input: s = "rat", t = "car"
     * Output: false
     */
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Input the first text : ");
        String firstText = myScanner.nextLine();
        System.out.print("Input the second text : ");
        String secondText = myScanner.nextLine();
        myScanner.close();
        boolean isAnagram = true;

        String[] firstArr = firstText.split("");
        String[] secondtArr = secondText.split("");
        if(firstArr.length == secondtArr.length){
            Arrays.sort(firstArr);
            Arrays.sort(secondtArr);
            for(int i = 0; i < firstArr.length; i++){
                if(!firstArr[i].equals(secondtArr[i])){
                    isAnagram = false;
                }
            }
        }
        else{
            isAnagram=false;
        }
        System.out.println("Is it anagram? : " + isAnagram);
    }
}
