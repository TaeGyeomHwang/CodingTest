import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] arr1 = {};
        int[] arr2 = {};
        
        arr1 = Arrays.copyOfRange(num_list, n, num_list.length);
        arr2 = Arrays.copyOfRange(num_list, 0, n);
        
        // int[] arr3 = Arrays.copyOfRange(arr1, 0, arr1.length + arr2.length);
        // System.arraycopy(arr2, 0, arr3, arr1.length, arr2.length);
        
        int[] arr3 = new int[arr1.length+arr2.length];
        for(int i=0, j=0; i<arr3.length; i++){
            if(i<arr1.length){
                arr3[i]=arr1[i];
            }else{
                arr3[i]=arr2[j];
                j++;
            }
        }
        
        return arr3;
    }
}