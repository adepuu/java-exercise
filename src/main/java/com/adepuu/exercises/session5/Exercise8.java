package com.adepuu.exercises.session5;

import java.util.*;

public class Exercise8 {
    /**
     * Java String Program to Find all Duplicates on Array
     *
     * Example 1:
     * Input: nums = [4,3,2,7,8,2,3,1]
     * Output: [2,3]
     *
     * Example 2:
     * Input: nums = [1,1,2]
     * Output: [1]
     *
     * Example 3:
     * Input: nums = [1]
     * Output: []
     */
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        System.out.print("Enter number = ");
        String numArr = myInput.nextLine();
        String[] numArrInt = numArr.replaceAll("\\[","")
                .replaceAll("]","").split(",");
        List<Integer> intList = new ArrayList<>();
        int [] arr = new int[numArrInt.length];
        int sum = 0;
        HashMap<Integer,Integer> count = new HashMap<>();
        for(int i=0; i<numArrInt.length; i++) {
            arr[i] = Integer.parseInt(numArrInt[i]);
        }
        for(int c :arr){
            if(count.containsKey(c)){
                count.put(c,count.get(c) + 1);
            }else{
                count.put(c,1);
            }
        }
        for(Map.Entry<Integer,Integer> set: count.entrySet()){
            if(set.getValue() != 1){
                intList.add(set.getKey());
            }
        }
        System.out.println("Output = " + intList);

    }
}
