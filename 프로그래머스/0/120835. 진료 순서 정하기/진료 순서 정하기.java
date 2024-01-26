import java.util.*;
class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        Integer[] arr = Arrays.stream(emergency).boxed().toArray(Integer[]::new);
        Arrays.sort(arr, Collections.reverseOrder());
        for(int i=0; i<emergency.length; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[j]==emergency[i]){
                    answer[i] = j+1;
                }
            }
        }
        return answer;
    }
}