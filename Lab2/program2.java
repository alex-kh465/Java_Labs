public class program2 {

    // Static variable to store the maximum profit
    static int maxProfit = 0;

    // Static method to find the maximum profit
    public static void findMaxProfit(int[] prices) {
        // Ensure there are at least two prices for transactions
        if (prices == null || prices.length < 2) {
            System.out.println("Insufficient data for transactions.");
            return;
        }

        // Loop to find maximum profit with at most two transactions
        int n = prices.length;

        // First transaction profit calculation
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // Calculate profit from the first transaction
                int firstTransactionProfit = prices[j] - prices[i];

                // Second transaction profit calculation
                for (int k = j + 1; k < n; k++) {
                    for (int l = k + 1; l < n; l++) {
                        // Calculate profit from the second transaction
                        int secondTransactionProfit = prices[l] - prices[k];

                        // Total profit from both transactions
                        int totalProfit = firstTransactionProfit + secondTransactionProfit;

                        // Update maxProfit if the total profit is higher
                        if (totalProfit > maxProfit && firstTransactionProfit > 0 && secondTransactionProfit > 0) {
                            maxProfit = totalProfit;
                        }
                    }
                }
            }
        }

        // Print the maximum profit
        System.out.println("Maximum Profit: " + maxProfit);
    }

    public static void main(String[] args) {
        // Sample Test Case
        int[] prices = {10, 22, 5, 75, 65, 80};

        // Calculate and print the maximum profit
        findMaxProfit(prices);
    }
}
