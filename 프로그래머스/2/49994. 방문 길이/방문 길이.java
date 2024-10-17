import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(String dirs) {
         // Direction vectors for U, D, L, R
        int[] dx = {0, 0, -1, 1}; // L, R
        int[] dy = {1, -1, 0, 0}; // U, D
        
        // Set to store the unique paths
        Set<String> visitedPaths = new HashSet<>();
        
        // Starting position
        int x = 0, y = 0;
        
        // Mapping directions to corresponding moves
        for (char dir : dirs.toCharArray()) {
            int nx = x, ny = y;
            switch (dir) {
                case 'U': ny = y + 1; break;
                case 'D': ny = y - 1; break;
                case 'L': nx = x - 1; break;
                case 'R': nx = x + 1; break;
            }
            
            // Check if the new position is within boundaries (-5, 5)
            if (nx < -5 || nx > 5 || ny < -5 || ny > 5) {
                continue; // Ignore this move if out of bounds
            }
            
            // Create the path identifiers in both directions
            String path1 = x + "," + y + "->" + nx + "," + ny;
            String path2 = nx + "," + ny + "->" + x + "," + y;
            
            // Add the path if it's a new path
            if (!visitedPaths.contains(path1) && !visitedPaths.contains(path2)) {
                visitedPaths.add(path1);
                visitedPaths.add(path2);
            }
            
            // Move to the new position
            x = nx;
            y = ny;
        }
        
        // The number of unique paths walked
        return visitedPaths.size() / 2;
    }
}