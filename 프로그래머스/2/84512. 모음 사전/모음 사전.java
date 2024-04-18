import java.util.*;

class Solution {
    
    List<String> list;
    String[] arr = {"A", "E", "I", "O", "U"};
    
    public int solution(String word) {
        int answer = 0;
        list = new ArrayList<>();
        
        // 사전 만들기
        for(int i = 0 ; i < 5; ++i)
            makeWord(arr[i], 1);
        
        // 리스트에서 원하는 단어 찾기
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).equals(word))
                return i + 1;
        }
        return answer;
    }
    
    public void makeWord(String base, int depth){
        list.add(base);
        if(depth == 5){
            return;
        }
        for(int i = 0 ; i < 5; ++i)
            makeWord(base + arr[i], depth + 1);
    }
}
