package day1;
import utilities.Utils;

import java.io.IOException;
import java.util.List;


public class Puzzle {

    private Integer part1(List<String> input) {
        return 0;
    }

    private Integer part2(List<String> input) {
        return 0;
    }

    public Puzzle() {
    }

    public static void main(String[] args) {
        Puzzle quiz = new Puzzle();
        try {
            List<String> input = Utils.readInput("day1.in");
            input.forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
