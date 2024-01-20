import java.math.*;
class Solution {
    public String solution(String a, String b) {
        BigDecimal x = new BigDecimal(a);
        BigDecimal y = new BigDecimal(b);
        return ""+x.add(y);
    }
}