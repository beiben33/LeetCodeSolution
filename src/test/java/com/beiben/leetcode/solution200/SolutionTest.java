package com.beiben.leetcode.solution200;

import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

@Slf4j
public class SolutionTest {
    private Solution solution;

    char[][] grid;

    char[][] grid2;

    char[][] grid3;

    @Before
    public void setUp() throws Exception {
        solution = new Solution();

        grid = new char[][]{
                new char[]{'1', '1', '1', '1', '0'},
                new char[]{'1', '1', '0', '1', '0'},
                new char[]{'1', '1', '0', '0', '0'},
                new char[]{'0', '0', '0', '0', '0'},
        };

        grid2 = new char[][]{
                new char[]{'1', '1', '0', '0', '0'},
                new char[]{'1', '1', '0', '0', '0'},
                new char[]{'0', '0', '1', '0', '0'},
                new char[]{'0', '0', '0', '1', '1'},
        };

        grid3 = new char[][]{
                new char[]{'0', '0', '0'},
                new char[]{'0', '0', '0'},
        };
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void numIslands() {
        log.info("result = {}", solution.numIslands(grid));
        log.info("result2 = {}", solution.numIslands(grid2));
        log.info("result3 = {}", solution.numIslands(grid3));
    }
}
