package Galxy_New_training;

import Galxy_New_training.Input.Input;
import Galxy_New_training.utils.IntegerParser;
import Galxy_New_training.utils.insideGalaxy;
import Players.Enemy;
import Players.Jedy;

import java.util.List;

public class Engine implements Runnable,Result{
    private Input input;
    private String delimiter;
    private int[][] matrix;
    private int result;

    public Engine(Input input, int[][] matrix, String delimiter){
        this.input = input;
        this.matrix = matrix;
        this.delimiter = delimiter;
    }

     public void EnemyMove(Enemy enemy){
        int row = enemy.getX();
        int col = enemy.getY();
        while(insideGalaxy.isInside(--row,--col,this.matrix)){
            matrix[row][col] = 0;

        }
     }

     public void JedyMove(Jedy jedy){
        int row = jedy.getX();
        int col = jedy.getY();
        while (insideGalaxy.isInside(--row,++col,this.matrix)){
            result+=matrix[row][col];

        }
     }

    @Override
    public int returnResult() {
        return result;
    }

    @Override
    public void run() {
        result = 0;
        List<Integer> jedyPosition = IntegerParser.readInts(input.returnLine(),delimiter);
        List<Integer> enemyPosition = IntegerParser.readInts(input.returnLine(),delimiter);
     this.EnemyMove(new Enemy(enemyPosition.get(0),enemyPosition.get(1)));
     this.JedyMove(new Jedy(jedyPosition.get(0),jedyPosition.get(1)));
    }
}
