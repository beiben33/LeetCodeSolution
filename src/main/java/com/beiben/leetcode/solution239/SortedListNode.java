package com.beiben.leetcode.solution239;

public class SortedListNode {
    int val;
    int idx;
    SortedListNode next;

    public SortedListNode(int val, int idx) {
        this.val = val;
        this.idx = idx;
    }

    public SortedListNode add(int val, int idx) {
        SortedListNode head = this;
        SortedListNode node = new SortedListNode(val, idx);
        if (val >= head.val) {
            node.next = head;
            head = node;
        } else {
            boolean isTail = true;
            SortedListNode next = head.next;
            SortedListNode prev = head;
            while (next != null) {
                if (val >= next.val) {
                    prev.next = node;
                    node.next = next;
                    isTail = false;
                    break;
                }
                prev = next;
                next = next.next;
            }
            if (isTail) {
                prev.next = node;
            }
        }
        return head;
    }

    public SortedListNode computeValidHead(int validMinIdx) {
        SortedListNode head = this;
        while (head.idx < validMinIdx) {
            head = head.next;
        }
        return head;
    }

}
