import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int i = 0;
        List<Integer> list = new ArrayList<>();
        
        while (i < arr.length) {
            if (list.size() == 0) {
                list.add(arr[i]);
                i++;
            } else if (list.get(list.size() - 1) == arr[i]) {
                list.remove(list.size() - 1);
                i++;
            } else {
                list.add(arr[i]);
                i++;
            }
        }
        
        if (list.size() == 0) {
            int[] answer = {-1};
            return answer;
        } else {
            return list.stream().mapToInt(k -> k).toArray();
        }
    }
}