import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] supoja1 = {1, 2, 3, 4, 5};
        int[] supoja2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] supoja3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int[] scores = new int[3]; // Array to store scores of each Supoja
        
        // Calculate scores for each Supoja
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == supoja1[i % supoja1.length]) scores[0]++;
            if (answers[i] == supoja2[i % supoja2.length]) scores[1]++;
            if (answers[i] == supoja3[i % supoja3.length]) scores[2]++;
        }
        
        // Find the maximum score
        int maxScore = Math.max(scores[0], Math.max(scores[1], scores[2]));
        
        // Find Supoja(s) with maximum score
        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == maxScore) {
                resultList.add(i + 1); // Add 1 to convert index to Supoja number
            }
        }
        
        // Convert list to array
        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }
        
        return result;
    }
}