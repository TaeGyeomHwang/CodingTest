class Solution {
    public String solution(String my_string, int num1, int num2) {
        String[] my_string_arr = my_string.split("");
        String tmp = my_string_arr[num1];
        my_string_arr[num1] = my_string_arr[num2];
        my_string_arr[num2] = tmp;
        return String.join("",my_string_arr);
    }
}