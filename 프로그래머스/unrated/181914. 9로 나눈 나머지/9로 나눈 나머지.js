function solution(number) {
    let ans = 0;
    
    for(let i=0; i<number.length; i++){
        ans = ans + parseInt(number[i]);
    }
    
    return ans%9;
}