/* Time Complexity - O(n + k * m), Space Complexity O(n) */
class Solution {
    public String reverseWords(String s) {
        String rev = ""; // Variable to store the reversed words
        
        // Split the input string by space delimiter and iterate through the resulting array of words
        for (String str : s.split(" ")) {
            rev = str.trim() + " " + rev.trim(); // Add each word to the beginning of the 'rev' string
        }
        
        return rev.trim(); // Return the reversed words string after removing leading/trailing spaces
    }
}
