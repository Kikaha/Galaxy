package Galxy_New_training.utils;

public class insideGalaxy {
    public static boolean isInside(int row, int col, int[][] matrix) {
        if (row >= 0 && row <= matrix.length && col >= 0 && col <= matrix[row].length) {
            return true;
        }
        return false;
    }
}
