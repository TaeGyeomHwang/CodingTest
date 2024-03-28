import java.util.Arrays;

class Solution {
    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book); // 전화번호부를 사전순으로 정렬
        
        for (int i = 0; i < phone_book.length - 1; i++) {
            if (phone_book[i + 1].startsWith(phone_book[i])) { // 다음 번호가 현재 번호의 접두어인지 확인
                return false;
            }
        }
        
        return true;
    }
}
