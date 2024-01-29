class Solution {
    public int solution(String s) {
        int answer = 0;
        int before = 0;
        String[] arr = s.split(" ");
        for(String str: arr){
            System.out.println(str);
            if(str.equals("Z")){
                answer = before;
            }else{
                before = answer;
                answer += Integer.valueOf(str);
            }
        }
        return answer;
    }
}