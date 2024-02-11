class Solution {
    public boolean solution(int x) {
        int num = 0;
        String str = x+"";
        for(int i=0; i<str.length(); i++){
            num += Character.getNumericValue(str.charAt(i));
        }
        if(x%num==0) return true;
        return false;
    }
}