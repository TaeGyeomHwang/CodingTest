class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for(int i=0; i<queries.length; i++){
            int s = queries[i][0];
            int e = queries[i][1];
            
            for(int j=0; j<arr.length; j++){
                if(s<=j && j <= e){
                    arr[j]++;
                }
            }
        }
        return arr;
    }
}