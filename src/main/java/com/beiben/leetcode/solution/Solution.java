package com.beiben.leetcode.solution;


public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        for(int idx = 0; idx < nums.length - 1; idx++) {
            for (int idx2 = idx + 1; idx2 < nums.length; idx2++) {
                if (nums[idx] + nums[idx2] == target) {
                    result[0] = idx + 1;
                    result[1] = idx2 + 1;
                    break;
                }
            }
        }

        return result;
    }
}
