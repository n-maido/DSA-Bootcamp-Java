package com.nhi;

// https://leetcode.com/problems/richest-customer-wealth/
public class MaxWealth {
    public static void main(String[] args) {

    }

    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;

        for (int[] person : accounts) {
            // when starting a new col, take a new sum for that row
            int accountSum = 0;
            for (int account : person) {
                accountSum += account;
            }
            if (accountSum > maxWealth) {
                maxWealth = accountSum;
            }
        }

        return maxWealth;
    }
}
