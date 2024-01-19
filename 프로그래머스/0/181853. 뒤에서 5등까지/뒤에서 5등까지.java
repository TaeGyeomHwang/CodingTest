import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        // Set<Integer> set = new TreeSet<>();
        // for(int i : num_list){
        //     set.add(i);
        // }
        //처음부터 5개만 넣는법?
        // List<Integer> list = new ArrayList<> (set);
        // for(int i=list.size()-1; i>4; i--){
        //     list.remove(i);
        // }
        Arrays.sort(num_list);
        List<Integer> list = new ArrayList<> ();
        for(int i: num_list){
            if(list.size()==5){
                break;
            }
            list.add(i);
        }
        return list.stream().mapToInt(e -> e).toArray();
    }
}