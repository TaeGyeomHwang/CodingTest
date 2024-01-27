class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(int a=i; a<=j; a++){
            String[] arr = (""+a).split("");
            for(int b=0; b<arr.length; b++){
                if(arr[b].equals(""+k)){
                    answer++;
                }
            }
        }
        return answer;
    }
}