package com.beiben.leetcode.solution15;

import java.util.*;
import java.util.function.IntUnaryOperator;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<Set<Integer>> resultSet = new ArrayList<>();
        List<List<Integer>> results = new ArrayList<>();
        if (nums.length >= 3) {
            for (int i = 0; i < nums.length - 2; i++) {
                for (int j = i + 1; j < nums.length - 1; j++) {
                    for (int k = j + 1; k < nums.length; k++) {
                        if (nums[i] + nums[j] + nums[k] == 0) {
                            boolean duplicated = false;
                            Set<Integer> set = new HashSet<>(3);
                            set.add(nums[i]);
                            if (!set.contains(nums[j])) {
                                set.add(nums[j]);
                            }
                            if (!set.contains(nums[k])) {
                                set.add(nums[k]);
                            }
                            for (Set<Integer> existSet : resultSet) {
                                if (existSet.size() == set.size() && existSet.contains(nums[i]) && existSet.contains(nums[j]) && existSet.contains(nums[k])) {
                                    duplicated = true;
                                    break;
                                }
                            }
                            if (!duplicated) {

                                resultSet.add(set);
                                List<Integer> result = Arrays.asList(nums[i],  nums[j], nums[k]);
                                results.add(result);
                            }
                        }
                    }
                }
            }
        }

        return results;
    }
}
