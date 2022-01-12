package com.nhi.inteviewQs;

/**
 * Given a sorted array that's rotated around an unknown pivot, find the target
 * https://leetcode.com/problems/search-in-rotated-sorted-array/
 */
public class RotatedBS {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(search(nums, target));
    }

    static public int search(int[] nums, int target) {
        int pivot = findPivot(nums);

        // if we don't find a pivot -> arr isn't rotated
        if (pivot == -1) {
            // do normal bs
            return binarySearch(nums, target, 0, nums.length - 1);
        }

        // if pivot is found, we have 2 asc sorted arrs
        // case 1:
        if (nums[pivot] == target) {
            return pivot;
        }
        // case 2:
        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1); // search LS
        }
        // case 3:
        return binarySearch(nums, target, pivot = 1, nums.length - 1);
    }

    // won't work if nums has duplicate vals
    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            // case 1:
            // make sure mid + 1 isn't out of bounds
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid; // found pivot
            }
            // case 2:
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1; // found pivot
            }
            // case 3:
            if (arr[mid] <= arr[start]) {
                end = mid - 1; // search left
            } else { // case 4
                start = mid + 1; // search right
            }
        }

        return -1;
    }

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

