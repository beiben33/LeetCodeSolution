package com.beiben.leetcode.solution98;

public class Solution {
    public boolean isValidBST(TreeNode root) {
        if (root == null) return false;
        else {
            if (root.left != null && root.right != null) {
                if (root.val > root.left.val && root.val < root.right.val) {
                    return isValidBST(root.left) && isValidBST(root.right);
                }
            } else {
                if (root.left != null) {
                    if (root.val <= root.left.val) {
                        return false;
                    } else {
                        return isValidBST(root.left);
                    }
                } else {
                    if (root.val >= root.right.val) {
                        return false;
                    } else {
                        return isValidBST(root.right);
                    }
                }
            }
            return true;
        }
    }
}
