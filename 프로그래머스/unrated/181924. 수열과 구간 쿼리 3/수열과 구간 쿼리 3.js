function solution(arr, queries) {
    let tmp;
    for(let i=0; i<queries.length; i++){
        tmp = arr[queries[i][0]];
        arr[queries[i][0]] = arr[queries[i][1]];
        arr[queries[i][1]] = tmp;
    }
    return arr;
}