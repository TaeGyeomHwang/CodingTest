import java.util.*;
class Solution {
    int solution(String s) {
        int answer = 0;
        int index = 0;
        String str = "";
        for(int j=0; j<s.length(); j++){
            Stack<Character> stack = new Stack<>();
            StringBuilder sb = new StringBuilder();
            for(int k=index; k<s.length(); k++)
                sb.append(s.charAt(k));
            for(int l=index-index; l<index; l++)
                sb.append(s.charAt(l));
            str = sb.toString();
            for(int i=0; i<str.length(); i++){
                if(stack.isEmpty()) stack.push(str.charAt(i));
                else{
                    char c = str.charAt(i);
                    if(stack.peek()=='(' && c==')') stack.pop();
                    else if(stack.peek()=='[' && c==']') stack.pop();
                    else if(stack.peek()=='{' && c=='}') stack.pop();
                    else stack.push(c);
                }
            }
            if(stack.isEmpty()) answer++;
            index++;
        }
        return answer;
    }
}