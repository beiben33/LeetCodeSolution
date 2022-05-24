package com.beiben.leetcode.solution70;

import java.util.function.UnaryOperator;

public class Solution2 {
    public int climbStairs(int n) {
        return 0;
    }

    private static Below3Calc below3Calc;

    private static Beyond3Calc beyond3Calc;

    private int calc(int n) {
        //return n < 3 ? n : calc(n - 2) + calc(n - 1);
        return 0;
    }

    private class Below3Calc implements UnaryOperator<Integer>{
        @Override
        public Integer apply(Integer n) {
            return n.compareTo(3) < 0 ? n : 0;
        }
    }

    private class Beyond3Calc implements UnaryOperator<Integer> {

        @Override
        public Integer apply(Integer n) {
            return apply(n - 2) + apply(n - 1);
        }
    }
}
