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
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // find middle elem
            // int mid = (start + end) / 2;
            // it's possible that start + end exceeds the range for int
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1; // check the left side
            } else if (target > arr[mid]) {
                start = mid + 1; // check the right side
            } else {
                // ans found
                return mid;
            }
        }
        return start;
    }
}
