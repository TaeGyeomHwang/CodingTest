function solution(l, r) {
    var answer = [];
    //  주어진 범위 내에서 반복
    for(let i=l;i<=r;i++){
        //  현재 숫자를 문자열로 변환해서 저장
        let arr=String(i);
        //  문자열로 변환된 숫자의 각 자릿수를 확인. 5 또는 0 이외의 숫자라면 건너뛴다.
        if(![...arr].every(x=>x==='5'||x==='0'))continue;
        //  조건을 만족하면 push
        answer.push(i)
    }
    return answer.length? answer:[-1];
}