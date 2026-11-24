// LeetCode 1929: Concatenation of Array
// Link: https://leetcode.com/problems/concatenation-of-array/
// Concept: Basic arrays | Time: O(n) | Space: O(n)

import java.util.Arrays;

public class P05_ConcatenationOfArray {
    static class Solution {
        public int[] getConcatenation(int[] nums) {
            int n = nums.length;
            int[] ans = new int[2 * n];
            for (int i = 0; i < n; i++) {
                ans[i] = nums[i];
                ans[i + n] = nums[i];
            }
            return ans;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println("Test 1: " + Arrays.toString(sol.getConcatenation(new int[]{1, 2, 1})));
        System.out.println("Test 2: " + Arrays.toString(sol.getConcatenation(new int[]{1, 3, 2, 1})));
    }
}
