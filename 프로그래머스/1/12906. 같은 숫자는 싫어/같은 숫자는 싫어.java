import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(i==0) list.add(arr[i]);
            else{
                int lastNum = list.get(list.size() - 1);
                if(lastNum!=arr[i]) list.add(arr[i]);
            }
        }
        return list.stream().mapToInt(i->i).toArray();
    }
}