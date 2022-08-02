package com.beiben.leetcode.solution167;

import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

@Slf4j
public class SolutionTest {

    private Solution solution;

    private int[] numbers;

    private int target;

    private int[] numbers2;

    private int target2;

    private int[] numbers3;

    private int target3;

    @Before
    public void setUp() throws Exception {
        solution = new Solution();

        numbers = new int[] {2, 7, 11, 15};
        target = 9;

        numbers2 = new int[] {2, 3, 4};
        target2 = 6;

        numbers3 = new int[] {-1, 0};
        target3 = -1;
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void twoSum() {
        log.info("result = {}", solution.twoSum(numbers, target));
        log.info("result2 = {}", solution.twoSum(numbers2, target2));
        log.info("result3 = {}", solution.twoSum(numbers3, target3));
    }
}