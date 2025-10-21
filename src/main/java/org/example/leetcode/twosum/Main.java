package org.example.leetcode.twosum;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Przykładowe dane testowe
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;

        int[] nums2 = {3, 2, 4};
        int target2 = 6;

        int[] nums3 = {3, 3};
        int target3 = 6;

        // Sprawdzenie wyników
        System.out.println("Test 1: " + Arrays.toString(solution.twoSum(nums1, target1)));
        System.out.println("Test 2: " + Arrays.toString(solution.twoSum(nums2, target2)));
        System.out.println("Test 3: " + Arrays.toString(solution.twoSum(nums3, target3)));
    }
}
