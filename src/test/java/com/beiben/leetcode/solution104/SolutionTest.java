package com.beiben.leetcode.solution104;

import com.beiben.leetcode.solution104.Solution;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SolutionTest {

    private Solution solution;

    private TreeNode treeNode;

    @Before
    public void setUp() throws Exception {
        solution = new Solution();
        treeNode = new TreeNode();
        treeNode = treeNode.ofArray(new Integer[]{3,9,20,null,null,15,7});
    }

    @After
    public void tearDown() throws Exception {
        treeNode = null;
    }

    @Test
    public void maxDepth() {
        log.info("result = {}", solution.maxDepth(treeNode));
    }
}
