import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<my_string.length(); i++){
            if(my_string.charAt(i)>=48 && my_string.charAt(i)<=57){
                list.add(Character.getNumericValue(my_string.charAt(i)));
            }
        }
        int[] arr = list.stream().mapToInt(i->i).toArray();
        Arrays.sort(arr);
        return arr;
    }
}