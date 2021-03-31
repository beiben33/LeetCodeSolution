package com.beiben.leetcode.solution20;

import java.util.Stack;

public class Solution {
    private static final String[] parentheses = {"(", ")"};

    private static final String[] squareBrackets = {"[", "]"};

    private static final String[] braces = {"{", "}"};

    public boolean isValid(String s) {
        Stack<String> validStack = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            String c = s.substring(i, i + 1);
            if (c.equals(parentheses[0]) || c.equals(squareBrackets[0]) || c.equals(braces[0])) {
                validStack.push(c);
            } else {
                if (validStack.size() > 0) {
                    String exist = validStack.pop();
                    if (c.equals(parentheses[1]) && !exist.equals(parentheses[0]) ||
                            c.equals(squareBrackets[1]) && !exist.equals(squareBrackets[0]) ||
                            c.equals(braces[1]) && !exist.equals(braces[0])) {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }

        return validStack.size() == 0;
    }
}
