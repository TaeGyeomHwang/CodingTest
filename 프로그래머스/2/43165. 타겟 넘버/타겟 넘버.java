class Solution {
    public int solution(int[] numbers, int target) {
        return findWaysHelper(numbers, target, 0, 0);
    }
    
    private int findWaysHelper(int[] numbers, int target, int index, int sum) {
        
        if (index == numbers.length) {
            return sum == target ? 1 : 0;
        }
        
        int waysWithAddition = findWaysHelper(numbers, target, index + 1, sum + numbers[index]);
        
        int waysWithSubtraction = findWaysHelper(numbers, target, index + 1, sum - numbers[index]);
        
        return waysWithAddition + waysWithSubtraction;
    }
}
