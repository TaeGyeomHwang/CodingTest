import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        Stack<Integer> basket = new Stack<>();
        int burstCount = 0;

        for (int move : moves) {
            int column = move - 1; // Convert to 0-based index
            int pickedDoll = 0;

            // Pick the topmost doll in the column
            for (int i = 0; i < board.length; i++) {
                if (board[i][column] != 0) {
                    pickedDoll = board[i][column];
                    board[i][column] = 0; // Remove the doll from the board
                    break;
                }
            }

            // If a doll was picked up
            if (pickedDoll != 0) {
                // Check if it matches the last doll in the basket
                if (!basket.isEmpty() && basket.peek() == pickedDoll) {
                    basket.pop(); // Remove the matching doll from the basket
                    burstCount += 2; // Increment the burst count by 2
                } else {
                    basket.push(pickedDoll); // Add the doll to the basket
                }
            }
        }

        return burstCount;
    }
}