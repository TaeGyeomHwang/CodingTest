class Solution {
    public long solution(int a, int b) {
        long num = 0;
        if(a>b){
            int tmp = a;
            a = b;
            b = tmp;
        }
        for(int i=a; i<=b; i++){
            num+=i;
        }
        return num;
    }
}