package com.beiben.leetcode.solution150;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
    public int evalRPN(String[] tokens) {
        List<String> operators = new ArrayList<>();
        operators.add("+");
        operators.add("-");
        operators.add("*");
        operators.add("/");
        Stack<Integer> stack = new Stack<>();
        for(String s : tokens) {
            if (operators.stream().noneMatch(o -> o.equals(s))) {
                stack.push(Integer.valueOf(s));
            } else {
                int i2 = stack.pop();
                int i1 = stack.pop();
                switch (s) {
                    case "+":
                        stack.push(i1 + i2);
                        break;
                    case "-":
                        stack.push(i1 - i2);
                        break;
                    case "*":
                        stack.push(i1 * i2);
                        break;
                    case "/":
                        stack.push(i1 / i2);
                        break;

                }
            }
        }
        return stack.pop();
    }
}
