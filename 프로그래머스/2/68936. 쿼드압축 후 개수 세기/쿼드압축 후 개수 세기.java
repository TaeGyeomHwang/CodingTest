class Solution {
    public int[] solution(int[][] arr) {
        // This will store the count of 0s and 1s after compression
        int[] result = new int[2];
        compressHelper(arr, 0, 0, arr.length, result);
        return result;
    }
    
    // Helper function to perform the compression recursively
    private static void compressHelper(int[][] arr, int x, int y, int size, int[] result) {
        if (isUniform(arr, x, y, size)) {
            // If all elements are the same, increment the appropriate count
            if (arr[x][y] == 0) {
                result[0]++;
            } else {
                result[1]++;
            }
        } else {
            // Otherwise, split the current region into 4 smaller sub-regions
            int newSize = size / 2;
            compressHelper(arr, x, y, newSize, result); // Top-left
            compressHelper(arr, x, y + newSize, newSize, result); // Top-right
            compressHelper(arr, x + newSize, y, newSize, result); // Bottom-left
            compressHelper(arr, x + newSize, y + newSize, newSize, result); // Bottom-right
        }
    }
    
    // Helper function to check if all elements in a square sub-matrix are the same
    private static boolean isUniform(int[][] arr, int x, int y, int size) {
        int firstValue = arr[x][y];
        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (arr[i][j] != firstValue) {
                    return false;
                }
            }
        }
        return true;
    }
}