class Solution {
    public long solution(String numbers) {
        StringBuilder sb = new StringBuilder();
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < numbers.length(); i++) {
            char ch = numbers.charAt(i);
            if(Character.isDigit(ch)) {
                result.append(ch);
            } else {
                sb.append(ch);
                if(sb.toString().equals("zero")) {
                    result.append("0");
                    sb.setLength(0);
                } else if(sb.toString().equals("one")) {
                    result.append("1");
                    sb.setLength(0);
                } else if(sb.toString().equals("two")) {
                    result.append("2");
                    sb.setLength(0);
                } else if(sb.toString().equals("three")) {
                    result.append("3");
                    sb.setLength(0);
                } else if(sb.toString().equals("four")) {
                    result.append("4");
                    sb.setLength(0);
                } else if(sb.toString().equals("five")) {
                    result.append("5");
                    sb.setLength(0);
                } else if(sb.toString().equals("six")) {
                    result.append("6");
                    sb.setLength(0);
                } else if(sb.toString().equals("seven")) {
                    result.append("7");
                    sb.setLength(0);
                } else if(sb.toString().equals("eight")) {
                    result.append("8");
                    sb.setLength(0);
                } else if(sb.toString().equals("nine")) {
                    result.append("9");
                    sb.setLength(0);
                }
            }
        }
        return Long.parseLong(result.toString());
    }
}