import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        for(int i=0; i<discount.length-9; i++){
            List<String> wList = new ArrayList<>();
            for(int j=0; j<number.length; j++){
                for(int k=0; k<number[j]; k++){
                    wList.add(want[j]);
                }
            }
            for(int j=i; j<i+10; j++){
                wList.remove(discount[j]);
            }
            if(wList.size()==0)
                answer++;
        }
        return answer;
    }
}