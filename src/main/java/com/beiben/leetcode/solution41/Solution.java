package com.beiben.leetcode.solution41;

public class Solution {
    private static int MAX_NUMBER = 300;
    public int firstMissingPositive(int[] nums) {
        if (nums.length == 0) return 1;
        boolean bitArray[] = new boolean[MAX_NUMBER];
        for(int num : nums) {
            if (num > 0 && num <= MAX_NUMBER) bitArray[num - 1] = true;
        }
        for (int i = 0; i < bitArray.length; i++) {
            if (!bitArray[i]) return i + 1;
        }
        return MAX_NUMBER + 1;
    }
}
