class Solution {
    public String solution(String myString) {
        String[] arr = new String[myString.length()];
        arr = myString.split("");
        
        for(int i=0; i<arr.length; i++){
            if(arr[i].equals("a") || arr[i].equals("A")){
                arr[i] = "A";
            }else{
                arr[i] = arr[i].toLowerCase();
            }
        }

        return String.join("",arr);
    }
}