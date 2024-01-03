// function solution(n) {
//     var ans = 0;
//     var i = 0;
    
//     if(n%2!==0){
//         for(i = 1; i < n+1; i+=2){
//             ans = ans + i
//         }
//         return ans;
//     }else{
//         for(i=2;i<n+1;i+=2){
//             ans = ans + Math.pow(i,2);
//         }
//         return ans;
//     }
// }

function solution(n) {
//  홀수일 경우
    if(n%2===1){
        //    등차수열의 합 공식
      return  (n+1)/2*((n + 1)/2) ;
    }
    else{
        //    짝수라면 거듭제곱의 합 공식
        return   n*(n+1)*(n+2)/6;
    }
}