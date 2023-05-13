/* Time Complexity - O((n + m) log(n + m)), Space Complexity O(n + m) */
class Solution
{
  public double findMedianSortedArrays (int[]nums1, int[]nums2)
  {
    int i = 0, j = 0, k = 0;	// Pointers for iterating through nums1, nums2, and arr
    int n = nums1.length;	// Length of nums1
    int m = nums2.length;	// Length of nums2
    int arr[] = new int[n + m];	// Array to store the merged and sorted elements

    // Merge elements from nums1 into arr
    while (i < n)
      {
	arr[k] = nums1[i];
	i++;
	k++;
      }

    // Merge elements from nums2 into arr
    while (j < m)
      {
	arr[k] = nums2[j];
	j++;
	k++;
      }

    Arrays.sort (arr);		// Sort the merged array

    // Calculate and return the median
    if (k % 2 != 0)
      return (double) arr[k / 2];
    else
      return (double) (arr[(k - 1) / 2] + arr[k / 2]) / 2.0;
  }
}
