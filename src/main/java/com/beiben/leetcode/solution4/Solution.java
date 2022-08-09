package com.beiben.leetcode.solution4;

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length == 0 && nums2.length == 0) return 0d;
        else if (nums1.length == 0) {
            int midIdx = nums2.length / 2;
            int midRemainder = nums2.length % 2;
            return caclMid(nums2, midIdx, midRemainder);
        } else if (nums2.length == 0) {
            int midIdx = nums1.length / 2;
            int midRemainder = nums1.length % 2;
            return caclMid(nums1, midIdx, midRemainder);
        } else {
            int[] nums3 = new int[nums1.length + nums2.length];
            int idx1 = 0, idx2 = 0, idx3 = 0;
            while (idx1 < nums1.length || idx2 < nums2.length) {
                if (idx1 < nums1.length && idx2 < nums2.length) {
                    if (nums1[idx1] <= nums2[idx2]) {
                        nums3[idx3++] = nums1[idx1++];
                    } else {
                        nums3[idx3++] = nums2[idx2++];
                    }
                } else {
                    if (idx1 < nums1.length) {
                        for (int idx = idx1; idx < nums1.length; idx++) {
                            nums3[idx3++] = nums1[idx1++];
                        }
                    } else {
                        for (int idx = idx2; idx < nums2.length; idx++) {
                            nums3[idx3++] = nums2[idx2++];
                        }
                    }
                }
            }
            int midIdx = nums3.length / 2;
            int midRemainder = nums3.length % 2;
            return caclMid(nums3, midIdx, midRemainder);
        }
    }

    private double caclMid(int[] nums, int midIdx, int midRemainder) {
        if (midRemainder == 1) {
            return nums[midIdx] * 1d;
        } else {
            return (nums[midIdx - 1] + nums[midIdx]) / 2d;
        }
    }
}
