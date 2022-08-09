package com.beiben.leetcode.solution4;

import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

@Slf4j
public class SolutionTest {

    private Solution solution;

    private int[] c1_num1;
    private int[] c1_num2;

    private int[] c2_num1;
    private int[] c2_num2;

    @Before
    public void setUp() throws Exception {
        solution = new Solution();

        c1_num1 = new int[] {1, 3};
        c1_num2 = new int[] {2};

        c2_num1 = new int[] {1, 2};
        c2_num2 = new int[] {3, 4};
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void findMedianSortedArrays() {
        log.info("result = {}", solution.findMedianSortedArrays(c1_num1, c1_num2));
        log.info("result2 = {}", solution.findMedianSortedArrays(c2_num1, c2_num2));
    }
}