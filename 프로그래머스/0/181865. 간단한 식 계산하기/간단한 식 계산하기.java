class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] binomial_arr = binomial.split(" ");
        if(binomial_arr[1].equals("+")){
            answer = Integer.parseInt(binomial_arr[0]) + Integer.parseInt(binomial_arr[2]);
        }else if(binomial_arr[1].equals("-")){
            answer = Integer.parseInt(binomial_arr[0]) - Integer.parseInt(binomial_arr[2]);
        }else{
            answer = Integer.parseInt(binomial_arr[0]) * Integer.parseInt(binomial_arr[2]);
        }
        return answer;
    }
}