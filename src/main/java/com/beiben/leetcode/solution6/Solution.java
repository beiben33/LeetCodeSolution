package com.beiben.leetcode.solution6;

public class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;
        int len = s.length();
        int numCols = 0;
        boolean verticalCol = true;
        while (len > 0) {
            if (verticalCol) {
                numCols = numCols + 1;
                len = len - numRows;
            } else {
                numCols = numCols + numRows - 2;
                len = len - numRows + 2;
            }
            verticalCol = !verticalCol;
        }
        Character[][] fill = new Character[numRows][numCols];
        int sIdx = 0;
        int verticalCount = 0;
        for (int idx = 0; idx < numCols && sIdx < s.length(); idx++) {
            if (idx == 0 || idx % (numRows - 1) == 0) {
                verticalCount++;
                for (int idx2 = 0; idx2 < numRows && sIdx < s.length(); idx2++) {
                    fill[idx2][idx] = s.charAt(sIdx++);
                }
            } else {
                  int fillRow =  verticalCount * (numRows - 1) - idx;
                  fill[fillRow][idx] = s.charAt(sIdx++);
            }
        }
        StringBuilder strBlder = new StringBuilder();
        for (int idx = 0; idx < fill.length; idx++) {
            for (int idx2 = 0; idx2 < fill[idx].length; idx2++) {
                if (fill[idx][idx2] != null) strBlder.append(fill[idx][idx2]);
            }
        }

        return strBlder.toString();
    }
}
