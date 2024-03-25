package com.adepuu.exercises.session5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Exercise8 {
    public static void main(String[] args) {
        int[] number1 = {4, 3, 2, 7, 8, 2, 3, 1};
        int[] number2 = {1, 1, 2};
        int[] number3 = {1};

        System.out.println("Original number : " );
        System.out.println(Arrays.toString(number1));
        System.out.println(Arrays.toString(number2));
        System.out.println(Arrays.toString(number3));

        System.out.println("Duplicate number : ");
        System.out.println(findDuplicate(number1));
        System.out.println(findDuplicate(number2));
        System.out.println(findDuplicate(number3));
    }

    public static ArrayList<Integer> findDuplicate(int[] number){
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < number.length; i++){
            if (!map.containsKey(number[i])) {
                map.put(number[i], 1);
            } else {
                map.put(number[i], map.get(number[i]) + 1);
            }
        }
        map.forEach((key, value) -> {
            if (value > 1){
                result.add(key);
            }
        });
        return result;
    }


}