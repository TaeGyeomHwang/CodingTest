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

        // 네 방향으로 탐색하기 위한 방향 배열
        int[] dx = {0, 0, -1, 1};
        int[] dy = {1, -1, 0, 0};

        Queue<Node> queue = new LinkedList<>();
        boolean[][] visited = new boolean[n][m];

        queue.offer(new Node(0, 0, 1));
        visited[0][0] = true;

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            
            // System.out.println(node.x + " " + node.y + " " + node.dist);

            // 적 팀 진영에 도착했는지 확인
            if (node.x == n - 1 && node.y == m - 1) {
                return node.dist;
            }

            // 네 방향 모두 탐색
            for (int i = 0; i < 4; i++) {
                int nx = node.x + dx[i];
                int ny = node.y + dy[i];

                // 다음 이동 위치가 벽이 아니고, n * m 배열 내에 있고, 방문하지 않았는지 확인
                if (nx >= 0 && nx < n && ny >= 0 && ny < m && maps[nx][ny] == 1 && !visited[nx][ny]) {
                    queue.offer(new Node(nx, ny, node.dist + 1));
                    visited[nx][ny] = true;
                }
            }
        }

        // 적 진영까지 도달하지 못할 경우
        return -1;
    }
}