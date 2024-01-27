class Solution {
    public int solution(int n) {
        int i = 1;
        int ans = 1;
        while(ans<=n){
            System.out.println(ans);
            ans *= i;
            i++;
        } 
        return i-2;
    }
}