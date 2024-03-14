import java.util.*;
class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        if(set.size()>=nums.length/2)
            return nums.length/2;
        else
            return set.size();
        // int n = 1;
        // int k = 1;
        // int nMinusK = 1;
        // for(int i=1; i<=set.size(); i++){
        //     n *= i;
        // }
        // for(int i=1; i<nums.length/2; i++){
        //     k *= i;
        // }
        // for(int i=1; i<set.size()-nums.length/2; i++){
        //     nMinusK *= i;
        // }
        // if(n<=k){
        //     return n;
        // }
        // return n/(k*nMinusK);
    }
}