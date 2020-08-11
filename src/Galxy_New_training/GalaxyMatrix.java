package Galxy_New_training;

import java.util.List;

public class GalaxyMatrix {
    private Integer col;
    private Integer row;
    private int[][] matrix;


    public GalaxyMatrix(List<Integer> ints){
        setRowLength(ints.get(0));
        setColLength(ints.get(1));
        if (col !=null && row !=null){
            matrix = new int[row][col];
        }
        populateMatrix();
    }

    private void populateMatrix(){
        // matrix[i] = new int[]{1,2,3,4,5};
        int counter = 0;
        for (int i = 0; i < row; i++) {
            for (int k = 0; k < col; k++) {
                matrix[i][k] = counter;
                counter++;
            }
        }
    }

    public int[][] getMatrix() {
        return matrix;
    }

    private void setRowLength(Integer length) {
        if (length>0){
            this.row = length;
        }
    }

    private void setColLength(Integer length){
        if (length>0){
            this.col = length;
        }
    }

}
