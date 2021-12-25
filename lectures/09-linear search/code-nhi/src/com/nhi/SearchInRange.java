package com.nhi;

public class SearchInRange {
    public static void main(String[] args) {
        int[] nums = {18, 12, -7, 3, 14, 28};
        int target = 18;
        System.out.println(linearSearch(nums, target, 1, 4));
    }

    static int linearSearch(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }

        // run a for loop
        for (int i = start; i < end; i++) {
            // check if elem at each index = target
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }
        // this line executes if none of the above return statements have executed
        // hence, target not found
        return -1;
    }
}
