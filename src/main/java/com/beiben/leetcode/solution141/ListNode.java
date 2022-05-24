package com.beiben.leetcode.solution141;

public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }

    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    ListNode(int[] arr, int tailPos) {
        if (arr.length > 0) {
            ListNode next = null;
            ListNode tail = null;
            for (int i = arr.length - 1; i >= 0; i--) {
                ListNode e = new ListNode(arr[i], next);
                next = e;
                if (i == arr.length - 1) {
                    tail = e;
                } else if (i == tailPos) {
                    tail.next = e;
                }
            }
            this.next = next;
            this.val = arr[0];
        }
    }

    @Override
    public int hashCode() {
        return Long.valueOf(UnSafeAddress.getAddresses(this)).hashCode();
        //return next * 31 + val;
    }





}
