class Solution {
    public String solution(int age) {
        StringBuilder sb = new StringBuilder();
        String ageStr = Integer.toString(age);
        for(int i=0; i<ageStr.length(); i++){
            if(ageStr.charAt(i)=='0') sb.append('a');
            else if(ageStr.charAt(i)=='1') sb.append('b');
            else if(ageStr.charAt(i)=='2') sb.append('c');
            else if(ageStr.charAt(i)=='3') sb.append('d');
            else if(ageStr.charAt(i)=='4') sb.append('e');
            else if(ageStr.charAt(i)=='5') sb.append('f');
            else if(ageStr.charAt(i)=='6') sb.append('g');
            else if(ageStr.charAt(i)=='7') sb.append('h');
            else if(ageStr.charAt(i)=='8') sb.append('i');
            else if(ageStr.charAt(i)=='9') sb.append('j');
        }
        return sb.toString();
    }
}