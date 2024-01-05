function solution(numLog) {
    let result = [];
    for(i=1; i<numLog.length; i++){
        //  w일 경우
        if(numLog[i]-numLog[i-1]==1)
            result.push("w") 
        //  s일 경우
        else if(numLog[i]-numLog[i-1]==-1)
            result.push("s")
        //  d일 경우
        else if(numLog[i]-numLog[i-1]==10)
            result.push("d")
        //  a일 경우
        else if(numLog[i]-numLog[i-1]==-10)
            result.push("a")
    }
    return result.join("");
}