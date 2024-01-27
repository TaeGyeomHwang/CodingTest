class Solution {
    public int[][] solution(int[] num_list, int n) {
        int rows = (int)Math.ceil((double)num_list.length / n);
        int[][] answer = new int[rows][n];
        int a = 0;
        int b = 0;
        
        for (int i = 0; i < num_list.length; i++) {
            answer[a][b] = num_list[i];
            b++;
            if (b == n) {
                b = 0;
                a++;
            }
        }
        
        return answer;
    }
}