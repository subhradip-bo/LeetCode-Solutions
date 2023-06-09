/* Time complexity is O(n logn) and space complexity is O(1) */
class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);  // Sort the input array in ascending order
        int duplicate = 0;  // Variable to store the duplicate element

        // Iterate through the sorted array starting from the second element
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                // If the current element is equal to the previous element,
                // it indicates a duplicate element
                duplicate = nums[i];
                break;  // Exit the loop as we have found the duplicate
            }
        }

        return duplicate;  // Return the found duplicate element
    }
}
