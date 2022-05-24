package com.beiben.leetcode.solution141;

import com.beiben.leetcode.solution141.StandardSolution;
import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

@Slf4j
public class StandardSolutionTest {
    private StandardSolution solution;

    private ListNode listNode;

    @Before
    public void setUp() throws Exception {
        solution = new StandardSolution();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void climbStairs() {
        log.info("===start===");
        log.info("result = {}", solution.hasCycle(listNode));
        log.info("===end===");
    }
}