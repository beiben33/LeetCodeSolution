package com.beiben.leetcode.solution32;

import java.util.Stack;

public class Solution {
    private static final String[] parentheses = {"(", ")"};

    public int longestValidParentheses(String s) {
        int result = 0;
        if (s.length() > 0) {
            Stack<Integer> validStack = new Stack<>();
            validStack.push(-1);

            for (int i = 0; i < s.length(); i++) {
                String c = s.substring(i, i + 1);
                if (c.equals(parentheses[0])) {
                    validStack.push(i);
                } else {
                    validStack.pop();
                    if (validStack.empty()) {
                        validStack.push(i);
                    } else {
                        result = Math.max(result, i - validStack.peek());
                    }
                }
            }
        }

        return result;
    }
}
