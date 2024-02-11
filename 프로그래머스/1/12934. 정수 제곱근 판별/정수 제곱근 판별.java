class Solution {
    public double solution(long n) {
        for(int i=0; Math.pow(i,2)<=n; i++){
            if(Math.pow(i,2)==n) return Math.pow(i+1,2);
        }
        return -1;
    }
}