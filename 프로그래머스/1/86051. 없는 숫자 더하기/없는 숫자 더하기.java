import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        HashSet<Integer> set = new HashSet<Integer>();	
        int num = 0;
        
        for(int i : numbers){
            set.add(i);
        }
        for(int j = 0; j<10; j++){
            if(!set.contains(j)) num += j;
        }
        return num;
    }
}