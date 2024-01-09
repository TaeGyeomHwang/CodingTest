function solution(my_string, s, e) {
    let my_string_arr = my_string.split("");
    
    for(let i=s, j=e; i<j; i++, j--){
        let tmp = my_string_arr[i];
        my_string_arr[i] = my_string_arr[j];
        my_string_arr[j] = tmp;
    }
    return my_string_arr.join("");
}