import java.util.*;
class Solution {
    public int solution(int number, int limit, int power) {
        int result = 0;
        int[] arr = new int[number];
        for(int i=1; i<=number; i++){
            // for(int j=1; j<=i; j++){
            //     if(i%j==0)
            //         arr[i-1]++;
            // }
            List<Integer> divisorList = new ArrayList<>();
            for (int j = 1; j * j <= i; j++) {
                if (i % j == 0) {
                    divisorList.add(j);
                    if (j != i / j) {
                        divisorList.add(i / j);
                    }
                }
            }
            arr[i-1] = divisorList.size();
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i]>limit)
                result+=power;
            else
                result+=arr[i];
        }
        return result;
    }
}