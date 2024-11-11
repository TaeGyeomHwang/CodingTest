import java.util.*;

class Solution {
    public int solution(int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);

        int points = 0;
        int i = 0; // Pointer for Team A
        int j = 0; // Pointer for Team B

        while (i < A.length && j < B.length) {
            if (B[j] > A[i]) {
                points++;
                i++;
            }
            j++;
        }

        return points;
    }
}
