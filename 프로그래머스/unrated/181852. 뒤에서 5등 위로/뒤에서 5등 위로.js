function solution(num_list) {
    let arr = num_list.sort((a,b)=>a-b);
    let arr2 = [];
    for(let i=5; i<arr.length; i++){
        arr2.push(arr[i]);
    }
    return arr2;
}