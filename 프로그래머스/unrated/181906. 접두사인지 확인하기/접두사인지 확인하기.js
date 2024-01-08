function solution(my_string, is_prefix) {
    let arr = [];
    for(let i=0; i<my_string.length; i++){
        if(i==0){
            arr.push(my_string);
        }else{
            arr.push(my_string.slice(0,i));
        }
    }
    
    for(let i=0; i<arr.length; i++){
        if(arr[i]==is_prefix){
            return 1;
        }
    }
    
    return 0;
}