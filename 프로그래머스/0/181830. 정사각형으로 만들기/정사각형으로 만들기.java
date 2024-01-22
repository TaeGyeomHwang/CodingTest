class Solution {
    public int[][] solution(int[][] arr) {
        if(arr.length==arr[0].length){
            return arr;
        }else if(arr.length>arr[0].length){
            for(int i=0; i<arr.length; i++){
                int[] newArr = new int[arr.length];
                for(int j=0; j<newArr.length; j++){
                    if(j>=arr[i].length){
                        newArr[j] = 0;
                    }else{
                        newArr[j] = arr[i][j];
                    }
                }
                arr[i] = newArr;
            }
        }else{
            int[][] newArr = new int[arr[0].length][arr[0].length];
            for(int i=0; i<arr[0].length; i++){
                if(i<arr.length){
                    newArr[i] = arr[i];
                }else{
                    break;
                }
            }
            return newArr;
        }
        return arr;
    }
}