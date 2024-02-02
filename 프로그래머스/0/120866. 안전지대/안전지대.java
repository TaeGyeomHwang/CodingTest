class Solution {
    public int solution(int[][] board) {
        int n = board.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1) {
                    markAdjacentCells(board, i, j);
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 0) {
                    count++;
                }
            }
        }

        return count;
    }

    private void markAdjacentCells(int[][] board, int row, int col) {
        int n = board.length;
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}, {-1, -1}, {-1, 1}, {1, -1}, {1, 1}};

        for (int[] dir : directions) {
            int newRow = row + dir[0];
            int newCol = col + dir[1];

            if (newRow >= 0 && newRow < n && newCol >= 0 && newCol < n && board[newRow][newCol] == 0) {
                board[newRow][newCol] = -1;
            }
        }
    }
}