class Solution {
    public int solution(int slice, int n) {
        int count = 1;
        while(true){
            if(slice*count>=n){
                return count;
            }
            count++;
        }
    }
}