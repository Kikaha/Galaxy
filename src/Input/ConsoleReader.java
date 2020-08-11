package Input;

import java.io.InputStream;
import java.util.Scanner;

public class ConsoleReader implements Input{
    private Scanner scanner;
    private String line;

    public ConsoleReader(InputStream stream){
        this.scanner = new Scanner(stream);
    }

    private String readLine(){
       return this.scanner.nextLine();
    }

    @Override
    public String returnLine() {
        this.line = readLine();
        return this.line;
    }
}
