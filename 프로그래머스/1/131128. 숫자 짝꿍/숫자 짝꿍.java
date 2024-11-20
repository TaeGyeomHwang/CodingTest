import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        // Frequency arrays for digits 0-9 in X and Y
        int[] countX = new int[10];
        int[] countY = new int[10];

        // Count occurrences of each digit in X
        for (char c : X.toCharArray()) {
            countX[c - '0']++;
        }

        // Count occurrences of each digit in Y
        for (char c : Y.toCharArray()) {
            countY[c - '0']++;
        }

        // Build the result using StringBuilder
        StringBuilder result = new StringBuilder();
        for (int i = 9; i >= 0; i--) { // Start from largest digit
            int commonCount = Math.min(countX[i], countY[i]);
            for (int j = 0; j < commonCount; j++) {
                result.append(i);
            }
        }

        // Handle edge cases
        if (result.length() == 0) {
            return "-1"; // No common digits
        } else if (result.charAt(0) == '0') {
            return "0"; // Result consists only of zeros
        } else {
            return result.toString(); // Return the largest number
        }
    }
}