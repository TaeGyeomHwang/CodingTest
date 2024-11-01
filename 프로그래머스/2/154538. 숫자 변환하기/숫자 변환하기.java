import java.util.*;

class Solution {
    public int solution(int x, int y, int n) {
        if (x == y) return 0;

        Queue<int[]> queue = new LinkedList<>();
        boolean[] visited = new boolean[y + 1];
        queue.add(new int[]{x, 0});  // store the current value of x and the operation count
        visited[x] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int currentValue = current[0];
            int operations = current[1];

            // Try each possible operation
            int[] nextValues = {currentValue + n, currentValue * 2, currentValue * 3};

            for (int nextValue : nextValues) {
                if (nextValue == y) {
                    return operations + 1;
                }
                if (nextValue < y && !visited[nextValue]) {
                    queue.add(new int[]{nextValue, operations + 1});
                    visited[nextValue] = true;
                }
            }
        }

        return -1;  // if y is not reachable
    }
}