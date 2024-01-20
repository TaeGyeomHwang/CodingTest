import java.util.*;
class Solution {
    public String solution(String n_str) {
        int index = 0;
        String[] n_str_arr = n_str.split("");
        
        for(int i=0; i<n_str_arr.length; i++){
            if(n_str_arr[i].equals("0")){
                continue;
            }else{
                index = i;
                break;
            }
        }
        
        return String.join("",Arrays.copyOfRange(n_str_arr, index, n_str_arr.length));
    }
}