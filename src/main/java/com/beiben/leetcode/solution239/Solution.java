package com.beiben.leetcode.solution239;

public class Solution {

    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length < k) return null;
        int[] results = new int[nums.length - k + 1];
        SortedListNode head = new SortedListNode(nums[0], 0);
        for (int i = 0; i < nums.length - k + 1; i++) {
            if (i == 0) {
                for (int j = 1; j < k; j++) {
                    head = head.add(nums[j], j);
                }
                results[i] = head.val;
            } else {
                head = head.add(nums[i + k - 1], i + k - 1);
                head = head.computeValidHead(i);
                results[i] = head.val;
            }
        }
        return results;
    }
}
