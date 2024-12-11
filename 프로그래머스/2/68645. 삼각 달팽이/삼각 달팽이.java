import java.util.*;

class Solution {
    public int[] solution(int n) {
                int[][] triangle = new int[n][n];
        int num = 1; // 채워넣을 숫자
        int x = -1, y = 0; // 시작 위치

        // 삼각형 달팽이 채우기
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (i % 3 == 0) { // 아래로 이동
                    x++;
                } else if (i % 3 == 1) { // 오른쪽으로 이동
                    y++;
                } else if (i % 3 == 2) { // 대각선 위로 이동
                    x--;
                    y--;
                }
                triangle[x][y] = num++;
            }
        }

        // 결과 배열 생성
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                result.add(triangle[i][j]);
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}