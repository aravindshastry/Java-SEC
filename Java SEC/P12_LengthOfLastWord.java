// LeetCode 58: Length of Last Word
// Link: https://leetcode.com/problems/length-of-last-word/
// Concept: String methods | Time: O(n) | Space: O(1)

public class P12_LengthOfLastWord {
    static class Solution {
        public int lengthOfLastWord(String s) {
            int i = s.length() - 1;
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }
            int length = 0;
            while (i >= 0 && s.charAt(i) != ' ') {
                length++;
                i--;
            }
            return length;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println("Test 1: " + sol.lengthOfLastWord("Hello World"));                 // 5
        System.out.println("Test 2: " + sol.lengthOfLastWord("   fly me   to   the moon  ")); // 4
        System.out.println("Test 3: " + sol.lengthOfLastWord("luffy is still joyboy"));      // 6
    }
}
