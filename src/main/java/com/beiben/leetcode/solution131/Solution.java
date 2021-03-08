package com.beiben.leetcode.solution131;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    List<List<String>> result = new ArrayList<>();

    String origin;

    public List<List<String>> partition(String s) {
        origin = s;
        List<String> palindromes = new ArrayList<>();
        dividePartition(palindromes, s);
        return result;
    }

    private boolean isPalindrome(String s) {
        for (int i = 0; i <= s.length() / 2; i++) {
           if (!s.substring(i, 1).equals(s.substring(s.length() - 1 - i, 1))) {
               return false;
           }
        }
        return true;

    }

    private void dividePartition(List<String> palindromes, String s) {
        if (isPalindrome(s)) {
            palindromes.add(s);
            if (origin.equals(join(palindromes))) {
                result.add(palindromes);
                if (s.length() == 1) {
                    return;
                } else {
                    List<String> newPalindromes = new ArrayList<>();
                    newPalindromes.addAll(palindromes.subList(0, palindromes.size() - 1));
                    newPalindromes.add(s.substring(0, 1));
                    dividePartition(newPalindromes, s.substring(1));
                }
            }
        } else {
            if (palindromes.size() > 0) {
                String last = palindromes.remove(palindromes.size() - 1);
                dividePartition(palindromes, last + s);
            } else {
                return;
            }
        }
    }

    private String join(List<String> palindromes) {
        StringBuilder sb = new StringBuilder();
        for (String s : palindromes) {
            sb.append(s);
        }
        return sb.toString();
    }

}