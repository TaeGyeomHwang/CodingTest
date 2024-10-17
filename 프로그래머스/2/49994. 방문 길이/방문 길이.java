import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(String dirs) {
        // U, D, L, R의 방향 값
        int[] dx = {0, 0, -1, 1}; // L, R
        int[] dy = {1, -1, 0, 0}; // U, D
        
        // 처음 걸어본 경로를 저장하는 set
        Set<String> visitedPaths = new HashSet<>();
        
        // 시작 위치
        int x = 0, y = 0;
        
        // 각각의 이동에 대한 방향 매핑
        for (char dir : dirs.toCharArray()) {
            int nx = x, ny = y;
            switch (dir) {
                case 'U' -> ny = y + 1;
                case 'D' -> ny = y - 1; 
                case 'L' -> nx = x - 1;
                case 'R' -> nx = x + 1;
            }
            
            // 이동한 위치가 경계 내에 있는지 확인
            if (nx < -5 || nx > 5 || ny < -5 || ny > 5) {
                continue; // Ignore this move if out of bounds
            }
            
            // 양쪽 방향으로 경로 식별자 만들기
            String path1 = x + "," + y + "->" + nx + "," + ny;
            String path2 = nx + "," + ny + "->" + x + "," + y;
            
            // 새 경로인 경우 경로 추가
            if (!visitedPaths.contains(path1) && !visitedPaths.contains(path2)) {
                visitedPaths.add(path1);
                visitedPaths.add(path2);
            }
            
            // 새 위치로 이동
            x = nx;
            y = ny;
        }
        
        // 처음 걸어본 경로의 수
        return visitedPaths.size() / 2;
    }
}