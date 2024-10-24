class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        // Count the number of zeros in lottos (unrecognizable numbers)
        int zeroCount = 0;
        for (int num : lottos) {
            if (num == 0) {
                zeroCount++;
            }
        }

        // Count the number of matching numbers
        int matchCount = 0;
        for (int num : lottos) {
            if (num != 0 && contains(win_nums, num)) {
                matchCount++;
            }
        }

        // Calculate the highest and lowest possible rank
        int highestRank = getRank(matchCount + zeroCount);
        int lowestRank = getRank(matchCount);

        return new int[] {highestRank, lowestRank};
    }
    
    // Helper method to check if a number is in the winning numbers
    private static boolean contains(int[] win_nums, int num) {
        for (int win_num : win_nums) {
            if (win_num == num) {
                return true;
            }
        }
        return false;
    }
    
    // Helper method to calculate rank based on the number of matches
    private static int getRank(int matchCount) {
        switch (matchCount) {
            case 6: return 1; // All 6 numbers match
            case 5: return 2; // 5 numbers match
            case 4: return 3; // 4 numbers match
            case 3: return 4; // 3 numbers match
            case 2: return 5; // 2 numbers match
            default: return 6; // Less than 2 numbers match
        }
    }
}