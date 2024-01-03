function solution(ineq, eq, n, m) {
    if(ineq == "<" ){
        if(eq == "="){
//          return에 + 붙여서 number로 형변환
            return +(n<=m);
        }else{
            return +(n<m);
        }
    }else if(ineq == ">" ){
        if(eq == "="){
            return +(n>=m);
        }else{
            return +(n>m);
        }
    }
}