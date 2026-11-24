// LeetCode 1108: Defanging an IP Address
// Link: https://leetcode.com/problems/defanging-an-ip-address/
// Concept: String replacement | Time: O(n) | Space: O(n)

public class P02_DefangingAnIPAddress {
    static class Solution {
        public String defangIPaddr(String address) {
            return address.replace(".", "[.]");
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println("Test 1: " + sol.defangIPaddr("1.1.1.1"));       // 1[.]1[.]1[.]1
        System.out.println("Test 2: " + sol.defangIPaddr("255.100.50.0"));  // 255[.]100[.]50[.]0
    }
}
