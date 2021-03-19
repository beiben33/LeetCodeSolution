package com.beiben.leetcode.solution169;

import java.util.Arrays;

public class Solution {
    public int majorityElement(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        if (len == 1) {
            return nums[0];
        } else {
            int count = 1;
            for(int i = 1; i < len; i++) {
                if (nums[i] - nums[i-1] == 0) {
                    count++;
                } else {
                    count = 1;
                }
                if (count * 2 > len) {
                    return nums[i-1];
                }
            }
        }
        return 0;
    }
}
