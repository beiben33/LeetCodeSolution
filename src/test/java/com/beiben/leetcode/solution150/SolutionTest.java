package com.beiben.leetcode.solution150;

import com.beiben.leetcode.solution150.Solution;
import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

@Slf4j
public class SolutionTest {
    private Solution solution;

    private String[] tokens;

    private String[] tokens2;

    private String[] tokens3;

    @Before
    public void setUp() throws Exception {
        solution = new Solution();
        tokens = new String[]{"2","1","+","3","*"};
        tokens2 = new String[]{"4","13","5","/","+"};
        tokens3 = new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
    }

    @After
    public void tearDown() throws Exception {
        for (String token : tokens) {
            token = null;
        }
        tokens = null;

        for (String token : tokens2) {
            token = null;
        }
        tokens2 = null;

        for (String token : tokens3) {
            token = null;
        }
        tokens3 = null;
    }

    @Test
    public void evalRPN() {
        log.info("===start===");
        log.info("result = {}", solution.evalRPN(tokens));
        log.info("result2 = {}", solution.evalRPN(tokens2));
        log.info("result3 = {}", solution.evalRPN(tokens3));
        log.info("===end===");
    }
}
