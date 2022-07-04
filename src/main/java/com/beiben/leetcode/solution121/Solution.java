package com.beiben.leetcode.solution121;

public class Solution {
    public int maxProfit(int[] prices) {
        int result = 0;
        if (prices.length <= 1) return 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] < min) {
                min = prices[i];
                int  max = Integer.MIN_VALUE;
                for (int j = i + 1; j < prices.length; j++) {
                    if (prices[j] > max) max = prices[j];
                }
                int temp = max - min;
                if (temp > result) result =temp;
            }
        }
        return result;
    }
}
