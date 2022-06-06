package com.beiben.leetcode.solution104;

/**
 * Definition for a binary tree node.
 **/
 public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;

     TreeNode() {}

     TreeNode(int val) { this.val = val; }

     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }

     public TreeNode ofArray(Integer[] arr) {
         TreeNode root = this;
         if (arr.length == 0) root = null;
         else if (arr.length == 1) root.val = arr[0];
         else root = ofArrayIdx(root, arr, 1);

         return root;
     }

     private TreeNode ofArrayIdx(TreeNode cur, Integer[] arr, int idx) {
         int leftIdx = 2 << idx;
         int rightIdx = 2 << idx + 1;
         if (leftIdx <= arr.length) {
             cur.left.val = arr[leftIdx - 1];
             if (arr[leftIdx - 1] != null) {
                 cur.left.left = ofArrayIdx(cur.left, arr, leftIdx);
             }
         }
         if (rightIdx <= arr.length) {
             cur.right.val = arr[rightIdx - 1];
             if (arr[rightIdx - 1] != null) {
                 cur.right.right = ofArrayIdx(cur.right, arr, rightIdx);
             }
         }
         return cur;
     }
 }

