// LeetCode 1431: Kids With the Greatest Number of Candies
// Link: https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
// Concept: Arrays, conditions | Time: O(n) | Space: O(n)

import java.util.ArrayList;
import java.util.List;

public class P06_KidsWithCandies {
    static class Solution {
        public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
            int maxCandies = 0;
            for (int c : candies) {
                if (c > maxCandies) {
                    maxCandies = c;
                }
            }
            List<Boolean> result = new ArrayList<>();
            for (int c : candies) {
                result.add(c + extraCandies >= maxCandies);
            }
            return result;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println("Test 1: " + sol.kidsWithCandies(new int[]{2, 3, 5, 1, 3}, 3));
        System.out.println("Test 2: " + sol.kidsWithCandies(new int[]{4, 2, 1, 1, 2}, 1));
    }
}
