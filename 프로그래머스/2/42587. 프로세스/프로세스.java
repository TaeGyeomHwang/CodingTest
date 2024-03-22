import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        PriorityQueue<Integer> descQ = new PriorityQueue<>(Collections.reverseOrder());
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<priorities.length; i++){
            descQ.add(priorities[i]);
            map.put(i,priorities[i]);
        }
        Queue<Map.Entry<Integer, Integer>> q = new LinkedList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            q.offer(entry);
        }
        while(!q.isEmpty()){
            if(q.peek().getValue()==descQ.peek()){
                answer++;
                if(q.peek().getKey()==location)
                    return answer;
                q.poll();
                descQ.poll();
            }else{
                Map.Entry<Integer, Integer> entry = q.poll();
                q.offer(entry);
            }
        }
        return answer;
    }
}