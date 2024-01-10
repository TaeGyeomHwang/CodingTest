class Solution {
    public int solution(int[] numbers, int n) {
        int add = 0;
        for(int i = 0; i < numbers.length; i++){
            if(add <= n){
                add += numbers[i];
            }else{
                break;
            }
        }
        return add;
    }
}