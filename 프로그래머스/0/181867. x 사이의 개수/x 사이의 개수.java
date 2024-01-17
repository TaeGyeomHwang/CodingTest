import java.util.ArrayList;

class Solution {
    public int[] solution(String myString) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        int length = 0;
        
        for(int i=0; i<=myString.length(); i++){
            if(i==myString.length()){
                answer.add(length);
                break;
            }
            if(myString.charAt(i)=='x'){
                answer.add(length);
                length = 0;
            }else{
                length++;
            }
        }
        
        return answer.stream().mapToInt(i -> i).toArray();
    }
}