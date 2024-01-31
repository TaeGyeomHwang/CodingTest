class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for(int i=0; i<quiz.length; i++){
            String[] arr = quiz[i].split(" ");
            int result = Integer.parseInt(arr[0]);
            String operator = arr[1];
            int num = Integer.parseInt(arr[2]);
            if(operator.equals("+")) result+=num;
            else result-=num;
            if(result == Integer.parseInt(arr[4])) answer[i] = "O";
            else answer[i] = "X";
        }
        
        return answer;
    }
}