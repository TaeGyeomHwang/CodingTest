class Solution {
    public int solution(int[][] sizes) {
        int maxX = 0;
        int maxY = 0;
        for(int i=0; i<sizes.length; i++){
            if(sizes[i][0]<sizes[i][1]){
                int tmp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = tmp;
            }
            maxX = Math.max(maxX, sizes[i][0]);
            maxY = Math.max(maxY, sizes[i][1]);
        }
        return maxX*maxY;
    }
}