package Exercises;

import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        TreeMap<Character, Integer> symCount = new TreeMap<>();

        for (int index = 0; index < input.length(); index++) {
            char currSym = input.charAt(index);

            if (symCount.containsKey(currSym)) {
                int currentCount = symCount.get(currSym);
                symCount.put(currSym, currentCount + 1);
            } else {
                symCount.put(currSym, 1);
            }
        }


        symCount.entrySet().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue() + " time/s"));
    }
}