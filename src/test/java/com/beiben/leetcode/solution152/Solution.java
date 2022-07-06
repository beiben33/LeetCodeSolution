package com.beiben.leetcode.solution152;

public class Solution {
    public int maxProduct(int[] nums) {
        int result = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int product = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                product = product * nums[j];
                if (product >= result) {
                    result = product;
                }
            }
        }

        return result;
    }
}
