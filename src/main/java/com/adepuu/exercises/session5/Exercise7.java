package com.adepuu.exercises.session5;

import java.util.*;

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
        Scanner input = new Scanner(System.in);

        System.out.println("The anagram word");
        System.out.println("Input first word: ");
        String firstWord = input.next();
        System.out.println("Input second word: ");
        String secondWord = input.next();

        input.close();

        System.out.println(isAnagram(firstWord, secondWord));

//        boolean isAnagram = true;
//
//        String firstWord = input.next();
//        Set<String> secondWord = new HashSet<String>();
//        secondWord.add(input.next());
//
//        for (char i : firstWord.toCharArray()) {
//            if (!secondWord.equals(firstWord.toCharArray())) {
//                isAnagram = false;
//            } else {
//                isAnagram = true;
//            }
//        }
//
//        if (!secondWord.contains(firstWord.length())){
//            isAnagram = false;
//        }
//        System.out.println(isAnagram);

    }

    private static boolean isAnagram(String firstWord, String secondWord){
        if (firstWord.length() != secondWord.length()){
            return false;
        }

        HashMap<String, Integer> firstAnagram = new HashMap<>();
        HashMap<String, Integer> secondAnagram = new HashMap<>();

        for (int i = 0; i < firstWord.length(); i++){
            if (firstAnagram.containsKey(firstWord.charAt(i))){
                firstAnagram.put(String.valueOf(firstWord.charAt(i)), firstAnagram.get(firstWord.charAt(i))+1);
            } else {
                firstAnagram.put(String.valueOf(firstWord.charAt(i)), 1);
            }
        }

        for (int i = 0; i < secondWord.length(); i++){
            if (secondAnagram.containsKey(secondWord.charAt(i))){
                secondAnagram.put(String.valueOf(secondWord.charAt(i)), firstAnagram.get(secondWord.charAt(i))+1);
            } else {
                secondAnagram.put(String.valueOf(secondWord.charAt(i)), 1);
            }
        }

        if (firstAnagram.equals(secondAnagram)){
            return true;
        } else {
            return false;
        }
    }
}
