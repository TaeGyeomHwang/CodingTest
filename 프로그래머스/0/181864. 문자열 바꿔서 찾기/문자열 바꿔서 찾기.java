import java.util.Arrays;
class Solution {
    public int solution(String myString, String pat) {
        String[] myString_arr = myString.split("");
        for(int i=0; i<myString_arr.length; i++){
            if(myString_arr[i].equals("A")){
                myString_arr[i] = "B";
            }else{
                myString_arr[i] = "A";
            }
        }
        myString = String.join("",myString_arr);
        if(myString.contains(pat)){
            return 1;
        }else{
            return 0;
        }
    }
}