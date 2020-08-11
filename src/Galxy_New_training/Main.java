package Galxy_New_training;

import Galxy_New_training.Input.ConsoleReader;
import Galxy_New_training.utils.IntegerParser;

public class Main {
    public static void main(String[] args) {

        String delimiter = "\\s+";
        ConsoleReader consoleReader = new ConsoleReader(System.in);
        GalaxyMatrix galaxyMatrix = new GalaxyMatrix(IntegerParser.readInts(consoleReader.returnLine(),delimiter));
        Engine engine = new Engine(consoleReader,galaxyMatrix.getMatrix(), delimiter);
        engine.run();
        System.out.println(engine.returnResult());

    }
}
