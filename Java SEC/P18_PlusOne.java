// LeetCode 66: Plus One
// Link: https://leetcode.com/problems/plus-one/
// Concept: Arrays, conditions | Time: O(n) | Space: O(n) worst case

import java.util.Arrays;

public class P18_PlusOne {
    static class Solution {
        public int[] plusOne(int[] digits) {
            for (int i = digits.length - 1; i >= 0; i--) {
                if (digits[i] < 9) {
                    digits[i]++;
                    return digits;
                }
                digits[i] = 0;
            }
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            return result;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println("Test 1: " + Arrays.toString(sol.plusOne(new int[]{1, 2, 3}))); // [1, 2, 4]
        System.out.println("Test 2: " + Arrays.toString(sol.plusOne(new int[]{4, 3, 2, 1}))); // [4, 3, 2, 2]
        System.out.println("Test 3: " + Arrays.toString(sol.plusOne(new int[]{9, 9}))); // [1, 0, 0]
    }
}
