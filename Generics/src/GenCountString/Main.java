package GenCountString;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        //задача 5
        GenerCountString<String> box = new GenerCountString();
        for (int i = 0; i < n; i++) {
            String text = scanner.nextLine();
            box.add(text);
        }

        String element = scanner.nextLine(); //елемент, за който търся колко от елементите в списъка са по-големи
        System.out.println(box.countGreaterThan(element));

    }
}
