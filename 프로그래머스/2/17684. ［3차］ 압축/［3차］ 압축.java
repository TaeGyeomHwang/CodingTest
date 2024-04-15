import java.util.*;

class Solution {
    public List<Integer> solution(String msg) {
        Map<String, Integer> dictionary = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        
        // Initialize dictionary with single characters
        for (int i = 0; i < 26; i++) {
            dictionary.put(Character.toString((char)('A' + i)), i + 1);
        }
        
        int index = 27; // Next index for new entries in the dictionary
        
        String w = ""; // Current word
        
        for (char c : msg.toCharArray()) {
            String wc = w + c; // Next word to check
            
            // If wc is in the dictionary, continue building the word
            if (dictionary.containsKey(wc)) {
                w = wc;
            } else {
                // Output the index of the current word w
                result.add(dictionary.get(w));
                
                // Add wc to the dictionary
                dictionary.put(wc, index++);
                
                // Start a new word with the current character c
                w = Character.toString(c);
            }
        }
        
        // Output the index of the last word
        result.add(dictionary.get(w));
        
        return result;
    }
}

