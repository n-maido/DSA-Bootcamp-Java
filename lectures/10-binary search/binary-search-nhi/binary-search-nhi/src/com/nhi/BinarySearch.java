package com.nhi;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45};
        int target = 22;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    // return index
    // return -1 if it doesn't exist
    static int binarySearch(int[] arr, int target) {
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
        return -1;
    }
}
