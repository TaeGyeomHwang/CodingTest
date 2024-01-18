import java.util.ArrayList;

class Solution {
    public String[] solution(String myStr) {
        String[] result;
        
        ArrayList<String> list = new ArrayList<>();
        String str = "";
        
        for(int i=0; i<=myStr.length(); i++){
            if(i == myStr.length()){
                list.add(str);
                break;
            }
            if(myStr.charAt(i)!='a' && myStr.charAt(i)!='b' && myStr.charAt(i)!='c'){
                str += myStr.charAt(i);
            }else{
                list.add(str);
                str = "";
            }
        }
        result = list.stream().filter(item -> !item.equals("")).toArray(String[]::new);

        if(result.length==0){   //  result는 null이 아니지만 빈 배열일 수는 있다.
            result = new String[] {"EMPTY"};
            return result;
        }else{
            return result;
        }
    }
}