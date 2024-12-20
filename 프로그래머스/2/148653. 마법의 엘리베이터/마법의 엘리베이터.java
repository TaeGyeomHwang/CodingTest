class Solution {
    public int solution(int storey) {
        int magicStones = 0;

        while (storey > 0) {
            int remainder = storey % 10; // Extract the last digit of the current floor

            if (remainder > 5 || (remainder == 5 && (storey / 10) % 10 >= 5)) {
                // If the remainder is greater than 5, it's better to round up
                magicStones += 10 - remainder;
                storey += 10 - remainder; // Round up the current digit
            } else {
                // Otherwise, round down
                magicStones += remainder;
            }

            storey /= 10; // Move to the next digit
        }

        return magicStones;
    }
}