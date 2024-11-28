import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        // Convert int array to String array for custom sorting
        String[] strNumbers = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            strNumbers[i] = String.valueOf(numbers[i]);
        }

        // Sort strings based on custom comparator
        Arrays.sort(strNumbers, (a, b) -> (b + a).compareTo(a + b));

        // If the largest number is "0", return "0" (e.g., [0, 0] case)
        if (strNumbers[0].equals("0")) {
            return "0";
        }

        // Build the largest number by concatenating sorted strings
        StringBuilder result = new StringBuilder();
        for (String num : strNumbers) {
            result.append(num);
        }

        return result.toString();
    }
}