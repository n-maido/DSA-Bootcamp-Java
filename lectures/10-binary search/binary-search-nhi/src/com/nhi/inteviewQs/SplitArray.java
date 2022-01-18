package com.nhi.inteviewQs;

/**
 * Given an _unsorted_ array of non-neg ints and an int m,
 * split the array into m non-empty continuous subarrays
 * https://leetcode.com/problems/split-array-largest-sum/
 */
public class SplitArray {
    public static void main(String[] args) {

    }

    public int splitArray(int[] nums, int m) {
        int start = 0;
        int end = 0;

        // find start and end
        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]); // at the end of the loop, this will contain the max elem
            end += nums[i];
        }

        // binary search
        while (start < end) {
            // use the middle as a potential ans
            int mid = start + (end - start) / 2;

            // calculate # pieces we can divide nums into, using this max sum
            int sum = 0;
            int pieces = 1;

            for (int num: nums) {
                if (sum + num > mid) {
                    // we can't add this to the subarray. make a new one
                    // new sum = num
                    sum = num;
                    pieces++;
                } else {
                    // keep appending to subarray
                    sum += num;
                }
            }
            if (pieces > m) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return end; // start = end
    }
}
