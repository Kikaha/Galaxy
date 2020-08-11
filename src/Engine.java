import Input.Input;
import Players.Enemy;
import Players.Jedy;
import utils.IntegerParser;
import utils.isInsideGalaxy;

import java.util.List;

public class Engine implements Runnable, Result {
    private int result;
    private Input inputReader;
    private int[][] galaxy;

    public Engine(Input reader, int[][] galaxy) {
        this.inputReader = reader;
        this.galaxy = galaxy;
    }

    private void jedyMove(Jedy jedy) {
        int row = jedy.getX();
        int col = jedy.getY();
        while (isInsideGalaxy.Check(--row, ++col, galaxy)) {
            result += galaxy[row][col];
        }
    }

    private void enemyMove(Enemy enemy) {
        int row = enemy.getX();
        int col = enemy.getY();
        while (isInsideGalaxy.Check(--row, --col, galaxy)) {
            galaxy[row][col] = 0;
        }
    }

    @Override
    public void run() {
        result = 0;
        List<Integer> positionJedy = IntegerParser.parseLine(inputReader.returnLine(), " ");
        List<Integer> positionEnemy = IntegerParser.parseLine(inputReader.returnLine(), " ");
        enemyMove(new Enemy(positionEnemy.get(0), positionEnemy.get(1)));
        jedyMove(new Jedy(positionJedy.get(0), positionJedy.get(1)));
    }

    @Override
    public int returnResult() {
        return this.result;
    }

}
