class Solution {
    public int solution(int n) {
        // Modulo value as given in the problem
        int MOD = 1_000_000_007;

        // Base cases
        if (n == 1) return 1;
        if (n == 2) return 2;

        // dp array to store the ways to fill 2 x i floor
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;

        // Fill dp array using the recurrence relation
        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % MOD;
        }

        // The answer for a 2 x n floor
        return dp[n];
    }
}