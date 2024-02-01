class Solution {
    public String solution(String polynomial) {
        String[] arr = polynomial.split(" ");
        int x = 0;
        int num = 0;
        for(int i=0; i<arr.length; i+=2){
            if(arr[i].contains("x")){
                arr[i] = arr[i].replace("x", "");
                if(arr[i].equals("")) x++;
                else x+=Integer.parseInt(arr[i]);
            }else{
                num+=Integer.parseInt(arr[i]);
            }
        }
        if(x==0) return ""+num;
        else if(x==1 && num==0) return "x";
        else if(num==0) return x+"x";
        else if(x==1 && num!=0) return "x + "+num;
        else return x+"x + "+num;
    }
}