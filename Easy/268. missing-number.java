/* Time complexity is O(n) and space complexity is O(1) */
class Solution {
    public int missingNumber(int[] nums) {
        // Calculate the expected sum of numbers from 0 to n using the formula n*(n+1)/2
        int expectedSum = nums.length * (nums.length + 1) / 2;
        
        int actualSum = 0;
        
        // Calculate the actual sum of the numbers in the array
        for (int i = 0; i < nums.length; i++) {
            actualSum += nums[i];
        }
        
        // The missing number is the difference between the expected sum and the actual sum
        return expectedSum - actualSum;
    }
}