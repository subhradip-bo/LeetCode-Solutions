/* Time Complexity - O(log(n)), Space Complexity O(1) */
class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = 0; // Left pointer
        int r = nums.length - 1; // Right pointer
        
        // Perform binary search
        while (l <= r) {
            int m = (l + r) / 2; // Calculate the middle index
            
            if (nums[m] == target) {
                return m; // Return the index if target is found
            } else if (nums[m] > target) {
                r = m - 1; // Adjust the right pointer to search the left half
            } else {
                l = m + 1; // Adjust the left pointer to search the right half
            }
        }
        
        return l; // Return the position to insert the target
    }
}


