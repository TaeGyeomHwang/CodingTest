function solution(my_string, is_suffix) {
    let arr = [];
    let ans;
    
    for(let i=0; i<my_string.length; i++){
        if(i==0){
            arr.push(my_string);
        }else{
            arr.push(my_string.slice(my_string.length-i));
        }
    }
    arr.sort();
    
    for(let i=0; i<arr.length; i++){
        if(arr[i]==is_suffix){
            return 1;
        }
    }
    return 0;
}