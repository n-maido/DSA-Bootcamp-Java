package com.nhi;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 39, 34, 56},
                {18, 17}
        };
        int[] ans = search(arr, 12);
        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
    }

    // returns an array = {row, col} (location of target)
    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }

    static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] ints: arr) {
            for (int anInt: ints) {
                if (anInt > max) {
                    max = anInt;
                }
            }
        }
        return max;
    }
}
