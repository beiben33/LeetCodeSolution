package com.beiben.leetcode.solution141;

import lombok.Data;

@Data
public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}
