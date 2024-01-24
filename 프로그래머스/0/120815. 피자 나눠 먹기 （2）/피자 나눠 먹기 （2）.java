class Solution {
    public int solution(int n) {
        int gcd = 0;
        for(int i=1; i<=n && i<=6; i++){    // n과 6보다 작은 수 중에서
            if(n%i==0 && 6%i==0){   // 두 숫자의 공통된 약수 중 가장 큰 수 = 최대공약수
                gcd = i;
            }
        }
        return n/gcd;   // 6과 n의 최소공배수를 6으로 나눈 값
    }
}