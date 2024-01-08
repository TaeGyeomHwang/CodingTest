function solution(my_strings, parts) {
    let arr = [];
    for(let i=0; i<my_strings.length; i++){
        const [s, e] = parts[i];
        
        arr.push(my_strings[i].slice(s,e+1))
    }
    return arr.join("");
}