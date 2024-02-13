import java.util.*;
class Solution {
    public Integer[] solution(int[] arr, int divisor) {
        HashSet<Integer> set = new HashSet<Integer>();	

        for(int i : arr){
            if(i%divisor==0) set.add(i);
        }
        Integer[] answer = set.toArray(new Integer[0]);
        if(answer.length==0) return new Integer[] {-1};
        Arrays.sort(answer);
        return answer;
    }
}