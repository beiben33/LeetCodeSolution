package com.beiben.leetcode.solution20;

import com.beiben.leetcode.solution20.Solution;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

@Slf4j
public class SolutionTest {
    private ObjectMapper om;

    private Solution solution;

    private String s;

    @Before
    public void setUp() throws Exception {
        om = new ObjectMapper();
        solution = new com.beiben.leetcode.solution20.Solution();
        s = "(]";
    }

    @After
    public void tearDown() throws Exception {
        s = null;
    }

    @Test
    public void testValidParentheses () {
        try {
            log.info(om.writeValueAsString(solution.isValid(s)));
        } catch (Exception ex) {
            log.error(ex.getMessage(), ex);
        }
    }
}
