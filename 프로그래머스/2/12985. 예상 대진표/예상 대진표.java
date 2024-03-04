class Solution {
    public int solution(int n, int a, int b) {
        int answer = 1; // 라운드 수를 계산하기 위한 변수

        // 두 참가자가 만날 때까지 반복
        while (true) {
            // 두 참가자의 번호가 홀수일 때, 번호를 1 증가시켜서 짝수로 만듭니다.
            if (a % 2 == 1) a++;
            if (b % 2 == 1) b++;

            // 두 참가자가 같은 그룹에 속할 때 만남을 의미합니다.
            if (a == b) break;

            // 다음 라운드로 진행하기 위해 번호를 반으로 나눕니다.
            a /= 2;
            b /= 2;

            // 라운드 수 증가
            answer++;
        }

        return answer;
    }
}