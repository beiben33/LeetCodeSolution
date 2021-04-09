package com.beiben.leetcode.solution239;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

@Slf4j
public class SolutionTest {
    private Solution solution;
    private int nums[];
    private int k;
    private ObjectMapper om;

    @Before
    public void setUp() throws Exception {
        solution = new Solution();
        nums = new int[] {1,3,-1,-3,5,3,6,7};
        k = 3;
        om = new ObjectMapper();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void maxSlidingWindow() throws Exception {
        int[] results = solution.maxSlidingWindow(nums, k);
        log.info(om.writeValueAsString(results));
    }
}