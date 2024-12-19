import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        // 성격 유형 점수를 저장할 Map
        Map<Character, Integer> scores = new HashMap<>();
        scores.put('R', 0);
        scores.put('T', 0);
        scores.put('C', 0);
        scores.put('F', 0);
        scores.put('J', 0);
        scores.put('M', 0);
        scores.put('A', 0);
        scores.put('N', 0);

        // 각 선택지에 따른 점수 계산
        for (int i = 0; i < survey.length; i++) {
            char disagreeType = survey[i].charAt(0);
            char agreeType = survey[i].charAt(1);
            int choice = choices[i];

            if (choice < 4) { // 비동의 선택지
                scores.put(disagreeType, scores.get(disagreeType) + (4 - choice));
            } else if (choice > 4) { // 동의 선택지
                scores.put(agreeType, scores.get(agreeType) + (choice - 4));
            }
        }

        // 결과를 담을 StringBuilder
        StringBuilder result = new StringBuilder();

        // 지표별 성격 유형 결정
        result.append(scores.get('R') >= scores.get('T') ? 'R' : 'T');
        result.append(scores.get('C') >= scores.get('F') ? 'C' : 'F');
        result.append(scores.get('J') >= scores.get('M') ? 'J' : 'M');
        result.append(scores.get('A') >= scores.get('N') ? 'A' : 'N');

        return result.toString();
    }
}