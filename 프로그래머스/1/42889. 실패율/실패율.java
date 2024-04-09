import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] arr = new int[N+1];
        double reachedPlayer = stages.length;
        
        for(int i=0; i<stages.length; i++){
            arr[stages[i]-1]++;
        }
        
        HashMap<Integer, Double> map = new HashMap<>();
        
        for(int i=0; i<arr.length-1; i++){
            double num = 0.0;
            if(arr[i]!=0){
                num = arr[i] / reachedPlayer;
            }
            
            map.put(i+1, num);
            reachedPlayer -= arr[i];
        }
        
        List<Integer> keySet = new ArrayList<>(map.keySet());
        int[] answer = new int[N];
        
        keySet.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1)));

        // for (Integer key : keySet) {
        //     System.out.print("Key : " + key);
        //     System.out.println(", Val : " + map.get(key));
        // }
        
        for(int i=0; i<keySet.size(); i++){
            answer[i] = keySet.get(i);
        }
        return answer;
    }
}