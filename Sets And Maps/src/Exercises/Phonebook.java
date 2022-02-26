package Exercises;

import java.util.*;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        Map<String, String> sets = new HashMap<>();

        while (!text.equals("search")) {
            String[] input = text.split("-");
            String name = input[0];
            if (input.length < 2){
                break;
            }
            String phone = input[1];
            if (sets.containsKey(name)){
                sets.put(name, phone);
            } else {
            sets.put(name, phone);}

            text = scanner.nextLine();
        }
        text = scanner.nextLine();
        while (!text.equals("stop")) {

            if (sets.containsKey(text)) {
                System.out.printf("%s -> %s%n", text, sets.get(text));
            } else {
                System.out.printf("Contact %s does not exist.%n", text);
            }

            text = scanner.nextLine();

        }

    }
}
