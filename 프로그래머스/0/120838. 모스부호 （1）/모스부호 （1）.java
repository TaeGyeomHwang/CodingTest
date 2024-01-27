class Solution {
    public String solution(String letter) {
        StringBuilder sb = new StringBuilder();
        StringBuilder result = new StringBuilder();
        int index = 0;
        while(index!=letter.length()){
            for(int i=index; i<letter.length(); i++){
                index++;
                if(letter.charAt(i)==' '){
                    break;
                }else{
                   sb.append(letter.charAt(i)); 
                }
            }
            System.out.println(sb);
            if(sb.toString().equals(".-")) result.append('a');
            else if(sb.toString().equals("-...")) result.append('b');
            else if(sb.toString().equals("-.-.")) result.append('c');
            else if(sb.toString().equals("-..")) result.append('d');
            else if(sb.toString().equals(".")) result.append('e');
            else if(sb.toString().equals("..-.")) result.append('f');
            else if(sb.toString().equals("--.")) result.append('g');
            else if(sb.toString().equals("....")) result.append('h');
            else if(sb.toString().equals("..")) result.append('i');
            else if(sb.toString().equals(".---")) result.append('j');
            else if(sb.toString().equals("-.-")) result.append('k');
            else if(sb.toString().equals(".-..")) result.append('l');
            else if(sb.toString().equals("--")) result.append('m');
            else if(sb.toString().equals("-.")) result.append('n');
            else if(sb.toString().equals("---")) result.append('o');
            else if(sb.toString().equals(".--.")) result.append('p');
            else if(sb.toString().equals("--.-")) result.append('q');
            else if(sb.toString().equals(".-.")) result.append('r');
            else if(sb.toString().equals("...")) result.append('s');
            else if(sb.toString().equals("-")) result.append('t');
            else if(sb.toString().equals("..-")) result.append('u');
            else if(sb.toString().equals("...-")) result.append('v');
            else if(sb.toString().equals(".--")) result.append('w');
            else if(sb.toString().equals("-..-")) result.append('x');
            else if(sb.toString().equals("-.--")) result.append('y');
            else if(sb.toString().equals("--..")) result.append('z');
            
            sb.setLength(0);
        }
        return result.toString();
    }
}
