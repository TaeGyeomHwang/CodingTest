function solution(q, r, code) {
    let arr= [];
    let code_arr = code.split("");
    for(let i=0; i<code_arr.length; i++){
        if(i%q==r){
            arr.push(code_arr[i]);
        }
    }
    return arr.join("");
}