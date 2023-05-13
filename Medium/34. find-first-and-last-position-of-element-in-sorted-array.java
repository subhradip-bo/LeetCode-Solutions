/* Time Complexity - O(n), Space Complexity O(1) */
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ar[] = {-1, -1}; // Initialize an array to store the range [start, end]
        
        // Search for the start index of the target value
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                ar[0] = i; // Store the index as the start position
                break; // Stop searching once the start index is found
            }
        }
        
        // If the start index is not found, return [-1, -1]
        if (ar[0] == -1) {
            return ar;
        }
        
        // Search for the end index of the target value
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == target) {
                ar[1] = i; // Store the index as the end position
                break; // Stop searching once the end index is found
            }
        }
        
        return ar; // Return the range [start, end]
    }
}


