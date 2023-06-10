// Time Complexity is O(1) Space Complexity is O(1)
class Solution {
    public boolean isPowerOfFour(int n) {
        // Calculate the logarithm of the number with base 4
        double a = Math.log(n) / Math.log(4);
        // Convert the result to an integer
        int b = (int) a;

        // Check if the difference between a and b is zero
        if (a - b == 0)
            return true;
        else
            return false;
    }
}
