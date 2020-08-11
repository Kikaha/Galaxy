package utils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntegerParser {

    public static List<Integer> parseLine(String line, String regex){
      return Arrays.stream(line.split(regex)).mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());
    }
}
