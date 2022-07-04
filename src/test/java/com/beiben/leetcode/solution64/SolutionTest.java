package com.beiben.leetcode.solution64;

import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

@Slf4j
public class SolutionTest {

    private Solution solution;

    private int[][] grid;

    private int[][] grid2;

    @Before
    public void setUp() throws Exception {
        solution = new Solution();
        grid = new int[][] {new int[]{1, 3, 1}, new int[]{1, 5, 1}, new int[]{4, 2, 1}};
        grid2 = new int[][] {new int[]{1, 2, 3}, new int[]{4, 5, 6}};
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void minPathSum() {
        log.info("result = {}", solution.minPathSum(grid));
        log.info("result2 = {}", solution.minPathSum(grid2));
    }
}