package com.beiben.leetcode.solution104;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 **/
@Slf4j
public class TreeNode {
     Integer val;
     TreeNode left;
     TreeNode right;

     TreeNode() {}

     TreeNode(Integer val) { this.val = val; }

     TreeNode(Integer val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }

     public TreeNode ofArray(Integer[] arr) {
         TreeNode root = this;
         if (arr.length == 0) root = null;
         else if (arr.length == 1) this.val = arr[0];
         else ofArrayIdx(root, arr, 1);

         return root;
     }

     private void ofArrayIdx(TreeNode cur, Integer[] arr, int idx) {
         log.debug("Thread id={}, idx={}, array value={}", Thread.currentThread().getId(), idx - 1, arr[idx - 1]);
         int leftIdx = 2 * idx;
         int rightIdx = 2 * idx + 1;
         if (leftIdx <= arr.length) {
             cur.left = new TreeNode(arr[leftIdx - 1]);
             if (arr[leftIdx - 1] != null) {
                 ofArrayIdx(cur.left, arr, leftIdx);
             }
         }
         if (rightIdx <= arr.length) {
             cur.right = new TreeNode(arr[rightIdx - 1]);
             if (arr[rightIdx - 1] != null) {
                 ofArrayIdx(cur.right, arr, rightIdx);
             }
         }
     }

     public Integer[] toArray(TreeNode root) {
         List<Integer> elements = new ArrayList<>();
         TreeNode parent = root;
         if (root != null) {
             elements.add(parent.val);
             if (parent.val != null) {
                 elements.add(parent.left.val);
                 elements.add(parent.right.val);
                 toArray(elements, parent.left);
                 toArray(elements, parent.right);
             }
         }
         return elements.toArray(new Integer[elements.size()]);
     }

     private void toArray(List<Integer> elements, TreeNode parent) {
         if (parent != null) {
             elements.add(parent.left.val);
             elements.add(parent.right.val);
             if (parent.left.val != null) {
                 toArray(elements, parent.left);
             }
             if (parent.right.val != null) {
                 toArray(elements, parent.right);
             }
         }
     }
 }

