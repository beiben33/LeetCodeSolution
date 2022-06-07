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

     static Integer NUM_RANGE = 10000;

     TreeNode() {}

     TreeNode(Integer val) { this.val = val; }

     TreeNode(Integer val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }

     public TreeNode ofArray(Integer[] arr) {
         TreeNode treeNode = this;
         if (arr.length == 0) treeNode = null;
         else if (arr.length == 1) this.val = arr[0];
         else {
             this.val = arr[0];
             ofArrayIdx(treeNode, arr, 1);
         }

         return treeNode;
     }

     private void ofArrayIdx(TreeNode cur, Integer[] arr, int idx) {
         log.debug("Thread id={}, idx={}, array value={}", Thread.currentThread().getId(), idx - 1, arr[idx - 1]);
         if (cur.val.compareTo(NUM_RANGE) > 0) return;
         int leftIdx = 2 * idx;
         int rightIdx = 2 * idx + 1;
         if (leftIdx <= arr.length) {
             cur.left = new TreeNode(arr[leftIdx - 1] == null ? NUM_RANGE + 1 : arr[leftIdx - 1]);
             //if (arr[leftIdx - 1] != null) {
                 ofArrayIdx(cur.left, arr, leftIdx);
             //}
         }
         if (rightIdx <= arr.length) {
             cur.right = new TreeNode(arr[rightIdx - 1] == null ? NUM_RANGE + 1 : arr[rightIdx - 1]);
             //if (arr[rightIdx - 1] != null) {
                 ofArrayIdx(cur.right, arr, rightIdx);
             //}
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
         log.debug("Thread id={}, elements={}", Thread.currentThread().getId(), elements);
         if (parent != null) {
             if (parent.left != null) {
                 elements.add(parent.left.val);
             }
             if (parent.right != null) {
                 elements.add(parent.right.val);
             }
             if (parent.left != null && parent.left.val.compareTo(NUM_RANGE) <= 0) {
                 toArray(elements, parent.left);
             }
             if (parent.right != null && parent.right.val.compareTo(NUM_RANGE) <= 0) {
                 toArray(elements, parent.right);
             }
         }
     }
 }

