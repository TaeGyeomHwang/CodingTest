class Solution {
    public int solution(int number, int limit, int power) {
        int result = 0;
        int[] arr = new int[number];
        for(int i=1; i<=number; i++){
            for (int j = 1; j * j <= i; j++) {
                if (i % j == 0) {
                    arr[i-1]++;
                    if (j != i / j) {
                        arr[i-1]++;
                    }
                }
            }
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i]>limit)
                result+=power;
            else
                result+=arr[i];
        }
        return result;
    }
}