/* Time complexity is O(n) and space complexity is O(1) */
class Solution {
    public void moveZeroes(int[] nums) {
        int length = nums.length;  // Get the length of the input array
        int nonZeroIndex = 0;  // Index to track the position of non-zero elements
        
        // Iterate through the array
        for (int i = 0; i < length; i++) {
            if (nums[i] != 0) {  // If the current element is non-zero
                // Swap the non-zero element with the element at nonZeroIndex
                int temp = nums[nonZeroIndex];
                nums[nonZeroIndex] = nums[i];
                nums[i] = temp;
                nonZeroIndex++;  // Increment the nonZeroIndex to move to the next position
            }
        }
    }
}
