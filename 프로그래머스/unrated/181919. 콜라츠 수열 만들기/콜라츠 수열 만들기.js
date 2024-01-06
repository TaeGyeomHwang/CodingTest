function solution(n) {
    let arr = [];
    arr.push(n);
    while(n!=1){
        if(n%2==0){
            n /= 2;
            arr.push(n);
        }else{
            n = n*3+1;
            arr.push(n);
        }
    }
    return arr;
}