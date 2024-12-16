class Solution {
    public int solution(int sticker[]) {
        int n = sticker.length;

        // Base case: If there is only one sticker, return its value
        if (n == 1) {
            return sticker[0];
        }

        // Case 1: Include the first sticker, exclude the last
        int maxSum1 = calculateMaxSum(sticker, 0, n - 2);
        // Case 2: Exclude the first sticker, include the last
        int maxSum2 = calculateMaxSum(sticker, 1, n - 1);

        // Return the maximum of the two cases
        return Math.max(maxSum1, maxSum2);
    }
    
    // Helper function to calculate the maximum sum in a linear array
    // dp[i] represents the maximum sum up to index i without selecting adjacent stickers
    public int calculateMaxSum(int[] arr, int start, int end) {
        int[] dp = new int[end - start + 1];
        dp[0] = arr[start];
        if (end - start > 0) {
            dp[1] = Math.max(arr[start], arr[start + 1]);
        }

        for (int i = 2; i <= end - start; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + arr[start + i]);
        }

        return dp[end - start];
    }
}