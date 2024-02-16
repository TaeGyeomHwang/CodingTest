import java.util.*;

class Solution {
    public int solution(int left, int right) {
        int sum = 0;
        
        for(int i=left; i<right+1; i++){
            List<Integer> list = new ArrayList<>();
            for(int j=1; j<i+1; j++){
                if(i%j==0) list.add(j);
            }
            if(list.size()%2==0) sum+=i;
            else sum -= i;
        }
        
        return sum;
    }
}