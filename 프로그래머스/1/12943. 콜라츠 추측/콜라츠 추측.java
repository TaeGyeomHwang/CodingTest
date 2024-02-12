class Solution {
    public int solution(int num) {
        int count = 0;
        if (num == 1) return count;
        long n = num;
        for (int i = 0; i < 500; i++) {
            count++;
            if (n % 2 == 0) n = n / 2;
            else n = n * 3 + 1;
            if (n == 1) return count;
        }
        return -1;
    }
}