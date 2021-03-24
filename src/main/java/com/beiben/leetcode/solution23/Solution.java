package com.beiben.leetcode.solution23;

import java.util.Arrays;
import java.util.List;

public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        return devide(lists);
    }

    private ListNode devide(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        } else if (lists.length == 1) {
            return lists[0];
        } else if (lists.length == 2) {
            return merge2Lists(lists[0], lists[1]);
        } else {
            int half = lists.length / 2;
            ListNode[] left = new ListNode[half];
            for (int i = 0; i < half; i++) {
                left[i] = lists[i];
            }
            ListNode[] right = new ListNode[lists.length - half];
            for (int j = half; j < lists.length; j++) {
                right[j - half] = lists[j];
            }
            return merge2Lists(devide(left), devide(right));
        }
    }

    private ListNode merge2Lists(ListNode list1, ListNode list2) {
        ListNode head = null;
        if (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                head = new ListNode(list1.val);
                list1 = list1.next;
            } else {
                head = new ListNode(list2.val);
                list2 = list2.next;
            }
        } else {
            if (list1 != null) {
                return list1;
            } else {
                return list2;
            }
        }
        ListNode next = head;
        while (list1 != null || list2 != null) {
            if (list1 != null && list2 != null) {
                if (list1.val <= list2.val) {
                    ListNode newNode = new ListNode(list1.val);
                    next.next = newNode;
                    next = newNode;
                    list1 = list1.next;
                } else {
                    ListNode newNode = new ListNode(list2.val);
                    next.next = newNode;
                    next = newNode;
                    list2 = list2.next;
                }
            } else if (list1 != null) {
                ListNode newNode = new ListNode(list1.val);
                next.next = newNode;
                next = newNode;
                list1 = list1.next;
            } else if (list2 != null) {
                ListNode newNode = new ListNode(list2.val);
                next.next = newNode;
                next = newNode;
                list2 = list2.next;
            }
        }
        return head;

    }
}
