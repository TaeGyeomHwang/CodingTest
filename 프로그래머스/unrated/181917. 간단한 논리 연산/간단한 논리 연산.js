function solution(x1, x2, x3, x4) {
    let result1;
    let result2;
    if(x1 == false && x2 == false){
        result1 = false;
    }else{
        result1 = true;
    }   
    
    if(x3 == false && x4 == false){
        result2 = false;
    }else{
        result2 = true;
    }
    
    if(result1 == true && result2 == true){
        return true;
    }else{
        return false;
    }
}