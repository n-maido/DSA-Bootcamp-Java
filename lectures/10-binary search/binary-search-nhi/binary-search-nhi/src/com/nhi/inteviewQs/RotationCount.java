package com.nhi.inteviewQs;

/**
 * Given a sorted rotated array, count how many times it's been rotated
 * https://www.geeksforgeeks.org/find-rotation-count-rotated-sorted-array/
 */
public class RotationCount {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        System.out.println(countRotations(nums)); // alt + enter to auto create method
    }

    private static int countRotations(int[] nums) {
        int pivot = findPivot(nums);
        return pivot + 1; // if findPivot returns -1, it'll add up to 0
    }

    // use for arrs w/o duplicate vals
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

    // use for arrs w/ duplicate values
    static int findPivotDuplicates(int[] arr) {
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
            // case 3: change
            // if elements at middle, start, and end are equal
            // just skip the duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // EDGE CASE: what if the elem at s and e are the pivot?
                if (arr[start] > arr[start + 1]) {
                    return start; // start is pivot
                }
                start++;

                if (arr[end] < arr[end - 1]) {
                    return end - 1; // end - 1 is pivot
                }
                end--;
            }
            // left side is sorted, so pivot should be in RS
            else if (arr[start] < arr[mid] || arr[start] == arr[mid] && arr[mid] > arr[end]){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
