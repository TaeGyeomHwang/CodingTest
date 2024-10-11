class Solution {
    public int solution(int n, String control) {
        for(int i = 0; i < control.length(); i++) {
            char c = control.charAt(i);
            switch(c) {
                case 'w' -> n += 1;
                case 's' -> n -= 1;
                case 'd' -> n += 10;
                case 'a' -> n -= 10;
            }
        }
        return n;
    }
}
