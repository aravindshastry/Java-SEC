// LeetCode 709: To Lower Case
// Link: https://leetcode.com/problems/to-lower-case/
// Concept: String methods | Time: O(n) | Space: O(n)

public class P01_ToLowerCase {
    static class Solution {
        public String toLowerCase(String s) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (ch >= 'A' && ch <= 'Z') {
                    sb.append((char) (ch + 32));
                } else {
                    sb.append(ch);
                }
            }
            return sb.toString();
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println("Test 1: " + sol.toLowerCase("Hello"));   // hello
        System.out.println("Test 2: " + sol.toLowerCase("here"));    // here
        System.out.println("Test 3: " + sol.toLowerCase("LOVELY"));  // lovely
    }
}
