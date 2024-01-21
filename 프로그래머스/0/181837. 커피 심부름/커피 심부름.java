import java.util.*;
class Solution {
    public int solution(String[] order) {
        int answer = 0;
        
        for(int i=0; i<order.length; i++){
            for(String s : order[i].split("hot|ice")){
               if(s.equals("")){
                   continue;
               }else if(s.equals("cafelatte")){
                   answer += 5000;
               }else{
                   answer += 4500;
               }
            }         
        }
        
        return answer;
    }
}