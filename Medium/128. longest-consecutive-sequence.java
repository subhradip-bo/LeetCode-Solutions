/* Time Complexity - O(n logn), Space Complexity O(1) */
class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }
        
        // Sort the array in ascending order
        Arrays.sort(nums);
        
        int x = 1; // Current consecutive sequence length
        int y = 1; // Longest consecutive sequence length
        
        // Iterate through the sorted array
        for(int i = 1; i < nums.length; i++) {
            // If the difference between current and previous element is 1,
            // increment the current sequence length
            if(nums[i] - nums[i-1] == 1) 
                x++;
            // If the elements are not equal, it means the sequence is broken,
            // so update the longest sequence length and reset the current length to 1
            else if(nums[i-1] != nums[i]) {
                y = Math.max(y, x);
                x = 1;
            }
        }
        
        // Return the maximum between the current and longest sequence length
        return Math.max(x, y);
    }
}
