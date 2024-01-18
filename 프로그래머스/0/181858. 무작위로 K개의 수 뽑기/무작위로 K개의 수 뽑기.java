import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        List<Integer> list = new ArrayList<Integer>();
        
        for (int i = 0; i < arr.length; i++) {
            if(i==0){
                list.add(arr[i]);
                continue;
            }
            if (!list.contains(arr[i])) {
                list.add(arr[i]);
            }
        }
        if(list.size()==k) return list.stream().mapToInt(i -> i).toArray();
        else if(list.size()>k){
            while(list.size()>k){
                list.remove(list.size()-1);
            }
            return list.stream().mapToInt(i -> i).toArray();
        }else{
            while(list.size()<k){
                list.add(-1);
            }
            return list.stream().mapToInt(i -> i).toArray();
        }
    }
}