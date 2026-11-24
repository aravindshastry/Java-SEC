// LeetCode 1480: Running Sum of 1d Array
// Link: https://leetcode.com/problems/running-sum-of-1d-array/
// Concept: Arrays, loops | Time: O(n) | Space: O(1) extra (in-place)

import java.util.Arrays;

public class P07_RunningSumOf1dArray {
    static class Solution {
        public int[] runningSum(int[] nums) {
            for (int i = 1; i < nums.length; i++) {
                nums[i] += nums[i - 1];
            }
            return nums;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println("Test 1: " + Arrays.toString(sol.runningSum(new int[]{1, 2, 3, 4})));
        System.out.println("Test 2: " + Arrays.toString(sol.runningSum(new int[]{1, 1, 1, 1, 1})));
    }
}
