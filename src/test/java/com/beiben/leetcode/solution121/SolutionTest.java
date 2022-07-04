package com.beiben.leetcode.solution121;

import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

@Slf4j
public class SolutionTest {

    private Solution solution;

    private int[] prices;

    private int[] prices2;

    @Before
    public void setUp() throws Exception {
        solution = new Solution();
        prices = new int[] {7, 1, 5, 3, 6, 4};
        prices2 = new int[] {7, 6, 4, 3, 1};
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void maxProfit() {
        log.info("result = {}", solution.maxProfit(prices));
        log.info("result2 = {}", solution.maxProfit(prices2));
    }
}