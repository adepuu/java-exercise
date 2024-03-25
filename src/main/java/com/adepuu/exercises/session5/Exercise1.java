package com.adepuu.exercises.session5;

import java.util.ArrayList;

public class Exercise1 {
    public static void main(String[] args) {
        ArrayList<Integer> inputList = new ArrayList<>();
        inputList.add(25);
        inputList.add(40);
        inputList.add(76);
        inputList.add(39);
        inputList.add(81);

        System.out.println(maxValue(inputList));
    }

    public static Integer maxValue(ArrayList<Integer> inputArray){
        Integer max = Integer.MIN_VALUE;

        for(Integer num : inputArray){
            if(num>max){
                max = num;
            }
        }

        return max;
    }
}
