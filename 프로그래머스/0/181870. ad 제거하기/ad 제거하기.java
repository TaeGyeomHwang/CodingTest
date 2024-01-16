import java.util.Arrays;

class Solution {
    public String[] solution(String[] strArr) {
        
        strArr = Arrays.stream(strArr)
                .filter(item -> !item.contains("ad"))
                .toArray(String[]::new);
        
        return strArr;
    }
}