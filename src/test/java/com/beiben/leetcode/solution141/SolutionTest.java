package com.beiben.leetcode.solution141;

import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

@Slf4j
public class SolutionTest {
    private Solution solution;

    private ListNode listNode;

    private ListNode listNode2;

    private ListNode listNode3;

    @Before
    public void setUp() throws Exception {
        solution = new Solution();
        listNode = new ListNode(new int[]{3, 2, 0, -4}, 1);
        listNode2 = new ListNode(new int[]{1, 2}, 0);
        listNode3 = new ListNode(new int[]{1}, -1);
    }

//    @After
//    public void tearDown() throws Exception {
//        // todo: to test avoiding memory leak
//        ListNode header = listNode;
//        while (listNode != null) {
//            listNode.val = 0;
//            listNode = listNode.next;
//        }
//        header = null;
//    }

    @Test
    public void hasCycle() {
        log.info("===start===");
        log.info("result = {}", solution.hasCycle(listNode));
        log.info("result2 = {}", solution.hasCycle(listNode2));
        log.info("result3 = {}", solution.hasCycle(listNode3));
        log.info("===end===");
    }
}