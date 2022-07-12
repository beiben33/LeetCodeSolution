package com.beiben.leetcode.solution1252;

public class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int result = 0;
        int[][] matrix = new int[m][n];
        for (int[] index : indices) {
            for (int i = 0; i < n; i++) {
                matrix[index[0]][i]++;
            }
            for (int i = 0; i < m; i++) {
                matrix[i][index[1]]++;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] % 2 == 1) {
                    result++;
                }
            }
        }
        return result;
    }
}
