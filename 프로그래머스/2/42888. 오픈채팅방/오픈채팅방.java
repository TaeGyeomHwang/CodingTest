import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        // Map to store the current nickname of each user ID
        Map<String, String> userMap = new HashMap<>();
        // List to store the sequence of events (enter or leave messages)
        List<String[]> events = new ArrayList<>();
        
        // Process each record
        for (String rec : record) {
            String[] parts = rec.split(" ");
            String action = parts[0];
            String userId = parts[1];
            
            if (action.equals("Enter")) {
                // Update the user's nickname and add an entry event
                userMap.put(userId, parts[2]);
                events.add(new String[]{userId, "님이 들어왔습니다."});
            } else if (action.equals("Leave")) {
                // Add a leave event for the user
                events.add(new String[]{userId, "님이 나갔습니다."});
            } else if (action.equals("Change")) {
                // Update the user's nickname only
                userMap.put(userId, parts[2]);
            }
        }
        
        // Prepare the result with updated nicknames
        String[] result = new String[events.size()];
        int i = 0;
        for (String[] event : events) {
            String userId = event[0];
            String message = event[1];
            result[i++] = userMap.get(userId) + message;
        }
        
        return result;
    }
}