package com.beiben.leetcode.solution70;

import com.beiben.leetcode.solution70.Solution;
import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

@Slf4j
public class SolutionTest {
    private Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new Solution();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void climbStairs() {
        log.info("===start===");
        log.info("result = {}", solution.climbStairs(45));
        log.info("===end===");
    }
}