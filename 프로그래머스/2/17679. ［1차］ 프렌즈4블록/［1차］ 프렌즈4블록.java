import java.util.*;

class Solution {
    public int solution(int m, int n, String[] board) {
        char[][] grid = new char[m][n];
        
        // Convert the board input to a char array
        for (int i = 0; i < m; i++) {
            grid[i] = board[i].toCharArray();
        }
        
        int totalRemoved = 0;
        
        while (true) {
            // Find blocks to remove
            boolean[][] marked = new boolean[m][n];
            boolean found = false;
            
            for (int i = 0; i < m - 1; i++) {
                for (int j = 0; j < n - 1; j++) {
                    char c = grid[i][j];
                    if (c != ' ' && c == grid[i][j + 1] && c == grid[i + 1][j] && c == grid[i + 1][j + 1]) {
                        marked[i][j] = true;
                        marked[i][j + 1] = true;
                        marked[i + 1][j] = true;
                        marked[i + 1][j + 1] = true;
                        found = true;
                    }
                }
            }
            
            // If no blocks are found, stop
            if (!found) break;
            
            // Count and remove blocks
            int removed = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (marked[i][j]) {
                        grid[i][j] = ' ';
                        removed++;
                    }
                }
            }
            totalRemoved += removed;
            
            // Let blocks fall
            for (int j = 0; j < n; j++) {
                for (int i = m - 1; i >= 0; i--) {
                    if (grid[i][j] == ' ') {
                        // Find the next block above to fall
                        int k = i - 1;
                        while (k >= 0 && grid[k][j] == ' ') k--;
                        if (k >= 0) {
                            grid[i][j] = grid[k][j];
                            grid[k][j] = ' ';
                        }
                    }
                }
            }
        }
        
        return totalRemoved;
    }
}