/* Time Complexity - O(n), Space Complexity O(1) */
class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.indexOf(needle); // Find the index of the first occurrence of the needle in the haystack
        return n; // Return the index (or -1 if not found)
    }
}

