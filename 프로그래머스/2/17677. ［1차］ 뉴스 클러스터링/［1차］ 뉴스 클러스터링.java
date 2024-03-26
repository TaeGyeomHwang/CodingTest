import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String str1, String str2) {
        Map<String, Integer> map1 = generateMultiset(str1.toLowerCase());
        Map<String, Integer> map2 = generateMultiset(str2.toLowerCase());

        if (map1.isEmpty() && map2.isEmpty()) {
            return 65536;
        }

        double intersection = 0.0;
        double union = 0.0;

        for (Map.Entry<String, Integer> entry : map1.entrySet()) {
            String key = entry.getKey();
            int count1 = entry.getValue();
            int count2 = map2.getOrDefault(key, 0);
            intersection += Math.min(count1, count2);
            union += Math.max(count1, count2);
        }

        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            String key = entry.getKey();
            if (!map1.containsKey(key)) {
                union += entry.getValue();
            }
        }

        double similarity = intersection / union;
        return (int) (similarity * 65536);
    }

    private Map<String, Integer> generateMultiset(String str) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length() - 1; i++) {
            String pair = str.substring(i, i + 2);
            if (pair.matches("[a-z]{2}")) {
                map.put(pair, map.getOrDefault(pair, 0) + 1);
            }
        }
        return map;
    }
}
