// class Solution {
//     public int solution(int n) {
//         int count = 0;
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=n; j++){
//                 if(i*j==n){
//                     count++;
//                 }
//             }
//         }
//         return count;
//     }
// }
class Solution {
    public int solution(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                int j = n / i;
                if (i * j == n) {
                    count++;
                }
            }
        }
        return count;
    }
}