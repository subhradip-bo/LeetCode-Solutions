/* Time Complexity - O(1), Space Complexity O(1) */
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0]; // Initialize the prefix with the first string in the array

        // Iterate through the remaining strings in the array
        for (int i = 1; i < strs.length; i++) {
            // While the current string does not start with the prefix
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1); // Remove the last character from the prefix

                // If the prefix becomes empty, there is no common prefix
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix; // Return the longest common prefix
    }
}

