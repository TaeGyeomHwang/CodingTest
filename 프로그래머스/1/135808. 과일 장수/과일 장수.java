import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Integer[] arr = new Integer[score.length];
        for(int i=0; i<score.length; i++){
            arr[i] = score[i];
        }
        Arrays.sort(arr, Collections.reverseOrder());
        for(int i=0; i<arr.length; i++){
            if(i%m==m-1){
                answer += arr[i] * m;
            }
        }
        return answer;
    }
}