import java.util.*;

class Solution {
    static class Node {
        int x, y, dist;

        Node(int x, int y, int dist) {
            this.x = x;
            this.y = y;
            this.dist = dist;
        }    
    }
    
    public int solution(int[][] maps) {
         int n = maps.length;
        int m = maps[0].length;

        // Direction arrays to move in 4 directions
        int[] dx = {0, 0, 1, -1};
        int[] dy = {1, -1, 0, 0};

        Queue<Node> queue = new LinkedList<>();
        boolean[][] visited = new boolean[n][m];

        queue.offer(new Node(0, 0, 1));
        visited[0][0] = true;

        while (!queue.isEmpty()) {
            Node node = queue.poll();

            // Check if we reached the opponent's camp
            if (node.x == n - 1 && node.y == m - 1) {
                return node.dist;
            }

            // Explore all 4 directions
            for (int i = 0; i < 4; i++) {
                int nx = node.x + dx[i];
                int ny = node.y + dy[i];

                // Check if the next move is within bounds and not a wall and not visited
                if (nx >= 0 && nx < n && ny >= 0 && ny < m && maps[nx][ny] == 1 && !visited[nx][ny]) {
                    queue.offer(new Node(nx, ny, node.dist + 1));
                    visited[nx][ny] = true;
                }
            }
        }

        // If we cannot reach the opponent's camp
        return -1;
    }
}