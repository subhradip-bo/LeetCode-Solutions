/* Time Complexity - O(n), Space Complexity O(1) */
class Solution {
    public int climbStairs(int n) {
        int a = 0; // Number of ways to reach n-2 steps
        int b = 1; // Number of ways to reach n-1 steps
        int c = 0; // Number of ways to reach n steps

        for (int i = 1; i <= n; i++) {
            c = a + b; // Number of ways to reach current step
            a = b; // Update number of ways to reach n-2 steps
            b = c; // Update number of ways to reach n-1 steps
        }

        return c; // Number of ways to reach the top of the stairs (n steps)
    }
}
