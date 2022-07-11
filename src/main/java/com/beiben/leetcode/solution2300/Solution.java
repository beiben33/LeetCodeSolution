package com.beiben.leetcode.solution2300;

import java.util.Arrays;

public class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] result = new int[spells.length];
        Arrays.sort(potions);
        for (int i = 0; i < spells.length; i++) {
            int left = 0;
            int right = potions.length - 1;
            while (left >= 0 && right < potions.length && left <= right) {
                int mid = left + (right - left) / 2;
                if (1l * spells[i] * potions[mid] < success) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            result[i] = potions.length - left;
        }

        return  result;
    }
}
