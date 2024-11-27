import java.util.Stack;

class Solution {
    public int solution(int[] ingredient) {
        Stack<Integer> stack = new Stack<>();
        int count = 0;

        for (int ing : ingredient) {
            stack.push(ing);

            // Check if the last four ingredients form a hamburger
            if (stack.size() >= 4) {
                int size = stack.size();
                if (stack.get(size - 4) == 1 && stack.get(size - 3) == 2 &&
                    stack.get(size - 2) == 3 && stack.get(size - 1) == 1) {
                    
                    // Remove the hamburger ingredients from the stack
                    stack.pop();
                    stack.pop();
                    stack.pop();
                    stack.pop();
                    
                    // Increment the hamburger count
                    count++;
                }
            }
        }
        return count;
    }
}