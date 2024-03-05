import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> list = new ArrayList<>();
        int min = 0;
        for(int i=0; i<score.length; i++){
            list.add(score[i]);
            Collections.sort(list, Collections.reverseOrder());
            if(list.size()<k)
                min = list.get(list.size() - 1);
            else
                min =list.get(k-1);
            answer[i]=min;
        } 
        return answer;
    }
}