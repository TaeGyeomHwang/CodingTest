import java.util.*;
class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i=0; i<s.length(); i++){
            String str = ""+s.charAt(i);
            if(!map.containsKey(str)){
                answer[i] = -1;
            }else{
                answer[i] = i - map.get(str);
            }
            map.put(str,i);
        }
        
        return answer;
    }
}