import java.util.*;
class Solution {
    public String solution(String s) {
        Map<String, Integer> map = new HashMap<>();
        for(String str: s.split("")){
            map.put(str,map.getOrDefault(str,0)+1);
        }
        List<String> list  = new ArrayList<>();
        map.forEach((key, value) -> {	
            if(value==1){
                list.add(key);
            }
        });	
        Collections.sort(list);
        return String.join("", list);
    }
}