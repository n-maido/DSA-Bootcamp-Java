package com.nhi;

public class Main {
    public static void main(String[] args) {
        int[] nums = {23, 45, 1, 2, 3, 8, 19, -3, 16, -11, 28};
        int target = 19;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }

    // search the array: return the index if item found
    // otherwise, return -1
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        // run a for loop
        for (int i = 0; i < arr.length; i++) {
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

    // search the array: return the item if item found
    // otherwise, return Integer.MAX_VALUE
    static int linearSearch2(int[] arr, int target) {
        if (arr.length == 0) {
            return Integer.MAX_VALUE;
        }

        // run a for loop
        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }
        // this line executes if none of the above return statements have executed
        // hence, target not found
        return Integer.MAX_VALUE;
    }

    // search the array: return true if item found
    // otherwise, return false
    static boolean linearSearch3(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }

        // run a for loop
        for (int element : arr) {
            if (element == target) {
                return true;
            }
        }
        // this line executes if none of the above return statements have executed
        // hence, target not found
        return false;
    }
}
