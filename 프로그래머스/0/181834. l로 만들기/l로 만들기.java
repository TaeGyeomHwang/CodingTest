class Solution {
    public String solution(String myString) {
        char[] myString_arr = myString.toCharArray();
        for(int i=0; i<myString_arr.length; i++){
            if(myString_arr[i]<'l'){
                myString_arr[i] ='l';
            }
        }
        return new String(myString_arr);
    }
}