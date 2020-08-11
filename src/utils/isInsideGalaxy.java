package utils;

public class isInsideGalaxy {

    public static boolean Check(int row, int col, int[][] galaxy){
        return row >= 0 && galaxy.length > row && col >= 0 && galaxy[0].length > col;
    }

}
