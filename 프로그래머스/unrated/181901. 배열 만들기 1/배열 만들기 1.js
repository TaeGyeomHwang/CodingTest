function solution(n, k) {
    let arr = [];
    for(let i=k; i<n+1; i+=k){
        arr.push(i);
    }
    return arr;
}