import java.util.Arrays;

class Solution {
    public String solution(String myString, String pat) {
        String[] myString_arr = myString.split("");
        myString_arr = Arrays.copyOfRange(myString_arr, 0,myString.lastIndexOf(pat)+pat.length());
         
        return String.join("",myString_arr);
    }
}