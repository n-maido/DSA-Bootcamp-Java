package com.nhi.inteviewQs;

/**
 * Given a mountain array, find the lowest index of the target
 * You can only access the arra via an interface (arr.get(index), arr.length())
 * https://leetcode.com/problems/find-in-mountain-array/
 *
 */
public class SearchInMountain {
    public static void main(String[] args) {

    }

    /**
     * Return index
     * @param arr
     * @return
     */
    public int search(int[] arr, int target) {
        int peak = peakIndexInMountainArray(arr);
        // since we want the lowest index, search the left half 1st
        int firstTry = orderAgnosticBS(arr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        } else {
            // search right half
            return orderAgnosticBS(arr, target, peak + 1, arr.length - 1);
        }
    }

    /*
     * copy pasted from mountain peak
     */
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                // we're in the decreasing part of the array
                // this may be the ans, but check the left
                // this is why end != mid - 1
                end = mid;
            } else {
                // we're in the ascending part
                // we know mid + 1 > mid, so that's why we ignore the mid
                start = mid + 1;
            }
        }
        // in the end, start == end and pts to the largest # bc of the 2 checks
        // start & end are always looking for the max elem in both checks
        // hence, that's why they're pointing to just 1 elem, which is the max
        // more elaboration: at every pt of time for start and end,
        // they have the best possible ans up until that time
        // if we're saying that only 1 item remains, then that's the best ans
        return start; // or end
    }

    static int orderAgnosticBS(int[] arr, int target, int start, int end) {
        // determine sort order of arr
        boolean isAsc = arr[start] < arr[end];
        // equiv:
//        if (arr[start] < arr[end]) {
//            isAsc = true;
//        } else {
//            isAsc = false;
//        }

        while (start <= end) {
            // find middle elem
            // int mid = (start + end) / 2;
            // it's possible that start + end exceeds the range for int
            int mid = start + (end - start) / 2;

            // extract the common condition fr the prev BS
            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1; // check the left side
                } else if (target > arr[mid]) {
                    start = mid + 1; // check the right side
                } else {
                    if (target > arr[mid]) {
                        end = mid - 1; // check the left side
                    } else if (target < arr[mid]) {
                        start = mid + 1; // check the right side
                    }
                }
            }
        }
        return -1;
    }
}
