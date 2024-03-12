import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int hIndex = 0;
        Arrays.sort(citations);
        
        for (int i = 0; i < citations.length; i++) {
            int papersWithMoreCitations = citations.length - i;
            if (citations[i] >= papersWithMoreCitations) {
                hIndex = papersWithMoreCitations;
                break;
            }
        }
        
        return hIndex;
    }
}
