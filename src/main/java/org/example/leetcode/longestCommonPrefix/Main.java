package org.example.leetcode.longestCommonPrefix;


public class Main {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        String result = new Solution().longestCommonPrefix(strs);
        System.out.println(result);
    }
}
