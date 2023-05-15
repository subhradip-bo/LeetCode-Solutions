/* Time Complexity - O(rowIndex^2), Space Complexity O(rowIndex) */
class Solution {
    public List<Integer> getRow(int rowIndex) {
        // Create a new ArrayList to store the row
        List<Integer> row = new ArrayList<Integer>();

        // Initialize the row with zeros
        for (int i = 0; i <= rowIndex; i++) {
            row.add(0);
        }

        // Set the first element of the row to 1
        row.set(0, 1);

        // Compute the values of the remaining elements in the row
        for (int i = 1; i <= rowIndex; i++) {
            // Traverse the row backwards to avoid overwriting values
            for (int j = i; j >= 1; j--) {
                // Compute the sum of the current and previous element in the row
                int sum = row.get(j) + row.get(j - 1);
                // Update the current element in the row with the computed sum
                row.set(j, sum);
            }
        }

        // Return the resulting row
        return row;
    }
}


