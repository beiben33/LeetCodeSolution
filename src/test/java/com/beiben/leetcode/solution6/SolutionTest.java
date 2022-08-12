package com.beiben.leetcode.solution6;

import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    private Solution solution;

    private String s1;
    private int numRows1;

    private String s2;
    private int numRows2;

    @Before
    public void setUp() throws Exception {
        solution = new Solution();

        s1 = "PAYPALISHIRING";
        numRows1 = 3;

        s2 = "PAYPALISHIRING";
        numRows2 = 4;
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void convert() {
        Assert.assertEquals("PAHNAPLSIIGYIR", solution.convert(s1, numRows1));
        Assert.assertEquals("PINALSIGYAHRPI", solution.convert(s2, numRows2));
    }
}