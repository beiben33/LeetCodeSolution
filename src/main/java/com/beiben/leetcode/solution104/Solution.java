package com.beiben.leetcode.solution104;

public class Solution {
    public int maxDepth(TreeNode root) {
        Integer[] arr = root.toArray(root);
        if (arr.length == 0) {
            return 0;
        } else {
            int depth = Integer.toBinaryString(arr.length).length();
            if (depth % 2 != 0) depth += 1;
            return depth;
        }
    }
}
