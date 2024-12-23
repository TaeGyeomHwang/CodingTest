import java.util.*;

class Solution {
    public long solution(int[] weights) {
        // HashMap to count occurrences of each weight
        Map<Integer, Long> weightCount = new HashMap<>();
        for (int weight : weights) {
            weightCount.put(weight, weightCount.getOrDefault(weight, 0L) + 1);
        }

        long totalPairs = 0;

        // Possible distance ratios
        int[][] ratios = {{1, 1}, {2, 3}, {3, 4}, {2, 4}};

        for (Map.Entry<Integer, Long> entry : weightCount.entrySet()) {
            int weight = entry.getKey();
            long count = entry.getValue();

            // Count pairs within the same weight group
            if (count > 1) {
                totalPairs += (count * (count - 1)) / 2;
            }

            // Count pairs with different weights
            for (int[] ratio : ratios) {
                int num = ratio[0];
                int denom = ratio[1];
                if (weight * denom % num == 0) {
                    int pairedWeight = weight * denom / num;
                    if (pairedWeight > weight && weightCount.containsKey(pairedWeight)) {
                        totalPairs += count * weightCount.get(pairedWeight);
                    }
                }
            }
        }

        return totalPairs;
    }
}