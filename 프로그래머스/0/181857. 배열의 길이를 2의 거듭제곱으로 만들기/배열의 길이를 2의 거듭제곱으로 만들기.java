import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        long powered = 2;
        int num = arr.length;
        
        for(int i: arr){
            list.add(i);
        }
        if(num == 1){
            return list.stream().mapToInt(i -> i).toArray();
        }
        while (powered < num) {
          powered = powered * 2;
        }
        
        for(int i=list.size(); i<powered; i++){
            list.add(0);
        }
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}