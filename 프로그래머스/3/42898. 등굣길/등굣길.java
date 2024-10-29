class Solution {
    public int solution(int m, int n, int[][] puddles) {
        // Constants
        final int MOD = 1_000_000_007;

        // Initialize the grid
        int[][] dp = new int[m + 1][n + 1];

        // Mark puddle cells as -1
        for (int[] puddle : puddles) {
            dp[puddle[0]][puddle[1]] = -1;
        }

        // Start at (1,1)
        dp[1][1] = 1;

        // Fill the dp grid
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                // Skip the starting cell and puddles
                if ((i == 1 && j == 1) || dp[i][j] == -1) continue;

                // Calculate the number of ways for the current cell
                int fromAbove = (i > 1 && dp[i - 1][j] != -1) ? dp[i - 1][j] : 0;
                int fromLeft = (j > 1 && dp[i][j - 1] != -1) ? dp[i][j - 1] : 0;

                dp[i][j] = (fromAbove + fromLeft) % MOD;
            }
        }

        // Result is the value in the bottom-right corner of the grid
        return dp[m][n];
    }
}