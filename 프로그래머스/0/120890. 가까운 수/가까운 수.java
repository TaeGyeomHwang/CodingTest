class Solution {
    public int solution(int[] array, int n) {
        int answer = Integer.MAX_VALUE;
        int index = 0;
        
        for(int i=0; i<array.length; i++){
            int diff = Math.abs(n-array[i]);
            if(diff<answer){
                answer = diff;
                index = i;
            }else if(diff==answer && array[i]<array[index]){
                answer = diff;
                index = i;
            }
        }
        
        return array[index];
    }
}