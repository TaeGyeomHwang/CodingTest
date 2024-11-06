import java.util.*;

class Solution {
    public int[] solution(int n, int s) {
        // Check if it's possible to create a set with the given n and s
        if (s < n) {
            return new int[]{-1};
        }

        // Initialize the base value for each element
        int[] result = new int[n];
        Arrays.fill(result, s / n);

        // Calculate the remainder to distribute
        int remainder = s % n;

        // Distribute the remainder to maximize the product
        for (int i = 0; i < remainder; i++) {
            result[i]++;
        }

        // Sort the array in ascending order
        Arrays.sort(result);

        return result;
    }
}