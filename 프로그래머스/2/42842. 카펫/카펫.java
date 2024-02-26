class Solution {
    public int[] solution(int brown, int yellow) {
        int total = brown + yellow;
        int[] result = new int[2];
        
        for (int i = 1; i <= Math.sqrt(total); i++) {
            if (total % i == 0) {
                int row = total / i;
                int col = i;
                
                if ((row - 2) * (col - 2) == yellow) {
                    result[0] = row;
                    result[1] = col;
                    break;
                }
            }
        }
        
        return result;
    }
}