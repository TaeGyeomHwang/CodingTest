import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer1, answer2;
        Arrays.sort(numbers);
        answer1 = numbers[0]*numbers[1];
        answer2 = numbers[numbers.length-2]*numbers[numbers.length-1];
        return answer1>answer2 ? answer1 : answer2;
    }
}