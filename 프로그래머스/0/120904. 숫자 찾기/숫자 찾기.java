class Solution {
    public int solution(int num, int k) {
        String[] numArr = (""+num).split("");
        for(int i=0; i<numArr.length; i++){
            if(numArr[i].equals(""+k)){
                return i+1;
            }
        }
        return -1;
    }
}