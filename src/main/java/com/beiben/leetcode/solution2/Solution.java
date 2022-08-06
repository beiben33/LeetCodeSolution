package com.beiben.leetcode.solution2;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) return null;
        ListNode header = new ListNode();
        ListNode next = header;
        boolean isCarriedNext = false;
        while(l1 != null && l2 != null) {
            next.val = l1.val + l2.val + (isCarriedNext ? 1 : 0);
            if (next.val >= 10) {
                next.val = next.val - 10;
                isCarriedNext = true;
            }
            l1 = l1.next;
            l2 = l2.next;
            if (l1 != null && l2 != null) {
                ListNode node = new ListNode();
                next.next = node;
                next = node;
            }
        }
        if (l1 != null) {
            next.next = l1;
            while (isCarriedNext && l1 != null) {
                l1.val = l1.val + 1;
                if (l1.val >= 10) {
                    l1.val = l1.val - 10;
                    isCarriedNext = true;
                }
                if (l1.next != null) {
                    l1 = l1.next;
                } else {
                    if (isCarriedNext) {
                        ListNode node = new ListNode(1);
                        l1.next = node;
                        l1 = node.next;
                    }
                }
            }
        } else if (l2 != null) {
            next.next = l2;
            while (isCarriedNext && l2 != null) {
                l2.val = l2.val + 1;
                if (l2.val >= 10) {
                    l2.val = l2.val - 10;
                    isCarriedNext = true;
                }
                if (l2.next != null) {
                    l2 = l2.next;
                } else {
                    if (isCarriedNext) {
                        ListNode node = new ListNode(1);
                        l2.next = node;
                        l2 = node.next;
                    }
                }
            }
        } else {
            if (isCarriedNext) {
                ListNode node = new ListNode(1);
                next.next = node;
            }
        }

        return header;
    }
}
