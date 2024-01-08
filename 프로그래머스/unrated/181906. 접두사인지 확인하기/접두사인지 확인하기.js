function solution(my_string, is_prefix) {
    let arr = [];
    for(let i=0; i<my_string.length; i++){
        if(i==0){
            if(my_string==is_prefix){
                return 1;
            }
        }else{
            if(my_string.slice(0,i)==is_prefix){
                return 1;
            }
        }
    }
    return 0;
}