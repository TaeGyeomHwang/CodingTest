import java.util.Arrays;

class Solution {
    public int solution(int[][] routes) {
        // Sort the routes by their exit points in ascending order
        Arrays.sort(routes, (a, b) -> Integer.compare(a[1], b[1]));
        
        int cameras = 0;
        int lastCameraPosition = Integer.MIN_VALUE;

        // Iterate through each route
        for (int[] route : routes) {
            // If the vehicle's entry point is beyond the last camera position
            if (route[0] > lastCameraPosition) {
                // Install a new camera at the vehicle's exit point
                lastCameraPosition = route[1];
                cameras++;
            }
        }
        
        return cameras;
    }
}