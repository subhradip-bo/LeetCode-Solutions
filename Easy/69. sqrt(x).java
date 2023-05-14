/* Time Complexity - O(log(x)), Space Complexity O(1) */
class Solution {
    public int mySqrt(int x) {
        double root = x / 2.0; // Initial guess for the square root
        double temp; // Temporary variable to store the previous root
        double tolerance = 0.0001; // Tolerance for convergence

        do {
            temp = root; // Store the previous root
            root = (temp + x / temp) / 2.0; // Calculate the next root using Newton's method
        } while (Math.abs(temp - root) > tolerance); // Continue iterating until the root converges within the tolerance

        return (int) root; // Return the integer part of the root
    }
}
