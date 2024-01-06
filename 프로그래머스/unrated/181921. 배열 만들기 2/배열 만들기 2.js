function solution(l, r) {
    const result = [];
    
    // 반복문의 범위 설정
    for (let i = l; i <= r; i++) {
        //  문자열로 바꾼 뒤 각 자릿수를 확인, 5와 0만 있을 경우 push
        if ([...String(i)].every(num => num === "0" || num === "5")) {
            result.push(i);
        }
    }
    //  아무 숫자도 없다면 -1 반환
    return result.length > 0 ? result : [-1];
}