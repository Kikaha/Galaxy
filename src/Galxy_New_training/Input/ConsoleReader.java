package Galxy_New_training.Input;

import java.io.InputStream;
import java.util.Scanner;

public class ConsoleReader implements Input {
    private Scanner scanner;
    private String line;

    public ConsoleReader(InputStream stream){
        scanner = new Scanner(stream);
    }

    @Override
    public String readLine(){
        return this.scanner.nextLine();
    }

    @Override
    public String returnLine() {
        return this.line = readLine();
    }
}
