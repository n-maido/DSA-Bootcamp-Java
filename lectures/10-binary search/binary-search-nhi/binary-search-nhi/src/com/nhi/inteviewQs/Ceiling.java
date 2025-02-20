package com.nhi.inteviewQs;

/**
 * Given a sorted array, find the smallest element >= the target
 */
public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        int ans = ceiling(arr, target);
        System.out.println(ans);
    }

    /**
     * we just copy paste the BS code, and return start instead of -1
     * @param arr
     * @param target
     * @return
     */
    // return index
    // return -1 if DNE
    static int ceiling(int[] arr, int target) {
        // but what if the target > greatest # in array?
        if (target > arr[arr.length - 1]) {
            return -1;
        }
        int startIndex = 0;
        int endIndex = arr.length - 1;

        while (startIndex <= endIndex) {
            // find middle elem
            // int mid = (start + end) / 2;
            // it's possible that start + end exceeds the range for int
            int midIndex = startIndex + (endIndex - startIndex) / 2;

            if (target < arr[midIndex]) {
                endIndex = midIndex - 1; // check the left side
            } else if (target > arr[midIndex]) {
                startIndex = midIndex + 1; // check the right side
            } else {
                // ans found
                return arr[midIndex];
            }
        }
        return arr[startIndex];
    }
}
