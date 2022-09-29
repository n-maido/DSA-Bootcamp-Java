package com.nhi;

// search regardless of ascending or descending order
public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45};
        int target = 22;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);
    }

    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

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
