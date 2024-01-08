function solution(my_string, alp) {
    let my_string_arr = my_string.split("");
    
    for(let i=0; i<my_string_arr.length; i++){
        if(my_string_arr[i]==alp){
            my_string_arr[i] = my_string_arr[i].toUpperCase();
        }
    }
    
    my_string = my_string_arr.join("");
    return my_string;
}

// function solution(my_string, alp) {
//     if (!my_string.includes(alp)) {
//         return my_string;
//     }
//     return my_string.replaceAll(alp, alp.toUpperCase());
// }