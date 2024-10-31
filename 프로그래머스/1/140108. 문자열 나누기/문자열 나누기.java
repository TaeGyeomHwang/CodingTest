class Solution {
    public int solution(String s) {
        int count = 0;
        int i = 0;

        while (i < s.length()) {
            char x = s.charAt(i);  // First letter of the current substring
            int xCount = 0;
            int otherCount = 0;
            int j = i;

            // Count x and non-x letters until the counts are equal or we reach the end
            while (j < s.length()) {
                if (s.charAt(j) == x) {
                    xCount++;
                } else {
                    otherCount++;
                }
                
                j++;
                
                if (xCount == otherCount) {
                    break;
                }
            }

            // Increment count for each valid substring found
            count++;
            // Move i to the end of the substring we just processed
            i = j;
        }

        return count;
    }
}