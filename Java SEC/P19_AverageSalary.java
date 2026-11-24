// LeetCode 1491: Average Salary Excluding the Minimum and Maximum Salary
// Link: https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/
// Concept: Arrays, min/max | Time: O(n) | Space: O(1)

public class P19_AverageSalary {
    static class Solution {
        public double average(int[] salary) {
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            int sum = 0;
            for (int s : salary) {
                sum += s;
                if (s < min) min = s;
                if (s > max) max = s;
            }
            return (double) (sum - min - max) / (salary.length - 2);
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println("Test 1: " + sol.average(new int[]{4000, 3000, 1000, 2000})); // 2500.0
        System.out.println("Test 2: " + sol.average(new int[]{1000, 2000, 3000}));       // 2000.0
    }
}
