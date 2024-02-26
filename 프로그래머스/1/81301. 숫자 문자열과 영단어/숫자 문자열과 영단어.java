class Solution {
    public int solution(String s) {
        StringBuilder sb = new StringBuilder();
        StringBuilder num = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            String str = s.charAt(i)+"";
            if(num.toString().equals("zero")){
                sb.append(0);
                num.setLength(0);
            }
            else if(num.toString().equals("one")){
                sb.append(1);
                num.setLength(0);
            } 
            else if(num.toString().equals("two")){
                sb.append(2);
                num.setLength(0);
            } 
            else if(num.toString().equals("three")){
                sb.append(3);
                num.setLength(0);
            } 
            else if(num.toString().equals("four")){
                sb.append(4);
                num.setLength(0);
            } 
            else if(num.toString().equals("five")){
                sb.append(5);
                num.setLength(0);
            } 
            else if(num.toString().equals("six")){
                sb.append(6);
                num.setLength(0);
            } 
            else if(num.toString().equals("seven")){
                sb.append(7);
                num.setLength(0);
            } 
            else if(num.toString().equals("eight")){
                sb.append(8);
                num.setLength(0);
            } 
            else if(num.toString().equals("nine")){
                sb.append(9);
                num.setLength(0);
            } 
            
            if(str.matches("[+-]?\\d*(\\.\\d+)?")){
                sb.append(str);
            }else{
                num.append(str);
            }
        }
        if(num.toString().equals("zero")){
                sb.append(0);
                num.setLength(0);
            }
            else if(num.toString().equals("one")){
                sb.append(1);
                num.setLength(0);
            } 
            else if(num.toString().equals("two")){
                sb.append(2);
                num.setLength(0);
            } 
            else if(num.toString().equals("three")){
                sb.append(3);
                num.setLength(0);
            } 
            else if(num.toString().equals("four")){
                sb.append(4);
                num.setLength(0);
            } 
            else if(num.toString().equals("five")){
                sb.append(5);
                num.setLength(0);
            } 
            else if(num.toString().equals("six")){
                sb.append(6);
                num.setLength(0);
            } 
            else if(num.toString().equals("seven")){
                sb.append(7);
                num.setLength(0);
            } 
            else if(num.toString().equals("eight")){
                sb.append(8);
                num.setLength(0);
            } 
            else if(num.toString().equals("nine")){
                sb.append(9);
                num.setLength(0);
            } 
        return Integer.parseInt(sb.toString());
    }
}