class Solution {
    public int solution(int[] date1, int[] date2) {
        // if(date1[0]<date2[0]){
        //     return 1;
        // }else if(date1[0]==date2[0] && date1[1]<date2[1]){
        //     return 1;
        // }else if(date1[0]==date2[0] && date1[1]==date2[1] && date1[2]<date2[2]){
        //     return 1;
        // }
        // return 0;
        
        int intDate1 = date1[0] * 100 + date1[1] * 10 + date1[2];
        int intDate2 = date2[0] * 100 + date2[1] * 10 + date2[2];

        return (intDate1 < intDate2) ? 1 : 0;
    }
}