package Exercises;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        LinkedHashMap<String, Integer> mappie = new LinkedHashMap<>();

        while (!input.equals("stop")) {
            int num = Integer.parseInt(scanner.nextLine());
            if (mappie.containsKey(input)) {
                mappie.put(input, mappie.get(input) + num);
            } else {
                mappie.put(input, num);

            }
            input = scanner.nextLine();
        }

        mappie.forEach((key,value) ->
                        System.out.printf("%s -> %s%n", key, mappie.get(key))
                );
    }
}
