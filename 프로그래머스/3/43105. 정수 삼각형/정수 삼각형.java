class Solution {
    public static int solution(int[][] triangle) {
        int height = triangle.length;
        int[][] dp = new int[height][height];

        // 삼각형의 맨 아래 행 값으로 dp 배열을 채우기
        for (int i = 0; i < height; i++) {
            dp[height - 1][i] = triangle[height - 1][i];
        }

        // 아래에서 위로 삼각형 순회
        for (int i = height - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                // dp 배열의 각 위치에 대한 최댓값 계산
                dp[i][j] = triangle[i][j] + Math.max(dp[i + 1][j], dp[i + 1][j + 1]);
            }
        }

        // 최댓값 반환
        return dp[0][0];
    }
}