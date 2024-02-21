import java.util.*;
class Solution {
    public int[] solution(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        int zeroCount = 0;
        while(!s.equals("1")){
            sb.setLength(0);
            count++;
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i)=='0') zeroCount++;
                else sb.append(s.charAt(i));
            }
            int decimal = sb.length();
            s = Integer.toBinaryString(decimal);
        }
        
        return new int[] {count,zeroCount};
    }
}