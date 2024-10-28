import java.util.Stack;

class Solution {
    public int solution(int[] order) {
        Stack<Integer> stack = new Stack<>();
        int currentBox = 1; // Represents the next box on the container belt
        int loadedCount = 0; // Tracks the number of boxes loaded successfully
        
        for (int targetBox : order) {
            // Load boxes from the container belt until we reach the desired box or surpass it
            while (currentBox <= order.length && currentBox < targetBox) {
                stack.push(currentBox);
                currentBox++;
            }
            
            // If the box on the container belt is the desired one, load it
            if (currentBox == targetBox) {
                loadedCount++;
                currentBox++;
            }
            // Otherwise, check if the desired box is at the top of the auxiliary stack
            else if (!stack.isEmpty() && stack.peek() == targetBox) {
                stack.pop();
                loadedCount++;
            }
            // If neither condition is met, we can’t load anymore boxes
            else {
                break;
            }
        }
        
        return loadedCount;
    }
}