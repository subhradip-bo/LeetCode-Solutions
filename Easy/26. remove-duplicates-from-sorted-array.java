/* Time Complexity - O(n), Space Complexity O(n) */
class Solution {
    public int removeDuplicates(int[] nums) {
        int l = nums.length; // Length of the input array
        int k = 0; // Counter for the unique elements
        int[] t = new int[l]; // Temporary array to store the unique elements
        
        // Iterate through the input array
        for (int i = 0; i < l - 1; i++) {
            int j = i + 1; // Next element index
            if (nums[i] != nums[j]) {
                t[k++] = nums[i]; // Add the unique element to the temporary array
            }
        }
        t[k++] = nums[l - 1]; // Add the last element to the temporary array

        // Copy the unique elements from the temporary array back to the original array
        for (int i = 0; i < k; i++) {
            nums[i] = t[i];
        }
        
        return k; // Return the number of unique elements
    }
}

