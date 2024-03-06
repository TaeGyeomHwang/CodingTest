import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<tangerine.length; i++){
            int num = tangerine[i];
            String str = num+"";
            if(map.containsKey(str))
                map.put(str, map.get(str)+1);
            else
                map.put(str,1);
        }
        List<String> keySet = new ArrayList<>(map.keySet());
        keySet.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1)));

        for (String key : keySet) {
            answer++;
            for(int i=map.get(key); i>0; i--){
                k--;
                if(k==0)
                    return answer;
            }
        }
        return answer;
    }
}