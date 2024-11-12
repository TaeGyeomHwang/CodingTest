import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> participantMap = new HashMap<>();

        // Count occurrences of each participant's name
        for (String p : participant) {
            participantMap.put(p, participantMap.getOrDefault(p, 0) + 1);
        }

        // Decrease the count for each completed participant's name
        for (String c : completion) {
            participantMap.put(c, participantMap.get(c) - 1);
        }

        // Find the participant with count > 0, which means they didn't complete
        for (String key : participantMap.keySet()) {
            if (participantMap.get(key) > 0) {
                return key;
            }
        }

        return ""; // This will never be reached given valid input constraints
    }
}