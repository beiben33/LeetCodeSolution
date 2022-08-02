package com.beiben.leetcode.solution69;

public class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) return x;
        int result = x >> 1;
        while (result * result > x) {
            if ((result - 1) * (result - 1) <= x) {
                result = result - 1;
                break;
            }
            result = result >> 1;
            while (result * result < x) {
                result = result + 1;
            }
        }
        return result;
    }
}
