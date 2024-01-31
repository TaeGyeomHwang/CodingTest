import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        List<String> list = new ArrayList<>(Arrays.asList(spell));
        
        for (int i = 0; i < dic.length; i++) {
            String word = dic[i];
            List<String> remainingLetters = new ArrayList<>(list);
            
            for (int j = 0; j < word.length(); j++) {
                String letter = String.valueOf(word.charAt(j));
                if (remainingLetters.contains(letter)) {
                    remainingLetters.remove(letter);
                }
            }
            
            if (remainingLetters.isEmpty()) {
                return 1;
            }
        }
        
        return 2;
    }
}