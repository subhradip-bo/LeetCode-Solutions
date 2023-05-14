/* Time Complexity - O(n^2), Space Complexity O(1) */
class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int c = 1; // Current value to be placed in the matrix
        int k = 0; // Starting row index
        int l = 0; // Starting column index
        int t = 0; // Ending index

        while (k < n && l < n) {
            // Traverse the top row from left to right
            for (int i = l; i < n; i++) {
                matrix[t][i] = c++;
            }
            t++; // Increment the starting row index

            // Traverse the right column from top to bottom
            for (int i = t; i < n; i++) {
                matrix[i][n - 1] = c++;
            }
            n--; // Decrement the ending index

            if (k < n) {
                // Traverse the bottom row from right to left
                for (int i = n - 1; i >= l; i--) {
                    matrix[n][i] = c++;
                }
                n--; // Decrement the ending row index
            }

            if (l < n) {
                // Traverse the left column from bottom to top
                for (int i = n; i >= t; i--) {
                    matrix[i][l] = c++;
                }
                l++; // Increment the starting column index
            }
        }

        return matrix;
    }
}

