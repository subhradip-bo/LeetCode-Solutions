/* Time Complexity - O(n^2), Space Complexity O(1) */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l = nums.length; // Length of the input array
        int[] ar; // Declaring an array to store the indices

        // Loop through each element in the array
        for(int i = 0; i < l; i++) {
            // Iterate through the remaining elements in the array
            for(int j = i + 1; j < l; j++) {
                int add = nums[i] + nums[j]; // Calculate the sum of current pair of elements

                // Check if the sum matches the target
                if (add == target) {
                    ar = new int[] {i, j}; // Store the indices of the pair in the array
                    return ar; // Return the array with indices
                }
            }
        }

        return new int[0]; // Return an empty array if no pair is found
    }
}