package com.nhi.inteviewQs;

/**
 * Given an sorted array with an inifinite number of elements, find the position of the target
 * https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
 */
public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;
        System.out.println(ans(arr, target));
    }

    static int ans(int[] arr, int target) {
        // find the range
        // start with a box of size 2
        int start = 0;
        int end = 1;

        // condition for the target to lie in the range: target < end
        // if you know target < end, do you really need to check if target > start?
        // find end 1st, b4 applying BS
        while (target > arr[end]) {
            int newStart = end + 1;
            // double the box size
            // end = prev end + sizeofbox*2
            end = end + (end - start + 1) * 2;
            start = newStart;
        }

        return binarySearch(arr, target, start, end);
    }

    /*
     * Copy paste BS, add start and end to params
     * return index
     */
    static int binarySearch(int[] arr, int target, int start, int end) {

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
