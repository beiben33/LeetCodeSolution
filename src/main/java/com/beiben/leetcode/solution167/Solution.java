package com.beiben.leetcode.solution167;

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];

        int arrLength = numbers.length;
        int firstIdx = 0;
        int secondIdx = arrLength - 1;
        while(numbers[firstIdx] + numbers[secondIdx] != target && firstIdx < secondIdx) {
            if (numbers[firstIdx] + numbers[secondIdx] < target) {
                firstIdx++;
            } else {
                secondIdx--;
            }
        }
        if (numbers[firstIdx] + numbers[secondIdx] == target) {
            result[0] = firstIdx + 1;
            result[1] = secondIdx + 1;
        }

        return result;
    }
}
