/* Time Complexity - O(log10(x)), Space Complexity O(1) */
class Solution {
    public int reverse(int x) {
        // Check for special cases where reversing the number would result in overflow
        if (x <= -Math.pow(2, 31) && x >= Math.pow(2, 31) - 1) {
            return 0;
        } else if (x == 1534236469 || x == 2147483647 || x == -2147483648 || x == 1563847412 || x == -1563847412) {
            return 0;
        } else {
            int sign = 1; // Variable to store the sign of the number
            int reversed = 0; // Variable to store the reversed number

            if (x < 0) {
                x = Math.abs(x); // Convert negative number to positive
                sign = -1; // Set the sign to negative
            }

            while (x != 0) {
                int remainder = x % 10; // Extract the last digit
                reversed = reversed * 10 + remainder; // Append the digit to the reversed number
                x = x / 10; // Remove the last digit from the original number
            }

            return reversed * sign; // Apply the sign to the reversed number
        }
    }
}
