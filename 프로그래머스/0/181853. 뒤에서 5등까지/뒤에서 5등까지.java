import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
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

