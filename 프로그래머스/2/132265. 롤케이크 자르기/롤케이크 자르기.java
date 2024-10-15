import java.util.*;

public class Solution {
    public int solution(int[] topping) {
        int n = topping.length;
        
        // 왼쪽과 오른쪽의 토핑 종류를 저장할 Set
        Set<Integer> leftSet = new HashSet<>();
        Set<Integer> rightSet = new HashSet<>();
        
        // 각 토핑의 등장 횟수를 저장할 배열 (1 ≤ topping[i] ≤ 10^6 이므로 충분히 큰 크기로 설정)
        int[] rightCount = new int[1000001]; 
        
        // 처음에 모든 토핑은 오른쪽에 있으므로 오른쪽 배열을 초기화
        for (int t : topping) {
            rightCount[t]++;
            rightSet.add(t);
        }

        int waysToCut = 0;

        // 순차적으로 왼쪽에 토핑을 하나씩 추가하고 오른쪽에서 제거하면서 공평하게 나누는 지점 확인
        for (int i = 0; i < n - 1; i++) {
            int currentTopping = topping[i];
            
            // 왼쪽에 토핑 추가
            leftSet.add(currentTopping);

            // 오른쪽에서 해당 토핑 제거
            rightCount[currentTopping]--;
            if (rightCount[currentTopping] == 0) {
                rightSet.remove(currentTopping);
            }

            // 왼쪽과 오른쪽의 토핑 종류 개수가 같다면 공평하게 나눌 수 있는 지점
            if (leftSet.size() == rightSet.size()) {
                waysToCut++;
            }
        }

        return waysToCut;
    }
}
