// LeetCode 520: Detect Capital
// Link: https://leetcode.com/problems/detect-capital/
// Concept: Character conditions | Time: O(n) | Space: O(1)

public class P11_DetectCapital {
    static class Solution {
        public boolean detectCapitalUse(String word) {
            int upperCount = 0;
            for (int i = 0; i < word.length(); i++) {
                if (Character.isUpperCase(word.charAt(i))) {
                    upperCount++;
                }
            }
            return upperCount == 0
                || upperCount == word.length()
                || (upperCount == 1 && Character.isUpperCase(word.charAt(0)));
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println("Test 1 (USA):    " + sol.detectCapitalUse("USA"));    // true
        System.out.println("Test 2 (FlaG):   " + sol.detectCapitalUse("FlaG"));   // false
        System.out.println("Test 3 (Google): " + sol.detectCapitalUse("Google")); // true
    }
}
