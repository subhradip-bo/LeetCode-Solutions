/* Time Complexity - O(m*n), Space Complexity O(m*n) */
import java.util.ArrayList;
import java.util.List;

class Solution {

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<Integer>();

        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            // If the matrix is null or empty, return the empty list
            return list;
        }

        int m = matrix.length; // Number of rows
        int n = matrix[0].length; // Number of columns
        int r = 0; // Current row index
        int c = 0; // Current column index

        while (r < m && c < n) {
            // Traverse the top row from left to right
            for (int i = c; i < n; i++) {
                list.add(matrix[r][i]);
            }
            r++; // Increment row index

            // Traverse the right column from top to bottom
            for (int i = r; i < m; i++) {
                list.add(matrix[i][n - 1]);
            }
            n--; // Decrement column index

            if (r < m) {
                // Traverse the bottom row from right to left
                for (int i = n - 1; i >= c; i--) {
                    list.add(matrix[m - 1][i]);
                }
                m--; // Decrement row index
            }

            if (c < n) {
                // Traverse the left column from bottom to top
                for (int i = m - 1; i >= r; i--) {
                    list.add(matrix[i][c]);
                }
                c++; // Increment column index
            }
        }

        return list;
    }
}
