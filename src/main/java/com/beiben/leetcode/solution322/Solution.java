package com.beiben.leetcode.solution322;

import java.util.Arrays;


public class Solution {
    public int coinChange(int[] coins, int amount) {
        if (amount == 0) return 0;
        Arrays.sort(coins);
        int count = 0;
        int curAmount = 0;
        int curIdx = coins.length - 1;
        while (curIdx >= 0 && curAmount + coins[curIdx] != amount) {
            if (curAmount + coins[curIdx] < amount) {
                count++;
                curAmount += coins[curIdx];
            } else {
                curIdx--;
            }
        }
        if (curIdx >= 0 && curAmount + coins[curIdx] == amount)  {
            return count + 1;
        } else {
            return -1;
        }
    }
}
