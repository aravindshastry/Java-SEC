// LeetCode 1920: Build Array from Permutation
// Link: https://leetcode.com/problems/build-array-from-permutation/
// Concept: Array indexing | Time: O(n) | Space: O(n)

import java.util.Arrays;

public class P16_BuildArrayFromPermutation {
    static class Solution {
        public int[] buildArray(int[] nums) {
            int[] ans = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                ans[i] = nums[nums[i]];
            }
            return ans;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println("Test 1: " + Arrays.toString(sol.buildArray(new int[]{0, 2, 1, 5, 3, 4})));
        System.out.println("Test 2: " + Arrays.toString(sol.buildArray(new int[]{5, 0, 1, 2, 3, 4})));
    }
}
