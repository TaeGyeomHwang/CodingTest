import java.util.*;
class Solution {
    public int[] solution(int[] emergency) {
        //         풀이 1
        // int[] answer = new int[emergency.length];
        // Integer[] arr = Arrays.stream(emergency).boxed().toArray(Integer[]::new);
        // Arrays.sort(arr, Collections.reverseOrder());
        // for(int i=0; i<emergency.length; i++){
        //     for(int j=0; j<arr.length; j++){
        //         if(arr[j]==emergency[i]){
        //             answer[i] = j+1;
        //         }
        //     }
        // }
//          풀이 2
        int[] answer = new int[emergency.length];
        for(int i=0; i<emergency.length; i++){
            int idx = 1;
            for(int j=0; j<emergency.length; j++){
                if(emergency[i]<emergency[j]){
                    idx++;
                }
            }
            answer[i] = idx;
        }
        return answer;
    }
}