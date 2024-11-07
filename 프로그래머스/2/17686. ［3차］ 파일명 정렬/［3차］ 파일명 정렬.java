import java.util.*;

class Solution {
    public String[] solution(String[] files) {
        Arrays.sort(files, (file1, file2) -> {
            // Split file1 and file2 into HEAD, NUMBER, and TAIL
            String[] parts1 = splitFileName(file1);
            String[] parts2 = splitFileName(file2);

            // Compare HEAD parts (case insensitive)
            int headCompare = parts1[0].compareToIgnoreCase(parts2[0]);
            if (headCompare != 0) {
                return headCompare;
            }

            // Compare NUMBER parts as integers
            int number1 = Integer.parseInt(parts1[1]);
            int number2 = Integer.parseInt(parts2[1]);
            return Integer.compare(number1, number2);
        });

        return files;
    }
    
    // Helper method to split a file name into HEAD, NUMBER, and TAIL
    private String[] splitFileName(String file) {
        String head = "";
        String number = "";
        int index = 0;

        // Extract HEAD
        while (index < file.length() && !Character.isDigit(file.charAt(index))) {
            head += file.charAt(index);
            index++;
        }

        // Extract NUMBER (up to 5 digits)
        while (index < file.length() && Character.isDigit(file.charAt(index)) && number.length() < 5) {
            number += file.charAt(index);
            index++;
        }

        return new String[] { head, number };
    }
}