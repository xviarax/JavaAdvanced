package GBoxofInt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        GenBoxOfInt<Integer> genBoxOfInt = new GenBoxOfInt();
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            genBoxOfInt.add(number);
        }
        System.out.println(genBoxOfInt);
    }
}
