package com.beiben.leetcode.solution10;

import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayDeque;
import java.util.HashSet;

import static org.junit.Assert.*;

@Slf4j
public class SolutionTest {

    private Solution solution;

    private ArrayDeque arrayDeque;

    private HashSet hashSet;

    private String s;
    private String p;

    private String s2;
    private String p2;

    private String s3;
    private String p3;

    @Before
    public void setUp() throws Exception {
        solution = new Solution();

        s = "aa";
        p = "a";

        s2 = "aa";
        p2 = "a*";

        s3 = "ab";
        p3 = ".*";

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void isMatch() {
        log.info("result = {}", solution.isMatch(s, p));
        log.info("result2 = {}", solution.isMatch(s2, p2));
        log.info("result3 = {}", solution.isMatch(s3, p3));
    }


}