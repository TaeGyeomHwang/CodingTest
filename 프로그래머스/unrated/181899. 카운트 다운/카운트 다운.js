function solution(start, end_num) {
    let arr = [];
    for(let i=start; i>end_num-1; i--){
        arr.push(i);
    }
    return arr;
}