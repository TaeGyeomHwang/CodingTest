import java.util.*;

class Solution {
    
    public ArrayList<Integer> solution(String s) {
        ArrayList<Integer> answer = new ArrayList<>();
        s = s.substring(2, s.length() - 2);
        String[] sets = s.split("\\},\\{");
        Arrays.sort(sets, Comparator.comparingInt(String::length));
        for (String set : sets) {
            String[] elements = set.split(",");
            for (String element : elements) {
                int num = Integer.parseInt(element);
                if (!answer.contains(num))
                    answer.add(num);
            }
        }
        return answer;
    }
}