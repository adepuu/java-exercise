package com.adepuu.exercises.session5;

public class Exercise5 {


    static void sortArray(int[] nums, String direction) {
        int temp;

        for(int i = 0; i < nums.length - 1; i++) {
            for(int j = 0; j < nums.length - i - 1; j++) {
                if(direction == "asc") {
                    if (nums[j] > nums[j + 1]) {
                        temp = nums[j];
                        nums[j] = nums[j + 1];
                        nums[j + 1] = temp;
                    }
                }
                if(direction == "desc") {
                    if (nums[j] < nums[j + 1]) {
                        temp = nums[j];
                        nums[j] = nums[j + 1];
                        nums[j + 1] = temp;
                    }
                }
            }
        }

        System.out.print("[");
        for(int num: nums) {
            System.out.print(num);
        }
        System.out.println("]");
    }
    public static void main(String[] args) {
        int[] nums = {8, 7, 5, 2};
        sortArray(nums, "asc");
        sortArray(nums, "desc");
    }
}
