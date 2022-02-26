package Exercises;

import java.util.*;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Set<String> sett = new TreeSet<>();

        for (int i = 0; i < n ; i++) {
            String[] input = scanner.nextLine().split(" ");
            sett.addAll(Arrays.asList(input));   // as List понеже аддОл иска да е колекция
        }

        for (String s : sett) {
            System.out.print(s + " ");
        }


    }
}
