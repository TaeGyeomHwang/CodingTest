import java.util.*;

class Solution {
    public int[] solution(int n, long left, long right) {
        List<Integer> result = new ArrayList<>();
        for (long i = left; i <= right; i++) {
            long row = i / n;
            long col = i % n;
            int value = Math.max((int) row, (int) col) + 1;
            result.add(value);
        }
        return result.stream().mapToInt(i->i).toArray();
    }
}