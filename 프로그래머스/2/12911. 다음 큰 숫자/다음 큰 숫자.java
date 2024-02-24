class Solution {
    public int solution(int n) {
        int next = n+1;
        int oneCount = 0;
        String binaryN = Integer.toBinaryString(n);
        for(int i=0; i<binaryN.length(); i++){
            if(binaryN.charAt(i)=='1') oneCount++;
        }
        while(true){
            String binaryNext = Integer.toBinaryString(next);
            int nextCount = 0;
            for(int i=0; i<binaryNext.length(); i++){
                if(binaryNext.charAt(i)=='1') nextCount++;
            }
            if(nextCount==oneCount) return next;
            else next++;
        }
    }
}