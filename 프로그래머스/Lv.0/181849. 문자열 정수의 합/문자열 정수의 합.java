class Solution {
    public int solution(String num_str) {
        int sum = 0;
        String[] arr = new String[num_str.length()];
        arr = num_str.split("");

        for(int i=0; i<arr.length; i++){
            sum += Integer.parseInt(arr[i]);
        }
        return sum;
    }
}