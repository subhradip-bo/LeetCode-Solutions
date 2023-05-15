/* Time Complexity - O(n^2), Space Complexity O(1) */
class Solution
{
  public void sortColors (int[]nums)
  {
    // Iterate over the array from the beginning
    for (int i = 0; i < nums.length; i++)
      {
	// Compare each element with the remaining elements
	for (int j = i + 1; j < nums.length; j++)
	  {
	    int tmp = 0;	// Temporary variable to store the value during swapping

	    // If the current element is greater than the next element, swap them
	    if (nums[i] > nums[j])
	      {
		tmp = nums[i];
		nums[i] = nums[j];
		nums[j] = tmp;
	      }
	  }
      }
  }
}
