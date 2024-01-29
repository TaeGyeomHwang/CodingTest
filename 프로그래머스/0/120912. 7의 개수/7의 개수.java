class Solution {
    public int solution(int[] array) {
        int count = 0;
        
        for(int i=0; i<array.length; i++){
            for(int j=0; j< String.valueOf(array[i]).length(); j++){
                if(String.valueOf(array[i]).charAt(j)=='7'){
                    count++;
                }
            }
        }
        
        return count;
    }
}