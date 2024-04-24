import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int num : scoville){
            queue.offer(num);
        }

        while(queue.size()>1){
            if(queue.peek()>=K){
                return answer;
            }
            int first = queue.poll();
            int second = queue.poll();
            
            queue.offer(first+second*2);
            answer++;
        }
        
        if(queue.peek()>=K)
            return answer;
        
        return -1;
    }
}   