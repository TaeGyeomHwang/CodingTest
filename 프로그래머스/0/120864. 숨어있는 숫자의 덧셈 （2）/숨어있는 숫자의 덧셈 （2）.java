class Solution {
    public int solution(String my_string) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<my_string.length(); i++){
            if(Character.isDigit(my_string.charAt(i))){
                sb.append(my_string.charAt(i));
            }else{
                if (sb.length() > 0) {
                    answer += Integer.parseInt(sb.toString());
                    sb.setLength(0);
                }
            }
        } 
        if (sb.length() > 0) {
            answer += Integer.parseInt(sb.toString());
        }
        return answer;
    }
}
