package org.example.leetcode.palindrome9;

public class Solution {
    public boolean isPalindrome(int x) {
        if (x >= 0) {
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(x));

            return stringBuilder.toString().contentEquals(stringBuilder.reverse());
        }
        return false;
    }
}
