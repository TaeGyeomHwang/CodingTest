import java.util.*;

class Solution {
        public int solution(int[] elements) {
        int n = elements.length;
        int[] doubleElements = new int[2 * n];
        for (int i = 0; i < n; i++) {   //  기존 배열을 두배로 확장해서 원형 수열 구현
            doubleElements[i] = elements[i];
            doubleElements[i + n] = elements[i];
        }
        HashSet<Integer> set = new HashSet<>(); //  중첩 방지를 위한 HashSet 사용
        for (int i = 0; i < n; i++) {   //  시작 인덱스
            for (int j = i; j < i + n; j++) {   //  시작 인덱스부터 끝 인덱스까지의 부분 수열 합 계산
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += doubleElements[k];
                }
                set.add(sum);
            }
        }
        return set.size();
    }
}