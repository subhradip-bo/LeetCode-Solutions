/* Time complexity is O(log n) and space complexity is O(1) */
class Solution {
    public boolean isUgly(int n) {
        // If the number is 0, it is not considered ugly
        if (n == 0) return false;
        
        // Reduce the number by dividing it with 5 until it is no longer divisible by 5
        while (n % 5 == 0) {
            n = n / 5;
        }
        
        // Reduce the number by dividing it with 2 until it is no longer divisible by 2
        while (n % 2 == 0) {
            n = n / 2;
        }
        
        // Reduce the number by dividing it with 3 until it is no longer divisible by 3
        while (n % 3 == 0) {
            n = n / 3;
        }
        
        // If the reduced number is equal to 1, it means it only has prime factors of 2, 3, and 5
        // and hence it is considered an ugly number
        return n == 1;
    }
}