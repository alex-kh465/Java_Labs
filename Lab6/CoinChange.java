import java.util.concurrent.*;

public class CoinChange {
    private static final int NUM_THREADS = 4;

    // Method to calculate the number of ways to make change using the given coins
    public static int countWays(int[] coins, int sum) {
        // Create a thread pool for concurrent execution
        ExecutorService executor = Executors.newFixedThreadPool(NUM_THREADS);

        // Create a future array to hold the results from each thread
        Future<Integer>[] futures = new Future[NUM_THREADS];
        int chunkSize = coins.length / NUM_THREADS;

        for (int i = 0; i < NUM_THREADS; i++) {
            final int start = i * chunkSize;
            final int end = (i == NUM_THREADS - 1) ? coins.length : (i + 1) * chunkSize;

            // Submit a task to the executor for each chunk of coins
            futures[i] = executor.submit(() -> {
                int[] dp = new int[sum + 1];
                dp[0] = 1;

                for (int iCoin = start; iCoin < end; iCoin++) {
                    // Renamed the inner loop variable to avoid the naming conflict
                    for (int j = coins[iCoin]; j <= sum; j++) {
                        dp[j] += dp[j - coins[iCoin]];
                    }
                }
                return dp[sum];
            });
        }

        // Collect results from all threads
        int totalWays = 0;
        try {
            for (Future<Integer> future : futures) {
                totalWays += future.get();
            }
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        executor.shutdown();
        return totalWays;
    }

    public static void main(String[] args) {
        int[] coins1 = {1, 2, 3};
        int sum1 = 4;
        System.out.println("Total ways for coins " + java.util.Arrays.toString(coins1) + " to make sum " + sum1 + ": " + countWays(coins1, sum1));

        int[] coins2 = {2, 5, 3, 6};
        int sum2 = 10;
        System.out.println("Total ways for coins " + java.util.Arrays.toString(coins2) + " to make sum " + sum2 + ": " + countWays(coins2, sum2));
    }
}
