class Solution {
    public String solution(int n, int t, int m, int p) {
        StringBuilder answer = new StringBuilder();
        int cur = 1;
        int num = 0;
        
        while(answer.length() < t){
            String str = Integer.toString(num, n).toUpperCase();
            for(char c: str.toCharArray()){
                if(answer.length() >= t){
                    return answer.toString();
                }
                if(cur % m == p || (cur % m == 0 && p == m)) {
                    answer.append(c);
                }
                cur++;
            }
            num++;
        }
        
        return answer.toString();
    }
}
