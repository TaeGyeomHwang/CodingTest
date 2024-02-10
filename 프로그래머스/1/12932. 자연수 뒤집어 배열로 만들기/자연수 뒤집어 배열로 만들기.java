class Solution {
    public int[] solution(long n) {
        StringBuilder sb = new StringBuilder(n+"");
        String str = sb.reverse().toString();
        int[] arr = new int[str.length()];
        for(int i=0; i<arr.length; i++){
            arr[i] = Character.getNumericValue(str.charAt(i));
        }
        return arr; 
    }
}