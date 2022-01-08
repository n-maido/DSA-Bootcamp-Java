package com.nhi.inteviewQs;

/**
 * Given a sorted array, find the largest element >= the target
 */
public class Floor {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        int ans = floor(arr, target);
        System.out.println(ans);
    }

    /**
     * we just copy paste the BS code, and return end instead of -1
     */
    // return index, -1 if DNE
    static int floor(int[] arr, int target) {
        if (target < arr[0]) {
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
        return end;
    }
}
