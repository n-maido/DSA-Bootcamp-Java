package com.nhi.inteviewQs;

/**
 * Given an array in sorted ascending order, find the 1st and last position of a repeating element
 * https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
 */
public class FirstAndLast {
    public static void main(String[] args) {

    }

    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};

        ans[0] = search(nums, target, true);
        if (ans[0] != -1) {
            ans[1] = search(nums, target, false);
        }

        return ans;
    }

    /**
     * Returns index of target
     */
    int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            // find middle elem
            // int mid = (start + end) / 2;
            // it's possible that start + end exceeds the range for int
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1; // check the left side
            } else if (target > nums[mid]) {
                start = mid + 1; // check the right side
            } else {
                // ans found
                ans = mid;
                if (findStartIndex == true) {
                    end = mid - 1; // search left
                } else {
                    start = mid + 1; // search right
                }
            }
        }
        return ans;
    }
}
