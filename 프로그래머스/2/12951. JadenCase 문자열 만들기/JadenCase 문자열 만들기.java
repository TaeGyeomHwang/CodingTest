class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder(s);
        boolean capitalizeNext = true;
        
        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            if (Character.isAlphabetic(c)) {
                if (capitalizeNext) {
                    sb.setCharAt(i, Character.toUpperCase(c));
                    capitalizeNext = false;
                } else {
                    sb.setCharAt(i, Character.toLowerCase(c));
                }
            } else if (c == ' ') {
                capitalizeNext = true;
            } else {
                capitalizeNext = false;
            }
        }
        
        return sb.toString();
    }
}