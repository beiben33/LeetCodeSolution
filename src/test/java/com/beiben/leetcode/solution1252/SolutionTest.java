package com.beiben.leetcode.solution1252;

import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

@Slf4j
public class SolutionTest {
    private Solution solution;

    private int m;
    private int n;
    private int[][] indices;

    private int m2;
    private int n2;
    private int[][] indices2;

    @Before
    public void setUp() throws Exception {
        solution = new Solution();

        m = 2;
        n = 3;
        indices = new int[][] {new int[] {0, 1}, new int[] {1, 1}};

        m2 = 2;
        n2 = 2;
        indices2 = new int[][] {new int[] {1, 1}, new int[] {0, 0}};
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void oddCells() {
        log.info("result = {}", solution.oddCells(m, n, indices));
        log.info("result2 = {}", solution.oddCells(m2, n2, indices2));
    }
}