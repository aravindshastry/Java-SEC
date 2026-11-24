// LeetCode 1732: Find the Highest Altitude
// Link: https://leetcode.com/problems/find-the-highest-altitude/
// Concept: Running total | Time: O(n) | Space: O(1)

public class P17_FindHighestAltitude {
    static class Solution {
        public int largestAltitude(int[] gain) {
            int current = 0;
            int highest = 0;
            for (int g : gain) {
                current += g;
                if (current > highest) {
                    highest = current;
                }
            }
            return highest;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println("Test 1: " + sol.largestAltitude(new int[]{-5, 1, 5, 0, -7}));       // 1
        System.out.println("Test 2: " + sol.largestAltitude(new int[]{-4, -3, -2, -1, 4, 3, 2})); // 0
    }
}
