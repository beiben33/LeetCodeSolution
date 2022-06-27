package com.beiben.leetcode.solution10;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public boolean isMatch(String s, String p) {
        Pattern pattern = Pattern.compile(p);
        Matcher matcher = pattern.matcher(s);
        return matcher.matches();
    }
}
