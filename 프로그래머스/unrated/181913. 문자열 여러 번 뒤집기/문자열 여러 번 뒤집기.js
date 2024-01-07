function solution(my_string, queries) {
    for (let i = 0; i < queries.length; i++) {
        const [s, e] = queries[i];
        const my_string_array = my_string.split(''); // string을 array로 변환
        for (let j = s, k = e; j <= k; j++, k--) {
            const tmp = my_string_array[j];
            my_string_array[j] = my_string_array[k];
            my_string_array[k] = tmp;
        }
        my_string = my_string_array.join(''); // array를 string으로 다시 변환
    }
    return my_string;
}