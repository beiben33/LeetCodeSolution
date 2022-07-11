package com.beiben.leetcode.solution2300;

import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

@Slf4j
public class SolutionTest {
    private Solution solution;

    private int[] spells;

    private int[] potions;

    private long success;

    private int[] spells2;

    private int[] potions2;

    private long success2;

    @Before
    public void setUp() throws Exception {
        solution = new Solution();

        spells = new int[] {5, 1, 3};
        potions = new int[] {1, 2, 3, 4, 5};
        success = 7l;

        spells2 = new int[] {3, 1, 2};
        potions2 = new int[] {8, 5, 8};
        success2 = 16l;
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void successfulPairs() {
        log.info("result = {}", solution.successfulPairs(spells, potions, success));
        log.info("result2 = {}", solution.successfulPairs(spells2, potions2, success2));
    }
}