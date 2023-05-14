/* Time Complexity - O(n), Space Complexity O(1) */
class Solution {

    public int maxSubArray(int[] nums) {
        if (nums.length == 1) {
            // If there is only one element in the array, return that element
            return nums[0];
        }

        int cur = 0; // Tracks the current sum of subarray
        int max = Integer.MIN_VALUE; // Tracks the maximum sum found so far

        for (int i = 0; i < nums.length; i++) {
            cur = Math.max(nums[i], cur + nums[i]); // Calculate the maximum sum ending at index i
            if (cur > max) {
                max = cur; // Update the maximum sum if the current sum is greater
            }
        }

        return max;
    }
}
