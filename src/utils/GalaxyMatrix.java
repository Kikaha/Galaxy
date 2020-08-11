package utils;

import java.util.List;

public class GalaxyMatrix {
    private int[][] matrix;
    private int row;
    private int col;

    public GalaxyMatrix(List<Integer> coordinates){
    this.row = coordinates.get(0);
    this.col = coordinates.get(1);
    matrix = new int[this.row][this.col];
    populate();
    }

    private void populate(){
        int counter = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = counter++;
            }
        }
    }

    public int[][] returnGalaxy(){
        return this.matrix;
    }
}
