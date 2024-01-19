class Solution {
    public int solution(String[] strArr) {
        int[] arr = new int[31];
        int max = 0;
        
        for(int i=0; i<arr.length; i++){
            arr[i] = 0;
        }
        
        for(int i=0; i<strArr.length; i++){
            arr[strArr[i].length()]++;
            if(arr[strArr[i].length()]>max){
                max = arr[strArr[i].length()];
            }
        }
        return max;
    }
}