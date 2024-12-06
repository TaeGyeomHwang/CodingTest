import java.util.*;

class Solution {
    public String solution(String number, int k) {
        int n = number.length();
        // If we need to remove all digits, return an empty string
        if (k == n) return "";

        Stack<Character> stack = new Stack<>();
        int remaining = n - k;

        for (char digit : number.toCharArray()) {
            // Remove digits from the stack if they are smaller than the current digit
            // and if we still need to remove more digits
            while (!stack.isEmpty() && k > 0 && stack.peek() < digit) {
                stack.pop();
                k--;
            }
            stack.push(digit);
        }

        // Build the resulting number from the stack
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < remaining; i++) {
            result.append(stack.get(i));
        }

        return result.toString();
    }
}