import java.util.*;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
                long sum1 = 0, sum2 = 0;
        long totalSum = 0;

        // Calculate the sum of elements in both queues
        for (int num : queue1) {
            sum1 += num;
        }
        for (int num : queue2) {
            sum2 += num;
        }
        totalSum = sum1 + sum2;

        // If the total sum is odd, it's impossible to divide into two equal sums
        if (totalSum % 2 != 0) return -1;

        long targetSum = totalSum / 2;

        // Convert the arrays into queues
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        for (int num : queue1) q1.offer(num);
        for (int num : queue2) q2.offer(num);

        int operations = 0;
        int maxOperations = (queue1.length + queue2.length) * 2; // Maximum operations allowed

        // Process the queues
        while (sum1 != targetSum && operations <= maxOperations) {
            if (sum1 > targetSum) {
                // Move an element from q1 to q2
                int element = q1.poll();
                q2.offer(element);
                sum1 -= element;
                sum2 += element;
            } else {
                // Move an element from q2 to q1
                int element = q2.poll();
                q1.offer(element);
                sum1 += element;
                sum2 -= element;
            }
            operations++;
        }

        return sum1 == targetSum ? operations : -1;
    }
}