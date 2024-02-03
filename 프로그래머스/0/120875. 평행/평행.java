import java.util.Arrays;

class Solution {
    public int solution(int[][] dots) {
        Arrays.sort(dots, (a, b) -> {
            return a[0] - b[0];
        });

        int x1 = dots[0][0], y1 = dots[0][1];
        int x2 = dots[1][0], y2 = dots[1][1];
        int x3 = dots[2][0], y3 = dots[2][1];
        int x4 = dots[3][0], y4 = dots[3][1];

        if ((y2 - y1) * (x4 - x3) == (y4 - y3) * (x2 - x1)) {
            return 1;
        } else {
            return 0;
        }
    }
}