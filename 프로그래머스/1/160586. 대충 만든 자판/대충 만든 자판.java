import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        // 각 문자와 필요한 최소한의 입력을 저장하는 map
        Map<Character, Integer> minPresses = new HashMap<>();

        // 각 문자에 필요한 최소의 키입력으로 map 채우기
        for (int i = 0; i < keymap.length; i++) {
            String keyChars = keymap[i];
            for (int j = 0; j < keyChars.length(); j++) {
                char ch = keyChars.charAt(j);
                int presses = j + 1;
                if (!minPresses.containsKey(ch) || presses < minPresses.get(ch)) {
                    minPresses.put(ch, presses);
                }
            }
        }

        // 각 문자열에 대한 결과를 저장하는 배열
        int[] result = new int[targets.length];

        // 각 문자열에 필요한 최소 입력 계산
        for (int i = 0; i < targets.length; i++) {
            String target = targets[i];
            int totalPresses = 0;
            boolean canType = true;

            for (int j = 0; j < target.length(); j++) {
                char ch = target.charAt(j);
                if (minPresses.containsKey(ch)) {
                    totalPresses += minPresses.get(ch);
                } else {
                    canType = false;
                    break;
                }
            }

            // 작성 가능한 경우 totalPresses를 추가, 그렇지 않은 경우 -1을 추가
            result[i] = canType ? totalPresses : -1;
        }

        return result;
    }
}