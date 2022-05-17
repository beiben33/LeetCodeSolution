package com.beiben.leetcode.solution23;

import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Slf4j
public class SolutionTest {

    private Solution solution;

    private ListNode[] lists;

    private ListNode[] lists2;

    private ListNode[] lists3;

    private ListNode[] lists4;

    private int MAX_SCALE = 4000;

    private int genDimensionScale() {
        SecureRandom random = new SecureRandom("ranGenData".getBytes(StandardCharsets.UTF_8));
        LocalDateTime now = LocalDateTime.now();
        random.setSeed(now.getHour() * 3600 + now.getMinute() * 60 + now.getSecond());
        return Math.abs(random.nextInt()) % MAX_SCALE + 1;
    }

    private ListNode[] randomGenTestData(int[] dimension, short dimensionVal, Type type) {
        ListNode[] testData = new ListNode[dimension[0]];
        //todo: implement multi dimension data
//        for(short idx = 0; idx < dimensionVal; idx++) {
//
//        }
        for (int idx = 0; idx < testData.length; idx++) {
            testData[idx] = new ListNode(23, 26);
        }

        return testData;
    }

    @Before
    public void setUp() throws Exception {
        solution = new Solution();
        List<ListNode> listNodes = new ArrayList<>();
        listNodes.add(new ListNode(new int[]{1,4,5}));
        listNodes.add(new ListNode(new int[]{1,3,4}));
        listNodes.add(new ListNode(new int[]{2,6}));
        lists = new ListNode[listNodes.size()];
        lists = listNodes.toArray(lists);

        lists2 = new ListNode[0];

        lists3 = new ListNode[1];

        int scale = genDimensionScale();
        int[] dimension = new int[1];
        dimension[0] = scale;
        lists4 = randomGenTestData(dimension, (short)1, ListNode.class);
    }

    @After
    public void tearDown() throws Exception {
        for (ListNode list : lists) {
            list = null;
        }
        lists = null;

        lists2 = null;

        for (ListNode list3 : lists3) {
            list3 = null;
        }
        lists3 = null;

        for (ListNode list4 : lists4) {
            list4 = null;
        }
        lists4 = null;

        solution = null;
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

            ListNode result4 = solution.mergeKLists(lists4);
            if (result4 != null) {
                log.info(result4.toString());
            } else {
                log.info("[]");
            }
        } catch (Exception ex) {
            log.error(ex.getMessage(), ex);
        }
    }
}
