class Solution {
    public int solution(String A, String B) {
        if (A.equals(B)) {
            return 0;
        } else {
            int n = A.length();
            for (int i = 0; i < n; i++) {
                if (A.equals(B)) {
                    return i;
                }
                A = A.charAt(n - 1) + A.substring(0, n - 1);
            }
            return -1;
        }
    }
}