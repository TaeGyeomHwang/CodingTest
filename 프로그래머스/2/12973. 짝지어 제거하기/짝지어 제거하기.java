import java.util.Stack;

class Solution {
    public int solution(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop(); // 스택의 맨 위에 있는 문자와 현재 문자가 같으면 제거
            } else {
                stack.push(c); // 아니면 스택에 추가
            }
        }

        return stack.isEmpty() ? 1 : 0; // 스택이 비어있으면 모두 제거 가능한 경우이므로 1 반환, 아니면 0 반환
    }
}