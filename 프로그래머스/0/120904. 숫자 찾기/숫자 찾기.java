class Solution {
    public int solution(int num, int k) {
        // String[] numArr = (""+num).split("");
        // String kStr = ""+k;
        // for(int i=0; i<numArr.length; i++){
        //     if(numArr[i].equals(kStr)){
        //         return i+1;
        //     }
        // } 
        // return -1;
        return (" "+num).indexOf(String.valueOf(k));
    }
}