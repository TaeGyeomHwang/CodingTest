import java.util.ArrayList;

class Solution {
    public String[] solution(String[] names) {
        int index;
        if(names.length%5!=0){
            index = names.length / 5 + 1;
        }else{
            index = names.length / 5;
        }
        String[] answer = new String[index];
        
        for(int i=0, j=0; i<names.length; i+=5, j++){
            answer[j] = names[i];
        }
        
        return answer;
    }
}