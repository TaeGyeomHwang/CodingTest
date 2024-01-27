class Solution {
    public int[][] solution(int[] num_list, int n) {
        int row = num_list.length/n;
        int[][] answer = new int[row][n];
        int a=0;
        int b=0;
         
        for(int i=0; i<num_list.length; i++){
            if(b==n){
                a++;
                b=0;
            }
            answer[a][b] = num_list[i];
            b++;
        }
        
        return answer;
    }
}