/* Time complexity is O(n log n) and Space Complexity is O(n) */
class Solution {
    public boolean isAnagram(String s, String t) {
        // Convert the strings to character arrays
        char[] c = t.toCharArray();
        char[] d = s.toCharArray();

        // Sort the character arrays in ascending order
        Arrays.sort(c);
        Arrays.sort(d);

        // Create new strings from the sorted character arrays
        String a = new String(c);
        String b = new String(d);

        // Check if the sorted strings are equal
        return a.equals(b);
        }
    }

