/* Time Complexity - O(n), Space Complexity O(1) */
class Solution {
    public boolean isIsomorphic(String s, String t) {
        // Check if the lengths of the input strings are different
        if (s.length() != t.length())
            return false;

        // Initialize two arrays to store character mappings
        int[] map1 = new int[256];
        int[] map2 = new int[256];

        // Iterate through the strings and check character mappings
        for (int i = 0; i < s.length(); i++) {
            // If the character mappings are different, strings are not isomorphic
            if (map1[s.charAt(i)] != map2[t.charAt(i)])
                return false;

            // Update the character mappings
            map1[s.charAt(i)] = i + 1;
            map2[t.charAt(i)] = i + 1;
        }

        // All character mappings are consistent, strings are isomorphic
        return true;
    }
}
