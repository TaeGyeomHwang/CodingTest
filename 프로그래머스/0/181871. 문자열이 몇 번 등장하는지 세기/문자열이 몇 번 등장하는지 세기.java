class Solution {
    public int solution(String myString, String pat) {
        int count = 0;
        for(int i=0; i<myString.length(); i++){
            String str = "";
            for(int j=i; j<myString.length(); j++){
                char ch = myString.charAt(j);
                str += ch;
                if(str.equals(pat)){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}