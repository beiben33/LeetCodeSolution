package com.beiben.leetcode.solution152;

import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

@Slf4j
public class SolutionTest {

    private Solution solution;

    private int[] nums;

    private int[] nums2;

    private int[] nums3;

    @Before
    public void setUp() throws Exception {
        solution = new Solution();
        nums = new int[] {2, 3, -2, 4};
        nums2 = new int[] {-2, 0, -1};
        nums3 = new int[] {1, 6, -2, -3};
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void maxProduct() {
        log.info("result = {}", solution.maxProduct(nums));
        log.info("result2 = {}", solution.maxProduct(nums2));
        log.info("result3 = {}", solution.maxProduct(nums3));
    }
}