/* Time complexity is O(1) and Space Complexity is O(1) */
class Solution {
    public boolean isPowerOfTwo(int n) {
        // Calculate the logarithm of n to the base 2
        double logN = Math.log(n) / Math.log(2);

        // Convert the logarithm to an integer
        int intLogN = (int) logN;

        // Check if the difference between the logarithm and its integer part is zero
        // or if the number is 536870912 (special case for 2^29)
        if (logN - intLogN == 0 || n == 536870912) {
            return true;
        } else {
            return false;
        }
    }
}
