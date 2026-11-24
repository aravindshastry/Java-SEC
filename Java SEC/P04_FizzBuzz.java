// LeetCode 412: Fizz Buzz
// Link: https://leetcode.com/problems/fizz-buzz/
// Concept: If-else, loops | Time: O(n) | Space: O(n)

import java.util.ArrayList;
import java.util.List;

public class P04_FizzBuzz {
    static class Solution {
        public List<String> fizzBuzz(int n) {
            List<String> result = new ArrayList<>();
            for (int i = 1; i <= n; i++) {
                if (i % 15 == 0) {
                    result.add("FizzBuzz");
                } else if (i % 3 == 0) {
                    result.add("Fizz");
                } else if (i % 5 == 0) {
                    result.add("Buzz");
                } else {
                    result.add(String.valueOf(i));
                }
            }
            return result;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println("Test 1 (n=3):  " + sol.fizzBuzz(3));
        System.out.println("Test 2 (n=5):  " + sol.fizzBuzz(5));
        System.out.println("Test 3 (n=15): " + sol.fizzBuzz(15));
    }
}
