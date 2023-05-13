/* Time Complexity - O(n), Space Complexity O(n) */
class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set = new HashSet<>(); // Create a HashSet to store unique numbers
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]); // Add each element of the array to the HashSet
        }
        
        int j = 1; // Initialize the missing positive number starting from 1
        
        // Check if j is present in the HashSet
        // If j is found, increment j and continue searching
        // If j is not found, it is the first missing positive number
        while (j <= nums.length) {
            if (set.contains(j))
                j++;
            else
                return j;
        }
        
        return j; // Return j if all positive numbers up to nums.length are present
    }
}


