/* Time Complexity - O(n), Space Complexity O(1) */
class Solution {
    public int singleNumber(int[] nums) {
        int a = 0; // Variable to store the single number
        
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // XOR operation: a XOR a = 0, so the duplicate numbers will cancel out
            // and only the single number will remain in the variable 'a'
            a = a ^ nums[i];
        }
        
        return a; // Return the single number
    }
}
