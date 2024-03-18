import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int index = 0;
        List<Integer> list = new ArrayList<>();
        while(index<progresses.length){
            int count = 0;
            for(int i=0; i<progresses.length; i++){
                progresses[i] += speeds[i];
                if(progresses[index]>=100){
                    count++;
                    index++;
                }
            }
            if(count!=0)
                list.add(count);
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}