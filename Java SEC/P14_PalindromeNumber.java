// LeetCode 9: Palindrome Number
// Link: https://leetcode.com/problems/palindrome-number/
// Concept: Number manipulation | Time: O(log10(x)) | Space: O(1)

public class P14_PalindromeNumber {
    static class Solution {
        public boolean isPalindrome(int x) {
            if (x < 0 || (x % 10 == 0 && x != 0)) {
                return false;
            }
            int reversedHalf = 0;
            while (x > reversedHalf) {
                reversedHalf = reversedHalf * 10 + x % 10;
                x /= 10;
            }
            return x == reversedHalf || x == reversedHalf / 10;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println("Test 1 (121):  " + sol.isPalindrome(121));  // true
        System.out.println("Test 2 (-121): " + sol.isPalindrome(-121)); // false
        System.out.println("Test 3 (10):   " + sol.isPalindrome(10));   // false
    }
}
