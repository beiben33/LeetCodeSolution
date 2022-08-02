package com.beiben.leetcode.solution69;

import com.beiben.leetcode.solution69.Solution;
import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

@Slf4j
public class solutionTest {
    private Solution solution;

    private int x;
    private int x2;
    private int x3;
    private int x4;
    private int x5;

    @Before
    public void setUp() throws Exception {
        solution = new Solution();

        x = 0;
        x2 = 1;
        x3 = 2;
        x4 = 60;
        x5 = 100;
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void mySqrt() {
        log.info("result = {}", solution.mySqrt(x));
        log.info("result2 = {}", solution.mySqrt(x2));
        log.info("result3 = {}", solution.mySqrt(x3));
        log.info("result4 = {}", solution.mySqrt(x4));
        log.info("result5 = {}", solution.mySqrt(x5));
    }
}