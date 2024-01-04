function solution(a, d, included) {
    let answer = 0;
    let array = [];
    
    for(let i=0; i<included.length; i++){
        array.push(a+d*i);
    }
    for(let i=0; i<included.length; i++){
        if(included[i]==true){
            answer+=array[i];
        }
    }
    return answer;
}