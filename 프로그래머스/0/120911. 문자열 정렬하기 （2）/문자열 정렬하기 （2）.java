import java.util.*;
class Solution {
    public String solution(String my_string) {
        String[] my_string_arr = my_string.split("");
        for(int i=0; i<my_string_arr.length; i++){
            my_string_arr[i] = my_string_arr[i].toLowerCase();
        }
        Arrays.sort(my_string_arr);
        return String.join("",my_string_arr);
    }
}