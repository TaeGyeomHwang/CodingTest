function solution(num_list) {
    let a = 0;
    let b = 1;
    for(i=0;i<num_list.length;i++){
        a += num_list[i];
        b *= num_list[i];
    }
    if(b<a**2){
        return 1;
    }else{
        return 0;
    }
}