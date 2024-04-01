import java.util.*;

class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        
        String str = Integer.toString(n,k);
        String[] arr = str.split("0");
        
        List<Long> list = new ArrayList<>();
        
        for(String s: arr){
            if(s.equals("") || s.equals("1"))
                continue;
            list.add(Long.parseLong(s));
        }
        
        for(Long num: list){
            boolean isPrime = true;
            
            int sqrt = (int) Math.sqrt(num);
            
            for (int i = 2; i <= sqrt; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            
            if(isPrime)
                answer++;
        }
        
        return answer;
    }
}

