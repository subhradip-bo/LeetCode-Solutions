/* Time Complexity - O(n), Space Complexity O(n) */
class Solution {
    public int removeElement(int[] nums, int val) {
        int l = nums.length; // Length of the input array
        int[] ar = new int[l]; // Temporary array to store the non-matching elements
        int k = 0; // Counter for the non-matching elements
        
        // Iterate through the input array
        for (int i = 0; i < l; i++) {
            if (val != nums[i]) {
                ar[k++] = nums[i]; // Add the non-matching element to the temporary array
            }
        }
        
        // Copy the non-matching elements from the temporary array back to the original array
        for (int i = 0; i < k; i++) {
            nums[i] = ar[i];
        }
        
        return k; // Return the number of non-matching elements
    }
}

