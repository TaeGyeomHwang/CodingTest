import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        
        // 2의 배수인지 확인
        while (n % 2 == 0) {
            if (!list.contains(2)) {
                list.add(2);
            }
            n /= 2;
        }
        
        // 3부터 n의 제곱근까지의 홀수 중 약수가 있는지 확인
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                if (!list.contains(i)) {
                    list.add(i);
                }
                n /= i;
            }
        }
        
        // 홀수와 짝수 중 약수가 없다면 소수
        if (n > 2) {
            list.add(n);
        }
        
        return list.stream().mapToInt(e -> e).toArray();
    }
}