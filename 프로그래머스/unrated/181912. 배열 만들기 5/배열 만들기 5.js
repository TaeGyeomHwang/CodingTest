function solution(intStrs, k, s, l) {
    let arr = [];
    for(let i=0; i<intStrs.length;i++){
        if(intStrs[i].slice(s,s+l)>k){
            arr.push(parseInt(intStrs[i].slice(s,s+l)));
        }
    }
    return arr;
}