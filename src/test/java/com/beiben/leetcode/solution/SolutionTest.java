package com.beiben.leetcode.solution;

import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

@Slf4j
public class SolutionTest {
    private Solution solution;

    private int[] nums;
    private int target;

    private int[] nums2;
    private int target2;

    private int[] nums3;
    private int target3;

    @Before
    public void setUp() throws Exception {
        solution = new Solution();

        nums = new int[] {2, 7, 11, 15};
        target = 9;

        nums2 = new int[] {3, 2, 4};
        target2 = 6;

        nums3 = new int[] {3, 3};
        target3 = 6;
    }

    @After
    public void tearDown() throws Exception {
        for (int e : nums) {
            e = 0;
        }
        nums = null;

        for (int e2 : nums2) {
            e2 = 0;
        }
        nums2 = null;

        for (int e3 : nums3) {
            e3 = 0;
        }
        nums3 = null;
    }

    @Test
    public void twoSum() {
        log.info("result = {}", solution.twoSum(nums, target));
        log.info("result2 = {}", solution.twoSum(nums2, target2));
        log.info("result3 = {}", solution.twoSum(nums3, target3));
    }
}