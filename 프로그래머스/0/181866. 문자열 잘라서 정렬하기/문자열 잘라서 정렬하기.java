import java.util.Arrays;
class Solution {
    public String[] solution(String myString) {
        String[] myString_arr = myString.split("x");
        Arrays.sort(myString_arr);
        
        return Arrays.stream(myString_arr).filter(item -> !item.equals("")).toArray(String[]::new);
    }
}