
class Solution {
    public int solution(String[] babbling) {
        int count=0;
        String[] word = {"aya", "ye", "woo", "ma"};
        
        for(int i=0; i<babbling.length; i++){
            boolean flag = false;
            for(String str : word){
                if(babbling[i].contains(str+str)){
                    flag = true;
                }
            }
            if(flag) continue;
            
            for(int j=0; j<word.length; j++){
                babbling[i] = babbling[i].replace(word[j]," ");
            }
            babbling[i] = babbling[i].replace(" ", "");
            if(babbling[i].equals("")) count++;
        }
        
        return count; 
    }
    
}