/* Time Complexity - O(n), Space Complexity O(1) */
class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim(); // Remove leading and trailing whitespace
        String lastWord = s.substring(s.lastIndexOf(" ") + 1); // Extract the last word
        return lastWord.length(); // Return the length of the last word
    }
}
