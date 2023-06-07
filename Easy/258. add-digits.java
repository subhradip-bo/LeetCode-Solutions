/* Time complexity is O(d) and Space Complexity is O(d) */
class Solution {
    public int addDigits(int num) {
        // Base case: if the number is less than 10, it is already a single digit, so return it
        if (num < 10) {
            return num;
        }

        int sum = 0;
        int remainder;

        // Calculate the sum of the digits in the number
        while (num != 0) {
            remainder = num % 10;
            sum += remainder;
            num = num / 10;
        }

        // Recursively call the function with the sum to obtain the digital root
        return addDigits(sum);
    }
}


