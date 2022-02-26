package Exercises;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashSet<String> arr = new LinkedHashSet<>();

        for (int i = 0; i < n ; i++) {
            String input = scanner.nextLine();
            arr.add(input);
        }
        arr.forEach(System.out::println);
//        for (String s : arr) {
//            System.out.println(s);
//        }

    }
}
