class Solution {
    boolean solution(String s) {
        int numP = 0;
        int numY = 0;
        s=s.toLowerCase();
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='p') numP++;
            else if(s.charAt(i)=='y') numY++;
        }
        if(numP==numY) return true;

        return false;
    }
}