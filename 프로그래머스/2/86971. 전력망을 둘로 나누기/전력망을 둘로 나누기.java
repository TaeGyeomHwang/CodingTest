import java.util.*;

class Solution {
    public int solution(int n, int[][] wires) {
        // Create an adjacency list to represent the graph
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        // Build the graph
        for (int[] wire : wires) {
            int v1 = wire[0];
            int v2 = wire[1];
            graph.get(v1).add(v2);
            graph.get(v2).add(v1);
        }

        int minDifference = Integer.MAX_VALUE;

        // Iterate through each wire to simulate cutting it
        for (int[] wire : wires) {
            int v1 = wire[0];
            int v2 = wire[1];

            // Temporarily remove the connection
            graph.get(v1).remove((Integer) v2);
            graph.get(v2).remove((Integer) v1);

            // Calculate the size of one of the resulting subgraphs
            int size1 = bfs(graph, n, v1);
            int size2 = n - size1;

            // Update the minimum difference
            minDifference = Math.min(minDifference, Math.abs(size1 - size2));

            // Restore the connection
            graph.get(v1).add(v2);
            graph.get(v2).add(v1);
        }

        return minDifference;
    }
    // BFS to count the number of nodes in a connected component
    private int bfs(List<List<Integer>> graph, int n, int start) {
        boolean[] visited = new boolean[n + 1];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;

        int count = 0;

        while (!queue.isEmpty()) {
            int node = queue.poll();
            count++;

            for (int neighbor : graph.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }

        return count;
    }
}