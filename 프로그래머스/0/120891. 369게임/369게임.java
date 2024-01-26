class Solution {
    public int solution(int order) {
        int count=0;
        for(String s : (""+order).split("")){
            if(s.equals("3")||s.equals("6")||s.equals("9")){
                count++;
            }
        }
        return count;
    }
}