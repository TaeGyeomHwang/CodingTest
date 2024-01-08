function solution(my_string) {
    let arr = [];
    for(let i=0; i<my_string.length; i++){
        if(i==0){
            arr.push(my_string);
        }else{
            arr.push(my_string.slice(my_string.length-i));
        }
    }
    return arr.sort();
}