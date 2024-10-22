class Solution {
    int solution(int[][] land) {
        int rows = land.length;
        
        // Iterate from the second row to the last row
        for (int i = 1; i < rows; i++) {
            // For each cell in the current row, update its value by adding the maximum score
            // from the previous row, but not from the same column
            land[i][0] += Math.max(land[i - 1][1], Math.max(land[i - 1][2], land[i - 1][3]));
            land[i][1] += Math.max(land[i - 1][0], Math.max(land[i - 1][2], land[i - 1][3]));
            land[i][2] += Math.max(land[i - 1][0], Math.max(land[i - 1][1], land[i - 1][3]));
            land[i][3] += Math.max(land[i - 1][0], Math.max(land[i - 1][1], land[i - 1][2]));
        }
        
        // The answer is the maximum value in the last row
        return Math.max(land[rows - 1][0], Math.max(land[rows - 1][1], Math.max(land[rows - 1][2], land[rows - 1][3])));
    }
}