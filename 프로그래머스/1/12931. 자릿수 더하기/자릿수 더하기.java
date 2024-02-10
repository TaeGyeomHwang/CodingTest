import java.util.*;

public class Solution {
    public int solution(int n) {
        String[] arr = (n+"").split("");
        int ans = 0;
        for(String s : arr){
            ans += Integer.parseInt(s);
        }
        return ans;
    }
}