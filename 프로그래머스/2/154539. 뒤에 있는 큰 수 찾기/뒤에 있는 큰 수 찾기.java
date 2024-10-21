import java.util.Stack;

class Solution {
    public int[] solution(int[] numbers) {
        int n = numbers.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            // 스택에서 현재 숫자보다 작거나 같은 요소를 pop
            while (!stack.isEmpty() && stack.peek() <= numbers[i]) {
                stack.pop();
            }
            
            // 스택이 비어 있으면 오른쪽에 더 큰 숫자가 없음
            if (stack.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = stack.peek();
            }
            
            // 현재 숫자를 스택에 push
            stack.push(numbers[i]);
        }

        return result;
    }
}