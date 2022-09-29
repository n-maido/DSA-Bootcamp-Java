package com.nhi.inteviewQs;

/**
 * Given a sorted array of chars, find the smallest char > the target
 * If no elem exists, return the 1st elem
 * https://leetcode.com/problems/find-smallest-letter-greater-than-target/
 */
public class SmallestLetter {
    public static void main(String[] args) {
        char[] arr = {'c', 'f', 'j'};
        char target = 'k';
        int ans = nextGreatestLetter(arr, target);
        System.out.println(ans);
    }

    /**
     * we just copy paste the ceiling code, delete some checks, and return start%len instead of -1
     * @param letters
     * @param target
     * @return
     */
    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            // find middle elem
            // int mid = (start + end) / 2;
            // it's possible that start + end exceeds the range for int
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1; // check the left side
            } else {
                start = mid + 1; // check the right side
            }
        }
        return letters[start % letters.length];
    }
}
