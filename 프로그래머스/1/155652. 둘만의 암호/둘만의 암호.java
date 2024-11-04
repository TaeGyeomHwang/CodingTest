import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
         // Create a set of characters to skip for fast lookup
        Set<Character> skipSet = new HashSet<>();
        for (char ch : skip.toCharArray()) {
            skipSet.add(ch);
        }

        StringBuilder result = new StringBuilder();

        for (char ch : s.toCharArray()) {
            char currentChar = ch;

            // Move 'index' positions forward, skipping characters in the skip set
            int count = 0;
            while (count < index) {
                // Move to the next character in a circular fashion
                currentChar++;
                if (currentChar > 'z') {
                    currentChar = 'a';  // Wrap around from 'z' to 'a'
                }

                // Only increment count if currentChar is not in the skip set
                if (!skipSet.contains(currentChar)) {
                    count++;
                }
            }
            result.append(currentChar);
        }

        return result.toString();
    }
}