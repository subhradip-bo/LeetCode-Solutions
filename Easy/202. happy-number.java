/* Time Complexity - O(log n), Space Complexity O(log n) */
class Solution {
    public boolean isHappy(int n) {
        int r = 0; // Variable to store the current digit
        int s = 0; // Variable to store the sum of squares of digits
        
        // Check if the input number is already happy
        if (n == 1 || n == 7) {
            return true;
        }
        
        // Check if the input number is less than 10 (single digit), which cannot be happy
        if (n < 10) {
            return false;
        }
        
        // Compute the sum of squares of digits using the modulo and division operators
        while (n > 0) {
            r = n % 10; // Get the rightmost digit
            s += r * r; // Add the square of the digit to the sum
            n = n / 10; // Remove the rightmost digit from the number
        }
        
        // Recursively call the 'isHappy' function with the sum of squares of digits
        return isHappy(s);
    }
}

