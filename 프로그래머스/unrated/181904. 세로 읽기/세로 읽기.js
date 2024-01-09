function solution(my_string, m, c) {
    let arr = my_string.split("");
    let ans = [];
    for(let i=c-1; i<arr.length; i+=m){
        ans.push(arr[i]);
    }
    return ans.join("");
}