package com.beiben.leetcode.solution2;

import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    private Solution solution;

    private ListNode header1;

    private ListNode header2;

    @Before
    public void setUp() throws Exception {
        solution = new Solution();

        ListNode l1 = new ListNode(2);
        header1 = l1;
        l1.next = appendNext(l1, 5);
        l1 = l1.next;
        l1.next = appendNext(l1, 8);

        ListNode l2 = new ListNode(8);
        header2 = l2;
        l2.next = appendNext(l2, 5);
        l2 = l2.next;
        l2.next = appendNext(l2, 2);
    }

    private ListNode appendNext(ListNode node, int val) {
        ListNode next = new ListNode(val);
        node.next = next;
        return next;
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void addTwoNumbers() {
        ListNode l3 = solution.addTwoNumbers(header1, header2);
        Assert.assertNotNull(l3);
    }
}