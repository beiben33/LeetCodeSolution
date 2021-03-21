package com.beiben.leetcode.solution141;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> nodeSet = new HashSet<>();
        if (head != null) {
            nodeSet.add(head);
            ListNode next = head.next;
            while (next != null) {
                if (nodeSet.add(next)) {
                    next = next.next;
                } else {
                    return true;
                }
            }
        }
        return false;
    }
}
