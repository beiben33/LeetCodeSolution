package com.beiben.leetcode.solution322;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

@Slf4j
public class SolutionTest {

    private Solution solution;

    private int[] coins;

    private int amount;

    private int[] coins2;

    private int amount2;

    private int[] coins3;

    private int amount3;

    @Before
    public void setUp() throws Exception {
        solution = new Solution();
        coins = new int[] {1, 2, 5};
        amount = 11;
        coins2 = new int[] {2};
        amount2 = 3;
        coins3 = new int[] {1};
        amount3 = 0;
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void coinChange() {
        log.info("result = {}", solution.coinChange(coins, amount));
        log.info("result2 = {}", solution.coinChange(coins2, amount2));
        log.info("result3 = {}", solution.coinChange(coins3, amount3));
    }
}
