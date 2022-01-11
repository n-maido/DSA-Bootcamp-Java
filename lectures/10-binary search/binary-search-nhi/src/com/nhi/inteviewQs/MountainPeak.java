package com.nhi.inteviewQs;

/**
 * Given a mountain array, find the peak
 * https://leetcode.com/problems/peak-index-in-a-mountain-array/
 */
public class MountainPeak {
    public static void main(String[] args) {

    }

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
}
