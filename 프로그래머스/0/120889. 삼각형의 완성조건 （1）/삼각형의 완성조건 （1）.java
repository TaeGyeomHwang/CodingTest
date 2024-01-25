class Solution {
    public int solution(int[] sides) {
        int max = 0;
        int sum = 0;
        for(int i : sides){
            max = Math.max(max, i);
            sum += i;
        }
        if(sum-max<=max){
            return 2;
        }else{
            return 1;
        }
    }
}