package Galxy_New_training.utils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntegerParser {
   public static List<Integer> readInts(String line, String regex){
       return Arrays.stream(line.split(regex)).map(Integer::parseInt).collect(Collectors.toList());
   }
}
