class Solution {
    public int solution(String[][] board, int h, int w) {
                int n = board.length; // Get the length of the board
        int count = 0; // Initialize the counter
        String targetColor = board[h][w]; // Get the color of the selected cell

        // Arrays to check adjacent cells (right, down, up, left)
        int[] dh = {0, 1, -1, 0};
        int[] dw = {1, 0, 0, -1};

        // Loop through each adjacent cell
        for (int i = 0; i < 4; i++) {
            int h_check = h + dh[i];
            int w_check = w + dw[i];

            // Check if the adjacent cell is within bounds
            if (h_check >= 0 && h_check < n && w_check >= 0 && w_check < n) {
                // Check if the adjacent cell has the same color
                if (board[h_check][w_check].equals(targetColor)) {
                    count++;
                }
            }
        }

        return count; // Return the final count
    }
}