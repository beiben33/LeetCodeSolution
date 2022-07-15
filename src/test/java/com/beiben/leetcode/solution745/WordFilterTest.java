package com.beiben.leetcode.solution745;

import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

@Slf4j
public class WordFilterTest {

    private WordFilter wordFilter;

    private String[] words;

    private String pref;

    private String suff;

    @Before
    public void setUp() throws Exception {
        words = new String[]{"apple"};
        pref = "a";
        suff = "e";
        wordFilter = new WordFilter(words);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void f() {
        log.info("result = {}", wordFilter.f(pref, suff));
    }
}