package day1;
import utilities.Utils;

import java.io.IOException;
import java.util.List;


public class Puzzle {

    public Integer part1(List<String> input) {
        return 0;
    }

    public Integer part2(List<String> input) {
        return 0;
    }

    public static void main(String[] args) {
        Puzzle quiz = new Puzzle();

       List<String> input;
       try {
          input = Utils.readInput("day1.in");
       } catch (IOException e) {
          throw new RuntimeException(e);
       }

       System.out.println(quiz.part1(input));
        System.out.println(quiz.part2(input));
    }
}
