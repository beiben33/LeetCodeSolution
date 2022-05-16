package com.beiben.leetcode.solution23;

import com.beiben.leetcode.solution23.Solution;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class SolutionTest {
    //private ObjectMapper om;

    private Solution solution;

    private ListNode[] lists;

    private ListNode[] lists2;

    private ListNode[] lists3;

    @Before
    public void setUp() throws Exception {
        //om = new ObjectMapper();
        solution = new Solution();
        List<ListNode> listNodes = new ArrayList<>();
        listNodes.add(new ListNode(new int[]{1,4,5}));
        listNodes.add(new ListNode(new int[]{1,3,4}));
        listNodes.add(new ListNode(new int[]{2,6}));
        lists = new ListNode[listNodes.size()];
        lists = listNodes.toArray(lists);

        lists2 = new ListNode[0];

        lists3 = new ListNode[1];
    }

    @After
    public void tearDown() throws Exception {
        for (ListNode list : lists) {
            list = null;
        }
        lists = null;

        lists2 = null;

        for (ListNode list : lists3) {
            list = null;
        }
        lists3 = null;
    }

    @Test
    public void testMergeKLists () {
        try {
            ListNode result = solution.mergeKLists(lists);
            if (result != null) {
                log.info(result.toString());
            } else {
                log.info("[]");
            }
            //todo: implements json serialization for ListNode
            // log.info(om.writeValueAsString(result));

            ListNode result2 = solution.mergeKLists(lists2);
            if (result2 != null) {
                log.info(result2.toString());
            } else {
                log.info("[]");
            }

            ListNode result3 = solution.mergeKLists(lists3);
            if (result3 != null) {
                log.info(result3.toString());
            } else {
                log.info("[]");
            }
        } catch (Exception ex) {
            log.error(ex.getMessage(), ex);
        }
    }
}
