import java.util.*;
class Solution {
    public int[] solution(String[] operations) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(String s: operations){
            int num = Integer.parseInt(s.substring(2));
            if(s.startsWith("I")){
                pq.add(num);
            }else if(s.startsWith("D 1")){
                delete(pq, "max");
            }else{
                delete(pq, "min");
            }
        }
        
        if(pq.size()==0){
            return new int[2];
        }
        else{
            return getMaxAndMin(pq);
        }
    }
    
    private PriorityQueue<Integer> delete(PriorityQueue<Integer> pq, String maxOrMin){
        
        if(pq.size()==0)
            return pq;
        
        ArrayList<Integer> tempList = new ArrayList<>();
        
        while (pq.peek() != null) {
            tempList.add(pq.poll());
        }
        
        Collections.sort(tempList);
        
        if(maxOrMin.equals("max"))
            tempList.remove(tempList.size()-1);
        else
            tempList.remove(0);
        
        for (int num : tempList) {
            pq.offer(num);
        }
        
        return pq;
    }
    
    private int[] getMaxAndMin(PriorityQueue<Integer> pq){
        ArrayList<Integer> tempList = new ArrayList<>();
        
        while (pq.peek() != null) {
            tempList.add(pq.poll());
        }
        
        Collections.sort(tempList);
        
        int min = tempList.get(0);
        int max = tempList.get(tempList.size() - 1);
        
        return new int[] {max, min};
    }
}