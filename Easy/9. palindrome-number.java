/* Time Complexity - O(log10(x)), Space Complexity O(log10(x)) */
class Solution {
    public boolean isPalindrome(int x) {  
        String s = Integer.toString(x); // Convert the number to a string
        int l = 0; // Left pointer for the start of the string
        int r = s.length() - 1; // Right pointer for the end of the string

        if (x < 0)
            return false; // Negative numbers are not palindromic

        while (l < r) {
            if (s.charAt(l) == s.charAt(r)) {
                l++; // Move the left pointer to the right
                r--; // Move the right pointer to the left
            } else {
                return false; // Characters at l and r do not match, not a palindrome
            }
        }

        return true; // All characters matched, it is a palindrome
    }
}
