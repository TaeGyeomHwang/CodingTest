class Solution {
    public int solution(int a, int b) {
        int tmp, n;
        int denominator = b;
        if (a < b) {    // 둘 중 큰 수 정하기
            tmp = a;
            a = b;
            b = tmp;
        }
        while (b != 0) { // 최대공약수 구하기
            n = a % b;
            a = b;
            b = n;
        }
        denominator /= a;

        while (denominator % 2 == 0) {
            denominator /= 2;
        }
        while (denominator % 5 == 0) {
            denominator /= 5;
        }

        if (denominator == 1) {
            return 1;
        } else {
            return 2;
        }
    }
}