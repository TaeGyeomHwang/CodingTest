import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        // Map to get the index corresponding to ext and sortBy
        Map<String, Integer> columnIndex = new HashMap<>();
        columnIndex.put("code", 0);
        columnIndex.put("date", 1);
        columnIndex.put("maximum", 2);
        columnIndex.put("remain", 3);

        // Extract the index to filter and sort by
        int filterIndex = columnIndex.get(ext);
        int sortIndex = columnIndex.get(sort_by);

        // Create a list to store filtered data
        List<int[]> filteredData = new ArrayList<>();

        // Filter the data
        for (int[] row : data) {
            if (row[filterIndex] < val_ext) {
                filteredData.add(row);
            }
        }

        // Sort the filtered data
        filteredData.sort(Comparator.comparingInt(row -> row[sortIndex]));

        // Convert the list back to a 2D array
        int[][] result = new int[filteredData.size()][];
        for (int i = 0; i < filteredData.size(); i++) {
            result[i] = filteredData.get(i);
        }

        return result;
    }
}