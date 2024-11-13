import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        // Initialize an array to track the uniform count for each student
        int[] uniforms = new int[n + 1];
        Arrays.fill(uniforms, 1);

        // Update uniforms array based on lost and reserve arrays
        for (int l : lost) {
            uniforms[l]--;
        }
        for (int r : reserve) {
            uniforms[r]++;
        }

        // Traverse through students and lend uniforms if possible
        for (int i = 1; i <= n; i++) {
            if (uniforms[i] == 0) { // If the student has no uniform
                if (i > 1 && uniforms[i - 1] == 2) { // Check the previous student
                    uniforms[i]++;
                    uniforms[i - 1]--;
                } else if (i < n && uniforms[i + 1] == 2) { // Check the next student
                    uniforms[i]++;
                    uniforms[i + 1]--;
                }
            }
        }

        // Count the students who have at least one uniform
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (uniforms[i] > 0) {
                count++;
            }
        }

        return count;
    }
}