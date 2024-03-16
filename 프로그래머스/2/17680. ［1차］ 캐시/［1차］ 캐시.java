import java.util.*;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        if(cacheSize==0){
            for(int i=0; i<cities.length; i++){
                answer += 5;
            }
            return answer;
        }
        HashMap<String, Integer> cache = new HashMap<>();
        for(int i=0; i<cities.length; i++){
            String city = cities[i].toLowerCase();
            if(cache.get(city)!=null){
                cache.put(city, i);
                answer += 1;
            }else if(cache.size()<cacheSize){
                cache.put(city, i);
                answer += 5;
            }else{
                String delete = Collections.min(cache.entrySet(),(entry1, entry2) -> entry1.getValue() - entry2.getValue()).getKey();
                cache.remove(delete);
                cache.put(city, i);
                answer += 5;
            }
        }
        return answer;
    }
}