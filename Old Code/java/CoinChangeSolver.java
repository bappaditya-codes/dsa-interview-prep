import java.util.Arrays;

public class CoinChangeSolver {

    public static int minimumCoins(int[] coins, int amount) {
        if (amount < 0) {
            return -1;
        }

        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);

        dp[0] = 0;

        for (int current = 1; current <= amount; current++) {
            for (int coin : coins) {
                if (coin > 0 && coin <= current) {
                    dp[current] = Math.min(
                            dp[current],
                            dp[current - coin] + 1
                    );
                }
            }
        }

        return dp[amount] > amount ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        int[] coins = {1, 2, 5};

        System.out.println(minimumCoins(coins, 11));
    }
}
