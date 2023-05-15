/* Time Complexity - O(numRows^2), Space Complexity O(numRows^2) */
class Solution {
    public List<List<Integer>> generate(int numRows) {
        // Create a new ArrayList to store the triangle of numbers
        List<List<Integer>> arrayList = new ArrayList<List<Integer>>();

        // Iterate over each row
        for (int i = 0; i < numRows; i++) {
            // Create a new ArrayList to store the current row
            List<Integer> r = new ArrayList<Integer>();

            // Iterate over each element in the current row
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    // If the element is at the first or last position in the row, set it to 1
                    r.add(1);
                } else {
                    // If the element is not at the first or last position, calculate its value
                    // by summing the corresponding elements from the previous row
                    List<Integer> prevRow = arrayList.get(i - 1);
                    int num = prevRow.get(j - 1) + prevRow.get(j);
                    r.add(num);
                }
            }

            // Add the current row to the triangle
            arrayList.add(r);
        }

        // Return the resulting triangle of numbers
        return arrayList;
    }
}

