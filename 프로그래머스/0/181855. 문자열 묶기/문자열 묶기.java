// class Solution {
//     public int solution(String[] strArr) {
//         int[] arr = new int[31];
//         int max = 0;
        
//         for(int i=0; i<arr.length; i++){
//             arr[i] = 0;
//         }
        
//         for(int i=0; i<strArr.length; i++){
//             arr[strArr[i].length()]++;
//             if(arr[strArr[i].length()]>max){
//                 max = arr[strArr[i].length()];
//             }
//         }
//         return max;
//     }
// }

import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (String str : strArr) {
            int len = str.length();
            if (map.containsKey(len)) {
                int value = map.get(len)+1;
                map.put(len, value);
            } else {
                map.put(len, 1);
            }
        }

        int answer = 0;
        for (int len : map.keySet())
            answer = Math.max(answer, map.get(len));
        return answer;
    }
}
