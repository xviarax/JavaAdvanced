package Exercises;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class KnightsofHonor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = scanner.nextLine().split(" ");

        Consumer<String> name = e -> System.out.println("Sir " + e);

        Arrays.stream(names).forEach(name);


    }
}
