class Solution {
    public int solution(String dartResult) {
        int[] scores = new int[3];
        int currentIdx = -1;

        for (int i = 0; i < dartResult.length(); i++) {
            char c = dartResult.charAt(i);
            if (Character.isDigit(c)) {
                if (i > 0 && Character.isDigit(dartResult.charAt(i - 1))) {
                    scores[currentIdx] = 10;
                } else {
                    scores[++currentIdx] = Character.getNumericValue(c);
                }
            } else if (c == 'S') {
            } else if (c == 'D') {
                scores[currentIdx] *= scores[currentIdx];
            } else if (c == 'T') {
                scores[currentIdx] = scores[currentIdx] * scores[currentIdx] * scores[currentIdx];
            } else if (c == '*') {
                scores[currentIdx] *= 2;
                if (currentIdx > 0) {
                    scores[currentIdx - 1] *= 2;
                }
            } else if (c == '#') {
                scores[currentIdx] *= -1;
            }
        }

        return scores[0] + scores[1] + scores[2];
    }
}