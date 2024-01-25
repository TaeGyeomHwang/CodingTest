class Solution {
    public int solution(int hp) {
        int general = 0;
        int soilder = 0;
        int worker = 0;
        
        general = hp/5;
        soilder = hp%5/3;
        worker = hp%5%3/1;
        
        return general+soilder+worker;
    }
}