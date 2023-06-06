/* Time complexity is O(n*log(n)) and Space Complexity is O(1) */
class Solution {
    public int countDigitOne(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            int j = i;
            while (j != 0) {
                int r = j % 10; // Extract the last digit of j
                if (r == 1) { // If the digit is 1, increment the count
                    count++;
                }
                j = j / 10; // Remove the last digit of j
            }
        }
        return count;
        }
    }

