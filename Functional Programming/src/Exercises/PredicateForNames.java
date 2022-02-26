package Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateForNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        String[] names = scanner.nextLine().split(" ");
        Predicate<String> checkLeng = word -> word.length() <= length;


        Arrays.stream(names).filter(checkLeng).forEach(System.out::println);


    }
}
