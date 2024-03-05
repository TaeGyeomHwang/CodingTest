class Solution {
    public long solution(int n) {
        long answer = 0;
        if (n <= 3) return n;
        long prevPrev = 1;
        long prev = 2;
        for (long i = 3; i <= n; i++) {
            answer = (prev + prevPrev)%1234567;
            prevPrev = prev;
            prev = answer;
        }
        return answer;
    }
}