/* Time Complexity - O(n), Space Complexity O(1) */
class Solution {
    public int maxProfit(int[] prices) {
        int cg = 0; // Current gain
        int profit = 0; // Maximum profit

        // If there are no prices or only one price, return 0
        if (prices.length <= 1)
            return 0;

        for (int i = 1; i < prices.length; i++) {
            // Calculate the gain from the current price compared to the previous price
            cg = cg + prices[i] - prices[i - 1];

            // If the current gain is negative, reset it to 0
            if (cg < 0)
                cg = 0;
            // If the current gain is greater than or equal to the current maximum profit, update the maximum profit
            else if (cg >= profit)
                profit = cg;
        }

        return profit;
    }
}



