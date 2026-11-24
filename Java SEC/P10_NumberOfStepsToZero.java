// LeetCode 1342: Number of Steps to Reduce a Number to Zero
// Link: https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
// Concept: Conditions, loops | Time: O(log n) | Space: O(1)

public class P10_NumberOfStepsToZero {
    static class Solution {
        public int numberOfSteps(int num) {
            int steps = 0;
            while (num > 0) {
                if (num % 2 == 0) {
                    num /= 2;
                } else {
                    num -= 1;
                }
                steps++;
            }
            return steps;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println("Test 1 (14): " + sol.numberOfSteps(14)); // 6
        System.out.println("Test 2 (8):  " + sol.numberOfSteps(8));  // 4
        System.out.println("Test 3 (123): " + sol.numberOfSteps(123)); // 12
    }
}
