function solution(num_list) {
    if(num_list.length>10){
        let sum = 0;
        for(let i=0; i<num_list.length; i++){
            sum += num_list[i];
        }
        return sum;
    }else{
        let multiple = 1;
        for(let i=0; i<num_list.length; i++){
            multiple *= num_list[i];
        }
        return multiple;
    }
}