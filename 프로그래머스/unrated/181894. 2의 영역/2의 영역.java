import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int firstIndex = 100000, lastIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                firstIndex = Math.min(firstIndex, i);
                lastIndex = Math.max(lastIndex, i);
            }
        }

        if (firstIndex <= lastIndex) {
            return Arrays.copyOfRange(arr, firstIndex, lastIndex + 1);
        } else {
            return new int[]{-1};
        }
    }
}