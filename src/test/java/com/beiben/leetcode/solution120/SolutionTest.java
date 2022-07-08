package com.beiben.leetcode.solution120;

import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@Slf4j
public class SolutionTest {

    private Solution solution;

    private List<List<Integer>> triangle;

    private List<List<Integer>> triangle2;

    @Before
    public void setUp() throws Exception {
        solution = new Solution();

        triangle = new ArrayList<>();
        triangle.add(Arrays.asList(new Integer[]{2}));
        triangle.add(Arrays.asList(new Integer[]{3,4}));
        triangle.add(Arrays.asList(new Integer[]{6,5,7}));
        triangle.add(Arrays.asList(new Integer[]{4,1,8,3}));

        triangle2 = new ArrayList<>();
        triangle2.add(Arrays.asList(new Integer[]{-10}));
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void minimumTotal() {
        log.info("result = {}", solution.minimumTotal(triangle));
        log.info("result2 = {}", solution.minimumTotal(triangle2));
    }
}