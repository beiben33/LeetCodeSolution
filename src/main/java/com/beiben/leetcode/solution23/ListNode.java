package com.beiben.leetcode.solution23;

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    ListNode(int[] arr) {
        if (arr.length > 0) {
            ListNode next = null;
            for (int i = arr.length - 1; i > 0; i--) {
                ListNode e = new ListNode(arr[i], next);
                next = e;
            }
            this.next = next;
            this.val = arr[0];
        }
    }

    @Override
    public String toString() {
        StringBuilder strBlder = new StringBuilder("[");
        if (this != null) {
            strBlder.append(val);
            while (next != null) {
                strBlder.append(",");
                strBlder.append(next.val);
                next = next.next;
            }
        }
        strBlder.append("]");
        return strBlder.toString();
    }
}
