package com.beiben.leetcode.solution8;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    static char[] VALID_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    static char[] VALID_SYMBOLS = {'+', '-'};

    public int myAtoi(String s) {
        List<Character> validDigitList = new ArrayList<>();
        for (char c : VALID_DIGITS) validDigitList.add(c);

        List<Character> validSymbolList = new ArrayList<>();
        for (char c : VALID_SYMBOLS) validSymbolList.add(c);

        int decimalLen = -1;
        int symbol = 1;
        StringBuilder decimal = new StringBuilder();
        int result = 0;

        for (int idx = 0; idx < s.length(); idx++) {
            char c = s.charAt(idx);
            if (validSymbolList.contains(c)) {
                if (decimalLen < 0) {
                    symbol = (c == VALID_SYMBOLS[1] ? 1 : -1);
                } else {
                    break;
                }
            } else if (validDigitList.contains(c)) {
                decimal.append(c);
                decimalLen++;
            } else {
                break;
            }
        }

        if (decimalLen >= 0) {
            String validS = decimal.toString();
            if (symbol == 1) {
                try {
                    for (int idx = validS.length() -1; idx >= 0; idx--) {
                        result += pow10(validS.length() - 1 - idx) * idxVal(validS.charAt(idx));
                    }
                } catch (Exception ex) {
                    result = Integer.MAX_VALUE;
                }
            } else {
                try {
                    for (int idx = validS.length() -1; idx >= 0; idx--) {
                        result += pow10(validS.length() - 1 - idx) * idxVal(validS.charAt(idx));
                    }
                    result = 0 - result;
                } catch (Exception ex) {
                    result = Integer.MIN_VALUE;
                }
            }
        }

        return  result;
    }

    private int pow10(int n) {
        int result = 1;
        if (n > 0) {
            for (int idx = 1; idx <= n; idx++) {
                result = result * 10;
            }
        }
        return result;
    }

    private int idxVal(char val) {
        for (int idx = 0; idx < VALID_DIGITS.length; idx++) {
            if (VALID_DIGITS[idx] == val) return idx;
        }
        return 0;
    }
}
