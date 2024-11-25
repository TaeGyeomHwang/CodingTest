class Solution {
    public long[] solution(long[] numbers) {
        // Array to store the results
        long[] results = new long[numbers.length];
        
        // Process each number in the input array
        for (int i = 0; i < numbers.length; i++) {
            long x = numbers[i];
            
            if ((x & 1) == 0) {
                // If x is even, the next number with at most one bit difference is x + 1
                results[i] = x + 1;
            } else {
                // If x is odd, find the first '0' in the binary representation of x
                // and toggle it along with the '1' just before it
                long bitMask = 1;
                while ((x & bitMask) != 0) {
                    bitMask <<= 1;
                }
                results[i] = x + bitMask - (bitMask >> 1);
            }
        }
        
        return results;
    }
}