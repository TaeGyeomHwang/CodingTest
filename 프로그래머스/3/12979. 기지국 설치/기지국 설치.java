import java.util.*;

class Solution {
    public int solution(int N, int[] stations, int W) {
        int coverage = 0; // Tracks the furthest covered apartment
        int index = 0; // Index for stations array
        int additionalStations = 0;

        int range = 2 * W + 1; // Effective coverage range of one base station

        while (coverage < N) {
            // If the next station can extend coverage
            if (index < stations.length && stations[index] - W <= coverage + 1) {
                coverage = stations[index] + W;
                index++;
            } else {
                // Place a new base station at the furthest uncovered position
                additionalStations++;
                coverage += range;
            }
        }

        return additionalStations;
    }
}