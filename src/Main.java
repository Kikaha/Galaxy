import Input.ConsoleReader;
import Players.Enemy;
import utils.GalaxyMatrix;
import utils.IntegerParser;

public class Main {
    public static void main(String[] args) {

        String regex = "\\s+";
        ConsoleReader consoleReader = new ConsoleReader(System.in);
        GalaxyMatrix galaxyMatrix = new GalaxyMatrix(IntegerParser.parseLine(consoleReader.returnLine(),regex));
        int[][] galaxy = galaxyMatrix.returnGalaxy();
        Engine engine = new Engine(consoleReader,galaxy);
        engine.run();
        System.out.println(engine.returnResult());

    }
}
