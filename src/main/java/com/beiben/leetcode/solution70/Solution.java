package com.beiben.leetcode.solution70;

public class Solution {
    public int climbStairs(int n) {
        return calStep(n);
    }

    private int calStep(int n) {
        if (n < 3) {
            return n;
        } else {
            return calStep(n - 1) + calStep( n - 2);
        }
    }
}
