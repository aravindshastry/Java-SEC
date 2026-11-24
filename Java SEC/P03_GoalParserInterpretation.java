// LeetCode 1678: Goal Parser Interpretation
// Link: https://leetcode.com/problems/goal-parser-interpretation/
// Concept: String replacement | Time: O(n) | Space: O(n)

public class P03_GoalParserInterpretation {
    static class Solution {
        public String interpret(String command) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < command.length(); i++) {
                if (command.charAt(i) == 'G') {
                    sb.append('G');
                } else if (command.charAt(i) == '(') {
                    if (command.charAt(i + 1) == ')') {
                        sb.append('o');
                        i++;
                    } else {
                        sb.append("al");
                        i += 3;
                    }
                }
            }
            return sb.toString();
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println("Test 1: " + sol.interpret("G()(al)"));          // Goal
        System.out.println("Test 2: " + sol.interpret("G()()()()(al)"));    // Gooooal
        System.out.println("Test 3: " + sol.interpret("(al)G(al)()()G"));   // alGalooG
    }
}
